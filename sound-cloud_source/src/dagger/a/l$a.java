// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package dagger.a;

import java.util.Set;

// Referenced classes of package dagger.a:
//            b, l

private static final class ect extends b
{

    final ClassLoader a;
    final String b;
    final boolean c;

    public final void getDependencies(Set set, Set set1)
    {
        throw new UnsupportedOperationException("Deferred bindings must resolve first.");
    }

    public final void injectMembers(Object obj)
    {
        throw new UnsupportedOperationException("Deferred bindings must resolve first.");
    }

    public final String toString()
    {
        return (new StringBuilder("DeferredBinding[deferredKey=")).append(b).append("]").toString();
    }

    private ect(String s, ClassLoader classloader, Object obj, boolean flag)
    {
        super(null, null, false, obj);
        b = s;
        a = classloader;
        c = flag;
    }

    ect(String s, ClassLoader classloader, Object obj, boolean flag, byte byte0)
    {
        this(s, classloader, obj, flag);
    }
}
