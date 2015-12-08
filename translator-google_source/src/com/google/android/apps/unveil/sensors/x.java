// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.unveil.sensors;

import android.content.Context;
import android.hardware.SensorManager;
import com.google.android.apps.unveil.env.Viewport;
import com.google.android.apps.unveil.env.af;
import com.google.android.apps.unveil.env.i;
import com.google.android.apps.unveil.k;

// Referenced classes of package com.google.android.apps.unveil.sensors:
//            y, z, aa

public final class x extends y
    implements z
{

    private static final af d = new af();
    private float e[];
    private final aa f;
    private final y g;
    private final y h;
    private long i;
    private float j;
    private boolean k;
    private final Context l;
    private final float m[] = new float[16];
    private final float n[] = new float[16];

    public x(aa aa1, Context context)
    {
        f = aa1;
        l = context;
        g = aa1.e;
        h = aa1.f;
        g.a(this);
        h.a(this);
        j = 0.0F;
    }

    private boolean c()
    {
        return g.a() != null && h.a() != null && g.c != 0 && h.c != 0;
    }

    public final void a(y y1)
    {
        int i1;
        long l1;
        if (g.b > h.b)
        {
            l1 = g.b;
        } else
        {
            l1 = h.b;
        }
        b = l1;
        if (g.c > h.c)
        {
            i1 = h.c;
        } else
        {
            i1 = g.c;
        }
        c = i1;
        if (c())
        {
            b();
        }
    }

    public final float[] a()
    {
        float af3[];
        int i1;
        char c1;
        c1 = '\201';
        int j1;
        int l1;
        if (((k)l.getApplicationContext()).j().a == 1)
        {
            i1 = 270;
        } else
        {
            i1 = 0;
        }
        l1 = f.a();
        j1 = l1;
        if (l1 == -1)
        {
            j1 = 0;
        }
        if (!k)
        {
            i1 = j1;
        }
        if (!c() || i == b)
        {
            return e;
        }
        float af1[] = g.a();
        float af2[] = h.a();
        af3 = new float[3];
        if (!SensorManager.getRotationMatrix(m, null, af1, af2))
        {
            return e;
        }
        if (e == null)
        {
            e = new float[3];
        }
        i1;
        JVM INSTR lookupswitch 4: default 200
    //                   0: 362
    //                   90: 394
    //                   180: 382
    //                   270: 371;
           goto _L1 _L2 _L3 _L4 _L5
_L3:
        break MISSING_BLOCK_LABEL_394;
_L1:
        int k1;
        i1 = 2;
        k1 = 1;
_L6:
        SensorManager.remapCoordinateSystem(m, k1, i1, n);
        SensorManager.getOrientation(n, af3);
        float f1 = e[0];
        float f2 = com.google.android.apps.unveil.env.i.b(af3[0] - f1);
        float f3 = j;
        if (Math.abs(f2) > 30F)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (Math.abs(com.google.android.apps.unveil.env.i.b(f3 - f2)) > 10F)
        {
            k1 = 1;
        } else
        {
            k1 = 0;
        }
        if (i1 != 0 && k1 != 0)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 == 0)
        {
            e[0] = com.google.android.apps.unveil.env.i.b(0.4F * f2 + f1);
        }
        e[1] = com.google.android.apps.unveil.env.i.c(af3[1]);
        e[2] = com.google.android.apps.unveil.env.i.c(af3[2]);
        j = f2;
        i = b;
        return e;
_L2:
        i1 = 2;
        k1 = 1;
          goto _L6
_L5:
        i1 = 129;
        k1 = 2;
          goto _L6
_L4:
        i1 = 130;
        k1 = c1;
          goto _L6
        k1 = 130;
        i1 = 1;
          goto _L6
    }

}
