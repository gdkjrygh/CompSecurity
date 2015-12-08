// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Handler;
import android.support.v7.widget.RecyclerView;
import com.spotify.mobile.android.porcelain.metrics.PorcelainMetricsLogger;
import com.spotify.mobile.android.spotlets.search.model.SearchResults;
import com.spotify.mobile.android.spotlets.search.model.SectionBackground;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class fhd
{

    public final Runnable a = new fhe(this, (byte)0);
    public final epd b = new fhf(this, (byte)0);
    public final Context c;
    public final Handler d = new Handler();
    final fhg e;
    public final fgu f;
    public final fhc g;
    public final gbr h;
    public fhh i;
    private final Set j = new HashSet();

    public fhd(Context context, fhg fhg1, fgk fgk, drs drs, ffq ffq, fgz fgz, PorcelainMetricsLogger porcelainmetricslogger)
    {
        ctz.a(fgz);
        c = (Context)ctz.a(context);
        e = (fhg)ctz.a(fhg1);
        g = new fhc(context, e, drs, porcelainmetricslogger);
        f = new fgu(context, ffq, e);
        h = new gbr(new fgs(context, fgk, e));
    }

    public final void a()
    {
        if (i != null)
        {
            Iterator iterator = j.iterator();
            while (iterator.hasNext()) 
            {
                abc abc1 = (abc)iterator.next();
                i.b.b(abc1);
            }
        }
    }

    public final void a(SearchResults searchresults)
    {
        if (i != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        a();
        if (searchresults != null)
        {
            fhh fhh1 = i;
            searchresults = searchresults.getSectionBackgrounds();
            int k = searchresults.size() - 1;
            while (k >= 0) 
            {
                Object obj = (SectionBackground)searchresults.get(k);
                obj = new fgr(c, ((SectionBackground) (obj)).getStart(), ((SectionBackground) (obj)).getCount());
                j.add(obj);
                fhh1.b.a(((abc) (obj)), 0);
                k--;
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public final boolean b()
    {
        return i != null && i.a(g);
    }

    public final com.spotify.mobile.android.util.viewuri.ViewUri.SubView c()
    {
        if (i != null)
        {
            if (i.a(g))
            {
                return com.spotify.mobile.android.util.viewuri.ViewUri.SubView.C;
            }
            if (i.a(f))
            {
                fgu fgu1 = f;
                if (fgu1.a(fgu1.c))
                {
                    return com.spotify.mobile.android.util.viewuri.ViewUri.SubView.b;
                }
                fgu1 = f;
                if (fgu1.a(fgu1.b))
                {
                    return com.spotify.mobile.android.util.viewuri.ViewUri.SubView.D;
                }
                fgu1 = f;
                if (fgu1.a(fgu1.a))
                {
                    return com.spotify.mobile.android.util.viewuri.ViewUri.SubView.s;
                }
            } else
            if (i.a(h))
            {
                return com.spotify.mobile.android.util.viewuri.ViewUri.SubView.r;
            }
        }
        return com.spotify.mobile.android.util.viewuri.ViewUri.SubView.a;
    }
}
