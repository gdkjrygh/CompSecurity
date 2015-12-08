// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.f.a;

import android.app.Activity;
import com.kik.g.p;
import com.kik.g.r;
import kik.a.d.a.a;
import kik.a.e.v;

// Referenced classes of package kik.android.f.a:
//            aa, ab, f

final class z extends r
{

    final p a;
    final Activity b;
    final v c;
    final p d;
    final boolean e = false;
    final kik.a.e.r f;
    final f g;

    z(f f1, p p1, Activity activity, v v, p p2, kik.a.e.r r1)
    {
        g = f1;
        a = p1;
        b = activity;
        c = v;
        d = p2;
        f = r1;
        super();
    }

    public final void a(Object obj)
    {
        obj = (a)obj;
        a.a(new aa(this, ((a) (obj))));
    }

    public final void a(Throwable throwable)
    {
        if (!d.g())
        {
            d.a(new Exception((new StringBuilder("Content message generation failed: ")).append(throwable.getMessage()).toString()));
        }
        a.a(new ab(this, throwable));
    }
}
