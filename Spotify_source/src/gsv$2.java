// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.IOException;

final class ang.String extends gsh
{

    private gtp a;
    private gsv b;

    public final void b()
    {
        try
        {
            b.a.i.a(a);
            return;
        }
        catch (IOException ioexception)
        {
            return;
        }
    }

    transient (gsv gsv1, String s, Object aobj[], gtp gtp)
    {
        b = gsv1;
        a = gtp;
        super(s, aobj);
    }
}
