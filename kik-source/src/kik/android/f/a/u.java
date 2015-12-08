// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.f.a;

import android.app.Activity;
import com.kik.g.p;
import com.kik.g.r;
import com.kik.g.s;
import kik.a.d.a.a;

// Referenced classes of package kik.android.f.a:
//            f, ae, v

final class u extends r
{

    final p a;
    final a b;
    final Activity c;
    final f d;

    u(f f1, p p1, a a1, Activity activity)
    {
        d = f1;
        a = p1;
        b = a1;
        c = activity;
        super();
    }

    public final void a(Object obj)
    {
        super.a(obj);
        if (kik.a.f.e.a.b(b.h()))
        {
            kik.android.f.a.ae.a(c, b, kik.android.f.a.f.a(d)).a(new v(this));
            return;
        } else
        {
            s.b(kik.android.f.a.ae.a(c, b, kik.android.f.a.f.a(d)), a);
            return;
        }
    }

    public final void a(Throwable throwable)
    {
        super.a(throwable);
        d.b();
        a.a(throwable);
    }
}
