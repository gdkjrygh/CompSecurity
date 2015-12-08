// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import android.content.Context;
import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import com.fitbit.data.domain.BodyFat;
import com.fitbit.data.domain.MinutesVeryActive;
import com.fitbit.data.domain.TimeSeriesObject;
import com.fitbit.data.repo.ao;
import com.fitbit.data.repo.ap;
import com.fitbit.data.repo.as;
import com.fitbit.serverinteraction.PublicAPI;
import com.fitbit.serverinteraction.ServerGateway;
import com.fitbit.util.bg;
import com.fitbit.util.o;
import com.fitbit.weight.Fat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;

// Referenced classes of package com.fitbit.data.bl:
//            aq, ao, bv, l, 
//            EntityMerger

public class fs
{
    private static class a
        implements Comparator
    {

        public int a(TimeSeriesObject timeseriesobject, TimeSeriesObject timeseriesobject1)
        {
            return timeseriesobject.a().compareTo(timeseriesobject1.a());
        }

        public int compare(Object obj, Object obj1)
        {
            return a((TimeSeriesObject)obj, (TimeSeriesObject)obj1);
        }

        private a()
        {
        }

    }


    private static fs a = null;
    private final as b = aq.a().r();
    private final as c = aq.a().s();
    private final com.fitbit.data.bl.ao d = new com.fitbit.data.bl.ao();
    private final PublicAPI e = new PublicAPI(ServerGateway.a());

    public fs()
    {
    }

    public static int a(int i, int j, double d1, int k)
    {
        byte byte0;
        byte0 = 3;
        d1 /= 1440D;
        double d2 = k;
        d1 = (double)i / (d1 * d2);
        if (d1 > 1.5D) goto _L2; else goto _L1
_L1:
        i = 0;
_L4:
        return i;
_L2:
        if (d1 <= 3D)
        {
            return 1;
        }
        i = byte0;
        if (d1 >= 6D) goto _L4; else goto _L3
_L3:
        if (d1 < 5D)
        {
            break; /* Loop/switch isn't completed */
        }
        i = byte0;
        if (j >= k * 150) goto _L4; else goto _L5
_L5:
        return 2;
    }

    public static fs a()
    {
        if (a == null)
        {
            a = new fs();
        }
        return a;
    }

    private List a(List list, List list1)
    {
        ArrayList arraylist = new ArrayList();
        for (int i = 0; i < list.size(); i++)
        {
            MinutesVeryActive minutesveryactive = (MinutesVeryActive)list.get(i);
            minutesveryactive.a(minutesveryactive.b() + ((MinutesVeryActive)list1.get(i)).b());
            arraylist.add(minutesveryactive);
        }

        return arraylist;
    }

