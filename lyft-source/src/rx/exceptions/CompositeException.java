// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.exceptions;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public final class CompositeException extends RuntimeException
{

    private static final long serialVersionUID = 0x29ffcc6947b49592L;
    private Throwable cause;
    private final List exceptions;
    private final String message;

    public CompositeException(String s, Collection collection)
    {
        cause = null;
        s = new LinkedHashSet();
        ArrayList arraylist = new ArrayList();
        if (collection != null)
        {
            for (collection = collection.iterator(); collection.hasNext();)
            {
                Throwable throwable = (Throwable)collection.next();
                if (throwable instanceof CompositeException)
                {
                    s.addAll(((CompositeException)throwable).getExceptions());
                } else
                if (throwable != null)
                {
                    s.add(throwable);
                } else
                {
                    s.add(new NullPointerException());
                }
            }

        } else
        {
            s.add(new NullPointerException());
        }
        arraylist.addAll(s);
        exceptions = Collections.unmodifiableList(arraylist);
        message = (new StringBuilder()).append(exceptions.size()).append(" exceptions occurred. ").toString();
    }

    public CompositeException(Collection collection)
    {
        this(null, collection);
    }

    private void appendStackTrace(StringBuilder stringbuilder, Throwable throwable, String s)
    {
        stringbuilder.append(s).append(throwable).append("\n");
        s = throwable.getStackTrace();
        int j = s.length;
        for (int i = 0; i < j; i++)
        {
            Object obj = s[i];
            stringbuilder.append("\t\tat ").append(obj).append("\n");
        }

        if (throwable.getCause() != null)
        {
            stringbuilder.append("\tCaused by: ");
            appendStackTrace(stringbuilder, throwable.getCause(), "");
        }
    }

    private final List getListOfCauses(Throwable throwable)
    {
        ArrayList arraylist = new ArrayList();
        Throwable throwable1 = throwable.getCause();
        throwable = throwable1;
        if (throwable1 == null)
        {
            return arraylist;
        }
        do
        {
            arraylist.add(throwable);
            if (throwable.getCause() != null)
            {
                throwable = throwable.getCause();
            } else
            {
                return arraylist;
            }
        } while (true);
    }

    private void printStackTrace(PrintStreamOrWriter printstreamorwriter)
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(this).append("\n");
        StackTraceElement astacktraceelement[] = getStackTrace();
        int k = astacktraceelement.length;
        for (int i = 0; i < k; i++)
        {
            StackTraceElement stacktraceelement = astacktraceelement[i];
            stringbuilder.append("\tat ").append(stacktraceelement).append("\n");
        }

        Iterator iterator = exceptions.iterator();
        for (int j = 1; iterator.hasNext(); j++)
        {
            Throwable throwable = (Throwable)iterator.next();
            stringbuilder.append("  ComposedException ").append(j).append(" :").append("\n");
            appendStackTrace(stringbuilder, throwable, "\t");
        }

        synchronized (printstreamorwriter.lock())
        {
            printstreamorwriter.println(stringbuilder.toString());
        }
        return;
        printstreamorwriter;
        obj;
        JVM INSTR monitorexit ;
        throw printstreamorwriter;
    }

    public Throwable getCause()
    {
        this;
        JVM INSTR monitorenter ;
        CompositeExceptionCausalChain compositeexceptioncausalchain;
        HashSet hashset;
        Iterator iterator;
        if (cause != null)
        {
            break MISSING_BLOCK_LABEL_176;
        }
        compositeexceptioncausalchain = new CompositeExceptionCausalChain();
        hashset = new HashSet();
        iterator = exceptions.iterator();
        Object obj = compositeexceptioncausalchain;
_L3:
        Object obj1;
        Iterator iterator1;
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_171;
            }
            obj1 = (Throwable)iterator.next();
        } while (hashset.contains(obj1));
        hashset.add(obj1);
        iterator1 = getListOfCauses(((Throwable) (obj1))).iterator();
_L2:
        Throwable throwable1;
        do
        {
            if (!iterator1.hasNext())
            {
                break MISSING_BLOCK_LABEL_157;
            }
            throwable1 = (Throwable)iterator1.next();
            if (!hashset.contains(throwable1))
            {
                break MISSING_BLOCK_LABEL_139;
            }
            obj1 = new RuntimeException("Duplicate found in causal chain so cropping to prevent loop ...");
        } while (true);
        hashset.add(throwable1);
        if (true) goto _L2; else goto _L1
_L1:
        obj;
        throw obj;
        try
        {
            ((Throwable) (obj)).initCause(((Throwable) (obj1)));
        }
        catch (Throwable throwable) { }
        obj = ((Throwable) (obj)).getCause();
          goto _L3
        cause = compositeexceptioncausalchain;
        obj = cause;
        this;
        JVM INSTR monitorexit ;
        return ((Throwable) (obj));
    }

    public List getExceptions()
    {
        return exceptions;
    }

    public String getMessage()
    {
        return message;
    }

    public void printStackTrace()
    {
        printStackTrace(System.err);
    }

    public void printStackTrace(PrintStream printstream)
    {
        printStackTrace(((PrintStreamOrWriter) (new WrappedPrintStream(printstream))));
    }

    public void printStackTrace(PrintWriter printwriter)
    {
        printStackTrace(((PrintStreamOrWriter) (new WrappedPrintWriter(printwriter))));
    }

    private class PrintStreamOrWriter
    {

        abstract Object lock();

        abstract void println(Object obj);

        private PrintStreamOrWriter()
        {
        }

    }


    private class CompositeExceptionCausalChain extends RuntimeException
    {

        static String MESSAGE = "Chain of Causes for CompositeException In Order Received =>";
        private static final long serialVersionUID = 0x35c7853e403cebd2L;

        public String getMessage()
        {
            return MESSAGE;
        }


        CompositeExceptionCausalChain()
        {
        }
    }


    private class WrappedPrintStream extends PrintStreamOrWriter
    {

        private final PrintStream printStream;

        Object lock()
        {
            return printStream;
        }

        void println(Object obj)
        {
            printStream.println(obj);
        }

        WrappedPrintStream(PrintStream printstream)
        {
            printStream = printstream;
        }
    }


    private class WrappedPrintWriter extends PrintStreamOrWriter
    {

        private final PrintWriter printWriter;

        Object lock()
        {
            return printWriter;
        }

        void println(Object obj)
        {
            printWriter.println(obj);
        }

        WrappedPrintWriter(PrintWriter printwriter)
        {
            printWriter = printwriter;
        }
    }

}
