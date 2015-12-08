// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.client.players;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.games.ui.SingleItemAdapter;

// Referenced classes of package com.google.android.gms.games.ui.client.players:
//            SelectPlayersListFragment

private static final class mInflater extends SingleItemAdapter
{

    private final LayoutInflater mInflater;

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        View view1 = view;
        if (view == null)
        {
            view1 = mInflater.inflate(0x7f0400a2, viewgroup, false);
        }
        return view1;
    }

    public (Context context)
    {
        mInflater = (LayoutInflater)context.getSystemService("layout_inflater");
    }
}
