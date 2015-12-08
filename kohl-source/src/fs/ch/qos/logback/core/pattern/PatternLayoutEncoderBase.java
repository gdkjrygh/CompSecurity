// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.ch.qos.logback.core.pattern;

import fs.ch.qos.logback.core.encoder.LayoutWrappingEncoder;

public class PatternLayoutEncoderBase extends LayoutWrappingEncoder
{

    protected boolean outputPatternAsHeader;
    String pattern;

    public PatternLayoutEncoderBase()
    {
        outputPatternAsHeader = false;
    }

    public String getPattern()
    {
        return pattern;
    }

    public void setPattern(String s)
    {
        pattern = s;
    }
}
