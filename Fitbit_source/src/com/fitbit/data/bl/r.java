// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import android.content.Context;
import android.util.Pair;
import com.fitbit.config.BuildType;
import com.fitbit.data.bl.exceptions.SearchEntityException;
import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import com.fitbit.data.domain.Brand;
import com.fitbit.data.domain.CaloriesEatenGoal;
import com.fitbit.data.domain.FavoriteFoodItem;
import com.fitbit.data.domain.FoodItem;
import com.fitbit.data.domain.FoodLocale;
import com.fitbit.data.domain.FoodLogEntry;
import com.fitbit.data.domain.FoodMeasurementUnit;
import com.fitbit.data.domain.FoodRelation;
import com.fitbit.data.domain.LogEntry;
import com.fitbit.data.domain.Meal;
import com.fitbit.data.domain.Operation;
import com.fitbit.data.domain.Profile;
import com.fitbit.data.domain.h;
import com.fitbit.data.domain.i;
import com.fitbit.data.repo.af;
import com.fitbit.data.repo.aj;
import com.fitbit.data.repo.ap;
import com.fitbit.data.repo.f;
import com.fitbit.data.repo.s;
import com.fitbit.data.repo.t;
import com.fitbit.data.repo.u;
import com.fitbit.data.repo.v;
import com.fitbit.data.repo.w;
import com.fitbit.data.repo.x;
import com.fitbit.data.repo.z;
import com.fitbit.e.a;
import com.fitbit.serverinteraction.PublicAPI;
import com.fitbit.serverinteraction.ServerGateway;
import com.fitbit.util.d.b;
import com.fitbit.util.d.c;
import com.fitbit.util.o;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.fitbit.data.bl:
//            ab, aq, ao, l, 
//            t, an

