// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.slf4j.impl;

import ch.qos.logback.classic.util.LogbackMDCAdapter;
import fs.org.slf4j.spi.MDCAdapter;

public class StaticMDCBinder
{

    public static final StaticMDCBinder SINGLETON = new StaticMDCBinder();

    private StaticMDCBinder()
    {
    }

    public MDCAdapter getMDCA()
    {
        return new LogbackMDCAdapter();
    }

}
