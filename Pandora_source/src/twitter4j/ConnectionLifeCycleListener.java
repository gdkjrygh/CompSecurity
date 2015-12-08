// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j;


public interface ConnectionLifeCycleListener
{

    public abstract void onCleanUp();

    public abstract void onConnect();

    public abstract void onDisconnect();
}
