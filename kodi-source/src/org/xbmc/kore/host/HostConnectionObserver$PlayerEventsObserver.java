// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.host;


// Referenced classes of package org.xbmc.kore.host:
//            HostConnectionObserver

public static interface e
{

    public abstract void inputOnInputRequested(String s, String s1, String s2);

    public abstract void observerOnStopObserving();

    public abstract void playerNoResultsYet();

    public abstract void playerOnConnectionError(int i, String s);

    public abstract void playerOnPause(org.xbmc.kore.jsonrpc.type. , org.xbmc.kore.jsonrpc.type. 1, org.xbmc.kore.jsonrpc.type. 2);

    public abstract void playerOnPlay(org.xbmc.kore.jsonrpc.type. , org.xbmc.kore.jsonrpc.type. 1, org.xbmc.kore.jsonrpc.type. 2);

    public abstract void playerOnStop();

    public abstract void systemOnQuit();
}
