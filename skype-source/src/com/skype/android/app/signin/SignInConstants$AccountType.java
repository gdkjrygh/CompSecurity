// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.signin;


// Referenced classes of package com.skype.android.app.signin:
//            SignInConstants

public static final class resourceId extends Enum
{

    private static final MSA $VALUES[];
    public static final MSA MSA;
    public static final MSA SKYPE;
    private final int resourceId;

    public static resourceId valueOf(String s)
    {
        return (resourceId)Enum.valueOf(com/skype/android/app/signin/SignInConstants$AccountType, s);
    }

    public static resourceId[] values()
    {
        return (resourceId[])$VALUES.clone();
    }

    public final int getAccountDescriptionResourceId()
    {
        return resourceId;
    }

    static 
    {
        SKYPE = new <init>("SKYPE", 0, 0x7f08045d);
        MSA = new <init>("MSA", 1, 0x7f08045a);
        $VALUES = (new .VALUES[] {
            SKYPE, MSA
        });
    }

    private (String s, int i, int j)
    {
        super(s, i);
        resourceId = j;
    }
}
