// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.widget;


public final class  extends Enum
{

    public static final TARGET_LANGUAGE DEFAULT;
    public static final TARGET_LANGUAGE SOURCE_LANGUAGE;
    public static final TARGET_LANGUAGE TARGET_LANGUAGE;
    private static final TARGET_LANGUAGE a[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/apps/translate/widget/VoiceLangButton$State, s);
    }

    public static [] values()
    {
        return ([])a.clone();
    }

    static 
    {
        DEFAULT = new <init>("DEFAULT", 0);
        SOURCE_LANGUAGE = new <init>("SOURCE_LANGUAGE", 1);
        TARGET_LANGUAGE = new <init>("TARGET_LANGUAGE", 2);
        a = (new a[] {
            DEFAULT, SOURCE_LANGUAGE, TARGET_LANGUAGE
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
