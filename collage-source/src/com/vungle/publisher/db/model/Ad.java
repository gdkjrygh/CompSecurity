// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher.db.model;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.vungle.log.Logger;
import com.vungle.publisher.bg;
import com.vungle.publisher.bi;
import com.vungle.publisher.bj;
import com.vungle.publisher.db.DatabaseHelper;
import com.vungle.publisher.de;
import com.vungle.publisher.event.EventBus;
import com.vungle.publisher.l;
import com.vungle.publisher.protocol.message.RequestAdResponse;
import com.vungle.publisher.u;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.vungle.publisher.db.model:
//            EventTracking, Video

public abstract class Ad extends bi
{
    public static abstract class Factory extends com.vungle.publisher.bi.a
    {

        EventTracking.Factory a;
        EventBus b;

        private static Ad b(Ad ad, RequestAdResponse requestadresponse)
        {
            ad.d = requestadresponse.b();
            String s1 = requestadresponse.c();
            String s2 = requestadresponse.e();
            if (TextUtils.isEmpty(s1))
            {
                ad.e = s2;
            } else
            {
                ad.e = s1;
                ad.f = s2;
            }
            ad.g = requestadresponse.g();
            return ad;
        }

        public int a(Ad ad, RequestAdResponse requestadresponse)
        {
            b(ad, requestadresponse);
            Video.Factory.a(ad.k(), requestadresponse).m();
            EventTracking.Factory factory = a;
            String s1 = requestadresponse.f();
            factory.a(s1);
            requestadresponse = factory.a(s1, requestadresponse.k());
            EventTracking.Factory.a(requestadresponse);
            ad.h = requestadresponse;
            return ad.m();
        }

        protected final int a(List list, a a1)
        {
            int k1 = list.size();
            String as[] = new String[k1];
            list = list.iterator();
            int j1 = 0;
            while (list.hasNext()) 
            {
                Object obj = (Ad)list.next();
                as[0] = ((Ad) (obj)).d();
                a a2 = ((Ad) (obj)).i();
        /* block-local class not found */
        class a {}

                int i1;
                if (a1 != a.e && a2 == a.e)
                {
                    i1 = -1;
                } else
                if (a1 == a.e && a2 != a.e)
                {
                    i1 = 1;
                } else
                {
                    i1 = 0;
                }
                ((Ad) (obj)).a(a1);
                j1 = i1 + j1;
            }
            list = new ContentValues();
            list.put("status", a1.toString());
            obj = (new StringBuilder("id IN (")).append(bg.a(k1)).append(")").toString();
            Logger.d("VungleDatabase", (new StringBuilder("updating status of ads ")).append(de.a(as)).append(" to ").append(a1).toString());
            i1 = c.getWritableDatabase().updateWithOnConflict(e_(), list, ((String) (obj)), as, 3);
            if (i1 > 0)
            {
                if (j1 > 0)
                {
                    Logger.d("VungleDatabase", (new StringBuilder("ad availability increased by ")).append(j1).toString());
                    b.a(new u());
                } else
                if (j1 < 0)
                {
                    Logger.d("VungleDatabase", (new StringBuilder("ad availability decreased by ")).append(j1).toString());
                    b.a(new l());
                    return i1;
                }
            }
            return i1;
        }

        protected volatile bi a(bi bi1, Cursor cursor)
        {
            return a((Ad)bi1, cursor, false);
        }

        protected final Ad a(b b1, String s1)
        {
        /* block-local class not found */
        class b {}

            return (Ad)super.a(s1, "type = ?", new String[] {
                b1.toString()
            });
        }

