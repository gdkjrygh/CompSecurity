// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.util.DisplayMetrics;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class btl extends bmb
{

    private static final String a = btl.getSimpleName();
    private final Context b;
    private final ddh e;
    private final dfb f;
    private final Set g = new HashSet();
    private final Set h = new HashSet();
    private final blf i;
    private final File j;
    private final String k;
    private final Object l = new Object();
    private final List m = new ArrayList();
    private ddg n;
    private int o;

    public btl(bmb bmb1, Context context, dfb dfb1, File file, ddh ddh1, blf blf1)
    {
        super(bmb1);
        b = context;
        f = (dfb)b.a(dfb1, "asyncTaskRunner", null);
        j = (File)b.a(file, "cacheDir", null);
        e = (ddh)b.a(ddh1, "httpFetcherFactory", null);
        i = (blf)b.a(blf1, "assetSettings", null);
        k = btm.a(b.getResources().getDisplayMetrics().densityDpi).a;
    }

    static int a(btl btl1)
    {
        return btl1.o;
    }

    static int a(btl btl1, int i1)
    {
        btl1.o = i1;
        return i1;
    }

    static String a(btl btl1, String s)
    {
        return Uri.parse(btl1.i.b()).buildUpon().appendPath(btl1.k).appendPath(s).build().toString();
    }

    static String b()
    {
        return a;
    }

    static Set b(btl btl1)
    {
        return btl1.g;
    }

    static File c(btl btl1)
    {
        return btl1.j;
    }

    static ddg d(btl btl1)
    {
        return btl1.n;
    }

    private void d()
    {
        if (!m.isEmpty())
        {
            for (int i1 = 0; i1 < m.size(); i1++)
            {
                ((btn)m.get(i1)).cancel(true);
            }

            m.clear();
        }
    }

    static Object e(btl btl1)
    {
        return btl1.l;
    }

    public final void C_()
    {
        d();
        super.C_();
    }

    public final void e()
    {
        super.e();
        if (n == null)
        {
            n = e.a(b, i.c());
            c.a(n, "httpFetcher", null);
        }
        c();
        Object obj = btp.a();
        if (g.size() != ((List) (obj)).size())
        {
            h.clear();
            o = 0;
            d();
            obj = ((List) (obj)).iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                btp btp1 = (btp)((Iterator) (obj)).next();
                if (!g.contains(btp1))
                {
                    h.add(btp1);
                }
            } while (true);
            o = h.size();
            if (!h.isEmpty())
            {
                btn btn1;
                for (Iterator iterator = h.iterator(); iterator.hasNext(); m.add(btn1))
                {
                    btp btp2 = (btp)iterator.next();
                    btn1 = new btn(this);
                    dfb dfb1 = f;
                    btn.getSimpleName();
                    dfb1.a(btn1, new btp[] {
                        btp2
                    });
                }

            }
        }
    }

}
