// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import com.kik.g.r;
import kik.a.d.a.a;
import kik.android.util.by;

// Referenced classes of package kik.android.chat.fragment:
//            KikChatFragment, ep, eo

final class en extends r
{

    final a a;
    final boolean b;
    final KikChatFragment c;

    en(KikChatFragment kikchatfragment, a a1, boolean flag)
    {
        c = kikchatfragment;
        a = a1;
        b = flag;
        super();
    }

    public final void b(Throwable throwable)
    {
        by.a(c.g, false, a.u(), b, true);
        c.b(new ep(this));
    }

    public final void c()
    {
        by.a(c.g, true, a.u(), b, true);
        c.b(new eo(this));
    }
}
