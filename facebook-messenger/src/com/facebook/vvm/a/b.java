// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.vvm.a;

import android.util.Log;

public final class b extends Enum
{

    private static final b $VALUES[];
    public static final b CREATED;
    public static final b DEACTIVATED_ENHANCED_SERVICES;
    public static final b INITIALIZED;
    public static final b NO_SUCH_MAILBOX;
    public static final b RESET_PASSWORD;
    public static final b UNKNOWN;
    private String strValue;

    private b(String s, int i, String s1)
    {
        super(s, i);
        strValue = s1;
    }

    public static b parse(String s)
    {
        b ab[] = values();
        int j = ab.length;
        for (int i = 0; i < j; i++)
        {
            b b1 = ab[i];
            if (s.compareTo(b1.strValue) == 0)
            {
                return b1;
            }
        }

        Log.e("ApplicationDirectedString", (new StringBuilder()).append("Invalid mailbox status ").append(s).append(" did not match any known statuses.").toString());
        return null;
    }

    public static b valueOf(String s)
    {
        return (b)Enum.valueOf(com/facebook/vvm/a/b, s);
    }

    public static b[] values()
    {
        return (b[])$VALUES.clone();
    }

    public String toString()
    {
        return strValue;
    }

    static 
    {
        CREATED = new b("CREATED", 0, "C");
        INITIALIZED = new b("INITIALIZED", 1, "I");
        UNKNOWN = new b("UNKNOWN", 2, "U");
        NO_SUCH_MAILBOX = new b("NO_SUCH_MAILBOX", 3, "N");
        RESET_PASSWORD = new b("RESET_PASSWORD", 4, "R");
        DEACTIVATED_ENHANCED_SERVICES = new b("DEACTIVATED_ENHANCED_SERVICES", 5, "D");
        $VALUES = (new b[] {
            CREATED, INITIALIZED, UNKNOWN, NO_SUCH_MAILBOX, RESET_PASSWORD, DEACTIVATED_ENHANCED_SERVICES
        });
    }
}
