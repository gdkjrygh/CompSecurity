// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.localytics.android;


// Referenced classes of package com.localytics.android:
//            AmpCondition

public static final class  extends Enum
{

    private static final IN_LIST $VALUES[];
    public static final IN_LIST BETWEEN;
    public static final IN_LIST EQUAL;
    public static final IN_LIST GREATER_THAN;
    public static final IN_LIST GREATER_THEN_OR_EQUAL;
    public static final IN_LIST INVALID;
    public static final IN_LIST IN_LIST;
    public static final IN_LIST LESS_THAN;
    public static final IN_LIST LESS_THAN_OR_EQUAL;
    public static final IN_LIST NOT_EQUAL;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/localytics/android/AmpCondition$Opt, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        INVALID = new <init>("INVALID", 0);
        EQUAL = new <init>("EQUAL", 1);
        NOT_EQUAL = new <init>("NOT_EQUAL", 2);
        GREATER_THAN = new <init>("GREATER_THAN", 3);
        GREATER_THEN_OR_EQUAL = new <init>("GREATER_THEN_OR_EQUAL", 4);
        LESS_THAN = new <init>("LESS_THAN", 5);
        LESS_THAN_OR_EQUAL = new <init>("LESS_THAN_OR_EQUAL", 6);
        BETWEEN = new <init>("BETWEEN", 7);
        IN_LIST = new <init>("IN_LIST", 8);
        $VALUES = (new .VALUES[] {
            INVALID, EQUAL, NOT_EQUAL, GREATER_THAN, GREATER_THEN_OR_EQUAL, LESS_THAN, LESS_THAN_OR_EQUAL, BETWEEN, IN_LIST
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
