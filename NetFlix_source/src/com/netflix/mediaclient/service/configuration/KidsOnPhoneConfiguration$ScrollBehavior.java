// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.configuration;


// Referenced classes of package com.netflix.mediaclient.service.configuration:
//            KidsOnPhoneConfiguration

public static final class  extends Enum
{

    private static final LRUD $VALUES[];
    public static final LRUD LRUD;
    public static final LRUD UP_DOWN;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/netflix/mediaclient/service/configuration/KidsOnPhoneConfiguration$ScrollBehavior, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        UP_DOWN = new <init>("UP_DOWN", 0);
        LRUD = new <init>("LRUD", 1);
        $VALUES = (new .VALUES[] {
            UP_DOWN, LRUD
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
