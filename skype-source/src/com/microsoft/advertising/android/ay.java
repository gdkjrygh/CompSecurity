// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.advertising.android;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.microsoft.advertising.android:
//            av

public final class ay
    implements SensorEventListener
{
    public static abstract class a
    {

        public boolean a;
        public boolean b;
        public boolean c;
        public a d;
        private int e;

        static int a(a a1)
        {
            return a1.e;
        }

        static void a(a a1, int i1)
        {
            a1.e = i1;
        }

        public abstract void a();

        public abstract void a(float f1, float f2, float f3);

        public abstract void a(int i1);

        public abstract void a(String s, String s1);

        public a()
        {
            a = false;
            b = false;
            c = false;
            d = new a(this);
            e = 0;
        }
    }

    public final class a.a
    {

        public float a;
        public float b;
        final a c;

        public a.a(a a1)
        {
            c = a1;
            super();
            a = 4F;
            b = 5000F;
        }
    }


    private static ay p = null;
    final double a = 0.087266462599716474D;
    SensorManager b;
    private ArrayList c;
    private float d[];
    private float e[];
    private boolean f;
    private boolean g;
    private float h[] = {
        0.0F, 0.0F, 0.0F, 0.0F
    };
    private float i[];
    private float j;
    private float k;
    private float l;
    private float m;
    private float n;
    private float o;
    private int q;

    private ay(Context context)
    {
        c = new ArrayList();
        d = new float[3];
        e = new float[3];
        f = false;
        g = false;
        i = new float[16];
        j = 0.0F;
        k = 0.0F;
        l = 0.0F;
        m = 0.0F;
        n = 0.0F;
        o = 0.0F;
        b = null;
        q = 0x30d40;
        b = (SensorManager)context.getSystemService("sensor");
    }

    public static ay a(Context context)
    {
        com/microsoft/advertising/android/ay;
        JVM INSTR monitorenter ;
        if (p == null)
        {
            p = new ay(context.getApplicationContext());
        }
        context = p;
        com/microsoft/advertising/android/ay;
        JVM INSTR monitorexit ;
        return context;
        context;
        throw context;
    }

    public final void a(a a1)
    {
        if (a1 == null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorenter ;
        if (c.size() != 0) goto _L4; else goto _L3
_L3:
        c.add(a1);
        a1 = b.getSensorList(1);
        if (a1.size() <= 0) goto _L6; else goto _L5
_L5:
        b.registerListener(this, (Sensor)a1.get(0), q);
_L12:
        a1 = b.getSensorList(2);
        if (a1.size() <= 0) goto _L8; else goto _L7
_L7:
        b.registerListener(this, (Sensor)a1.get(0), q);
_L9:
        this;
        JVM INSTR monitorexit ;
        return;
_L6:
        a1 = c.iterator();
        while (a1.hasNext()) 
        {
            a a2 = (a)a1.next();
            if (a2.b)
            {
                a2.a("accelerometer", "The required sensor is absent");
            }
        }
        continue; /* Loop/switch isn't completed */
        a1;
        this;
        JVM INSTR monitorexit ;
        throw a1;
_L8:
        a1 = c.iterator();
        while (a1.hasNext()) 
        {
            a a3 = (a)a1.next();
            if (a3.b || a3.a)
            {
                a3.a("heading", "The required sensor is absent");
            }
        }
          goto _L9
_L4:
        if (c.contains(a1)) goto _L9; else goto _L10
_L10:
        c.add(a1);
          goto _L9
_L2:
        return;
        if (true) goto _L12; else goto _L11
_L11:
    }

    public final void b(a a1)
    {
        if (a1 == null)
        {
            break MISSING_BLOCK_LABEL_69;
        }
        this;
        JVM INSTR monitorenter ;
        if (!c.contains(a1)) goto _L2; else goto _L1
_L1:
        int i1;
        c.remove(a1);
        i1 = c.size();
        if (i1 != 0) goto _L2; else goto _L3
_L3:
        b.unregisterListener(this);
_L4:
        p = null;
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
        a1;
        av.c("MotionDataManager", "Trying to remove non-existing Motion Listener");
          goto _L4
        a1;
        this;
        JVM INSTR monitorexit ;
        throw a1;
    }

    public final void onAccuracyChanged(Sensor sensor, int i1)
    {
    }

    public final void onSensorChanged(SensorEvent sensorevent)
    {
        if (sensorevent.sensor.getType() != 1) goto _L2; else goto _L1
_L1:
        Iterator iterator;
        g = true;
        System.arraycopy(sensorevent.values, 0, e, 0, 3);
        float f1 = e[0];
        float f3 = e[1];
        float f4 = e[2];
        j = k;
        k = (float)Math.sqrt(f1 * f1 + f3 * f3 + f4 * f4);
        l = (k - j) + l * 0.9F;
        iterator = c.iterator();
_L8:
        if (iterator.hasNext()) goto _L3; else goto _L2
_L2:
        if (sensorevent.sensor.getType() != 2) goto _L5; else goto _L4
_L4:
        f = true;
        System.arraycopy(sensorevent.values, 0, d, 0, 3);
        if (!f || !g || !SensorManager.getRotationMatrix(i, null, e, d)) goto _L5; else goto _L6
_L6:
        SensorManager.getOrientation(i, h);
        if ((double)Math.abs(h[0] - o) < 0.087266462599716474D && (double)Math.abs(h[1] - m) < 0.087266462599716474D && (double)Math.abs(h[2] - n) < 0.087266462599716474D) goto _L5; else goto _L7
_L7:
        m = h[1];
        o = h[0];
        n = h[2];
        sensorevent = c.iterator();
_L9:
        if (sensorevent.hasNext())
        {
            break MISSING_BLOCK_LABEL_400;
        }
_L5:
        return;
_L3:
        a a2 = (a)iterator.next();
        if (a2.c && l >= a2.d.a)
        {
            a.a(a2, a.a(a2) + 1);
            if ((float)a.a(a2) >= a2.d.b / 200F)
            {
                a2.a();
                a.a(a2, 0);
            }
        }
          goto _L8
        a a1 = (a)sensorevent.next();
        if (a1.b)
        {
            a1.a(m, n, o);
        }
        if (a1.a)
        {
            float f2 = o;
            double d1;
            if (f2 <= 0.0F)
            {
                d1 = Math.toDegrees(f2) + 360D;
            } else
            {
                d1 = Math.toDegrees(f2);
            }
            a1.a((int)d1);
        }
          goto _L9
    }

}
