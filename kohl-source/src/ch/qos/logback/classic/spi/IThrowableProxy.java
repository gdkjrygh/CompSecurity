// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.qos.logback.classic.spi;


// Referenced classes of package ch.qos.logback.classic.spi:
//            StackTraceElementProxy

public interface IThrowableProxy
{

    public abstract IThrowableProxy getCause();

    public abstract String getClassName();

    public abstract int getCommonFrames();

    public abstract String getMessage();

    public abstract StackTraceElementProxy[] getStackTraceElementProxyArray();

    public abstract IThrowableProxy[] getSuppressed();
}
