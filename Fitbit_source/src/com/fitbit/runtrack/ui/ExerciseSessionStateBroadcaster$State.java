// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.runtrack.ui;


// Referenced classes of package com.fitbit.runtrack.ui:
//            ExerciseSessionStateBroadcaster

private static final class  extends Enum
{

    public static final c a;
    public static final c b;
    public static final c c;
    private static final c d[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/fitbit/runtrack/ui/ExerciseSessionStateBroadcaster$State, s);
    }

    public static [] values()
    {
        return ([])d.clone();
    }

    static 
    {
        a = new <init>("FINISH", 0);
        b = new <init>("PAUSE", 1);
        c = new <init>("RESUME", 2);
        d = (new d[] {
            a, b, c
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
