// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.wordlens;


// Referenced classes of package com.google.android.libraries.wordlens:
//            e

public final class QVTextAlignment extends Enum
{

    private static final QVTextAlignment a[];
    public static final QVTextAlignment kMaxQVTextAlignment;
    public static final QVTextAlignment kQVTextAlignment_Center;
    public static final QVTextAlignment kQVTextAlignment_Default;
    public static final QVTextAlignment kQVTextAlignment_Justified;
    public static final QVTextAlignment kQVTextAlignment_Left;
    public static final QVTextAlignment kQVTextAlignment_Right;

    private QVTextAlignment(String s, int i)
    {
        super(s, i);
    }

    public static QVTextAlignment fromNativeEnumValue(int i)
    {
        QVTextAlignment aqvtextalignment[] = values();
        if (aqvtextalignment != null && i < aqvtextalignment.length)
        {
            return aqvtextalignment[i];
        } else
        {
            (new StringBuilder(47)).append("Unknown value of native enum value: ").append(i);
            return null;
        }
    }

    public static int getGravityFromNativeEnumValue(int i)
    {
        QVTextAlignment qvtextalignment = fromNativeEnumValue(i);
        switch (e.a[qvtextalignment.ordinal()])
        {
        default:
            return 17;

        case 1: // '\001'
            return 19;

        case 2: // '\002'
            return 21;

        case 3: // '\003'
            return 23;
        }
    }

    public static QVTextAlignment valueOf(String s)
    {
        return (QVTextAlignment)Enum.valueOf(com/google/android/libraries/wordlens/QVTextAlignment, s);
    }

    public static QVTextAlignment[] values()
    {
        return (QVTextAlignment[])a.clone();
    }

    static 
    {
        kQVTextAlignment_Default = new QVTextAlignment("kQVTextAlignment_Default", 0);
        kQVTextAlignment_Left = new QVTextAlignment("kQVTextAlignment_Left", 1);
        kQVTextAlignment_Center = new QVTextAlignment("kQVTextAlignment_Center", 2);
        kQVTextAlignment_Right = new QVTextAlignment("kQVTextAlignment_Right", 3);
        kQVTextAlignment_Justified = new QVTextAlignment("kQVTextAlignment_Justified", 4);
        kMaxQVTextAlignment = new QVTextAlignment("kMaxQVTextAlignment", 5);
        a = (new QVTextAlignment[] {
            kQVTextAlignment_Default, kQVTextAlignment_Left, kQVTextAlignment_Center, kQVTextAlignment_Right, kQVTextAlignment_Justified, kMaxQVTextAlignment
        });
    }
}
