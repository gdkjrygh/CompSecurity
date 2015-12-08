// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import android.util.Pair;
import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import com.fitbit.data.domain.heartrate.HeartRateDailySummary;
import com.fitbit.data.domain.heartrate.HeartRateExerciseSummary;
import com.fitbit.data.repo.aa;
import com.fitbit.data.repo.ab;
import com.fitbit.data.repo.ac;
import com.fitbit.data.repo.ao;
import com.fitbit.data.repo.ap;
import com.fitbit.data.repo.as;
import com.fitbit.serverinteraction.PublicAPI;
import com.fitbit.serverinteraction.ServerGateway;
import com.fitbit.util.o;
import java.util.Date;
import java.util.List;
import org.json.JSONException;

// Referenced classes of package com.fitbit.data.bl:
//            aq, ao, EntityMerger

public class u
{

    private static u a = null;
    private final aa b = aq.a().E();
    private final ab c = aq.a().F();
    private final ac d = aq.a().G();
    private final as e = aq.a().s();
    private final com.fitbit.data.bl.ao f = new com.fitbit.data.bl.ao();
    private final PublicAPI g = new PublicAPI(ServerGateway.a());

    public u()
    {
    }

    public static u a()
    {
        if (a == null)
        {
            a = new u();
        }
        return a;
    }

    static ac a(u u1)
    {
        return u1.d;
    }

    public HeartRateDailySummary a(Date date)
    {
        date = b.getBetweenDates(o.d(date), o.f(date));
        if (date.size() > 0)
        {
            return (HeartRateDailySummary)date.get(0);
        } else
        {
            return null;
        }
    }

    public List a(Date date, Date date1)
    {
        return b.getBetweenDates(date, date1);
    }

    public void a(ap ap)
    {
        b.addListener(ap);
    }

    public void a(List list, Date date, Date date1)
    {
        (new EntityMerger(list, b, new EntityMerger.g(date, date1) {

            final Date a;
            final Date b;
            final u c;

            public List a(ao ao1)
            {
                return ((aa)ao1).getBetweenDates(a, b);
            }

            
            {
                c = u.this;
                a = date;
                b = date1;
                super();
            }
        })).a(new EntityMerger.b() {

            final u a;

            public boolean a(HeartRateDailySummary heartratedailysummary, HeartRateDailySummary heartratedailysummary1)
            {
                return o.j(heartratedailysummary.a(), heartratedailysummary1.a());
            }

            public volatile boolean a(Object obj, Object obj1)
            {
                return a((HeartRateDailySummary)obj, (HeartRateDailySummary)obj1);
            }

            
            {
                a = u.this;
                super();
            }
        }).b(new EntityMerger.i() {

            final u a;

            public void b(List list1)
            {
            /* block-local class not found */
            class _cls1 {}

                u.a(a).runInTransaction(new _cls1(list1));
            }

            
            {
                a = u.this;
                super();
            }
        }).a(new EntityMerger.e() {

            final u a;

            public HeartRateDailySummary a(HeartRateDailySummary heartratedailysummary, HeartRateDailySummary heartratedailysummary1)
            {
            /* block-local class not found */
            class _cls1 {}

                u.a(a).runInTransaction(new _cls1(heartratedailysummary1, heartratedailysummary));
                return heartratedailysummary1;
            }

            public volatile Object a(Object obj, Object obj1)
            {
                return a((HeartRateDailySummary)obj, (HeartRateDailySummary)obj1);
            }

            
            {
                a = u.this;
                super();
            }
        });
    }

    public HeartRateExerciseSummary b(Date date)
    {
        return c.getForStartTime(date);
    }

    public String b()
    {
        return b.getName();
    }

    public List b(Date date, Date date1)
    {
        return e.getByTypeForTime(com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.HEART_RATE_INTRADAY, date, date1);
    }

    public void b(ap ap)
    {
        b.removeListener(ap);
    }

    public Pair c(Date date, Date date1)
        throws ServerCommunicationException, JSONException
    {
        Object obj = b(date, date1);
        Object obj1 = b(date);
        long l = o.e(date, date1);
        if (obj != null && (long)((List) (obj)).size() >= l && obj1 != null)
        {
            return Pair.create(obj, obj1);
        }
        Object obj2 = g.a(com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.HEART_RATE_INTRADAY, date, date1, com.fitbit.serverinteraction.PublicAPI.DataRange.b);
        obj1 = f.x(((org.json.JSONObject) (obj2)));
        if (((List) (obj1)).isEmpty())
        {
            obj = null;
        } else
        {
            obj = (HeartRateExerciseSummary)((List) (obj1)).get(0);
        }
        obj2 = f.a(((org.json.JSONObject) (obj2)), com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.HEART_RATE_INTRADAY, date);
        if (!((List) (obj2)).isEmpty() && !((List) (obj1)).isEmpty())
        {
            e.deleteByTypeBetweenDates(com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.HEART_RATE_INTRADAY, date, date1);
            e.addAll(((List) (obj2)));
            c.add(((com.fitbit.data.domain.Entity) (obj)));
        }
        return Pair.create(obj2, obj);
    }

}
