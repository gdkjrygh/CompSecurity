// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid.model;


// Referenced classes of package com.thetransitapp.droid.model:
//            Itinerary

public static final class  extends Enum
{

    private static final UNDEFINED ENUM$VALUES[];
    public static final UNDEFINED INBOUND;
    public static final UNDEFINED OUTBOUND;
    public static final UNDEFINED UNDEFINED;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/thetransitapp/droid/model/Itinerary$DirectionType, s);
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
        INBOUND = new <init>("INBOUND", 0);
        OUTBOUND = new <init>("OUTBOUND", 1);
        UNDEFINED = new <init>("UNDEFINED", 2);
        ENUM$VALUES = (new ENUM.VALUES[] {
            INBOUND, OUTBOUND, UNDEFINED
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
