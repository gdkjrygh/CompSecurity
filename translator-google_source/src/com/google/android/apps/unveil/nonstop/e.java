// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.unveil.nonstop;

import android.os.SystemClock;
import com.google.android.apps.unveil.env.af;
import com.google.android.apps.unveil.env.i;
import com.google.android.apps.unveil.env.w;
import com.google.android.apps.unveil.sensors.CameraManager;
import com.google.android.apps.unveil.sensors.k;
import java.util.Vector;

// Referenced classes of package com.google.android.apps.unveil.nonstop:
//            c, m

public class e extends c
    implements k
{

    public boolean a;
    private final af j = new af();
    private final w k = new w();
    private final w l = new w();
    private final CameraManager m;
    private final Vector n = new Vector();
    private boolean o;
    private volatile boolean p;
    private int q;
    private int r;
    private long s;
    private long t;
    private int u[];
    private boolean v;
    private int w[];
    private long x;
    private long y;

    public e(CameraManager cameramanager)
    {
        o = false;
        p = false;
        q = 0;
        r = 0;
        s = 0L;
        v = false;
        m = cameramanager;
    }

    public void a(m m1)
    {
        boolean flag = true;
        this;
        JVM INSTR monitorenter ;
        boolean flag1;
        v = true;
        flag1 = m.h();
        m1.e = Boolean.valueOf(flag1);
        if (!flag1) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (p)
        {
            k.c();
            k.a();
            l.b();
            l.c();
            if (u == null)
            {
                q = 1;
                u = m1.i();
            }
            p = false;
        }
        w = m1.j();
        if (!m.f())
        {
            break MISSING_BLOCK_LABEL_596;
        }
        if (o) goto _L4; else goto _L3
_L3:
        int i1 = ((flag) ? 1 : 0);
_L14:
        if (i1 == 0) goto _L1; else goto _L5
_L5:
        if (r > 8) goto _L7; else goto _L6
_L6:
        q = q + 1;
_L19:
        synchronized (m)
        {
            if (!m.h())
            {
                o = true;
                y = Math.max(-4000L, y - k.d());
                y = (long)(((float)y + 8000F) * 1.5F - 8000F);
                y = Math.min(8000L, y);
                m.a(this);
            }
        }
          goto _L1
        exception;
        m1;
        JVM INSTR monitorexit ;
        throw exception;
        m1;
        this;
        JVM INSTR monitorexit ;
        throw m1;
_L4:
        if (u != null) goto _L9; else goto _L8
_L8:
        r = 100;
_L16:
        if (r > 30)
        {
            y = -150L;
        }
        if (w != null) goto _L11; else goto _L10
_L10:
        j.c("Hopefully this is a test!", new Object[0]);
        long l1 = 8000L;
_L17:
        x = l1;
        l1 = k.d();
        if (l1 < y)
        {
            break MISSING_BLOCK_LABEL_596;
        }
        if (r >= 8)
        {
            q = 0;
        }
        if (q >= 3)
        {
            break MISSING_BLOCK_LABEL_596;
        }
        if (r <= 8 && !a) goto _L13; else goto _L12
_L12:
        long l2 = SystemClock.currentThreadTimeMillis();
        a = m1.f();
        t = SystemClock.currentThreadTimeMillis() - l2;
        if (!a)
        {
            break MISSING_BLOCK_LABEL_571;
        }
        l.a();
_L18:
        if (!a)
        {
            u = m1.i();
        }
        i1 = ((flag) ? 1 : 0);
        if (l.d() > 150L) goto _L14; else goto _L13
_L13:
        i1 = ((flag) ? 1 : 0);
        if (l1 > x) goto _L14; else goto _L15
_L15:
        break MISSING_BLOCK_LABEL_596;
_L9:
        l1 = SystemClock.currentThreadTimeMillis();
        r = m1.a(u);
        s = SystemClock.currentThreadTimeMillis() - l1;
          goto _L16
_L11:
        float f1;
        float f2;
        float f3;
        i1 = w.length;
        f3 = 1.0F + i.c(w);
        f2 = (float)i1 / 2.0F;
        f1 = Math.abs(f3 - f2);
        float f;
        f = f1;
        if (f3 > f2)
        {
            f = f1 * 1.2F;
        }
        f1 = (float)i1 - f2;
        l1 = (long)(8000F - (float)Math.pow(Math.min(f * 1.5F, f1) / f1, 1.5D) * 7900F);
          goto _L17
        l.b();
        l.c();
          goto _L18
_L7:
        u = null;
          goto _L19
        i1 = 0;
          goto _L14
    }

    public final void a(boolean flag)
    {
        p = true;
    }

    protected final void d()
    {
        o = false;
        a = true;
        u = null;
        r = 0;
        y = -4000L;
        q = 0;
    }

    public final Vector g()
    {
        int i1 = 0;
        this;
        JVM INSTR monitorenter ;
        if (!v) goto _L2; else goto _L1
_L1:
        Vector vector;
        n.clear();
        vector = n;
        Object obj;
        int ai[];
        int k1;
        int l1;
        long l2;
        if (a)
        {
            obj = "blurred";
        } else
        {
            obj = "focused";
        }
        l2 = t;
        vector.add((new StringBuilder(String.valueOf(obj).length() + 24)).append(((String) (obj))).append(": ").append(l2).append("ms").toString());
        obj = n;
        k1 = r;
        l2 = s;
        l1 = q;
        ((Vector) (obj)).add((new StringBuilder(74)).append("lastDiffPercent: ").append(k1).append(" ").append(l2).append("ms, num same: ").append(l1).toString());
        obj = "";
        ai = w;
        k1 = ai.length;
_L4:
        if (i1 >= k1)
        {
            break; /* Loop/switch isn't completed */
        }
        l1 = ai[i1];
        obj = String.valueOf(obj);
        l1 /= 100;
        obj = (new StringBuilder(String.valueOf(obj).length() + 13)).append(((String) (obj))).append(l1).append(", ").toString();
        i1++;
        if (true) goto _L4; else goto _L3
_L3:
        ai = n;
        obj = String.valueOf(obj);
        if (((String) (obj)).length() == 0)
        {
            break MISSING_BLOCK_LABEL_494;
        }
        obj = "buckets: ".concat(((String) (obj)));
_L5:
        ai.add(obj);
        obj = n;
        int j1 = i.b(w);
        float f = i.c(w);
        float f1 = i.a(w);
        ((Vector) (obj)).add((new StringBuilder(75)).append("buckets median: ").append(j1).append("  mean: ").append(f).append("  stdDev: ").append(f1).toString());
        obj = n;
        long l3 = k.d();
        ((Vector) (obj)).add((new StringBuilder(40)).append("Since last focus: ").append(l3).append("ms").toString());
        obj = n;
        l3 = x;
        ((Vector) (obj)).add((new StringBuilder(38)).append("Exposure delay: ").append(l3).append("ms").toString());
        obj = n;
        l3 = y;
        ((Vector) (obj)).add((new StringBuilder(37)).append("Focus fatigue: ").append(l3).append("ms").toString());
        v = false;
_L2:
        obj = n;
        this;
        JVM INSTR monitorexit ;
        return ((Vector) (obj));
        obj = new String("buckets: ");
          goto _L5
        obj;
        throw obj;
    }
}
