// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.login;


public final class DefaultAudience extends Enum
{

    private static final DefaultAudience $VALUES[];
    public static final DefaultAudience EVERYONE;
    public static final DefaultAudience FRIENDS;
    public static final DefaultAudience NONE;
    public static final DefaultAudience ONLY_ME;
    private final String nativeProtocolAudience;

    private DefaultAudience(String s, int i, String s1)
    {
        super(s, i);
        nativeProtocolAudience = s1;
    }

    public static DefaultAudience valueOf(String s)
    {
        return (DefaultAudience)Enum.valueOf(com/facebook/login/DefaultAudience, s);
    }

    public static DefaultAudience[] values()
    {
        return (DefaultAudience[])$VALUES.clone();
    }

    public String getNativeProtocolAudience()
    {
        return nativeProtocolAudience;
    }

    static 
    {
        NONE = new DefaultAudience("NONE", 0, null);
        ONLY_ME = new DefaultAudience("ONLY_ME", 1, "only_me");
        FRIENDS = new DefaultAudience("FRIENDS", 2, "friends");
        EVERYONE = new DefaultAudience("EVERYONE", 3, "everyone");
        $VALUES = (new DefaultAudience[] {
            NONE, ONLY_ME, FRIENDS, EVERYONE
        });
    }
}
