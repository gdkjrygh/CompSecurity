// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a.a.a.a.d;

import b.a.a.a.a.b.l;

// Referenced classes of package b.a.a.a.a.d:
//            g, o

final class i
    implements Runnable
{

    final Object a;
    final g b;

    i(g g1, Object obj)
    {
        b = g1;
        a = obj;
        super();
    }

    public final void run()
    {
        try
        {
            b.c.a(a);
            return;
        }
        catch (Exception exception)
        {
            l.b(b.a, "Crashlytics failed to record event");
        }
    }
}
