// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.nobreak;

import android.app.Application;

// Referenced classes of package com.facebook.nobreak:
//            DummyCatchMeIfYouCan, DefaultCatchMeIfYouCan, CatchMeIfYouCan

public final class CatchMeIfYouCanHolder
{

    private static final Object a = new Object[0];
    private static volatile CatchMeIfYouCan b;

    private CatchMeIfYouCanHolder()
    {
    }

    public static CatchMeIfYouCan a()
    {
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        if (b != null)
        {
            throw new IllegalStateException("Already initialized.");
        }
        break MISSING_BLOCK_LABEL_27;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        b = new DummyCatchMeIfYouCan();
        obj;
        JVM INSTR monitorexit ;
        return b;
    }

    public static CatchMeIfYouCan a(Application application, DefaultCatchMeIfYouCan.ProcessProfile aprocessprofile[])
    {
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        if (b != null)
        {
            throw new IllegalStateException("Already initialized.");
        }
        break MISSING_BLOCK_LABEL_27;
        application;
        obj;
        JVM INSTR monitorexit ;
        throw application;
        b = new DefaultCatchMeIfYouCan(application, aprocessprofile);
        obj;
        JVM INSTR monitorexit ;
        return b;
    }

    public static CatchMeIfYouCan b()
    {
        c();
        return b;
    }

    private static void c()
    {
        if (b == null)
        {
            synchronized (a)
            {
                if (b == null)
                {
                    b = new DummyCatchMeIfYouCan();
                }
            }
            return;
        } else
        {
            return;
        }
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

}
