// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.widget.ScrollView;
import android.widget.TextView;
import io.fabric.sdk.android.services.settings.PromptSettingsData;

// Referenced classes of package com.crashlytics.android:
//            Crashlytics, DialogStringResolver

class d
    implements Runnable
{

    final Activity a;
    final tInLatch b;
    final DialogStringResolver c;
    final PromptSettingsData d;
    final Crashlytics e;

    public void run()
    {
        android.app.ilder ilder = new android.app.ilder(a);
        android.content.e.OnClickListener onclicklistener = new android.content.DialogInterface.OnClickListener() {

            final Crashlytics._cls7 a;

            public void onClick(DialogInterface dialoginterface, int j)
            {
                a.b.a(true);
                dialoginterface.dismiss();
            }

            
            {
                a = Crashlytics._cls7.this;
                super();
            }
        };
        float f = a.getResources().getDisplayMetrics().density;
        int i = Crashlytics.a(e, f, 5);
        TextView textview = new TextView(a);
        textview.setAutoLinkMask(15);
        textview.setText(c.b());
        textview.setTextAppearance(a, 0x1030044);
        textview.setPadding(i, i, i, i);
        textview.setFocusable(false);
        ScrollView scrollview = new ScrollView(a);
        scrollview.setPadding(Crashlytics.a(e, f, 14), Crashlytics.a(e, f, 2), Crashlytics.a(e, f, 10), Crashlytics.a(e, f, 12));
        scrollview.addView(textview);
        ilder.setView(scrollview).setTitle(c.a()).setCancelable(false).setNeutralButton(c.c(), onclicklistener);
        if (d.d)
        {
            android.content.e.OnClickListener onclicklistener1 = new android.content.DialogInterface.OnClickListener() {

                final Crashlytics._cls7 a;

                public void onClick(DialogInterface dialoginterface, int j)
                {
                    a.b.a(false);
                    dialoginterface.dismiss();
                }

            
            {
                a = Crashlytics._cls7.this;
                super();
            }
            };
            ilder.setNegativeButton(c.e(), onclicklistener1);
        }
        if (d.f)
        {
            android.content.e.OnClickListener onclicklistener2 = new android.content.DialogInterface.OnClickListener() {

                final Crashlytics._cls7 a;

                public void onClick(DialogInterface dialoginterface, int j)
                {
                    a.e.a(true);
                    a.b.a(true);
                    dialoginterface.dismiss();
                }

            
            {
                a = Crashlytics._cls7.this;
                super();
            }
            };
            ilder.setPositiveButton(c.d(), onclicklistener2);
        }
        ilder.show();
    }

    s.PromptSettingsData(Crashlytics crashlytics, Activity activity, tInLatch tinlatch, DialogStringResolver dialogstringresolver, PromptSettingsData promptsettingsdata)
    {
        e = crashlytics;
        a = activity;
        b = tinlatch;
        c = dialogstringresolver;
        d = promptsettingsdata;
        super();
    }
}
