// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype;

import android.support.v4.util.j;

// Referenced classes of package com.skype:
//            SkyLib

public static final class value extends Enum
{

    private static final value $VALUES[];
    public static final value CL_CONTEXT_API_ALLOWLIST;
    public static final value CL_CONTEXT_API_BLOCKLIST;
    public static final value CL_CONTEXT_DF_BLOCKED;
    public static final value CL_CONTEXT_HTTPS_DIRECT;
    public static final value CL_CONTEXT_PLUGIN_ALLOWLIST;
    public static final value CL_CONTEXT_SDK_ALLOWLIST;
    public static final value CL_CONTEXT_SDK_BLOCKLIST;
    public static final value CL_CONTEXT_SF_BLOCKLIST;
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
        return (WRAPPER_UNKNOWN_VALUE)Enum.valueOf(com/skype/SkyLib$CONTENT_LIST_CONTEXT, s);
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
        CL_CONTEXT_DF_BLOCKED = new <init>("CL_CONTEXT_DF_BLOCKED", 0, 1);
        CL_CONTEXT_HTTPS_DIRECT = new <init>("CL_CONTEXT_HTTPS_DIRECT", 1, 2);
        CL_CONTEXT_API_ALLOWLIST = new <init>("CL_CONTEXT_API_ALLOWLIST", 2, 3);
        CL_CONTEXT_API_BLOCKLIST = new <init>("CL_CONTEXT_API_BLOCKLIST", 3, 4);
        CL_CONTEXT_PLUGIN_ALLOWLIST = new <init>("CL_CONTEXT_PLUGIN_ALLOWLIST", 4, 5);
        CL_CONTEXT_SF_BLOCKLIST = new <init>("CL_CONTEXT_SF_BLOCKLIST", 5, 6);
        CL_CONTEXT_SDK_BLOCKLIST = new <init>("CL_CONTEXT_SDK_BLOCKLIST", 6, 7);
        CL_CONTEXT_SDK_ALLOWLIST = new <init>("CL_CONTEXT_SDK_ALLOWLIST", 7, 8);
        WRAPPER_UNKNOWN_VALUE = new <init>("WRAPPER_UNKNOWN_VALUE", 8, 0x7fffffff);
        $VALUES = (new .VALUES[] {
            CL_CONTEXT_DF_BLOCKED, CL_CONTEXT_HTTPS_DIRECT, CL_CONTEXT_API_ALLOWLIST, CL_CONTEXT_API_BLOCKLIST, CL_CONTEXT_PLUGIN_ALLOWLIST, CL_CONTEXT_SF_BLOCKLIST, CL_CONTEXT_SDK_BLOCKLIST, CL_CONTEXT_SDK_ALLOWLIST, WRAPPER_UNKNOWN_VALUE
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
