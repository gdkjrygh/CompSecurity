// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.answers;


// Referenced classes of package com.crashlytics.android.answers:
//            SessionEvent

static final class  extends Enum
{

    private static final INSTALL $VALUES[];
    public static final INSTALL CRASH;
    public static final INSTALL CREATE;
    public static final INSTALL DESTROY;
    public static final INSTALL ERROR;
    public static final INSTALL INSTALL;
    public static final INSTALL PAUSE;
    public static final INSTALL RESUME;
    public static final INSTALL SAVE_INSTANCE_STATE;
    public static final INSTALL START;
    public static final INSTALL STOP;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/crashlytics/android/answers/SessionEvent$Type, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        CREATE = new <init>("CREATE", 0);
        START = new <init>("START", 1);
        RESUME = new <init>("RESUME", 2);
        SAVE_INSTANCE_STATE = new <init>("SAVE_INSTANCE_STATE", 3);
        PAUSE = new <init>("PAUSE", 4);
        STOP = new <init>("STOP", 5);
        DESTROY = new <init>("DESTROY", 6);
        ERROR = new <init>("ERROR", 7);
        CRASH = new <init>("CRASH", 8);
        INSTALL = new <init>("INSTALL", 9);
        $VALUES = (new .VALUES[] {
            CREATE, START, RESUME, SAVE_INSTANCE_STATE, PAUSE, STOP, DESTROY, ERROR, CRASH, INSTALL
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
