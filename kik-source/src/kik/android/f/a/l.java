// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.f.a;

import android.support.v4.app.Fragment;
import com.kik.g.p;
import com.kik.g.r;
import kik.a.d.a.a;

// Referenced classes of package kik.android.f.a:
//            m, o, f

final class l extends r
{

    final p a;
    final kik.a.e.r b;
    final Fragment c;
    final int d;
    final boolean e;
    final p f;
    final f g;

    l(f f1, p p1, kik.a.e.r r1, Fragment fragment, int i, boolean flag, p p2)
    {
        g = f1;
        a = p1;
        b = r1;
        c = fragment;
        d = i;
        e = flag;
        f = p2;
        super();
    }

    public final void a(Object obj)
    {
        obj = (a)obj;
        a.a(new m(this, ((a) (obj))));
    }

    public final void a(Throwable throwable)
    {
        if (!f.g())
        {
            f.a(new Exception((new StringBuilder("Content message generation failed: ")).append(throwable.getMessage()).toString()));
        }
        a.a(new o(this, throwable));
    }
}
