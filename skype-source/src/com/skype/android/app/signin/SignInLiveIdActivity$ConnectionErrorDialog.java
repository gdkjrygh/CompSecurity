// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.signin;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.h;
import android.webkit.WebView;

// Referenced classes of package com.skype.android.app.signin:
//            SignInLiveIdActivity

public static class _cls1.this._cls0 extends h
{

    public Dialog onCreateDialog(Bundle bundle)
    {
        bundle = new android.support.v7.app.ialog(getActivity(), 0x7f0900cd);
        bundle.getActivity(0x7f080281);
        bundle.getActivity(0x7f08039f);
        android.content.nErrorDialog nerrordialog = new android.content.DialogInterface.OnClickListener() {

            final SignInLiveIdActivity.ConnectionErrorDialog this$0;

            public final void onClick(DialogInterface dialoginterface, int i)
            {
                if (i == -1)
                {
                    ((SignInLiveIdActivity)getActivity()).webView.goBack();
                } else
                if (i == -2)
                {
                    getActivity().finish();
                    return;
                }
            }

            
            {
                this$0 = SignInLiveIdActivity.ConnectionErrorDialog.this;
                super();
            }
        };
        bundle.ialog(0x7f080340, nerrordialog);
        bundle.ialog(0x7f080120, nerrordialog);
        bundle.ialog(false);
        return bundle.ialog();
    }

    public _cls1.this._cls0()
    {
    }
}
