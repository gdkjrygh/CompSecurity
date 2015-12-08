// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.List;

public final class fzk
{

    public fzw a;
    private Context b;
    private int c;

    public fzk(Context context, int i)
    {
        b = context;
        c = i;
        a = (new fzy()).a();
    }

    public fzk(Context context, int i, fzw fzw1)
    {
        b = context;
        c = i;
        a = fzw1;
    }

    public final fzk a(fzi fzi)
    {
        Iterator iterator = olm.c(b, fzj).iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object obj = (fzj)iterator.next();
            if (((fzj) (obj)).a(fzi))
            {
                fzw fzw1 = ((fzj) (obj)).a(fzi, c);
                obj = a;
                if (fzw1 != null)
                {
                    fzy fzy1 = new fzy(((fzw) (obj)));
                    if (b.a(((fzw) (obj)).c) == 0L)
                    {
                        fzy1.c = fzw1.c;
                    }
                    if (b.a(((fzw) (obj)).d) <= 0L)
                    {
                        fzy1.d = fzw1.d;
                    }
                    if (b.a(((fzw) (obj)).e) <= 0L)
                    {
                        fzy1.e = fzw1.e;
                    }
                    if (b.a(((fzw) (obj)).f) == 0)
                    {
                        fzy1.f = fzw1.f;
                    }
                    if (b.a(((fzw) (obj)).p) == 0)
                    {
                        fzy1.p = fzw1.p;
                    }
                    if (b.a(((fzw) (obj)).j, 0.0F) == 0.0F)
                    {
                        fzy1.j = fzw1.j;
                    }
                    if (b.a(((fzw) (obj)).k, 0.0F) == 0.0F)
                    {
                        fzy1.k = fzw1.k;
                    }
                    if (b.a(((fzw) (obj)).m) == 0)
                    {
                        fzy1.m = fzw1.m;
                    }
                    if (((fzw) (obj)).n == null)
                    {
                        fzy1.n = fzw1.n;
                    }
                    if (((fzw) (obj)).o == null)
                    {
                        fzy1.o = fzw1.o;
                    }
                    if (b.a(((fzw) (obj)).a) == 0.0D)
                    {
                        fzy1.a = fzw1.a;
                    }
                    if (b.a(((fzw) (obj)).b) == 0.0D)
                    {
                        fzy1.b = fzw1.b;
                    }
                    if (TextUtils.isEmpty(((fzw) (obj)).s))
                    {
                        fzy1.r = fzw1.s;
                    }
                    if (TextUtils.isEmpty(((fzw) (obj)).h))
                    {
                        fzy1.h = fzw1.h;
                    }
                    if (TextUtils.isEmpty(((fzw) (obj)).g))
                    {
                        fzy1.g = fzw1.g;
                    }
                    if (b.a(((fzw) (obj)).i) == 0L)
                    {
                        fzy1.i = fzw1.i;
                    }
                    if (b.a(((fzw) (obj)).l, 0.0F) == 0.0F)
                    {
                        fzy1.l = fzw1.l;
                    }
                    if (b.a(((fzw) (obj)).q) == 0L)
                    {
                        fzy1.q = fzw1.q;
                    }
                    obj = fzy1.a();
                }
                a = ((fzw) (obj));
            }
        } while (true);
        return this;
    }
}
