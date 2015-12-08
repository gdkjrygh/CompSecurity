// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xwalk.core.internal.extension.api.presentation;

import android.app.Activity;
import android.content.Context;
import android.util.JsonReader;
import android.util.JsonWriter;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.lang.ref.WeakReference;
import java.net.URI;
import java.net.URISyntaxException;
import org.chromium.base.ThreadUtils;
import org.xwalk.core.internal.extension.XWalkExtensionWithActivityStateListener;
import org.xwalk.core.internal.extension.api.XWalkDisplayManager;

// Referenced classes of package org.xwalk.core.internal.extension.api.presentation:
//            XWalkPresentationContent, PresentationView

public class PresentationExtension extends XWalkExtensionWithActivityStateListener
{

    private static final String CMD_DISPLAY_AVAILABLE_CHANGE = "DisplayAvailableChange";
    private static final String CMD_QUERY_DISPLAY_AVAILABILITY = "QueryDisplayAvailability";
    private static final String CMD_REQUEST_SHOW = "RequestShow";
    private static final String CMD_SHOW_FAILED = "ShowFailed";
    private static final String CMD_SHOW_SUCCEEDED = "ShowSucceeded";
    private static final String ERROR_INVALID_ACCESS = "InvalidAccessError";
    private static final String ERROR_INVALID_PARAMETER = "InvalidParameterError";
    private static final String ERROR_INVALID_STATE = "InvalidStateError";
    private static final String ERROR_NOT_FOUND = "NotFoundError";
    private static final String ERROR_NOT_SUPPORTED = "NotSupportedError";
    public static final String JS_API_PATH = "jsapi/presentation_api.js";
    private static final String NAME = "navigator.presentation";
    private static final String TAG = "PresentationExtension";
    private static final String TAG_BASE_URL = "baseUrl";
    private static final String TAG_CMD = "cmd";
    private static final String TAG_DATA = "data";
    private static final String TAG_REQUEST_ID = "requestId";
    private static final String TAG_URL = "url";
    private WeakReference mActivity;
    private int mAvailableDisplayCount;
    private Context mContext;
    private final org.xwalk.core.internal.extension.api.XWalkDisplayManager.DisplayListener mDisplayListener = new org.xwalk.core.internal.extension.api.XWalkDisplayManager.DisplayListener() ;
    private XWalkDisplayManager mDisplayManager;
    private XWalkPresentationContent mPresentationContent;
    private XWalkPresentationContent.PresentationDelegate mPresentationDelegate;
    private PresentationView mPresentationView;

    public PresentationExtension(String s, Activity activity)
    {
        super("navigator.presentation", s, activity);
        mAvailableDisplayCount = 0;
        mContext = activity.getApplicationContext();
        mActivity = new WeakReference(activity);
        mDisplayManager = XWalkDisplayManager.getInstance(activity.getApplicationContext());
        mAvailableDisplayCount = mDisplayManager.getPresentationDisplays().length;
    }

    private void closePresentationContent()
    {
        if (mPresentationContent == null)
        {
            return;
        } else
        {
            mPresentationContent.close();
            mPresentationContent = null;
            return;
        }
    }

    private void dismissPresentationView()
    {
        if (mPresentationView == null)
        {
            return;
        } else
        {
            mPresentationView.dismiss();
            mPresentationView = null;
            return;
        }
    }

    private Display getPreferredDisplay()
    {
        Display adisplay[] = mDisplayManager.getPresentationDisplays();
        if (adisplay.length > 0)
        {
            return adisplay[0];
        } else
        {
            return null;
        }
    }

