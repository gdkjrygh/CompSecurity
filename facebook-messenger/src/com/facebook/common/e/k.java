// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.e;

import org.acra.ErrorReporter;

// Referenced classes of package com.facebook.common.e:
//            b, i

class k
    implements Runnable
{

    final String a;
    final String b;
    final String c;
    final i d;

    k(i i, String s, String s1, String s2)
    {
        d = i;
        a = s;
        b = s1;
        c = s2;
        super();
    }

    public void run()
    {
        com/facebook/common/e/b;
        JVM INSTR monitorenter ;
        ErrorReporter errorreporter = ErrorReporter.getInstance();
        errorreporter.putCustomData("strict_mode_category", a.replace("\n", "\\n"));
        errorreporter.putCustomData("strict_mode_message", b.replace("\n", "\\n"));
        errorreporter.handleException(c);
        errorreporter.removeCustomData("strict_mode_category");
        errorreporter.removeCustomData("strict_mode_message");
        com/facebook/common/e/b;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        com/facebook/common/e/b;
        JVM INSTR monitorexit ;
        try
        {
            throw exception;
        }
        catch (Throwable throwable)
        {
            return;
        }
    }
}
