// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xwalk.core.internal;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.net.http.SslError;
import android.webkit.ValueCallback;
import android.webkit.WebResourceResponse;

// Referenced classes of package org.xwalk.core.internal:
//            XWalkViewInternal

public class XWalkResourceClientInternal
{

    public static final int ERROR_AUTHENTICATION = -4;
    public static final int ERROR_BAD_URL = -12;
    public static final int ERROR_CONNECT = -6;
    public static final int ERROR_FAILED_SSL_HANDSHAKE = -11;
    public static final int ERROR_FILE = -13;
    public static final int ERROR_FILE_NOT_FOUND = -14;
    public static final int ERROR_HOST_LOOKUP = -2;
    public static final int ERROR_IO = -7;
    public static final int ERROR_OK = 0;
    public static final int ERROR_PROXY_AUTHENTICATION = -5;
    public static final int ERROR_REDIRECT_LOOP = -9;
    public static final int ERROR_TIMEOUT = -8;
    public static final int ERROR_TOO_MANY_REQUESTS = -15;
    public static final int ERROR_UNKNOWN = -1;
    public static final int ERROR_UNSUPPORTED_AUTH_SCHEME = -3;
    public static final int ERROR_UNSUPPORTED_SCHEME = -10;

    public XWalkResourceClientInternal(XWalkViewInternal xwalkviewinternal)
    {
    }

    public void onLoadFinished(XWalkViewInternal xwalkviewinternal, String s)
    {
    }

    public void onLoadStarted(XWalkViewInternal xwalkviewinternal, String s)
    {
    }

    public void onProgressChanged(XWalkViewInternal xwalkviewinternal, int i)
    {
    }

    public void onReceivedLoadError(XWalkViewInternal xwalkviewinternal, int i, String s, String s1)
    {
        xwalkviewinternal = new android.app.AlertDialog.Builder(xwalkviewinternal.getContext());
        xwalkviewinternal.setTitle(0x1040014).setMessage(s).setCancelable(false).setPositiveButton(0x104000a, new android.content.DialogInterface.OnClickListener() {

            final XWalkResourceClientInternal this$0;

            public void onClick(DialogInterface dialoginterface, int j)
            {
                dialoginterface.dismiss();
            }

            
            {
                this$0 = XWalkResourceClientInternal.this;
                super();
            }
        });
        xwalkviewinternal.create().show();
    }

    public void onReceivedSslError(XWalkViewInternal xwalkviewinternal, final ValueCallback valueCallback, SslError sslerror)
    {
        xwalkviewinternal = new android.app.AlertDialog.Builder(xwalkviewinternal.getContext());
        xwalkviewinternal.setTitle(R.string.ssl_alert_title).setPositiveButton(0x104000a, new android.content.DialogInterface.OnClickListener() {

            final XWalkResourceClientInternal this$0;
            final ValueCallback val$valueCallback;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                valueCallback.onReceiveValue(Boolean.valueOf(true));
                dialoginterface.dismiss();
            }

            
            {
                this$0 = XWalkResourceClientInternal.this;
                valueCallback = valuecallback;
                super();
            }
        }).setNegativeButton(0x1040000, new android.content.DialogInterface.OnClickListener() {

            final XWalkResourceClientInternal this$0;
            final ValueCallback val$valueCallback;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                valueCallback.onReceiveValue(Boolean.valueOf(false));
                dialoginterface.dismiss();
            }

            
            {
                this$0 = XWalkResourceClientInternal.this;
                valueCallback = valuecallback;
                super();
            }
        }).setOnCancelListener(new android.content.DialogInterface.OnCancelListener() {

            final XWalkResourceClientInternal this$0;
            final ValueCallback val$valueCallback;

            public void onCancel(DialogInterface dialoginterface)
            {
                valueCallback.onReceiveValue(Boolean.valueOf(false));
            }

            
            {
                this$0 = XWalkResourceClientInternal.this;
                valueCallback = valuecallback;
                super();
            }
        });
        xwalkviewinternal.create().show();
    }

    public WebResourceResponse shouldInterceptLoadRequest(XWalkViewInternal xwalkviewinternal, String s)
    {
        return null;
    }

    public boolean shouldOverrideUrlLoading(XWalkViewInternal xwalkviewinternal, String s)
    {
        return false;
    }
}
