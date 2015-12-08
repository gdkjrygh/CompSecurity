// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.enums;

import bo.app.aq;
import com.appboy.models.IPutIntoJson;

public final class SocialNetwork extends Enum
    implements IPutIntoJson
{

    public static final SocialNetwork FACEBOOK;
    public static final SocialNetwork GOOGLE;
    public static final SocialNetwork TWITTER;
    private static final SocialNetwork a[];

    private SocialNetwork(String s, int i)
    {
        super(s, i);
    }

    public static SocialNetwork valueOf(String s)
    {
        return (SocialNetwork)Enum.valueOf(com/appboy/enums/SocialNetwork, s);
    }

    public static SocialNetwork[] values()
    {
        return (SocialNetwork[])a.clone();
    }

    public final volatile Object forJsonPut()
    {
        return forJsonPut();
    }

    public final String forJsonPut()
    {
        switch (aq.a[ordinal()])
        {
        default:
            return null;

        case 1: // '\001'
            return "fb";

        case 2: // '\002'
            return "tw";

        case 3: // '\003'
            return "g";
        }
    }

    static 
    {
        FACEBOOK = new SocialNetwork("FACEBOOK", 0);
        TWITTER = new SocialNetwork("TWITTER", 1);
        GOOGLE = new SocialNetwork("GOOGLE", 2);
        a = (new SocialNetwork[] {
            FACEBOOK, TWITTER, GOOGLE
        });
    }
}
