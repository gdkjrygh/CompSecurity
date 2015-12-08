// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import com.kik.android.a;
import com.kik.g.r;
import kik.a.d.k;
import kik.a.d.n;
import kik.a.e.i;
import kik.a.f.q;
import kik.android.util.cq;

// Referenced classes of package kik.android.chat.fragment:
//            KikChatInfoFragment

final class hb extends r
{

    final KikChatInfoFragment a;

    hb(KikChatInfoFragment kikchatinfofragment)
    {
        a = kikchatinfofragment;
        super();
    }

    public final void a(Object obj)
    {
        obj = (n)obj;
        a.o.b("Group Left").a("Is Admin", ((n) (obj)).A()).a("Participants Count", ((n) (obj)).E()).b();
        a.w();
        KikChatInfoFragment.x(a);
    }

    public final void a(Throwable throwable)
    {
        a.w();
        int j = q.a(throwable);
        throwable = q.b(throwable);
        switch (j)
        {
        default:
            a.d(j);
            return;

        case 201: 
            a.r.b(kik.android.chat.fragment.KikChatInfoFragment.a(a).b());
            KikChatInfoFragment.x(a);
            return;

        case 202: 
            a.a(cq.a(), KikChatInfoFragment.b(0x7f0900ae));
            return;

        case 104: // 'h'
            a.a(KikChatInfoFragment.b(0x7f0902bb), throwable);
            return;
        }
    }
}