    private void a(com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType timeseriesresourcetype, Date date, List list, com.fitbit.serverinteraction.PublicAPI.DataRange datarange)
    {
        this;
        JVM INSTR monitorenter ;
        datarange = new ArrayList();
        if (timeseriesresourcetype != com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.CALORIES_INTRADAY)
        {
            break MISSING_BLOCK_LABEL_265;
        }
        timeseriesresourcetype = a(com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.STEPS_INTRADAY, o.d(date), o.f(date));
        Collections.sort(timeseriesresourcetype, new a());
        date = a(com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.FLOORS_INTRADAY, o.d(date), o.f(date));
        Collections.sort(timeseriesresourcetype, new a());
        list = list.iterator();
_L2:
        TimeSeriesObject timeseriesobject;
        int i;
        if (!list.hasNext())
        {
            break MISSING_BLOCK_LABEL_399;
        }
        timeseriesobject = (TimeSeriesObject)list.next();
        i = Collections.binarySearch(timeseriesresourcetype, timeseriesobject, new a());
        if (i < 0)
        {
            break MISSING_BLOCK_LABEL_179;
        }
        if (i < timeseriesresourcetype.size())
        {
            TimeSeriesObject timeseriesobject1 = (TimeSeriesObject)timeseriesresourcetype.get(i);
            if (timeseriesobject1.e() != timeseriesobject.e())
            {
                timeseriesobject1.a(timeseriesobject.e());
                datarange.add(timeseriesobject1);
            }
        }
        i = Collections.binarySearch(date, timeseriesobject, new a());
        if (i < 0) goto _L2; else goto _L1
_L1:
        if (i >= date.size()) goto _L2; else goto _L3
_L3:
        TimeSeriesObject timeseriesobject2 = (TimeSeriesObject)date.get(i);
        if (timeseriesobject2.e() != timeseriesobject.e())
        {
            timeseriesobject2.a(timeseriesobject.e());
            datarange.add(timeseriesobject2);
        }
          goto _L2
        timeseriesresourcetype;
        throw timeseriesresourcetype;
        if (timeseriesresourcetype != com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.STEPS_INTRADAY && timeseriesresourcetype != com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.DISTANCE_INTRADAY && timeseriesresourcetype != com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.MINUTES_VERY_ACTIVE_INTRADAY && timeseriesresourcetype != com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.FLOORS_INTRADAY)
        {
            break MISSING_BLOCK_LABEL_399;
        }
        timeseriesresourcetype = a(com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.CALORIES_INTRADAY, o.d(date), o.f(date));
        Collections.sort(timeseriesresourcetype, new a());
        date = list.iterator();
_L5:
        do
        {
            if (!date.hasNext())
            {
                break MISSING_BLOCK_LABEL_399;
            }
            list = (TimeSeriesObject)date.next();
            i = Collections.binarySearch(timeseriesresourcetype, list, new a());
        } while (i < 0);
        if (i >= timeseriesresourcetype.size()) goto _L5; else goto _L4
_L4:
        list.a(((TimeSeriesObject)timeseriesresourcetype.get(i)).e());
          goto _L5
        b.saveAll(datarange);
        this;
        JVM INSTR monitorexit ;
    }

    private boolean a(com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType timeseriesresourcetype)
    {
        return timeseriesresourcetype == com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.MINUTES_VERY_ACTIVE_INTRADAY || timeseriesresourcetype == com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.MINUTES_VERY_ACTIVE;
    }

    private com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType b(com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType timeseriesresourcetype)
    {
        if (timeseriesresourcetype == com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.MINUTES_VERY_ACTIVE_INTRADAY)
        {
            return com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.MINUTES_FAIRLY_ACTIVE_INTRADAY;
        } else
        {
            return com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.MINUTES_FAIRLY_ACTIVE;
        }
    }

    public BodyFat a(Date date)
    {
        BodyFat bodyfat1 = (BodyFat)a(com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.BODY_FAT, date);
        BodyFat bodyfat = bodyfat1;
        if (bodyfat1 == null)
        {
            bodyfat = (BodyFat)b.getByTypeBeforeDate(com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.BODY_FAT, date);
        }
        bodyfat1 = bodyfat;
        if (bodyfat == null)
        {
            bodyfat1 = (BodyFat)b.getByTypeAfterDate(com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.BODY_FAT, date);
        }
        return bodyfat1;
    }

    public TimeSeriesObject a(com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType timeseriesresourcetype, Date date)
    {
        timeseriesresourcetype = b.getByTypeAndDate(timeseriesresourcetype, date);
        if (timeseriesresourcetype.size() > 0)
        {
            return (TimeSeriesObject)timeseriesresourcetype.get(0);
        } else
        {
            return null;
        }
    }

    public Fat a(BodyFat bodyfat)
    {
        if (bodyfat != null)
        {
            return a(bodyfat.c());
        } else
        {
            return b();
        }
    }

    public Fat a(Fat fat)
    {
        if (fat != null)
        {
            if (fat.b() < 0.0D)
            {
                fat.a(0.0D);
            }
            return fat;
        } else
        {
            return b();
        }
    }

