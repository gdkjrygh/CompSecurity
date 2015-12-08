// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat;

import com.kik.g.i;
import kik.a.e.v;

// Referenced classes of package kik.android.chat:
//            KikApplication

final class f extends i
{

    final KikApplication a;

    f(KikApplication kikapplication)
    {
        a = kikapplication;
        super();
    }

    public final void a(Object obj, Object obj1)
    {
        kik.android.chat.KikApplication.i(a).a("kik.profile.outofdate", Boolean.valueOf(false));
    }
}
