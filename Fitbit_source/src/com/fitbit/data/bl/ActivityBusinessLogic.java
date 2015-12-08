// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Pair;
import com.fasterxml.jackson.core.JsonParser;
import com.fitbit.activity.ActivityLogInfo;
import com.fitbit.config.BuildType;
import com.fitbit.data.bl.exceptions.JsonException;
import com.fitbit.data.bl.exceptions.SearchEntityException;
import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import com.fitbit.data.domain.ActivityItem;
import com.fitbit.data.domain.ActivityLevel;
import com.fitbit.data.domain.ActivityLogEntry;
import com.fitbit.data.domain.ActivitySummaryItem;
import com.fitbit.data.domain.CaloriesBurned;
import com.fitbit.data.domain.CaloriesBurnedGoal;
import com.fitbit.data.domain.CaloriesEatenGoal;
import com.fitbit.data.domain.DistanceGoal;
import com.fitbit.data.domain.Entity;
import com.fitbit.data.domain.FloorsGoal;
import com.fitbit.data.domain.Gender;
import com.fitbit.data.domain.Length;
import com.fitbit.data.domain.LogEntry;
import com.fitbit.data.domain.Profile;
import com.fitbit.data.domain.StepsGoal;
import com.fitbit.data.domain.ValueGoal;
import com.fitbit.data.repo.ah;
import com.fitbit.data.repo.ao;
import com.fitbit.data.repo.ap;
import com.fitbit.data.repo.as;
import com.fitbit.data.repo.b;
import com.fitbit.data.repo.c;
import com.fitbit.data.repo.d;
import com.fitbit.data.repo.greendao.DaoFactory;
import com.fitbit.data.repo.greendao.exercise.DaoSession;
import com.fitbit.data.repo.z;
import com.fitbit.e.a;
import com.fitbit.livedata.LiveDataPacket;
import com.fitbit.savedstate.l;
import com.fitbit.serverinteraction.PublicAPI;
import com.fitbit.serverinteraction.ServerGateway;
import com.fitbit.serverinteraction.r;
import com.fitbit.util.format.e;
import com.fitbit.util.o;
import com.fitbit.weight.Weight;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.fitbit.data.bl:
//            ab, aq, dg, EntityMerger, 
//            l, gd, an, dm, 
//            t, fs