    public List a(com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType timeseriesresourcetype, Date date, com.fitbit.serverinteraction.PublicAPI.DataRange datarange)
        throws ServerCommunicationException, JSONException
    {
        Object obj = e.a(timeseriesresourcetype, date, datarange);
        ArrayList arraylist = new ArrayList();
        bg bg1;
        org.json.JSONObject jsonobject;
        ArrayList arraylist1;
        try
        {
            bg1 = new bg("helper.parseTimeSeries", false);
            arraylist.addAll(d.a(((org.json.JSONObject) (obj)), timeseriesresourcetype, date));
        }
        // Misplaced declaration of an exception variable
        catch (com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType timeseriesresourcetype)
        {
            throw new ServerCommunicationException(timeseriesresourcetype);
        }
        obj = arraylist;
        if (a(timeseriesresourcetype))
        {
            obj = b(timeseriesresourcetype);
            jsonobject = e.a(((com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType) (obj)), date, datarange);
            arraylist1 = new ArrayList();
            arraylist1.addAll(d.a(jsonobject, ((com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType) (obj)), null));
            obj = a(((List) (arraylist)), ((List) (arraylist1)));
        }
        a(timeseriesresourcetype, date, ((List) (obj)), datarange);
        bg1.a(timeseriesresourcetype.toString());
        return ((List) (obj));
    }

    public List a(com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType timeseriesresourcetype, Date date, Date date1)
    {
        if (timeseriesresourcetype.isIntraday())
        {
            return b.getByTypeForTime(timeseriesresourcetype, date, date1);
        } else
        {
            return b.getByType(timeseriesresourcetype, date, date1);
        }
    }

