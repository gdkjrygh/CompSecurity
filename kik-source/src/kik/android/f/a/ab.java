// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.f.a;

import android.app.Activity;
import com.kik.g.r;

// Referenced classes of package kik.android.f.a:
//            z, ac, f

final class ab extends r
{

    final Throwable a;
    final z b;

    ab(z z1, Throwable throwable)
    {
        b = z1;
        a = throwable;
        super();
    }

    public final void a()
    {
        b.b.runOnUiThread(new ac(this));
        f.a(b.b);
    }
}
