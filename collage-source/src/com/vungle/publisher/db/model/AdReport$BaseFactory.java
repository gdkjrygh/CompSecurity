// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher.db.model;

import android.database.Cursor;
import com.vungle.log.Logger;
import com.vungle.publisher.bg;
import com.vungle.publisher.bi;
import com.vungle.publisher.de;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.vungle.publisher.db.model:
//            AdReport, Ad

public static abstract class  extends com.vungle.publisher.eFactory
{

     a;

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

    protected volatile bi a(bi bi, Cursor cursor)
    {
        return a((AdReport)bi, cursor, false);
    }

    protected abstract a a();

    public final AdReport a(Ad ad)
    {
        AdReport adreport1 = b(ad);
        AdReport adreport = adreport1;
        if (adreport1 == null)
        {
            adreport = (AdReport)c_();
            adreport.a = ad;
            adreport.g = ;
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
        adreport.g = (c_)bg.a(cursor, "status", com/vungle/publisher/db/model/AdReport$a);
        adreport.h = bg.e(cursor, "update_timestamp_millis");
        adreport.i = bg.d(cursor, "video_duration_millis");
        adreport.j = bg.e(cursor, "view_end_millis");
        adreport.k = bg.e(cursor, "view_start_millis");
        return adreport;
    }

    protected abstract c_ b();

    public final AdReport b(Ad ad)
    {
        Object obj = aseFactory.c_();
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
        for (int i = 0; i <= 0; i++)
        {
            as[1] = (new String[] {
                obj
            })[0];
        }

        obj = a((new StringBuilder("ad_id = ? AND ")).append("status = ?").toString(), as, "insert_timestamp_millis DESC");
        String s = (new StringBuilder("ad_id = ? AND ")).append("status = ?").append(", with params: ").append(de.a(as)).toString();
        int j = ((List) (obj)).size();
        switch (j)
        {
        default:
            Logger.w("VungleDatabase", (new StringBuilder()).append(j).append(" ad_report records for ").append(s).toString());
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

    protected abstract a c();

    protected final List f()
    {
        List list = a("status = ? AND ad_id IN (SELECT id FROM ad WHERE type = ?)", new String[] {
            a.a(), c().c()
        }, "insert_timestamp_millis ASC");
        for (Iterator iterator = list.iterator(); iterator.hasNext(); a((AdReport)iterator.next(), ((Ad) (null)), true)) { }
        return list;
    }

    protected ()
    {
    }
}
