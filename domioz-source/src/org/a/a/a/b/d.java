// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.a.a.a.b;

import java.io.PrintStream;
import java.io.PrintWriter;

// Referenced classes of package org.a.a.a.b:
//            b, c

public class d extends RuntimeException
    implements b
{

    protected c a;
    private Throwable b;

    public d(Throwable throwable)
    {
        a = new c(this);
        b = null;
        b = throwable;
    }

    public final void a(PrintWriter printwriter)
    {
        super.printStackTrace(printwriter);
    }

    public Throwable getCause()
    {
        return b;
    }

    public String getMessage()
    {
        if (super.getMessage() != null)
        {
            return super.getMessage();
        }
        if (b != null)
        {
            return b.toString();
        } else
        {
            return null;
        }
    }

    public void printStackTrace()
    {
        a.a(System.err);
    }

    public void printStackTrace(PrintStream printstream)
    {
        a.a(printstream);
    }

    public void printStackTrace(PrintWriter printwriter)
    {
        a.a(printwriter);
    }
}
