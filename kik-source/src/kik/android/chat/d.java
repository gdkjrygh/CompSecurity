// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat;

import android.content.Context;
import com.kik.android.a;
import com.kik.d.f;
import com.kik.g.i;
import java.io.File;
import java.util.Timer;
import kik.a.ab;
import kik.a.c.c;
import kik.android.KikNotificationHandler;
import kik.android.a.b;
import kik.android.util.bo;
import kik.android.util.ck;

// Referenced classes of package kik.android.chat:
//            KikApplication

final class d extends i
{

    final KikApplication a;

    d(KikApplication kikapplication)
    {
        a = kikapplication;
        super();
    }

    public final void a(Object obj, Object obj1)
    {
        kik.android.chat.KikApplication.i().c().b();
        a.b.d();
        a.b.a();
        obj = new File(new File(a.getApplicationContext().getCacheDir().getParentFile(), "app_cardsAppCache"), "localstorage");
        kik.android.chat.KikApplication.a(a, ((File) (obj)));
        obj = new File(new File(a.getApplicationContext().getCacheDir().getParentFile(), "app_webview"), "Local Storage");
        kik.android.chat.KikApplication.a(a, ((File) (obj)));
        KikApplication.p().a();
        KikApplication.p().b();
        KikApplication.k(a).a();
        a.c.g();
        a.e.c();
        a.h.a();
        a.i.g();
        kik.android.util.a.a().b();
        kik.android.util.a.a().c();
        kik.android.chat.KikApplication.c(a).g();
        KikApplication.n(a).a(KikApplication.l(a).b(), KikApplication.m(a));
        KikApplication.p(a).schedule(KikApplication.o(a), 10000L);
        KikApplication.q(a);
    }
}
