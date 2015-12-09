// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.logging.apm.model;


// Referenced classes of package com.netflix.mediaclient.service.logging.apm.model:
//            Display

public static final class  extends Enum
{

    private static final interlaced $VALUES[];
    public static final interlaced interlaced;
    public static final interlaced progressive;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/netflix/mediaclient/service/logging/apm/model/Display$ScanMode, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        progressive = new <init>("progressive", 0);
        interlaced = new <init>("interlaced", 1);
        $VALUES = (new .VALUES[] {
            progressive, interlaced
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
