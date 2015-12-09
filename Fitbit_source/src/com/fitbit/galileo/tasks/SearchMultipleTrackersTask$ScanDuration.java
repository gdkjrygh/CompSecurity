// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.galileo.tasks;


// Referenced classes of package com.fitbit.galileo.tasks:
//            SearchMultipleTrackersTask

public static final class value extends Enum
{

    public static final b a;
    public static final b b;
    private static final b c[];
    private final Long value;

    public static value valueOf(String s)
    {
        return (value)Enum.valueOf(com/fitbit/galileo/tasks/SearchMultipleTrackersTask$ScanDuration, s);
    }

    public static value[] values()
    {
        return (value[])c.clone();
    }

    public Long a()
    {
        return value;
    }

    static 
    {
        a = new <init>("DEFAULT", 0, null);
        b = new <init>("QUICK", 1, Long.valueOf(3000L));
        c = (new c[] {
            a, b
        });
    }

    private (String s, int i, Long long1)
    {
        super(s, i);
        value = long1;
    }
}
