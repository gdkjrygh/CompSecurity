// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Set;

final class ang.String extends gsh
{

    private int a;
    private gst b;

    public final void b()
    {
        gst.k(b).c();
        synchronized (b)
        {
            gst.l(b).remove(Integer.valueOf(a));
        }
        return;
        exception;
        gst1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    transient (gst gst1, String s, Object aobj[], int i)
    {
        b = gst1;
        a = i;
        super(s, aobj);
    }
}
