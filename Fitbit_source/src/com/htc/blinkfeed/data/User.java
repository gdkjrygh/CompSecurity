// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.htc.blinkfeed.data;


// Referenced classes of package com.htc.blinkfeed.data:
//            Storable

public class User extends Storable
{

    String id;
    String name;
    String profile_pic;

    public User()
    {
    }

    public void setId(String s)
    {
        id = s;
    }

    public void setName(String s)
    {
        name = s;
    }

    public void setProfilePic(String s)
    {
        profile_pic = s;
    }
}
