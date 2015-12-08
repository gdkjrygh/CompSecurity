// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import android.content.Context;
import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import com.fitbit.data.domain.SleepLogEntry;
import com.fitbit.data.domain.u;
import com.fitbit.data.repo.ao;
import com.fitbit.data.repo.ap;
import com.fitbit.data.repo.aq;
import com.fitbit.serverinteraction.PublicAPI;
import com.fitbit.serverinteraction.ServerGateway;
import com.fitbit.util.o;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.json.JSONException;

// Referenced classes of package com.fitbit.data.bl:
//            aq, ao, l, EntityMerger

public class ay
{

    private static ay a;
    private final aq b = aq.a().y();
    private final PublicAPI c = new PublicAPI(ServerGateway.a());

    private ay()
    {
    }

    public static ay a()
    {
        com/fitbit/data/bl/ay;
        JVM INSTR monitorenter ;
        ay ay1;
        if (a == null)
        {
            a = new ay();
        }
        ay1 = a;
        com/fitbit/data/bl/ay;
        JVM INSTR monitorexit ;
        return ay1;
        Exception exception;
        exception;
        throw exception;
    }

    public SleepLogEntry a(Long long1)
    {
        return (SleepLogEntry)b.getById(long1.longValue());
    }

    public SleepLogEntry a(UUID uuid)
    {
        return (SleepLogEntry)b.getByUUID(uuid);
    }

    public u a(Date date)
        throws ServerCommunicationException, JSONException
    {
        org.json.JSONObject jsonobject = c.c(null, date);
        date = new u(date);
        date.initFromPublicApiJsonObject(jsonobject);
        return date;
    }

    public List a(int i, int j)
    {
        return b(o.e(new Date()), i, j);
    }

    public List a(Date date, int i, int j)
        throws ServerCommunicationException, JSONException
    {
        date = c.b(null, i, j, date);
        return (new com.fitbit.data.bl.ao()).m(date);
    }

    public void a(SleepLogEntry sleeplogentry, Context context)
    {
        sleeplogentry.setLogDate(o.d(sleeplogentry.getLogDate()));
        l.a(sleeplogentry, context);
    }

    public void a(ap ap)
    {
        b.addListener(ap);
    }

    public void a(List list, Context context)
    {
        l.a(list, context);
    }

    public void a(List list, Date date)
    {
        (new EntityMerger(list, b, new EntityMerger.g(date) {

            final Date a;
            final ay b;

            public List a(ao ao1)
            {
                return ((aq)ao1).getByDate(a, new com.fitbit.data.domain.Entity.EntityStatus[0]);
            }

            
            {
                b = ay.this;
                a = date;
                super();
            }
        })).a(new EntityMerger.e() {

            final ay a;

            public SleepLogEntry a(SleepLogEntry sleeplogentry, SleepLogEntry sleeplogentry1)
            {
                sleeplogentry1.setEntityId(sleeplogentry.getEntityId());
                return sleeplogentry1;
            }

            public volatile Object a(Object obj, Object obj1)
            {
                return a((SleepLogEntry)obj, (SleepLogEntry)obj1);
            }

            
            {
                a = ay.this;
                super();
            }
        });
    }

    public void a(List list, Date date, int i, int j)
    {
        (new EntityMerger(list, b, new EntityMerger.g(date, i, j) {

            final Date a;
            final int b;
            final int c;
            final ay d;

            public List a(ao ao1)
            {
                return d.b(a, b, c);
            }

            
            {
                d = ay.this;
                a = date;
                b = i;
                c = j;
                super();
            }
        })).a(new EntityMerger.b() {

            final ay a;

            public boolean a(SleepLogEntry sleeplogentry, SleepLogEntry sleeplogentry1)
            {
                return sleeplogentry.a().equals(sleeplogentry1.a());
            }

            public volatile boolean a(Object obj, Object obj1)
            {
                return a((SleepLogEntry)obj, (SleepLogEntry)obj1);
            }

            
            {
                a = ay.this;
                super();
            }
        }).a(new EntityMerger.e() {

            final ay a;

            public SleepLogEntry a(SleepLogEntry sleeplogentry, SleepLogEntry sleeplogentry1)
            {
                sleeplogentry1.setEntityId(sleeplogentry.getEntityId());
                return sleeplogentry1;
            }

            public volatile Object a(Object obj, Object obj1)
            {
                return a((SleepLogEntry)obj, (SleepLogEntry)obj1);
            }

            
            {
                a = ay.this;
                super();
            }
        });
    }

    public boolean a(SleepLogEntry sleeplogentry)
    {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(sleeplogentry.a());
        calendar.add(14, sleeplogentry.e());
        Object obj = Calendar.getInstance();
        ((Calendar) (obj)).setTime(sleeplogentry.getLogDate());
        ((Calendar) (obj)).add(6, -1);
        Calendar calendar1 = Calendar.getInstance();
        calendar1.setTime(sleeplogentry.getLogDate());
        calendar1.add(6, 1);
        for (obj = b.getSleepLogEntriesBetweenDates(((Calendar) (obj)).getTime(), calendar1.getTime()).iterator(); ((Iterator) (obj)).hasNext();)
        {
            SleepLogEntry sleeplogentry1 = (SleepLogEntry)((Iterator) (obj)).next();
            if (sleeplogentry1.getEntityStatus() != com.fitbit.data.domain.Entity.EntityStatus.PENDING_DELETE)
            {
                boolean flag;
                if (sleeplogentry1.getUuid().equals(sleeplogentry.getUuid()) || sleeplogentry1.getServerId() == sleeplogentry.getServerId())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (!flag)
                {
                    Calendar calendar2 = Calendar.getInstance();
                    calendar2.setTime(sleeplogentry1.a());
                    calendar2.add(14, sleeplogentry1.e());
                    if (Math.max(sleeplogentry.a().getTime(), sleeplogentry1.a().getTime()) < Math.min(calendar2.getTimeInMillis(), calendar.getTimeInMillis()))
                    {
                        return false;
                    }
                }
            }
        }

        return true;
    }

    public boolean a(String s)
    {
        String s1 = b.getName();
        return s1 != null && s1.equals(s);
    }

    public List b(Date date)
    {
        return b.getByDate(date, new com.fitbit.data.domain.Entity.EntityStatus[] {
            com.fitbit.data.domain.Entity.EntityStatus.PENDING_DELETE
        });
    }

    public List b(Date date, int i, int j)
    {
        return b.getSleepLogEntities(date, i, j);
    }

    public void b(ap ap)
    {
        b.removeListener(ap);
    }
}
