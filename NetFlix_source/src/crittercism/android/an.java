// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package crittercism.android;


// Referenced classes of package crittercism.android:
//            t, h

public final class an
    implements t
{

    public boolean a;

    private an(boolean flag)
    {
        a = flag;
    }

    an(boolean flag, byte byte0)
    {
        this(flag);
    }

    public final boolean a(h h1, String s, String s1)
    {
        this;
        JVM INSTR monitorenter ;
        h1.a(s, s1, false);
        this;
        JVM INSTR monitorexit ;
        return true;
        h1;
        throw h1;
    }

    public final Object b()
    {
        return Boolean.valueOf(a);
    }

    public final boolean b(h h1, String s, String s1)
    {
        this;
        JVM INSTR monitorenter ;
        h1.a(s, s1, Boolean.valueOf(a).booleanValue());
        this;
        JVM INSTR monitorexit ;
        return true;
        h1;
        throw h1;
    }
}
