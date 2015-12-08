// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import com.kik.g.r;
import com.kik.l.ab;
import java.io.File;
import java.util.UUID;
import kik.a.d.a.a;
import kik.a.d.s;
import kik.android.f.a.f;
import kik.android.net.a.c;
import kik.android.net.a.e;
import kik.android.v;

// Referenced classes of package kik.android.chat.fragment:
//            du, KikChatFragment

final class dv extends r
{

    final du a;

    dv(du du1)
    {
        a = du1;
        super();
    }

    public final void a(Object obj)
    {
        obj = (File)obj;
        a.e.a(null);
        a.c.f(UUID.randomUUID().toString());
        a.e.n.a(a.c.o(), ((File) (obj)).getPath());
        a.c.a("int-file-url-local", ((File) (obj)).getAbsolutePath());
        obj = KikChatFragment.ag(a.e).h(a.c.o());
        if (obj != null)
        {
            a.c.a("file-url", ((String) (obj)));
        }
        obj = new c(a.c, a.b.i(), a.c.o(), a.b.o(), a.e.g, true, a.e.i, a.e.h, a.e.d, a.e.k, a.e.p);
        e.a().a(((kik.android.net.a.b) (obj)));
    }

    public final void b(Throwable throwable)
    {
        if (throwable instanceof v)
        {
            kik.android.chat.fragment.KikChatFragment.e(a.e, KikChatFragment.b(0x7f09014d));
            return;
        } else
        {
            kik.android.chat.fragment.KikChatFragment.e(a.e, KikChatFragment.b(0x7f090266));
            return;
        }
    }
}