    private void handleRequestShow(final int instanceId, final int requestId, final String url, final String baseUrl)
    {
        if (android.os.Build.VERSION.SDK_INT < 17)
        {
            notifyRequestShowFail(instanceId, requestId, "NotSupportedError");
            return;
        }
        if (mAvailableDisplayCount == 0)
        {
            Log.d("PresentationExtension", "No available presentation display is found.");
            notifyRequestShowFail(instanceId, requestId, "NotFoundError");
            return;
        } else
        {
            ThreadUtils.runOnUiThread(new Runnable() {

                final PresentationExtension this$0;
                final String val$baseUrl;
                final int val$instanceId;
                final int val$requestId;
                final String val$url;

                public void run()
                {
                    String s;
                    Display display;
                    display = getPreferredDisplay();
                    if (display == null)
                    {
                        notifyRequestShowFail(instanceId, requestId, "NotFoundError");
                        return;
                    }
                    if (mPresentationContent != null)
                    {
                        notifyRequestShowFail(instanceId, requestId, "InvalidAccessError");
                        return;
                    }
                    s = url;
                    URI uri = new URI(url);
                    if (!uri.isAbsolute())
                    {
                        s = (new URI(baseUrl)).resolve(uri).toString();
                    }
                    mPresentationContent = new XWalkPresentationContent(mContext, mActivity, new XWalkPresentationContent.PresentationDelegate() {

                        final _cls2 this$1;

                        public void onContentClosed(XWalkPresentationContent xwalkpresentationcontent)
                        {
                            if (xwalkpresentationcontent == mPresentationContent)
                            {
                                closePresentationContent();
                                if (mPresentationView != null)
                                {
                                    mPresentationView.cancel();
                                }
                            }
                        }

                        public void onContentLoaded(XWalkPresentationContent xwalkpresentationcontent)
                        {
                            notifyRequestShowSucceed(instanceId, requestId, xwalkpresentationcontent.getPresentationId());
                        }

            
            {
                this$1 = _cls2.this;
                super();
            }
                    });
                    mPresentationContent.load(s);
                    updatePresentationView(display);
                    return;
                    URISyntaxException urisyntaxexception;
                    urisyntaxexception;
_L2:
                    Log.e("PresentationExtension", "Invalid url passed to requestShow");
                    notifyRequestShowFail(instanceId, requestId, "InvalidParameterError");
                    return;
                    urisyntaxexception;
                    if (true) goto _L2; else goto _L1
_L1:
                }

            
            {
                this$0 = PresentationExtension.this;
                instanceId = i;
                requestId = j;
                url = s;
                baseUrl = s1;
                super();
            }
            });
            return;
        }
    }

    private void notifyAvailabilityChanged(boolean flag)
    {
        StringWriter stringwriter = new StringWriter();
        JsonWriter jsonwriter = new JsonWriter(stringwriter);
        try
        {
            jsonwriter.beginObject();
            jsonwriter.name("cmd").value("DisplayAvailableChange");
            jsonwriter.name("data").value(flag);
            jsonwriter.endObject();
            jsonwriter.close();
            broadcastMessage(stringwriter.toString());
            return;
        }
        catch (IOException ioexception)
        {
            Log.e("PresentationExtension", (new StringBuilder()).append("Error: ").append(ioexception.toString()).toString());
        }
    }

    private void notifyRequestShowFail(int i, int j, String s)
    {
        StringWriter stringwriter = new StringWriter();
        JsonWriter jsonwriter = new JsonWriter(stringwriter);
        try
        {
            jsonwriter.beginObject();
            jsonwriter.name("cmd").value("ShowFailed");
            jsonwriter.name("requestId").value(j);
            jsonwriter.name("data").value(s);
            jsonwriter.endObject();
            jsonwriter.close();
            postMessage(i, stringwriter.toString());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e("PresentationExtension", (new StringBuilder()).append("Error: ").append(s.toString()).toString());
        }
    }

    private void notifyRequestShowSucceed(int i, int j, int k)
    {
        StringWriter stringwriter = new StringWriter();
        JsonWriter jsonwriter = new JsonWriter(stringwriter);
        try
        {
            jsonwriter.beginObject();
            jsonwriter.name("cmd").value("ShowSucceeded");
            jsonwriter.name("requestId").value(j);
            jsonwriter.name("data").value(k);
            jsonwriter.endObject();
            jsonwriter.close();
            postMessage(i, stringwriter.toString());
            return;
        }
        catch (IOException ioexception)
        {
            Log.e("PresentationExtension", (new StringBuilder()).append("Error: ").append(ioexception.toString()).toString());
        }
    }

    private void updatePresentationView(Display display)
    {
        Activity activity;
        for (activity = (Activity)mActivity.get(); activity == null || android.os.Build.VERSION.SDK_INT < 17 || display == null || mPresentationView == null && mPresentationContent == null;)
        {
            return;
        }

        if (mPresentationView != null && mPresentationView.getDisplay() != display)
        {
            dismissPresentationView();
        }
        if (mPresentationView == null && mPresentationContent != null)
        {
            ViewGroup viewgroup = (ViewGroup)mPresentationContent.getContentView().getParent();
            if (viewgroup != null)
            {
                viewgroup.removeView(mPresentationContent.getContentView());
            }
            mPresentationView = PresentationView.createInstance(activity, display);
            mPresentationView.setContentView(mPresentationContent.getContentView());
            mPresentationView.setPresentationListener(new PresentationView.PresentationListener() {

                final PresentationExtension this$0;

                public void onDismiss(PresentationView presentationview)
                {
                    if (presentationview == mPresentationView)
                    {
                        if (mPresentationContent != null)
                        {
                            mPresentationContent.onPause();
                        }
                        mPresentationView = null;
                    }
                }

                public void onShow(PresentationView presentationview)
                {
                    if (presentationview == mPresentationView && mPresentationContent != null)
                    {
                        mPresentationContent.onResume();
                    }
                }

            
            {
                this$0 = PresentationExtension.this;
                super();
            }
            });
        }
        mPresentationView.show();
    }

