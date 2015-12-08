// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.settings;

import Bt;
import Mf;
import Oi;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import com.snapchat.android.analytics.AnalyticsEvents;
import com.snapchat.android.fragments.addfriends.LeftSwipeContentFragment;
import com.squareup.otto.Bus;
import mH;

// Referenced classes of package com.snapchat.android.fragments.settings:
//            SettingsFragment

final class a
    implements android.view.
{

    final SettingsFragment a;

    public final void onClick(View view)
    {
        view = new android.app.<init>(a.getActivity());
        view.setSingleChoiceItems(0x7f09001e, Bt.k(), new android.content.DialogInterface.OnClickListener() {

            private SettingsFragment._cls17 a;

            public final void onClick(DialogInterface dialoginterface, int i)
            {
                AnalyticsEvents.a(SettingsFragment.PrivacyOptions.values()[Bt.k()].toString(), SettingsFragment.PrivacyOptions.values()[i].toString());
                Bt.e(i);
                SettingsFragment.h(a.a).setText(a.a.getResources().getStringArray(0x7f09001e)[i]);
                String s = SettingsFragment.PrivacyOptions.values()[i].toString();
                if (s.equals("CUSTOM"))
                {
                    Mf.a().a(new Oi(LeftSwipeContentFragment.CUSTOM_STORY_PRIVACY_FRAGMENT));
                } else
                {
                    (new mH(Ss.a.UPDATESTORYPRIVACY, new String[] {
                        s
                    })).execute();
                }
                dialoginterface.dismiss();
            }

            
            {
                a = SettingsFragment._cls17.this;
                super();
            }
        });
        view.show();
    }

    _cls1.a(SettingsFragment settingsfragment)
    {
        a = settingsfragment;
        super();
    }
}
