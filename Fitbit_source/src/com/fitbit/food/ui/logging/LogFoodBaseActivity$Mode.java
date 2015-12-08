// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.food.ui.logging;


// Referenced classes of package com.fitbit.food.ui.logging:
//            LogFoodBaseActivity

public static final class _cls9 extends Enum
{

    public static final b a;
    public static final b b;
    private static final b c[];

    public static _cls9 valueOf(String s)
    {
        return (_cls9)Enum.valueOf(com/fitbit/food/ui/logging/LogFoodBaseActivity$Mode, s);
    }

    public static _cls9[] values()
    {
        return (_cls9[])c.clone();
    }

    static 
    {
        a = new <init>("CREATE_NEW", 0);
        b = new <init>("EDIT_EXISTING", 1);
        c = (new c[] {
            a, b
        });
    }

    private _cls9(String s, int i)
    {
        super(s, i);
    }
}
