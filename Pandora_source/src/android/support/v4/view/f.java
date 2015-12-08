// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;


// Referenced classes of package android.support.v4.view:
//            g

public class f
{
    static interface a
    {

        public abstract int a(int i, int j);
    }

    static class b
        implements a
    {

        public int a(int i, int j)
        {
            return 0xff7fffff & i;
        }

        b()
        {
        }
    }

    static class c
        implements a
    {

        public int a(int i, int j)
        {
            return g.a(i, j);
        }

        c()
        {
        }
    }


    static final a a;

    public static int a(int i, int j)
    {
        return a.a(i, j);
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 17)
        {
            a = new c();
        } else
        {
            a = new b();
        }
    }
}
