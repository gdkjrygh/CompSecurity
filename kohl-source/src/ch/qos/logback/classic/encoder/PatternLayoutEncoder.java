// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.qos.logback.classic.encoder;

import ch.qos.logback.classic.PatternLayout;
import fs.ch.qos.logback.core.pattern.PatternLayoutEncoderBase;

public class PatternLayoutEncoder extends PatternLayoutEncoderBase
{

    public PatternLayoutEncoder()
    {
    }

    public void start()
    {
        PatternLayout patternlayout = new PatternLayout();
        patternlayout.setContext(context);
        patternlayout.setPattern(getPattern());
        patternlayout.setOutputPatternAsHeader(outputPatternAsHeader);
        patternlayout.start();
        layout = patternlayout;
        super.start();
    }
}
