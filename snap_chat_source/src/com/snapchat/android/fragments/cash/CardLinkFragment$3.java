// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.cash;

import android.app.Activity;

// Referenced classes of package com.snapchat.android.fragments.cash:
//            CardLinkFragment

final class a
    implements Runnable
{

    private CardLinkFragment a;

    public final void run()
    {
        CardLinkFragment.l(a);
        android.support.v4.app.FragmentActivity fragmentactivity = a.getActivity();
        if (CardLinkFragment.m(a) && fragmentactivity != null)
        {
            fragmentactivity.onBackPressed();
        }
    }

    (CardLinkFragment cardlinkfragment)
    {
        a = cardlinkfragment;
        super();
    }
}
