// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.EnterpriseMobileBanking.Utils;

import android.os.Handler;
import android.os.Message;
import android.webkit.WebView;

// Referenced classes of package com.EnterpriseMobileBanking.Utils:
//            WebViewHelper, Log

class this._cls0 extends Handler
{

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
            if (!WebViewHelper.access$000(message))
            {
                WebViewHelper.access$002(message, true);
                WebViewHelper.access$100(message).stopLoading();
                message.handleError();
            }
        }
        return;
        exception;
        message;
        JVM INSTR monitorexit ;
        throw exception;
    }

    ()
    {
        this$0 = WebViewHelper.this;
        super();
    }
}
