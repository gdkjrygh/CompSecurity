// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.util.LongSparseArray;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class bxj extends bmb
{

    private static final String b = bxj.getSimpleName();
    public final bxm a;
    private final Context e;
    private final ddh f;
    private final dfb g;
    private final ddj h = new ddj();
    private final ddj i = new ddj();
    private final blf j;
    private final Object k = new Object();
    private bxl l;
    private ddg m;

    public bxj(Context context, bmb bmb1, dfb dfb1, File file, ddh ddh1, blf blf1)
    {
        super(bmb1);
        new bxk(this, this, new bxg[] {
            bxg.q
        });
        e = (Context)b.a(context, "context", null);
        g = (dfb)b.a(dfb1, "asyncTaskRunner", null);
        f = (ddh)b.a(ddh1, "httpFetcherFactory", null);
        j = (blf)b.a(blf1, "assetSettings", null);
        a = new bxm((File)b.a(file, "cacheDir", null));
    }

    static Object a(bxj bxj1)
    {
        return bxj1.k;
    }

    static String a(bxj bxj1, long l1)
    {
        bxj1 = String.valueOf(bxj1.j.a());
        return (new StringBuilder(String.valueOf(bxj1).length() + 20)).append(bxj1).append(l1).toString();
    }

    static void a(bxj bxj1, cqf cqf1)
    {
label0:
        {
            bxj1.i.a.clear();
            if (bxj1.l != null)
            {
                bxj1.l.cancel(true);
                bxj1.l = null;
            }
            if (cqf1 != null)
            {
                ArrayList arraylist = new ArrayList();
                cqf1 = Collections.unmodifiableList(cqf1.b).iterator();
                do
                {
                    if (!cqf1.hasNext())
                    {
                        break;
                    }
                    cnq cnq1 = (cnq)cqf1.next();
                    if (cnq1.e.a != null && cnq1.e.a.b != null)
                    {
                        arraylist.add(cnq1.e.a.b);
                    }
                } while (true);
                cqf1 = arraylist.iterator();
                do
                {
                    if (!cqf1.hasNext())
                    {
                        break;
                    }
                    Long long1 = (Long)cqf1.next();
                    if (!bxj1.h.b(long1.longValue()))
                    {
                        bxj1.i.a(long1.longValue());
                    }
                } while (true);
                boolean flag;
                if (bxj1.i.a.size() == 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (flag)
                {
                    break label0;
                }
                bxj1.l = new bxl(bxj1);
                cqf1 = bxj1.g;
                bxl.getSimpleName();
                cqf1.a(bxj1.l, new long[][] {
                    bxj1.i.a()
                });
            }
            return;
        }
        bxj1.c.n(true);
    }

    static String b()
    {
        return b;
    }

    static void b(bxj bxj1)
    {
        bxj1.c();
    }

    static ddj c(bxj bxj1)
    {
        return bxj1.i;
    }

    static ddj d(bxj bxj1)
    {
        return bxj1.h;
    }

    static bww e(bxj bxj1)
    {
        return bxj1.c;
    }

    static bww f(bxj bxj1)
    {
        return bxj1.c;
    }

    static ddg g(bxj bxj1)
    {
        return bxj1.m;
    }

    static bxm h(bxj bxj1)
    {
        return bxj1.a;
    }

    public final void C_()
    {
        if (l != null)
        {
            l.cancel(true);
            l = null;
        }
        super.C_();
    }

    public final void e()
    {
        super.e();
        if (m == null)
        {
            m = f.a(e, j.c());
            c.a(m, "httpFetcher", null);
        }
    }

}
