// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class abh
    implements aal
{

    public int a;

    public abh(int i)
    {
        a = i;
    }

    public final void a(ZO zo, String s, String s1)
    {
        this;
        JVM INSTR monitorenter ;
        zo.a(s, s1, Integer.valueOf(a).intValue());
        this;
        JVM INSTR monitorexit ;
        return;
        zo;
        throw zo;
    }

    public final Object b()
    {
        return Integer.valueOf(a);
    }
}
