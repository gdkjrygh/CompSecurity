// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.fragments;

import android.widget.ScrollView;

// Referenced classes of package com.spotify.mobile.android.ui.fragments:
//            CosmosTestFragment

final class a
    implements Runnable
{

    private CosmosTestFragment a;

    public final void run()
    {
        CosmosTestFragment.n(a).fullScroll(130);
    }

    (CosmosTestFragment cosmostestfragment)
    {
        a = cosmostestfragment;
        super();
    }
}
