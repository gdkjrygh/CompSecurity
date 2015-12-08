// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.galileo.tasks;


// Referenced classes of package com.fitbit.galileo.tasks:
//            GalileoCompoundTask

protected static final class  extends Enum
{

    public static final c a;
    public static final c b;
    public static final c c;
    private static final c d[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/fitbit/galileo/tasks/GalileoCompoundTask$SubTaskQueueAction, s);
    }

    public static [] values()
    {
        return ([])d.clone();
    }

    static 
    {
        a = new <init>("QUEUE_PROCESS_NEXT", 0);
        b = new <init>("QUEUE_GO_TO_POST_EXECUTE", 1);
        c = new <init>("QUEUE_STOP", 2);
        d = (new d[] {
            a, b, c
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
