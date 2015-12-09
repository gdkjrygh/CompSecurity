// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import com.fitbit.data.domain.TimeSeriesObject;
import com.fitbit.data.domain.device.DeviceFeature;
import com.fitbit.e.a;
import com.fitbit.util.format.e;
import com.fitbit.util.o;
import com.fitbit.util.p;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONException;

// Referenced classes of package com.fitbit.data.bl:
//            e, dg, ez, fs, 
//            EntityMerger, aq, bs

public class fb extends com.fitbit.data.bl.e
{
    public static class c
        implements EntityMerger.b
    {

        public boolean a(TimeSeriesObject timeseriesobject, TimeSeriesObject timeseriesobject1)
        {
            return o.j(timeseriesobject.a(), timeseriesobject1.a());
        }

        public volatile boolean a(Object obj, Object obj1)
        {
            return a((TimeSeriesObject)obj, (TimeSeriesObject)obj1);
        }

        public c()
        {
        }
    }


    private static final String a = "SyncTimeSeriesObjectsOperation";
    private static final String f = "SyncTimeSeriesObjectsOperation";
    protected Date b;
    protected Date d;
    protected List e;
    private final com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType g;
    private String h;

    public fb(bs bs1, com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType timeseriesresourcetype, Date date, Date date1, boolean flag)
    {
        super(bs1, flag);
        g = timeseriesresourcetype;
        d = date1;
        b = date;
    /* block-local class not found */
    class b {}

        h = (new b(timeseriesresourcetype, date, date1)).d();
    }

    public fb(bs bs1, com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType timeseriesresourcetype, boolean flag)
    {
        super(bs1, flag);
        g = timeseriesresourcetype;
        d = o.e(new Date());
        b = o.a(o.a(d, -14, 6));
        h = (new b(timeseriesresourcetype, b, d)).d();
    }

    private a a(Set set, String s)
    {
        long l = 0L;
        Object obj1 = null;
        Object obj = null;
        b b2 = com.fitbit.data.bl.b.a(s);
        s = obj1;
        long l1 = l;
        if (b2 != null)
        {
            Iterator iterator = set.iterator();
            set = obj;
            do
            {
                s = set;
                l1 = l;
                if (!iterator.hasNext())
                {
                    break;
                }
                Object obj2 = (java.util.Map.Entry)iterator.next();
                s = (String)((java.util.Map.Entry) (obj2)).getKey();
                b b1 = com.fitbit.data.bl.b.a(s);
                if (b1 != null && b1.a(b2))
                {
                    obj2 = (Long)((java.util.Map.Entry) (obj2)).getValue();
                    if (obj2 != null)
                    {
                        com.fitbit.e.a.a("SyncTimeSeriesObjectsOperation", "Found SyncTimeSeriesObjectsOperation that includes current operation: %s. Last operation time = %s", new Object[] {
                            s, com.fitbit.util.format.e.g(new Date(((Long) (obj2)).longValue()))
                        });
                        if (((Long) (obj2)).longValue() > l)
                        {
                            l = ((Long) (obj2)).longValue();
                            set = b1.d();
                        }
                    }
                }
            } while (true);
        }
    /* block-local class not found */
    class a {}

        return new a(s, l1);
    }

    public static void a(com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType timeseriesresourcetype)
    {
        dg.d().c().e((new StringBuilder()).append("SyncTimeSeriesObjectsOperation-").append(timeseriesresourcetype).toString());
    }

    protected void a(h.a a1)
        throws ServerCommunicationException, JSONException
    {
        if ((g == com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.AWAKENINGS_COUNT || g == com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.MINUTES_ASLEEP) && !p.a(DeviceFeature.SLEEP))
        {
            return;
        } else
        {
            a1 = com.fitbit.data.bl.fs.a().b(g, b, d);
            a(((List) (a1)), g);
            e = a1;
            return;
        }
    }

    public void a(List list, com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType timeseriesresourcetype)
    {
        (new EntityMerger(list, com.fitbit.data.bl.aq.a().r(), new _cls1(timeseriesresourcetype))).a(new c()).a();
    }

    public String c()
    {
        return h;
    }

    public Date d()
    {
        return b;
    }

    protected boolean g()
    {
        boolean flag1 = false;
        Object obj = e().c();
        a a1 = a(((ez) (obj)).b(), c());
        long l = a1.b();
        long l1 = ((ez) (obj)).a(a1.a());
        long l2 = System.currentTimeMillis() - l;
        boolean flag;
        if (l2 >= 0L && l2 < l1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj = c();
        if (!flag)
        {
            flag1 = true;
        }
        com.fitbit.e.a.a("SyncTimeSeriesObjectsOperation", "Should perform operation :%s: %s. Last operation time = %s, throttle: %s", new Object[] {
            obj, Boolean.valueOf(flag1), com.fitbit.util.format.e.g(new Date(l)), Long.valueOf(l1)
        });
        return flag;
    }

    protected void h()
    {
        super.h();
    }

    /* member class not found */
    class _cls1 {}

}
