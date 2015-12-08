// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.offline;


final class  extends Enum
{

    public static final RRV RRURL;
    public static final RRV RRV;
    private static final RRV a[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/libraries/translate/offline/TranslateLocationProfileProf$Key, s);
    }

    public static [] values()
    {
        return ([])a.clone();
    }

    static 
    {
        RRURL = new <init>("RRURL", 0);
        RRV = new <init>("RRV", 1);
        a = (new a[] {
            RRURL, RRV
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
