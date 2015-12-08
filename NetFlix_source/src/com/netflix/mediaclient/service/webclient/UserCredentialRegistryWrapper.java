// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.webclient;


// Referenced classes of package com.netflix.mediaclient.service.webclient:
//            UserCredentialRegistry

public class UserCredentialRegistryWrapper
    implements UserCredentialRegistry
{

    private String mNetflixId;
    private String mSecureNetflixId;
    private UserCredentialRegistry mUserCredentialRegistry;

    public UserCredentialRegistryWrapper(UserCredentialRegistry usercredentialregistry)
    {
        mUserCredentialRegistry = usercredentialregistry;
        if (usercredentialregistry != null)
        {
            mNetflixId = usercredentialregistry.getNetflixID();
            mSecureNetflixId = usercredentialregistry.getSecureNetflixID();
        }
    }

    public String getNetflixID()
    {
        return mNetflixId;
    }

    public String getNetflixIdName()
    {
        return mUserCredentialRegistry.getNetflixIdName();
    }

    public String getSecureNetflixID()
    {
        return mSecureNetflixId;
    }

    public String getSecureNetflixIdName()
    {
        return mUserCredentialRegistry.getSecureNetflixIdName();
    }

    public boolean updateUserCredentials(String s, String s1)
    {
        return mUserCredentialRegistry.updateUserCredentials(s, s1);
    }
}
