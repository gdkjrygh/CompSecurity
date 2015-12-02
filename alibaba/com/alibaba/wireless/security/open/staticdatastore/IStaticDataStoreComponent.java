// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.alibaba.wireless.security.open.staticdatastore;

import com.alibaba.wireless.security.open.IComponent;
import com.alibaba.wireless.security.open.SecException;

public interface IStaticDataStoreComponent
    extends IComponent
{

    public abstract String getAppKeyByIndex(int i, String s)
        throws SecException;

    public abstract String getExtraData(String s, String s1)
        throws SecException;

    public abstract int getKeyType(String s, String s1)
        throws SecException;
}
