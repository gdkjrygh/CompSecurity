// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.b;

import com.kik.cards.web.CardsWebViewFragment;
import com.kik.cards.web.kik.KikMessageParcelable;
import com.kik.cards.web.kik.h;
import com.kik.g.p;
import com.kik.g.s;
import java.util.List;
import kik.a.e.r;
import kik.android.chat.fragment.KikCardBrowserFragment;
import kik.android.f.a.f;

// Referenced classes of package kik.android.b:
//            l

public final class k
    implements h
{

    private CardsWebViewFragment a;
    private r b;

    public k(CardsWebViewFragment cardswebviewfragment, r r1)
    {
        a = cardswebviewfragment;
        b = r1;
    }

    static CardsWebViewFragment a(k k1)
    {
        return k1.a;
    }

    static p a(k k1, kik.a.d.k k2, List list, int i)
    {
        if (k2 == null)
        {
            return s.a(new IllegalArgumentException("Contact was null!"));
        }
        f.a().b(list);
        list = (new kik.android.chat.fragment.KikChatFragment.a()).b(true);
        if (k2.m())
        {
            list = new kik.android.chat.fragment.KikChatInfoFragment.a();
            list.a(k2).b(1);
            list.a(i);
            return kik.android.chat.activity.k.a(list, k1.a.getActivity()).f();
        } else
        {
            list.a(k2);
            list.a(i);
            return kik.android.chat.activity.k.a(list, k1.a.getActivity()).f();
        }
    }

    private void a(String s1, String s2, boolean flag)
    {
        if (a.getActivity() == null)
        {
            return;
        }
        Object obj = null;
        kik.android.chat.fragment.KikChatFragment.a a1 = (new kik.android.chat.fragment.KikChatFragment.a()).b(s2);
        s2 = obj;
        if (s1 != null)
        {
            s2 = b.a(s1, false);
        }
        if (s2 != null)
        {
            a1.a(s2).a(flag).b(true).c(true).a(a.w());
            kik.android.chat.activity.k.a(a1, a.getActivity()).f();
            return;
        } else
        {
            kik.android.chat.activity.k.a(a1, a.getActivity()).f();
            return;
        }
    }

    public final p a(KikMessageParcelable kikmessageparcelable)
    {
        return f.a().a(kikmessageparcelable, a, a.w(), b);
    }

    public final p a(List list, String s1)
    {
        if (s1 != null)
        {
            KikCardBrowserFragment kikcardbrowserfragment;
            p p1;
            int i;
            if (a instanceof KikCardBrowserFragment)
            {
                kikcardbrowserfragment = (KikCardBrowserFragment)a;
            } else
            {
                kikcardbrowserfragment = null;
            }
            if (kikcardbrowserfragment != null)
            {
                kikcardbrowserfragment.f(kikcardbrowserfragment.getString(0x7f090148));
            }
            p1 = new p();
            b.d(s1).a(new l(this, p1, list, kikcardbrowserfragment));
            return p1;
        }
        i = a.w();
        if (list == null || list.size() <= 0)
        {
            return s.a(new IllegalArgumentException("Smiley list must be non-empty"));
        } else
        {
            f.a().b(list);
            list = new kik.android.chat.fragment.SendToFragment.a();
            list.a(true);
            list.a(i);
            return kik.android.chat.activity.k.a(list, a.getActivity()).f();
        }
    }

    public final void a(String s1)
    {
        a(s1, null, false);
    }

    public final void a(String s1, String s2)
    {
        a(s1, s2, true);
    }

    public final void b(List list, String s1)
    {
        f.a().b(list);
        kik.android.chat.activity.k.a((new kik.android.chat.fragment.KikChatFragment.a()).a(s1).b(true), a.getActivity()).f();
    }
}
