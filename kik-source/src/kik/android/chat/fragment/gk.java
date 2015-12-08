// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import com.kik.g.r;
import java.util.List;
import kik.a.d.n;
import kik.a.e.i;
import kik.a.f.q;
import kik.android.util.cq;

// Referenced classes of package kik.android.chat.fragment:
//            KikChatInfoFragment

final class gk extends r
{

    final KikChatInfoFragment a;

    gk(KikChatInfoFragment kikchatinfofragment)
    {
        a = kikchatinfofragment;
        super();
    }

    public final void a(Object obj)
    {
        obj = (n)obj;
        KikChatInfoFragment.c(a, ((kik.a.d.k) (obj)));
        KikChatInfoFragment.a(a, a.r.a(((n) (obj)).b()));
        KikChatInfoFragment.a(a, ((n) (obj)).b());
        a.w();
    }

    public final void a(Throwable throwable)
    {
        a.w();
        int j = 100;
        Object obj = null;
        if (throwable instanceof q)
        {
            throwable = (q)throwable;
            j = throwable.a();
            obj = throwable.b();
        }
        switch (j)
        {
        default:
            a.d(j);
            return;

        case 202: 
            a.a(KikChatInfoFragment.b(0x7f0902ba), KikChatInfoFragment.b(0x7f090025));
            return;

        case 203: 
            a.a(KikChatInfoFragment.b(0x7f0902ba), KikChatInfoFragment.b(0x7f09011a));
            return;

        case 201: 
            obj = (String)obj;
            throwable = ((Throwable) (obj));
            if (obj == null)
            {
                throwable = KikChatInfoFragment.b(0x7f090202);
            }
            a.a(KikChatInfoFragment.b(0x7f0902ba), KikChatInfoFragment.a(0x7f0901a2, new Object[] {
                throwable
            }));
            return;

        case 104: // 'h'
            a.a(cq.a(), (String)obj);
            return;

        case 4002: 
            break;
        }
        if (obj != null)
        {
            cq.a((List)obj, a.s);
            a.a(KikChatInfoFragment.b(0x7f0902ba), KikChatInfoFragment.b(0x7f090119));
            return;
        } else
        {
            a.d(j);
            return;
        }
    }
}
