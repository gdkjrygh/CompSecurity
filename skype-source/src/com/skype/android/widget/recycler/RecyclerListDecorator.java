// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.widget.recycler;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.skype.android.widget.recycler:
//            ViewFacingWrapper, CellHolder, ReservedViewTypes

public class RecyclerListDecorator extends ViewFacingWrapper
{

    static final AtomicInteger a = new AtomicInteger(0);
    final List b = new ArrayList();
    final List c = new ArrayList();
    final Context d;
    final LayoutInflater e;
    final int f;

    public RecyclerListDecorator(Context context, android.support.v7.widget.RecyclerView.a a1)
    {
        super(a1);
        d = context;
        e = LayoutInflater.from(context);
        f = a.incrementAndGet();
    }

    private boolean a(int i)
    {
label0:
        {
            boolean flag = false;
            if (!b(i))
            {
                if (i >= b.size() + a())
                {
                    i = 1;
                } else
                {
                    i = 0;
                }
                if (i == 0)
                {
                    break label0;
                }
            }
            flag = true;
        }
        return flag;
    }

    private static boolean a(android.support.v7.widget.RecyclerView.v v)
    {
        return !(v instanceof CellHolder);
    }

    private boolean b(int i)
    {
        return i < b.size();
    }

    private int c(int i)
    {
        return i - b.size();
    }

    private int d(int i)
    {
        return b.size() + i;
    }

    private View e(int i)
    {
        if (b(i))
        {
            return (View)b.get(i);
        } else
        {
            return (View)c.get(i - a() - b.size());
        }
    }

    public final void a(int i, int j)
    {
        super.a(d(i), j);
    }

    public final void a(int i, int j, int k)
    {
        super.a(d(i), d(j), k);
    }

    public final void a(View view)
    {
        int i = b.size();
        view.setId(0x800000 | (f << 8) + i & 0x3fffff);
        b.add(view);
        notifyItemInserted(i);
    }

    public final void b(int i, int j)
    {
        super.b(d(i), j);
    }

    public final void b(View view)
    {
        int i = getItemCount();
        view.setId(0xc00000 | (f << 8) + c.size() & 0x3fffff);
        c.add(view);
        notifyItemInserted(i);
    }

    public final void c(int i, int j)
    {
        super.c(d(i), j);
    }

    public int getItemCount()
    {
        return a() + b.size() + c.size();
    }

    public long getItemId(int i)
    {
        if (a(i))
        {
            return (long)e(i).getId();
        } else
        {
            return super.getItemId(c(i));
        }
    }

    public int getItemViewType(int i)
    {
        if (a(i))
        {
            return ReservedViewTypes.a.c;
        } else
        {
            return super.getItemViewType(c(i)) + 1;
        }
    }

    public void onBindViewHolder(android.support.v7.widget.RecyclerView.v v, int i)
    {
        if (a(i))
        {
            ((CellHolder)v).a(e(i));
            return;
        } else
        {
            super.onBindViewHolder(v, c(i));
            return;
        }
    }

    public android.support.v7.widget.RecyclerView.v onCreateViewHolder(ViewGroup viewgroup, int i)
    {
        boolean flag;
        if (i == ReservedViewTypes.a.c)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            return new CellHolder(viewgroup);
        } else
        {
            return super.onCreateViewHolder(viewgroup, i - 1);
        }
    }

    public boolean onFailedToRecycleView(android.support.v7.widget.RecyclerView.v v)
    {
        return a(v) && super.onFailedToRecycleView(v);
    }

    public void onViewAttachedToWindow(android.support.v7.widget.RecyclerView.v v)
    {
        if (a(v))
        {
            super.onViewAttachedToWindow(v);
        }
    }

    public void onViewDetachedFromWindow(android.support.v7.widget.RecyclerView.v v)
    {
        if (a(v))
        {
            super.onViewDetachedFromWindow(v);
        }
    }

    public void onViewRecycled(android.support.v7.widget.RecyclerView.v v)
    {
        if (a(v))
        {
            super.onViewRecycled(v);
            return;
        } else
        {
            ((ViewGroup)v.itemView).removeAllViews();
            return;
        }
    }

}
