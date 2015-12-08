// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.util;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

public class y
    implements SensorEventListener
{
    private static class a
    {

        public final long a = System.currentTimeMillis();
        public final boolean b;

        public a(SensorEvent sensorevent)
        {
            boolean flag = true;
            super();
            float f = sensorevent.values[0];
            float f1 = sensorevent.values[1];
            float f2 = sensorevent.values[2];
            if (Math.sqrt(f * f + f1 * f1 + f2 * f2) < 13D)
            {
                flag = false;
            }
            b = flag;
        }
    }

    public static interface b
    {

        public abstract void c();
    }

    private class c
    {

        final y a;
        private PriorityQueue b;
        private boolean c;

        public void a(a a1)
        {
            b.add(a1);
            for (a1 = (a)b.peek(); a1 != null && a1.a < System.currentTimeMillis() - 500L; a1 = (a)b.peek())
            {
                c = true;
                b.remove();
            }

        }

        public boolean a()
        {
            if (c)
            {
                int j = b.size();
                Iterator iterator = b.iterator();
                int i = 0;
                do
                {
                    if (!iterator.hasNext())
                    {
                        break;
                    }
                    if (((a)iterator.next()).b)
                    {
                        i++;
                    }
                } while (true);
                if ((float)i / (float)j >= 0.55F)
                {
                    return true;
                }
            }
            return false;
        }

        public void b()
        {
            c = false;
            b.clear();
        }

        public c()
        {
            a = y.this;
            super();
            b = new PriorityQueue(100, new _cls1(this, y.this));
            c = false;
        }
    }


    private b a;
    private SensorManager b;
    private Sensor c;
    private c d;

    public y(b b1)
    {
        a = b1;
        d = new c();
    }

    public void a()
    {
        if (c != null)
        {
            b.unregisterListener(this);
            b = null;
            c = null;
        }
    }

    public void a(Context context)
    {
        b = (SensorManager)context.getSystemService("sensor");
        if (b != null)
        {
            c = b.getDefaultSensor(1);
            if (c != null)
            {
                b.registerListener(this, c, 0);
            }
        }
    }

    public void onAccuracyChanged(Sensor sensor, int i)
    {
    }

    public void onSensorChanged(SensorEvent sensorevent)
    {
        d.a(new a(sensorevent));
        if (d.a())
        {
            d.b();
            if (a != null)
            {
                a.c();
            }
        }
    }

    // Unreferenced inner class com/pandora/android/util/y$c$1

/* anonymous class */
    class c._cls1
        implements Comparator
    {

        final y a;
        final c b;

        public int a(a a1, a a2)
        {
            return Long.valueOf(a1.a).compareTo(Long.valueOf(a2.a));
        }

        public int compare(Object obj, Object obj1)
        {
            return a((a)obj, (a)obj1);
        }

            
            {
                b = c1;
                a = y1;
                super();
            }
    }

}
