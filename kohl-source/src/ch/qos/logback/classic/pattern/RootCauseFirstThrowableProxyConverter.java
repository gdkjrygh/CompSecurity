// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.qos.logback.classic.pattern;

import ch.qos.logback.classic.spi.IThrowableProxy;
import ch.qos.logback.classic.spi.StackTraceElementProxy;
import ch.qos.logback.classic.spi.ThrowableProxyUtil;
import fs.ch.qos.logback.core.CoreConstants;

// Referenced classes of package ch.qos.logback.classic.pattern:
//            ExtendedThrowableProxyConverter

public class RootCauseFirstThrowableProxyConverter extends ExtendedThrowableProxyConverter
{

    public RootCauseFirstThrowableProxyConverter()
    {
    }

    private void subjoinRootCause(IThrowableProxy ithrowableproxy, StringBuilder stringbuilder)
    {
        boolean flag1 = false;
        ThrowableProxyUtil.subjoinFirstLineRootCauseFirst(stringbuilder, ithrowableproxy);
        stringbuilder.append(CoreConstants.LINE_SEPARATOR);
        StackTraceElementProxy astacktraceelementproxy[] = ithrowableproxy.getStackTraceElementProxyArray();
        int l = ithrowableproxy.getCommonFrames();
        int i;
        boolean flag;
        int j;
        int k;
        if (lengthOption > astacktraceelementproxy.length)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            i = astacktraceelementproxy.length;
        } else
        {
            i = lengthOption;
        }
        j = i;
        k = ((flag1) ? 1 : 0);
        if (l > 0)
        {
            j = i;
            k = ((flag1) ? 1 : 0);
            if (flag)
            {
                j = i - l;
                k = ((flag1) ? 1 : 0);
            }
        }
        for (; k < j; k++)
        {
            ithrowableproxy = astacktraceelementproxy[k].toString();
            stringbuilder.append('\t');
            stringbuilder.append(ithrowableproxy);
            extraData(stringbuilder, astacktraceelementproxy[k]);
            stringbuilder.append(CoreConstants.LINE_SEPARATOR);
        }

    }

    private void subjoinRootCauseFirst(IThrowableProxy ithrowableproxy, StringBuilder stringbuilder)
    {
        if (ithrowableproxy.getCause() != null)
        {
            subjoinRootCauseFirst(ithrowableproxy.getCause(), stringbuilder);
        }
        subjoinRootCause(ithrowableproxy, stringbuilder);
    }

    protected String throwableProxyToString(IThrowableProxy ithrowableproxy)
    {
        StringBuilder stringbuilder = new StringBuilder(2048);
        subjoinRootCauseFirst(ithrowableproxy, stringbuilder);
        return stringbuilder.toString();
    }
}
