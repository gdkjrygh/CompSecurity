// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;


// Referenced classes of package com.tremorvideo.sdk.android.videoad:
//            Settings

public static final class a extends Enum
{

    private static final Other $VALUES[];
    public static final Other AlaskaNative;
    public static final Other AmericanIndian;
    public static final Other Asian;
    public static final Other Black;
    public static final Other Hispanic;
    public static final Other NativeHawaiian;
    public static final Other Other;
    public static final Other PacificIslander;
    public static final Other Unknown;
    public static final Other White;
    private String a;

    public static a valueOf(String s)
    {
        return (a)Enum.valueOf(com/tremorvideo/sdk/android/videoad/Settings$Race, s);
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
        Asian = new <init>("Asian", 1, "asian");
        White = new <init>("White", 2, "white");
        Black = new <init>("Black", 3, "black");
        Hispanic = new <init>("Hispanic", 4, "hispanic");
        AmericanIndian = new <init>("AmericanIndian", 5, "american indian");
        AlaskaNative = new <init>("AlaskaNative", 6, "alaska native");
        NativeHawaiian = new <init>("NativeHawaiian", 7, "native hawaiian");
        PacificIslander = new <init>("PacificIslander", 8, "pacific islander");
        Other = new <init>("Other", 9, "other");
        $VALUES = (new .VALUES[] {
            Unknown, Asian, White, Black, Hispanic, AmericanIndian, AlaskaNative, NativeHawaiian, PacificIslander, Other
        });
    }

    private (String s, int i, String s1)
    {
        super(s, i);
        a = s1;
    }
}
