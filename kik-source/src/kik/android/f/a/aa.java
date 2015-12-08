// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.f.a;

import com.kik.g.p;
import com.kik.g.r;
import kik.a.d.a.a;

// Referenced classes of package kik.android.f.a:
//            z, f

final class aa extends r
{

    final a a;
    final z b;

    aa(z z1, a a1)
    {
        b = z1;
        a = a1;
        super();
    }

    public final void a(Object obj)
    {
        obj = (String)obj;
        String s = a.g();
        boolean flag;
        if (kik.a.f.e.a.a(s))
        {
            flag = kik.android.f.a.f.a(b.g, s, a, b.b, b.c);
        } else
        {
            flag = true;
        }
        if (!flag)
        {
            b.d.a(new Exception("Not enough free memory on device"));
            kik.android.f.a.f.a(b.b);
            return;
        } else
        {
            b.g.a(a, true, null);
            kik.android.f.a.f.a(((String) (obj)), b.b, com.kik.ui.fragment.FragmentBase.a.a.a, b.e, b.f);
            b.d.a(a);
            return;
        }
    }

    public final void b()
    {
        if (!b.d.g())
        {
            b.d.e();
        }
    }

    public final void b(Throwable throwable)
    {
        if (!b.d.g())
        {
            b.d.a(new Exception((new StringBuilder("Pick user failed: ")).append(throwable.getMessage()).toString()));
            kik.android.f.a.f.a(b.b);
        }
    }
}
