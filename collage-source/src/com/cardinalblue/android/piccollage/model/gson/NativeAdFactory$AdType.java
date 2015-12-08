// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.model.gson;


// Referenced classes of package com.cardinalblue.android.piccollage.model.gson:
//            NativeAdFactory

public static final class name extends Enum
{

    private static final ADMOB $VALUES[];
    public static final ADMOB ADMOB;
    public static final ADMOB FB;
    public final String name;

    public static name valueOf(String s)
    {
        return (name)Enum.valueOf(com/cardinalblue/android/piccollage/model/gson/NativeAdFactory$AdType, s);
    }

    public static name[] values()
    {
        return (name[])$VALUES.clone();
    }

    static 
    {
        FB = new <init>("FB", 0, "facebook");
        ADMOB = new <init>("ADMOB", 1, "admob");
        $VALUES = (new .VALUES[] {
            FB, ADMOB
        });
    }

    private (String s, int i, String s1)
    {
        super(s, i);
        name = s1;
    }
}
