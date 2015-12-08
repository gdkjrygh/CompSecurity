// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.f.a;

import com.kik.g.p;
import com.kik.g.r;
import kik.a.d.a.a;

// Referenced classes of package kik.android.f.a:
//            u, f

final class v extends r
{

    final u a;

    v(u u1)
    {
        a = u1;
        super();
    }

    public final void a(Object obj)
    {
        obj = (a)obj;
        if (kik.android.f.a.f.a(a.d, ((a) (obj)), a.c))
        {
            a.a.a(obj);
            return;
        } else
        {
            a.a.a(new Throwable("Failed to prepare local video URI"));
            return;
        }
    }

    public final void a(Throwable throwable)
    {
        a.a.a(throwable);
    }
}
