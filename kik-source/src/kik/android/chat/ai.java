// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat;

import com.kik.g.i;
import com.kik.l.ab;
import java.util.Vector;
import kik.a.d.a.a;
import kik.a.d.a.g;
import kik.a.d.f;
import kik.a.d.s;
import kik.a.e.v;
import kik.android.KikNotificationHandler;
import kik.android.d.b;
import kik.android.d.c;
import kik.android.d.d;
import kik.android.util.ct;

// Referenced classes of package kik.android.chat:
//            KikApplication

final class ai extends i
{

    final KikApplication a;

    ai(KikApplication kikapplication)
    {
        a = kikapplication;
        super();
    }

    public final void a(Object obj, Object obj1)
    {
        s s1;
        boolean flag2;
        s1 = (s)obj1;
        flag2 = a.c(s1.i());
        a.a(s1);
        obj = kik.android.chat.KikApplication.a(a).a(s1.i());
        if (obj != null)
        {
            if (((f) (obj)).c().size() <= 1)
            {
                kik.android.chat.KikApplication.i(a).a(((f) (obj)), s1);
            }
            ((f) (obj)).t();
        }
        if (!kik.android.chat.KikApplication.a(a).a(s1)) goto _L2; else goto _L1
_L1:
        a a1 = (a)g.a(s1, kik/a/d/a/a);
        if (a1 == null) goto _L4; else goto _L3
_L3:
        if (!kik.android.f.a.f.c(a1)) goto _L6; else goto _L5
_L5:
        boolean flag;
        boolean flag1;
        flag = false;
        flag1 = true;
_L8:
        obj1 = (Boolean)d.a(a.getApplicationContext()).a("content-preload").b();
        obj = obj1;
        if (obj1 == null)
        {
            obj = Boolean.valueOf(true);
        }
        if (flag1 && ((Boolean) (obj)).booleanValue())
        {
            kik.android.util.a.a().a(a1.g("file-url"), a1.o(), s1.o());
        }
        if (flag && ct.a(a.getApplicationContext(), s1.i(), kik.android.chat.KikApplication.a(a), kik.android.chat.KikApplication.i(a)))
        {
            KikApplication.j(a).a(a1, s1.o(), null, a.b);
        }
        KikApplication.p().a(s1, flag2);
_L2:
        return;
_L6:
        if (kik.android.f.a.f.d(a1))
        {
            flag = true;
            flag1 = false;
            continue; /* Loop/switch isn't completed */
        }
_L4:
        flag = false;
        flag1 = false;
        if (true) goto _L8; else goto _L7
_L7:
    }
}
