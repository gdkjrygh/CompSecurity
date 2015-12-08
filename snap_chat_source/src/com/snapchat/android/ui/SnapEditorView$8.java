// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui;

import com.snapchat.android.ui.caption.CaptionTypeEnums;

// Referenced classes of package com.snapchat.android.ui:
//            SnapEditorView

public static final class peEnums
{

    public static final int a[];

    static 
    {
        a = new int[CaptionTypeEnums.values().length];
        try
        {
            a[CaptionTypeEnums.NON_FAT_VANILLA_CAPTION_TYPE.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[CaptionTypeEnums.FAT_CAPTION_TYPE.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[CaptionTypeEnums.FAT_CENTER_CAPTION_TYPE.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
