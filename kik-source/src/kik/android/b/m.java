// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.b;

import com.kik.cards.util.b;
import com.kik.cards.web.CardsWebViewFragment;
import com.kik.cards.web.av;
import com.kik.cards.web.bf;
import com.kik.cards.web.userdata.e;
import com.kik.g.p;
import com.kik.g.s;
import com.kik.sdkutils.d;
import java.util.ArrayList;
import java.util.List;
import kik.a.d.aa;
import kik.android.util.DeviceUtils;

// Referenced classes of package kik.android.b:
//            s, q, r, n

public final class m
    implements e
{

    private static long e = 0L;
    private CardsWebViewFragment a;
    private kik.android.b.s b;
    private av c;
    private aa d;

    public m(CardsWebViewFragment cardswebviewfragment, kik.android.b.s s1, av av, aa aa)
    {
        a = cardswebviewfragment;
        b = s1;
        c = av;
        d = aa;
        e = 0L;
    }

    static long a(long l)
    {
        e = l;
        return l;
    }

    static aa a(m m1)
    {
        return m1.d;
    }

    private static boolean a(String s1)
    {
        if (s1 != null)
        {
            if (DeviceUtils.c())
            {
                return true;
            }
            if (bf.a(s1) && com.kik.cards.util.b.a(s1))
            {
                return true;
            }
        }
        return false;
    }

    static CardsWebViewFragment b(m m1)
    {
        return m1.a;
    }

    static kik.android.b.s c(m m1)
    {
        return m1.b;
    }

    static av d(m m1)
    {
        return m1.c;
    }

    public final p a()
    {
        String s1 = a.g();
        return b.e(s1);
    }

    public final p a(int i, int j, List list)
    {
        p p1 = new p();
        kik.android.chat.fragment.KikPickUsersFragment.a a1 = new kik.android.chat.fragment.KikPickUsersFragment.a();
        a1.b(i).c(j).a(false).a(new ArrayList(list)).a(a.w());
        a.a(a1).a(new q(this, list, p1));
        return p1;
    }

    public final p a(int i, int j, List list, boolean flag, List list1)
    {
        p p1 = new p();
        kik.android.chat.fragment.KikPickUsersFragment.a a1 = new kik.android.chat.fragment.KikPickUsersFragment.a();
        a1.b(i).c(j).a(flag).a(new ArrayList(list)).b(new ArrayList(list1)).a(a.w());
        a.a(a1).a(new r(this, list, p1));
        return p1;
    }

    public final p a(boolean flag, boolean flag1, String s1)
    {
        p p2 = new p();
        if (!flag)
        {
            p2.e();
            return p2;
        }
        p p1;
        if (a(s1) && flag1)
        {
            p1 = s.a(Boolean.TRUE);
        } else
        {
            p1 = b.e(s1);
        }
        com.kik.sdkutils.d.a(a, p1).a(new n(this, p2, s1));
        return p2;
    }

    public final boolean a(boolean flag, String s1)
    {
        if (!a(s1) || !flag) goto _L2; else goto _L1
_L1:
        boolean flag1 = false;
_L4:
        return flag1 && System.currentTimeMillis() - e < 3000L;
_L2:
        s1 = b.e(s1);
        try
        {
            s.b(s1, 50L);
        }
        catch (InterruptedException interruptedexception) { }
        if (s1.h())
        {
            s1 = (Boolean)s1.f();
            if (s1 != null)
            {
                if (!s1.booleanValue())
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                continue; /* Loop/switch isn't completed */
            }
        }
        flag1 = false;
        if (true) goto _L4; else goto _L3
_L3:
    }

}
