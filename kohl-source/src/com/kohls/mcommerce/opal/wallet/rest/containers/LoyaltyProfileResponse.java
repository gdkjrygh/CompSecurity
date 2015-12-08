// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.wallet.rest.containers;

import java.io.Serializable;

// Referenced classes of package com.kohls.mcommerce.opal.wallet.rest.containers:
//            WalletBaseResponse, ProfileData

public class LoyaltyProfileResponse extends WalletBaseResponse
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    private boolean isDataAlreadyLoaded;
    private ProfileData profile;

    public LoyaltyProfileResponse()
    {
    }

    public ProfileData getProfile()
    {
        return profile;
    }

    public boolean isDataAlreadyLoaded()
    {
        return isDataAlreadyLoaded;
    }

    public void setDataAlreadyLoaded(boolean flag)
    {
        isDataAlreadyLoaded = flag;
    }

    public void setProfile(ProfileData profiledata)
    {
        profile = profiledata;
    }
}
