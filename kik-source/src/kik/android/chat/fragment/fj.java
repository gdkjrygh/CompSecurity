// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import com.kik.cards.web.bf;
import com.kik.g.r;
import java.util.ArrayList;
import kik.a.d.a.a;
import kik.a.d.k;
import kik.a.d.s;
import kik.android.util.t;

// Referenced classes of package kik.android.chat.fragment:
//            KikChatFragment

final class fj extends r
{

    final s a;
    final a b;
    final k c;
    final KikChatFragment d;

    fj(KikChatFragment kikchatfragment, s s, a a1, k k1)
    {
        d = kikchatfragment;
        a = s;
        b = a1;
        c = k1;
        super();
    }

    public final void a(Object obj)
    {
        boolean flag = false;
        if (((Boolean)obj).booleanValue())
        {
            flag = KikChatFragment.b(d, a, b);
            obj = b.f();
            if (((ArrayList) (obj)).size() > 0)
            {
                String s = ((com.kik.f.a.a.a)((ArrayList) (obj)).get(0)).f();
                if (!t.a(b.u()))
                {
                    com.kik.android.a.f f = d.g.b("Browser Screen Opened");
                    if (c != null && c.i())
                    {
                        obj = "Brand Chat";
                    } else
                    {
                        obj = "Content Message";
                    }
                    f.a("Reason", obj).a("URL", s).a("Domain", bf.i(s)).a("Depth", kik.android.chat.activity.k.e()).b();
                }
            }
        }
        if (!flag)
        {
            d.j();
        }
    }
}
