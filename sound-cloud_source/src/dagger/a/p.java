// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package dagger.a;


// Referenced classes of package dagger.a:
//            q, o

final class p extends q
{

    final ClassLoader a;
    final o b;

    p(o o, ClassLoader classloader)
    {
        b = o;
        a = classloader;
        super();
    }

    private Class a(String s)
    {
        try
        {
            s = a.loadClass(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return java/lang/Void;
        }
        return s;
    }

    protected final volatile Object a(Object obj)
    {
        return a((String)obj);
    }
}
