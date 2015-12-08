// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.audio;


// Referenced classes of package com.skype.android.audio:
//            WiredHeadsetReceiver

public static final class  extends Enum
{

    public static final c a;
    public static final c b;
    public static final c c;
    private static final c d[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/skype/android/audio/WiredHeadsetReceiver$WiredHeadsetStatus, s);
    }

    public static [] values()
    {
        return ([])d.clone();
    }

    static 
    {
        a = new <init>("UNPLUGGED", 0);
        b = new <init>("PLUGGED_WITHOUT_MIC", 1);
        c = new <init>("PLUGGED_WITH_MIC", 2);
        d = (new d[] {
            a, b, c
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
