// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a.a.a.a.d;

import b.a.a.a.a.b.j;

// Referenced classes of package b.a.a.a.a.d:
//            f, n

final class i
    implements Runnable
{

    final f a;

    i(f f1)
    {
        a = f1;
        super();
    }

    public final void run()
    {
        try
        {
            a.c.b();
            return;
        }
        catch (Exception exception)
        {
            j.a(a.a, "Failed to send events files.");
        }
    }
}
