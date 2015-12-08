// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.servicemgr;


// Referenced classes of package com.netflix.mediaclient.servicemgr:
//            AdvertiserIdLogging

public static final class  extends Enum
{

    private static final OPT_OUT $VALUES[];
    public static final OPT_OUT OPT_IN;
    public static final OPT_OUT OPT_OUT;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/netflix/mediaclient/servicemgr/AdvertiserIdLogging$AdverisingATrackingPreference, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        OPT_IN = new <init>("OPT_IN", 0);
        OPT_OUT = new <init>("OPT_OUT", 1);
        $VALUES = (new .VALUES[] {
            OPT_IN, OPT_OUT
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
