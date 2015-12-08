// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.viewpagerindicator;


// Referenced classes of package com.viewpagerindicator:
//            TitlePageIndicator

public static final class value extends Enum
{

    private static final Top $VALUES[];
    public static final Top Bottom;
    public static final Top Top;
    public final int value;

    public static value fromValue(int i)
    {
        value avalue[] = values();
        int k = avalue.length;
        for (int j = 0; j < k; j++)
        {
            value value1 = avalue[j];
            if (value1.value == i)
            {
                return value1;
            }
        }

        return null;
    }

    public static value valueOf(String s)
    {
        return (value)Enum.valueOf(com/viewpagerindicator/TitlePageIndicator$LinePosition, s);
    }

    public static value[] values()
    {
        return (value[])$VALUES.clone();
    }

    static 
    {
        Bottom = new <init>("Bottom", 0, 0);
        Top = new <init>("Top", 1, 1);
        $VALUES = (new .VALUES[] {
            Bottom, Top
        });
    }

    private (String s, int i, int j)
    {
        super(s, i);
        value = j;
    }
}
