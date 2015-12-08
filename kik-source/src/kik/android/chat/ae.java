// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat;

import com.kik.d.f;
import java.util.HashMap;
import java.util.Map;
import kik.a.f.f.e;
import kik.a.f.k;
import kik.a.h.j;
import kik.android.a.b;
import kik.android.util.DeviceUtils;

// Referenced classes of package kik.android.chat:
//            ad, KikApplication

final class ae
    implements Runnable
{

    final kik.a.b.a.a.d a;
    final ad b;

    ae(ad ad1, kik.a.b.a.a.d d)
    {
        b = ad1;
        a = d;
        super();
    }

    public final void run()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("ct", Long.valueOf(a.b));
        hashmap.put("qt", Long.valueOf(a.c));
        hashmap.put("bt", Long.valueOf(a.d));
        HashMap hashmap1;
        long l;
        if (kik.android.chat.KikApplication.e(b.a))
        {
            l = 1L;
        } else
        {
            l = 0L;
        }
        hashmap.put("s", Long.valueOf(l));
        hashmap1 = new HashMap(2);
        kik.android.chat.KikApplication.f(b.a);
        l = j.b();
        if (Long.valueOf(j.c()).longValue() == -1L)
        {
            hashmap1.put("ctime", "true");
        }
        b.a.k();
        KikApplication.c(b.a).c().a(com.kik.d.b.a.k.l, hashmap1, null, hashmap, Long.valueOf(l).longValue());
        if (DeviceUtils.a())
        {
            KikApplication.h(b.a).a(new e(DeviceUtils.a(b.a, KikApplication.g(b.a).j(), a.a)));
        }
    }
}
