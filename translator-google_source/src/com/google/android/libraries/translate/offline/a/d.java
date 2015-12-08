// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.offline.a;

import android.os.Handler;
import com.google.android.libraries.translate.offline.o;
import java.util.Timer;

// Referenced classes of package com.google.android.libraries.translate.offline.a:
//            e, a

public final class d
{

    final o a;
    final a b;
    boolean c;
    com.google.android.libraries.translate.offline.OfflinePackage.Status d;
    public Timer e;
    private final Handler f = new Handler();

    public d(o o, a a1)
    {
        c = false;
        a = o;
        b = a1;
    }

    public final void a()
    {
        this;
        JVM INSTR monitorenter ;
        if (e != null)
        {
            e.cancel();
            e.purge();
            e = null;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void b()
    {
        f.post(new e(this));
    }
}
