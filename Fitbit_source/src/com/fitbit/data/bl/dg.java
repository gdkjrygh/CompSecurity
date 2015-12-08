// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import android.net.Uri;
import com.fitbit.FitBitApplication;
import com.fitbit.data.bl.exceptions.JsonException;
import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import com.fitbit.data.domain.ActivityItem;
import com.fitbit.data.domain.FoodItem;
import com.fitbit.data.domain.device.Device;
import com.fitbit.data.domain.device.TrackerType;
import com.fitbit.e.a;
import com.fitbit.serverinteraction.PublicAPI;
import com.fitbit.serverinteraction.ServerGateway;
import com.fitbit.serverinteraction.u;
import com.fitbit.serverinteraction.v;
import com.fitbit.util.p;
import com.fitbit.widget.b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;

// Referenced classes of package com.fitbit.data.bl:
//            bs, ez, ao, SyncDataForDayOperation, 
//            bd, er, dd, bu, 
//            bw, fe, cg, fx, 
//            ef, fq, bi, x, 
//            cz, cy, eu, fh, 
//            aj, cp, ct, cv, 
//            ck, y, fb, cr, 
//            bz, dx, ba, ca, 
//            co, fv, fr, es, 
//            dk, br, eg, cm, 
//            eo, fk, fg, dw, 
//            do, dr, dz, dt, 
//            bq, ek, cb, ce, 
//            be, dh, bt, fl, 
//            fi, bg, ex, el, 
//            ch, bk

