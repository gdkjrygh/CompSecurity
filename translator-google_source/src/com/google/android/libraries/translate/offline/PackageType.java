// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.offline;


public final class PackageType extends Enum
{

    public static final PackageType TRANSLATE;
    public static final PackageType WORD_LENS;
    private static final PackageType a[];

    private PackageType(String s, int i)
    {
        super(s, i);
    }

    public static PackageType valueOf(String s)
    {
        return (PackageType)Enum.valueOf(com/google/android/libraries/translate/offline/PackageType, s);
    }

    public static PackageType[] values()
    {
        return (PackageType[])a.clone();
    }

    static 
    {
        TRANSLATE = new PackageType("TRANSLATE", 0);
        WORD_LENS = new PackageType("WORD_LENS", 1);
        a = (new PackageType[] {
            TRANSLATE, WORD_LENS
        });
    }
}
