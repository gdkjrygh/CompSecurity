// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.content.browser.accessibility;

import android.content.Context;
import android.os.Bundle;
import android.os.Vibrator;
import android.speech.tts.TextToSpeech;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.googlecode.eyesfree.braille.selfbraille.SelfBrailleClient;
import com.googlecode.eyesfree.braille.selfbraille.WriteData;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.apache.http.NameValuePair;
import org.apache.http.client.utils.URLEncodedUtils;
import org.chromium.base.CommandLine;
import org.chromium.content.browser.ContentSettings;
import org.chromium.content.browser.ContentViewCore;
import org.chromium.content.browser.WebContentsObserverAndroid;
import org.chromium.content_public.browser.WebContents;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package org.chromium.content.browser.accessibility:
//            JellyBeanAccessibilityInjector

public class AccessibilityInjector extends WebContentsObserverAndroid
{
    private static class TextToSpeechWrapper
    {

        private final SelfBrailleClient mSelfBrailleClient;
        private final TextToSpeech mTextToSpeech;
        private final View mView;

        public void braille(String s)
        {
            try
            {
                s = new JSONObject(s);
                WriteData writedata = WriteData.forView(mView);
                writedata.setText(s.getString("text"));
                writedata.setSelectionStart(s.getInt("startIndex"));
                writedata.setSelectionEnd(s.getInt("endIndex"));
                mSelfBrailleClient.write(writedata);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                Log.w("AccessibilityInjector", "Error parsing JS JSON object", s);
            }
        }

        public boolean isSpeaking()
        {
            return mTextToSpeech.isSpeaking();
        }

        protected void shutdownInternal()
        {
            mTextToSpeech.shutdown();
            mSelfBrailleClient.shutdown();
        }

        public int speak(String s, int i, String s1)
        {
            HashMap hashmap = null;
            if (s1 == null) goto _L2; else goto _L1
_L1:
            hashmap = new HashMap();
            s1 = new JSONObject(s1);
            Iterator iterator = s1.keys();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                String s2 = (String)iterator.next();
                if (s1.optJSONObject(s2) == null && s1.optJSONArray(s2) == null)
                {
                    hashmap.put(s2, s1.getString(s2));
                }
            } while (true);
              goto _L2
            s1;
_L4:
            hashmap = null;
_L2:
            return mTextToSpeech.speak(s, i, hashmap);
            s1;
            if (true) goto _L4; else goto _L3
_L3:
        }

        public int stop()
        {
            return mTextToSpeech.stop();
        }

