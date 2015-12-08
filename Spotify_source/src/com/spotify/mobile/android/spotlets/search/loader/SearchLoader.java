// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.search.loader;

import android.os.Handler;
import android.os.SystemClock;
import android.util.SparseArray;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.logging.Logger;
import ctz;
import dmz;
import eox;
import epn;
import epo;
import epp;
import eqm;
import eqn;
import esr;
import ffq;
import ffr;
import ffs;
import fft;
import ffu;
import ffv;
import ffw;
import fgc;
import fiy;
import fys;
import geh;
import gkj;

public class SearchLoader
{

    public final Object a;
    public final int b;
    public final int c;
    public final ffq d;
    public final ffr e;
    public final eox f;
    public fgc g;
    ffv h;
    public boolean i;
    private final SparseArray j = new SparseArray();
    private final ffu k;
    private epo l;

    public SearchLoader(ffw ffw, Handler handler, ffq ffq1, int i1, int j1, epn epn1, fgc fgc1, 
            eox eox1, Object obj, ffu ffu1)
    {
        l = epn.c;
        geh.b();
        b = i1;
        c = j1;
        a = ctz.a(obj);
        f = eox1;
        g = (fgc)ctz.a(fgc1);
        k = (ffu)ctz.a(ffu1);
        ctz.a(ffw);
        e = new ffs(handler, new fft() {

            private SearchLoader a;

            public final volatile void a(Object obj1)
            {
                obj1 = (ffv)obj1;
                a.a(((ffv) (obj1)));
            }

            
            {
                a = SearchLoader.this;
                super();
            }
        });
        d = (ffq)ctz.a(ffq1);
        epn1.a(new epp() {

            private SearchLoader a;

            public final boolean a(epo epo1)
            {
                SearchLoader.a(a, epo1);
                if (a.h != null)
                {
                    a.a(a.h);
                }
                return false;
            }

            
            {
                a = SearchLoader.this;
                super();
            }
        });
    }

    static epo a(SearchLoader searchloader, epo epo1)
    {
        searchloader.l = epo1;
        return epo1;
    }

    static void a(SearchLoader searchloader, ffv ffv1)
    {
        searchloader.k.a(ffv1.hashCode(), ffv1.a, ffv1.b);
    }

    static void a(SearchLoader searchloader, ffv ffv1, Object obj)
    {
        searchloader.a(ffv1, obj);
    }

    static boolean a(SearchLoader searchloader)
    {
        return searchloader.i;
    }

    static ffr b(SearchLoader searchloader)
    {
        return searchloader.e;
    }

    static SparseArray c(SearchLoader searchloader)
    {
        return searchloader.j;
    }

    public final void a()
    {
        geh.b();
        for (int i1 = 0; i1 < j.size(); i1++)
        {
            ((eqm)j.valueAt(i1)).c();
        }

        j.clear();
        e.b();
    }

    final void a(ffv ffv1)
    {
        boolean flag = true;
        if (!i) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (!l.d()) goto _L4; else goto _L3
_L3:
        int i1;
        boolean flag1;
        h = null;
        Object obj = l;
        boolean flag2;
        if (i || ffv1.c != d.d())
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 != 0) goto _L1; else goto _L5
_L5:
        ctz.a(((epo) (obj)).d());
        if (ffv1.f != null)
        {
            Assertion.b((new StringBuilder("Request ")).append(ffv1).append("was already started at ").append(ffv1.f).toString());
        }
        ffv1.f = Long.valueOf(SystemClock.uptimeMillis());
        ffv1.g = ((epo) (obj));
        ffv1.a();
        flag1 = esr.a(d.a());
        if (!fiy.a(d.a())) goto _L7; else goto _L6
_L6:
        dmz.a(com/spotify/mobile/android/spotlets/search/loader/SearchLoader, gkj);
        flag2 = gkj.a(d.a());
        if (!"Enabled".equals(d.a().a(fys.K))) goto _L9; else goto _L8
_L8:
        if (flag2)
        {
            if (flag1)
            {
                i1 = 2;
            } else
            {
                i1 = 4;
            }
        } else
        if (flag1)
        {
            i1 = 6;
        } else
        {
            i1 = 5;
        }
_L10:
        ffv1.d = i1;
        obj = f.a(ffv1);
        j.put(ffv1.hashCode(), obj);
        ((eqm) (obj)).a(new eqn(ffv1) {

            private ffv a;
            private SearchLoader b;

            public final void a(Object obj1)
            {
                if (!SearchLoader.a(b))
                {
                    SearchLoader.a(b, a);
                    if (!SearchLoader.b(b).a())
                    {
                        SearchLoader.b(b).b();
                    }
                }
                SearchLoader.c(b).remove(a.hashCode());
                Logger.a("%s failed in %d ms.", new Object[] {
                    a, Long.valueOf(a.c())
                });
            }

            public final void b(Object obj1)
            {
                if (!SearchLoader.a(b))
                {
                    SearchLoader.a(b, a, obj1);
                    if (!SearchLoader.b(b).a())
                    {
                        SearchLoader.b(b).b();
                    }
                }
                SearchLoader.c(b).remove(a.hashCode());
                Logger.a("%s completed in %d ms.", new Object[] {
                    a, Long.valueOf(a.c())
                });
            }

            
            {
                b = SearchLoader.this;
                a = ffv1;
                super();
            }
        });
        return;
_L9:
        i1 = ((flag) ? 1 : 0);
        if (!flag1)
        {
            i1 = 3;
        }
        continue; /* Loop/switch isn't completed */
_L7:
        if (flag1)
        {
            i1 = 0;
        } else
        {
            i1 = -2;
        }
        if (true) goto _L10; else goto _L4
_L4:
        Logger.a("Session not ready. Waiting...", new Object[0]);
        h = ffv1;
        return;
    }

    public final void a(ffv ffv1, Object obj)
    {
        k.a(ffv1.hashCode(), ffv1.a, ffv1.b, obj);
    }

    static 
    {
        dmz.a(com/spotify/mobile/android/spotlets/search/loader/SearchLoader, gkj, new gkj());
    }
}