public class ActivityBusinessLogic
    implements ab
{
    public static class Request extends com.fitbit.serverinteraction.PublicAPI.b
        implements Parcelable
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public Request a(Parcel parcel)
            {
                int i1 = parcel.readInt();
                int j1 = parcel.readInt();
                boolean flag = parcel.createBooleanArray()[0];
                Date date = new Date(parcel.readLong());
                return new Request((Request)parcel.readParcelable(getClass().getClassLoader()), date, j1, i1, flag);
            }

            public Request[] a(int i1)
            {
                return new Request[i1];
            }

            public Object createFromParcel(Parcel parcel)
            {
                return a(parcel);
            }

            public Object[] newArray(int i1)
            {
                return a(i1);
            }

        };
        public final boolean a;

        public Request a()
        {
            return a(false);
        }

        public Request a(Date date)
        {
            return new Request(null, date, 0, d, true);
        }

        public Request a(boolean flag)
        {
            Date date = c;
            int i1 = b;
            return new Request(this, date, d + i1, d, flag);
        }

        public com.fitbit.serverinteraction.PublicAPI.b b()
        {
            return a();
        }

        public int describeContents()
        {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i1)
        {
            parcel.writeInt(d);
            parcel.writeInt(b);
            parcel.writeBooleanArray(new boolean[] {
                a
            });
            long l1;
            if (c != null)
            {
                l1 = c.getTime();
            } else
            {
                l1 = 0L;
            }
            parcel.writeLong(l1);
            parcel.writeParcelable((Request)e, i1);
        }


        public Request(Request request, Date date, int i1, int j1, boolean flag)
        {
            super(request, date, i1, j1, null);
            a = flag;
        }

        public Request(Date date, int i1, int j1)
        {
            this(null, date, i1, j1, true);
        }

        public Request(Date date, int i1, int j1, Integer integer)
        {
            super(null, date, i1, j1, integer);
            a = true;
        }
    }

    public static class a extends Pair
    {

        public final com.fitbit.data.domain.a.b a;

        public a(ActivitySummaryItem activitysummaryitem, List list, com.fitbit.data.domain.a.b b1)
        {
            super(activitysummaryitem, list);
            a = b1;
        }
    }


    public static final String a = com/fitbit/data/bl/ActivityBusinessLogic.getSimpleName();
    public static final int b = 20;
    public static final int c = -1;
    private static ActivityBusinessLogic d;
    private final b e;
    private final c f;
    private final d g;
    private final com.fitbit.data.repo.e h;
    private final ah i;
    private final PublicAPI j = new PublicAPI(ServerGateway.a());
    private final r k = new r(ServerGateway.a());
    private EntityMerger.c l;

    private ActivityBusinessLogic()
    {
        l = new EntityMerger.c() {

            final ActivityBusinessLogic a;

            public ActivityLogEntry a(ActivityLogEntry activitylogentry, ActivityLogEntry activitylogentry1)
            {
                ActivityLogEntry activitylogentry2;
                activitylogentry2 = (ActivityLogEntry)super.a(activitylogentry, activitylogentry1);
                activitylogentry2.setUuid(activitylogentry.getUuid());
                long l1;
                if (activitylogentry1.p() != null)
                {
                    activitylogentry2.a(activitylogentry1.p());
                } else
                {
                    activitylogentry2.a(activitylogentry.p());
                }
                if (!activitylogentry1.f() || activitylogentry1.v() == null)
                {
                    break MISSING_BLOCK_LABEL_98;
                }
                activitylogentry1 = new Date(activitylogentry1.v().a());
                if (activitylogentry.v() == null)
                {
                    l1 = 0L;
                } else
                {
                    l1 = activitylogentry.v().a();
                }
                if (!activitylogentry1.after(new Date(l1)))
                {
                    break MISSING_BLOCK_LABEL_98;
                }
                a.a(activitylogentry2);
                return activitylogentry2;
                activitylogentry;
                com.fitbit.e.a.f(com.fitbit.data.bl.ActivityBusinessLogic.a, "Could not refresh details from server", activitylogentry, new Object[0]);
                return activitylogentry2;
                activitylogentry;
_L2:
                com.fitbit.e.a.f(com.fitbit.data.bl.ActivityBusinessLogic.a, "Could not parse server response", activitylogentry, new Object[0]);
                return activitylogentry2;
                activitylogentry;
                if (true) goto _L2; else goto _L1
_L1:
            }

            public volatile Entity a(Entity entity, Entity entity1)
            {
                return a((ActivityLogEntry)entity, (ActivityLogEntry)entity1);
            }

            public volatile Object a(Object obj, Object obj1)
            {
                return a((ActivityLogEntry)obj, (ActivityLogEntry)obj1);
            }

            
            {
                a = ActivityBusinessLogic.this;
                super();
            }
        };
        aq aq1 = com.fitbit.data.bl.aq.a();
        e = aq1.b();
        f = aq1.c();
        g = aq1.d();
        h = aq1.m();
        i = aq1.v();
    }

    public static double a(double d1, double d2, double d3, Gender gender)
    {
        int i1;
        if (gender == Gender.MALE)
        {
            i1 = 5;
        } else
        {
            i1 = -161;
        }
        return Math.floor(((double)i1 + ((9.9900000000000002D * d1 + 6.25D * d2) - 4.9199999999999999D * d3)) * 100D + 0.5D) / 100D;
    }

    public static ActivityBusinessLogic a()
    {
        com/fitbit/data/bl/ActivityBusinessLogic;
        JVM INSTR monitorenter ;
        ActivityBusinessLogic activitybusinesslogic;
        if (d == null)
        {
            d = new ActivityBusinessLogic();
        }
        activitybusinesslogic = d;
        com/fitbit/data/bl/ActivityBusinessLogic;
        JVM INSTR monitorexit ;
        return activitybusinesslogic;
        Exception exception;
        exception;
        throw exception;
    }

    private ActivityLogEntry a(Date date, JSONObject jsonobject)
        throws JSONException, ServerCommunicationException
    {
        ActivityLogEntry activitylogentry = new ActivityLogEntry();
        Calendar calendar = Calendar.getInstance();
        if (!jsonobject.isNull("startTime"))
        {
            calendar.setTime(com.fitbit.util.format.e.d(jsonobject.getString("startTime")));
            activitylogentry.setLogDate(o.a(calendar.getTime()));
        } else
        {
            activitylogentry.setLogDate(date);
        }
        activitylogentry.initFromPublicApiJsonObject(jsonobject);
        if (activitylogentry.a() != null && activitylogentry.a().getServerId() != -1L)
        {
            date = (ActivityItem)e.getByServerId(activitylogentry.a().getServerId());
        } else
        {
            date = null;
        }
        jsonobject = date;
        if (date == null)
        {
            jsonobject = com.fitbit.data.bl.dg.d().b(activitylogentry.m(), null);
        }
        if (jsonobject != null)
        {
            activitylogentry.a(jsonobject);
        }
        return activitylogentry;
    }

    static d a(ActivityBusinessLogic activitybusinesslogic)
    {
        return activitybusinesslogic.g;
    }

    private List a(Date date, JSONArray jsonarray)
        throws JSONException, ServerCommunicationException
    {
        ArrayList arraylist = new ArrayList();
        for (int i1 = 0; i1 < jsonarray.length(); i1++)
        {
            arraylist.add(a(date, jsonarray.getJSONObject(i1)));
        }

        return arraylist;
    }

    private void a(ActivityLogEntry activitylogentry, ActivityLogEntry activitylogentry1)
    {
        if (!ServerGateway.a().d())
        {
            com.fitbit.data.bl.aq.a().k().runInTransaction(new Runnable(activitylogentry1, activitylogentry) {

                final ActivityLogEntry a;
                final ActivityLogEntry b;
                final ActivityBusinessLogic c;

                public void run()
                {
                    Object obj;
                    t t1 = com.fitbit.data.bl.t.a();
                    LiveDataPacket livedatapacket = com.fitbit.savedstate.l.h();
                    if (livedatapacket == null)
                    {
                        livedatapacket = new LiveDataPacket();
                        livedatapacket.a(t1.e(a.getLogDate()).c().intValue());
                        livedatapacket.a(t1.f(a.getLogDate()).c().intValue());
                    }
                    obj = t1.a(a.getLogDate());
                    if (obj != null)
                    {
                        int j1 = c.b(a);
                        CaloriesBurned caloriesburned = (CaloriesBurned)com.fitbit.data.bl.fs.a().a(com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.CALORIES, o.e(a.getLogDate()));
                        if (a.getEntityStatus() == com.fitbit.data.domain.Entity.EntityStatus.PENDING_DELETE)
                        {
                            if (caloriesburned != null)
                            {
                                caloriesburned.a(Double.valueOf(caloriesburned.c().doubleValue() - (double)j1));
                            }
                            ((CaloriesBurnedGoal) (obj)).a(Double.valueOf(((CaloriesBurnedGoal) (obj)).q().doubleValue() - (double)j1));
                        } else
                        if (a.getEntityStatus() == com.fitbit.data.domain.Entity.EntityStatus.PENDING_OPERATION)
                        {
                            int i1;
                            if (b == null)
                            {
                                i1 = 0;
                            } else
                            {
                                i1 = c.b(b);
                            }
                            if (caloriesburned != null)
                            {
                                caloriesburned.a(Double.valueOf(caloriesburned.c().doubleValue() - (double)i1));
                                caloriesburned.a(Double.valueOf(caloriesburned.c().doubleValue() + (double)j1));
                            }
                            ((CaloriesBurnedGoal) (obj)).a(Double.valueOf(((CaloriesBurnedGoal) (obj)).q().doubleValue() - (double)i1));
                            ((CaloriesBurnedGoal) (obj)).a(Double.valueOf(((CaloriesBurnedGoal) (obj)).q().doubleValue() + (double)j1));
                        } else
                        {
                            throw new IllegalArgumentException("Unsupported entity status for goal update");
                        }
                        ((CaloriesBurnedGoal) (obj)).setTimeUpdated(new Date());
                        livedatapacket.b(((CaloriesBurnedGoal) (obj)).c().intValue());
                        t1.a(((com.fitbit.data.domain.Goal) (obj)));
                        if (caloriesburned != null)
                        {
                            com.fitbit.data.bl.fs.a().a(caloriesburned);
                        }
                    }
                    obj = t1.b(a.getLogDate());
                    if (obj != null)
                    {
                        if (a.getEntityStatus() == com.fitbit.data.domain.Entity.EntityStatus.PENDING_DELETE)
                        {
                            ((CaloriesEatenGoal) (obj)).b(Double.valueOf(Math.max(0.0D, ValueGoal.a(((ValueGoal) (obj))) - (double)a.i())));
                        } else
                        if (a.getEntityStatus() == com.fitbit.data.domain.Entity.EntityStatus.PENDING_OPERATION)
                        {
                            if (b != null)
                            {
                                ((CaloriesEatenGoal) (obj)).b(Double.valueOf(ValueGoal.a(((ValueGoal) (obj))) - (double)b.i()));
                            }
                            ((CaloriesEatenGoal) (obj)).b(Double.valueOf(Math.max(0.0D, ValueGoal.a(((ValueGoal) (obj))) + (double)a.i())));
                        } else
                        {
                            throw new IllegalArgumentException("Unsupported entity status for goal update");
                        }
                        ((CaloriesEatenGoal) (obj)).setTimeUpdated(new Date());
                        t1.a(((com.fitbit.data.domain.Goal) (obj)));
                    }
                    obj = t1.c(a.getLogDate());
                    if (obj == null) goto _L2; else goto _L1
_L1:
                    if (a.getEntityStatus() != com.fitbit.data.domain.Entity.EntityStatus.PENDING_DELETE) goto _L4; else goto _L3
_L3:
                    if (a.b() != null)
                    {
                        ((DistanceGoal) (obj)).a(Double.valueOf(Math.max(0.0D, ((DistanceGoal) (obj)).q().doubleValue() - a.b().a(com.fitbit.data.domain.Length.LengthUnits.KM).b())));
                    }
_L6:
                    ((DistanceGoal) (obj)).setTimeUpdated(new Date());
                    livedatapacket.b(((DistanceGoal) (obj)).c().doubleValue() * 1000000D);
                    t1.a(((com.fitbit.data.domain.Goal) (obj)));
_L2:
                    com.fitbit.savedstate.l.a(livedatapacket);
                    return;
_L4:
                    if (a.getEntityStatus() != com.fitbit.data.domain.Entity.EntityStatus.PENDING_OPERATION)
                    {
                        break; /* Loop/switch isn't completed */
                    }
                    if (b != null && b.b() != null)
                    {
                        ((DistanceGoal) (obj)).a(Double.valueOf(((DistanceGoal) (obj)).q().doubleValue() - b.b().a(com.fitbit.data.domain.Length.LengthUnits.KM).b()));
                    }
                    if (a.b() != null)
                    {
                        ((DistanceGoal) (obj)).a(Double.valueOf(Math.max(0.0D, ((DistanceGoal) (obj)).q().doubleValue() + a.b().a(com.fitbit.data.domain.Length.LengthUnits.KM).b())));
                    }
                    if (true) goto _L6; else goto _L5
_L5:
                    throw new IllegalArgumentException("Unsupported entity status for goal update");
                }

            
            {
                c = ActivityBusinessLogic.this;
                a = activitylogentry;
                b = activitylogentry1;
                super();
            }
            });
        }
    }

    private void b(List list)
    {
        (new EntityMerger(list, g, new EntityMerger.g(list) {

            final List a;
            final ActivityBusinessLogic b;

            public List a(ao ao1)
            {
                ArrayList arraylist = new ArrayList(a.size());
                for (Iterator iterator = a.iterator(); iterator.hasNext(); arraylist.add(Long.valueOf(((ActivityLogEntry)iterator.next()).getServerId()))) { }
                return ao1.getByServerId(arraylist);
            }

            
            {
                b = ActivityBusinessLogic.this;
                a = list;
                super();
            }
        })).a(l);
    }

    private void b(List list, Context context)
    {
        com.fitbit.data.bl.l.b(list, context);
        for (list = list.iterator(); list.hasNext(); e(context))
        {
            context = (ActivityLogEntry)list.next();
            c(context);
            a(((ActivityLogEntry) (null)), context);
        }

    }

    private void e(ActivityLogEntry activitylogentry)
    {
        Date date = activitylogentry.e();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(14, activitylogentry.a(TimeUnit.MILLISECONDS));
        activitylogentry = calendar.getTime();
        com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType atimeseriesresourcetype[] = com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.values();
        int j1 = atimeseriesresourcetype.length;
        for (int i1 = 0; i1 < j1; i1++)
        {
            com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType timeseriesresourcetype = atimeseriesresourcetype[i1];
            com.fitbit.data.bl.aq.a().s().deleteByTypeBetweenDates(timeseriesresourcetype, date, activitylogentry);
        }

    }

    public double a(Profile profile, Date date)
    {
        if (profile == null)
        {
            return 0.0D;
        }
        Object obj = com.fitbit.data.bl.gd.a().a(date, profile);
        double d2 = com.fitbit.data.bl.gd.a().a(((Weight) (obj))).a(com.fitbit.data.domain.WeightLogEntry.WeightUnits.KG).b();
        double d1 = d2;
        if (d2 <= 0.0D)
        {
            d1 = com.fitbit.data.bl.gd.a().a(profile).a(com.fitbit.data.domain.WeightLogEntry.WeightUnits.KG).b();
        }
        if (profile.Q() == null || profile.Q().a(com.fitbit.data.domain.Length.LengthUnits.CM).b() <= 61D)
        {
            obj = com.fitbit.data.bl.an.a().c(profile);
        } else
        {
            obj = profile.Q();
        }
        return a(d1, ((Length) (obj)).a(com.fitbit.data.domain.Length.LengthUnits.CM).b(), profile.b(date), profile.J());
    }

    public int a(Profile profile, Date date, Date date1)
    {
        if (date.after(date1))
        {
            return 0;
        } else
        {
            return Math.round(((float)(date1.getTime() - date.getTime()) / 1000F / 60F) * ((float)a(profile, date) / 1440F));
        }
    }

    public ActivityItem a(long l1)
    {
        ActivityLevel activitylevel = (ActivityLevel)f.getByServerId(l1);
        if (activitylevel != null)
        {
            return activitylevel.a();
        } else
        {
            return (ActivityItem)e.getByServerId(l1);
        }
    }

    public ActivityItem a(ActivityItem activityitem)
    {
        if (activityitem.getEntityId() == null) goto _L2; else goto _L1
_L1:
        ActivityItem activityitem1 = (ActivityItem)e.getById(activityitem.getEntityId().longValue());
        if (activityitem1 == null) goto _L2; else goto _L3
_L3:
        return activityitem1;
_L2:
        ActivityItem activityitem2;
        if (activityitem.getServerId() == -1L)
        {
            break; /* Loop/switch isn't completed */
        }
        activityitem2 = (ActivityItem)e.getByServerId(activityitem.getServerId());
        activityitem1 = activityitem2;
        if (activityitem2 != null) goto _L3; else goto _L4
_L4:
        e.add(activityitem);
        return activityitem;
    }

    public ActivityLogEntry a(ActivityLogEntry activitylogentry)
        throws ServerCommunicationException, JSONException, IOException
    {
        JsonParser jsonparser;
        com.fitbit.runtrack.data.b b1;
        b1 = new com.fitbit.runtrack.data.b();
        jsonparser = j.a(activitylogentry);
        DaoFactory.getInstance().getExerciseSession().runInTx(new Runnable(activitylogentry, b1, jsonparser) {

            final ActivityLogEntry a;
            final com.fitbit.runtrack.data.b b;
            final JsonParser c;
            final ActivityBusinessLogic d;

            public void run()
            {
                Object obj;
                if (a.p() != null)
                {
                    com.fitbit.runtrack.data.ExerciseSession exercisesession = b.a(UUID.fromString(a.p().a()));
                    b.h(exercisesession);
                }
                obj = com.fitbit.data.a.a.a(c, a.a().getServerId(), a.p());
                a.a(((com.fitbit.data.domain.b) (obj)));
                obj = ((com.fitbit.runtrack.data.a) (obj)).c();
                if (obj == null)
                {
                    break MISSING_BLOCK_LABEL_92;
                }
                b.g(((com.fitbit.runtrack.data.ExerciseSession) (obj)));
                return;
                Object obj1;
                obj1;
_L2:
                com.fitbit.e.a.f(com.fitbit.data.bl.ActivityBusinessLogic.a, "Could not parse out a date from the activity details", ((Throwable) (obj1)), new Object[0]);
                return;
                obj1;
                if (true) goto _L2; else goto _L1
_L1:
            }

            
            {
                d = ActivityBusinessLogic.this;
                a = activitylogentry;
                b = b1;
                c = jsonparser;
                super();
            }
        });
        jsonparser.close();
        return activitylogentry;
        activitylogentry;
        jsonparser.close();
        throw activitylogentry;
    }

    public ActivityLogEntry a(UUID uuid)
    {
        return (ActivityLogEntry)g.getByUUID(uuid);
    }

    public List a(int i1)
    {
        return i.getRecentActivities(i1);
    }

    public List a(Request request)
        throws ServerCommunicationException
    {
label0:
        {
            if (request.a)
            {
                try
                {
                    Object obj = j.a(request);
                    if (com.fitbit.config.b.a.a())
                    {
                        com.fitbit.e.a.a(getClass().getSimpleName(), String.format("Fetched Activities and response was %s", new Object[] {
                            obj
                        }), new Object[0]);
                    }
                    obj = ((JSONObject) (obj)).getJSONArray("activities");
                    com.fitbit.e.a.a(getClass().getSimpleName(), String.format("Looking up Activities %s", new Object[] {
                        obj
                    }), new Object[0]);
                    request = a(a(request.c, ((JSONArray) (obj))));
                    obj = request.iterator();
                    do
                    {
                        if (!((Iterator) (obj)).hasNext())
                        {
                            break;
                        }
                        if (((ActivityLogEntry)((Iterator) (obj)).next()).getEntityStatus() == com.fitbit.data.domain.Entity.EntityStatus.PENDING_DELETE)
                        {
                            ((Iterator) (obj)).remove();
                        }
                    } while (true);
                    break label0;
                }
                // Misplaced declaration of an exception variable
                catch (Request request)
                {
                    com.fitbit.e.a.f(a, String.format("Looking up Activities %s", new Object[] {
                        request
                    }), request, new Object[0]);
                }
            }
            return Collections.emptyList();
        }
        request = Collections.unmodifiableList(request);
        com.fitbit.e.a.d(a, String.format("Loaded %s activity logs via the site", new Object[] {
            Integer.valueOf(request.size())
        }), new Object[0]);
        return request;
    }

    public List a(String s)
        throws ServerCommunicationException, JSONException, SearchEntityException
    {
        Object obj = com.fitbit.data.bl.an.a().b();
        r r1 = k;
        long l1;
        if (obj == null)
        {
            l1 = -1L;
        } else
        {
            l1 = ((Profile) (obj)).I();
        }
        s = r1.b(s, l1).getJSONObject("result").getJSONArray("activities");
        obj = new ArrayList();
        for (int i1 = 0; i1 < s.length(); i1++)
        {
            JSONObject jsonobject = s.getJSONObject(i1);
            ActivityItem activityitem = new ActivityItem();
            activityitem.a(jsonobject);
            ((List) (obj)).add(activityitem);
        }

        return ((List) (obj));
    }

    public List a(Date date)
    {
        return g.getByDate(date, new com.fitbit.data.domain.Entity.EntityStatus[] {
            com.fitbit.data.domain.Entity.EntityStatus.PENDING_DELETE
        });
    }

    public List a(List list)
    {
        com.fitbit.data.bl.aq.a().b().runInTransaction(new Runnable(list) {

            final List a;
            final ActivityBusinessLogic b;

            public void run()
            {
                com.fitbit.data.bl.dm.c(a);
            }

            
            {
                b = ActivityBusinessLogic.this;
                a = list;
                super();
            }
        });
        d d1 = com.fitbit.data.bl.aq.a().d();
        (new EntityMerger(list, d1, new EntityMerger.g(list) {

            final List a;
            final ActivityBusinessLogic b;

            public List a(ao ao1)
            {
                ArrayList arraylist1 = new ArrayList(a.size());
                for (Iterator iterator = a.iterator(); iterator.hasNext(); arraylist1.add(Long.valueOf(((ActivityLogEntry)iterator.next()).getServerId()))) { }
                return ao1.getByServerId(arraylist1);
            }

            
            {
                b = ActivityBusinessLogic.this;
                a = list;
                super();
            }
        })).a(l);
        ArrayList arraylist = new ArrayList(list.size());
        for (list = list.iterator(); list.hasNext(); arraylist.add(Long.valueOf(((ActivityLogEntry)list.next()).getServerId()))) { }
        return d1.getByServerId(arraylist);
    }

    public void a(ActivityLogEntry activitylogentry, Context context)
    {
        ActivityLogEntry activitylogentry1 = null;
        if (!activitylogentry.isNew())
        {
            activitylogentry1 = (ActivityLogEntry)g.getById(activitylogentry.getEntityId().longValue());
        }
        com.fitbit.data.bl.l.a(activitylogentry, context);
        c(activitylogentry);
        a(activitylogentry1, activitylogentry);
    }

    public volatile void a(LogEntry logentry, Context context)
    {
        a((ActivityLogEntry)logentry, context);
    }

    public void a(ap ap)
    {
        i.addListener(ap);
    }

    public void a(Date date, ActivityLogEntry activitylogentry)
    {
        if (activitylogentry == null || activitylogentry.isNew() || activitylogentry.o())
        {
            return;
        }
        activitylogentry.setLogDate(date);
        activitylogentry.c(-1);
        int i1 = activitylogentry.i();
        if (activitylogentry.n() != i1 && i1 != 0)
        {
            activitylogentry.c(activitylogentry.n());
        }
        if (i1 != 0)
        {
            activitylogentry.b(true);
        }
        g.save(activitylogentry);
    }

    public void a(List list, Context context)
    {
        com.fitbit.data.bl.l.a(list, context);
        for (list = list.iterator(); list.hasNext(); e(context))
        {
            context = (ActivityLogEntry)list.next();
            c(context);
            a(((ActivityLogEntry) (null)), ((ActivityLogEntry) (context)));
        }

    }

    public int b(ActivityLogEntry activitylogentry)
    {
        Profile profile = com.fitbit.data.bl.an.a().b();
        if (profile == null)
        {
            return activitylogentry.i();
        } else
        {
            GregorianCalendar gregoriancalendar = new GregorianCalendar();
            Date date = new Date(activitylogentry.d().a());
            gregoriancalendar.setTime(date);
            gregoriancalendar.add(13, activitylogentry.a(TimeUnit.SECONDS));
            int i1 = a(profile, date, gregoriancalendar.getTime());
            return activitylogentry.i() - i1;
        }
    }

    public a b(Date date)
        throws ServerCommunicationException
    {
        com.fitbit.data.domain.a.b b1;
        ActivitySummaryItem activitysummaryitem;
        Object obj;
        obj = j.a(null, date);
        activitysummaryitem = new ActivitySummaryItem();
        activitysummaryitem.initFromPublicApiJsonObject(((JSONObject) (obj)));
        if (!((JSONObject) (obj)).has("goals"))
        {
            break MISSING_BLOCK_LABEL_179;
        }
        b1 = new com.fitbit.data.domain.a.b();
        b1.initFromPublicApiJsonObject(((JSONObject) (obj)));
_L5:
        date = a(date, ((JSONObject) (obj)).getJSONArray("activities"));
        b(((List) (date)));
        date = Collections.unmodifiableList(date);
        obj = date.iterator();
_L4:
        if (!((Iterator) (obj)).hasNext()) goto _L2; else goto _L1
_L1:
        ActivityLogEntry activitylogentry = (ActivityLogEntry)((Iterator) (obj)).next();
        if (!activitylogentry.f() || activitylogentry.p() != null) goto _L4; else goto _L3
_L3:
        a(activitylogentry);
          goto _L4
        Exception exception;
        exception;
        try
        {
            com.fitbit.e.a.f(a, "Error refreshing details.", exception, new Object[0]);
            activitylogentry.a(false);
        }
        // Misplaced declaration of an exception variable
        catch (Date date)
        {
            throw new ServerCommunicationException(date);
        }
          goto _L4
_L2:
        date = new a(activitysummaryitem, date, b1);
        return date;
        b1 = null;
          goto _L5
    }

    public ActivityItem b(long l1)
        throws ServerCommunicationException
    {
        ActivityItem activityitem;
        try
        {
            JSONObject jsonobject = j.s(String.valueOf(l1));
            activityitem = new ActivityItem();
            activityitem.initFromPublicApiJsonObject(jsonobject);
            activityitem.b(true);
        }
        catch (JSONException jsonexception)
        {
            throw new JsonException(jsonexception);
        }
        return activityitem;
    }

    public List b()
    {
        return e.getAll();
    }

    public List b(int i1)
    {
        return i.getOftenActivities(i1);
    }

    public List b(Request request)
        throws ServerCommunicationException
    {
        List list = a(request);
        (new EntityMerger(list, g, new EntityMerger.g(request) {

            final Request a;
            final ActivityBusinessLogic b;

            public List a(ao ao)
            {
                return com.fitbit.data.bl.ActivityBusinessLogic.a(b).getOlderThan(a.c, a.b, a.d, a.f, new com.fitbit.data.domain.Entity.EntityStatus[] {
                    com.fitbit.data.domain.Entity.EntityStatus.PENDING_DELETE
                });
            }

            
            {
                b = ActivityBusinessLogic.this;
                a = request;
                super();
            }
        })).b(new EntityMerger.i() {

            final ActivityBusinessLogic a;

            public List a(List list1)
            {
                ArrayList arraylist = new ArrayList();
                list1 = list1.iterator();
                do
                {
                    if (!list1.hasNext())
                    {
                        break;
                    }
                    ActivityLogEntry activitylogentry = (ActivityLogEntry)list1.next();
                    if ((ActivityLogEntry)com.fitbit.data.bl.ActivityBusinessLogic.a(a).getByServerId(activitylogentry.getServerId()) == null)
                    {
                        arraylist.add(activitylogentry);
                    }
                } while (true);
                return arraylist;
            }

            
            {
                a = ActivityBusinessLogic.this;
                super();
            }
        }).a(l);
        return list;
    }

    public void b(ap ap)
    {
        i.removeListener(ap);
    }

    public ActivityLogEntry c(long l1)
    {
        return (ActivityLogEntry)g.getById(l1);
    }

    public List c()
    {
        return g.getAll();
    }

    public List c(Request request)
    {
        return g.getOlderThan(request.c, request.b, request.d, request.f, new com.fitbit.data.domain.Entity.EntityStatus[] {
            com.fitbit.data.domain.Entity.EntityStatus.PENDING_DELETE
        });
    }

    public void c(ActivityLogEntry activitylogentry)
    {
        if (activitylogentry.getEntityStatus() == com.fitbit.data.domain.Entity.EntityStatus.PENDING_DELETE)
        {
            return;
        }
        Object obj = new ArrayList();
        ((List) (obj)).add(Long.valueOf(activitylogentry.a().getServerId()));
        for (Iterator iterator = activitylogentry.a().d().iterator(); iterator.hasNext(); ((List) (obj)).add(Long.valueOf(((ActivityLevel)iterator.next()).getServerId()))) { }
        ActivityLogInfo activityloginfo = i.getByServerId(((List) (obj)), com.fitbit.activity.ActivityLogInfo.Group.a);
        obj = activityloginfo;
        if (activityloginfo == null)
        {
            obj = new ActivityLogInfo();
        }
        ((ActivityLogInfo) (obj)).a(activitylogentry.m());
        ((ActivityLogInfo) (obj)).b(activitylogentry.i());
        ((ActivityLogInfo) (obj)).a(new Date());
        if (activitylogentry.b() != null)
        {
            ((ActivityLogInfo) (obj)).a(activitylogentry.b().a(com.fitbit.data.domain.Length.LengthUnits.KM).b());
        }
        ((ActivityLogInfo) (obj)).a(activitylogentry.a(TimeUnit.SECONDS));
        ((ActivityLogInfo) (obj)).a(activitylogentry.a().a());
        ((ActivityLogInfo) (obj)).a(com.fitbit.activity.ActivityLogInfo.Group.a);
        if (((ActivityLogInfo) (obj)).isNew())
        {
            i.add(((Entity) (obj)));
            return;
        } else
        {
            i.save(((Entity) (obj)));
            return;
        }
    }

    public ActivityLogEntry d(long l1)
    {
        return g.getLastActivityLogEntry(l1);
    }

    public ActivityLogEntry d(ActivityLogEntry activitylogentry)
        throws ServerCommunicationException
    {
        ActivityLogEntry activitylogentry1 = a(activitylogentry.getUuid());
        try
        {
            Object obj = j.a(activitylogentry1, activitylogentry).getJSONObject("activityLog");
            obj = a(activitylogentry.getLogDate(), ((JSONObject) (obj)));
            ((ActivityLogEntry) (obj)).a(activitylogentry.a());
            ((ActivityLogEntry) (obj)).setUuid(activitylogentry.getUuid());
            ((ActivityLogEntry) (obj)).setEntityId(activitylogentry1.getEntityId());
            g.save(((Entity) (obj)));
            e(activitylogentry1);
        }
        // Misplaced declaration of an exception variable
        catch (ActivityLogEntry activitylogentry)
        {
            throw new ServerCommunicationException(activitylogentry);
        }
        return activitylogentry;
    }

    public List d()
    {
        return a(-1);
    }

    public List e()
    {
        return a(20);
    }

    public List f()
    {
        return b(-1);
    }

    public List g()
    {
        return b(20);
    }

    public List h()
        throws ServerCommunicationException
    {
        Object obj;
        obj = new ArrayList();
        Date date = new Date();
        JSONArray jsonarray;
        JSONObject jsonobject;
        ActivityLogInfo activityloginfo;
        int i1;
        try
        {
            jsonarray = j.b();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new ServerCommunicationException(((Throwable) (obj)));
        }
        i1 = 0;
        if (i1 >= jsonarray.length())
        {
            break; /* Loop/switch isn't completed */
        }
        jsonobject = jsonarray.getJSONObject(i1);
        activityloginfo = new ActivityLogInfo();
        activityloginfo.a(com.fitbit.activity.ActivityLogInfo.Group.a);
        activityloginfo.a(jsonobject);
        activityloginfo.a(date);
        ((List) (obj)).add(activityloginfo);
        i1++;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_27;
_L1:
        return ((List) (obj));
    }

    public List i()
        throws ServerCommunicationException
    {
        Object obj;
        obj = new ArrayList();
        JSONArray jsonarray;
        JSONObject jsonobject;
        ActivityLogInfo activityloginfo;
        int i1;
        try
        {
            jsonarray = j.c();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new ServerCommunicationException(((Throwable) (obj)));
        }
        i1 = 0;
        if (i1 >= jsonarray.length())
        {
            break; /* Loop/switch isn't completed */
        }
        jsonobject = jsonarray.getJSONObject(i1);
        activityloginfo = new ActivityLogInfo();
        activityloginfo.a(com.fitbit.activity.ActivityLogInfo.Group.b);
        activityloginfo.a(jsonobject);
        ((List) (obj)).add(activityloginfo);
        i1++;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_19;
_L1:
        return ((List) (obj));
    }

}
