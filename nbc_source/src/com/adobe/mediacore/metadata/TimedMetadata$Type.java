// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore.metadata;


// Referenced classes of package com.adobe.mediacore.metadata:
//            TimedMetadata

public static final class  extends Enum
{

    private static final ID3 $VALUES[];
    public static final ID3 ID3;
    public static final ID3 TAG;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/adobe/mediacore/metadata/TimedMetadata$Type, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        TAG = new <init>("TAG", 0);
        ID3 = new <init>("ID3", 1);
        $VALUES = (new .VALUES[] {
            TAG, ID3
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
