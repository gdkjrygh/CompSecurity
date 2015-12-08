// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package dagger.a;


// Referenced classes of package dagger.a:
//            b, l, k

final class j extends b
{

    private static final Object a = new Object();
    private final String b;
    private final ClassLoader c;
    private b d;

    public j(String s, Object obj, ClassLoader classloader, String s1)
    {
        super(s, null, false, obj);
        c = classloader;
        b = s1;
    }

    static b a(j j1)
    {
        return j1.d;
    }

    static Object a()
    {
        return a;
    }

    public final void attach(l l1)
    {
        d = l1.a(b, requiredBy, c);
    }

    public final Object get()
    {
        return new k(this);
    }

    public final void injectMembers(Object obj)
    {
        throw new UnsupportedOperationException();
    }

}
