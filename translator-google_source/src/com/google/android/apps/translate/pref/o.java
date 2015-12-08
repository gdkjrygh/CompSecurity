// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.pref;

import android.os.Handler;
import com.google.android.libraries.translate.e.l;

// Referenced classes of package com.google.android.apps.translate.pref:
//            p, i

final class o extends Handler
    implements l, Runnable
{

    private boolean a;
    private i b;

    public o(i j)
    {
        a = false;
        b = j;
    }

    static boolean a(o o1)
    {
        o1.a = true;
        return true;
    }

    static i b(o o1)
    {
        return o1.b;
    }

    public final void a(Object obj)
    {
        post(new p(this, (Boolean)obj));
    }

    public final void run()
    {
        this;
        JVM INSTR monitorenter ;
        if (!a)
        {
            a = true;
            b.b();
        }
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
