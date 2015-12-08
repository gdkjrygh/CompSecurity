// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.ch.qos.logback.core;

import fs.ch.qos.logback.core.spi.ContextAware;
import fs.ch.qos.logback.core.spi.LifeCycle;

public interface Layout
    extends ContextAware, LifeCycle
{

    public abstract String doLayout(Object obj);
}
