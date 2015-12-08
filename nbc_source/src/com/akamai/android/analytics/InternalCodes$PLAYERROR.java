// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.akamai.android.analytics;


// Referenced classes of package com.akamai.android.analytics:
//            InternalCodes

public static final class  extends Enum
{

    public static final PLAYER_ERROR CONNECTION_CLOSED;
    private static final PLAYER_ERROR ENUM$VALUES[];
    public static final PLAYER_ERROR PLAYER_ERROR;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/akamai/android/analytics/InternalCodes$PLAYERROR, s);
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
        CONNECTION_CLOSED = new <init>("CONNECTION_CLOSED", 0);
        PLAYER_ERROR = new <init>("PLAYER_ERROR", 1);
        ENUM$VALUES = (new ENUM.VALUES[] {
            CONNECTION_CLOSED, PLAYER_ERROR
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
