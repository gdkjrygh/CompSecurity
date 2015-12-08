// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.logging;

import com.crashlytics.android.Crashlytics;
import java.io.PrintWriter;
import java.io.StringWriter;
import me.lyft.android.common.Closeables;

// Referenced classes of package me.lyft.android.logging:
//            ILogger

public class CrashlyticsLogger
    implements ILogger
{

    public CrashlyticsLogger()
    {
    }

    static transient String formatString(String s, Object aobj[])
    {
        if (aobj.length == 0)
        {
            return s;
        } else
        {
            return String.format(s, aobj);
        }
    }

    static transient void log(String s, Object aobj[])
    {
        try
        {
            Crashlytics.a(formatString(s, aobj));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Crashlytics.a(s);
        }
    }

    static void logException(Throwable throwable)
    {
        Crashlytics.a(throwable);
    }

    static void logExceptionAsString(Throwable throwable)
    {
        Object obj;
        Object obj1;
        obj1 = null;
        obj = null;
        StringWriter stringwriter = new StringWriter();
        PrintWriter printwriter;
        try
        {
            printwriter = new PrintWriter(stringwriter);
        }
        // Misplaced declaration of an exception variable
        catch (Throwable throwable)
        {
            throwable = obj;
            continue; /* Loop/switch isn't completed */
        }
        finally
        {
            printwriter = null;
        }
        throwable.printStackTrace(printwriter);
        log(stringwriter.toString(), new Object[0]);
        Closeables.closeQuietly(printwriter);
        Closeables.closeQuietly(stringwriter);
        return;
        throwable;
        stringwriter = null;
        throwable = obj;
_L4:
        Closeables.closeQuietly(throwable);
        Closeables.closeQuietly(stringwriter);
        return;
        throwable;
        printwriter = null;
        stringwriter = obj1;
_L2:
        Closeables.closeQuietly(printwriter);
        Closeables.closeQuietly(stringwriter);
        throw throwable;
        throwable;
        if (true) goto _L2; else goto _L1
_L1:
        throwable;
        throwable = printwriter;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public transient void d(String s, Object aobj[])
    {
        log(s, aobj);
    }

    public transient void d(Throwable throwable, String s, Object aobj[])
    {
        log(s, aobj);
        logExceptionAsString(throwable);
    }

    public transient void e(String s, Object aobj[])
    {
        log(s, aobj);
    }

    public transient void e(Throwable throwable, String s, Object aobj[])
    {
        log(s, aobj);
        logException(throwable);
    }

    public transient void i(String s, Object aobj[])
    {
        log(s, aobj);
    }

    public transient void i(Throwable throwable, String s, Object aobj[])
    {
        log(s, aobj);
        logExceptionAsString(throwable);
    }

    public transient void v(String s, Object aobj[])
    {
        log(s, aobj);
    }

    public transient void v(Throwable throwable, String s, Object aobj[])
    {
        log(s, aobj);
        logExceptionAsString(throwable);
    }

    public transient void w(String s, Object aobj[])
    {
        log(s, aobj);
    }

    public transient void w(Throwable throwable, String s, Object aobj[])
    {
        log(s, aobj);
        logExceptionAsString(throwable);
    }
}
