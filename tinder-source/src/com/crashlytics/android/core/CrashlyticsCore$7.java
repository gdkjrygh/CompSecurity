// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.core;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.widget.ScrollView;
import android.widget.TextView;
import io.fabric.sdk.android.services.c.c;
import io.fabric.sdk.android.services.c.d;
import io.fabric.sdk.android.services.settings.o;

// Referenced classes of package com.crashlytics.android.core:
//            CrashlyticsCore, DialogStringResolver

class d
    implements Runnable
{

    final Activity a;
    final tInLatch b;
    final DialogStringResolver c;
    final o d;
    final CrashlyticsCore e;

    public void run()
    {
        android.app.r r = new android.app.r(a);
        android.content.ClickListener clicklistener = new android.content.DialogInterface.OnClickListener() {

            final CrashlyticsCore._cls7 a;

            public void onClick(DialogInterface dialoginterface, int j)
            {
                a.b.a(true);
                dialoginterface.dismiss();
            }

            
            {
                a = CrashlyticsCore._cls7.this;
                super();
            }
        };
        float f = a.getResources().getDisplayMetrics().density;
        int i = CrashlyticsCore.a(f, 5);
        Object obj = new TextView(a);
        ((TextView) (obj)).setAutoLinkMask(15);
        Object obj1 = c;
        ((TextView) (obj)).setText(((DialogStringResolver) (obj1)).a("com.crashlytics.CrashSubmissionPromptMessage", ((DialogStringResolver) (obj1)).a.b));
        ((TextView) (obj)).setTextAppearance(a, 0x1030044);
        ((TextView) (obj)).setPadding(i, i, i, i);
        ((TextView) (obj)).setFocusable(false);
        obj1 = new ScrollView(a);
        ((ScrollView) (obj1)).setPadding(CrashlyticsCore.a(f, 14), CrashlyticsCore.a(f, 2), CrashlyticsCore.a(f, 10), CrashlyticsCore.a(f, 12));
        ((ScrollView) (obj1)).addView(((android.view.View) (obj)));
        obj = r.setView(((android.view.View) (obj1)));
        obj1 = c;
        obj = ((android.app.r) (obj)).setTitle(((DialogStringResolver) (obj1)).a("com.crashlytics.CrashSubmissionPromptTitle", ((DialogStringResolver) (obj1)).a.a)).setCancelable(false);
        obj1 = c;
        ((android.app.r) (obj)).setNeutralButton(((DialogStringResolver) (obj1)).a("com.crashlytics.CrashSubmissionSendTitle", ((DialogStringResolver) (obj1)).a.c), clicklistener);
        if (d.d)
        {
            android.content.ClickListener clicklistener1 = new android.content.DialogInterface.OnClickListener() {

                final CrashlyticsCore._cls7 a;

                public void onClick(DialogInterface dialoginterface, int j)
                {
                    a.b.a(false);
                    dialoginterface.dismiss();
                }

            
            {
                a = CrashlyticsCore._cls7.this;
                super();
            }
            };
            DialogStringResolver dialogstringresolver = c;
            r.setNegativeButton(dialogstringresolver.a("com.crashlytics.CrashSubmissionCancelTitle", dialogstringresolver.a.e), clicklistener1);
        }
        if (d.f)
        {
            android.content.ClickListener clicklistener2 = new android.content.DialogInterface.OnClickListener() {

                final CrashlyticsCore._cls7 a;

                public void onClick(DialogInterface dialoginterface, int j)
                {
                    d d1 = new d(a.e);
                    d1.a(d1.b().putBoolean("always_send_reports_opt_in", true));
                    a.b.a(true);
                    dialoginterface.dismiss();
                }

            
            {
                a = CrashlyticsCore._cls7.this;
                super();
            }
            };
            DialogStringResolver dialogstringresolver1 = c;
            r.setPositiveButton(dialogstringresolver1.a("com.crashlytics.CrashSubmissionAlwaysSendTitle", dialogstringresolver1.a.g), clicklistener2);
        }
        r.show();
    }

    er(CrashlyticsCore crashlyticscore, Activity activity, tInLatch tinlatch, DialogStringResolver dialogstringresolver, o o1)
    {
        e = crashlyticscore;
        a = activity;
        b = tinlatch;
        c = dialogstringresolver;
        d = o1;
        super();
    }
}
