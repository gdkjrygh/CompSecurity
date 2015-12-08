// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat.picker;


// Referenced classes of package com.skype.android.app.chat.picker:
//            PickerTab

private static final class  extends Enum
{

    private static final NONE $VALUES[];
    public static final NONE NONE;
    public static final NONE SECTION_FIRST_ITEM;
    public static final NONE SECTION_FIRST_ROW_ITEM;
    public static final NONE SPONSORED_FIRST_ITEM;
    public static final NONE SPONSORED_FIRST_ROW_ITEM;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/skype/android/app/chat/picker/PickerTab$b, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        SPONSORED_FIRST_ITEM = new <init>("SPONSORED_FIRST_ITEM", 0);
        SPONSORED_FIRST_ROW_ITEM = new <init>("SPONSORED_FIRST_ROW_ITEM", 1);
        SECTION_FIRST_ITEM = new <init>("SECTION_FIRST_ITEM", 2);
        SECTION_FIRST_ROW_ITEM = new <init>("SECTION_FIRST_ROW_ITEM", 3);
        NONE = new <init>("NONE", 4);
        $VALUES = (new .VALUES[] {
            SPONSORED_FIRST_ITEM, SPONSORED_FIRST_ROW_ITEM, SECTION_FIRST_ITEM, SECTION_FIRST_ROW_ITEM, NONE
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
