// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.model;


// Referenced classes of package com.pinterest.api.model:
//            User

public class _user
{

    private User _user;

    public User getUser()
    {
        return _user;
    }

    public void setUser(User user)
    {
        _user = user;
    }

    public (User user)
    {
        if (user == null)
        {
            user = new User();
        }
        _user = user;
    }
}
