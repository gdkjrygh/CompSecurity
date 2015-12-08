// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.qos.logback.classic.spi;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.LoggerContext;

public interface LoggerContextListener
{

    public abstract boolean isResetResistant();

    public abstract void onLevelChange(Logger logger, Level level);

    public abstract void onReset(LoggerContext loggercontext);

    public abstract void onStart(LoggerContext loggercontext);

    public abstract void onStop(LoggerContext loggercontext);
}
