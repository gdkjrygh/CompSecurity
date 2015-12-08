// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.widget;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.skype.android.widget.recycler.ReservedViewTypes;

// Referenced classes of package com.skype.android.widget:
//            SeparatedColumnsAdapter

private final class a extends android.support.v7.widget.
{
    private final class a extends android.support.v7.widget.RecyclerView.v
    {

        final SeparatedColumnsAdapter.a a;

        public a(ViewGroup viewgroup)
        {
            a = SeparatedColumnsAdapter.a.this;
            super(LayoutInflater.from(SeparatedColumnsAdapter.b(SeparatedColumnsAdapter.a.this.a)).inflate(0x7f030082, viewgroup, false));
        }
    }


    final SeparatedColumnsAdapter a;

    public final int getItemCount()
    {
        return 1;
    }

    public final long getItemId(int i)
    {
        return 0L;
    }

    public final int getItemViewType(int i)
    {
        return ReservedViewTypes.b.c;
    }

    public final void onBindViewHolder(android.support.v7.widget.c c, int i)
    {
    }

    public final android.support.v7.widget.c onCreateViewHolder(ViewGroup viewgroup, int i)
    {
        return new a(viewgroup);
    }

    public a(SeparatedColumnsAdapter separatedcolumnsadapter)
    {
        a = separatedcolumnsadapter;
        super();
    }
}
