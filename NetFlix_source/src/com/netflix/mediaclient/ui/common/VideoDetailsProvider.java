// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.common;

import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.servicemgr.VideoDetails;

// Referenced classes of package com.netflix.mediaclient.ui.common:
//            PlayContextProvider

public interface VideoDetailsProvider
    extends PlayContextProvider
{

    public abstract boolean destroyed();

    public abstract ServiceManager getServiceManager();

    public abstract VideoDetails getVideoDetails();

    public abstract String getVideoId();

    public abstract void onActionExecuted();
}
