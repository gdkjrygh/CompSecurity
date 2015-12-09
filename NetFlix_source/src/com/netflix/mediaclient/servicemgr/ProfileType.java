// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.servicemgr;


public final class ProfileType extends Enum
{

    private static final ProfileType $VALUES[];
    public static final ProfileType JFK;
    public static final ProfileType STANDARD;
    private String value;

    private ProfileType(String s, int i, String s1)
    {
        super(s, i);
        value = s1;
    }

    public static ProfileType create(String s)
    {
        ProfileType aprofiletype[] = values();
        int j = aprofiletype.length;
        for (int i = 0; i < j; i++)
        {
            ProfileType profiletype = aprofiletype[i];
            if (profiletype.value.equalsIgnoreCase(s))
            {
                return profiletype;
            }
        }

        throw new IllegalStateException("Unknown profile type");
    }

    public static ProfileType valueOf(String s)
    {
        return (ProfileType)Enum.valueOf(com/netflix/mediaclient/servicemgr/ProfileType, s);
    }

    public static ProfileType[] values()
    {
        return (ProfileType[])$VALUES.clone();
    }

    public String toString()
    {
        return value;
    }

    static 
    {
        STANDARD = new ProfileType("STANDARD", 0, "standard");
        JFK = new ProfileType("JFK", 1, "jfk");
        $VALUES = (new ProfileType[] {
            STANDARD, JFK
        });
    }
}
