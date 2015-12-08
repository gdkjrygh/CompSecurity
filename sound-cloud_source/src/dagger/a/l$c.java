// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package dagger.a;

import java.util.Set;

// Referenced classes of package dagger.a:
//            b, l

private static final class <init> extends b
{

    private final b a;
    private volatile Object b;

    public final void attach(l l1)
    {
        a.attach(l1);
    }

    public final boolean dependedOn()
    {
        return a.dependedOn();
    }

    public final Object get()
    {
        if (b != l.b()) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorenter ;
        if (b == l.b())
        {
            b = a.get();
        }
        this;
        JVM INSTR monitorexit ;
_L2:
        return b;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void getDependencies(Set set, Set set1)
    {
        a.getDependencies(set, set1);
    }

    public final void injectMembers(Object obj)
    {
        a.injectMembers(obj);
    }

    public final boolean isCycleFree()
    {
        return a.isCycleFree();
    }

    public final boolean isLinked()
    {
        return a.isLinked();
    }

    protected final boolean isSingleton()
    {
        return true;
    }

    public final boolean isVisiting()
    {
        return a.isVisiting();
    }

    public final boolean library()
    {
        return a.library();
    }

    public final void setCycleFree(boolean flag)
    {
        a.setCycleFree(flag);
    }

    public final void setDependedOn(boolean flag)
    {
        a.setDependedOn(flag);
    }

    public final void setLibrary(boolean flag)
    {
        a.setLibrary(true);
    }

    protected final void setLinked()
    {
        a.setLinked();
    }

    public final void setVisiting(boolean flag)
    {
        a.setVisiting(flag);
    }

    public final String toString()
    {
        return (new StringBuilder("@Singleton/")).append(a.toString()).toString();
    }

    private ect(b b1)
    {
        super(b1.provideKey, b1.membersKey, true, b1.requiredBy);
        b = l.b();
        a = b1;
    }

    a(b b1, byte byte0)
    {
        this(b1);
    }
}
