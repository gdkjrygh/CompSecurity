// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat;

import com.kik.g.f;
import com.kik.g.i;
import kik.a.d.aa;
import kik.a.f.f.ao;

// Referenced classes of package kik.android.chat:
//            KikApplication

final class x extends i
{

    final f a;
    final kik.a.e.f b;
    final aa c;
    final KikApplication d;

    x(KikApplication kikapplication, f f1, kik.a.e.f f2, aa aa1)
    {
        d = kikapplication;
        a = f1;
        b = f2;
        c = aa1;
        super();
    }

    public final void a(Object obj, Object obj1)
    {
        a.a();
        b.a(new ao(null, null, null, null, c.h, null, null));
    }
}
