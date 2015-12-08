// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import com.kik.g.r;
import kik.a.d.n;
import kik.a.f.q;
import kik.android.util.cq;

// Referenced classes of package kik.android.chat.fragment:
//            KikDisplayOnlyChatInfoFragment

final class ld extends r
{

    final String a;
    final KikDisplayOnlyChatInfoFragment b;

    ld(KikDisplayOnlyChatInfoFragment kikdisplayonlychatinfofragment, String s)
    {
        b = kikdisplayonlychatinfofragment;
        a = s;
        super();
    }

    public final void a(Object obj)
    {
        obj = (n)obj;
        b.w();
        b.a((new KikChatFragment.a()).a(((kik.a.d.k) (obj))));
    }

    public final void a(Throwable throwable)
    {
        b.w();
        switch (q.a(throwable))
        {
        default:
            b.a(cq.a(), KikDisplayOnlyChatInfoFragment.b(0x7f090266));
            return;

        case 404: 
            b.a(KikDisplayOnlyChatInfoFragment.a(0x7f090375, new Object[] {
                a
            }), KikDisplayOnlyChatInfoFragment.b(0x7f0901da));
            break;
        }
    }
}
