// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package de.greenrobot.event;


// Referenced classes of package de.greenrobot.event:
//            h, c

final class a
    implements Runnable
{

    final h a = new h();
    final c b;

    a(c c1)
    {
        b = c1;
    }

    public final void run()
    {
        g g = a.a();
        if (g == null)
        {
            throw new IllegalStateException("No pending post available");
        } else
        {
            b.a(g);
            return;
        }
    }
}
