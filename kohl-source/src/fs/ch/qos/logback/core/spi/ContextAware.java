// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.ch.qos.logback.core.spi;

import fs.ch.qos.logback.core.Context;

public interface ContextAware
{

    public abstract void addError(String s);

    public abstract void addError(String s, Throwable throwable);

    public abstract void setContext(Context context);
}
