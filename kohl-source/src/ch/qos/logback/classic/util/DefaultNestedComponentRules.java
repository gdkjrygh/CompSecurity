// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.qos.logback.classic.util;

import ch.qos.logback.classic.PatternLayout;
import ch.qos.logback.classic.encoder.PatternLayoutEncoder;
import fs.ch.qos.logback.core.AppenderBase;
import fs.ch.qos.logback.core.UnsynchronizedAppenderBase;
import fs.ch.qos.logback.core.joran.spi.DefaultNestedComponentRegistry;

public class DefaultNestedComponentRules
{

    public static void addDefaultNestedComponentRegistryRules(DefaultNestedComponentRegistry defaultnestedcomponentregistry)
    {
        defaultnestedcomponentregistry.add(fs/ch/qos/logback/core/AppenderBase, "layout", ch/qos/logback/classic/PatternLayout);
        defaultnestedcomponentregistry.add(fs/ch/qos/logback/core/UnsynchronizedAppenderBase, "layout", ch/qos/logback/classic/PatternLayout);
        defaultnestedcomponentregistry.add(fs/ch/qos/logback/core/AppenderBase, "encoder", ch/qos/logback/classic/encoder/PatternLayoutEncoder);
        defaultnestedcomponentregistry.add(fs/ch/qos/logback/core/UnsynchronizedAppenderBase, "encoder", ch/qos/logback/classic/encoder/PatternLayoutEncoder);
    }
}