        protected Ad a(Ad ad, Cursor cursor, boolean flag)
        {
            ad.d = bg.f(cursor, "advertising_app_vungle_id");
            ad.e = bg.f(cursor, "call_to_action_final_url");
            ad.f = bg.f(cursor, "call_to_action_url");
            ad.g = bg.f(cursor, "delivery_id");
            ad.t = bg.f(cursor, "id");
            ad.i = bg.e(cursor, "insert_timestamp_millis").longValue();
            ad.j = (a)bg.a(cursor, "status", com/vungle/publisher/db/model/Ad$a);
            ad.k = (b)bg.a(cursor, "type", com/vungle/publisher/db/model/Ad$b);
            ad.l = bg.e(cursor, "update_timestamp_millis").longValue();
            ad.m = bg.e(cursor, "failed_timestamp_millis").longValue();
            if (flag)
            {
                b(ad);
                a(ad, flag);
            }
            return ad;
        }

        protected Ad a(RequestAdResponse requestadresponse)
        {
            Ad ad = (Ad)c_();
            String s1 = requestadresponse.f();
            ad.t = s1;
            ad.k = b();
            ad.h = a.a(s1, requestadresponse.k());
            ad.n = a().a(ad, requestadresponse);
            b(ad, requestadresponse);
            return ad;
        }

        protected abstract Video.Factory a();

        protected final Video a(Ad ad, boolean flag)
        {
            if (ad.q)
            {
                return ad.n;
            } else
            {
                Video video = a().a((String)ad.t, flag);
                ad.n = video;
                ad.q = true;
                return video;
            }
        }

        public boolean a(Ad ad)
        {
            if (a((new StringBuilder("id = ? AND ")).append(Ad.b).append(" AND ((expiration_timestamp_seconds IS NULL OR expiration_timestamp_seconds <= ?) OR status != ?)").toString(), new String[] {
        ad.d(), Long.toString(System.currentTimeMillis() / 1000L), a.e.toString()
    }))
            {
                Logger.d("VungleDatabase", "deleting ad after successful report");
                return ad.n() > 0;
            } else
            {
                return false;
            }
        }

        protected abstract b b();

        protected final Map b(Ad ad)
        {
            if (ad.p)
            {
                return ad.h;
            } else
            {
                Map map = a.b((String)ad.t);
                ad.h = map;
                ad.p = true;
                return map;
            }
        }

        protected final int c()
        {
            a a1 = a.g;
            Logger.d("VungleDatabase", (new StringBuilder("deleting ")).append(b()).append(" records without pending reports in status ").append(a1).toString());
            return c.getWritableDatabase().delete("ad", (new StringBuilder()).append(Ad.b).append(" AND status = ?").toString(), new String[] {
                a1.toString()
            });
        }

        protected Factory()
        {
        }
    }


    protected static final String a;
    protected static final String b;
    protected static final String c;
    protected String d;
    protected String e;
    protected String f;
    protected String g;
    protected Map h;
    protected long i;
    protected a j;
    protected b k;
    protected long l;
    protected long m;
    protected Video n;
    String o;
    protected boolean p;
    protected boolean q;
    EventBus r;

    protected Ad()
    {
        super.s = java/lang/String;
    }

    private Map t()
    {
        return c().b(this);
    }

    protected ContentValues a(boolean flag)
    {
        long l1 = System.currentTimeMillis();
        l = l1;
        ContentValues contentvalues = new ContentValues();
        if (flag)
        {
            contentvalues.put("id", (String)t);
            i = l1;
            contentvalues.put("insert_timestamp_millis", Long.valueOf(l1));
            contentvalues.put("type", k.toString());
        }
        contentvalues.put("advertising_app_vungle_id", d);
        contentvalues.put("call_to_action_final_url", e);
        contentvalues.put("call_to_action_url", f);
        contentvalues.put("delivery_id", g);
        contentvalues.put("status", j.toString());
        contentvalues.put("update_timestamp_millis", Long.valueOf(l1));
        contentvalues.put("failed_timestamp_millis", Long.valueOf(m));
        return contentvalues;
    }

    public bj a(com.vungle.publisher.bj.b b1)
    {
        throw new IllegalArgumentException((new StringBuilder("unknown viewable type: ")).append(b1).toString());
    }

    public void a(a a1)
    {
        a a2 = j;
        Logger.v("VunglePrepare", (new StringBuilder("setting status from ")).append(a2).append(" to ").append(a1).append(" for ").append(y()).toString());
        j = a1;
        if (a1 == a.b)
        {
            m = System.currentTimeMillis();
        }
    }

