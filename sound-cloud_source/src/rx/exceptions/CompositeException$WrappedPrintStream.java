// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.exceptions;

import java.io.PrintStream;

// Referenced classes of package rx.exceptions:
//            CompositeException

private static class printStream extends 
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

    (PrintStream printstream)
    {
        super(null);
        printStream = printstream;
    }
}
