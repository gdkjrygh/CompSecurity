// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype;

import android.support.v4.util.j;

// Referenced classes of package com.skype:
//            Contact

public static final class value extends Enum
{

    private static final value $VALUES[];
    public static final value AWAY;
    public static final value AWAY_FROM_MOBILE;
    public static final value BLOCKED;
    public static final value BLOCKED_SKYPEOUT;
    public static final value CONNECTING;
    public static final value DO_NOT_DISTURB;
    public static final value DO_NOT_DISTURB_FROM_MOBILE;
    public static final value INVISIBLE;
    public static final value NOT_AVAILABLE;
    public static final value NOT_AVAILABLE_FROM_MOBILE;
    public static final value OFFLINE;
    public static final value OFFLINE_BUT_CF_ABLE;
    public static final value OFFLINE_BUT_VM_ABLE;
    public static final value ONLINE;
    public static final value ONLINE_FROM_MOBILE;
    public static final value PENDINGAUTH;
    public static final value SKYPEOUT;
    public static final value SKYPE_ME;
    public static final value SKYPE_ME_FROM_MOBILE;
    public static final value UNKNOWN;
    public static final value WRAPPER_UNKNOWN_VALUE;
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
        return (WRAPPER_UNKNOWN_VALUE)Enum.valueOf(com/skype/Contact$AVAILABILITY, s);
    }

    public static WRAPPER_UNKNOWN_VALUE[] values()
    {
        return (WRAPPER_UNKNOWN_VALUE[])$VALUES.clone();
    }

    public final int toInt()
    {
        return value;
    }

    static 
    {
        UNKNOWN = new <init>("UNKNOWN", 0, 0);
        PENDINGAUTH = new <init>("PENDINGAUTH", 1, 8);
        BLOCKED = new <init>("BLOCKED", 2, 9);
        BLOCKED_SKYPEOUT = new <init>("BLOCKED_SKYPEOUT", 3, 11);
        SKYPEOUT = new <init>("SKYPEOUT", 4, 10);
        OFFLINE = new <init>("OFFLINE", 5, 1);
        OFFLINE_BUT_VM_ABLE = new <init>("OFFLINE_BUT_VM_ABLE", 6, 12);
        OFFLINE_BUT_CF_ABLE = new <init>("OFFLINE_BUT_CF_ABLE", 7, 13);
        ONLINE = new <init>("ONLINE", 8, 2);
        AWAY = new <init>("AWAY", 9, 3);
        NOT_AVAILABLE = new <init>("NOT_AVAILABLE", 10, 4);
        DO_NOT_DISTURB = new <init>("DO_NOT_DISTURB", 11, 5);
        SKYPE_ME = new <init>("SKYPE_ME", 12, 7);
        INVISIBLE = new <init>("INVISIBLE", 13, 6);
        CONNECTING = new <init>("CONNECTING", 14, 14);
        ONLINE_FROM_MOBILE = new <init>("ONLINE_FROM_MOBILE", 15, 15);
        AWAY_FROM_MOBILE = new <init>("AWAY_FROM_MOBILE", 16, 16);
        NOT_AVAILABLE_FROM_MOBILE = new <init>("NOT_AVAILABLE_FROM_MOBILE", 17, 17);
        DO_NOT_DISTURB_FROM_MOBILE = new <init>("DO_NOT_DISTURB_FROM_MOBILE", 18, 18);
        SKYPE_ME_FROM_MOBILE = new <init>("SKYPE_ME_FROM_MOBILE", 19, 20);
        WRAPPER_UNKNOWN_VALUE = new <init>("WRAPPER_UNKNOWN_VALUE", 20, 0x7fffffff);
        $VALUES = (new .VALUES[] {
            UNKNOWN, PENDINGAUTH, BLOCKED, BLOCKED_SKYPEOUT, SKYPEOUT, OFFLINE, OFFLINE_BUT_VM_ABLE, OFFLINE_BUT_CF_ABLE, ONLINE, AWAY, 
            NOT_AVAILABLE, DO_NOT_DISTURB, SKYPE_ME, INVISIBLE, CONNECTING, ONLINE_FROM_MOBILE, AWAY_FROM_MOBILE, NOT_AVAILABLE_FROM_MOBILE, DO_NOT_DISTURB_FROM_MOBILE, SKYPE_ME_FROM_MOBILE, 
            WRAPPER_UNKNOWN_VALUE
        });
        intToTypeMap = new j();
        value avalue[] = values();
        int k = avalue.length;
        for (int i = 0; i < k; i++)
        {
            value value1 = avalue[i];
            intToTypeMap.a(value1.value, value1);
        }

    }

    private (String s, int i, int k)
    {
        super(s, i);
        value = k;
    }
}
