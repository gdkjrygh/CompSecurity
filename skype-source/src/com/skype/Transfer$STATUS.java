// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype;

import android.support.v4.util.j;

// Referenced classes of package com.skype:
//            Transfer

public static final class value extends Enum
{

    private static final a $VALUES[];
    public static final a CANCELLED;
    public static final a CANCELLED_BY_REMOTE;
    public static final a COMPLETED;
    public static final a CONNECTING;
    public static final a FAILED;
    public static final a NEW;
    public static final a OFFER_FROM_OTHER_INSTANCE;
    public static final a PAUSED;
    public static final a PLACEHOLDER;
    public static final a REMOTELY_PAUSED;
    public static final a TRANSFERRING;
    public static final a TRANSFERRING_OVER_RELAY;
    public static final a WAITING_FOR_ACCEPT;
    public static final a WRAPPER_UNKNOWN_VALUE;
    private static final j intToTypeMap;
    private final int value;

    public static value fromInt(int i)
    {
        value value1 = (value)intToTypeMap.a(i);
        if (value1 != null)
        {
            return value1;
        } else
        {
            return WRAPPER_UNKNOWN_VALUE;
        }
    }

    public static WRAPPER_UNKNOWN_VALUE valueOf(String s)
    {
        return (WRAPPER_UNKNOWN_VALUE)Enum.valueOf(com/skype/Transfer$STATUS, s);
    }

    public static WRAPPER_UNKNOWN_VALUE[] values()
    {
        return (WRAPPER_UNKNOWN_VALUE[])$VALUES.clone();
    }

    public final int toInt()
    {
        return super.Tr$;
    }

    static 
    {
        NEW = new <init>("NEW", 0, 0);
        CONNECTING = new <init>("CONNECTING", 1, 1);
        WAITING_FOR_ACCEPT = new <init>("WAITING_FOR_ACCEPT", 2, 2);
        TRANSFERRING = new <init>("TRANSFERRING", 3, 3);
        TRANSFERRING_OVER_RELAY = new <init>("TRANSFERRING_OVER_RELAY", 4, 4);
        PAUSED = new <init>("PAUSED", 5, 5);
        REMOTELY_PAUSED = new <init>("REMOTELY_PAUSED", 6, 6);
        CANCELLED = new <init>("CANCELLED", 7, 7);
        COMPLETED = new <init>("COMPLETED", 8, 8);
        FAILED = new <init>("FAILED", 9, 9);
        PLACEHOLDER = new <init>("PLACEHOLDER", 10, 10);
        OFFER_FROM_OTHER_INSTANCE = new <init>("OFFER_FROM_OTHER_INSTANCE", 11, 11);
        CANCELLED_BY_REMOTE = new <init>("CANCELLED_BY_REMOTE", 12, 12);
        WRAPPER_UNKNOWN_VALUE = new <init>("WRAPPER_UNKNOWN_VALUE", 13, 0x7fffffff);
        $VALUES = (new .VALUES[] {
            NEW, CONNECTING, WAITING_FOR_ACCEPT, TRANSFERRING, TRANSFERRING_OVER_RELAY, PAUSED, REMOTELY_PAUSED, CANCELLED, COMPLETED, FAILED, 
            PLACEHOLDER, OFFER_FROM_OTHER_INSTANCE, CANCELLED_BY_REMOTE, WRAPPER_UNKNOWN_VALUE
        });
        intToTypeMap = new j();
        S_3B_.clone aclone[] = values();
        int k = aclone.length;
        for (int i = 0; i < k; i++)
        {
            S_3B_.clone clone = aclone[i];
            intToTypeMap.a(((com.skype) (clone)).Tr$, clone);
        }

    }

    private (String s, int i, int k)
    {
        super(s, i);
        value = k;
    }
}
