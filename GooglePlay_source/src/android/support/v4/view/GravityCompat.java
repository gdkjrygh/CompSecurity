// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.graphics.Rect;
import android.view.Gravity;

public final class GravityCompat
{
    static interface GravityCompatImpl
    {

        public abstract void apply(int i, int j, int k, Rect rect, Rect rect1, int l);

        public abstract int getAbsoluteGravity(int i, int j);
    }

    static final class GravityCompatImplBase
        implements GravityCompatImpl
    {

        public final void apply(int i, int j, int k, Rect rect, Rect rect1, int l)
        {
            Gravity.apply(119, j, k, rect, rect1);
        }

        public final int getAbsoluteGravity(int i, int j)
        {
            return 0xff7fffff & i;
        }

        GravityCompatImplBase()
        {
        }
    }

    static final class GravityCompatImplJellybeanMr1
        implements GravityCompatImpl
    {

        public final void apply(int i, int j, int k, Rect rect, Rect rect1, int l)
        {
            Gravity.apply(119, j, k, rect, rect1, l);
        }

        public final int getAbsoluteGravity(int i, int j)
        {
            return Gravity.getAbsoluteGravity(i, j);
        }

        GravityCompatImplJellybeanMr1()
        {
        }
    }


    static final GravityCompatImpl IMPL;

    public static void apply$1d198dab(int i, int j, Rect rect, Rect rect1, int k)
    {
        IMPL.apply(119, i, j, rect, rect1, k);
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
