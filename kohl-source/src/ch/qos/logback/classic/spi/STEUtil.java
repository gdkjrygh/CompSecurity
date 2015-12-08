// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.qos.logback.classic.spi;


// Referenced classes of package ch.qos.logback.classic.spi:
//            StackTraceElementProxy

public class STEUtil
{

    static int findNumberOfCommonFrames(StackTraceElement astacktraceelement[], StackTraceElementProxy astacktraceelementproxy[])
    {
        int i;
        int l;
        i = 0;
        l = 0;
        if (astacktraceelementproxy != null) goto _L2; else goto _L1
_L1:
        return l;
_L2:
        int j;
        int k;
        k = astacktraceelement.length - 1;
        j = astacktraceelementproxy.length - 1;
_L6:
        l = i;
        if (k < 0) goto _L1; else goto _L3
_L3:
        l = i;
        if (j < 0) goto _L1; else goto _L4
_L4:
        l = i;
        if (!astacktraceelement[k].equals(astacktraceelementproxy[j].ste)) goto _L1; else goto _L5
_L5:
        i++;
        k--;
        j--;
          goto _L6
    }
}
