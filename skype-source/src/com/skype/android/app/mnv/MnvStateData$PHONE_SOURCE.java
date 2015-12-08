// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.mnv;


// Referenced classes of package com.skype.android.app.mnv:
//            MnvStateData

public static final class _cls9 extends Enum
{

    private static final DEVICE $VALUES[];
    public static final DEVICE DEVICE;
    public static final DEVICE MSA;
    public static final DEVICE SKYPE;
    public static final DEVICE UNSET;

    public static _cls9 valueOf(String s)
    {
        return (_cls9)Enum.valueOf(com/skype/android/app/mnv/MnvStateData$PHONE_SOURCE, s);
    }

    public static _cls9[] values()
    {
        return (_cls9[])$VALUES.clone();
    }

    static 
    {
        UNSET = new <init>("UNSET", 0);
        MSA = new <init>("MSA", 1);
        SKYPE = new <init>("SKYPE", 2);
        DEVICE = new <init>("DEVICE", 3);
        $VALUES = (new .VALUES[] {
            UNSET, MSA, SKYPE, DEVICE
        });
    }

    private _cls9(String s, int i)
    {
        super(s, i);
    }
}
