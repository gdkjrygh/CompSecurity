// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;


// Referenced classes of package b.a:
//            bi, o

public final class er
    implements bi
{

    public int a;

    public er(int i)
    {
        a = i;
    }

    public final void a(o o1, String s, String s1)
    {
        this;
        JVM INSTR monitorenter ;
        o1.a(s, s1, Integer.valueOf(a).intValue());
        this;
        JVM INSTR monitorexit ;
        return;
        o1;
        throw o1;
    }

    public final Object b()
    {
        return Integer.valueOf(a);
    }
}
