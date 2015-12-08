// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.wlclient;

import com.worklight.wlclient.api.WLAuthorizationException;

public interface WLClientInstanceIdListener
{

    public abstract void onFailure(WLAuthorizationException wlauthorizationexception);

    public abstract void onSuccess(String s);
}
