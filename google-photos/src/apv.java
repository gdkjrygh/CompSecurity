// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class apv extends Exception
{

    private static final StackTraceElement a[] = new StackTraceElement[0];
    private final List b;
    private ane c;
    private amz d;
    private Class e;

    public apv(String s)
    {
        this(s, Collections.emptyList());
    }

    public apv(String s, Exception exception)
    {
        this(s, Collections.singletonList(exception));
    }

    public apv(String s, List list)
    {
        super(s);
        setStackTrace(a);
        b = list;
    }

    private void a(Appendable appendable)
    {
        int i;
        a(((Exception) (this)), appendable);
        List list = b;
        appendable = new apw(appendable);
        Exception exception;
        int j;
        try
        {
            j = list.size();
        }
        // Misplaced declaration of an exception variable
        catch (Appendable appendable)
        {
            throw new RuntimeException(appendable);
        }
        i = 0;
_L2:
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_130;
        }
        appendable.append("Cause (").append(String.valueOf(i + 1)).append(" of ").append(String.valueOf(j)).append("): ");
        exception = (Exception)list.get(i);
        if (exception instanceof apv)
        {
            ((apv)exception).a(appendable);
            break MISSING_BLOCK_LABEL_131;
        }
        a(exception, appendable);
        break MISSING_BLOCK_LABEL_131;
        return;
        i++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private static void a(Exception exception, Appendable appendable)
    {
        try
        {
            appendable.append(exception.getClass().toString()).append(": ").append(exception.getMessage()).append('\n');
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Appendable appendable)
        {
            throw new RuntimeException(exception);
        }
    }

    private void a(Exception exception, List list)
    {
        if (exception instanceof apv)
        {
            for (exception = ((apv)exception).b.iterator(); exception.hasNext(); a((Exception)exception.next(), list)) { }
        } else
        {
            list.add(exception);
        }
    }

    public final List a()
    {
        ArrayList arraylist = new ArrayList();
        a(((Exception) (this)), ((List) (arraylist)));
        return arraylist;
    }

    final void a(ane ane, amz amz, Class class1)
    {
        c = ane;
        d = amz;
        e = class1;
    }

    public final void a(String s)
    {
        String s1 = String.valueOf(getClass());
        String s2 = String.valueOf(getMessage());
        Log.e(s, (new StringBuilder(String.valueOf(s1).length() + 2 + String.valueOf(s2).length())).append(s1).append(": ").append(s2).toString());
        s = a();
        int i = 0;
        for (int j = s.size(); i < j; i++)
        {
            (new StringBuilder(39)).append("Root cause (").append(i + 1).append(" of ").append(j).append(")");
            s.get(i);
        }

    }

    public final Throwable fillInStackTrace()
    {
        return this;
    }

    public final String getMessage()
    {
        String s3 = String.valueOf(super.getMessage());
        String s;
        String s1;
        String s2;
        if (e != null)
        {
            s = String.valueOf(e);
            s = (new StringBuilder(String.valueOf(s).length() + 2)).append(", ").append(s).toString();
        } else
        {
            s = "";
        }
        if (d != null)
        {
            s1 = String.valueOf(d);
            s1 = (new StringBuilder(String.valueOf(s1).length() + 2)).append(", ").append(s1).toString();
        } else
        {
            s1 = "";
        }
        if (c != null)
        {
            s2 = String.valueOf(c);
            s2 = (new StringBuilder(String.valueOf(s2).length() + 2)).append(", ").append(s2).toString();
        } else
        {
            s2 = "";
        }
        return (new StringBuilder(String.valueOf(s3).length() + 0 + String.valueOf(s).length() + String.valueOf(s1).length() + String.valueOf(s2).length())).append(s3).append(s).append(s1).append(s2).toString();
    }

    public final void printStackTrace()
    {
        printStackTrace(System.err);
    }

    public final void printStackTrace(PrintStream printstream)
    {
        a(printstream);
    }

    public final void printStackTrace(PrintWriter printwriter)
    {
        a(printwriter);
    }

}
