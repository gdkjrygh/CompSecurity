// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.offline;


final class  extends Enum
{

    public static final HS HS;
    public static final HS RV;
    public static final HS SZ;
    private static final HS a[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/libraries/translate/offline/ProfileManagerV2PkgProfile$Key, s);
    }

    public static [] values()
    {
        return ([])a.clone();
    }

    static 
    {
        SZ = new <init>("SZ", 0);
        RV = new <init>("RV", 1);
        HS = new <init>("HS", 2);
        a = (new a[] {
            SZ, RV, HS
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
