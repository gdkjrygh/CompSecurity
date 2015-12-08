// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.b;


// Referenced classes of package com.nuance.b.b:
//            ei, dy, fr

final class ed
    implements Runnable
{

    dy a;
    ei b;

    public ed(dy dy1)
    {
        a = dy1;
        b = new ei();
    }

    public final void run()
    {
        b.a();
        if (a.b())
        {
            a.f();
            return;
        }
        if (b.b())
        {
            fr.a("Speech interpretation recorder stopped event never received after cancelling.");
            a.f();
            return;
        } else
        {
            dy.a(this);
            return;
        }
    }
}
