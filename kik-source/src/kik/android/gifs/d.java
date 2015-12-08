// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.gifs;

import com.kik.g.p;
import com.kik.g.r;
import java.io.File;
import java.util.concurrent.ConcurrentMap;
import kik.android.gifs.view.GifView;

// Referenced classes of package kik.android.gifs:
//            b

final class d extends r
{

    final String a;
    final int b = 200;
    final kik.android.gifs.a.f.a c;
    final p d;
    final GifView e;
    final b f;

    d(b b1, String s, kik.android.gifs.a.f.a a1, p p1, GifView gifview)
    {
        f = b1;
        a = s;
        c = a1;
        d = p1;
        e = gifview;
        super();
    }

    public final void a()
    {
        kik.android.gifs.b.a(f).remove(a);
    }

    public final volatile void a(Object obj)
    {
        obj = (File)obj;
        kik.android.gifs.b.a(f, a, ((File) (obj)), b, c, d, e);
    }

    public final void a(Throwable throwable)
    {
        d.a(throwable);
    }
}
