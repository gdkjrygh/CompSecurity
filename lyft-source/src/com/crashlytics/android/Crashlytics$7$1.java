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

class a
    implements android.content.OnClickListener
{

    final nLatch.a a;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        a.a.a(true);
        dialoginterface.dismiss();
    }

    PromptSettingsData(PromptSettingsData promptsettingsdata)
    {
        a = promptsettingsdata;
        super();
    }

    // Unreferenced inner class com/crashlytics/android/Crashlytics$7

/* anonymous class */
    class Crashlytics._cls7
        implements Runnable
    {

        final Activity a;
        final Crashlytics.OptInLatch b;
        final DialogStringResolver c;
        final PromptSettingsData d;
        final Crashlytics e;

        public void run()
        {
            android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(a);
            Crashlytics._cls7._cls1 _lcls1 = new Crashlytics._cls7._cls1(this);
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
            builder.setView(scrollview).setTitle(c.a()).setCancelable(false).setNeutralButton(c.c(), _lcls1);
            if (d.d)
            {
                android.content.DialogInterface.OnClickListener onclicklistener = new Crashlytics._cls7._cls2();
                builder.setNegativeButton(c.e(), onclicklistener);
            }
            if (d.f)
            {
                android.content.DialogInterface.OnClickListener onclicklistener1 = new Crashlytics._cls7._cls3();
                builder.setPositiveButton(c.d(), onclicklistener1);
            }
            builder.show();
        }

            
            {
                e = crashlytics;
                a = activity;
                b = optinlatch;
                c = dialogstringresolver;
                d = promptsettingsdata;
                super();
            }

        // Unreferenced inner class com/crashlytics/android/Crashlytics$7$2

/* anonymous class */
        class Crashlytics._cls7._cls2
            implements android.content.DialogInterface.OnClickListener
        {

            final Crashlytics._cls7 a;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                a.b.a(false);
                dialoginterface.dismiss();
            }

                    
                    {
                        a = Crashlytics._cls7.this;
                        super();
                    }
        }


        // Unreferenced inner class com/crashlytics/android/Crashlytics$7$3

/* anonymous class */
        class Crashlytics._cls7._cls3
            implements android.content.DialogInterface.OnClickListener
        {

            final Crashlytics._cls7 a;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                a.e.a(true);
                a.b.a(true);
                dialoginterface.dismiss();
            }

                    
                    {
                        a = Crashlytics._cls7.this;
                        super();
                    }
        }

    }

}
