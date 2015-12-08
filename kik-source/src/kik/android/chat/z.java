// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat;

import android.os.Handler;
import com.kik.g.i;
import kik.a.h.j;

// Referenced classes of package kik.android.chat:
//            KikApplication, aa

final class z extends i
{

    final KikApplication a;

    z(KikApplication kikapplication)
    {
        a = kikapplication;
        super();
    }

    public final void a(Object obj, Object obj1)
    {
        obj = (kik.a.b.a.a.c)obj1;
        long l = j.b();
        KikApplication.d(a).post(new aa(this, l, ((kik.a.b.a.a.c) (obj))));
    }
}
