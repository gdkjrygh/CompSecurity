// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher.reporting;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import com.vungle.log.Logger;
import com.vungle.publisher.a;
import com.vungle.publisher.ad;
import com.vungle.publisher.ag;
import com.vungle.publisher.ah;
import com.vungle.publisher.al;
import com.vungle.publisher.an;
import com.vungle.publisher.ao;
import com.vungle.publisher.ap;
import com.vungle.publisher.aq;
import com.vungle.publisher.bb;
import com.vungle.publisher.bc;
import com.vungle.publisher.bx;
import com.vungle.publisher.by;
import com.vungle.publisher.cr;
import com.vungle.publisher.d;
import com.vungle.publisher.db.DatabaseHelper;
import com.vungle.publisher.db.model.Ad;
import com.vungle.publisher.db.model.AdPlay;
import com.vungle.publisher.db.model.AdReport;
import com.vungle.publisher.db.model.LocalAd;
import com.vungle.publisher.db.model.StreamingAd;
import com.vungle.publisher.g;
import com.vungle.publisher.h;
import com.vungle.publisher.i;
import com.vungle.publisher.o;
import com.vungle.publisher.p;
import com.vungle.publisher.y;
import com.vungle.publisher.z;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

// Referenced classes of package com.vungle.publisher.reporting:
//            AdReportManager, AdServiceReportingHandler

public class AdReportEventListener extends by
{
    public static class Factory
    {

        public AdReportEventListener a;

        public Factory()
        {
        }
    }


    private static final com.vungle.publisher.db.model.EventTracking.a f[];
    AdServiceReportingHandler a;
    com.vungle.publisher.db.model.AdReport.Factory b;
    AdReportManager c;
    com.vungle.publisher.db.model.LoggedException.Factory d;
    cr e;
    private Ad g;
    private AdPlay i;
    private AdReport j;
    private int k;
    private final HashSet l = new HashSet();

    public AdReportEventListener()
    {
    }

    private void a()
    {
        k = 0;
        l.clear();
    }

    private void a(long l1)
    {
        unregister();
        AdReport adreport = j;
        if (adreport == null)
        {
            Logger.d("VungleReport", "no current ad report");
        } else
        {
            adreport.a(com.vungle.publisher.db.model.AdReport.a.d);
            adreport.a(Long.valueOf(l1));
            adreport.x();
        }
        c.a();
        g = null;
        j = null;
        i = null;
        a();
    }

    private void a(com.vungle.publisher.db.model.AdReportEvent.a a1, Object obj)
    {
        try
        {
            i.a(a1, obj);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.vungle.publisher.db.model.AdReportEvent.a a1)
        {
            d.a("VungleReport", "error reporting event", a1);
        }
    }

    private void a(com.vungle.publisher.db.model.EventTracking.a a1)
    {
        if (g == null)
        {
            Logger.w("VungleReport", (new StringBuilder("null ad in AdReportingHandler - cannot track event ")).append(a1).toString());
        } else
        if (!l.contains(a1))
        {
            Logger.v("VungleReport", (new StringBuilder("tpat event ")).append(a1.name()).toString());
            cr cr1 = e;
            Ad ad1 = g;
            String as[] = g.a(a1);
            HashMap hashmap = new HashMap();
            hashmap.put("%timestamp%", String.valueOf(System.currentTimeMillis()));
            cr1.a(ad1, a1, hashmap, as);
            l.add(a1);
            return;
        }
    }

    public final void a(Ad ad1)
    {
        if (g == null || !g.a(ad1))
        {
            Logger.i("VungleReport", (new StringBuilder("new ad ")).append(ad1.y()).toString());
            g = ad1;
            AdReportManager adreportmanager = c;
            if (ad1 instanceof LocalAd)
            {
                ad1 = adreportmanager.c.a((LocalAd)ad1);
            } else
            if (ad1 instanceof StreamingAd)
            {
                ad1 = adreportmanager.f.a((StreamingAd)ad1);
            } else
            {
                throw new IllegalArgumentException((new StringBuilder("unknown ad type ")).append(ad1).toString());
            }
            j = ad1;
            i = j.q();
            a();
            return;
        } else
        {
            Logger.v("VungleReport", (new StringBuilder("same ad ")).append(ad1.y()).toString());
            return;
        }
    }

