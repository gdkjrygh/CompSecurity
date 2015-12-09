// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.fragments;

import android.widget.CompoundButton;

// Referenced classes of package com.spotify.mobile.android.ui.fragments:
//            CosmosTestFragment

final class a
    implements android.widget.kedChangeListener
{

    private CosmosTestFragment a;

    public final void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
    {
        if (CosmosTestFragment.a(a))
        {
            CosmosTestFragment.j(a);
        }
        CosmosTestFragment.b(a, false);
    }

    (CosmosTestFragment cosmostestfragment)
    {
        a = cosmostestfragment;
        super();
    }
}