    public void onActivityStateChange(Activity activity, int i)
    {
        switch (i)
        {
        case 5: // '\005'
        default:
            return;

        case 3: // '\003'
            onResume();
            return;

        case 4: // '\004'
            dismissPresentationView();
            if (mPresentationContent != null)
            {
                mPresentationContent.onPause();
            }
            mDisplayManager.unregisterDisplayListener(mDisplayListener);
            return;

        case 6: // '\006'
            closePresentationContent();
            return;
        }
    }

    public void onMessage(int i, String s)
    {
        String s1;
        String s2;
        JsonReader jsonreader;
        int j;
        jsonreader = new JsonReader(new StringReader(s));
        j = -1;
        s1 = null;
        s = null;
        s2 = null;
        jsonreader.beginObject();
_L5:
        if (!jsonreader.hasNext()) goto _L2; else goto _L1
_L1:
        String s3 = jsonreader.nextName();
        if (!s3.equals("cmd")) goto _L4; else goto _L3
_L3:
        s1 = jsonreader.nextString();
          goto _L5
_L4:
label0:
        {
            if (!s3.equals("requestId"))
            {
                break label0;
            }
            j = jsonreader.nextInt();
        }
          goto _L5
label1:
        {
            if (!s3.equals("url"))
            {
                break label1;
            }
            s = jsonreader.nextString();
        }
          goto _L5
label2:
        {
            if (!s3.equals("baseUrl"))
            {
                break label2;
            }
            s2 = jsonreader.nextString();
        }
          goto _L5
        jsonreader.skipValue();
          goto _L5
        s;
        Log.d("PresentationExtension", (new StringBuilder()).append("Error: ").append(s).toString());
_L7:
        return;
_L2:
        jsonreader.endObject();
        jsonreader.close();
        if (s1 == null) goto _L7; else goto _L6
_L6:
        if (!s1.equals("RequestShow") || j < 0) goto _L7; else goto _L8
_L8:
        handleRequestShow(i, j, s, s2);
        return;
    }

    public void onResume()
    {
        Display adisplay[] = mDisplayManager.getPresentationDisplays();
        if (adisplay.length == 0 && mAvailableDisplayCount > 0)
        {
            notifyAvailabilityChanged(false);
            mAvailableDisplayCount = 0;
            closePresentationContent();
        }
        if (adisplay.length > 0 && mAvailableDisplayCount == 0)
        {
            notifyAvailabilityChanged(true);
            mAvailableDisplayCount = adisplay.length;
        }
        if (adisplay.length > 0 && mAvailableDisplayCount > 0)
        {
            mAvailableDisplayCount = adisplay.length;
        }
        if (mPresentationContent != null)
        {
            mPresentationContent.onResume();
        }
        updatePresentationView(getPreferredDisplay());
        mDisplayManager.registerDisplayListener(mDisplayListener);
    }

    public String onSyncMessage(int i, String s)
    {
        if (s.equals("QueryDisplayAvailability"))
        {
            if (mAvailableDisplayCount != 0)
            {
                return "true";
            } else
            {
                return "false";
            }
        } else
        {
            Log.e("PresentationExtension", (new StringBuilder()).append("Unexpected sync message received: ").append(s).toString());
            return "";
        }
    }



/*
    static int access$004(PresentationExtension presentationextension)
    {
        int i = presentationextension.mAvailableDisplayCount + 1;
        presentationextension.mAvailableDisplayCount = i;
        return i;
    }

*/


/*
    static int access$006(PresentationExtension presentationextension)
    {
        int i = presentationextension.mAvailableDisplayCount - 1;
        presentationextension.mAvailableDisplayCount = i;
        return i;
    }

*/








/*
    static XWalkPresentationContent access$502(PresentationExtension presentationextension, XWalkPresentationContent xwalkpresentationcontent)
    {
        presentationextension.mPresentationContent = xwalkpresentationcontent;
        return xwalkpresentationcontent;
    }

*/






/*
    static PresentationView access$902(PresentationExtension presentationextension, PresentationView presentationview)
    {
        presentationextension.mPresentationView = presentationview;
        return presentationview;
    }

*/
}
