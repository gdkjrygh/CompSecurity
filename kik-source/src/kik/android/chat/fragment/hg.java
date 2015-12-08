// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.os.Handler;
import com.kik.g.r;
import kik.android.util.cq;
import kik.android.util.cy;

// Referenced classes of package kik.android.chat.fragment:
//            KikChatInfoFragment

final class hg extends r
{

    final KikChatInfoFragment a;

    hg(KikChatInfoFragment kikchatinfofragment)
    {
        a = kikchatinfofragment;
        super();
    }

    public final void a(Object obj)
    {
        KikChatInfoFragment.d(a);
        KikChatInfoFragment.e(a);
        KikChatInfoFragment.f(a);
        KikChatInfoFragment.g(a).sendEmptyMessage(2);
    }

    public final void b(Throwable throwable)
    {
        a.a(cq.a(), cy.a(throwable));
    }
}
