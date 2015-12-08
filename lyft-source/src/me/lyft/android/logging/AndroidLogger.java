// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.logging;

import android.util.Log;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package me.lyft.android.logging:
//            ILogger

public class AndroidLogger
    implements ILogger
{

    private static final Pattern ANONYMOUS_CLASS = Pattern.compile("(\\$\\d+)+$");
    private static final int CALL_STACK_INDEX = 5;
    private static final int MAX_LOG_LENGTH = 4000;

    public AndroidLogger()
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

    private void logMessage(int j, String s, Throwable throwable)
    {
        if (s != null && s.length() != 0)
        {
            break MISSING_BLOCK_LABEL_46;
        }
        if (throwable == null) goto _L2; else goto _L1
_L1:
        String s1 = Log.getStackTraceString(throwable);
_L3:
        s = createTag();
        if (s1.length() < 4000)
        {
            Log.println(j, s, s1);
        } else
        {
            throwable = s1.split("\n");
            int l = throwable.length;
            int k = 0;
            while (k < l) 
            {
                Log.println(j, s, throwable[k]);
                k++;
            }
        }
_L2:
        return;
        s1 = s;
        if (throwable != null)
        {
            s1 = (new StringBuilder()).append(s).append("\n").append(Log.getStackTraceString(throwable)).toString();
        }
          goto _L3
    }

    protected String createStackElementTag(StackTraceElement stacktraceelement)
    {
        stacktraceelement = stacktraceelement.getClassName();
        Matcher matcher = ANONYMOUS_CLASS.matcher(stacktraceelement);
        if (matcher.find())
        {
            stacktraceelement = matcher.replaceAll("");
        }
        return stacktraceelement.substring(stacktraceelement.lastIndexOf('.') + 1);
    }

    final String createTag()
    {
        StackTraceElement astacktraceelement[] = (new Throwable()).getStackTrace();
        if (astacktraceelement.length <= 5)
        {
            throw new IllegalStateException("Synthetic stacktrace didn't have enough elements: are you using proguard?");
        } else
        {
            return createStackElementTag(astacktraceelement[5]);
        }
    }

    public transient void d(String s, Object aobj[])
    {
        logMessage(3, formatString(s, aobj), null);
    }

    public transient void d(Throwable throwable, String s, Object aobj[])
    {
        logMessage(3, formatString(s, aobj), throwable);
    }

    public transient void e(String s, Object aobj[])
    {
        logMessage(6, formatString(s, aobj), null);
    }

    public transient void e(Throwable throwable, String s, Object aobj[])
    {
        logMessage(6, formatString(s, aobj), throwable);
    }

    public transient void i(String s, Object aobj[])
    {
        logMessage(4, formatString(s, aobj), null);
    }

    public transient void i(Throwable throwable, String s, Object aobj[])
    {
        logMessage(4, formatString(s, aobj), throwable);
    }

    public transient void v(String s, Object aobj[])
    {
        logMessage(2, formatString(s, aobj), null);
    }

    public transient void v(Throwable throwable, String s, Object aobj[])
    {
        logMessage(2, formatString(s, aobj), throwable);
    }

    public transient void w(String s, Object aobj[])
    {
        logMessage(5, formatString(s, aobj), null);
    }

    public transient void w(Throwable throwable, String s, Object aobj[])
    {
        logMessage(5, formatString(s, aobj), throwable);
    }

}
