// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore.qos;


// Referenced classes of package com.adobe.mediacore.qos:
//            LoadInfo

public static final class  extends Enum
{

    private static final MANIFEST $VALUES[];
    public static final MANIFEST FRAGMENT;
    public static final MANIFEST MANIFEST;
    public static final MANIFEST TRACK;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/adobe/mediacore/qos/LoadInfo$Type, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        FRAGMENT = new <init>("FRAGMENT", 0);
        TRACK = new <init>("TRACK", 1);
        MANIFEST = new <init>("MANIFEST", 2);
        $VALUES = (new .VALUES[] {
            FRAGMENT, TRACK, MANIFEST
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
