// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.galileo.tasks.subtasks;


// Referenced classes of package com.fitbit.galileo.tasks.subtasks:
//            GalileoSubTask

private static final class  extends Enum
{

    public static final f a;
    public static final f b;
    public static final f c;
    public static final f d;
    public static final f e;
    public static final f f;
    private static final f g[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/fitbit/galileo/tasks/subtasks/GalileoSubTask$State, s);
    }

    public static [] values()
    {
        return ([])g.clone();
    }

    static 
    {
        a = new <init>("STATE_NOT_STARTED", 0);
        b = new <init>("STATE_STARTING", 1);
        c = new <init>("STATE_IN_PROGRESS", 2);
        d = new <init>("STATE_COMPLETED", 3);
        e = new <init>("STATE_FAILED", 4);
        f = new <init>("STATE_CANCELLED", 5);
        g = (new g[] {
            a, b, c, d, e, f
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
