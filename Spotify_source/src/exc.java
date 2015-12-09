// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

public final class exc extends aad
{

    private RecyclerView m;
    private final int n;
    private final aac o = new aac() {

        private exc b;

        public final int a(int i)
        {
            boolean flag = true;
            int j = ((flag) ? 1 : 0);
            if (exc.a(b) != null)
            {
                j = ((flag) ? 1 : 0);
                if (exc.a(b).c().a(i) == 1)
                {
                    j = b.c();
                }
            }
            return j;
        }

            
            {
                b = exc.this;
                super();
            }
    };
    private final abc p = new abc() {

        private exc a;

        public final void a(Rect rect, View view, RecyclerView recyclerview, abm abm)
        {
            rect.set(exc.b(a), exc.b(a) << 1, exc.b(a), 0);
        }

            
            {
                a = exc.this;
                super();
            }
    };

    public exc(Context context)
    {
        ctz.a(context);
        super(context.getResources().getInteger(0x7f0e0001));
        a(o);
        n = context.getResources().getDimensionPixelSize(0x7f0c008d) / 2;
        o.a();
    }

    static RecyclerView a(exc exc1)
    {
        return exc1.m;
    }

    static int b(exc exc1)
    {
        return exc1.n;
    }

    public final void a(RecyclerView recyclerview, abh abh)
    {
        super.a(recyclerview, abh);
        recyclerview.b(p);
        m = null;
    }

    public final void c(RecyclerView recyclerview)
    {
        super.c(recyclerview);
        m = recyclerview;
        recyclerview.a(p);
        recyclerview.setPadding(n, 0, n, n << 1);
    }
}
