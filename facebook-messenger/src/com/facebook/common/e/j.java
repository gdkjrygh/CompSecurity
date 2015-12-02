// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.e;

import com.google.common.base.Throwables;
import javax.inject.a;
import org.acra.ErrorReporter;

// Referenced classes of package com.facebook.common.e:
//            b, i

class j
    implements Runnable
{

    final String a;
    final String b;
    final Throwable c;
    final i d;

    j(i k, String s, String s1, Throwable throwable)
    {
        d = k;
        a = s;
        b = s1;
        c = throwable;
        super();
    }

    public void run()
    {
        com/facebook/common/e/b;
        JVM INSTR monitorenter ;
        ErrorReporter errorreporter = (ErrorReporter)com.facebook.common.e.i.a(d).b();
        errorreporter.putCustomData("soft_error_category", a.replace("\n", "\\n"));
        errorreporter.putCustomData("soft_error_message", b.replace("\n", "\\n"));
        errorreporter.handleException(c);
        errorreporter.removeCustomData("soft_error_category");
        errorreporter.removeCustomData("soft_error_message");
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
            if (i.b(d))
            {
                Throwables.propagate(throwable);
            }
        }
        return;
    }
}
