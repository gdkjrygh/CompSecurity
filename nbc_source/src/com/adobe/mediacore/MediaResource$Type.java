// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore;


// Referenced classes of package com.adobe.mediacore:
//            MediaResource

public static final class _value extends Enum
{

    private static final HDS $VALUES[];
    public static final HDS DASH;
    public static final HDS HDS;
    public static final HDS HLS;
    private final String _value;

    public static _value valueOf(String s)
    {
        return (_value)Enum.valueOf(com/adobe/mediacore/MediaResource$Type, s);
    }

    public static _value[] values()
    {
        return (_value[])$VALUES.clone();
    }

    public String getValue()
    {
        return _value;
    }

    static 
    {
        HLS = new <init>("HLS", 0, "m3u8");
        DASH = new <init>("DASH", 1, "mpd");
        HDS = new <init>("HDS", 2, "f4m");
        $VALUES = (new .VALUES[] {
            HLS, DASH, HDS
        });
    }

    private (String s, int i, String s1)
    {
        super(s, i);
        _value = s1;
    }
}
