// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.widget.recycler;


// Referenced classes of package com.skype.android.widget.recycler:
//            ViewFacingWrapper

final class a extends android.support.v7.widget.apper._cls1
{

    final ViewFacingWrapper a;

    public final void onChanged()
    {
        a.notifyDataSetChanged();
    }

    public final void onItemRangeChanged(int i, int j)
    {
        a.a(i, j);
    }

    public final void onItemRangeInserted(int i, int j)
    {
        a.b(i, j);
    }

    public final void onItemRangeMoved(int i, int j, int k)
    {
        a.a(i, j, k);
    }

    public final void onItemRangeRemoved(int i, int j)
    {
        a.c(i, j);
    }

    (ViewFacingWrapper viewfacingwrapper)
    {
        a = viewfacingwrapper;
        super();
    }
}
