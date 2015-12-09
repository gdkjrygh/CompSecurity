// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bolts;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class AggregateException extends Exception
{

    private static final String a = "There were multiple errors.";
    private static final long serialVersionUID = 1L;
    private List innerThrowables;

    public AggregateException(String s, List list)
    {
        Throwable throwable;
        if (list != null && list.size() > 0)
        {
            throwable = (Throwable)list.get(0);
        } else
        {
            throwable = null;
        }
        super(s, throwable);
        innerThrowables = Collections.unmodifiableList(list);
    }

    public AggregateException(String s, Throwable athrowable[])
    {
        this(s, Arrays.asList(athrowable));
    }

    public AggregateException(List list)
    {
        this("There were multiple errors.", list);
    }

    public List a()
    {
        return innerThrowables;
    }

    public List b()
    {
        ArrayList arraylist = new ArrayList();
        if (innerThrowables == null)
        {
            return arraylist;
        }
        for (Iterator iterator = innerThrowables.iterator(); iterator.hasNext();)
        {
            Throwable throwable = (Throwable)iterator.next();
            if (throwable instanceof Exception)
            {
                arraylist.add((Exception)throwable);
            } else
            {
                arraylist.add(new Exception(throwable));
            }
        }

        return arraylist;
    }

    public Throwable[] c()
    {
        return (Throwable[])innerThrowables.toArray(new Throwable[innerThrowables.size()]);
    }

    public void printStackTrace(PrintStream printstream)
    {
        super.printStackTrace(printstream);
        Iterator iterator = innerThrowables.iterator();
        int i = -1;
        for (; iterator.hasNext(); printstream.append("\n"))
        {
            Throwable throwable = (Throwable)iterator.next();
            printstream.append("\n");
            printstream.append("  Inner throwable #");
            i++;
            printstream.append(Integer.toString(i));
            printstream.append(": ");
            throwable.printStackTrace(printstream);
        }

    }

    public void printStackTrace(PrintWriter printwriter)
    {
        super.printStackTrace(printwriter);
        Iterator iterator = innerThrowables.iterator();
        int i = -1;
        for (; iterator.hasNext(); printwriter.append("\n"))
        {
            Throwable throwable = (Throwable)iterator.next();
            printwriter.append("\n");
            printwriter.append("  Inner throwable #");
            i++;
            printwriter.append(Integer.toString(i));
            printwriter.append(": ");
            throwable.printStackTrace(printwriter);
        }

    }
}
