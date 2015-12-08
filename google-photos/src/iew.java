// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.pm.ResolveInfo;
import android.view.View;

final class iew
    implements hgo
{

    final iei a;
    private final int b;

    iew(iei iei1, int i)
    {
        a = iei1;
        b = i;
    }

    static ame a(Context context, ResolveInfo resolveinfo)
    {
        return aly.c(context).a(ifz).a(resolveinfo);
    }

    public final int a()
    {
        return ce.f;
    }

    public final int a(int i)
    {
        return 1;
    }

    public final void a(afn afn)
    {
        afn = (ifa)afn;
        Context context = ((ifa) (afn)).a.getContext();
        b.a(((ifa) (afn)).a, new ohc(pwt.O, a.a));
        ((ifa) (afn)).a.setOnClickListener(new iex(this, context, afn));
        iei iei1 = a;
        if (((ifa) (afn)).q != null)
        {
            aly.c(context).a(((ifa) (afn)).q);
        }
        afn.q = new iey(((ifa) (afn)).p, ((ifa) (afn)).o, iei1.c);
        a(context, iei1.b).a(((ifa) (afn)).q);
    }

    final void a(Context context)
    {
        a(context, a.b).b(0x80000000, 0x80000000);
    }

    public final int b(int i)
    {
        return b % i;
    }

    public final long b()
    {
        return -1L;
    }
}
