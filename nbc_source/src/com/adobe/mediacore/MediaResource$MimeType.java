// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore;


// Referenced classes of package com.adobe.mediacore:
//            MediaResource

public static final class _value extends Enum
{

    private static final HLS_MIME_TYPE $VALUES[];
    public static final HLS_MIME_TYPE HLS_MIME_TYPE;
    private final String _value;

    public static _value valueOf(String s)
    {
        return (_value)Enum.valueOf(com/adobe/mediacore/MediaResource$MimeType, s);
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
        HLS_MIME_TYPE = new <init>("HLS_MIME_TYPE", 0, "application/x-mpegurl");
        $VALUES = (new .VALUES[] {
            HLS_MIME_TYPE
        });
    }

    private (String s, int i, String s1)
    {
        super(s, i);
        _value = s1;
    }
}
