// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.ch.qos.logback.core.pattern.color;


// Referenced classes of package fs.ch.qos.logback.core.pattern.color:
//            ForegroundCompositeConverterBase

public class BoldGreenCompositeConverter extends ForegroundCompositeConverterBase
{

    public BoldGreenCompositeConverter()
    {
    }

    protected String getForegroundColorCode(Object obj)
    {
        return "1;32";
    }
}
