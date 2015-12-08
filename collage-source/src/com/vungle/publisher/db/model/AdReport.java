// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher.db.model;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import com.vungle.log.Logger;
import com.vungle.publisher.bg;
import com.vungle.publisher.bi;
import com.vungle.publisher.db.DatabaseHelper;
import com.vungle.publisher.de;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.vungle.publisher.db.model:
//            AdReportExtra, Ad, AdPlay, LocalAdReport, 
//            StreamingAdReport

public abstract class AdReport extends bi
{
    public static abstract class BaseFactory extends com.vungle.publisher.bi.a
    {

        AdReportExtra.Factory a;

        private AdReport a(AdReport adreport, Ad ad, boolean flag)
        {
            if (ad == null)
            {
                adreport.a = (Ad)a().a(adreport.d());
            } else
            {
                adreport.a = ad;
            }
            if (flag)
            {
                adreport.m = b().b(adreport);
                adreport.l = a.b((Integer)adreport.t);
            }
            return adreport;
        }

        protected volatile bi a(bi bi1, Cursor cursor)
        {
            return a((AdReport)bi1, cursor, false);
        }

        protected abstract Ad.Factory a();

        public final AdReport a(Ad ad)
        {
            AdReport adreport1 = b(ad);
            AdReport adreport = adreport1;
            if (adreport1 == null)
            {
                adreport = (AdReport)c_();
                adreport.a = ad;
        /* block-local class not found */
        class a {}

                adreport.g = a.a;
                Logger.d("VungleDatabase", (new StringBuilder("creating new ")).append(adreport.y()).toString());
                adreport.u();
            }
            return adreport;
        }

        protected AdReport a(AdReport adreport, Cursor cursor, boolean flag)
        {
            adreport.t = bg.d(cursor, "id");
            adreport.a(bg.f(cursor, "ad_id"));
            adreport.c = bg.f(cursor, "incentivized_publisher_app_user_id");
            adreport.e = bg.a(cursor, "is_incentivized").booleanValue();
            adreport.d = bg.e(cursor, "insert_timestamp_millis");
            adreport.f = bg.f(cursor, "placement");
            adreport.g = (a)bg.a(cursor, "status", com/vungle/publisher/db/model/AdReport$a);
            adreport.h = bg.e(cursor, "update_timestamp_millis");
            adreport.i = bg.d(cursor, "video_duration_millis");
            adreport.j = bg.e(cursor, "view_end_millis");
            adreport.k = bg.e(cursor, "view_start_millis");
            return adreport;
        }

        protected abstract AdPlay.Factory b();

        public final AdReport b(Ad ad)
        {
            Object obj = a.a.toString();
            if (ad == null)
            {
                throw new IllegalArgumentException("null ad");
            }
            String s1 = ad.d();
            if (s1 == null)
            {
                throw new IllegalArgumentException("null ad_id");
            }
            String as[] = new String[2];
            as[0] = s1;
            for (int i1 = 0; i1 <= 0; i1++)
            {
                as[1] = (new String[] {
                    obj
                })[0];
            }

            obj = a((new StringBuilder("ad_id = ? AND ")).append("status = ?").toString(), as, "insert_timestamp_millis DESC");
            String s = (new StringBuilder("ad_id = ? AND ")).append("status = ?").append(", with params: ").append(de.a(as)).toString();
            int j1 = ((List) (obj)).size();
            switch (j1)
            {
            default:
                Logger.w("VungleDatabase", (new StringBuilder()).append(j1).append(" ad_report records for ").append(s).toString());
                // fall through

            case 0: // '\0'
                return null;

            case 1: // '\001'
                ad = a((AdReport)((List) (obj)).get(0), ad, false);
                break;
            }
            Logger.d("VungleDatabase", (new StringBuilder("fetched ")).append(ad.y()).toString());
            return ad;
        }

        protected abstract Ad.b c();

