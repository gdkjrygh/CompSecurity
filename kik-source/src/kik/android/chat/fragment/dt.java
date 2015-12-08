// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import com.kik.g.r;
import kik.a.d.a.a;
import kik.a.d.s;
import kik.android.net.a.c;
import kik.android.net.a.e;

// Referenced classes of package kik.android.chat.fragment:
//            KikChatFragment

final class dt extends r
{

    final a a;
    final s b;
    final KikChatFragment c;

    dt(KikChatFragment kikchatfragment, a a1, s s1)
    {
        c = kikchatfragment;
        a = a1;
        b = s1;
        super();
    }

    public final void a(Object obj)
    {
        c.a(null);
        obj = new c(a, b.i(), b.b(), b.o(), c.g, c.i, c.h, c.d, c.k, c.p);
        e.a().a(((kik.android.net.a.b) (obj)));
    }

    public final void a(Throwable throwable)
    {
        c.a(null);
        kik.android.chat.fragment.KikChatFragment.e(c, KikChatFragment.b(0x7f090266));
    }
}
