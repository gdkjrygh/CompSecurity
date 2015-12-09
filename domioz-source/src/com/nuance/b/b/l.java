// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.b;


// Referenced classes of package com.nuance.b.b:
//            n, e, fr

final class l
    implements Runnable
{

    e a;
    n b;

    public l(e e1)
    {
        a = e1;
        b = new n();
    }

    public final void run()
    {
        b.a();
        if (a.b())
        {
            a.g();
            return;
        }
        if (b.b())
        {
            fr.a(e.a(e.c(a), "Dictation recorder stopped event never received after cancelling."));
            a.g();
            return;
        } else
        {
            e.a(this);
            return;
        }
    }
}
