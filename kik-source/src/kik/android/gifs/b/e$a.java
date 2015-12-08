// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.gifs.b;

import com.kik.g.p;
import java.util.concurrent.ConcurrentMap;

// Referenced classes of package kik.android.gifs.b:
//            e, c

private final class <init>
    implements Runnable
{

    final e a;
    private c b;

    public final void run()
    {
        if (!b.a().g())
        {
            b.b();
            e.a(a).remove(b.a);
        }
    }

    private ncurrentMap(e e1, c c1)
    {
        a = e1;
        super();
        b = c1;
    }

    b(e e1, c c1, byte byte0)
    {
        this(e1, c1);
    }
}
