// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore;


// Referenced classes of package com.adobe.mediacore:
//            ABRControlParameters

public static final class _value extends Enum
{

    private static final ABR_AGGRESSIVE $VALUES[];
    public static final ABR_AGGRESSIVE ABR_AGGRESSIVE;
    public static final ABR_AGGRESSIVE ABR_CONSERVATIVE;
    public static final ABR_AGGRESSIVE ABR_MODERATE;
    private final int _value;

    public static _value valueOf(String s)
    {
        return (_value)Enum.valueOf(com/adobe/mediacore/ABRControlParameters$ABRPolicy, s);
    }

    public static _value[] values()
    {
        return (_value[])$VALUES.clone();
    }

    public int getValue()
    {
        return _value;
    }

    static 
    {
        ABR_CONSERVATIVE = new <init>("ABR_CONSERVATIVE", 0, 0);
        ABR_MODERATE = new <init>("ABR_MODERATE", 1, 1);
        ABR_AGGRESSIVE = new <init>("ABR_AGGRESSIVE", 2, 2);
        $VALUES = (new .VALUES[] {
            ABR_CONSERVATIVE, ABR_MODERATE, ABR_AGGRESSIVE
        });
    }

    private (String s, int i, int j)
    {
        super(s, i);
        _value = j;
    }
}
