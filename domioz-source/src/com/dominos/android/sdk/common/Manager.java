// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.common;

import com.dominos.android.sdk.app.Session;

public abstract class Manager
{

    private Session mSession;

    public Manager()
    {
    }

    public abstract String getName();

    public Session getSession()
    {
        return mSession;
    }

    protected abstract void onSessionSet();

    public void setSession(Session session)
    {
        mSession = session;
        onSessionSet();
    }
}
