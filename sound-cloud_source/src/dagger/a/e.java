// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package dagger.a;


// Referenced classes of package dagger.a:
//            b, l

final class e extends b
{

    private final String a;
    private final ClassLoader b;
    private b c;

    public e(String s, Object obj, ClassLoader classloader, String s1)
    {
        super(s, null, false, obj);
        b = classloader;
        a = s1;
    }

    public final void attach(l l1)
    {
        c = l1.a(a, requiredBy, b);
    }

    public final Object get()
    {
        return c;
    }

    public final void injectMembers(Object obj)
    {
        throw new UnsupportedOperationException();
    }
}
