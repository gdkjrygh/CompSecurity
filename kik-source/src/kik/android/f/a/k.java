// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.f.a;

import com.kik.g.p;
import com.kik.g.r;

// Referenced classes of package kik.android.f.a:
//            f

final class k extends r
{

    final p a;
    final f b;

    k(f f, p p1)
    {
        b = f;
        a = p1;
        super();
    }

    public final void b()
    {
        if (!a.g())
        {
            a.e();
        }
    }

    public final void b(Throwable throwable)
    {
        if (!a.g())
        {
            a.a(new Exception((new StringBuilder("Pick user failed: ")).append(throwable.getMessage()).toString()));
        }
    }
}
