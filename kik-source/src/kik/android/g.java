// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android;

import com.kik.g.r;
import kik.a.f.f.s;
import kik.a.f.f.z;

// Referenced classes of package kik.android:
//            a, h

final class g extends r
{

    final s a;
    final a b;

    g(a a1, s s1)
    {
        b = a1;
        a = s1;
        super();
    }

    public final void a(Object obj)
    {
        Object obj1 = null;
        z z1 = (z)obj;
        super.a(z1);
        kik.android.a.a(b, null);
        obj = obj1;
        if (z1 instanceof s)
        {
            obj = ((s)z1).e();
        }
        kik.android.a.a(b, ((java.util.List) (obj)));
        kik.android.a.r(b);
    }

    public final void a(Throwable throwable)
    {
        super.a(throwable);
        try
        {
            kik.android.a.p(b).c();
        }
        // Misplaced declaration of an exception variable
        catch (Throwable throwable)
        {
            kik.android.a.r(b);
            return;
        }
        if (!kik.android.a.p(b).b())
        {
            kik.android.a.r(b);
            return;
        } else
        {
            kik.android.a.a(b, a.d());
            return;
        }
    }
}
