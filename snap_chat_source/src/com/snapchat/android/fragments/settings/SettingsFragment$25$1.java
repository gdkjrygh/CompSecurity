// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.settings;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.snapchat.android.analytics.AnalyticsEvents;

// Referenced classes of package com.snapchat.android.fragments.settings:
//            SettingsFragment

final class a extends AlertDialog
{

    a(Context context)
    {
        super(context);
    }

    // Unreferenced inner class com/snapchat/android/fragments/settings/SettingsFragment$25

/* anonymous class */
    final class SettingsFragment._cls25
        implements android.view.View.OnClickListener
    {

        final SettingsFragment a;

        public final void onClick(View view)
        {
            view = new SettingsFragment._cls25._cls1(a.getActivity());
            view.setTitle(0x7f08029b);
            view.setMessage(a.getString(0x7f080267));
            view.setButton(-1, a.getString(0x7f0800ec), new SettingsFragment._cls25._cls2());
            view.setButton(-2, a.getString(0x7f08019e), new SettingsFragment._cls25._cls3());
            view.show();
        }

            
            {
                a = settingsfragment;
                super();
            }

        // Unreferenced inner class com/snapchat/android/fragments/settings/SettingsFragment$25$2

/* anonymous class */
        final class SettingsFragment._cls25._cls2
            implements android.content.DialogInterface.OnClickListener
        {

            private SettingsFragment._cls25 a;

            public final void onClick(DialogInterface dialoginterface, int i)
            {
                AnalyticsEvents.e(true);
                dialoginterface = new Intent("android.intent.action.VIEW", Uri.parse("https://www.snapchat.com/beta"));
                a.a.startActivity(dialoginterface);
            }

                    
                    {
                        a = SettingsFragment._cls25.this;
                        super();
                    }
        }


        // Unreferenced inner class com/snapchat/android/fragments/settings/SettingsFragment$25$3

/* anonymous class */
        final class SettingsFragment._cls25._cls3
            implements android.content.DialogInterface.OnClickListener
        {

            public final void onClick(DialogInterface dialoginterface, int i)
            {
                AnalyticsEvents.e(false);
            }

        }

    }

}