    public final boolean a(Ad ad)
    {
        return ad != null && ad.t != null && ((String)ad.t).equals(t);
    }

    public final String[] a(EventTracking.a a1)
    {
        if (t() != null)
        {
            Object obj = (List)t().get(a1);
            if (obj != null)
            {
                int i1 = ((List) (obj)).size();
                if (i1 > 0)
                {
                    a1 = new String[i1];
                    i1 = 0;
                    for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext();)
                    {
                        a1[i1] = ((EventTracking)((Iterator) (obj)).next()).c;
                        i1++;
                    }

                    return a1;
                }
            }
        }
        return null;
    }

    protected final String b()
    {
        return "ad";
    }

    public final void b(a a1)
    {
        c().a(Arrays.asList(new Ad[] {
            this
        }), a1);
    }

    protected abstract Factory c();

    public final String d()
    {
        return (String)t;
    }

    public final String e()
    {
        return d;
    }

    public boolean equals(Object obj)
    {
        return (obj instanceof Ad) && a((Ad)obj);
    }

    public final String f()
    {
        return e;
    }

    protected final boolean f_()
    {
        return false;
    }

    public final String g()
    {
        return f;
    }

    public final String h()
    {
        return g;
    }

    public int hashCode()
    {
        if (t == null)
        {
            return super.hashCode();
        } else
        {
            return ((String)t).hashCode();
        }
    }

    public final a i()
    {
        return j;
    }

    public final long j()
    {
        return m;
    }

    public final Video k()
    {
        return c().a(this, false);
    }

    public String l()
        throws SQLException
    {
        String s1 = (String)super.r();
        if (h != null)
        {
            for (Iterator iterator = h.values().iterator(); iterator.hasNext();)
            {
                Iterator iterator1 = ((List)iterator.next()).iterator();
                while (iterator1.hasNext()) 
                {
                    ((EventTracking)iterator1.next()).r();
                }
            }

        }
        if (n != null)
        {
            n.r();
        }
        return s1;
    }

    public int m()
    {
        int i1 = super.m();
        if (i1 == 1 && n != null)
        {
            n.m();
        }
        return i1;
    }

    public int n()
    {
        return super.n();
    }

    protected final StringBuilder o()
    {
        StringBuilder stringbuilder = super.o();
        bi.a(stringbuilder, "type", k, false);
        return stringbuilder;
    }

    protected StringBuilder p()
    {
        StringBuilder stringbuilder = super.p();
        bi.a(stringbuilder, "advertising_app_vungle_id", d, false);
        bi.a(stringbuilder, "call_to_action_final_url", e, false);
        bi.a(stringbuilder, "call_to_action_url", f, false);
        bi.a(stringbuilder, "delivery_id", g, false);
        bi.a(stringbuilder, "insert_timestamp_millis", Long.valueOf(i), false);
        bi.a(stringbuilder, "status", j, false);
        bi.a(stringbuilder, "update_timestamp_millis", Long.valueOf(l), false);
        bi.a(stringbuilder, "failed_timestamp_millis", Long.valueOf(m), false);
        Integer integer;
        if (h == null)
        {
            integer = null;
        } else
        {
            integer = Integer.valueOf(h.size());
        }
        bi.a(stringbuilder, "eventTrackings", integer, false);
        return stringbuilder;
    }

    public final boolean q()
    {
        return c().a(this);
    }

    public Object r()
    {
        return l();
    }

    public final volatile Object s()
    {
        return (String)t;
    }

    static 
    {
        a = (new StringBuilder("(SELECT DISTINCT ad_id FROM ad_report WHERE status IN ('")).append(AdReport.a.d).append("', '").append(AdReport.a.c).append("'))").toString();
        b = (new StringBuilder("id NOT IN ")).append(a).toString();
        c = (new StringBuilder("id IN ")).append(a).toString();
    }
}
