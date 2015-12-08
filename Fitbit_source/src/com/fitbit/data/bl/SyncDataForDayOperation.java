// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import com.fitbit.e.a;
import com.fitbit.savedstate.m;
import com.fitbit.util.o;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONException;

// Referenced classes of package com.fitbit.data.bl:
//            ag, bu, bd, bp, 
//            cj, fo, er, fb, 
//            cd, ew, df, by, 
//            fr, bn, fp, fe, 
//            ef, el, bk, bw, 
//            fn, cy, bm, eq, 
//            dg, ez, dm, bs

public class SyncDataForDayOperation extends ag
{
    public static final class DailyDataType extends Enum
    {

        public static final DailyDataType a;
        public static final DailyDataType b;
        public static final DailyDataType c;
        public static final DailyDataType d;
        public static final DailyDataType e;
        public static final DailyDataType f;
        public static final DailyDataType g;
        public static final DailyDataType h;
        public static final DailyDataType i;
        public static final DailyDataType j;
        public static final DailyDataType k;
        public static final DailyDataType l;
        public static final DailyDataType m;
        public static final DailyDataType n;
        public static final DailyDataType o;
        public static final DailyDataType p;
        public static final DailyDataType q;
        public static final DailyDataType r;
        public static final DailyDataType s;
        public static final DailyDataType t;
        private static final DailyDataType u[];

        public static DailyDataType valueOf(String s1)
        {
            return (DailyDataType)Enum.valueOf(com/fitbit/data/bl/SyncDataForDayOperation$DailyDataType, s1);
        }

        public static DailyDataType[] values()
        {
            return (DailyDataType[])u.clone();
        }

        static 
        {
            a = new DailyDataType("ACTIVITY_LOGS", 0);
            b = new DailyDataType("CALORIES_TIME_SERIES", 1);
            c = new DailyDataType("FOOD_LOGS", 2);
            d = new DailyDataType("WATER_LOGS", 3);
            e = new DailyDataType("SLEEP_LOGS", 4);
            f = new DailyDataType("FLOORS_TIME_SERIES", 5);
            g = new DailyDataType("STEPS_TIME_SERIES", 6);
            h = new DailyDataType("STEPS_INTRADAY_TIME_SERIES", 7);
            i = new DailyDataType("CALORIES_INTRADAY_TIME_SERIES", 8);
            j = new DailyDataType("FLOORS_INTRADAY_TIME_SERIES", 9);
            k = new DailyDataType("DISTANCE_TIME_SERIES", 10);
            l = new DailyDataType("BODY_LOGS", 11);
            m = new DailyDataType("WEIGHT_GOAL", 12);
            n = new DailyDataType("PROFILE", 13);
            o = new DailyDataType("DEVICES", 14);
            p = new DailyDataType("WATER_GOAL", 15);
            q = new DailyDataType("HEART_RATE_INTRADAY_TIME_SERIES", 16);
            r = new DailyDataType("HEART_RATE_SUMMARY", 17);
            s = new DailyDataType("BODY_FAT_GOAL", 18);
            t = new DailyDataType("SLEEP_GOAL", 19);
            u = (new DailyDataType[] {
                a, b, c, d, e, f, g, h, i, j, 
                k, l, m, n, o, p, q, r, s, t
            });
        }

        private DailyDataType(String s1, int i1)
        {
            super(s1, i1);
        }
    }


    public static DailyDataType f[];
    private static final String g = "SyncDataForDayOperation";
    private static final Set h;
    private Date i;
    private String j;

