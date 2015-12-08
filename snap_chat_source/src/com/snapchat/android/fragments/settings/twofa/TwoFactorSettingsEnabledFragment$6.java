// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.settings.twofa;

import com.snapchat.android.fragments.addfriends.LeftSwipeContentFragment;

// Referenced classes of package com.snapchat.android.fragments.settings.twofa:
//            TwoFactorSettingsEnabledFragment

final class a
    implements Runnable
{

    private TwoFactorSettingsEnabledFragment a;

    public final void run()
    {
        a.d(LeftSwipeContentFragment.SETTINGS_FRAGMENT.tag());
    }

    (TwoFactorSettingsEnabledFragment twofactorsettingsenabledfragment)
    {
        a = twofactorsettingsenabledfragment;
        super();
    }
}
