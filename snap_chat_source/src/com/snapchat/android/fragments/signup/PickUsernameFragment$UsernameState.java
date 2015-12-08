// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.signup;


// Referenced classes of package com.snapchat.android.fragments.signup:
//            PickUsernameFragment

public static final class redXVisibility extends Enum
{

    private static final CLEAR $VALUES[];
    public static final CLEAR CLEAR;
    public static final CLEAR INVALID;
    public static final CLEAR IN_PROGRESS;
    public static final CLEAR RED_X;
    public static final CLEAR VALID;
    public final int progressBarVisibility;
    public final int redXVisibility;
    public final int thumbsDownVisibility;
    public final int thumbsUpVisibility;

    public static redXVisibility valueOf(String s)
    {
        return (redXVisibility)Enum.valueOf(com/snapchat/android/fragments/signup/PickUsernameFragment$UsernameState, s);
    }

    public static redXVisibility[] values()
    {
        return (redXVisibility[])$VALUES.clone();
    }

    static 
    {
        VALID = new <init>("VALID", 0, 0, 4, 4, 4);
        INVALID = new <init>("INVALID", 1, 4, 0, 4, 4);
        IN_PROGRESS = new <init>("IN_PROGRESS", 2, 4, 4, 0, 4);
        RED_X = new <init>("RED_X", 3, 4, 4, 4, 0);
        CLEAR = new <init>("CLEAR", 4, 4, 4, 4, 4);
        $VALUES = (new .VALUES[] {
            VALID, INVALID, IN_PROGRESS, RED_X, CLEAR
        });
    }

    private (String s, int i, int j, int k, int l, int i1)
    {
        super(s, i);
        thumbsUpVisibility = j;
        thumbsDownVisibility = k;
        progressBarVisibility = l;
        redXVisibility = i1;
    }
}
