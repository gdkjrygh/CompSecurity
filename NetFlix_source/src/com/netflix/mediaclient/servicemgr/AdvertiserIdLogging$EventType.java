// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.servicemgr;


// Referenced classes of package com.netflix.mediaclient.servicemgr:
//            AdvertiserIdLogging

public static final class  extends Enum
{

    private static final check_in $VALUES[];
    public static final check_in check_in;
    public static final check_in install;
    public static final check_in sign_in;
    public static final check_in sign_up;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/netflix/mediaclient/servicemgr/AdvertiserIdLogging$EventType, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        install = new <init>("install", 0);
        sign_up = new <init>("sign_up", 1);
        sign_in = new <init>("sign_in", 2);
        check_in = new <init>("check_in", 3);
        $VALUES = (new .VALUES[] {
            install, sign_up, sign_in, check_in
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
