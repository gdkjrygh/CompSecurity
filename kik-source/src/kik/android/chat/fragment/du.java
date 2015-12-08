// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import com.kik.cache.ad;
import com.kik.g.p;
import com.kik.g.r;
import com.kik.l.ab;
import com.kik.m.o;
import java.security.KeyPair;
import java.util.List;
import kik.a.d.a.a;
import kik.a.d.s;
import kik.a.f.f.v;
import kik.a.z;

// Referenced classes of package kik.android.chat.fragment:
//            KikChatFragment, dv, dw

final class du extends r
{

    final byte a[];
    final s b;
    final a c;
    final a d;
    final KikChatFragment e;

    du(KikChatFragment kikchatfragment, byte abyte0[], s s1, a a1, a a2)
    {
        e = kikchatfragment;
        a = abyte0;
        b = s1;
        c = a1;
        d = a2;
        super();
    }

    public final void a(Object obj)
    {
        obj = (o)obj;
        boolean flag = v.a((List)((o) (obj)).b, (KeyPair)((o) (obj)).a);
        if (a == null && flag || a != null && !flag)
        {
            KikChatFragment.q();
            if (!flag)
            {
                b.a(null);
            }
            if (c.u().equals("com.kik.ext.video-gallery") || c.u().equals("com.kik.ext.video-camera"))
            {
                e.n.a(c, a, null, e.g).a(new dv(this));
                return;
            }
            obj = com.kik.cache.o.a(d, a, e.g, e.i, z.b(e.d));
            if (obj != null)
            {
                e.b.a(((com.kik.cache.z) (obj)), new dw(this));
                return;
            } else
            {
                e.a(null);
                return;
            }
        } else
        {
            e.a(null);
            return;
        }
    }

    public final void a(Throwable throwable)
    {
        KikChatFragment.e(e, e.getString(0x7f090134));
    }
}
