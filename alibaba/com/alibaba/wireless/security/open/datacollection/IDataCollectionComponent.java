// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.alibaba.wireless.security.open.datacollection;

import com.alibaba.wireless.security.open.IComponent;

public interface IDataCollectionComponent
    extends IComponent
{

    public abstract String getNick();

    public abstract boolean setNick(String s);
}
