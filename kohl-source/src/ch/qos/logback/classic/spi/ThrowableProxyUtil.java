// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.qos.logback.classic.spi;


// Referenced classes of package ch.qos.logback.classic.spi:
//            StackTraceElementProxy, IThrowableProxy, ClassPackagingData

public class ThrowableProxyUtil
{

    static int findNumberOfCommonFrames(StackTraceElement astacktraceelement[], StackTraceElementProxy astacktraceelementproxy[])
    {
        int i;
        int j;
        int l;
        i = 0;
        j = 0;
        l = j;
        if (astacktraceelementproxy == null) goto _L2; else goto _L1
_L1:
        if (astacktraceelement != null) goto _L4; else goto _L3
_L3:
        l = j;
_L2:
        return l;
_L4:
        int k;
        k = astacktraceelement.length - 1;
        j = astacktraceelementproxy.length - 1;
_L8:
        l = i;
        if (k < 0) goto _L2; else goto _L5
_L5:
        l = i;
        if (j < 0) goto _L2; else goto _L6
_L6:
        l = i;
        if (!astacktraceelement[k].equals(astacktraceelementproxy[j].ste)) goto _L2; else goto _L7
_L7:
        i++;
        k--;
        j--;
          goto _L8
    }

    static StackTraceElementProxy[] steArrayToStepArray(StackTraceElement astacktraceelement[])
    {
        int i = 0;
        if (astacktraceelement == null)
        {
            return new StackTraceElementProxy[0];
        }
        StackTraceElementProxy astacktraceelementproxy[];
        for (astacktraceelementproxy = new StackTraceElementProxy[astacktraceelement.length]; i < astacktraceelementproxy.length; i++)
        {
            astacktraceelementproxy[i] = new StackTraceElementProxy(astacktraceelement[i]);
        }

        return astacktraceelementproxy;
    }

    private static void subjoinExceptionMessage(StringBuilder stringbuilder, IThrowableProxy ithrowableproxy)
    {
        stringbuilder.append(ithrowableproxy.getClassName()).append(": ").append(ithrowableproxy.getMessage());
    }

    public static void subjoinFirstLine(StringBuilder stringbuilder, IThrowableProxy ithrowableproxy)
    {
        if (ithrowableproxy.getCommonFrames() > 0)
        {
            stringbuilder.append("Caused by: ");
        }
        subjoinExceptionMessage(stringbuilder, ithrowableproxy);
    }

    public static void subjoinFirstLineRootCauseFirst(StringBuilder stringbuilder, IThrowableProxy ithrowableproxy)
    {
        if (ithrowableproxy.getCause() != null)
        {
            stringbuilder.append("Wrapped by: ");
        }
        subjoinExceptionMessage(stringbuilder, ithrowableproxy);
    }

    public static void subjoinPackagingData(StringBuilder stringbuilder, StackTraceElementProxy stacktraceelementproxy)
    {
        if (stacktraceelementproxy != null)
        {
            stacktraceelementproxy = stacktraceelementproxy.getClassPackagingData();
            if (stacktraceelementproxy != null)
            {
                if (!stacktraceelementproxy.isExact())
                {
                    stringbuilder.append(" ~[");
                } else
                {
                    stringbuilder.append(" [");
                }
                stringbuilder.append(stacktraceelementproxy.getCodeLocation()).append(':').append(stacktraceelementproxy.getVersion()).append(']');
            }
        }
    }
}
