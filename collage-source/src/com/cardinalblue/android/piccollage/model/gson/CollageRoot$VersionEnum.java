// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.model.gson;


// Referenced classes of package com.cardinalblue.android.piccollage.model.gson:
//            CollageRoot

public static final class versionCode extends Enum
{

    private static final V5 $VALUES[];
    public static final V5 A2;
    public static final V5 A3;
    public static final V5 V5;
    private final int versionCode;

    public static versionCode valueOf(String s)
    {
        return (versionCode)Enum.valueOf(com/cardinalblue/android/piccollage/model/gson/CollageRoot$VersionEnum, s);
    }

    public static versionCode[] values()
    {
        return (versionCode[])$VALUES.clone();
    }

    public int getVersionCode()
    {
        return versionCode;
    }

    static 
    {
        A2 = new <init>("A2", 0, 2);
        A3 = new <init>("A3", 1, 3);
        V5 = new <init>("V5", 2, 5);
        $VALUES = (new .VALUES[] {
            A2, A3, V5
        });
    }

    private (String s, int i, int j)
    {
        super(s, i);
        versionCode = j;
    }
}
