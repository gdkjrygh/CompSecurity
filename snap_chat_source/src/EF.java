// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

public abstract class EF
    implements Es, zo
{

    private android.support.v7.widget.RecyclerView.l a = new android.support.v7.widget.RecyclerView.l() {

        private EF a;

        public final void a(RecyclerView recyclerview, int i, int l)
        {
            i = a.f.o();
            if (a.g != -1 && a.g == i)
            {
                return;
            } else
            {
                a.g = i;
                a.j();
                return;
            }
        }

            
            {
                a = EF.this;
                super();
            }
    };
    public final Context d;
    public RecyclerView e;
    public LinearLayoutManager f;
    public int g;

    public EF(Context context)
    {
        this(context, new LinearLayoutManager(0));
    }

    public EF(Context context, LinearLayoutManager linearlayoutmanager)
    {
        g = -1;
        d = context;
        f = linearlayoutmanager;
    }

    public final String a()
    {
        return null;
    }

    public void a(View view)
    {
        e = (RecyclerView)view;
        if (e.d != d())
        {
            f = new LinearLayoutManager(0);
            e.setLayoutManager(f);
            e.setAdapter(d());
            e.setOnScrollListener(a);
            e.setHasFixedSize(true);
        }
    }

    public abstract void a(jW jw);

    public final boolean b()
    {
        return false;
    }

    public abstract android.support.v7.widget.RecyclerView.a d();

    public abstract void e();

    public abstract void f();

    public abstract void g();

    public abstract void h();

    public abstract void j();

    public void k()
    {
    }

    public abstract boolean w_();

    public void x_()
    {
    }

    public final boolean y_()
    {
        return false;
    }
}