        protected final List f()
        {
            List list = a("status = ? AND ad_id IN (SELECT id FROM ad WHERE type = ?)", new String[] {
                a.d.toString(), c().toString()
            }, "insert_timestamp_millis ASC");
            for (Iterator iterator = list.iterator(); iterator.hasNext(); a((AdReport)iterator.next(), ((Ad) (null)), true)) { }
            return list;
        }

        protected BaseFactory()
        {
        }
    }

    public static class Factory
    {

        public DatabaseHelper a;
        LocalAdReport.Factory b;
        StreamingAdReport.Factory c;

        public final List a()
        {
            ArrayList arraylist = new ArrayList();
            for (Iterator iterator = b.f().iterator(); iterator.hasNext(); arraylist.add((LocalAdReport)iterator.next())) { }
            for (Iterator iterator1 = c.f().iterator(); iterator1.hasNext(); arraylist.add((StreamingAdReport)iterator1.next())) { }
            return arraylist;
        }

        Factory()
        {
        }
    }


    protected Ad a;
    protected String b;
    protected String c;
    protected Long d;
    protected boolean e;
    protected String f;
    protected a g;
    protected Long h;
    protected Integer i;
    protected Long j;
    protected Long k;
    protected Map l;
    protected List m;
    protected boolean n;
    AdReportExtra.Factory o;

    protected AdReport()
    {
    }

    private void A()
    {
        if (n)
        {
            Map map = l;
            if (t == null)
            {
                Logger.d("VungleDatabase", (new StringBuilder("delaying inserting extras for uninserted ")).append(y()).toString());
                return;
            }
            Logger.d("VungleDatabase", (new StringBuilder("replacing extras for ")).append(y()).toString());
            o.a((Integer)t);
            if (map != null && !map.isEmpty())
            {
                AdReportExtra.Factory.a((bi[])map.values().toArray(AdReportExtra.Factory.a(map.size())));
            }
            n = false;
            return;
        } else
        {
            Logger.v("VungleDatabase", (new StringBuilder("no new extras to insert for ")).append(y()).toString());
            return;
        }
    }

    private List v()
    {
        List list1 = m;
        List list = list1;
        if (list1 == null)
        {
            list = c().b(this);
            m = list;
        }
        return list;
    }

    protected ContentValues a(boolean flag)
    {
        long l1 = System.currentTimeMillis();
        ContentValues contentvalues = new ContentValues();
        if (flag)
        {
            contentvalues.put("ad_id", d());
            Long long1 = Long.valueOf(l1);
            d = long1;
            contentvalues.put("insert_timestamp_millis", long1);
        }
        contentvalues.put("incentivized_publisher_app_user_id", c);
        contentvalues.put("is_incentivized", Boolean.valueOf(e));
        contentvalues.put("placement", f);
        contentvalues.put("status", de.a(g));
        Long long2 = Long.valueOf(l1);
        h = long2;
        contentvalues.put("update_timestamp_millis", long2);
        contentvalues.put("video_duration_millis", i);
        contentvalues.put("view_end_millis", j);
        contentvalues.put("view_start_millis", k);
        return contentvalues;
    }

    public final void a(a a1)
    {
        Logger.d("VungleReport", (new StringBuilder("setting ad_report status ")).append(a1).append(" for ").append(y()).toString());
        g = a1;
    }

    public final void a(Integer integer)
    {
        Logger.d("VungleReport", (new StringBuilder("setting video duration millis ")).append(integer).append(" for ").append(y()).toString());
        i = integer;
        m();
    }

    public final void a(Long long1)
    {
        Logger.d("VungleReport", (new StringBuilder("setting ad end millis ")).append(long1).append(" for ").append(y()).toString());
        j = long1;
    }

    protected final void a(String s)
    {
        b = s;
    }

