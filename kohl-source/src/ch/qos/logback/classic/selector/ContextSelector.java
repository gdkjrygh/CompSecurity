// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.qos.logback.classic.selector;

import ch.qos.logback.classic.LoggerContext;

public interface ContextSelector
{

    public abstract LoggerContext getLoggerContext();
}
