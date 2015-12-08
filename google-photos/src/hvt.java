// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import com.google.android.apps.photos.search.peoplelabeling.PeopleLabelingActivity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

final class hvt
    implements dht, hur, hvd, hvf, mti, omb, opn, opv
{

    private final am a;
    private final opd b;
    private final hvw c;
    private final hzc d = new hzc();
    private final hve e = new hve();
    private final hvc f = new hvc();
    private final hzg g;
    private dnq h;
    private hrr i;
    private gjr j;
    private hwd k;
    private hvk l;
    private hpb m;
    private mmr n;
    private ekb o;
    private mtj p;
    private mpk q;
    private hru r;
    private hvq s;
    private List t;

    hvt(am am1, opd opd1, hzg hzg1, hvw hvw1)
    {
        a = am1;
        b = opd1;
        c = hvw1;
        g = hzg1;
        opd1.a(this);
    }

    static void a(hvt hvt1, Intent intent)
    {
        intent = (hrr)intent.getParcelableExtra("com.google.android.apps.photos.search.core.suggestions.autocompletesuggestion");
        ((hsq)olm.a(hvt1.a.G_(), hsq)).a(intent);
        hvt1.e();
    }

    private void e()
    {
        Object obj = r;
        int i1 = n.d();
        mtj.a(((hru) (obj)).a, new hrv(i1));
        obj = g.b;
        ((hzd) (obj)).g.b(hzd.c);
        ((hzd) (obj)).d.clear();
        ((hzd) (obj)).e.addAll(((hzd) (obj)).f.g().keySet());
        ((hzd) (obj)).h.a.b();
        if (s != null)
        {
            hvq hvq1 = s;
            hvq1.c = new LinkedList(Collections.singletonList(null));
            hvq1.a = false;
            hvq1.b = 0L;
        }
    }

    final hvt a(olm olm1)
    {
        olm1.a(hur, this);
        olm1.a(hvf, this);
        olm1.a(hvd, this);
        return this;
    }

    public final void a()
    {
        int i1 = n.d();
        hvi hvi1 = new hvi(m, i1, n.g().b("gaia_id"), o.a(), h.b, h.e, h.a());
        mtj.a(a.G_(), new hvr(i1, h.f, o.a()));
        p.b(new hvj(hvi1));
        g.a.c();
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        n = (mmr)olm1.a(mmr);
        j = (gjr)olm1.a(gjr);
        k = (hwd)olm1.a(hwd);
        l = (hvk)olm1.a(hvk);
        m = (hpb)olm1.a(hpb);
        l.a = this;
        o = (ekb)olm1.a(ekb);
        p = ((mtj)olm1.a(mtj)).a(this);
        q = ((mpk)olm1.a(mpk)).a(bu.i, new hvu(this));
        r = new hru(context);
    }

    final void a(dnq dnq1, hrr hrr1, hvq hvq1)
    {
        h = dnq1;
        i = hrr1;
        s = hvq1;
        if (hrr1 != null && hrr1.a() == hsw.a && hrr1.ar_() == -1L)
        {
            p.a(new hvv(n.d()));
        }
    }

    public final void a(hrr hrr1)
    {
        htw htw1 = new htw(a.G_());
        htw1.c = n.d();
        htw1.b = hrr1;
        htw1.d = t;
        boolean flag;
        if (htw1.b != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.b(flag, "must set clusterSuggestion");
        hrr1 = new Intent(htw1.a, com/google/android/apps/photos/search/peoplelabeling/PeopleLabelingActivity);
        hrr1.putExtra("com.google.android.apps.photos.search.core.suggestions.autocompletesuggestion", htw1.b);
        hrr1.putExtra("account_id", htw1.c);
        if (htw1.d != null)
        {
            hrr1.putParcelableArrayListExtra("com.google.android.apps.photos.search.core.suggestions.preloadedlabels", new ArrayList(htw1.d));
        }
        q.a(bu.i, hrr1);
    }

    public final void a(String s1, mue mue1, mua mua)
    {
        if ("search_results_action_bar_mix_remove_task".equals(s1))
        {
            if (c != null)
            {
                c.a(mue1);
            }
        } else
        {
            if ("com.goog.android.apps.photos.search.peoplelabeling-tag".equals(s1))
            {
                if (mue1 == null || mue1.c())
                {
                    s1 = a.O_();
                    Toast.makeText(s1, s1.getString(c.ey), 1).show();
                    return;
                } else
                {
                    i.a(-1L);
                    ((hsq)olm.a(a.G_(), hsq)).a(i);
                    e();
                    return;
                }
            }
            if ("preloadlabels".equals(s1))
            {
                t = mue1.a().getParcelableArrayList("com.google.android.apps.photos.search.core.suggestions.preloadedlabels");
                return;
            }
            if ("RejectFalsePositivesTask".equals(s1))
            {
                boolean flag;
                if (mue1 == null || mue1.c())
                {
                    s1 = a.G_();
                    Toast.makeText(s1, s1.getString(c.ez), 1).show();
                    flag = false;
                } else
                {
                    e();
                    s1 = mue1.a().getParcelableArrayList("extra_media_list_key");
                    p.a(new hvx(n.d(), h.a(), s1, j, m));
                    if (h.i)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                }
                if (c != null && !flag)
                {
                    c.a(mue1);
                    return;
                }
            }
        }
    }

    final void a(boolean flag)
    {
        d.a = flag;
        boolean flag1 = h.g;
        k.a = flag1 & flag;
    }

    final hvt b(olm olm1)
    {
        (new dhg(a, b, d, bu.l, pwr.v)).a(olm1);
        (new dhg(a, b, e, bu.k, pwy.q)).a(olm1);
        (new dhg(a, b, f, bu.j, pwy.p)).a(olm1);
        return this;
    }

    public final void b()
    {
        i.b("");
        huw huw1 = new huw(n.d(), i, new hse("", ""), r);
        p.b(huw1);
    }

    public final void c()
    {
        hvk hvk1 = l;
        if (hvk1.a == this)
        {
            hvk1.a = null;
        }
    }

    public final hrr d()
    {
        return i;
    }
}
