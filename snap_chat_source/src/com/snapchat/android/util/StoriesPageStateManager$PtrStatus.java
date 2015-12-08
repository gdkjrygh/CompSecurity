// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.util;


// Referenced classes of package com.snapchat.android.util:
//            StoriesPageStateManager

public static final class A extends Enum
{

    private static final COMPLETE $VALUES[];
    public static final COMPLETE COMPLETE;
    public static final COMPLETE INIT;
    public static final COMPLETE LOADING;
    public static final COMPLETE PREPARE;

    public static A fromValue(int i)
    {
        switch (i)
        {
        default:
            return INIT;

        case 1: // '\001'
            return INIT;

        case 2: // '\002'
            return PREPARE;

        case 3: // '\003'
            return LOADING;

        case 4: // '\004'
            return COMPLETE;
        }
    }

    public static COMPLETE valueOf(String s)
    {
        return (COMPLETE)Enum.valueOf(com/snapchat/android/util/StoriesPageStateManager$PtrStatus, s);
    }

    public static COMPLETE[] values()
    {
        return (COMPLETE[])$VALUES.clone();
    }

    static 
    {
        INIT = new <init>("INIT", 0);
        PREPARE = new <init>("PREPARE", 1);
        LOADING = new <init>("LOADING", 2);
        COMPLETE = new <init>("COMPLETE", 3);
        $VALUES = (new .VALUES[] {
            INIT, PREPARE, LOADING, COMPLETE
        });
    }

    private A(String s, int i)
    {
        super(s, i);
    }
}
