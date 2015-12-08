// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.support.v7.widget.RecyclerView;
import com.google.android.apps.photos.list.fastscroll.FastScrollRecyclerView;
import java.util.Iterator;
import java.util.List;

public final class fst extends afc
{

    private FastScrollRecyclerView a;

    public fst(FastScrollRecyclerView fastscrollrecyclerview)
    {
        a = fastscrollrecyclerview;
        super();
    }

    public final void a(RecyclerView recyclerview, int i)
    {
        for (Iterator iterator = FastScrollRecyclerView.a(a).iterator(); iterator.hasNext(); ((afc)iterator.next()).a(recyclerview, i)) { }
    }

    public final void a(RecyclerView recyclerview, int i, int j)
    {
        for (Iterator iterator = FastScrollRecyclerView.a(a).iterator(); iterator.hasNext(); ((afc)iterator.next()).a(recyclerview, i, j)) { }
    }
}
