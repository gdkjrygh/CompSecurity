// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.jsonstore.database;


// Referenced classes of package com.worklight.jsonstore.database:
//            QueryPartOperation

public static final class  extends Enum
{

    private static final ARRAY_ONLY $VALUES[];
    public static final ARRAY_ONLY ARRAY_ONLY;
    public static final ARRAY_ONLY PRIMITIVE_ONLY;
    public static final ARRAY_ONLY RANGE_ONLY;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/worklight/jsonstore/database/QueryPartOperation$QueryPartOperationRestriction, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        PRIMITIVE_ONLY = new <init>("PRIMITIVE_ONLY", 0);
        RANGE_ONLY = new <init>("RANGE_ONLY", 1);
        ARRAY_ONLY = new <init>("ARRAY_ONLY", 2);
        $VALUES = (new .VALUES[] {
            PRIMITIVE_ONLY, RANGE_ONLY, ARRAY_ONLY
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
