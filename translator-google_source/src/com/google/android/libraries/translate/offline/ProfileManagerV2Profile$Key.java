// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.offline;


final class  extends Enum
{

    public static final V PKG;
    public static final V V;
    private static final V a[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/libraries/translate/offline/ProfileManagerV2Profile$Key, s);
    }

    public static [] values()
    {
        return ([])a.clone();
    }

    static 
    {
        PKG = new <init>("PKG", 0);
        V = new <init>("V", 1);
        a = (new a[] {
            PKG, V
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
