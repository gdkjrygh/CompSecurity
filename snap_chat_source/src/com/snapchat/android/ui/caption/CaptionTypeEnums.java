// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui.caption;


public final class CaptionTypeEnums extends Enum
{

    private static final CaptionTypeEnums $VALUES[];
    public static final CaptionTypeEnums FAT_CAPTION_TYPE;
    public static final CaptionTypeEnums FAT_CENTER_CAPTION_TYPE;
    public static final CaptionTypeEnums NON_FAT_VANILLA_CAPTION_TYPE;

    private CaptionTypeEnums(String s, int i)
    {
        super(s, i);
    }

    public static CaptionTypeEnums valueOf(String s)
    {
        return (CaptionTypeEnums)Enum.valueOf(com/snapchat/android/ui/caption/CaptionTypeEnums, s);
    }

    public static CaptionTypeEnums[] values()
    {
        return (CaptionTypeEnums[])$VALUES.clone();
    }

    static 
    {
        NON_FAT_VANILLA_CAPTION_TYPE = new CaptionTypeEnums("NON_FAT_VANILLA_CAPTION_TYPE", 0);
        FAT_CAPTION_TYPE = new CaptionTypeEnums("FAT_CAPTION_TYPE", 1);
        FAT_CENTER_CAPTION_TYPE = new CaptionTypeEnums("FAT_CENTER_CAPTION_TYPE", 2);
        $VALUES = (new CaptionTypeEnums[] {
            NON_FAT_VANILLA_CAPTION_TYPE, FAT_CAPTION_TYPE, FAT_CENTER_CAPTION_TYPE
        });
    }
}
