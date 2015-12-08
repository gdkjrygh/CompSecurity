// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;

import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Message;
import android.webkit.URLUtil;
import android.widget.RelativeLayout;
import com.admarvel.android.offline.AdmarvelOfflineUtils;
import com.admarvel.android.util.Logging;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

// Referenced classes of package com.admarvel.android.ads:
//            AdMarvelActivity, AdMarvelInternalWebView, Version, WebViewResumePause, 
//            Utils, AdMarvelAd, FullScreenControls, WebViewResumePausePreAPI11, 
//            AdMarvelInterstitialAds

class this._cls0 extends Handler
{

    final AdMarvelActivity this$0;

    public void handleMessage(Message message)
    {
        RelativeLayout relativelayout = (RelativeLayout)findViewById(AdMarvelActivity.LAYOUT_VIEW_ID);
        message = AdMarvelActivity.this;
        FullScreenControls fullscreencontrols;
        boolean flag;
        if (AdMarvelActivity.access$2(AdMarvelActivity.this))
        {
            flag = false;
        } else
        {
            flag = true;
        }
        message = new AdMarvelInternalWebView(message, flag, AdMarvelActivity.access$6(AdMarvelActivity.this), AdMarvelActivity.access$5(AdMarvelActivity.this), AdMarvelActivity.access$7(AdMarvelActivity.this), null, null, AdMarvelActivity.access$8(AdMarvelActivity.this));
        message.setVisibility(4);
        message.setTag((new StringBuilder(String.valueOf(AdMarvelActivity.access$5(AdMarvelActivity.this)))).append("WEBVIEW").toString());
        message.expandToFullScreenWithControls();
        if (Version.getAndroidSDKVersion() >= 11)
        {
            WebViewResumePause.onResume(message);
        } else
        {
            WebViewResumePausePreAPI11.onResume(message);
        }
        message.addJavascriptInterface(new nerInterstitialJS(message, AdMarvelActivity.this, AdMarvelActivity.access$8(AdMarvelActivity.this)), "ADMARVEL");
        message.addJavascriptInterface(new ightRollInnerInterstitialJS(message, AdMarvelActivity.this), "AndroidBridge");
        if (Utils.isPermissionGranted(getApplicationContext(), "android.permission.RECORD_AUDIO"))
        {
            try
            {
                if (AdMarvelActivity.access$8(AdMarvelActivity.this) != null)
                {
                    Class class1 = Class.forName("com.admarvel.android.admarvelspeechkitadapter.Speech");
                    Object obj1 = class1.newInstance();
                    class1.getDeclaredMethod("initSpeechMembers", new Class[] {
                        com/admarvel/android/ads/AdMarvelInternalWebView, java/lang/String, java/lang/String
                    }).invoke(obj1, new Object[] {
                        message, AdMarvelActivity.access$8(AdMarvelActivity.this).getBannerid(), AdMarvelActivity.access$8(AdMarvelActivity.this).getSiteId()
                    });
                    message.addJavascriptInterface(obj1, "ADMARVEL_SPEECH");
                }
            }
            catch (ClassNotFoundException classnotfoundexception)
            {
                Logging.log(classnotfoundexception.getMessage());
            }
            catch (InstantiationException instantiationexception)
            {
                Logging.log(instantiationexception.getMessage());
            }
            catch (IllegalAccessException illegalaccessexception)
            {
                Logging.log(illegalaccessexception.getMessage());
            }
            catch (NoSuchMethodException nosuchmethodexception)
            {
                Logging.log(nosuchmethodexception.getMessage());
            }
            catch (IllegalArgumentException illegalargumentexception)
            {
                Logging.log(illegalargumentexception.getMessage());
            }
            catch (InvocationTargetException invocationtargetexception)
            {
                Logging.log(invocationtargetexception.getMessage());
            }
            catch (NullPointerException nullpointerexception)
            {
                Logging.log(nullpointerexception.getMessage());
            }
        }
        relativelayout.addView(message);
        if (AdMarvelActivity.access$2(AdMarvelActivity.this) || AdMarvelActivity.access$9(AdMarvelActivity.this)) goto _L2; else goto _L1
_L1:
        fullscreencontrols = new FullScreenControls(AdMarvelActivity.this, getApplicationContext(), AdMarvelActivity.access$5(AdMarvelActivity.this));
        fullscreencontrols.setVisibility(4);
        fullscreencontrols.setTag((new StringBuilder(String.valueOf(AdMarvelActivity.access$5(AdMarvelActivity.this)))).append("CONTROLS").toString());
        relativelayout.addView(fullscreencontrols);
_L8:
        if (AdMarvelActivity.access$11(AdMarvelActivity.this) == null || AdMarvelActivity.access$11(AdMarvelActivity.this).length() <= 0) goto _L4; else goto _L3
_L3:
        message.loadUrl(AdMarvelActivity.access$11(AdMarvelActivity.this));
_L6:
        return;
_L2:
        if (!AdMarvelActivity.access$9(AdMarvelActivity.this))
        {
            AdMarvelInternalWebView.setListener(AdMarvelActivity.access$5(AdMarvelActivity.this), AdMarvelActivity.access$10(AdMarvelActivity.this));
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (!isTwoPartExpandable() || AdMarvelActivity.access$12(AdMarvelActivity.this) == null || AdMarvelActivity.access$12(AdMarvelActivity.this).length() <= 0)
        {
            break; /* Loop/switch isn't completed */
        }
        if (AdMarvelInterstitialAds.enableOfflineSDK)
        {
            if (URLUtil.isNetworkUrl(AdMarvelActivity.access$12(AdMarvelActivity.this)) && Utils.isNetworkAvailable(AdMarvelActivity.this))
            {
                message.loadUrl(AdMarvelActivity.access$12(AdMarvelActivity.this));
            }
            if (!URLUtil.isNetworkUrl(AdMarvelActivity.access$12(AdMarvelActivity.this)))
            {
                Object obj = getSharedPreferences("admarvel_preferences", 0);
                obj = (new StringBuilder(String.valueOf(((SharedPreferences) (obj)).getString("childDirectory", "NULL")))).append("/").append(((SharedPreferences) (obj)).getString("banner_folder", "NULL")).toString();
                if (obj != null)
                {
                    AdMarvelActivity.access$13(AdMarvelActivity.this, AdmarvelOfflineUtils.readData(((String) (obj)), AdMarvelActivity.access$12(AdMarvelActivity.this)));
                    Logging.log((new StringBuilder("Offline SDK:Admarvel XML Response:")).append(AdMarvelActivity.access$6(AdMarvelActivity.this)).toString());
                }
                message.loadDataWithBaseURL((new StringBuilder(String.valueOf(AdMarvelActivity.access$8(AdMarvelActivity.this).getOfflineBaseUrl()))).append("/").toString(), AdMarvelActivity.access$14(AdMarvelActivity.this), "text/html", "utf-8", null);
            }
        } else
        {
            message.loadUrl(AdMarvelActivity.access$12(AdMarvelActivity.this));
        }
        if (!AdMarvelActivity.access$15(AdMarvelActivity.this))
        {
            message.disableCloseButton(AdMarvelActivity.access$16(AdMarvelActivity.this));
        }
        if (AdMarvelActivity.access$17(AdMarvelActivity.this) != null && AdMarvelActivity.access$17(AdMarvelActivity.this).length() > 0)
        {
            disableActivityOrientation(AdMarvelActivity.access$17(AdMarvelActivity.this));
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
        message.setBackgroundColor(AdMarvelActivity.access$18(AdMarvelActivity.this));
        String s = (new StringBuilder("content://")).append(getPackageName()).append(".AdMarvelLocalFileContentProvider").toString();
        if (AdMarvelInterstitialAds.enableOfflineSDK)
        {
            message.loadDataWithBaseURL((new StringBuilder(String.valueOf(AdMarvelActivity.access$8(AdMarvelActivity.this).getOfflineBaseUrl()))).append("/").toString(), AdMarvelActivity.access$14(AdMarvelActivity.this), "text/html", "utf-8", null);
            return;
        }
        if (Version.getAndroidSDKVersion() < 11)
        {
            message.loadDataWithBaseURL(s, AdMarvelActivity.access$14(AdMarvelActivity.this), "text/html", "utf-8", null);
            return;
        }
        message.loadDataWithBaseURL("http://baseurl.admarvel.com", AdMarvelActivity.access$14(AdMarvelActivity.this), "text/html", "utf-8", null);
        return;
        if (true) goto _L8; else goto _L7
_L7:
    }

    Utils()
    {
        this$0 = AdMarvelActivity.this;
        super();
    }
}
