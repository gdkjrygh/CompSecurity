// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.ch.qos.logback.core.joran.spi;

import fs.ch.qos.logback.core.spi.ContextAwareImpl;
import org.xml.sax.Locator;

// Referenced classes of package fs.ch.qos.logback.core.joran.spi:
//            Interpreter

class CAI_WithLocatorSupport extends ContextAwareImpl
{

    CAI_WithLocatorSupport(Interpreter interpreter)
    {
        super(interpreter);
    }

    protected Object getOrigin()
    {
        Locator locator = ((Interpreter)super.getOrigin()).locator;
        if (locator != null)
        {
            return (new StringBuilder()).append(fs/ch/qos/logback/core/joran/spi/Interpreter.getName()).append("@").append(locator.getLineNumber()).append(":").append(locator.getColumnNumber()).toString();
        } else
        {
            return (new StringBuilder()).append(fs/ch/qos/logback/core/joran/spi/Interpreter.getName()).append("@NA:NA").toString();
        }
    }
}
