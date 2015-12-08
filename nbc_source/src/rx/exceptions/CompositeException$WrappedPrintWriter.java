// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.exceptions;

import java.io.PrintWriter;

// Referenced classes of package rx.exceptions:
//            CompositeException

private static class printWriter extends 
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

    (PrintWriter printwriter)
    {
        super(null);
        printWriter = printwriter;
    }
}
