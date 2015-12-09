// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.squareup.okhttp.internal.framed.ErrorCode;
import java.io.IOException;
import java.util.Set;

final class ang.String extends gsh
{

    private int a;
    private hch b;
    private int c;
    private gst d;

    public final void b()
    {
        gst.k(d).a(b, c);
        d.i.a(a, ErrorCode.h);
        synchronized (d)
        {
            gst.l(d).remove(Integer.valueOf(a));
        }
        return;
        exception;
        gst1;
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

    transient (gst gst1, String s, Object aobj[], int i, hch hch, int j)
    {
        d = gst1;
        a = i;
        b = hch;
        c = j;
        super(s, aobj);
    }
}
