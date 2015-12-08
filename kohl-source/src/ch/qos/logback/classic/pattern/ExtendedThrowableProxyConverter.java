// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.qos.logback.classic.pattern;

import ch.qos.logback.classic.spi.StackTraceElementProxy;
import ch.qos.logback.classic.spi.ThrowableProxyUtil;

// Referenced classes of package ch.qos.logback.classic.pattern:
//            ThrowableProxyConverter

public class ExtendedThrowableProxyConverter extends ThrowableProxyConverter
{

    public ExtendedThrowableProxyConverter()
    {
    }

    protected void extraData(StringBuilder stringbuilder, StackTraceElementProxy stacktraceelementproxy)
    {
        if (stacktraceelementproxy != null)
        {
            ThrowableProxyUtil.subjoinPackagingData(stringbuilder, stacktraceelementproxy);
        }
    }
}
