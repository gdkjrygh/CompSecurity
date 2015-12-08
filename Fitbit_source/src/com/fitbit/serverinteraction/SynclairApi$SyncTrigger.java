// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.serverinteraction;

import android.content.Intent;

// Referenced classes of package com.fitbit.serverinteraction:
//            SynclairApi

public static final class trigger extends Enum
{

    public static final c a;
    public static final c b;
    public static final c c;
    public static final String d = "SynclairApi.EXTRA_SYNC_TRIGGER";
    private static final c e[];
    protected final String trigger;

    public static trigger b(Intent intent)
    {
        int i = intent.getIntExtra("SynclairApi.EXTRA_SYNC_TRIGGER", -1);
        if (i < 0 || i >= values().length)
        {
            return a;
        } else
        {
            return values()[i];
        }
    }

    public static values valueOf(String s)
    {
        return (values)Enum.valueOf(com/fitbit/serverinteraction/SynclairApi$SyncTrigger, s);
    }

    public static values[] values()
    {
        return (values[])e.clone();
    }

    public Intent a(Intent intent)
    {
        return intent.putExtra("SynclairApi.EXTRA_SYNC_TRIGGER", ordinal());
    }

    public String a()
    {
        return trigger;
    }

    static 
    {
        a = new <init>("CLIENT", 0, "client");
        b = new <init>("USER", 1, "user");
        c = new <init>("TRACKER", 2, "tracker");
        e = (new e[] {
            a, b, c
        });
    }

    private (String s, int i, String s1)
    {
        super(s, i);
        trigger = s1;
    }
}
