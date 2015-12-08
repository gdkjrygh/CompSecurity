// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.qos.logback.classic.pattern;

import fs.ch.qos.logback.core.pattern.Converter;
import fs.ch.qos.logback.core.pattern.ConverterUtil;
import fs.ch.qos.logback.core.pattern.PostCompileProcessor;

// Referenced classes of package ch.qos.logback.classic.pattern:
//            ThrowableHandlingConverter, ExtendedThrowableProxyConverter

public class EnsureExceptionHandling
    implements PostCompileProcessor
{

    public EnsureExceptionHandling()
    {
    }

    public boolean chainHandlesThrowable(Converter converter)
    {
        for (; converter != null; converter = converter.getNext())
        {
            if (converter instanceof ThrowableHandlingConverter)
            {
                return true;
            }
        }

        return false;
    }

    public void process(Converter converter)
    {
        if (converter == null)
        {
            throw new IllegalArgumentException("cannot process empty chain");
        }
        if (!chainHandlesThrowable(converter))
        {
            ConverterUtil.findTail(converter).setNext(new ExtendedThrowableProxyConverter());
        }
    }
}
