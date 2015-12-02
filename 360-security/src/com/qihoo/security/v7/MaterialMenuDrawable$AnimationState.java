// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.v7;


// Referenced classes of package com.qihoo.security.v7:
//            MaterialMenuDrawable

public static final class  extends Enum
{

    public static final X_CHECK ARROW_CHECK;
    public static final X_CHECK ARROW_X;
    public static final X_CHECK BURGER_ARROW;
    public static final X_CHECK BURGER_CHECK;
    public static final X_CHECK BURGER_X;
    public static final X_CHECK X_CHECK;
    private static final X_CHECK a[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/qihoo/security/v7/MaterialMenuDrawable$AnimationState, s);
    }

    public static [] values()
    {
        return ([])a.clone();
    }

    public e_3B_.clone getFirstState()
    {
        switch (e_3B_.clone[ordinal()])
        {
        default:
            return null;

        case 1: // '\001'
            return R;

        case 2: // '\002'
            return R;

        case 3: // '\003'
            return ;

        case 4: // '\004'
            return ;

        case 5: // '\005'
            return R;

        case 6: // '\006'
            return R;
        }
    }

    public R getSecondState()
    {
        switch (R[ordinal()])
        {
        default:
            return null;

        case 1: // '\001'
            return ;

        case 2: // '\002'
            return ;

        case 3: // '\003'
            return ;

        case 4: // '\004'
            return ;

        case 5: // '\005'
            return ;

        case 6: // '\006'
            return ;
        }
    }

    static 
    {
        BURGER_ARROW = new <init>("BURGER_ARROW", 0);
        BURGER_X = new <init>("BURGER_X", 1);
        ARROW_X = new <init>("ARROW_X", 2);
        ARROW_CHECK = new <init>("ARROW_CHECK", 3);
        BURGER_CHECK = new <init>("BURGER_CHECK", 4);
        X_CHECK = new <init>("X_CHECK", 5);
        a = (new a[] {
            BURGER_ARROW, BURGER_X, ARROW_X, ARROW_CHECK, BURGER_CHECK, X_CHECK
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
