// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.widget.LinearLayout;

final class byq
    implements dck
{

    private byh a;

    byq(byh byh1)
    {
        a = byh1;
        super();
    }

    public final void a()
    {
        byh.e(a).b = -1L;
        byh.f(a).setVisibility(8);
    }

    public final void a(long l)
    {
        byh.g(a).a();
        int i = byh.a(a).a(l);
        byh.e(a).b = l;
        ((dco)byh.d(a).a(dco)).a(i);
        byh.a(a, i);
        byh.f(a).setVisibility(0);
        i = byh.a(a).c(i);
        byh.h(a).a(i);
    }

    public final boolean a(int i)
    {
        return byh.a(a).a(i);
    }

    public final void b()
    {
        byh.h(a).b();
        byh.e(a).c = 1;
    }
}
