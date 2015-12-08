// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat;

import com.kik.android.a;
import com.kik.g.i;
import java.util.List;
import kik.a.e.r;

// Referenced classes of package kik.android.chat:
//            KikApplication

final class g extends i
{

    final KikApplication a;

    g(KikApplication kikapplication)
    {
        a = kikapplication;
        super();
    }

    public final void a(Object obj, Object obj1)
    {
        a.b.a("Contact List Size", KikApplication.b(a).h().size());
        a.b.a("Block List Size", KikApplication.b(a).i().size());
    }
}
