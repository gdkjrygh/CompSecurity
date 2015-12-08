// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.jsonstore.database;


// Referenced classes of package com.worklight.jsonstore.database:
//            QueryBuilder

public static final class  extends Enum
{

    private static final DELETED_ONLY $VALUES[];
    public static final DELETED_ONLY DELETED_AND_NOT_DELETED;
    public static final DELETED_ONLY DELETED_ONLY;
    public static final DELETED_ONLY NON_DELETED_ONLY;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/worklight/jsonstore/database/QueryBuilder$DeletedInclusion, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        DELETED_AND_NOT_DELETED = new <init>("DELETED_AND_NOT_DELETED", 0);
        NON_DELETED_ONLY = new <init>("NON_DELETED_ONLY", 1);
        DELETED_ONLY = new <init>("DELETED_ONLY", 2);
        $VALUES = (new .VALUES[] {
            DELETED_AND_NOT_DELETED, NON_DELETED_ONLY, DELETED_ONLY
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
