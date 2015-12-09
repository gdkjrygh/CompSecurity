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
        return ()Enum.valueOf(com/fitbit/galileo/tasks/GalileoCompoundTask$SubTaskGroup, s);
    }

    public static [] values()
    {
        return ([])d.clone();
    }

    public p_3B_.clone a()
    {
        if (ordinal() + 1 < values().length)
        {
            return values()[ordinal() + 1];
        } else
        {
            return null;
        }
    }

    static 
    {
        a = new <init>("GROUP_PRE_EXECUTE", 0);
        b = new <init>("GROUP_MAIN", 1);
        c = new <init>("GROUP_POST_EXECUTE", 2);
        d = (new d[] {
            a, b, c
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
