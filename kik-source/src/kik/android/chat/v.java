// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat;

import com.kik.android.a;
import com.kik.d.f;
import com.kik.g.k;
import java.util.TimerTask;
import kik.android.a.b;

// Referenced classes of package kik.android.chat:
//            KikApplication

final class v extends TimerTask
{

    final KikApplication a;

    v(KikApplication kikapplication)
    {
        a = kikapplication;
        super();
    }

    public final void run()
    {
        a.l();
        KikApplication.w(a).a(null);
        KikApplication.x(a);
        KikApplication.c(a).c().b();
        a.b.d();
    }
}
