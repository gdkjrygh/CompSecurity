// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.support.v4.util.ArrayMap;
import android.text.TextUtils;
import com.ubercab.analytics.model.AnalyticsEvent;
import com.ubercab.analytics.model.AnalyticsFragment;
import com.ubercab.analytics.model.AnalyticsLocation;
import com.ubercab.analytics.model.Shape_AnalyticsFragment;
import com.ubercab.analytics.network.AnalyticsApi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingQueue;
import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

public final class chp
    implements cil
{

    private static final gke b = gke.a("lifecycle", "tap");
    boolean a;
    private final AnalyticsApi c;
    private final cht d;
    private final chv e;
    private final gju f;
    private final LinkedBlockingQueue g = new LinkedBlockingQueue();
    private final List h = new CopyOnWriteArrayList();
    private final chu i;
    private final gkd j = gkd.a(200);
    private final cik k;
    private long l;
    private String m;
    private Long n;
    private hoi o;
    private boolean p;
    private boolean q;
    private boolean r;
    private final Callback s = new chq(this, null);

    chp(AnalyticsApi analyticsapi, cht cht1, chu chu, chv chv1, gju gju1, hoi hoi1, cik cik1)
    {
        d = cht1;
        e = chv1;
        c = analyticsapi;
        f = gju1;
        o = hoi1;
        i = chu;
        k = cik1;
        k.a(this);
    }

    static void a(chp chp1, RetrofitError retrofiterror)
    {
        chp1.a(retrofiterror);
    }

    private void a(String s1, cia cia)
    {
        a(AnalyticsEvent.create(s1).setName(cia));
    }

    private void a(Callback callback)
    {
        if (g.isEmpty())
        {
            return;
        } else
        {
            Map map = h();
            c.sendAnalytics(map, callback);
            return;
        }
    }

    private void a(RetrofitError retrofiterror)
    {
        if (a && retrofiterror.getResponse() != null && retrofiterror.getResponse().getStatus() == 400)
        {
            throw new icz("Server rejected analytics events.", retrofiterror);
        } else
        {
            return;
        }
    }

    private Map b(AnalyticsEvent analyticsevent)
    {
        ArrayMap arraymap;
        AnalyticsLocation analyticslocation;
        String s1;
        int i1;
        long l1;
        if (analyticsevent == null)
        {
            i1 = 7;
        } else
        {
            i1 = analyticsevent.getCustomValues().size() + 17;
        }
        arraymap = new ArrayMap(i1);
        l1 = gju.a();
        arraymap.put("epoch_ms", Long.valueOf(l1));
        arraymap.put("session_id", k.b());
        arraymap.put("session_start_time_ms", Long.valueOf(k.c()));
        arraymap.put("foreground_start_time_ms", Long.valueOf(l));
        analyticslocation = AnalyticsLocation.create(i);
        arraymap.put("location", analyticslocation);
        s1 = e.getApplicationKey();
        arraymap.put(s1, e.getPropertiesObject());
        arraymap.put("app_name", s1);
        if (analyticsevent != null)
        {
            analyticsevent.setEpoch(Long.valueOf(l1));
            analyticsevent.setLocation(analyticslocation);
            arraymap.put("name", analyticsevent.getFormattedName());
            arraymap.put("type", analyticsevent.getType());
            arraymap.put("counter", Long.valueOf(d.a()));
            arraymap.put("last_user_action", m);
            arraymap.put("last_user_action_epoch_ms", n);
            arraymap.put("referrer", analyticsevent.getReferrer());
            arraymap.put("url", analyticsevent.getUrl());
            arraymap.put("value", analyticsevent.getValue());
            arraymap.put("value_position", analyticsevent.getValuePosition());
            arraymap.put("treatment_group_id", analyticsevent.getTreatmentGroupId());
            String s2;
            for (Iterator iterator = analyticsevent.getCustomValues().keySet().iterator(); iterator.hasNext(); arraymap.put(s2, analyticsevent.getCustomValues().get(s2)))
            {
                s2 = (String)iterator.next();
                if (arraymap.containsKey(s2) && a)
                {
                    throw new RuntimeException((new StringBuilder("Attempting to add custom event key that already exists in payload: ")).append(s2).toString());
                }
            }

        }
        return arraymap;
    }

    private Map h()
    {
        ArrayMap arraymap = new ArrayMap(1);
        ArrayList arraylist = new ArrayList();
        g.drainTo(arraylist);
        arraymap.put("events", arraylist);
        return arraymap;
    }

    public final List a(int i1)
    {
        int j1 = o.f("com.ubercab.analytics:fragment:");
        String as[];
        ArrayList arraylist;
        if (j1 > i1)
        {
            as = o.a("com.ubercab.analytics:fragment:", j1 - i1, i1);
        } else
        {
            as = o.e("com.ubercab.analytics:fragment:");
        }
        arraylist = new ArrayList(as.length);
        j1 = as.length;
        for (i1 = 0; i1 < j1; i1++)
        {
            String s1 = as[i1];
            arraylist.add(o.a(s1, com/ubercab/analytics/model/Shape_AnalyticsFragment));
        }

        return arraylist;
    }

    public final void a()
    {
        Object obj = new ArrayList();
        String as[] = o.e("com.ubercab.analytics:fragment:");
        int j1 = as.length;
        for (int i1 = 0; i1 < j1; i1++)
        {
            String s1 = as[i1];
            ((List) (obj)).add(o.a(s1, com/ubercab/analytics/model/Shape_AnalyticsFragment));
            o.a(s1);
        }

        if (p)
        {
            obj = TextUtils.join("|", ((Iterable) (obj)));
            ArrayMap arraymap = new ArrayMap(e.getFunnelPropertiesMap().size() + 4);
            arraymap.put("app_name", e.getApplicationKey());
            arraymap.put("event_sequence", obj);
            arraymap.put("epoch_ms", Long.valueOf(System.currentTimeMillis()));
            arraymap.put("session_id", e().b());
            arraymap.putAll(e.getFunnelPropertiesMap());
            if (p)
            {
                c.sendAnalyticsSession(arraymap, s);
            }
        }
    }

    public final void a(long l1)
    {
        l = l1;
    }

    public final void a(chr chr1)
    {
        h.add(chr1);
    }

    public final void a(chs chs)
    {
        a(((Callback) (new chq(this, chs))));
    }

    public final void a(chz chz)
    {
        a("custom", ((cia) (chz)));
    }

    public final void a(cic cic)
    {
        a("impression", ((cia) (cic)));
    }

    public final void a(cif cif)
    {
        a("tap", ((cia) (cif)));
    }

    public final void a(AnalyticsEvent analyticsevent)
    {
        long l1 = d.a();
        Map map = b(analyticsevent);
        d.b();
        if (r)
        {
            j.add(map);
        }
        chr chr1;
        for (Iterator iterator = h.iterator(); iterator.hasNext(); chr1.a(analyticsevent))
        {
            chr1 = (chr)iterator.next();
            chr1.a(analyticsevent.getName(), analyticsevent.getType());
        }

        if (q || p)
        {
            o.a((new StringBuilder("com.ubercab.analytics:fragment:")).append(String.format("%04d", new Object[] {
                Long.valueOf(l1)
            })).toString(), AnalyticsFragment.create(analyticsevent.getFormattedName(), l1));
        }
        g.add(map);
        if (analyticsevent != null && b.contains(analyticsevent.getType()))
        {
            m = analyticsevent.getFormattedName();
            n = (Long)map.get("epoch_ms");
        }
    }

    public final void a(boolean flag)
    {
        r = flag;
    }

    public final void b()
    {
        a = false;
    }

    public final void b(chr chr1)
    {
        h.remove(chr1);
    }

    public final void c()
    {
        p = true;
    }

    public final void d()
    {
        q = true;
    }

    public final cik e()
    {
        return k;
    }

    public final void f()
    {
        a(s);
    }

    public final gkd g()
    {
        return j;
    }

}
