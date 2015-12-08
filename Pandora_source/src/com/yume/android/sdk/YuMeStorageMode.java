// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.yume.android.sdk;


public final class YuMeStorageMode extends Enum
{

    public static final YuMeStorageMode EXTERNAL_STORAGE;
    public static final YuMeStorageMode INTERNAL_STORAGE;
    public static final YuMeStorageMode NONE;
    private static final YuMeStorageMode a[];

    private YuMeStorageMode(String s, int i)
    {
        super(s, i);
    }

    public static YuMeStorageMode valueOf(String s)
    {
        return (YuMeStorageMode)Enum.valueOf(com/yume/android/sdk/YuMeStorageMode, s);
    }

    public static YuMeStorageMode[] values()
    {
        YuMeStorageMode ayumestoragemode[] = a;
        int i = ayumestoragemode.length;
        YuMeStorageMode ayumestoragemode1[] = new YuMeStorageMode[i];
        System.arraycopy(ayumestoragemode, 0, ayumestoragemode1, 0, i);
        return ayumestoragemode1;
    }

    static 
    {
        NONE = new YuMeStorageMode("NONE", 0);
        INTERNAL_STORAGE = new YuMeStorageMode("INTERNAL_STORAGE", 1);
        EXTERNAL_STORAGE = new YuMeStorageMode("EXTERNAL_STORAGE", 2);
        a = (new YuMeStorageMode[] {
            NONE, INTERNAL_STORAGE, EXTERNAL_STORAGE
        });
    }
}
