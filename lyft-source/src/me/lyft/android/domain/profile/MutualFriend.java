// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.domain.profile;

import me.lyft.android.common.Strings;

public class MutualFriend
{

    private final String name;
    private final String photo;

    public MutualFriend(String s, String s1)
    {
        name = Strings.nullToEmpty(s);
        photo = Strings.nullToEmpty(s1);
    }

    public String getName()
    {
        return name;
    }

    public String getPhoto()
    {
        return photo;
    }
}
