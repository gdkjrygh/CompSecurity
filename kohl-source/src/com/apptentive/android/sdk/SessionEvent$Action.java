// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.apptentive.android.sdk;


// Referenced classes of package com.apptentive.android.sdk:
//            SessionEvent

public static final class  extends Enum
{

    private static final STOP $VALUES[];
    public static final STOP START;
    public static final STOP STOP;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/apptentive/android/sdk/SessionEvent$Action, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        START = new <init>("START", 0);
        STOP = new <init>("STOP", 1);
        $VALUES = (new .VALUES[] {
            START, STOP
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
