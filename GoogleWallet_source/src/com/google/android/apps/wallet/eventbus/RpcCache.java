// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.eventbus;


public interface RpcCache
{

    public abstract Object readFromCache();

    public abstract Object readFromServer()
        throws Exception;

    public abstract void writeToCache(Object obj);
}
