// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.settings;

import HZ;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import com.snapchat.android.analytics.AnalyticsEvents;

// Referenced classes of package com.snapchat.android.fragments.settings:
//            SettingsFragment

final class a
    implements android.content.ckListener
{

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        AnalyticsEvents.f(false);
    }

    a()
    {
    }

    // Unreferenced inner class com/snapchat/android/fragments/settings/SettingsFragment$2

/* anonymous class */
    final class SettingsFragment._cls2
        implements android.view.View.OnClickListener
    {

        final SettingsFragment a;

        public final void onClick(View view)
        {
            view = new SettingsFragment._cls2._cls1(a.getActivity());
            view.setTitle(0x7f080290);
            view.setMessage(a.getString(0x7f080291));
            view.setButton(-1, a.getString(0x7f0801bc), new SettingsFragment._cls2._cls2());
            view.setButton(-2, a.getString(0x7f08019e), new SettingsFragment._cls2._cls3());
            view.show();
        }

            
            {
                a = settingsfragment;
                super();
            }

        // Unreferenced inner class com/snapchat/android/fragments/settings/SettingsFragment$2$1

/* anonymous class */
        final class SettingsFragment._cls2._cls1 extends AlertDialog
        {

        }


        // Unreferenced inner class com/snapchat/android/fragments/settings/SettingsFragment$2$2

/* anonymous class */
        final class SettingsFragment._cls2._cls2
            implements android.content.DialogInterface.OnClickListener
        {

            private SettingsFragment._cls2 a;

            public final void onClick(DialogInterface dialoginterface, int i)
            {
                AnalyticsEvents.f(true);
                HZ.a(a.a.getActivity());
            }

                    
                    {
                        a = SettingsFragment._cls2.this;
                        super();
                    }
        }

    }

}
