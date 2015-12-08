// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package dagger.a;

import dagger.a.a.a;

// Referenced classes of package dagger.a:
//            n, g, b, q, 
//            r

public final class f extends n
{

    private final q a = new g(this);

    public f()
    {
    }

    public final b a(String s, String s1, ClassLoader classloader, boolean flag)
    {
        b b1 = (b)a(s1.concat("$$InjectAdapter"), classloader);
        if (b1 != null)
        {
            return b1;
        }
        classloader = a(classloader, s1);
        if (classloader.equals(java/lang/Void))
        {
            throw new IllegalStateException(String.format("Could not load class %s needed for binding %s", new Object[] {
                s1, s
            }));
        }
        if (classloader.isInterface())
        {
            return null;
        } else
        {
            return dagger.a.a.a.a(classloader, flag);
        }
    }

    public final r a(Class class1)
    {
        return (r)a.b(class1);
    }
}