    public void onEvent(ad ad1)
    {
        boolean flag1;
        boolean flag2;
        flag1 = false;
        flag2 = false;
        int i1 = ad1.a;
        float f1;
        Object obj;
        Integer integer;
        boolean flag;
        boolean flag3;
        if (k < f.length)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        flag3 = ad1 instanceof p;
        if (!flag && !flag3)
        {
            break MISSING_BLOCK_LABEL_350;
        }
        obj = j.j();
        if (obj == null)
        {
            try
            {
                Logger.d("VungleReport", (new StringBuilder("null video duration millis for ")).append(j.y()).toString());
                return;
            }
            // Misplaced declaration of an exception variable
            catch (ad ad1)
            {
                d.a("VungleReport", "error handling video view progress", ad1);
            }
            break MISSING_BLOCK_LABEL_133;
        }
        if (((Integer) (obj)).intValue() == 0)
        {
            Logger.w("VungleReport", (new StringBuilder("video duration millis 0 for ")).append(j.y()).toString());
            return;
        }
        break MISSING_BLOCK_LABEL_134;
        return;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_204;
        }
        f1 = i1;
        f1 /= ((Integer) (obj)).intValue();
        obj = f[k];
        flag = flag2;
        if (f1 >= ((com.vungle.publisher.db.model.EventTracking.a) (obj)).p)
        {
            flag = true;
        }
        flag1 = flag;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_204;
        }
        k = k + 1;
        a(((com.vungle.publisher.db.model.EventTracking.a) (obj)));
        flag1 = flag;
        if (!flag1 && !flag3)
        {
            break MISSING_BLOCK_LABEL_350;
        }
        obj = i;
        integer = Integer.valueOf(ad1.a);
        if (((AdPlay) (obj)).b == null)
        {
            break MISSING_BLOCK_LABEL_255;
        }
        if (integer == null)
        {
            break MISSING_BLOCK_LABEL_323;
        }
        if (integer.intValue() <= ((AdPlay) (obj)).b.intValue())
        {
            break MISSING_BLOCK_LABEL_323;
        }
        Logger.d("VungleAd", (new StringBuilder("setting watched millis ")).append(integer).toString());
        obj.b = integer;
