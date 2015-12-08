// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.HashMap;

public static final class intValue extends Enum
{

    private static final lang.Object $VALUES[];
    public static final ES BLOCKED;
    public static final ED DELETED;
    public static final ED FOLLOWING;
    public static final WING FRIEND;
    public static final D INVITE_PLACEHOLDER;
    public static final E_PLACEHOLDER LOCKED_PLACEHOLDER;
    public static final D_PLACEHOLDER PENDING;
    public static final NG UNKNOWN;
    public static final WN UNRECOGNIZED_VALUE;
    private static final HashMap VALUE_TO_ENUM;
    private final int intValue;

    public static lang.Integer a(Integer integer)
    {
        lang.Object obj = (Object)VALUE_TO_ENUM.get(integer);
        integer = obj;
        if (obj == null)
        {
            integer = UNRECOGNIZED_VALUE;
        }
        return integer;
    }

    public static lang.String valueOf(String s)
    {
        return (Of)Enum.valueOf(QS$a, s);
    }

    public static lang.String[] values()
    {
        return (s[])$VALUES.clone();
    }

    static 
    {
        int i = 0;
        UNKNOWN = new <init>("UNKNOWN", 0, -1);
        FRIEND = new <init>("FRIEND", 1, 0);
        PENDING = new <init>("PENDING", 2, 1);
        BLOCKED = new <init>("BLOCKED", 3, 2);
        DELETED = new <init>("DELETED", 4, 3);
        INVITE_PLACEHOLDER = new <init>("INVITE_PLACEHOLDER", 5, 4);
        LOCKED_PLACEHOLDER = new <init>("LOCKED_PLACEHOLDER", 6, 5);
        FOLLOWING = new <init>("FOLLOWING", 7, 6);
        UNRECOGNIZED_VALUE = new <init>("UNRECOGNIZED_VALUE", 8, -9999);
        $VALUES = (new .VALUES[] {
            UNKNOWN, FRIEND, PENDING, BLOCKED, DELETED, INVITE_PLACEHOLDER, LOCKED_PLACEHOLDER, FOLLOWING, UNRECOGNIZED_VALUE
        });
        VALUE_TO_ENUM = new HashMap();
        lang.String as[] = values();
        for (int j = as.length; i < j; i++)
        {
            String s = as[i];
            VALUE_TO_ENUM.put(Integer.valueOf(s.intValue), s);
        }

    }

    private >(String s, int i, int j)
    {
        super(s, i);
        intValue = j;
    }
}
