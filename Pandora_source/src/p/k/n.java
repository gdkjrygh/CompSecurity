// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.k;


// Referenced classes of package p.k:
//            s

public class n
{
    public static interface a
    {

        public abstract void a(s s);
    }

    public static interface b
    {

        public abstract void a(Object obj);
    }


    public final Object a;
    public final b.a b;
    public final s c;
    public boolean d;

    private n(Object obj, b.a a1)
    {
        d = false;
        a = obj;
        b = a1;
        c = null;
    }

    private n(s s)
    {
        d = false;
        a = null;
        b = null;
        c = s;
    }

    public static n a(Object obj, b.a a1)
    {
        return new n(obj, a1);
    }

    public static n a(s s)
    {
        return new n(s);
    }

    public boolean a()
    {
        return c == null;
    }
}
