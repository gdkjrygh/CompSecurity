// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.h;

import com.kik.g.r;
import kik.a.d.c;
import org.c.b;

// Referenced classes of package kik.android.h:
//            a

final class f extends r
{

    final a a;

    f(a a1)
    {
        a = a1;
        super();
    }

    public final volatile void a(Object obj)
    {
    }

    public final void a(Throwable throwable)
    {
        kik.android.h.a.i().b((new StringBuilder("Failed to save opt in as ")).append(kik.android.h.a.a(a).a()).toString(), throwable);
    }
}