    public transient SyncDataForDayOperation(bs bs1, boolean flag, Object obj, Date date, DailyDataType adailydatatype[])
    {
        boolean flag1;
        int k;
        int l;
        flag1 = false;
        super(bs1, flag);
        i = date;
        Collections.sort(Arrays.asList(adailydatatype), new _cls2());
        j = a(adailydatatype);
        l = adailydatatype.length;
        k = 0;
_L23:
        boolean flag2;
        if (k >= l)
        {
            break MISSING_BLOCK_LABEL_994;
        }
        obj = adailydatatype[k];
        flag2 = flag1;
        if (!flag1)
        {
            flag2 = flag1;
            if (h.contains(obj))
            {
                flag2 = true;
                a(new bu(e(), flag, date));
            }
        }
    /* anonymous class not found */
    class _anm3 {}

        com.fitbit.data.bl._cls3.a[((DailyDataType) (obj)).ordinal()];
        JVM INSTR tableswitch 1 20: default 208
    //                   1 221
    //                   2 245
    //                   3 277
    //                   4 301
    //                   5 325
    //                   6 427
    //                   7 459
    //                   8 491
    //                   9 518
    //                   10 545
    //                   11 572
    //                   12 599
    //                   13 621
    //                   14 742
    //                   15 767
    //                   16 842
    //                   17 889
    //                   18 914
    //                   19 944
    //                   20 969;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21
_L21:
        break MISSING_BLOCK_LABEL_969;
_L1:
        break; /* Loop/switch isn't completed */
_L2:
        break; /* Loop/switch isn't completed */
_L24:
        k++;
        flag1 = flag2;
        if (true) goto _L23; else goto _L22
_L22:
        a(new bd(bs1, flag, date), com.fitbit.data.bl.DailyDataType.a.ordinal());
          goto _L24
_L3:
        a(new bp(bs1, o.d(date), o.f(date), flag), DailyDataType.b.ordinal());
          goto _L24
_L4:
        a(new cj(bs1, flag, date), DailyDataType.c.ordinal());
          goto _L24
_L5:
        a(new fo(bs1, flag, date), DailyDataType.d.ordinal());
          goto _L24
_L6:
        a(new er(bs1, flag, date), DailyDataType.e.ordinal());
        a(new fb(e(), com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.AWAKENINGS_COUNT, o.d(date), o.f(date), flag), DailyDataType.e.ordinal() + 1001);
        a(new fb(e(), com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.MINUTES_ASLEEP, o.d(date), o.f(date), flag), DailyDataType.e.ordinal() + 1002);
          goto _L24
_L7:
        a(new cd(bs1, o.d(date), o.f(date), flag), DailyDataType.f.ordinal());
          goto _L24
_L8:
        a(new ew(bs1, o.d(date), o.f(date), flag), DailyDataType.g.ordinal());
          goto _L24
_L9:
        a(new df(bs1, com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.HEART_RATE_INTRADAY, date, flag), DailyDataType.q.ordinal());
          goto _L24
_L10:
        a(new df(bs1, com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.CALORIES_INTRADAY, date, flag), DailyDataType.i.ordinal());
          goto _L24
_L11:
        a(new df(bs1, com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.FLOORS_INTRADAY, date, flag), DailyDataType.j.ordinal());
          goto _L24
_L12:
        a(new df(bs1, com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.STEPS_INTRADAY, date, flag), DailyDataType.h.ordinal());
          goto _L24
_L13:
        a(new by(bs1, flag), DailyDataType.k.ordinal());
          goto _L24
_L14:
        a(new fr(bs1, o.d(date), o.f(date), flag), DailyDataType.l.ordinal() + 1000);
        a(new bn(bs1, o.d(date), o.f(date), flag), DailyDataType.l.ordinal() + 1001);
        a(new fb(bs1, com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.BODY_WEIGHT, flag), DailyDataType.l.ordinal() + 1002);
        a(new fb(bs1, com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.BODY_FAT, flag), DailyDataType.l.ordinal() + 1003);
          goto _L24
_L15:
        a(new fp(e(), flag), com.fitbit.data.bl.DailyDataType.m.ordinal());
          goto _L24
_L16:
        a(new fe(e(), flag), DailyDataType.n.ordinal());
        a(new ef(e(), flag), DailyDataType.n.ordinal());
        if (m.h())
        {
            a(new el(e(), flag), DailyDataType.n.ordinal());
        }
          goto _L24
_L17:
        a(new bk(e(), flag), com.fitbit.data.bl.DailyDataType.o.ordinal());
        a(new bw(e(), flag), com.fitbit.data.bl.DailyDataType.o.ordinal());
          goto _L24
_L18:
        a(new fn(e(), flag), com.fitbit.data.bl.DailyDataType.m.ordinal());
          goto _L24
_L19:
        a(new cy(e(), flag, date, com.fitbit.serverinteraction.PublicAPI.DataRange.d), DailyDataType.r.ordinal());
          goto _L24
_L20:
        a(new bm(e(), flag), DailyDataType.s.ordinal());
          goto _L24
        a(new eq(e(), flag), DailyDataType.t.ordinal());
          goto _L24
    }

    private static final String a(DailyDataType adailydatatype[])
    {
        int k = 0;
        if (adailydatatype == null || adailydatatype.length == 0)
        {
            return null;
        }
        DailyDataType adailydatatype1[] = new DailyDataType[adailydatatype.length];
        System.arraycopy(adailydatatype, 0, adailydatatype1, 0, adailydatatype.length);
        Arrays.sort(adailydatatype1, new _cls1());
        adailydatatype = new StringBuilder();
        for (int l = adailydatatype1.length; k < l; k++)
        {
            adailydatatype.append(adailydatatype1[k].name());
        }

        return adailydatatype.toString();
    }

    public static transient void a(Date date, DailyDataType adailydatatype[])
    {
        date = c(date, adailydatatype);
        dg.d().c().d(date);
    }

    public static transient void b(Date date, DailyDataType adailydatatype[])
    {
        date = c(date, adailydatatype);
        dg.d().c().b(date);
        com.fitbit.e.a.a("SyncDataForDayOperation", "Operation [%s] throttled explicitly", new Object[] {
            date
        });
    }

    private static transient String c(Date date, DailyDataType adailydatatype[])
    {
        return (new StringBuilder()).append(com.fitbit.data.bl.dm.a("SyncDataForDayOperation", date)).append(a(adailydatatype)).toString();
    }

    public void a(h.a a1)
        throws ServerCommunicationException, JSONException
    {
        e().a(true);
        super.a(a1);
        e().a(false);
        return;
        a1;
        e().a(false);
        throw a1;
    }

    public String c()
    {
        return (new StringBuilder()).append(com.fitbit.data.bl.dm.a("SyncDataForDayOperation", i)).append(j).toString();
    }

    static 
    {
        f = (new DailyDataType[] {
            com.fitbit.data.bl.DailyDataType.a, DailyDataType.c, DailyDataType.d, DailyDataType.e, DailyDataType.l, com.fitbit.data.bl.DailyDataType.m, DailyDataType.n, com.fitbit.data.bl.DailyDataType.o, DailyDataType.p, DailyDataType.r, 
            DailyDataType.t, DailyDataType.s
        });
        HashSet hashset = new HashSet();
        hashset.add(DailyDataType.b);
        hashset.add(DailyDataType.f);
        hashset.add(DailyDataType.g);
        hashset.add(DailyDataType.k);
        hashset.add(com.fitbit.data.bl.DailyDataType.a);
        h = Collections.unmodifiableSet(hashset);
    }

    /* member class not found */
    class _cls2 {}


    /* member class not found */
    class _cls1 {}

}
