// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat;

import com.kik.g.k;
import com.kik.g.s;
import java.util.concurrent.Callable;

// Referenced classes of package kik.android.chat:
//            KikApplication

final class l
    implements Callable
{

    final KikApplication a;

    l(KikApplication kikapplication)
    {
        a = kikapplication;
        super();
    }

    public final Object call()
    {
        return s.b(KikApplication.u(a).a());
    }
}
