// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;


// Referenced classes of package com.skype.android.app.chat:
//            TranslatorSettingDialog

private static final class  extends Enum
{

    private static final OTHER $VALUES[];
    public static final OTHER ME;
    public static final OTHER OTHER;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/skype/android/app/chat/TranslatorSettingDialog$b, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        ME = new <init>("ME", 0);
        OTHER = new <init>("OTHER", 1);
        $VALUES = (new .VALUES[] {
            ME, OTHER
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
