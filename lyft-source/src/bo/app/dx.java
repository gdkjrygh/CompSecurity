// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import com.appboy.Constants;
import com.appboy.support.AppboyLogger;

public abstract class dx
{

    private static final String b;
    private final Object a = new Object();
    private boolean c;

    public dx()
    {
        c = false;
    }

    abstract Object a();

    abstract void a(Object obj);

    public final Object b()
    {
label0:
        {
            synchronized (a)
            {
                if (!c)
                {
                    break label0;
                }
                AppboyLogger.i(b, "Received call to export dirty object, but the cache was already locked.");
            }
            return null;
        }
        Object obj1;
        c = true;
        obj1 = a();
        obj;
        JVM INSTR monitorexit ;
        return obj1;
        exception;
        throw exception;
    }

    public final boolean b(Object obj)
    {
label0:
        {
            synchronized (a)
            {
                if (c)
                {
                    break label0;
                }
                AppboyLogger.w(b, String.format("Tried to confirm [%s], but the cache wasn't locked, so not doing anything.", new Object[] {
                    String.valueOf(obj)
                }));
            }
            return false;
        }
        a(obj);
        c = false;
        obj1;
        JVM INSTR monitorexit ;
        return true;
        obj;
        throw obj;
    }

    static 
    {
        b = String.format("%s.%s", new Object[] {
            Constants.APPBOY_LOG_TAG_PREFIX, bo/app/dx.getName()
        });
    }
}
