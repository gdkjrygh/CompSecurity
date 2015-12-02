// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.base.a;

import android.app.Application;
import android.content.Context;
import com.facebook.common.l.h;

// Referenced classes of package com.facebook.base.a:
//            i

public abstract class j extends Application
{

    private i a;
    private final h b = new h(this);

    protected j()
    {
    }

    private void d()
    {
        this;
        JVM INSTR monitorenter ;
        if (a == null)
        {
            a = a();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    protected abstract i a();

    protected void attachBaseContext(Context context)
    {
        super.attachBaseContext(context);
        b();
        d();
    }

    protected void b()
    {
    }

    protected i c()
    {
        d();
        return a;
    }

    public void onCreate()
    {
        super.onCreate();
        d();
        a.c();
    }

    public void onLowMemory()
    {
        super.onLowMemory();
        d();
        a.e();
    }
}
