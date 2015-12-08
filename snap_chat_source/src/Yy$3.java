// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.IOException;

final class lang.String extends XJ
{

    private boolean a;
    private int b;
    private int c;
    private Yy d;

    public final void a()
    {
        try
        {
            Yy.a(d, a, b, c);
            return;
        }
        catch (IOException ioexception)
        {
            return;
        }
    }

    transient >(Yy yy, String s, Object aobj[], int i, int j)
    {
        d = yy;
        a = true;
        b = i;
        c = j;
        super(s, aobj);
    }
}
