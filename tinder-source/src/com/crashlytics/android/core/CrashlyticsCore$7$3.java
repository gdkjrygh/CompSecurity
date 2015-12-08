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

class a
    implements android.content.ickListener
{

    final nLatch.a a;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        d d1 = new d(a.a);
        d1.a(d1.b().putBoolean("always_send_reports_opt_in", true));
        a.a.a(true);
        dialoginterface.dismiss();
    }

    ( )
    {
        a = ;
        super();
    }

    // Unreferenced inner class com/crashlytics/android/core/CrashlyticsCore$7

/* anonymous class */
    class CrashlyticsCore._cls7
        implements Runnable
    {

        final Activity a;
        final CrashlyticsCore.OptInLatch b;
        final DialogStringResolver c;
        final o d;
        final CrashlyticsCore e;

        public void run()
        {
            android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(a);
            android.content.DialogInterface.OnClickListener onclicklistener = new CrashlyticsCore._cls7._cls1();
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
            obj = builder.setView(((android.view.View) (obj1)));
            obj1 = c;
            obj = ((android.app.AlertDialog.Builder) (obj)).setTitle(((DialogStringResolver) (obj1)).a("com.crashlytics.CrashSubmissionPromptTitle", ((DialogStringResolver) (obj1)).a.a)).setCancelable(false);
            obj1 = c;
            ((android.app.AlertDialog.Builder) (obj)).setNeutralButton(((DialogStringResolver) (obj1)).a("com.crashlytics.CrashSubmissionSendTitle", ((DialogStringResolver) (obj1)).a.c), onclicklistener);
            if (d.d)
            {
                android.content.DialogInterface.OnClickListener onclicklistener1 = new CrashlyticsCore._cls7._cls2();
                DialogStringResolver dialogstringresolver = c;
                builder.setNegativeButton(dialogstringresolver.a("com.crashlytics.CrashSubmissionCancelTitle", dialogstringresolver.a.e), onclicklistener1);
            }
            if (d.f)
            {
                CrashlyticsCore._cls7._cls3 _lcls3 = new CrashlyticsCore._cls7._cls3(this);
                DialogStringResolver dialogstringresolver1 = c;
                builder.setPositiveButton(dialogstringresolver1.a("com.crashlytics.CrashSubmissionAlwaysSendTitle", dialogstringresolver1.a.g), _lcls3);
            }
            builder.show();
        }

            
            {
                e = crashlyticscore;
                a = activity;
                b = optinlatch;
                c = dialogstringresolver;
                d = o1;
                super();
            }

        // Unreferenced inner class com/crashlytics/android/core/CrashlyticsCore$7$1

/* anonymous class */
        class CrashlyticsCore._cls7._cls1
            implements android.content.DialogInterface.OnClickListener
        {

            final CrashlyticsCore._cls7 a;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                a.b.a(true);
                dialoginterface.dismiss();
            }

                    
                    {
                        a = CrashlyticsCore._cls7.this;
                        super();
                    }
        }


        // Unreferenced inner class com/crashlytics/android/core/CrashlyticsCore$7$2

/* anonymous class */
        class CrashlyticsCore._cls7._cls2
            implements android.content.DialogInterface.OnClickListener
        {

            final CrashlyticsCore._cls7 a;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                a.b.a(false);
                dialoginterface.dismiss();
            }

                    
                    {
                        a = CrashlyticsCore._cls7.this;
                        super();
                    }
        }

    }

}
