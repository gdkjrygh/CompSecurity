// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taobao.wireless.security.sdk.staticdatastore;

import com.taobao.wireless.security.sdk.IComponent;

public interface IStaticDataStoreComponent
    extends IComponent
{

    public abstract String getAppKeyByIndex(int i);

    public abstract String getExtraData(String s);

    public abstract int getKeyType(String s);
}
