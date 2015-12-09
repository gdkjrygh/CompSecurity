// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.javabridge.ui;


// Referenced classes of package com.netflix.mediaclient.javabridge.ui:
//            EventListener, LogArguments

public interface Log
{
    public static interface ResetSessionIdCallback
    {

        public abstract void sessionCreated(String s);
    }


    public static final String NAME = "log";
    public static final String PATH = "nrdp.log";
    public static final String logBlobMessageReceived = "logBlobMessageReceived";
    public static final String logBlobReady = "logBlobReady";

    public abstract void addEventListener(String s, EventListener eventlistener);

    public abstract void debug(LogArguments logarguments);

    public abstract void error(LogArguments logarguments);

    public abstract void fatal(LogArguments logarguments);

    public abstract void flush();

    public abstract String getAppId();

    public abstract String getSessionId();

    public abstract String getXid();

    public abstract void info(LogArguments logarguments);

    public abstract void removeEventListener(String s, EventListener eventlistener);

    public abstract void resetSessionID(ResetSessionIdCallback resetsessionidcallback);

    public abstract void trace(LogArguments logarguments);

    public abstract void warn(LogArguments logarguments);
}
