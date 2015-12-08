// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.settings;

import Bt;
import Mf;
import Oi;
import android.text.TextUtils;
import android.view.View;
import com.snapchat.android.fragments.addfriends.LeftSwipeContentFragment;
import com.squareup.otto.Bus;

// Referenced classes of package com.snapchat.android.fragments.settings:
//            SettingsFragment

final class a
    implements android.view.
{

    private SettingsFragment a;

    public final void onClick(View view)
    {
        SettingsFragment.e(a);
        if (TextUtils.isEmpty(Bt.bw()))
        {
            Mf.a().a(new Oi(LeftSwipeContentFragment.EMAIL_SETTINGS_FRAGMENT));
            return;
        } else
        {
            Mf.a().a(new Oi(LeftSwipeContentFragment.EMAIL_VERIFICATION_SENT_FRAGMENT));
            return;
        }
    }

    agment(SettingsFragment settingsfragment)
    {
        a = settingsfragment;
        super();
    }
}
