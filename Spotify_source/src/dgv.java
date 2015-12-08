// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import com.spotify.android.paste.widget.StickyRecyclerView;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public final class dgv extends RecyclerView
{

    private StickyRecyclerView t;

    public dgv(StickyRecyclerView stickyrecyclerview, Context context, AttributeSet attributeset, int i)
    {
        t = stickyrecyclerview;
        super(context, attributeset, i);
        super.a(StickyRecyclerView.c(stickyrecyclerview));
    }

    public final void a(abf abf)
    {
        dgx dgx1 = StickyRecyclerView.c(t);
        if (dgx1.a == null)
        {
            dgx1.a = new CopyOnWriteArrayList();
        }
        dgx1.a.add(abf);
    }

    public final void b(abf abf)
    {
        dgx dgx1 = StickyRecyclerView.c(t);
        if (dgx1.a != null)
        {
            dgx1.a.remove(abf);
        }
    }

    public final void g()
    {
        dgx dgx1 = StickyRecyclerView.c(t);
        if (dgx1.a != null)
        {
            dgx1.a.clear();
        }
    }
}