    public final void a(Map map)
    {
        AdReportExtra.Factory factory = o;
        Integer integer = (Integer)t;
        int i1;
        if (map != null)
        {
            HashMap hashmap = new HashMap();
            String s;
            AdReportExtra adreportextra;
            for (map = map.entrySet().iterator(); map.hasNext(); hashmap.put(s, adreportextra))
            {
                Object obj = (java.util.Map.Entry)map.next();
                s = (String)((java.util.Map.Entry) (obj)).getKey();
                obj = (String)((java.util.Map.Entry) (obj)).getValue();
                adreportextra = factory.a();
                adreportextra.a = integer;
                adreportextra.b = s;
                adreportextra.c = ((String) (obj));
            }

            map = hashmap;
        } else
        {
            map = null;
        }
        l = map;
        if (map == null)
        {
            i1 = 0;
        } else
        {
            i1 = map.size();
        }
        if (i1 <= 0)
        {
            Logger.d("VungleDatabase", (new StringBuilder("no new extras for ")).append(y()).toString());
            return;
        } else
        {
            Logger.d("VungleDatabase", (new StringBuilder()).append(i1).append(" new extras for ").append(y()).toString());
            n = true;
            A();
            return;
        }
    }

    protected final String b()
    {
        return "ad_report";
    }

    public final void b(Long long1)
    {
        a(long1);
        m();
    }

    public final void b(String s)
    {
        c = s;
    }

    public final void b(boolean flag)
    {
        e = flag;
    }

    protected abstract AdPlay.Factory c();

    public final void c(Long long1)
    {
        Logger.d("VungleReport", (new StringBuilder("setting ad start millis ")).append(long1).append(" for ").append(y()).toString());
        k = long1;
    }

    public final void c(String s)
    {
        f = s;
    }

    protected final String d()
    {
        if (a == null)
        {
            return b;
        } else
        {
            return a.d();
        }
    }

    public final Ad e()
    {
        return a;
    }

    public final Map f()
    {
        Map map1 = l;
        Map map = map1;
        if (map1 == null)
        {
            map = o.b((Integer)t);
            l = map;
        }
        return map;
    }

    public final boolean g()
    {
        return e;
    }

    public final String h()
    {
        return c;
    }

    public final String i()
    {
        return f;
    }

    public final Integer j()
    {
        return i;
    }

    public final int k()
    {
        if (k == null)
        {
            Logger.w("VungleDatabase", "unable to calculate ad duration because view start millis was null");
            return -1;
        }
        if (j == null)
        {
            Logger.w("VungleDatabase", "unable to calculate ad duration because view end millis was null");
            return -1;
        } else
        {
            return (int)(j.longValue() - k.longValue());
        }
    }

    public final Long l()
    {
        return k;
    }

    public StringBuilder p()
    {
        StringBuilder stringbuilder = super.p();
        bi.a(stringbuilder, "ad_id", d(), false);
        bi.a(stringbuilder, "insert_timestamp_millis", d, false);
        bi.a(stringbuilder, "incentivized_publisher_app_user_id", c, false);
        bi.a(stringbuilder, "is_incentivized", Boolean.valueOf(e), false);
        bi.a(stringbuilder, "placement", f, false);
        bi.a(stringbuilder, "status", g, false);
        bi.a(stringbuilder, "update_timestamp_millis", h, false);
        bi.a(stringbuilder, "video_duration_millis", i, false);
        bi.a(stringbuilder, "view_end_millis", j, false);
        bi.a(stringbuilder, "view_start_millis", k, false);
        Object obj;
        if (m == null)
        {
            obj = "not fetched";
        } else
        {
            obj = Integer.valueOf(m.size());
        }
        bi.a(stringbuilder, "plays", obj, false);
        return stringbuilder;
    }

    public final AdPlay q()
    {
        List list = v();
        AdPlay adplay = c().a(this);
        adplay.r();
        list.add(adplay);
        return adplay;
    }

    public final Object r()
    {
        return u();
    }

    public final AdPlay[] t()
    {
        List list = v();
        return (AdPlay[])list.toArray(c().c(list.size()));
    }

    public final Integer u()
        throws SQLException
    {
        Integer integer = (Integer)super.r();
        A();
        return integer;
    }
}
