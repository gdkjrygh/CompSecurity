// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.model;


// Referenced classes of package com.snapchat.android.model:
//            Friend

public static final class  extends Enum
{

    private static final BOTH $VALUES[];
    public static final BOTH BOTH;
    public static final BOTH INCOMING;
    public static final BOTH OUTGOING;
    public static final BOTH UNKNOWN;

    public static  fromValue(String s)
    {
        try
        {
            s = valueOf(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return UNKNOWN;
        }
        return s;
    }

    public static UNKNOWN valueOf(String s)
    {
        return (UNKNOWN)Enum.valueOf(com/snapchat/android/model/Friend$Direction, s);
    }

    public static UNKNOWN[] values()
    {
        return (UNKNOWN[])$VALUES.clone();
    }

    static 
    {
        UNKNOWN = new <init>("UNKNOWN", 0);
        INCOMING = new <init>("INCOMING", 1);
        OUTGOING = new <init>("OUTGOING", 2);
        BOTH = new <init>("BOTH", 3);
        $VALUES = (new .VALUES[] {
            UNKNOWN, INCOMING, OUTGOING, BOTH
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
