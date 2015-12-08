// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import android.view.ViewGroup;

// Referenced classes of package com.taplytics:
//            hk

public final class bk
    implements android.support.v7.widget.RecyclerView.RecyclerListener
{

    android.support.v7.widget.RecyclerView.RecyclerListener a;

    public bk(android.support.v7.widget.RecyclerView.RecyclerListener recyclerlistener)
    {
        a = null;
        a = recyclerlistener;
    }

    public final void onViewRecycled(android.support.v7.widget.RecyclerView.ViewHolder viewholder)
    {
        if (viewholder.itemView instanceof ViewGroup)
        {
            hk.d((ViewGroup)viewholder.itemView);
        }
        if (a != null)
        {
            a.onViewRecycled(viewholder);
        }
    }
}
