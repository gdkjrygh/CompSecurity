// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.webclient.model.leafs;

import java.util.List;

// Referenced classes of package com.netflix.mediaclient.service.webclient.model.leafs:
//            User

public class AccountData
{

    private User user;
    private List userProfiles;

    public AccountData()
    {
    }

    public User getUser()
    {
        return user;
    }

    public List getUserProfiles()
    {
        return userProfiles;
    }

    public void setUser(User user1)
    {
        user = user1;
    }

    public void setUserProfiles(List list)
    {
        userProfiles = list;
    }
}
