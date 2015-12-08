// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat.picker.Search;


// Referenced classes of package com.skype.android.app.chat.picker.Search:
//            MediaPickerSearchFragment

public static final class  extends Enum
{

    private static final SUGGESTION_SELECTED $VALUES[];
    public static final SUGGESTION_SELECTED SUGGESTION_SELECTED;
    public static final SUGGESTION_SELECTED TYPED;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/skype/android/app/chat/picker/Search/MediaPickerSearchFragment$SearchStringSource, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        TYPED = new <init>("TYPED", 0);
        SUGGESTION_SELECTED = new <init>("SUGGESTION_SELECTED", 1);
        $VALUES = (new .VALUES[] {
            TYPED, SUGGESTION_SELECTED
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