    public List a(com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType timeseriesresourcetype, Date date, Date date1, String s)
        throws ServerCommunicationException
    {
        Object obj = c.getByTypeForTime(timeseriesresourcetype, date, date1);
        if (obj != null && !((List) (obj)).isEmpty())
        {
            return ((List) (obj));
        }
        obj = new ArrayList();
        try
        {
            s = e.b(s);
            bg bg1 = new bg("helper.parseTimeSeries", false);
            ((List) (obj)).addAll(d.a(s, timeseriesresourcetype, date));
            bg1.a(timeseriesresourcetype.toString());
            c.deleteByTypeBetweenDates(timeseriesresourcetype, date, date1);
            c.addAll(((List) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType timeseriesresourcetype)
        {
            throw new ServerCommunicationException(timeseriesresourcetype);
        }
        return ((List) (obj));
    }

    public void a(Context context, SyncDataForLongPeriodOperation.Ranges ranges, boolean flag)
    {
        context.startService(bv.b(context, ranges, flag));
    }

    public void a(TimeSeriesObject timeseriesobject)
    {
        b.save(timeseriesobject);
    }

    public void a(TimeSeriesObject timeseriesobject, Context context)
    {
        TimeSeriesObject timeseriesobject1 = a(timeseriesobject.d(), timeseriesobject.a());
        if (timeseriesobject1 != null)
        {
            timeseriesobject.setEntityId(timeseriesobject1.getEntityId());
        }
        l.a(timeseriesobject, context);
    }

    public void a(ap ap)
    {
        b.addListener(ap);
    }

    public void a(List list, com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType timeseriesresourcetype)
    {
        (new EntityMerger(list, aq.a().r(), new EntityMerger.g(timeseriesresourcetype) {

            final com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType a;
            final fs b;

            public List a(ao ao1)
            {
                return ((as)ao1).getByType(a);
            }

            
            {
                b = fs.this;
                a = timeseriesresourcetype;
                super();
            }
        })).a(new fb.c()).a();
    }

    public boolean a(String s)
    {
        String s1 = b.getName();
        return s1 != null && s1.equals(s);
    }

    public Fat b()
    {
        return new Fat(17D);
    }

    public List b(com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType timeseriesresourcetype, Date date, Date date1)
        throws ServerCommunicationException
    {
        Object obj;
        ArrayList arraylist;
        try
        {
            org.json.JSONObject jsonobject = e.a(timeseriesresourcetype, date, date1);
            arraylist = new ArrayList();
            arraylist.addAll(d.a(jsonobject, timeseriesresourcetype, null));
        }
        // Misplaced declaration of an exception variable
        catch (com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType timeseriesresourcetype)
        {
            throw new ServerCommunicationException(timeseriesresourcetype);
        }
        obj = arraylist;
        if (a(timeseriesresourcetype))
        {
            timeseriesresourcetype = b(timeseriesresourcetype);
            date = e.a(timeseriesresourcetype, date, date1);
            date1 = new ArrayList();
            date1.addAll(d.a(date, timeseriesresourcetype, null));
            obj = a(arraylist, date1);
        }
        return ((List) (obj));
    }

    public void b(ap ap)
    {
        b.removeListener(ap);
    }

    public String c()
    {
        return b.getName();
    }

    public List c(com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType timeseriesresourcetype, Date date, Date date1)
        throws ServerCommunicationException
    {
        Object obj;
        ArrayList arraylist;
        bg bg1;
        ArrayList arraylist1;
        try
        {
            org.json.JSONObject jsonobject = e.a(timeseriesresourcetype, date, date1, com.fitbit.serverinteraction.PublicAPI.DataRange.b);
            arraylist = new ArrayList();
            bg1 = new bg("helper.parseTimeSeries", false);
            arraylist.addAll(d.a(jsonobject, timeseriesresourcetype, date));
        }
        // Misplaced declaration of an exception variable
        catch (com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType timeseriesresourcetype)
        {
            throw new ServerCommunicationException(timeseriesresourcetype);
        }
        obj = arraylist;
        if (a(timeseriesresourcetype))
        {
            obj = b(timeseriesresourcetype);
            date1 = e.a(((com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType) (obj)), date, date1, com.fitbit.serverinteraction.PublicAPI.DataRange.b);
            arraylist1 = new ArrayList();
            arraylist1.addAll(d.a(date1, ((com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType) (obj)), null));
            obj = a(arraylist, arraylist1);
        }
        a(timeseriesresourcetype, date, ((List) (obj)), com.fitbit.serverinteraction.PublicAPI.DataRange.b);
        bg1.a(timeseriesresourcetype.toString());
        return ((List) (obj));
    }

    public List d(com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType timeseriesresourcetype, Date date, Date date1)
        throws ServerCommunicationException
    {
        Object obj = c.getByTypeForTime(timeseriesresourcetype, date, date1);
        if (obj != null && !((List) (obj)).isEmpty())
        {
            return ((List) (obj));
        }
        ArrayList arraylist = new ArrayList();
        bg bg1;
        org.json.JSONObject jsonobject;
        ArrayList arraylist1;
        try
        {
            obj = e.a(timeseriesresourcetype, date, date1, com.fitbit.serverinteraction.PublicAPI.DataRange.b);
            bg1 = new bg("helper.parseTimeSeries", false);
            arraylist.addAll(d.a(((org.json.JSONObject) (obj)), timeseriesresourcetype, date));
        }
        // Misplaced declaration of an exception variable
        catch (com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType timeseriesresourcetype)
        {
            throw new ServerCommunicationException(timeseriesresourcetype);
        }
        obj = arraylist;
        if (a(timeseriesresourcetype))
        {
            obj = b(timeseriesresourcetype);
            jsonobject = e.a(((com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType) (obj)), date, date1, com.fitbit.serverinteraction.PublicAPI.DataRange.b);
            arraylist1 = new ArrayList();
            arraylist1.addAll(d.a(jsonobject, ((com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType) (obj)), null));
            obj = a(arraylist, arraylist1);
        }
        bg1.a(timeseriesresourcetype.toString());
        c.deleteByTypeBetweenDates(timeseriesresourcetype, date, date1);
        c.addAll(((List) (obj)));
        return ((List) (obj));
    }

}
