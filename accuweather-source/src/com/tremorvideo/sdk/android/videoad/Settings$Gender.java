// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;


// Referenced classes of package com.tremorvideo.sdk.android.videoad:
//            Settings

public static final class a extends Enum
{

    private static final Felmale $VALUES[];
    public static final Felmale Felmale;
    public static final Felmale Male;
    public static final Felmale Unknown;
    private String a;

    public static a valueOf(String s)
    {
        return (a)Enum.valueOf(com/tremorvideo/sdk/android/videoad/Settings$Gender, s);
    }

    public static a[] values()
    {
        return (a[])$VALUES.clone();
    }

    public String toString()
    {
        return a;
    }

    static 
    {
        Unknown = new <init>("Unknown", 0, "unknown");
        Male = new <init>("Male", 1, "m");
        Felmale = new <init>("Felmale", 2, "f");
        $VALUES = (new .VALUES[] {
            Unknown, Male, Felmale
        });
    }

    private _cls9(String s, int i, String s1)
    {
        super(s, i);
        a = s1;
    }
}
