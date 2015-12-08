// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.f.a;

import android.graphics.Bitmap;
import com.kik.g.p;
import com.kik.m.k;
import kik.a.d.a.a;
import kik.a.d.d;

// Referenced classes of package kik.android.f.a:
//            f

final class r extends com.kik.g.r
{

    final a a;
    final p b;
    final Bitmap c;
    final f d;

    r(f f, a a1, p p1, Bitmap bitmap)
    {
        d = f;
        a = a1;
        b = p1;
        c = bitmap;
        super();
    }

    public final void a(Object obj)
    {
        obj = k.b((Bitmap)obj, android.graphics.Bitmap.CompressFormat.JPEG, 80);
        a.a("preview", new d(((byte []) (obj))));
        b.a(a);
    }

    public final void b(Throwable throwable)
    {
        throwable = k.b(c, android.graphics.Bitmap.CompressFormat.JPEG, 80);
        a.a("preview", new d(throwable));
        b.a(a);
    }
}
