// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.configuration;


// Referenced classes of package com.netflix.mediaclient.service.configuration:
//            KidsOnPhoneConfiguration

public static final class value extends Enum
{

    private static final ONE_TO_ONE $VALUES[];
    public static final ONE_TO_ONE HORIZONTAL;
    public static final ONE_TO_ONE ONE_TO_ONE;
    private String value;

    public static value valueOf(String s)
    {
        return (value)Enum.valueOf(com/netflix/mediaclient/service/configuration/KidsOnPhoneConfiguration$LolomoImageType, s);
    }

    public static value[] values()
    {
        return (value[])$VALUES.clone();
    }

    public String toString()
    {
        return value;
    }

    static 
    {
        HORIZONTAL = new <init>("HORIZONTAL", 0, "horizontal");
        ONE_TO_ONE = new <init>("ONE_TO_ONE", 1, "one2one");
        $VALUES = (new .VALUES[] {
            HORIZONTAL, ONE_TO_ONE
        });
    }

    private (String s, int i, String s1)
    {
        super(s, i);
        value = s1;
    }
}
