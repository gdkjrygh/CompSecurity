// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.javabridge;

import com.netflix.mediaclient.error.CrashListener;
import com.netflix.mediaclient.error.CrashReport;
import com.netflix.mediaclient.javabridge.invoke.Invoke;

// Referenced classes of package com.netflix.mediaclient.javabridge:
//            NrdpObject

public interface NrdProxy
{

    public abstract void connect();

    public abstract void destroy();

    public abstract void disconnect();

    public abstract NrdpObject findObjectCache(String s);

    public abstract void init(String s);

    public abstract void invokeMethod(Invoke invoke);

    public abstract void invokeMethod(String s, String s1, String s2);

    public abstract void postCrashReport(CrashReport crashreport);

    public abstract void processUpdate(String s);

    public abstract void removeCrashListener();

    public abstract void setCrashListener(CrashListener crashlistener);

    public abstract void setProperty(String s, String s1, String s2);
}
