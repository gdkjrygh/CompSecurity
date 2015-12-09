// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.logging.uiaction;

import com.netflix.mediaclient.service.logging.client.BaseLoggingSession;

public abstract class BaseUIActionSession extends BaseLoggingSession
{

    protected static final String CATEGORY = "uiAction";
    protected com.netflix.mediaclient.servicemgr.UserActionLogging.CommandName mAction;
    protected com.netflix.mediaclient.servicemgr.IClientLogging.ModalView mView;

    public BaseUIActionSession(com.netflix.mediaclient.servicemgr.UserActionLogging.CommandName commandname, com.netflix.mediaclient.servicemgr.IClientLogging.ModalView modalview)
    {
        mAction = commandname;
        mView = modalview;
    }

    public com.netflix.mediaclient.servicemgr.UserActionLogging.CommandName getAction()
    {
        return mAction;
    }

    public String getCategory()
    {
        return "uiAction";
    }

    public com.netflix.mediaclient.servicemgr.IClientLogging.ModalView getView()
    {
        return mView;
    }
}
