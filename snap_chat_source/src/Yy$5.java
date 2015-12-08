// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.IOException;
import java.util.Set;

final class lang.String extends XJ
{

    private int a;
    private Yy b;

    public final void a()
    {
        Yy.k(b).b();
        b.i.a(a, Yk.h);
        synchronized (b)
        {
            Yy.l(b).remove(Integer.valueOf(a));
        }
        return;
        exception;
        yy;
        JVM INSTR monitorexit ;
        try
        {
            throw exception;
        }
        catch (IOException ioexception)
        {
            return;
        }
    }

    transient >(Yy yy, String s, Object aobj[], int i)
    {
        b = yy;
        a = i;
        super(s, aobj);
    }
}
