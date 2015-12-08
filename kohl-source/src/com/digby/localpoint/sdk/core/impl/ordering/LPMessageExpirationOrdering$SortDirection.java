// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.localpoint.sdk.core.impl.ordering;


// Referenced classes of package com.digby.localpoint.sdk.core.impl.ordering:
//            LPMessageExpirationOrdering

public static final class  extends Enum
{

    private static final DESCENDING $VALUES[];
    public static final DESCENDING ASCENDING;
    public static final DESCENDING DESCENDING;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/digby/localpoint/sdk/core/impl/ordering/LPMessageExpirationOrdering$SortDirection, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        ASCENDING = new <init>("ASCENDING", 0);
        DESCENDING = new <init>("DESCENDING", 1);
        $VALUES = (new .VALUES[] {
            ASCENDING, DESCENDING
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
