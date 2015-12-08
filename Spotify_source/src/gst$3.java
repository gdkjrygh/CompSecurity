// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.IOException;

final class ang.String extends gsh
{

    private boolean a;
    private int b;
    private int c;
    private gst d;

    public final void b()
    {
        try
        {
            gst.a(d, a, b, c);
            return;
        }
        catch (IOException ioexception)
        {
            return;
        }
    }

    transient (gst gst1, String s, Object aobj[], int i, int j)
    {
        d = gst1;
        a = true;
        b = i;
        c = j;
        super(s, aobj);
    }
}
