// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.logging.uiview;

import com.netflix.mediaclient.service.logging.client.BaseLoggingSession;

public abstract class BaseUIViewSession extends BaseLoggingSession
{

    protected static final String CATEGORY = "uiView";
    protected com.netflix.mediaclient.servicemgr.UIViewLogging.UIViewCommandName mCommandName;
    protected com.netflix.mediaclient.servicemgr.IClientLogging.ModalView mView;

    public BaseUIViewSession(com.netflix.mediaclient.servicemgr.UIViewLogging.UIViewCommandName uiviewcommandname, com.netflix.mediaclient.servicemgr.IClientLogging.ModalView modalview)
    {
        mCommandName = uiviewcommandname;
        mView = modalview;
    }

    public com.netflix.mediaclient.servicemgr.UIViewLogging.UIViewCommandName getAction()
    {
        return mCommandName;
    }

    public String getCategory()
    {
        return "uiView";
    }

    public com.netflix.mediaclient.servicemgr.IClientLogging.ModalView getView()
    {
        return mView;
    }
}
