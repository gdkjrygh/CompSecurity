// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.settings;

import Bt;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import com.snapchat.android.analytics.AnalyticsEvents;
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
        view.setSingleChoiceItems(0x7f09001b, Bt.j(), new android.content.DialogInterface.OnClickListener() {

            private SettingsFragment._cls16 a;

            public final void onClick(DialogInterface dialoginterface, int i)
            {
                AnalyticsEvents.a(SettingsFragment.PrivacyOptions.values()[Bt.j()].toString(), SettingsFragment.PrivacyOptions.values()[i].toString());
                Bt.d(i);
                SettingsFragment.g(a.a).setText(a.a.getResources().getStringArray(0x7f09001b)[i]);
                (new mH(Ss.a.UPDATEPRIVACY, new String[] {
                    Integer.toString(i)
                })).execute();
                dialoginterface.dismiss();
            }

            
            {
                a = SettingsFragment._cls16.this;
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