        public TextToSpeechWrapper(View view, Context context)
        {
            mView = view;
            mTextToSpeech = new TextToSpeech(context, null, null);
            mSelfBrailleClient = new SelfBrailleClient(context, CommandLine.getInstance().hasSwitch("debug-braille-service"));
        }
    }

    private static class VibratorWrapper
    {

        private static final long MAX_VIBRATE_DURATION_MS = 5000L;
        private final Vibrator mVibrator;

        public void cancel()
        {
            mVibrator.cancel();
        }

        public boolean hasVibrator()
        {
            return mVibrator.hasVibrator();
        }

        public void vibrate(long l)
        {
            l = Math.min(l, 5000L);
            mVibrator.vibrate(l);
        }

        public void vibrate(long al[], int i)
        {
            for (i = 0; i < al.length; i++)
            {
                al[i] = Math.min(al[i], 5000L);
            }

            mVibrator.vibrate(al, -1);
        }

        public VibratorWrapper(Context context)
        {
            mVibrator = (Vibrator)context.getSystemService("vibrator");
        }
    }


    private static final String ACCESSIBILITY_SCREEN_READER_JAVASCRIPT_TEMPLATE = "(function() {    var chooser = document.createElement('script');    chooser.type = 'text/javascript';    chooser.src = '%1s';    document.getElementsByTagName('head')[0].appendChild(chooser);  })();";
    private static final int ACCESSIBILITY_SCRIPT_INJECTION_OPTED_OUT = 0;
    private static final int ACCESSIBILITY_SCRIPT_INJECTION_PROVIDED = 1;
    private static final int ACCESSIBILITY_SCRIPT_INJECTION_UNDEFINED = -1;
    private static final String ALIAS_ACCESSIBILITY_JS_INTERFACE = "accessibility";
    private static final String ALIAS_ACCESSIBILITY_JS_INTERFACE_2 = "accessibility2";
    private static final String DEFAULT_ACCESSIBILITY_SCREEN_READER_URL = "https://ssl.gstatic.com/accessibility/javascript/android/chromeandroidvox.js";
    private static final int FEEDBACK_BRAILLE = 32;
    private static final String TAG = "AccessibilityInjector";
    private static final String TOGGLE_CHROME_VOX_JAVASCRIPT = "(function() {    if (typeof cvox !== 'undefined') {        cvox.ChromeVox.host.activateOrDeactivateChromeVox(%1s);    }  })();";
    private AccessibilityManager mAccessibilityManager;
    private final String mAccessibilityScreenReaderUrl = CommandLine.getInstance().getSwitchValue("accessibility-js-url", "https://ssl.gstatic.com/accessibility/javascript/android/chromeandroidvox.js");
    protected ContentViewCore mContentViewCore;
    private final boolean mHasVibratePermission;
    protected boolean mInjectedScriptEnabled;
    protected boolean mScriptInjected;
    private TextToSpeechWrapper mTextToSpeech;
    private VibratorWrapper mVibrator;

    protected AccessibilityInjector(ContentViewCore contentviewcore)
    {
        super(contentviewcore.getWebContents());
        mContentViewCore = contentviewcore;
        boolean flag;
        if (mContentViewCore.getContext().checkCallingOrSelfPermission("android.permission.VIBRATE") == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        mHasVibratePermission = flag;
    }

    private AccessibilityManager getAccessibilityManager()
    {
        if (mAccessibilityManager == null)
        {
            mAccessibilityManager = (AccessibilityManager)mContentViewCore.getContext().getSystemService("accessibility");
        }
        return mAccessibilityManager;
    }

    private int getAxsUrlParameterValue()
    {
        if (mContentViewCore.getWebContents().getUrl() != null) goto _L2; else goto _L1
_L1:
        return -1;
_L2:
        Iterator iterator = URLEncodedUtils.parse(new URI(mContentViewCore.getWebContents().getUrl()), null).iterator();
_L5:
        if (!iterator.hasNext()) goto _L1; else goto _L3
_L3:
        NameValuePair namevaluepair = (NameValuePair)iterator.next();
        if (!"axs".equals(namevaluepair.getName())) goto _L5; else goto _L4
_L4:
        int i = Integer.parseInt(namevaluepair.getValue());
        return i;
        Object obj;
        obj;
        return -1;
        obj;
        return -1;
        obj;
        return -1;
    }

    private String getScreenReaderInjectingJs()
    {
        return String.format("(function() {    var chooser = document.createElement('script');    chooser.type = 'text/javascript';    chooser.src = '%1s';    document.getElementsByTagName('head')[0].appendChild(chooser);  })();", new Object[] {
            mAccessibilityScreenReaderUrl
        });
    }

    public static AccessibilityInjector newInstance(ContentViewCore contentviewcore)
    {
        if (android.os.Build.VERSION.SDK_INT < 16)
        {
            return new AccessibilityInjector(contentviewcore);
        } else
        {
            return new JellyBeanAccessibilityInjector(contentviewcore);
        }
    }

    public boolean accessibilityIsAvailable()
    {
        if (getAccessibilityManager().isEnabled() && mContentViewCore.getContentSettings() != null && mContentViewCore.getContentSettings().getJavaScriptEnabled())
        {
            int i;
            try
            {
                i = getAccessibilityManager().getEnabledAccessibilityServiceList(33).size();
            }
            catch (NullPointerException nullpointerexception)
            {
                return false;
            }
            if (i > 0)
            {
                return true;
            }
        }
        return false;
    }

    protected void addAccessibilityApis()
    {
        Context context = mContentViewCore.getContext();
        if (context != null)
        {
            if (mTextToSpeech == null)
            {
                mTextToSpeech = new TextToSpeechWrapper(mContentViewCore.getContainerView(), context);
                mContentViewCore.addJavascriptInterface(mTextToSpeech, "accessibility");
            }
            if (mVibrator == null && mHasVibratePermission)
            {
                mVibrator = new VibratorWrapper(context);
                mContentViewCore.addJavascriptInterface(mVibrator, "accessibility2");
            }
        }
    }

    public void addOrRemoveAccessibilityApisIfNecessary()
    {
        if (accessibilityIsAvailable())
        {
            addAccessibilityApis();
            return;
        } else
        {
            removeAccessibilityApis();
            return;
        }
    }

    public void didStartLoading(String s)
    {
        mScriptInjected = false;
    }

    public void didStopLoading(String s)
    {
        injectAccessibilityScriptIntoPage();
    }

    public void injectAccessibilityScriptIntoPage()
    {
        if (accessibilityIsAvailable() && getAxsUrlParameterValue() == -1)
        {
            String s = getScreenReaderInjectingJs();
            if (mContentViewCore.isDeviceAccessibilityScriptInjectionEnabled() && s != null && mContentViewCore.isAlive())
            {
                addOrRemoveAccessibilityApisIfNecessary();
                mContentViewCore.evaluateJavaScript(s, null);
                mInjectedScriptEnabled = true;
                mScriptInjected = true;
                return;
            }
        }
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilitynodeinfo)
    {
    }

    public void onPageLostFocus()
    {
        if (mContentViewCore.isAlive())
        {
            if (mTextToSpeech != null)
            {
                mTextToSpeech.stop();
            }
            if (mVibrator != null)
            {
                mVibrator.cancel();
            }
        }
    }

    public boolean performAccessibilityAction(int i, Bundle bundle)
    {
        return false;
    }

    protected void removeAccessibilityApis()
    {
        if (mTextToSpeech != null)
        {
            mContentViewCore.removeJavascriptInterface("accessibility");
            mTextToSpeech.stop();
            mTextToSpeech.shutdownInternal();
            mTextToSpeech = null;
        }
        if (mVibrator != null)
        {
            mContentViewCore.removeJavascriptInterface("accessibility2");
            mVibrator.cancel();
            mVibrator = null;
        }
    }

    public void setScriptEnabled(boolean flag)
    {
        if (flag && !mScriptInjected)
        {
            injectAccessibilityScriptIntoPage();
        }
        if (accessibilityIsAvailable() && mInjectedScriptEnabled != flag)
        {
            mInjectedScriptEnabled = flag;
            if (mContentViewCore.isAlive())
            {
                String s = String.format("(function() {    if (typeof cvox !== 'undefined') {        cvox.ChromeVox.host.activateOrDeactivateChromeVox(%1s);    }  })();", new Object[] {
                    Boolean.toString(mInjectedScriptEnabled)
                });
                mContentViewCore.evaluateJavaScript(s, null);
                if (!mInjectedScriptEnabled)
                {
                    onPageLostFocus();
                    return;
                }
            }
        }
    }

    public boolean supportsAccessibilityAction(int i)
    {
        return false;
    }
}
