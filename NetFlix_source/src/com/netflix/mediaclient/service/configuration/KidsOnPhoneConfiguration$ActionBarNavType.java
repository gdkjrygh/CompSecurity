// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.configuration;


// Referenced classes of package com.netflix.mediaclient.service.configuration:
//            KidsOnPhoneConfiguration

public static final class  extends Enum
{

    private static final BACK $VALUES[];
    public static final BACK BACK;
    public static final BACK UP;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/netflix/mediaclient/service/configuration/KidsOnPhoneConfiguration$ActionBarNavType, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        UP = new <init>("UP", 0);
        BACK = new <init>("BACK", 1);
        $VALUES = (new .VALUES[] {
            UP, BACK
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
