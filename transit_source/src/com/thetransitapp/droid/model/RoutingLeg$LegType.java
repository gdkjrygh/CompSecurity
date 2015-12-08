// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid.model;


// Referenced classes of package com.thetransitapp.droid.model:
//            RoutingLeg

public static final class  extends Enum
{

    public static final END END;
    private static final END ENUM$VALUES[];
    public static final END START;
    public static final END TRANSIT;
    public static final END WAIT;
    public static final END WALK;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/thetransitapp/droid/model/RoutingLeg$LegType, s);
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
        START = new <init>("START", 0);
        WALK = new <init>("WALK", 1);
        WAIT = new <init>("WAIT", 2);
        TRANSIT = new <init>("TRANSIT", 3);
        END = new <init>("END", 4);
        ENUM$VALUES = (new ENUM.VALUES[] {
            START, WALK, WAIT, TRANSIT, END
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
