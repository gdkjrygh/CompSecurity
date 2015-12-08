// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.d.a;

import java.io.PrintStream;

// Referenced classes of package org.d.a:
//            a

public final class b extends Exception
{

    protected Throwable a;
    protected int b;
    protected int c;

    public b(String s)
    {
        super(s);
        b = -1;
        c = -1;
    }

    public b(String s, a a1, Throwable throwable)
    {
        StringBuilder stringbuilder = new StringBuilder();
        if (s == null)
        {
            s = "";
        } else
        {
            s = (new StringBuilder()).append(s).append(" ").toString();
        }
        stringbuilder = stringbuilder.append(s);
        if (a1 == null)
        {
            s = "";
        } else
        {
            s = (new StringBuilder("(position:")).append(a1.getPositionDescription()).append(") ").toString();
        }
        stringbuilder = stringbuilder.append(s);
        if (throwable == null)
        {
            s = "";
        } else
        {
            s = (new StringBuilder("caused by: ")).append(throwable).toString();
        }
        super(stringbuilder.append(s).toString());
        b = -1;
        c = -1;
        if (a1 != null)
        {
            b = a1.getLineNumber();
            c = a1.getColumnNumber();
        }
        a = throwable;
    }

    public final int getColumnNumber()
    {
        return c;
    }

    public final Throwable getDetail()
    {
        return a;
    }

    public final int getLineNumber()
    {
        return b;
    }

    public final void printStackTrace()
    {
        if (a == null)
        {
            super.printStackTrace();
            return;
        }
        synchronized (System.err)
        {
            System.err.println((new StringBuilder()).append(super.getMessage()).append("; nested exception is:").toString());
            a.printStackTrace();
        }
        return;
        exception;
        printstream;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
