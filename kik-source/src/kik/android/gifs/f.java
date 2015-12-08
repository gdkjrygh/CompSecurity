// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.gifs;

import com.kik.g.p;
import com.kik.g.r;
import java.util.concurrent.ConcurrentMap;
import kik.android.gifs.view.a;

// Referenced classes of package kik.android.gifs:
//            b

final class f extends r
{

    final b.a a;
    final p b;
    final b c;

    f(b b1, b.a a1, p p1)
    {
        c = b1;
        a = a1;
        b = p1;
        super();
    }

    public final void a()
    {
        kik.android.gifs.b.b(c).remove(a);
    }

    public final volatile void a(Object obj)
    {
        obj = (a)obj;
        b.a(obj);
    }

    public final void a(Throwable throwable)
    {
        b.a(throwable);
    }
}