public class r
    implements ab
{

    public static final int a = 20;
    private static final String b = "FoodBusinessLogic";
    private static r c;
    private final v d;
    private final t e;
    private final x f;
    private final w g;
    private final s h;
    private final af i;
    private final u j;
    private final f k;
    private final PublicAPI l = new PublicAPI(ServerGateway.a());
    private final com.fitbit.serverinteraction.r m = new com.fitbit.serverinteraction.r(ServerGateway.a());

    private r()
    {
        aq aq1 = com.fitbit.data.bl.aq.a();
        d = aq1.e();
        e = aq1.f();
        g = aq1.g();
        h = aq1.q();
        i = aq1.o();
        j = aq1.H();
        k = aq1.J();
        f = aq1.K();
    }

    public static r a()
    {
        com/fitbit/data/bl/r;
        JVM INSTR monitorenter ;
        r r1;
        if (c == null)
        {
            c = new r();
        }
        r1 = c;
        com/fitbit/data/bl/r;
        JVM INSTR monitorexit ;
        return r1;
        Exception exception;
        exception;
        throw exception;
    }

    private List a(JSONObject jsonobject)
        throws JSONException
    {
        jsonobject = jsonobject.getJSONArray("foods");
        ArrayList arraylist = new ArrayList();
        for (int i1 = 0; i1 < jsonobject.length(); i1++)
        {
            JSONObject jsonobject1 = jsonobject.getJSONObject(i1);
            FoodItem fooditem = new FoodItem();
            fooditem.initFromPublicApiJsonObject(jsonobject1);
            arraylist.add(fooditem);
        }

        return arraylist;
    }

    private void a(FoodLogEntry foodlogentry, FoodLogEntry foodlogentry1)
    {
        com.fitbit.data.bl.aq.a().k().runInTransaction(new Runnable(foodlogentry1, foodlogentry) {

            final FoodLogEntry a;
            final FoodLogEntry b;
            final r c;

            public void run()
            {
                CaloriesEatenGoal calorieseatengoal = com.fitbit.data.bl.t.a().b(a.getLogDate());
                if (calorieseatengoal != null)
                {
                    if (a.getEntityStatus() == com.fitbit.data.domain.Entity.EntityStatus.PENDING_DELETE)
                    {
                        calorieseatengoal.a(Double.valueOf(Math.max(0.0D, calorieseatengoal.q().doubleValue() - a.getCalories())));
                    } else
                    if (a.getEntityStatus() == com.fitbit.data.domain.Entity.EntityStatus.PENDING_OPERATION)
                    {
                        if (b != null)
                        {
                            calorieseatengoal.a(Double.valueOf(calorieseatengoal.q().doubleValue() - b.getCalories()));
                        }
                        calorieseatengoal.a(Double.valueOf(Math.max(0.0D, calorieseatengoal.q().doubleValue() + a.getCalories())));
                    } else
                    {
                        throw new IllegalArgumentException("Unsupported entity status for goal update");
                    }
                    calorieseatengoal.setTimeUpdated(new Date());
                    com.fitbit.data.bl.t.a().a(calorieseatengoal);
                }
            }

            
            {
                c = r.this;
                a = foodlogentry;
                b = foodlogentry1;
                super();
            }
        });
    }

    private boolean a(b b1)
    {
        return b1.a(new Object[] {
            r()
        });
    }

    private FoodLogEntry b(FoodLogEntry foodlogentry)
    {
        if (foodlogentry.getEntityId() != null)
        {
            return (FoodLogEntry)d.getById(foodlogentry.getEntityId().longValue());
        } else
        {
            return null;
        }
    }

    private List b(List list)
    {
        ArrayList arraylist = new ArrayList(list.size());
        for (list = list.iterator(); list.hasNext(); arraylist.add(((FavoriteFoodItem)list.next()).getFoodItem())) { }
        return arraylist;
    }

    private FavoriteFoodItem c(FoodItem fooditem)
    {
        if (fooditem == null)
        {
            return null;
        }
        if (fooditem.getEntityId() != null)
        {
            return h.getByEntityId(fooditem.getEntityId().longValue(), new com.fitbit.data.domain.Entity.EntityStatus[] {
                com.fitbit.data.domain.Entity.EntityStatus.PENDING_DELETE
            });
        } else
        {
            return h.getByServerId(fooditem.getServerId(), new com.fitbit.data.domain.Entity.EntityStatus[] {
                com.fitbit.data.domain.Entity.EntityStatus.PENDING_DELETE
            });
        }
    }

    public double a(double d1, h h1, double d2)
    {
        return h1.c() * d1 * d2;
    }

    public double a(double d1, h h1, FoodItem fooditem)
    {
        fooditem = fooditem.c();
        double d2 = h1.c();
        return fooditem.doubleValue() * (d2 * d1);
    }

    public double a(FoodLogEntry foodlogentry, h h1)
    {
        FoodItem fooditem = foodlogentry.getFoodItem();
        if (fooditem == null)
        {
            return 0.0D;
        } else
        {
            return a(foodlogentry.getAmount(), h1, fooditem.c().doubleValue());
        }
    }

    public Pair a(int i1, int j1)
        throws ServerCommunicationException, JSONException
    {
        Object obj = com.fitbit.util.o.f();
        obj = l.a(null, i1, j1, ((Date) (obj)));
        ao ao1 = new ao();
        return new Pair(ao1.l(((JSONObject) (obj))), ao1.o(((JSONObject) (obj))));
    }

    public FoodLogEntry a(long l1)
    {
        return (FoodLogEntry)d.getById(l1);
    }

    public FoodLogEntry a(Date date)
    {
        return d.getEntryClosesToDateFromPast(date);
    }

    public List a(int i1)
    {
        return f.getRecentFood(i1);
    }

    public List a(String s1)
        throws ServerCommunicationException, JSONException, SearchEntityException
    {
        return a(l.m(s1));
    }

    public List a(Date date, int i1)
    {
        ArrayList arraylist = new ArrayList();
        int j1 = 0;
        do
        {
            if (j1 >= i1)
            {
                break;
            }
            date = a().a(date);
            if (date == null)
            {
                break;
            }
            date = date.getLogDate();
            arraylist.add(date);
            date = new Date(date.getTime() - 0x5265c00L);
            j1++;
        } while (true);
        return arraylist;
    }

    public void a(FoodItem fooditem)
    {
        if (fooditem != null)
        {
            Object obj1 = f.getAll();
            Object obj = h.getAll();
            obj1 = ((List) (obj1)).iterator();
            do
            {
                if (!((Iterator) (obj1)).hasNext())
                {
                    break;
                }
                FoodRelation foodrelation = (FoodRelation)((Iterator) (obj1)).next();
                if (foodrelation.getFoodItem() != null)
                {
                    if (foodrelation.getFoodItem().getEntityId() == fooditem.getEntityId())
                    {
                        f.delete(foodrelation);
                    }
                } else
                {
                    f.delete(foodrelation);
                }
            } while (true);
            obj = ((List) (obj)).iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                FavoriteFoodItem favoritefooditem = (FavoriteFoodItem)((Iterator) (obj)).next();
                if (favoritefooditem.getFoodItem() != null)
                {
                    if (favoritefooditem.getFoodItem().getEntityId() == fooditem.getEntityId())
                    {
                        h.delete(favoritefooditem);
                    }
                } else
                {
                    h.delete(favoritefooditem);
                }
            } while (true);
        }
    }

    public void a(FoodItem fooditem, Context context)
    {
        com.fitbit.data.bl.l.a(fooditem, e);
        com.fitbit.data.bl.l.a(context);
    }

    public void a(FoodItem fooditem, FoodLogEntry foodlogentry, Context context)
    {
        FoodLogEntry foodlogentry1 = b(foodlogentry);
        com.fitbit.data.bl.l.a(fooditem, e);
        com.fitbit.data.bl.l.a(foodlogentry, d);
        com.fitbit.data.bl.l.a(context);
        a(foodlogentry1, foodlogentry);
    }

    public void a(FoodLogEntry foodlogentry)
    {
        CaloriesEatenGoal calorieseatengoal = com.fitbit.data.bl.t.a().b(foodlogentry.getLogDate());
        calorieseatengoal.a(Double.valueOf(Math.max(0.0D, calorieseatengoal.q().doubleValue() - foodlogentry.getCalories())));
        com.fitbit.data.bl.t.a().a(calorieseatengoal);
        d.deleteByCurrentDate(foodlogentry.getTimeCreated(), false);
    }

    public void a(FoodLogEntry foodlogentry, Context context)
    {
        FoodLogEntry foodlogentry1 = b(foodlogentry);
        com.fitbit.data.bl.l.a(foodlogentry, context);
        a(foodlogentry1, foodlogentry);
    }

    public volatile void a(LogEntry logentry, Context context)
    {
        a((FoodLogEntry)logentry, context);
    }

    public void a(ap ap)
    {
        d.addListener(ap);
    }

    public void a(List list)
    {
        k.a(list);
    }

    public void a(List list, Context context)
    {
        com.fitbit.data.bl.l.a(list, context);
        for (list = list.iterator(); list.hasNext(); a(((FoodLogEntry) (null)), (FoodLogEntry)list.next())) { }
    }

    public double b(double d1, h h1, double d2)
    {
        double d3 = 0.0D;
        if (d1 != 0.0D)
        {
            d3 = d2 / h1.c() / d1;
        }
        return d3;
    }

    public FoodItem b(long l1)
    {
        return e.getByEntityId(l1, new com.fitbit.data.domain.Entity.EntityStatus[] {
            com.fitbit.data.domain.Entity.EntityStatus.PENDING_DELETE
        });
    }

    public List b()
    {
        return k.getAll();
    }

    public List b(int i1)
    {
        return f.getFrequentFood(i1);
    }

    public List b(String s1)
        throws ServerCommunicationException, JSONException
    {
        return a(l.n(s1));
    }

    public List b(Date date)
    {
        return d.getByDate(date, new com.fitbit.data.domain.Entity.EntityStatus[] {
            com.fitbit.data.domain.Entity.EntityStatus.PENDING_DELETE
        });
    }

    public void b(FoodItem fooditem, Context context)
    {
        com.fitbit.data.bl.l.a(Arrays.asList(new FoodItem[] {
            fooditem
        }), e, context);
    }

    public void b(ap ap)
    {
        d.removeListener(ap);
    }

    public void b(List list, Context context)
    {
        d.addAll(list);
        ArrayList arraylist = new ArrayList(list.size());
        for (list = list.iterator(); list.hasNext(); arraylist.add(new Operation(((FoodLogEntry)list.next()).getEntityId().longValue(), d.getName(), com.fitbit.data.domain.Operation.OperationType.CREATE))) { }
        com.fitbit.data.bl.aq.a().w().addAll(arraylist);
        com.fitbit.data.bl.l.a(context);
    }

    public boolean b(FoodItem fooditem)
    {
        return c(fooditem) != null;
    }

    public Pair c(Date date)
        throws ServerCommunicationException, JSONException
    {
        JSONObject jsonobject = l.b(null, date);
        List list = (new ao()).k(jsonobject);
        for (Iterator iterator = list.iterator(); iterator.hasNext(); ((FoodLogEntry)iterator.next()).setLogDate(date)) { }
        date = new i();
        date.initFromPublicApiJsonObject(jsonobject);
        return new Pair(list, date);
    }

    public FoodItem c(long l1)
    {
        return e.getByServerId(l1, new com.fitbit.data.domain.Entity.EntityStatus[] {
            com.fitbit.data.domain.Entity.EntityStatus.PENDING_DELETE
        });
    }

    public List c(String s1)
        throws ServerCommunicationException, JSONException, SearchEntityException
    {
        Object obj = com.fitbit.data.bl.an.a().b();
        com.fitbit.serverinteraction.r r1 = m;
        long l1;
        if (obj == null)
        {
            l1 = -1L;
        } else
        {
            l1 = ((Profile) (obj)).I();
        }
        s1 = r1.c(s1, l1).getJSONObject("result").getJSONArray("brands");
        obj = new ArrayList();
        for (int i1 = 0; i1 < s1.length(); i1++)
        {
            JSONObject jsonobject = s1.getJSONObject(i1);
            Brand brand = new Brand();
            brand.a(jsonobject);
            ((List) (obj)).add(brand);
        }

        return ((List) (obj));
    }

    public void c()
    {
        k.a();
    }

    public void c(FoodItem fooditem, Context context)
    {
        FavoriteFoodItem favoritefooditem = c(fooditem);
        if (favoritefooditem == null)
        {
            fooditem = new FavoriteFoodItem(fooditem);
        } else
        {
            favoritefooditem.setEntityStatus(com.fitbit.data.domain.Entity.EntityStatus.PENDING_OPERATION);
            fooditem = favoritefooditem;
        }
        com.fitbit.data.bl.l.a(fooditem, h, context);
    }

    public void c(ap ap)
    {
        e.addListener(ap);
    }

    public FoodItem d(long l1)
        throws ServerCommunicationException, JSONException
    {
        JSONObject jsonobject = l.t(String.valueOf(l1));
        FoodItem fooditem = new FoodItem();
        fooditem.initFromPublicApiJsonObject(jsonobject);
        fooditem.d(true);
        return fooditem;
    }

    public FoodMeasurementUnit d(String s1)
    {
        return g.getByName(s1);
    }

    public List d()
    {
        return d.getByDate(new Date(), new com.fitbit.data.domain.Entity.EntityStatus[] {
            com.fitbit.data.domain.Entity.EntityStatus.PENDING_DELETE
        });
    }

    public void d(FoodItem fooditem, Context context)
    {
        fooditem = c(fooditem);
        if (fooditem != null)
        {
            com.fitbit.data.bl.l.a(Collections.singletonList(fooditem), h, context);
        }
    }

    public void d(ap ap)
    {
        e.removeListener(ap);
    }

    public FoodMeasurementUnit e(long l1)
    {
        return (FoodMeasurementUnit)g.getByServerId(l1);
    }

    public List e()
    {
        return a(-1);
    }

    public boolean e(String s1)
    {
        String s2 = d.getName();
        return s2 != null && s2.equals(s1);
    }

    public Meal f(long l1)
    {
        return (Meal)i.getByServerId(l1);
    }

    public List f()
    {
        return a(20);
    }

    public boolean f(String s1)
    {
        String s2 = e.getName();
        return s2 != null && s2.equals(s1);
    }

    public FoodLogEntry g(long l1)
    {
        return d.getLastFoodLogEntry(l1);
    }

    public List g()
    {
        return b(-1);
    }

    public List h()
    {
        return b(20);
    }

    public void i()
    {
        Object obj1 = f.getAll();
        Object obj = h.getAll();
        obj1 = ((List) (obj1)).iterator();
        do
        {
            if (!((Iterator) (obj1)).hasNext())
            {
                break;
            }
            FoodRelation foodrelation = (FoodRelation)((Iterator) (obj1)).next();
            if (foodrelation.getFoodItem() == null)
            {
                f.delete(foodrelation);
            }
        } while (true);
        obj = ((List) (obj)).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            FavoriteFoodItem favoritefooditem = (FavoriteFoodItem)((Iterator) (obj)).next();
            if (favoritefooditem.getFoodItem() == null)
            {
                h.delete(favoritefooditem);
            }
        } while (true);
    }

    public List j()
        throws ServerCommunicationException, JSONException
    {
        Object obj = l.d();
        obj = (new ao()).b(((JSONArray) (obj)));
        for (Iterator iterator = ((List) (obj)).iterator(); iterator.hasNext(); ((FoodRelation)iterator.next()).setGroup(com.fitbit.data.domain.FoodRelation.FoodRelationType.RECENT)) { }
        return ((List) (obj));
    }

    public List k()
        throws ServerCommunicationException, JSONException
    {
        Object obj = l.e();
        obj = (new ao()).b(((JSONArray) (obj)));
        for (Iterator iterator = ((List) (obj)).iterator(); iterator.hasNext(); ((FoodRelation)iterator.next()).setGroup(com.fitbit.data.domain.FoodRelation.FoodRelationType.FREQUENT)) { }
        return ((List) (obj));
    }

    public List l()
        throws ServerCommunicationException, JSONException
    {
        boolean flag = false;
        ArrayList arraylist = new ArrayList();
        JSONArray jsonarray = l.j();
        int i1 = ((flag) ? 1 : 0);
        if (com.fitbit.config.b.a.a())
        {
            com.fitbit.e.a.a("FoodBusinessLogic", jsonarray.toString(), new Object[0]);
            i1 = ((flag) ? 1 : 0);
        }
        for (; i1 < jsonarray.length(); i1++)
        {
            FoodMeasurementUnit foodmeasurementunit = new FoodMeasurementUnit();
            foodmeasurementunit.initFromPublicApiJsonObject(jsonarray.getJSONObject(i1));
            arraylist.add(foodmeasurementunit);
        }

        return arraylist;
    }

    public boolean m()
    {
        return g.count() > 0L;
    }

    public List n()
        throws ServerCommunicationException, JSONException
    {
        ArrayList arraylist = new ArrayList();
        JSONArray jsonarray = l.j(null);
        for (int i1 = 0; i1 < jsonarray.length(); i1++)
        {
            JSONObject jsonobject = jsonarray.getJSONObject(i1);
            FoodItem fooditem = new FoodItem();
            fooditem.initFromPublicApiJsonObject(jsonobject);
            arraylist.add(fooditem);
        }

        return arraylist;
    }

    public List o()
    {
        return i.getAll();
    }

    public List p()
    {
        return b(h.get(new com.fitbit.data.domain.Entity.EntityStatus[] {
            com.fitbit.data.domain.Entity.EntityStatus.SYNCED, com.fitbit.data.domain.Entity.EntityStatus.PENDING_OPERATION
        }));
    }

    public List q()
    {
        return j.getAll();
    }

    public FoodLocale r()
    {
label0:
        {
            Object obj1 = q();
            Object obj = com.fitbit.data.bl.an.a().b();
            if (obj == null)
            {
                break label0;
            }
            obj = ((Profile) (obj)).m();
            obj1 = ((List) (obj1)).iterator();
            FoodLocale foodlocale;
            String s1;
            do
            {
                do
                {
                    if (!((Iterator) (obj1)).hasNext())
                    {
                        break label0;
                    }
                    foodlocale = (FoodLocale)((Iterator) (obj1)).next();
                } while (foodlocale == null);
                s1 = foodlocale.a();
            } while (s1 == null || !s1.equals(obj));
            return foodlocale;
        }
        return null;
    }

    public boolean s()
    {
        return a(new c() {

            final r a;

            public boolean a(FoodLocale foodlocale)
            {
                return foodlocale.d();
            }

            public volatile boolean a(Object obj)
            {
                return a((FoodLocale)obj);
            }

            
            {
                a = r.this;
                super();
            }
        });
    }

    public boolean t()
    {
        return a(new c() {

            final r a;

            public boolean a(FoodLocale foodlocale)
            {
                return foodlocale.c();
            }

            public volatile boolean a(Object obj)
            {
                return a((FoodLocale)obj);
            }

            
            {
                a = r.this;
                super();
            }
        });
    }

    public List u()
        throws ServerCommunicationException, JSONException
    {
        JSONArray jsonarray = l.k();
        return (new ao()).h(jsonarray);
    }

    public List v()
    {
        return e.getCustomFood();
    }
}
