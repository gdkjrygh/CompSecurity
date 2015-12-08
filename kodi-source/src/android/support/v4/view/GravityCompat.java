// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;


// Referenced classes of package android.support.v4.view:
//            GravityCompatJellybeanMr1

public class GravityCompat
{
    static interface GravityCompatImpl
    {

        public abstract int getAbsoluteGravity(int i, int j);
    }

    static class GravityCompatImplBase
        implements GravityCompatImpl
    {

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

        public int getAbsoluteGravity(int i, int j)
        {
            return GravityCompatJellybeanMr1.getAbsoluteGravity(i, j);
        }

        GravityCompatImplJellybeanMr1()
        {
        }
    }


    static final GravityCompatImpl IMPL;

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
