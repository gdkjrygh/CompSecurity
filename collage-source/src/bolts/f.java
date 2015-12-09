// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bolts;

import java.util.Locale;

public class f
{

    private final Object a = new Object();
    private boolean b;

    f()
    {
    }

    public boolean a()
    {
        boolean flag;
        synchronized (a)
        {
            flag = b;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    boolean b()
    {
label0:
        {
            synchronized (a)
            {
                if (!b)
                {
                    break label0;
                }
            }
            return false;
        }
        b = true;
        obj;
        JVM INSTR monitorexit ;
        return true;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public String toString()
    {
        return String.format(Locale.US, "%s@%s[cancellationRequested=%s]", new Object[] {
            getClass().getName(), Integer.toHexString(hashCode()), Boolean.toString(b)
        });
    }
}
