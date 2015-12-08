// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.ch.qos.logback.core.pattern;

import fs.ch.qos.logback.core.Context;
import fs.ch.qos.logback.core.spi.ContextAware;

// Referenced classes of package fs.ch.qos.logback.core.pattern:
//            Converter, CompositeConverter, DynamicConverter

public class ConverterUtil
{

    public static Converter findTail(Converter converter)
    {
        do
        {
            Converter converter1;
label0:
            {
                if (converter != null)
                {
                    converter1 = converter.getNext();
                    if (converter1 != null)
                    {
                        break label0;
                    }
                }
                return converter;
            }
            converter = converter1;
        } while (true);
    }

    public static void setContextForConverters(Context context, Converter converter)
    {
        for (; converter != null; converter = converter.getNext())
        {
            if (converter instanceof ContextAware)
            {
                ((ContextAware)converter).setContext(context);
            }
        }

    }

    public static void startConverters(Converter converter)
    {
        while (converter != null) 
        {
            if (converter instanceof CompositeConverter)
            {
                CompositeConverter compositeconverter = (CompositeConverter)converter;
                startConverters(compositeconverter.childConverter);
                compositeconverter.start();
            } else
            if (converter instanceof DynamicConverter)
            {
                ((DynamicConverter)converter).start();
            }
            converter = converter.getNext();
        }
    }
}
