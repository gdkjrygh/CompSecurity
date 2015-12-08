// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.EnterpriseMobileBanking.Utils;

import android.os.Handler;
import android.os.Message;
import android.webkit.WebView;
import com.EnterpriseMobileBanking.Plugins.WebViewLinker;

// Referenced classes of package com.EnterpriseMobileBanking.Utils:
//            Log

public class WebViewHelper
{

    private static final int MSG_TIMEOUT = 1;
    public static final String PRODUCTS360_MODE_TAG = "products_360";
    public static final String QUIET_MODE_TAG = "quiet";
    public static final String REWARDS_MODE_TAG = "rewards";
    public static final int REWARDS_TIMEOUT = 65000;
    private static final String TAG = "WebViewHelper";
    private WebViewLinker _appLink;
    private boolean _started;
    private Handler handler;
    private String mMode;
    private int mTimeOutValue;
    private WebView mView;
    private boolean timeoutFlag;

    public WebViewHelper(WebViewLinker webviewlinker)
    {
        _appLink = webviewlinker;
        _started = false;
        mTimeOutValue = 0;
        mMode = "";
        timeoutFlag = false;
        handler = new Handler() {

            final WebViewHelper this$0;

            public void handleMessage(Message message)
            {
                switch (message.what)
                {
                default:
                    return;

                case 1: // '\001'
                    Log.d("WebViewHelper", "Timeout called...");
                    break;
                }
                synchronized ((WebViewHelper)message.obj)
                {
                    if (!((WebViewHelper) (message)).timeoutFlag)
                    {
                        message.timeoutFlag = true;
                        ((WebViewHelper) (message)).mView.stopLoading();
                        message.handleError();
                    }
                }
                return;
                exception;
                message;
                JVM INSTR monitorexit ;
                throw exception;
            }

            
            {
                this$0 = WebViewHelper.this;
                super();
            }
        };
    }

    public void cancelTimer()
    {
        Log.d("WebViewHelper", "*** Timer cancelled...");
        handler.removeMessages(1);
    }

    public String getMode()
    {
        return mMode;
    }

    public int getTimeOutValue()
    {
        return mTimeOutValue;
    }

    public void handleError()
    {
        Log.d("WebViewHelper", "handleError()");
        _appLink.sendJavascript("PAGE.showError(Messages.ERR_GENERIC_SERVICE_UNAVAILABLE); jq(\"#hang-on\").hide();");
    }

    public boolean isTimeout()
    {
        return timeoutFlag;
    }

    public void setMode(String s)
    {
        mMode = s;
    }

    public void setTimeOutValue(int i)
    {
        mTimeOutValue = i;
    }

    public void setTimedOut(boolean flag)
    {
        timeoutFlag = flag;
    }

    public void setView(WebView webview)
    {
        mView = webview;
    }

    public void startTimer()
    {
        if (!_started)
        {
            Log.d("WebViewHelper", "*** Timer started...");
            _started = true;
            handler.sendMessageDelayed(handler.obtainMessage(1, this), mTimeOutValue);
        }
    }



/*
    static boolean access$002(WebViewHelper webviewhelper, boolean flag)
    {
        webviewhelper.timeoutFlag = flag;
        return flag;
    }

*/

}
