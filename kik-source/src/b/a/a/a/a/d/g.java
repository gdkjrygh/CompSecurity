// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a.a.a.a.d;

import b.a.a.a.a.b.j;

// Referenced classes of package b.a.a.a.a.d:
//            f, n

final class g
    implements Runnable
{

    final Object a;
    final boolean b;
    final f c;

    g(f f1, Object obj, boolean flag)
    {
        c = f1;
        a = obj;
        b = flag;
        super();
    }

    public final void run()
    {
        try
        {
            c.c.a(a);
            if (b)
            {
                c.c.e();
            }
            return;
        }
        catch (Exception exception)
        {
            j.a(c.a, "Failed to record event.");
        }
    }
}
