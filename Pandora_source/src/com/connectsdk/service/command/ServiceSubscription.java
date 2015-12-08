// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.connectsdk.service.command;

import java.util.List;

public interface ServiceSubscription
{

    public abstract Object addListener(Object obj);

    public abstract List getListeners();

    public abstract void removeListener(Object obj);

    public abstract void unsubscribe();
}
