// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import java.util.concurrent.Callable;

// Referenced classes of package com.facebook:
//            AccessTokenManager, ProfileManager, AccessToken, Profile

final class 
    implements Callable
{

    public final volatile Object call()
    {
        return call();
    }

    public final Void call()
    {
        AccessTokenManager.getInstance().loadCurrentAccessToken();
        ProfileManager.getInstance().loadCurrentProfile();
        if (AccessToken.getCurrentAccessToken() != null && Profile.getCurrentProfile() == null)
        {
            Profile.fetchProfileForCurrentAccessToken();
        }
        return null;
    }

    ()
    {
    }
}
