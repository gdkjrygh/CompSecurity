// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat;

import android.os.Handler;
import com.kik.g.r;

// Referenced classes of package kik.android.chat:
//            KikApplication, q

final class p extends r
{

    final KikApplication a;

    p(KikApplication kikapplication)
    {
        a = kikapplication;
        super();
    }

    public final void c()
    {
        KikApplication.d(a).post(new q(this));
    }
}
