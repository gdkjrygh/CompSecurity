// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.auditude.ads.network;

import com.auditude.ads.model.Ad;
import com.auditude.ads.util.event.IEventDispatcher;
import java.util.HashMap;

public interface INetworkAdLoader
    extends IEventDispatcher
{

    public abstract void cancel();

    public abstract Ad getAd();

    public abstract Object getResult();

    public abstract Object getSource();

    public abstract void load();

    public abstract void setAd(Ad ad);

    public abstract void setCustomParams(HashMap hashmap);

    public abstract void setSource(Object obj);
}
