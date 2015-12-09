// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.fragments;

import android.view.View;
import android.widget.AdapterView;

// Referenced classes of package com.spotify.mobile.android.ui.fragments:
//            CosmosTestFragment

final class a
    implements android.widget.ctedListener
{

    private CosmosTestFragment a;

    public final void onItemSelected(AdapterView adapterview, View view, int i, long l)
    {
        if (CosmosTestFragment.a(a))
        {
            CosmosTestFragment.j(a);
        }
        CosmosTestFragment.b(a, false);
    }

    public final void onNothingSelected(AdapterView adapterview)
    {
    }

    (CosmosTestFragment cosmostestfragment)
    {
        a = cosmostestfragment;
        super();
    }
}
