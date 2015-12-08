// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.hockeyapp.android;


// Referenced classes of package net.hockeyapp.android:
//            CrashManagerListener

public static final class  extends Enum
{

    private static final ASK_USER $VALUES[];
    public static final ASK_USER ASK_USER;
    public static final ASK_USER DO_NOTHING;
    public static final ASK_USER SEND_SILENTLY;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(net/hockeyapp/android/CrashManagerListener$CrashHandlingPolicy, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        DO_NOTHING = new <init>("DO_NOTHING", 0);
        SEND_SILENTLY = new <init>("SEND_SILENTLY", 1);
        ASK_USER = new <init>("ASK_USER", 2);
        $VALUES = (new .VALUES[] {
            DO_NOTHING, SEND_SILENTLY, ASK_USER
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
