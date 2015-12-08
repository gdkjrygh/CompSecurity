// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.f;


// Referenced classes of package com.roidapp.cloudlib.sns.f:
//            b

public class a
    implements b
{

    private static a a;
    private b b;

    public a()
    {
    }

    public static a a()
    {
        if (a != null) goto _L2; else goto _L1
_L1:
        com/roidapp/cloudlib/sns/f/a;
        JVM INSTR monitorenter ;
        if (a == null)
        {
            a = new a();
        }
        com/roidapp/cloudlib/sns/f/a;
        JVM INSTR monitorexit ;
_L2:
        return a;
        Exception exception;
        exception;
        com/roidapp/cloudlib/sns/f/a;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void a(b b1)
    {
        b = b1;
    }

    public final void a(String s, int i)
    {
        b.a(s, i);
    }
}
