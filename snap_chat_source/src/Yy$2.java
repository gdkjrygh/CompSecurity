// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.IOException;

final class lang.String extends XJ
{

    private int a;
    private long b;
    private Yy c;

    public final void a()
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

    transient >(Yy yy, String s, Object aobj[], int i, long l)
    {
        c = yy;
        a = i;
        b = l;
        super(s, aobj);
    }
}
