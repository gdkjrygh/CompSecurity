// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.domain;


// Referenced classes of package com.fitbit.data.domain:
//            RankedUser

public static final class  extends Enum
{

    private static final FRIEND $VALUES[];
    public static final FRIEND FRIEND;
    public static final FRIEND REQUEST_RECEIVE;
    public static final FRIEND REQUEST_SENT;
    public static final FRIEND STRANGER;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/fitbit/data/domain/RankedUser$Relation, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        STRANGER = new <init>("STRANGER", 0);
        REQUEST_SENT = new <init>("REQUEST_SENT", 1);
        REQUEST_RECEIVE = new <init>("REQUEST_RECEIVE", 2);
        FRIEND = new <init>("FRIEND", 3);
        $VALUES = (new .VALUES[] {
            STRANGER, REQUEST_SENT, REQUEST_RECEIVE, FRIEND
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
