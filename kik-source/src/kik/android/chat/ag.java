// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat;

import com.kik.android.a;
import com.kik.d.f;
import java.util.List;
import kik.a.e.i;
import kik.a.h.j;
import kik.android.a.b;

// Referenced classes of package kik.android.chat:
//            af, KikApplication

final class ag
    implements Runnable
{

    final Integer a;
    final af b;

    ag(af af1, Integer integer)
    {
        b = af1;
        a = integer;
        super();
    }

    public final void run()
    {
        Long long1 = Long.valueOf(j.b());
        if (Long.valueOf(j.c()).longValue() == -1L)
        {
            KikApplication.c(b.a).c().a(com.kik.d.b.a.k.n, "c", a.intValue(), "ctime", "true", long1.longValue());
        } else
        {
            KikApplication.c(b.a).c().a(com.kik.d.b.a.k.n, "c", a.intValue(), long1.longValue());
        }
        b.a.b.a("Chat List Size", kik.android.chat.KikApplication.a(b.a).A().size());
        b.a.b.a("New Chat List Size", kik.android.chat.KikApplication.a(b.a).B().size());
    }
}
