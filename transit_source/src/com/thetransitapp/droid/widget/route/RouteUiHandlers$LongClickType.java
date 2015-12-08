// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid.widget.route;


// Referenced classes of package com.thetransitapp.droid.widget.route:
//            RouteUiHandlers

public static final class  extends Enum
{

    public static final DIRECTION DIRECTION;
    private static final DIRECTION ENUM$VALUES[];
    public static final DIRECTION TIME;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/thetransitapp/droid/widget/route/RouteUiHandlers$LongClickType, s);
    }

    public static [] values()
    {
         a[] = ENUM$VALUES;
        int i = a.length;
         a1[] = new ENUM.VALUES[i];
        System.arraycopy(a, 0, a1, 0, i);
        return a1;
    }

    static 
    {
        TIME = new <init>("TIME", 0);
        DIRECTION = new <init>("DIRECTION", 1);
        ENUM$VALUES = (new ENUM.VALUES[] {
            TIME, DIRECTION
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
