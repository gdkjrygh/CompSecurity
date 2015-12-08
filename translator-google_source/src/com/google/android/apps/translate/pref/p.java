// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.pref;

import com.google.android.apps.translate.r;
import com.google.android.libraries.translate.e.m;

// Referenced classes of package com.google.android.apps.translate.pref:
//            o, i

final class p
    implements Runnable
{

    final Boolean a;
    final o b;

    p(o o1, Boolean boolean1)
    {
        b = o1;
        a = boolean1;
        super();
    }

    public final void run()
    {
        if (!a.booleanValue())
        {
            m.a(r.msg_download_offline_profile_failed, 1);
            return;
        }
        this;
        JVM INSTR monitorenter ;
        o.a(b);
        o.b(b).b();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
