// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.offline;


final class  extends Enum
{

    public static final LV LV;
    public static final LV PROF;
    public static final LV PROFWL;
    private static final LV a[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/libraries/translate/offline/LocationProfile$Key, s);
    }

    public static [] values()
    {
        return ([])a.clone();
    }

    static 
    {
        PROF = new <init>("PROF", 0);
        PROFWL = new <init>("PROFWL", 1);
        LV = new <init>("LV", 2);
        a = (new a[] {
            PROF, PROFWL, LV
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
