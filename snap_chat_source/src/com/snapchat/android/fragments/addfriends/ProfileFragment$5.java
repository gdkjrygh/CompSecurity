// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.addfriends;

import com.snapchat.android.Timber;
import rr;

// Referenced classes of package com.snapchat.android.fragments.addfriends:
//            ProfileFragment

final class a
    implements Runnable
{

    private ProfileFragment a;

    public final void run()
    {
        Timber.c("ProfileFragment", (new StringBuilder("profile images - capturing profile photo at index ")).append(ProfileFragment.t(a)).toString(), new Object[0]);
        ProfileFragment.c(a).a(new <init>(a, (byte)0));
    }

    A(ProfileFragment profilefragment)
    {
        a = profilefragment;
        super();
    }
}
