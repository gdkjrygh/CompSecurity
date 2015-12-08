// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a.a.a.a.d;

import b.a.a.a.a.b.j;

// Referenced classes of package b.a.a.a.a.d:
//            f, n

final class h
    implements Runnable
{

    final Object a;
    final f b;

    h(f f1, Object obj)
    {
        b = f1;
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
            j.a(b.a, "Crashlytics failed to record event");
        }
    }
}
