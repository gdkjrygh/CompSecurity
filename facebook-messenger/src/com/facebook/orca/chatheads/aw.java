// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.chatheads;

import android.os.Handler;
import com.facebook.debug.log.b;
import com.facebook.orca.chatheads.b.k;
import com.google.common.d.a.h;
import java.util.List;
import java.util.concurrent.CancellationException;

// Referenced classes of package com.facebook.orca.chatheads:
//            al, bo

class aw
    implements h
{

    final al a;

    aw(al al1)
    {
        a = al1;
        super();
    }

    public volatile void a(Object obj)
    {
        a((List)obj);
    }

    public void a(Throwable throwable)
    {
        if (!(throwable instanceof CancellationException) && b.b(6))
        {
            b.e(al.a, (new StringBuilder()).append("Failed to updatePositions: ").append(throwable).toString());
        }
    }

    public void a(List list)
    {
        if (al.w(a))
        {
            al.a(a, false);
            al.x(a);
        }
        if (!a.e() && al.y(a) != null && !al.z(a) && !a.b.a())
        {
            al.y(a).removeMessages(11);
            al.y(a).sendEmptyMessageDelayed(11, 500L);
        }
        if (a.e())
        {
            al.A(a).j();
            al.A(a).f();
            if (al.A(a).a())
            {
                al.A(a).m();
            }
            return;
        }
        if (al.A(a).l())
        {
            al.a(a, 0);
        }
        al.B(a);
    }
}
