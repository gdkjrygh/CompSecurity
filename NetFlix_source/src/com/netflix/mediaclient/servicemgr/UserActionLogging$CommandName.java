// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.servicemgr;


// Referenced classes of package com.netflix.mediaclient.servicemgr:
//            UserActionLogging

public static final class  extends Enum
{

    private static final rating $VALUES[];
    public static final rating rating;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/netflix/mediaclient/servicemgr/UserActionLogging$CommandName, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        rating = new <init>("rating", 0);
        $VALUES = (new .VALUES[] {
            rating
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
