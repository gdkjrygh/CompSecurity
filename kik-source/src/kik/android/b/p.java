// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.b;

import android.os.Bundle;
import com.kik.cards.util.UserDataParcelable;
import com.kik.g.r;

// Referenced classes of package kik.android.b:
//            o, n, m, s

final class p extends r
{

    final o a;

    p(o o1)
    {
        a = o1;
        super();
    }

    private void d()
    {
        a.a.a.e();
    }

    public final void a(Object obj)
    {
        obj = (Bundle)obj;
        super.a(obj);
        obj = (UserDataParcelable)((Bundle) (obj)).getParcelable("kik.permissionFragment.extra.returned.userdata");
        if (obj != null)
        {
            a.a.a.a(obj);
            m.c(a.a.c).g(a.a.b);
            return;
        } else
        {
            d();
            return;
        }
    }

    public final void b()
    {
        super.b();
        d();
    }

    public final void b(Throwable throwable)
    {
        super.b(throwable);
        a.a.a.a(throwable);
    }
}
