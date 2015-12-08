// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.VelocityTracker;

// Referenced classes of package android.support.v4.view:
//            s

public class r
{
    static class a
        implements c
    {

        public float a(VelocityTracker velocitytracker, int i)
        {
            return velocitytracker.getXVelocity();
        }

        public float b(VelocityTracker velocitytracker, int i)
        {
            return velocitytracker.getYVelocity();
        }

        a()
        {
        }
    }

    static class b
        implements c
    {

        public float a(VelocityTracker velocitytracker, int i)
        {
            return s.a(velocitytracker, i);
        }

        public float b(VelocityTracker velocitytracker, int i)
        {
            return s.b(velocitytracker, i);
        }

        b()
        {
        }
    }

    static interface c
    {

        public abstract float a(VelocityTracker velocitytracker, int i);

        public abstract float b(VelocityTracker velocitytracker, int i);
    }


    static final c a;

    public static float a(VelocityTracker velocitytracker, int i)
    {
        return a.a(velocitytracker, i);
    }

    public static float b(VelocityTracker velocitytracker, int i)
    {
        return a.b(velocitytracker, i);
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            a = new b();
        } else
        {
            a = new a();
        }
    }
}
