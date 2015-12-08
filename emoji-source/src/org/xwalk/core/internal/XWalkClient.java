// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xwalk.core.internal;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.net.http.SslError;
import android.os.Message;
import android.widget.EditText;
import android.widget.LinearLayout;

// Referenced classes of package org.xwalk.core.internal:
//            XWalkViewInternal, XWalkHttpAuthHandler

public class XWalkClient
{

    private Context mContext;
    private XWalkViewInternal mXWalkView;

    public XWalkClient(XWalkViewInternal xwalkviewinternal)
    {
        mContext = xwalkviewinternal.getContext();
        mXWalkView = xwalkviewinternal;
    }

    public void doUpdateVisitedHistory(XWalkViewInternal xwalkviewinternal, String s, boolean flag)
    {
    }

    public void onFormResubmission(XWalkViewInternal xwalkviewinternal, Message message, Message message1)
    {
        message.sendToTarget();
    }

    public void onLoadResource(XWalkViewInternal xwalkviewinternal, String s)
    {
    }

    public void onProceededAfterSslError(XWalkViewInternal xwalkviewinternal, SslError sslerror)
    {
    }

    public void onReceivedHttpAuthRequest(XWalkViewInternal xwalkviewinternal, final XWalkHttpAuthHandler haHandler, final String userNameEditText, final String passwordEditText)
    {
        if (xwalkviewinternal == null)
        {
            return;
        } else
        {
            xwalkviewinternal = new LinearLayout(mContext);
            userNameEditText = new EditText(mContext);
            passwordEditText = new EditText(mContext);
            xwalkviewinternal.setOrientation(1);
            xwalkviewinternal.setPaddingRelative(10, 0, 10, 20);
            userNameEditText.setHint(R.string.http_auth_user_name);
            passwordEditText.setHint(R.string.http_auth_password);
            xwalkviewinternal.addView(userNameEditText);
            xwalkviewinternal.addView(passwordEditText);
            (new android.app.AlertDialog.Builder(mXWalkView.getActivity())).setTitle(R.string.http_auth_title).setView(xwalkviewinternal).setCancelable(false).setPositiveButton(R.string.http_auth_log_in, new android.content.DialogInterface.OnClickListener() {

                final XWalkClient this$0;
                final XWalkHttpAuthHandler val$haHandler;
                final EditText val$passwordEditText;
                final EditText val$userNameEditText;

                public void onClick(DialogInterface dialoginterface, int i)
                {
                    String s = userNameEditText.getText().toString();
                    String s1 = passwordEditText.getText().toString();
                    haHandler.proceed(s, s1);
                    dialoginterface.dismiss();
                }

            
            {
                this$0 = XWalkClient.this;
                userNameEditText = edittext;
                passwordEditText = edittext1;
                haHandler = xwalkhttpauthhandler;
                super();
            }
            }).setNegativeButton(0x1040000, null).setOnCancelListener(new android.content.DialogInterface.OnCancelListener() {

                final XWalkClient this$0;
                final XWalkHttpAuthHandler val$haHandler;

                public void onCancel(DialogInterface dialoginterface)
                {
                    haHandler.cancel();
                }

            
            {
                this$0 = XWalkClient.this;
                haHandler = xwalkhttpauthhandler;
                super();
            }
            }).create().show();
            return;
        }
    }

    public void onReceivedLoginRequest(XWalkViewInternal xwalkviewinternal, String s, String s1, String s2)
    {
    }

    public void onRendererResponsive(XWalkViewInternal xwalkviewinternal)
    {
    }

    public void onRendererUnresponsive(XWalkViewInternal xwalkviewinternal)
    {
    }

    public void onTooManyRedirects(XWalkViewInternal xwalkviewinternal, Message message, Message message1)
    {
        message.sendToTarget();
    }
}
