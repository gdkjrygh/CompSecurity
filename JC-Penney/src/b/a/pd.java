// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import java.io.PrintStream;
import java.io.PrintWriter;

public class pd extends RuntimeException
{

    private StringBuffer a;

    public pd(String s)
    {
        this(s, null);
    }

    private pd(String s, Throwable throwable)
    {
        if (s == null)
        {
            if (throwable != null)
            {
                s = throwable.getMessage();
            } else
            {
                s = null;
            }
        }
        super(s, throwable);
        if (throwable instanceof pd)
        {
            s = ((pd)throwable).a.toString();
            a = new StringBuffer(s.length() + 200);
            a.append(s);
            return;
        } else
        {
            a = new StringBuffer(200);
            return;
        }
    }

    public pd(Throwable throwable)
    {
        this(null, throwable);
    }

    public static pd a(Throwable throwable, String s)
    {
        if (throwable instanceof pd)
        {
            throwable = (pd)throwable;
        } else
        {
            throwable = new pd(throwable);
        }
        throwable.a(s);
        return throwable;
    }

    public final void a(String s)
    {
        if (s == null)
        {
            throw new NullPointerException("str == null");
        }
        a.append(s);
        if (!s.endsWith("\n"))
        {
            a.append('\n');
        }
    }

    public void printStackTrace(PrintStream printstream)
    {
        super.printStackTrace(printstream);
        printstream.println(a);
    }

    public void printStackTrace(PrintWriter printwriter)
    {
        super.printStackTrace(printwriter);
        printwriter.println(a);
    }
}
