// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.IOException;

final class ang.String extends gsh
{

    private int a;
    private long b;
    private gst c;

    public final void b()
    {
        try
        {
            c.i.a(a, b);
            return;
        }
        catch (IOException ioexception)
        {
            return;
        }
    }

    transient (gst gst1, String s, Object aobj[], int i, long l)
    {
        c = gst1;
        a = i;
        b = l;
        super(s, aobj);
    }
}
