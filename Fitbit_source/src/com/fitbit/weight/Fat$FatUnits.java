// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.weight;

import com.fitbit.data.domain.m;
import com.fitbit.data.domain.s;

// Referenced classes of package com.fitbit.weight:
//            Fat

public static final class  extends Enum
    implements m, s
{

    public static final a a;
    private static final a b[];

    public static  valueOf(String s1)
    {
        return ()Enum.valueOf(com/fitbit/weight/Fat$FatUnits, s1);
    }

    public static [] values()
    {
        return ([])b.clone();
    }

    public String getDisplayName()
    {
        return "%";
    }

    public String getSerializableName()
    {
        return "%";
    }

    public String getShortDisplayName()
    {
        return "%";
    }

    public String toString()
    {
        return getSerializableName();
    }

    static 
    {
        a = new <init>("PERCENT", 0);
        b = (new b[] {
            a
        });
    }

    private (String s1, int i)
    {
        super(s1, i);
    }
}
