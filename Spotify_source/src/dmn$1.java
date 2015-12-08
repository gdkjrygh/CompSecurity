// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.IOException;

final class ang.Object
    implements Runnable
{

    private grq a;
    private IOException b;
    private dmn c;

    public final void run()
    {
        c.b(a, b);
    }

    (dmn dmn1, grq grq, IOException ioexception)
    {
        c = dmn1;
        a = grq;
        b = ioexception;
        super();
    }
}
