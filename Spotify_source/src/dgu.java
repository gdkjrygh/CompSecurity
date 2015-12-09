// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.spotify.android.paste.widget.StickyRecyclerView;

public final class dgu extends abc
{

    private StickyRecyclerView a;

    private dgu(StickyRecyclerView stickyrecyclerview)
    {
        a = stickyrecyclerview;
        super();
    }

    public dgu(StickyRecyclerView stickyrecyclerview, byte byte0)
    {
        this(stickyrecyclerview);
    }

    public final void a(Canvas canvas, RecyclerView recyclerview)
    {
        if (StickyRecyclerView.e(a).getColor() != 0 && StickyRecyclerView.f(a))
        {
            int i = StickyRecyclerView.g(a);
            canvas.drawRect(0.0F, i, StickyRecyclerView.h(a).getWidth(), i + StickyRecyclerView.h(a).getHeight(), StickyRecyclerView.e(a));
        }
    }

    public final void a(Rect rect, View view, RecyclerView recyclerview, abm abm)
    {
        int i = RecyclerView.c(view);
        rect.setEmpty();
        view = recyclerview.f;
        if (view instanceof LinearLayoutManager)
        {
            if (((LinearLayoutManager)view).f != 1)
            {
                throw new IllegalStateException("Layout manager must be in vertical position");
            }
            if (view instanceof GridLayoutManager)
            {
                view = (GridLayoutManager)view;
                i = ((GridLayoutManager) (view)).e.c(i, ((GridLayoutManager) (view)).a);
            }
            if (i == 0)
            {
                rect.top = StickyRecyclerView.d(a);
            }
            return;
        } else
        {
            throw new IllegalArgumentException((new StringBuilder("The layout manager ")).append(view.getClass().getSimpleName()).append(" is not supported!").toString());
        }
    }
}
