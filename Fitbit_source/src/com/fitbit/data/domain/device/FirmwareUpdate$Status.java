// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.domain.device;


// Referenced classes of package com.fitbit.data.domain.device:
//            FirmwareUpdate

public static final class _cls9 extends Enum
{

    private static final NO_CHANGE $VALUES[];
    public static final NO_CHANGE LANG;
    public static final NO_CHANGE NO_CHANGE;
    public static final NO_CHANGE OPTIONAL;
    public static final NO_CHANGE REQUIRED;

    public static _cls9 valueOf(String s)
    {
        return (_cls9)Enum.valueOf(com/fitbit/data/domain/device/FirmwareUpdate$Status, s);
    }

    public static _cls9[] values()
    {
        return (_cls9[])$VALUES.clone();
    }

    static 
    {
        REQUIRED = new <init>("REQUIRED", 0);
        OPTIONAL = new <init>("OPTIONAL", 1);
        LANG = new <init>("LANG", 2);
        NO_CHANGE = new <init>("NO_CHANGE", 3);
        $VALUES = (new .VALUES[] {
            REQUIRED, OPTIONAL, LANG, NO_CHANGE
        });
    }

    private _cls9(String s, int i)
    {
        super(s, i);
    }
}
