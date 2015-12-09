// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import android.content.Context;
import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import com.fitbit.data.domain.BodyFat;
import com.fitbit.data.domain.BodyFatLogEntry;
import com.fitbit.data.domain.LogEntry;
import com.fitbit.data.repo.ap;
import com.fitbit.data.repo.as;
import com.fitbit.data.repo.i;
import com.fitbit.serverinteraction.PublicAPI;
import com.fitbit.serverinteraction.ServerGateway;
import com.fitbit.util.o;
import com.fitbit.weight.Fat;
import com.fitbit.weight.Weight;
import java.util.Date;
import java.util.List;
import org.json.JSONException;

// Referenced classes of package com.fitbit.data.bl:
//            ab, aq, ao, l, 
//            fs

public class f
    implements ab
{

    public static Weight a;
    public static Weight b;
    private static f c;
    private final i d = aq.a().n();
    private final ao e = new ao();
    private final PublicAPI f = new PublicAPI(ServerGateway.a());
    private final as g = aq.a().r();

    private f()
    {
    }

    public static f a()
    {
        com/fitbit/data/bl/f;
        JVM INSTR monitorenter ;
        f f1;
        if (c == null)
        {
            c = new f();
        }
        f1 = c;
        com/fitbit/data/bl/f;
        JVM INSTR monitorexit ;
        return f1;
        Exception exception;
        exception;
        throw exception;
    }

    static as a(f f1)
    {
        return f1.g;
    }

    private void a(BodyFat bodyfat)
    {
        g.runInTransaction(new _cls1(bodyfat));
    }

    public BodyFat a(BodyFatLogEntry bodyfatlogentry)
    {
        BodyFat bodyfat = new BodyFat();
        bodyfat.a(bodyfatlogentry.a());
        bodyfat.a(bodyfatlogentry.getLogDate());
        bodyfat.setEntityStatus(com.fitbit.data.domain.Entity.EntityStatus.SYNCED);
        return bodyfat;
    }

    public BodyFatLogEntry a(Date date)
    {
        Date date1 = o.d(date);
        date = o.f(date);
        date = d.getBodyFatsBetweenDates(date1, date);
        if (date != null && date.size() > 0)
        {
            return (BodyFatLogEntry)date.get(0);
        } else
        {
            return null;
        }
    }

    public List a(Date date, Date date1)
    {
        return d.getBodyFatsBetweenDates(date, date1);
    }

    public void a(BodyFatLogEntry bodyfatlogentry, Context context)
    {
        b(bodyfatlogentry);
        l.a(context);
    }

    public volatile void a(LogEntry logentry, Context context)
    {
        a((BodyFatLogEntry)logentry, context);
    }

    public void a(ap ap)
    {
        d.addListener(ap);
    }

    public void a(Runnable runnable)
    {
        d.runInTransaction(runnable);
    }

    public void a(List list, Context context)
    {
        throw new UnsupportedOperationException();
    }

    public boolean a(String s)
    {
        String s1 = d.getName();
        return s1 != null && s1.equals(s);
    }

    public BodyFatLogEntry b(Date date)
    {
        return d.getBodyFatEntryForDateExactly(date);
    }

    public List b(Date date, Date date1)
        throws ServerCommunicationException, JSONException
    {
        date = f.a(date, date1);
        return e.a(date);
    }

    public void b(BodyFatLogEntry bodyfatlogentry)
    {
        a(a(bodyfatlogentry));
        BodyFatLogEntry bodyfatlogentry1 = a(bodyfatlogentry.getLogDate());
        if (bodyfatlogentry1 != null)
        {
            bodyfatlogentry.setEntityId(bodyfatlogentry1.getEntityId());
        }
        l.a(bodyfatlogentry, d);
    }

    public void b(BodyFatLogEntry bodyfatlogentry, Context context)
    {
        c(bodyfatlogentry);
        l.a(context);
    }

    public void b(ap ap)
    {
        d.removeListener(ap);
    }

    public BodyFatLogEntry c(Date date)
    {
        BodyFatLogEntry bodyfatlogentry = a(date);
        Object obj = bodyfatlogentry;
        if (bodyfatlogentry == null)
        {
            obj = bodyfatlogentry;
            if (date != null)
            {
                BodyFatLogEntry bodyfatlogentry1 = d.getFirstBodyFatEntry();
                obj = bodyfatlogentry;
                if (bodyfatlogentry1 != null)
                {
                    Date date1 = date;
                    date = bodyfatlogentry;
                    do
                    {
                        obj = date;
                        if (date != null)
                        {
                            break;
                        }
                        date1 = o.a(date1, -1, 6);
                        if (date1.compareTo(bodyfatlogentry1.getLogDate()) > 0)
                        {
                            date = a(date1);
                        } else
                        {
                            date = bodyfatlogentry1;
                        }
                    } while (true);
                }
            }
        }
        return ((BodyFatLogEntry) (obj));
    }

    public void c(BodyFatLogEntry bodyfatlogentry)
    {
        bodyfatlogentry.setLogDate(o.f(bodyfatlogentry.getLogDate()));
        BodyFatLogEntry bodyfatlogentry1 = b(bodyfatlogentry.getLogDate());
        if (bodyfatlogentry1 != null)
        {
            bodyfatlogentry.setEntityId(bodyfatlogentry1.getEntityId());
        }
        l.a(bodyfatlogentry, d);
    }

    public Fat d(Date date)
    {
        BodyFatLogEntry bodyfatlogentry = c(date);
        Object obj = null;
        if (bodyfatlogentry != null)
        {
            date = bodyfatlogentry.a();
        } else
        {
            BodyFat bodyfat = fs.a().a(date);
            date = obj;
            if (bodyfat != null)
            {
                return bodyfat.c();
            }
        }
        return date;
    }

    static 
    {
        a = new BodyFatBusinessLogic._cls1(78.698276199999995D, com.fitbit.data.domain.WeightLogEntry.WeightUnits.KG);
        b = new BodyFatBusinessLogic._cls2(62.595747099999997D, com.fitbit.data.domain.WeightLogEntry.WeightUnits.KG);
    }

    /* member class not found */
    class _cls1 {}

}
