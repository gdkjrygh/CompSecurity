// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.user;

import android.widget.ListView;

// Referenced classes of package com.spotify.mobile.android.spotlets.user:
//            ProfilesListFragment

final class a
    implements Runnable
{

    private ProfilesListFragment a;

    public final void run()
    {
        if (ProfilesListFragment.d(a) != null)
        {
            ProfilesListFragment.e(a).onRestoreInstanceState(ProfilesListFragment.d(a));
            ProfilesListFragment.f(a);
        }
    }

    (ProfilesListFragment profileslistfragment)
    {
        a = profileslistfragment;
        super();
    }
}
