// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.graphics.Rect;
import android.view.Gravity;

// Referenced classes of package android.support.v4.view:
//            GravityCompatJellybeanMr1

public class GravityCompat
{
    static interface GravityCompatImpl
    {

        public abstract void apply(int i, int j, int k, Rect rect, Rect rect1, int l);

        public abstract int getAbsoluteGravity(int i, int j);
    }

    static class GravityCompatImplBase
        implements GravityCompatImpl
    {

        public void apply(int i, int j, int k, Rect rect, Rect rect1, int l)
        {
            Gravity.apply(i, j, k, rect, rect1);
        }

        public int getAbsoluteGravity(int i, int j)
        {
            return 0xff7fffff & i;
        }

        GravityCompatImplBase()
        {
        }
    }

    static class GravityCompatImplJellybeanMr1
        implements GravityCompatImpl
    {

        public void apply(int i, int j, int k, Rect rect, Rect rect1, int l)
        {
            GravityCompatJellybeanMr1.apply(i, j, k, rect, rect1, l);
        }

        public int getAbsoluteGravity(int i, int j)
        {
            return GravityCompatJellybeanMr1.getAbsoluteGravity(i, j);
        }

        GravityCompatImplJellybeanMr1()
        {
        }
    }


    static final GravityCompatImpl IMPL;

    public static void apply(int i, int j, int k, Rect rect, Rect rect1, int l)
    {
        IMPL.apply(i, j, k, rect, rect1, l);
    }

    public static int getAbsoluteGravity(int i, int j)
    {
        return IMPL.getAbsoluteGravity(i, j);
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 17)
        {
            IMPL = new GravityCompatImplJellybeanMr1();
        } else
        {
            IMPL = new GravityCompatImplBase();
        }
    }
}