_L1:
        i.m();
        j.b(Long.valueOf(((bx) (ad1)).e));
        return;
        ad1;
        d.a("VungleReport", "error updating video view progress", ad1);
        return;
        Logger.w("VungleAd", (new StringBuilder("ignoring decreased watched millis ")).append(integer).toString());
          goto _L1
    }

    public void onEvent(ag ag1)
    {
        Object obj;
        Object obj1;
        boolean flag;
        try
        {
            Logger.d("VungleReport", "received play ad start");
            obj = b;
            obj1 = new ContentValues();
            ((ContentValues) (obj1)).put("status", com.vungle.publisher.db.model.AdReport.a.d.toString());
            ((com.vungle.publisher.db.model.AdReport.Factory) (obj)).a.getWritableDatabase().update("ad_report", ((ContentValues) (obj1)), "status = ?", new String[] {
                com.vungle.publisher.db.model.AdReport.a.c.toString()
            });
            obj = ag1.a;
            obj1 = j;
            ((AdReport) (obj1)).a(com.vungle.publisher.db.model.AdReport.a.c);
            ((AdReport) (obj1)).a(((a) (obj)).getExtras());
            flag = ((a) (obj)).isIncentivized();
            ((AdReport) (obj1)).b(flag);
        }
        // Misplaced declaration of an exception variable
        catch (ag ag1)
        {
            d.a("VungleReport", "error processing ad start event", ag1);
            return;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_121;
        }
        ((AdReport) (obj1)).b(((a) (obj)).getIncentivizedUserId());
        ((AdReport) (obj1)).c(((a) (obj)).getPlacement());
        ((AdReport) (obj1)).c(Long.valueOf(((bx) (ag1)).e));
        ((AdReport) (obj1)).x();
        return;
    }

    public void onEvent(ah ah)
    {
        try
        {
            i.c = Long.valueOf(((bx) (ah)).e);
            i.m();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ah ah)
        {
            d.a("VungleReport", "error updating play start millis", ah);
        }
    }

    public void onEvent(al al)
    {
        a(com.vungle.publisher.db.model.EventTracking.a.m);
        a(com.vungle.publisher.db.model.AdReportEvent.a.b, null);
    }

    public void onEvent(an an)
    {
        a(com.vungle.publisher.db.model.AdReportEvent.a.l, null);
    }

    public void onEvent(ao ao1)
    {
        if (ao1.a)
        {
            a(com.vungle.publisher.db.model.AdReportEvent.a.f, null);
            a(com.vungle.publisher.db.model.EventTracking.a.b);
            return;
        } else
        {
            a(com.vungle.publisher.db.model.AdReportEvent.a.j, null);
            a(com.vungle.publisher.db.model.EventTracking.a.k);
            return;
        }
    }

    public void onEvent(ap ap1)
    {
        a(com.vungle.publisher.db.model.AdReportEvent.a.m, Float.valueOf(ap1.a));
    }

    public void onEvent(aq aq1)
    {
        float f1 = aq1.d;
        boolean flag;
        if (aq1.b > aq1.a)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            a(com.vungle.publisher.db.model.AdReportEvent.a.o, Float.valueOf(f1));
            return;
        } else
        {
            a(com.vungle.publisher.db.model.AdReportEvent.a.n, Float.valueOf(f1));
            return;
        }
    }

    public void onEvent(bb bb)
    {
        try
        {
            Logger.d("VungleReport", "received destroyed ad end");
            a(((bx) (bb)).e);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (bb bb)
        {
            Logger.w("VungleReport", "error processing destroyed ad end");
        }
    }

    public void onEvent(bc bc1)
    {
        try
        {
            Logger.d("VungleReport", "received play ad end");
            a(bc1.a());
            a(bc1.b());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (bc bc1)
        {
            d.a("VungleReport", "error processing ad end", bc1);
        }
    }

    public void onEvent(d d1)
    {
        a(com.vungle.publisher.db.model.AdReportEvent.a.a, null);
    }

    public void onEvent(g g1)
    {
        g1 = g1.a;
        if (g1 != com.vungle.publisher.db.model.EventTracking.a.l) goto _L2; else goto _L1
_L1:
        a(com.vungle.publisher.db.model.AdReportEvent.a.e, null);
_L4:
        a(com.vungle.publisher.db.model.AdReportEvent.a.d, null);
        return;
_L2:
        if (g1 == com.vungle.publisher.db.model.EventTracking.a.i)
        {
            a(com.vungle.publisher.db.model.EventTracking.a.i);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void onEvent(h h1)
    {
        Ad ad1 = h1.a();
        e.a(ad1, h1.a, null, new String[] {
            ad1.g()
        });
    }

    public void onEvent(o o1)
    {
        try
        {
            j.a(Integer.valueOf(o1.a));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (o o1)
        {
            d.a("VungleReport", "error updating video duration millis", o1);
        }
    }

    public void onEvent(y y)
    {
        try
        {
            a(com.vungle.publisher.db.model.AdReportEvent.a.i, null);
            i = j.q();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (y y)
        {
            d.a("VungleReport", "error reporting replay", y);
        }
    }

    public void onEvent(z z)
    {
        a(com.vungle.publisher.db.model.EventTracking.a.j);
    }

    static 
    {
        f = (new com.vungle.publisher.db.model.EventTracking.a[] {
            com.vungle.publisher.db.model.EventTracking.a.c, com.vungle.publisher.db.model.EventTracking.a.d, com.vungle.publisher.db.model.EventTracking.a.e, com.vungle.publisher.db.model.EventTracking.a.f, com.vungle.publisher.db.model.EventTracking.a.g, com.vungle.publisher.db.model.EventTracking.a.h
        });
    }
}
