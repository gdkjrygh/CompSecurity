// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.sdkutils.concurrent;

import com.kik.g.p;

// Referenced classes of package kik.android.sdkutils.concurrent:
//            e, g

final class f
    implements Runnable
{

    final p a;
    final e b;

    f(e e1, p p1)
    {
        b = e1;
        a = p1;
        super();
    }

    public final void run()
    {
        b.a().a(new g(this));
    }
}
