// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import com.android.volley.w;
import com.kik.m.k;
import java.io.File;
import java.util.UUID;
import kik.a.d.a.a;
import kik.a.d.s;
import kik.a.e.v;
import kik.android.f.a.f;
import kik.android.net.a.c;
import kik.android.net.a.e;

// Referenced classes of package kik.android.chat.fragment:
//            du, KikChatFragment

final class dw
    implements com.kik.cache.ad.d
{

    final du a;

    dw(du du1)
    {
        a = du1;
        super();
    }

    public final void a(w w)
    {
        kik.android.chat.fragment.KikChatFragment.e(a.e, a.e.getString(0x7f090134));
    }

    public final void a(com.kik.cache.ad.c c1, boolean flag)
    {
        if (c1.b() == null)
        {
            return;
        }
        c1 = k.b(c1.b(), android.graphics.Bitmap.CompressFormat.JPEG, 100);
        if (c1 == null)
        {
            kik.android.chat.fragment.KikChatFragment.e(a.e, a.e.getString(0x7f090134));
            return;
        }
        a.c.f(UUID.randomUUID().toString());
        a.e.d.a(a.c.o(), c1, true, false, false);
        c1 = a.e.d.b(a.c.o(), true);
        if (c1 == null)
        {
            kik.android.chat.fragment.KikChatFragment.e(a.e, a.e.getString(0x7f090134));
            return;
        }
        a.c.a("int-file-url-local", c1.getAbsolutePath());
        c1 = KikChatFragment.ag(a.e).h(a.c.o());
        if (c1 != null)
        {
            a.c.a("file-url", c1);
        }
        a.e.a(null);
        c1 = new c(a.c, a.b.i(), a.c.o(), a.b.o(), a.e.g, true, a.e.i, a.e.h, a.e.d, a.e.k, a.e.p);
        e.a().a(c1);
    }
}
