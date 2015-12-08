// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.ui;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.widget.CheckBox;
import android.widget.RelativeLayout;
import com.microsoft.onlineid.internal.ApiRequestResultReceiver;
import com.microsoft.onlineid.internal.MsaService;
import com.microsoft.onlineid.internal.a;
import com.microsoft.onlineid.internal.b;
import com.microsoft.onlineid.internal.c;
import com.microsoft.onlineid.internal.n;

public class SignOutActivity extends Activity
{
    private class SignOutResultReceiver extends ApiRequestResultReceiver
    {

        final SignOutActivity a;

        protected final void a()
        {
            a.finish();
        }

        protected final void a(PendingIntent pendingintent)
        {
            a(((Exception) (new UnsupportedOperationException("onUINeeded not expected for sign out request."))));
        }

        protected final void a(c c1)
        {
            com.microsoft.onlineid.ui.SignOutActivity.c(a).a(com.microsoft.onlineid.ui.SignOutActivity.a(a), com.microsoft.onlineid.ui.SignOutActivity.b(a)).a();
            a.finish();
        }

        protected final void a(Exception exception)
        {
            com.microsoft.onlineid.ui.SignOutActivity.c(a).a(exception).a();
            a.finish();
        }

        public SignOutResultReceiver()
        {
            a = SignOutActivity.this;
            super(new Handler());
        }
    }


    private String a;
    private a b;
    private boolean c;

    public SignOutActivity()
    {
    }

    public static Intent a(Context context, String s, String s1, String s2, Bundle bundle)
    {
        return (new Intent(context, com/microsoft/onlineid/ui/SignOutActivity)).putExtra(com.microsoft.onlineid.internal.b.a.b.a(), s).putExtra(com.microsoft.onlineid.internal.b.a.a.a(), s2).putExtra("com.microsoft.onlineid.user_cid", s1).putExtra("com.microsoft.onlineid.client_state", bundle).setData((new com.microsoft.onlineid.internal.i.a()).a(s).a(s2).a());
    }

    static String a(SignOutActivity signoutactivity)
    {
        return signoutactivity.a;
    }

    static boolean a(SignOutActivity signoutactivity, boolean flag)
    {
        signoutactivity.c = flag;
        return flag;
    }

    static boolean b(SignOutActivity signoutactivity)
    {
        return signoutactivity.c;
    }

    static a c(SignOutActivity signoutactivity)
    {
        return signoutactivity.b;
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        requestWindowFeature(1);
        b = new a(this, com.microsoft.onlineid.internal.a.a.a);
        a = getIntent().getStringExtra("com.microsoft.onlineid.user_cid");
        Object obj = getApplicationContext();
        Object obj1 = new b(((Context) (obj)), getIntent());
        bundle = new n(((Context) (obj)));
        RelativeLayout relativelayout = (RelativeLayout)getLayoutInflater().inflate(bundle.c("sign_out_custom_content_view"), null);
        Object obj2 = (CheckBox)relativelayout.findViewById(bundle.d("signOutCheckBox"));
        ((CheckBox) (obj2)).setText(String.format(bundle.a("sign_out_dialog_checkbox"), new Object[] {
            ((b) (obj1)).c()
        }));
        obj = new android.content.DialogInterface.OnClickListener(((b) (obj1)), ((CheckBox) (obj2)), ((Context) (obj))) {

            final b a;
            final CheckBox b;
            final Context c;
            final SignOutActivity d;

            public final void onClick(DialogInterface dialoginterface, int i)
            {
                String s1 = a.d();
                String s;
                SignOutActivity signoutactivity;
                boolean flag;
                if (b.isChecked())
                {
                    s = "com.microsoft.onlineid.internal.SIGN_OUT_ALL_APPS";
                } else
                {
                    s = "com.microsoft.onlineid.internal.SIGN_OUT";
                }
                signoutactivity = d;
                if (b.isChecked())
                {
                    flag = false;
                } else
                {
                    flag = true;
                }
                com.microsoft.onlineid.ui.SignOutActivity.a(signoutactivity, flag);
                (new b(c, (new Intent(c, com/microsoft/onlineid/internal/MsaService)).setAction(s))).a(s1).a(d. new SignOutResultReceiver()).o();
                dialoginterface.dismiss();
            }

            
            {
                d = SignOutActivity.this;
                a = b1;
                b = checkbox;
                c = context;
                super();
            }
        };
        obj1 = new android.content.DialogInterface.OnClickListener() {

            final SignOutActivity a;

            public final void onClick(DialogInterface dialoginterface, int i)
            {
                dialoginterface.cancel();
            }

            
            {
                a = SignOutActivity.this;
                super();
            }
        };
        obj2 = new android.content.DialogInterface.OnCancelListener() {

            final SignOutActivity a;

            public final void onCancel(DialogInterface dialoginterface)
            {
                a.finish();
            }

            
            {
                a = SignOutActivity.this;
                super();
            }
        };
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(this);
        builder.setView(relativelayout).setTitle(bundle.a("sign_out_dialog_title")).setPositiveButton(bundle.a("sign_out_dialog_button_sign_out"), ((android.content.DialogInterface.OnClickListener) (obj))).setNegativeButton(bundle.a("sign_out_dialog_button_cancel"), ((android.content.DialogInterface.OnClickListener) (obj1))).setOnCancelListener(((android.content.DialogInterface.OnCancelListener) (obj2)));
        builder.create().show();
    }
}
