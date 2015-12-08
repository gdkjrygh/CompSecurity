// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;


public class GravityCompat
{

    static final GravityCompatImpl a;

    public static int a(int i, int j)
    {
        return a.a(i, j);
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 17)
        {
            a = new GravityCompatImplJellybeanMr1();
        } else
        {
            a = new GravityCompatImplBase();
        }
    }

    private class GravityCompatImpl
    {

        public abstract int a(int i, int j);
    }


    private class GravityCompatImplJellybeanMr1
        implements GravityCompatImpl
    {

        public int a(int i, int j)
        {
            return GravityCompatJellybeanMr1.a(i, j);
        }

        GravityCompatImplJellybeanMr1()
        {
        }
    }


    private class GravityCompatImplBase
        implements GravityCompatImpl
    {

        public int a(int i, int j)
        {
            return 0xff7fffff & i;
        }

        GravityCompatImplBase()
        {
        }
    }

}
