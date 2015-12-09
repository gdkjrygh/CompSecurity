// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.appcontent;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.gms.games.ui.SingleItemRecyclerAdapter;

// Referenced classes of package com.google.android.gms.games.ui.appcontent:
//            AppContentFragment

private static final class  extends SingleItemRecyclerAdapter
{

    public final int getItemViewType()
    {
        return 0x7f040047;
    }

    protected final com.google.android.gms.games.ui.mViewHolder onCreateItemViewHolder(ViewGroup viewgroup)
    {
        return new com.google.android.gms.games.ui.mViewHolder(mInflater.inflate(0x7f040047, viewgroup, false));
    }

    public (Context context)
    {
        super(context, true);
    }
}
