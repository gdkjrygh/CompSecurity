// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import java.util.concurrent.Callable;

// Referenced classes of package com.facebook:
//            FacebookSdk, AccessTokenManager, ProfileManager, AccessToken, 
//            Profile

static final class val.callback
    implements Callable
{

    final itializeCallback val$callback;

    public volatile Object call()
        throws Exception
    {
        return call();
    }

    public Void call()
        throws Exception
    {
        AccessTokenManager.getInstance().loadCurrentAccessToken();
        ProfileManager.getInstance().loadCurrentProfile();
        if (AccessToken.getCurrentAccessToken() != null && Profile.getCurrentProfile() == null)
        {
            Profile.fetchProfileForCurrentAccessToken();
        }
        if (val$callback != null)
        {
            val$callback.onInitialized();
        }
        return null;
    }

    itializeCallback(itializeCallback itializecallback)
    {
        val$callback = itializecallback;
        super();
    }
}
