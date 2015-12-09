// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import java.util.List;

// Referenced classes of package android.support.v4.app:
//            i, Fragment, k

public abstract class h
{
    public static interface a
    {

        public abstract int a();

        public abstract String d();
    }

    public static interface b
    {

        public abstract void a();
    }


    public h()
    {
    }

    public static void a(boolean flag)
    {
        i.a = flag;
    }

    public abstract Fragment a(int j);

    public abstract Fragment a(String s);

    public abstract k a();

    public abstract void a(int j, int k);

    public abstract void a(b b1);

    public abstract void a(String s, int j);

    public abstract a b(int j);

    public abstract boolean b();

    public abstract void c();

    public abstract boolean d();

    public abstract int e();

    public abstract List f();
}
