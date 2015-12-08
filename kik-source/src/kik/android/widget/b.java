// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.support.v7.widget.GridLayoutManager;

// Referenced classes of package kik.android.widget:
//            AutoResizeRecyclerGridView

final class b extends android.support.v7.widget.GridLayoutManager.b
{

    final AutoResizeRecyclerGridView b;

    b(AutoResizeRecyclerGridView autoresizerecyclergridview)
    {
        b = autoresizerecyclergridview;
        super();
    }

    public final int a(int i)
    {
        android.support.v7.widget.RecyclerView.i j = b.b();
        if (i < AutoResizeRecyclerGridView.a(b) && (j instanceof GridLayoutManager))
        {
            return ((GridLayoutManager)j).c();
        } else
        {
            return 1;
        }
    }
}
