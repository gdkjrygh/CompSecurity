// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.htc.blinkfeed.service;

import android.accounts.Account;
import android.os.Bundle;
import com.htc.lib2.opensense.social.AbstractSocialPlugin;
import com.htc.lib2.opensense.social.SocialPluginResponse;

// Referenced classes of package com.htc.blinkfeed.service:
//            BlinkFeedPluginService

private class <init> extends AbstractSocialPlugin
{

    private ncSyncTypes mStubImpl;
    final BlinkFeedPluginService this$0;

    public Bundle getDataSources(SocialPluginResponse socialpluginresponse, String as[])
    {
        return mStubImpl.tDataSources(as);
    }

    public Bundle getSyncTypes(SocialPluginResponse socialpluginresponse, Account aaccount[], Bundle bundle)
    {
        return mStubImpl.tSyncTypes(aaccount, bundle);
    }

    protected boolean isCallerValid(int i)
    {
        return BlinkFeedPluginService.access$0(BlinkFeedPluginService.this, getBaseContext(), i);
    }

    public Bundle publishActivityStream(SocialPluginResponse socialpluginresponse, Account aaccount[], Bundle bundle)
    {
        return mStubImpl.blishActivityStream(aaccount, bundle);
    }

    public Bundle syncActivityStreams(SocialPluginResponse socialpluginresponse, Account aaccount[], Bundle bundle)
    {
        return mStubImpl.ncActivityStreams(aaccount, bundle);
    }

    public Bundle syncSyncTypes(SocialPluginResponse socialpluginresponse, Account aaccount[], Bundle bundle)
    {
        return mStubImpl.ncSyncTypes(aaccount, bundle);
    }

    private A()
    {
        this$0 = BlinkFeedPluginService.this;
        super();
        mStubImpl = new nit>(BlinkFeedPluginService.this, null);
    }

    nit>(nit> nit>)
    {
        this();
    }
}
