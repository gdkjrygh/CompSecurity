// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taobao.wireless.security.sdk.datacollection;

import com.taobao.wireless.security.sdk.IComponent;

public interface IDataCollectionComponent
    extends IComponent
{

    public abstract String getEncryptedDevAndEnvInfo(int i, String s);

    public abstract String getNick();

    public abstract boolean setNick(String s);
}
