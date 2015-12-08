// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.api2;


// Referenced classes of package com.snapchat.android.api2:
//            LoadAllStorySnapsTask

public static final class  extends Enum
{

    private static final TIMEOUT $VALUES[];
    public static final TIMEOUT FAILED_TO_LOAD;
    public static final TIMEOUT INITIALIZED;
    public static final TIMEOUT RUNNING;
    public static final TIMEOUT SUCCESS;
    public static final TIMEOUT TIMEOUT;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/snapchat/android/api2/LoadAllStorySnapsTask$Status, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        INITIALIZED = new <init>("INITIALIZED", 0);
        RUNNING = new <init>("RUNNING", 1);
        SUCCESS = new <init>("SUCCESS", 2);
        FAILED_TO_LOAD = new <init>("FAILED_TO_LOAD", 3);
        TIMEOUT = new <init>("TIMEOUT", 4);
        $VALUES = (new .VALUES[] {
            INITIALIZED, RUNNING, SUCCESS, FAILED_TO_LOAD, TIMEOUT
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
