// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import android.content.Context;
import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import com.fitbit.data.domain.BodyFatLogEntry;
import com.fitbit.data.domain.BodyWeight;
import com.fitbit.data.domain.Gender;
import com.fitbit.data.domain.Length;
import com.fitbit.data.domain.LogEntry;
import com.fitbit.data.domain.Profile;
import com.fitbit.data.domain.UnitSystem;
import com.fitbit.data.domain.WeightLogEntry;
import com.fitbit.data.domain.r;
import com.fitbit.data.repo.ap;
import com.fitbit.data.repo.as;
import com.fitbit.data.repo.ax;
import com.fitbit.serverinteraction.PublicAPI;
import com.fitbit.serverinteraction.ServerGateway;
import com.fitbit.util.o;
import com.fitbit.weight.Weight;
import java.util.Date;
import java.util.List;
import org.json.JSONException;

// Referenced classes of package com.fitbit.data.bl:
//            ab, aq, ao, an, 
//            bv, l, f, fs

public class gd
    implements ab
{

    public static Weight a;
    public static Weight b;
    private static gd c;
    private final ax d = aq.a().l();
    private final as e = aq.a().r();
    private final ao f = new ao();
    private final PublicAPI g = new PublicAPI(ServerGateway.a());

    private gd()
    {
    }

    public static double a(double d1, double d2)
    {
        if (d2 == 0.0D)
        {
            return 0.0D;
        } else
        {
            return d1 / (d2 * d2);
        }
    }

    public static gd a()
    {
        com/fitbit/data/bl/gd;
        JVM INSTR monitorenter ;
        gd gd1;
        if (c == null)
        {
            c = new gd();
        }
        gd1 = c;
        com/fitbit/data/bl/gd;
        JVM INSTR monitorexit ;
        return gd1;
        Exception exception;
        exception;
        throw exception;
    }

    static as a(gd gd1)
    {
        return gd1.e;
    }

    private void b(BodyWeight bodyweight)
    {
        e.runInTransaction(new Runnable(bodyweight) {

            final BodyWeight a;
            final gd b;

            public void run()
            {
                BodyWeight bodyweight1 = (BodyWeight)fs.a().a(com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.BODY_WEIGHT, a.a());
                if (bodyweight1 != null)
                {
                    a.setEntityId(bodyweight1.getEntityId());
                }
                if (a.isNew())
                {
                    gd.a(b).add(a);
                    return;
                } else
                {
                    gd.a(b).save(a);
                    return;
                }
            }

            
            {
                b = gd.this;
                a = bodyweight;
                super();
            }
        });
    }

    private UnitSystem f()
    {
        return UnitSystem.getByWeightUnit(r.a());
    }

    public double a(Profile profile, Date date)
    {
        date = a().b();
        double d1;
        if (date != null)
        {
            d1 = date.a(com.fitbit.data.domain.WeightLogEntry.WeightUnits.KG).b();
        } else
        {
            d1 = a().a(profile).a(com.fitbit.data.domain.WeightLogEntry.WeightUnits.KG).b();
        }
        if (profile.Q() == null || profile.Q().b() == 0.0D)
        {
            profile = an.a().c(profile);
        } else
        {
            profile = profile.Q();
        }
        return a(d1, profile.a(com.fitbit.data.domain.Length.LengthUnits.METERS).b());
    }

    public WeightLogEntry a(Date date)
    {
        date = b(date);
        if (date.isEmpty())
        {
            return null;
        } else
        {
            return (WeightLogEntry)date.get(date.size() - 1);
        }
    }

    public Weight a(BodyWeight bodyweight)
    {
        if (bodyweight != null)
        {
            return a(bodyweight.c());
        } else
        {
            return d();
        }
    }

    public Weight a(Profile profile)
    {
        if (profile.J() == Gender.MALE)
        {
            return a;
        } else
        {
            return b;
        }
    }

    public Weight a(Weight weight)
    {
        if (weight != null && weight.b() > 0.001D)
        {
            return weight;
        } else
        {
            return d();
        }
    }

    public Weight a(Date date, Profile profile)
    {
        date = d(date);
        if (date == null || date.c().b() == 0.0D)
        {
            if (profile != null)
            {
                return a(profile);
            } else
            {
                return d();
            }
        } else
        {
            return date.c();
        }
    }

    public List a(Date date, Date date1)
    {
        return d.getWeightLogEntriesBetweenDates(date, date1);
    }

    public void a(Context context, SyncDataForLongPeriodOperation.Ranges ranges, boolean flag)
    {
        context.startService(bv.a(context, ranges, flag));
    }

    public volatile void a(LogEntry logentry, Context context)
    {
        a((WeightLogEntry)logentry, context);
    }

    public void a(WeightLogEntry weightlogentry)
    {
        weightlogentry.setLogDate(o.f(weightlogentry.getLogDate()));
        b(c(weightlogentry));
        WeightLogEntry weightlogentry1 = d.getManualLogEntryForDate(weightlogentry.getLogDate());
        if (weightlogentry1 != null)
        {
            weightlogentry.setEntityId(weightlogentry1.getEntityId());
        }
        l.a(weightlogentry);
    }

    public void a(WeightLogEntry weightlogentry, Context context)
    {
        weightlogentry.setLogDate(o.f(weightlogentry.getLogDate()));
        b(c(weightlogentry));
        WeightLogEntry weightlogentry1 = d.getManualLogEntryForDate(weightlogentry.getLogDate());
        if (weightlogentry1 != null)
        {
            weightlogentry.setEntityId(weightlogentry1.getEntityId());
        }
        l.a(weightlogentry, context);
    }

    public void a(WeightLogEntry weightlogentry, BodyFatLogEntry bodyfatlogentry, Context context)
    {
        com.fitbit.data.bl.f.a().c(bodyfatlogentry);
        a(weightlogentry, context);
    }

    public void a(ap ap)
    {
        d.addListener(ap);
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

    public WeightLogEntry b(WeightLogEntry weightlogentry)
        throws ServerCommunicationException, JSONException
    {
        UnitSystem unitsystem = f();
        weightlogentry = g.a(weightlogentry, unitsystem);
        return f.b(weightlogentry, unitsystem);
    }

    public Weight b()
    {
        BodyWeight bodyweight = d(o.f(new Date()));
        if (bodyweight != null)
        {
            return bodyweight.c();
        } else
        {
            return null;
        }
    }

    public List b(Date date)
    {
        return c(o.d(date), o.f(date));
    }

    public List b(Date date, Date date1)
        throws ServerCommunicationException, JSONException
    {
        UnitSystem unitsystem = f();
        date = g.a(date, date1, unitsystem);
        return f.a(date, unitsystem);
    }

    public void b(ap ap)
    {
        d.removeListener(ap);
    }

    public BodyWeight c(WeightLogEntry weightlogentry)
    {
        BodyWeight bodyweight = new BodyWeight();
        bodyweight.a(weightlogentry.a());
        bodyweight.a(weightlogentry.getLogDate());
        bodyweight.setEntityStatus(com.fitbit.data.domain.Entity.EntityStatus.SYNCED);
        return bodyweight;
    }

    public BodyWeight c(Date date)
    {
        WeightLogEntry weightlogentry = a(date);
        if (weightlogentry != null)
        {
            return c(weightlogentry);
        } else
        {
            return (BodyWeight)fs.a().a(com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.BODY_WEIGHT, date);
        }
    }

    public Weight c()
    {
        Weight weight = b();
        if (weight != null)
        {
            return weight;
        } else
        {
            return d();
        }
    }

    public List c(Date date, Date date1)
    {
        return d.getWeightLogEntriesBetweenDates(date, date1);
    }

    public BodyWeight d(Date date)
    {
        BodyWeight bodyweight = null;
        Object obj = g(date);
        if (obj != null)
        {
            bodyweight = c(((WeightLogEntry) (obj)));
        }
        obj = bodyweight;
        if (bodyweight == null)
        {
            obj = (BodyWeight)e.getByTypeBeforeDate(com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.BODY_WEIGHT, date);
        }
        bodyweight = ((BodyWeight) (obj));
        if (obj == null)
        {
            bodyweight = (BodyWeight)e.getByTypeAfterDate(com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.BODY_WEIGHT, date);
        }
        return bodyweight;
    }

    public Weight d()
    {
        return new Weight(150D, com.fitbit.data.domain.WeightLogEntry.WeightUnits.LBS);
    }

    public Weight e(Date date)
    {
        date = d(date);
        if (date == null || date.c().b() == 0.0D)
        {
            return null;
        } else
        {
            return date.c();
        }
    }

    public List e()
    {
        return d.getPendingEntries();
    }

    public double f(Date date)
    {
        Date date1 = o.a(date);
        date = o.e(date);
        WeightLogEntry weightlogentry = d.getBMIForDateOrBefore(date);
        date = weightlogentry;
        if (weightlogentry == null)
        {
            date = d.getBMIForDateOrAfter(date1);
        }
        if (date == null)
        {
            return -1D;
        } else
        {
            return date.b();
        }
    }

    public WeightLogEntry g(Date date)
    {
        WeightLogEntry weightlogentry = a(date);
        Object obj = weightlogentry;
        if (weightlogentry == null)
        {
            obj = weightlogentry;
            if (date != null)
            {
                WeightLogEntry weightlogentry1 = d.getFirstWeightLogEntry();
                obj = weightlogentry;
                if (weightlogentry1 != null)
                {
                    Date date1 = date;
                    date = weightlogentry;
                    do
                    {
                        obj = date;
                        if (date != null)
                        {
                            break;
                        }
                        date1 = o.a(date1, -1, 6);
                        if (date1.compareTo(weightlogentry1.getLogDate()) > 0)
                        {
                            date = a(date1);
                        } else
                        {
                            date = weightlogentry1;
                        }
                    } while (true);
                }
            }
        }
        return ((WeightLogEntry) (obj));
    }

    static 
    {
        a = new WeightBusinessLogic._cls1(78.698276199999995D, com.fitbit.data.domain.WeightLogEntry.WeightUnits.KG);
        b = new WeightBusinessLogic._cls2(62.595747099999997D, com.fitbit.data.domain.WeightLogEntry.WeightUnits.KG);
    }

    // Unreferenced inner class com/fitbit/data/bl/WeightBusinessLogic$1

/* anonymous class */
    static final class WeightBusinessLogic._cls1 extends Weight
    {

            
            {
                a(true);
            }
    }


    // Unreferenced inner class com/fitbit/data/bl/WeightBusinessLogic$2

/* anonymous class */
    static final class WeightBusinessLogic._cls2 extends Weight
    {

            
            {
                a(true);
            }
    }

}
