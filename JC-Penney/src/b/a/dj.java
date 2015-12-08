// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import java.io.PrintStream;
import java.io.PrintWriter;

// Referenced classes of package b.a:
//            dk

public final class dj extends dk
{

    private String a[];
    private boolean b;

    public final boolean a()
    {
        return b;
    }

    public final void printStackTrace(PrintStream printstream)
    {
        String as[] = a;
        int j = as.length;
        for (int i = 0; i < j; i++)
        {
            printstream.append(as[i]);
            printstream.append("\n");
        }

    }

    public final void printStackTrace(PrintWriter printwriter)
    {
        String as[] = a;
        int j = as.length;
        for (int i = 0; i < j; i++)
        {
            printwriter.append(as[i]);
            printwriter.append("\n");
        }

    }
}
