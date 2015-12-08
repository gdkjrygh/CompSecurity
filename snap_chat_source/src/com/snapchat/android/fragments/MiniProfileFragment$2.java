// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments;

import Pp;

// Referenced classes of package com.snapchat.android.fragments:
//            MiniProfileFragment

final class a
    implements Runnable
{

    private MiniProfileFragment a;

    public final void run()
    {
        if (a.getActivity() != null && MiniProfileFragment.a(a) != null)
        {
            MiniProfileFragment.b(a).a(a.getActivity(), MiniProfileFragment.a(a), com.snapchat.android.util.profileimages.ileImageSize.MEDIUM);
        }
    }

    tils.ProfileImageSize(MiniProfileFragment miniprofilefragment)
    {
        a = miniprofilefragment;
        super();
    }
}
