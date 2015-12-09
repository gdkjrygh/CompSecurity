// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher.db.model;

import android.content.ContentValues;
import android.database.Cursor;
import com.vungle.log.Logger;
import com.vungle.publisher.bg;
import com.vungle.publisher.bi;
import java.util.List;
import javax.inject.Provider;

// Referenced classes of package com.vungle.publisher.db.model:
//            AdReport

public class LocalAdReport extends AdReport
{
    public static class Factory extends AdReport.BaseFactory
    {

        LocalAd.Factory b;
        LocalAdPlay.Factory d;
        Provider e;

        private LocalAdReport a(LocalAdReport localadreport, Cursor cursor, boolean flag)
        {
            super.a(localadreport, cursor, flag);
            localadreport.p = bg.e(cursor, "download_end_millis");
            return localadreport;
        }

        public final volatile int a(List list)
        {
            return super.a(list);
        }

        protected final volatile bi a(bi bi1, Cursor cursor)
        {
            return a((LocalAdReport)bi1, cursor, false);
        }

        protected final volatile Ad.Factory a()
        {
            return b;
        }

        protected final volatile AdReport a(AdReport adreport, Cursor cursor, boolean flag)
        {
            return a((LocalAdReport)adreport, cursor, flag);
        }

        protected final volatile AdPlay.Factory b()
        {
            return d;
        }

        protected final volatile Object[] b(int i)
        {
            return new Integer[i];
        }

        protected final Ad.b c()
        {
            return Ad.b.a;
        }

        protected final volatile bi[] c(int i)
        {
            return new LocalAdReport[i];
        }

        protected final bi c_()
        {
            return (LocalAdReport)e.get();
        }

        public final volatile List d()
        {
            return super.d();
        }

        public final volatile List d(int i)
        {
            return super.d(i);
        }

        protected final String e_()
        {
            return "ad_report";
        }

        protected Factory()
        {
        }
    }


    Long p;
    Factory q;
    LocalAdPlay.Factory r;

    protected LocalAdReport()
    {
    }

    public final int A()
    {
        if (p == null)
        {
            Logger.w("VungleReport", (new StringBuilder("download end millis null for ")).append(y()).toString());
            return -1;
        }
        if (p.longValue() < 0L)
        {
            return 0;
        }
        if (d == null)
        {
            Logger.w("VungleReport", (new StringBuilder("insert timestamp millis null for ")).append(y()).toString());
            return -1;
        } else
        {
            return (int)(p.longValue() - d.longValue());
        }
    }

    protected final ContentValues a(boolean flag)
    {
        ContentValues contentvalues = super.a(flag);
        contentvalues.put("download_end_millis", p);
        return contentvalues;
    }

    protected final volatile com.vungle.publisher.bi.a a_()
    {
        return q;
    }

    protected final volatile AdPlay.Factory c()
    {
        return r;
    }

    public final void d(Long long1)
    {
        p = long1;
        Logger.d("VungleReport", (new StringBuilder("setting ad download end millis ")).append(long1).append(" (duration ").append(A()).append(" ms) for ").append(y()).toString());
        x();
    }

    public final StringBuilder p()
    {
        StringBuilder stringbuilder = super.p();
        bi.a(stringbuilder, "download_end_millis", p, false);
        return stringbuilder;
    }
}