public class dg
    implements bs
{
    private final class a
        implements h.a
    {

        final dg a;
        private final h.a b;

        public boolean a()
        {
            return !com.fitbit.data.bl.dg.a(a) || b != null && b.a();
        }

        public a(h.a a1)
        {
            a = dg.this;
            super();
            b = a1;
        }
    }


    public static final String a = "SyncManager";
    public static final String b = String.format("%s.EXTRA_LOCAL_ID", new Object[] {
        com/fitbit/data/bl/dg.getName()
    });
    public static final String c = String.format("%s.EXTRA_LOCAL_IDS", new Object[] {
        com/fitbit/data/bl/dg.getName()
    });
    private static final long d = 0x1b7740L;
    private static final String e = "syncAll";
    private static dg f;
    private final ServerGateway g = ServerGateway.a();
    private final List h = new ArrayList();
    private final PublicAPI i;
    private final ao j = new ao();
    private final ez k = new ez();
    private final Object l = new Object();
    private final Object m = new Object();
    private volatile boolean n;
    private int o;

    private dg()
    {
        n = true;
        k.a(Long.valueOf(0x1b7740L), "syncAll");
        i = new PublicAPI(g);
    }

    private void a(int i1)
    {
        int j1 = 0;
        com.fitbit.e.a.a("SyncManager", "Reseting tracker depended data throttle for %s days", new Object[] {
            Integer.valueOf(i1)
        });
        Calendar calendar = Calendar.getInstance();
        for (; j1 < i1; j1++)
        {
            Date date = calendar.getTime();
            com.fitbit.data.bl.SyncDataForDayOperation.a(date, SyncDataForDayOperation.f);
            com.fitbit.data.bl.bd.a(date);
            com.fitbit.data.bl.er.a(date);
            calendar.add(5, -1);
        }

        com.fitbit.data.bl.dd.b();
        com.fitbit.data.bl.bu.b();
        com.fitbit.data.bl.bw.b();
    }

    private void a(boolean flag, boolean flag1)
    {
        Object obj = m;
        obj;
        JVM INSTR monitorenter ;
        boolean flag3 = e();
        if (!flag) goto _L2; else goto _L1
_L1:
        o = o + 1;
_L14:
        boolean flag4 = e();
        if (flag3 == flag4) goto _L4; else goto _L3
_L3:
        Object obj1 = h.iterator();
_L13:
        if (!((Iterator) (obj1)).hasNext()) goto _L6; else goto _L5
_L5:
        u u1 = (u)((WeakReference)((Iterator) (obj1)).next()).get();
        if (u1 == null) goto _L8; else goto _L7
_L7:
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_196;
        }
        if (u1 instanceof v)
        {
            break MISSING_BLOCK_LABEL_196;
        }
          goto _L8
_L15:
        boolean flag2;
        if (!flag2) goto _L10; else goto _L9
_L9:
        if (!flag) goto _L12; else goto _L11
_L11:
        u1.e();
          goto _L13
        obj1;
        com.fitbit.e.a.a("SyncManager", ((Exception) (obj1)).toString(), new Object[0]);
_L4:
        obj;
        JVM INSTR monitorexit ;
        return;
_L2:
        o = o - 1;
          goto _L14
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
_L8:
        flag2 = false;
          goto _L15
_L12:
        u1.g();
          goto _L13
_L10:
        if (u1 != null) goto _L13; else goto _L16
_L16:
        ((Iterator) (obj1)).remove();
          goto _L13
_L6:
        d(flag);
          goto _L4
        flag2 = true;
          goto _L15
    }

    static boolean a(dg dg1)
    {
        return dg1.n;
    }

    public static dg d()
    {
        com/fitbit/data/bl/dg;
        JVM INSTR monitorenter ;
        dg dg1;
        if (f == null)
        {
            f = new dg();
        }
        dg1 = f;
        com/fitbit/data/bl/dg;
        JVM INSTR monitorexit ;
        return dg1;
        Exception exception;
        exception;
        throw exception;
    }

    private void d(boolean flag)
    {
        if (!flag)
        {
            com.fitbit.widget.b.a(FitBitApplication.a());
        }
    }

    public void A(boolean flag, h.a a1)
        throws ServerCommunicationException, JSONException
    {
        (new fe(this, flag)).b(new a(a1));
    }

    public FoodItem a(long l1, h.a a1)
        throws ServerCommunicationException, JSONException
    {
        h(true, null);
        cg cg1 = new cg(this, l1);
        cg1.b(new a(a1));
        return cg1.b();
    }

    public PublicAPI a()
    {
        return i;
    }

    public void a(Uri uri, h.a a1)
        throws ServerCommunicationException, JSONException
    {
        (new fx(this, true, uri)).b(new a(a1));
        g(true, new a(a1));
        (new ef(this, true)).b(new a(a1));
    }

    public void a(SyncDataForLongPeriodOperation.Ranges ranges, boolean flag, h.a a1)
        throws ServerCommunicationException, JSONException
    {
        (new fq(this, ranges, flag)).b(new a(a1));
    }

    public void a(SyncDataForLongPeriodOperation.Ranges ranges, boolean flag, com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType timeseriesresourcetype, h.a a1)
        throws ServerCommunicationException, JSONException
    {
        (new bi(this, ranges, flag, new com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType[] {
            timeseriesresourcetype
        })).b(new a(a1));
    }

    public void a(SyncDataForLongPeriodOperation.Ranges ranges, boolean flag, boolean flag1, h.a a1)
        throws ServerCommunicationException, JSONException
    {
        com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType atimeseriesresourcetype[];
        if (flag1)
        {
            atimeseriesresourcetype = new com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType[3];
            atimeseriesresourcetype[0] = com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.CALORIES;
            atimeseriesresourcetype[1] = com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.STEPS;
            atimeseriesresourcetype[2] = com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.FLOORS;
        } else
        {
            atimeseriesresourcetype = new com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType[2];
            atimeseriesresourcetype[0] = com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.CALORIES;
            atimeseriesresourcetype[1] = com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.STEPS;
        }
        (new bi(this, ranges, flag, atimeseriesresourcetype)).b(new a(a1));
    }

    public void a(h.a a1)
        throws ServerCommunicationException, JSONException
    {
        k.a();
        (new x(this)).b(new a(a1));
    }

    public void a(h.a a1, Date date)
        throws ServerCommunicationException, JSONException
    {
        (new cz(this, false, date)).b(new a(a1));
    }

    public void a(h.a a1, Date date, com.fitbit.serverinteraction.PublicAPI.DataRange datarange)
        throws ServerCommunicationException, JSONException
    {
        (new cy(this, false, date, datarange)).b(new a(a1));
    }

    public void a(h.a a1, boolean flag)
        throws ServerCommunicationException, JSONException
    {
        (new eu(this, false)).b(new a(a1));
        if (flag)
        {
            f(a1);
        }
    }

    public void a(TrackerType trackertype, h.a a1)
        throws ServerCommunicationException, JSONException
    {
        (new fh(this, trackertype)).b(new a(a1));
    }

    public void a(u u1)
    {
label0:
        {
            synchronized (m)
            {
                Iterator iterator = h.iterator();
                do
                {
                    if (!iterator.hasNext())
                    {
                        break label0;
                    }
                } while ((u)((WeakReference)iterator.next()).get() != u1);
            }
            return;
        }
        h.add(new WeakReference(u1));
        if (e())
        {
            u1.e();
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        u1;
        obj;
        JVM INSTR monitorexit ;
        throw u1;
    }

    public void a(String s1, h.a a1)
        throws ServerCommunicationException, JSONException
    {
        (new aj(this, s1)).b(new a(a1));
    }

    public void a(Date date, h.a a1)
        throws ServerCommunicationException, JSONException
    {
        a(date, false, ((h.a) (new a(a1))), new SyncDataForDayOperation.DailyDataType[0]);
    }

    public void a(Date date, boolean flag, h.a a1)
        throws ServerCommunicationException, JSONException
    {
        (new cp(this, flag)).b(new a(a1));
    }

    public void a(boolean flag)
    {
        a(flag, false);
    }

    public void a(boolean flag, long l1, h.a a1)
        throws ServerCommunicationException, JSONException
    {
        A(false, a1);
        (new ct(this, flag, l1)).b(new a(a1));
    }

    public void a(boolean flag, h.a a1)
        throws ServerCommunicationException, JSONException
    {
        A(false, a1);
        (new cv(this, flag)).b(new a(a1));
    }

    public void a(boolean flag, h.a a1, int i1, int j1)
        throws ServerCommunicationException, JSONException
    {
        (new ck(this, flag, i1, j1)).b(new a(a1));
    }

    public void a(boolean flag, h.a a1, String s1)
        throws ServerCommunicationException, JSONException
    {
        (new y(this, flag, s1)).b(new a(a1));
    }

    public void a(boolean flag, com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType timeseriesresourcetype, Date date, Date date1, h.a a1)
        throws ServerCommunicationException, JSONException
    {
        (new fb(this, timeseriesresourcetype, date, date1, flag)).b(new a(a1));
    }

    public void a(boolean flag, com.fitbit.friends.ui.ScanNetworkOperationBinder.WhatsScanning whatsscanning, int i1, h.a a1)
        throws ServerCommunicationException, JSONException
    {
        A(false, a1);
        (new cr(this, whatsscanning, i1, flag)).b(new a(a1));
    }

    public void a(boolean flag, String s1, h.a a1)
        throws ServerCommunicationException, JSONException
    {
        A(false, a1);
        (new ct(this, flag, s1)).b(new a(a1));
    }

    public void a(boolean flag, String s1, String s2, h.a a1)
        throws ServerCommunicationException, JSONException
    {
        (new bz(this, flag, s1, s2)).b(new a(a1));
    }

    public void a(boolean flag, boolean flag1, h.a a1)
        throws ServerCommunicationException, JSONException
    {
        Object obj = l;
        if (!flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        (new dx(this, flag1, obj, flag)).b(new a(a1));
    }

    public transient boolean a(Date date, boolean flag, h.a a1, SyncDataForDayOperation.DailyDataType adailydatatype[])
        throws ServerCommunicationException, JSONException
    {
        return (new SyncDataForDayOperation(this, flag, l, date, adailydatatype)).b(new a(a1));
    }

    public ao b()
    {
        return j;
    }

    public ActivityItem b(long l1, h.a a1)
        throws ServerCommunicationException
    {
        ba ba1 = new ba(this, l1);
        try
        {
            ba1.b(new a(a1));
        }
        // Misplaced declaration of an exception variable
        catch (h.a a1)
        {
            throw new JsonException(a1);
        }
        return ba1.b();
    }

    public void b(SyncDataForLongPeriodOperation.Ranges ranges, boolean flag, h.a a1)
        throws ServerCommunicationException, JSONException
    {
        (new ca(this, ranges, flag)).b(new a(a1));
    }

    public void b(h.a a1)
        throws ServerCommunicationException, JSONException
    {
        (new co(this, true, false)).b(new a(a1));
    }

    public void b(u u1)
    {
        Object obj = m;
        obj;
        JVM INSTR monitorenter ;
        Iterator iterator = h.iterator();
_L2:
        u u2;
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_68;
            }
            u2 = (u)((WeakReference)iterator.next()).get();
        } while (u2 != u1 && u2 != null);
        iterator.remove();
        if (true) goto _L2; else goto _L1
_L1:
        u1;
        obj;
        JVM INSTR monitorexit ;
        throw u1;
        obj;
        JVM INSTR monitorexit ;
    }

    public void b(String s1, h.a a1)
        throws ServerCommunicationException, JSONException
    {
        (new fv(this, s1)).b(new a(a1));
        (new bw(this, true)).b(new a(a1));
    }

    public void b(boolean flag)
    {
        a(flag, true);
    }

    public void b(boolean flag, h.a a1)
        throws ServerCommunicationException, JSONException
    {
        (new fr(d(), true)).b(new a(a1));
    }

    public void b(boolean flag, h.a a1, int i1, int j1)
        throws ServerCommunicationException, JSONException
    {
        (new es(this, flag, i1, j1)).b(new a(a1));
    }

    public void b(boolean flag, boolean flag1, h.a a1)
        throws ServerCommunicationException, JSONException
    {
        (new dk(this, flag, flag1)).b(new a(a1));
    }

    public ez c()
    {
        return k;
    }

    public void c(SyncDataForLongPeriodOperation.Ranges ranges, boolean flag, h.a a1)
        throws ServerCommunicationException, JSONException
    {
        (new br(this, ranges, flag)).b(new a(a1));
    }

    public void c(h.a a1)
        throws ServerCommunicationException, JSONException
    {
        (new eg(this)).b(new a(a1));
    }

    public void c(boolean flag)
    {
        n = flag;
    }

    public void c(boolean flag, h.a a1)
        throws ServerCommunicationException, JSONException
    {
        (new cm(this, flag)).b(new a(a1));
    }

    public void d(SyncDataForLongPeriodOperation.Ranges ranges, boolean flag, h.a a1)
        throws ServerCommunicationException, JSONException
    {
        (new eo(this, ranges, flag, new com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType[] {
            com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.AWAKENINGS_COUNT, com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.MINUTES_ASLEEP
        })).b(new a(a1));
    }

    public void d(h.a a1)
        throws ServerCommunicationException, JSONException
    {
        c(a1);
        z(true, a1);
        s(true, a1);
        v(true, a1);
        (new fk(this)).b(new a(a1));
        (new fg(this, true)).b(new a(a1));
    }

    public void d(boolean flag, h.a a1)
        throws ServerCommunicationException, JSONException
    {
        (new dx(this, flag, l, false, new dw[] {
            new do(this)
        })).b(new a(a1));
    }

    public void e(h.a a1)
        throws ServerCommunicationException, JSONException
    {
        a(a1, true);
    }

    public void e(boolean flag, h.a a1)
        throws ServerCommunicationException, JSONException
    {
        (new dx(this, flag, l, false, new dw[] {
            new dr(this)
        })).b(new a(a1));
    }

    public boolean e()
    {
        return o > 0;
    }

    public void f(h.a a1)
        throws ServerCommunicationException, JSONException
    {
        (new bw(this, true)).b(new a(a1));
        (new fg(this, true)).b(new a(a1));
    }

    public void f(boolean flag, h.a a1)
        throws ServerCommunicationException, JSONException
    {
        (new dx(this, flag, l, false, new dw[] {
            new dr(this), new do(this)
        })).b(new a(a1));
    }

    public boolean f()
    {
        return n;
    }

    public void g()
    {
        com.fitbit.e.a.a("SyncManager", "Reseting throttle after pairing", new Object[0]);
        a(15);
    }

    public void g(boolean flag, h.a a1)
        throws ServerCommunicationException, JSONException
    {
        (new dx(this, flag, l, false, new dw[] {
            new dz(this)
        })).b(new a(a1));
    }

    public void h()
    {
        long l2 = 15L;
        long l1 = 1L;
        com.fitbit.e.a.a("SyncManager", "Reseting throttle after sync", new Object[0]);
        Object obj = com.fitbit.util.p.g();
        if (obj == null)
        {
            return;
        }
        obj = ((Device) (obj)).e();
        long l3 = ((new Date()).getTime() - ((Date) (obj)).getTime()) / 0x5265c00L;
        if (l3 >= 1L)
        {
            l1 = l3;
        }
        if (l1 > 15L)
        {
            l1 = l2;
        }
        a((int)l1);
    }

    public void h(boolean flag, h.a a1)
        throws ServerCommunicationException, JSONException
    {
        (new dx(this, flag, l, false, new dw[] {
            new dt(this)
        })).b(new a(a1));
    }

    public void i(boolean flag, h.a a1)
        throws ServerCommunicationException, JSONException
    {
        a(false, flag, new a(a1));
    }

    public void j(boolean flag, h.a a1)
        throws ServerCommunicationException, JSONException
    {
        (new bq(this, flag)).b(new a(a1));
    }

    public void k(boolean flag, h.a a1)
        throws ServerCommunicationException, JSONException
    {
        (new ek(this, flag)).b(new a(a1));
    }

    public void l(boolean flag, h.a a1)
        throws ServerCommunicationException, JSONException
    {
        (new cb(this, flag)).b(new a(a1));
    }

    public void m(boolean flag, h.a a1)
        throws ServerCommunicationException, JSONException
    {
        (new ce(this, flag)).b(new a(a1));
    }

    public void n(boolean flag, h.a a1)
        throws ServerCommunicationException, JSONException
    {
        (new be(this, flag)).b(new a(a1));
    }

    public void o(boolean flag, h.a a1)
        throws ServerCommunicationException, JSONException
    {
        new dh(this, flag);
    }

    public void p(boolean flag, h.a a1)
        throws ServerCommunicationException, JSONException
    {
        (new bt(this, flag)).b(new a(a1));
    }

    public void q(boolean flag, h.a a1)
        throws ServerCommunicationException, JSONException
    {
        (new ef(this, flag)).b(new a(a1));
        c(a1);
        s(flag, a1);
        v(flag, a1);
    }

    public void r(boolean flag, h.a a1)
        throws ServerCommunicationException, JSONException
    {
        (new ef(this, flag)).b(new a(a1));
    }

    public void s(boolean flag, h.a a1)
        throws ServerCommunicationException, JSONException
    {
        (new bw(this, flag)).b(new a(a1));
    }

    public void t(boolean flag, h.a a1)
        throws ServerCommunicationException, JSONException
    {
        (new fl(this, flag)).b(new a(a1));
    }

    public void u(boolean flag, h.a a1)
        throws ServerCommunicationException, JSONException
    {
        (new fi(this, flag)).b(new a(a1));
    }

    public void v(boolean flag, h.a a1)
        throws ServerCommunicationException, JSONException
    {
        (new bg(this, flag)).b(new a(a1));
    }

    public void w(boolean flag, h.a a1)
        throws ServerCommunicationException, JSONException
    {
        (new ex(this, flag)).b(new a(a1));
    }

    public void x(boolean flag, h.a a1)
        throws ServerCommunicationException, JSONException
    {
        (new el(this, flag)).b(new a(a1));
    }

    public void y(boolean flag, h.a a1)
        throws ServerCommunicationException, JSONException
    {
        (new ch(this, flag)).b(new a(a1));
    }

    public void z(boolean flag, h.a a1)
        throws ServerCommunicationException, JSONException
    {
        (new bk(this, flag)).b(new a(a1));
    }

}
