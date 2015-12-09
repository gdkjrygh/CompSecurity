// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit;

import android.content.Intent;

// Referenced classes of package com.fitbit:
//            ApplicationForegroundController

public static final class  extends Enum
{

    public static final b a;
    public static final b b;
    private static final b c[];

    public static  b(Intent intent)
    {
        if (!intent.hasExtra("com.fitbit.ApplicationForegroundController.EXTRA_LAUNCH_TYPE"))
        {
            return b;
        } else
        {
            return values()[intent.getIntExtra("com.fitbit.ApplicationForegroundController.EXTRA_LAUNCH_TYPE", -1)];
        }
    }

    public static values valueOf(String s)
    {
        return (values)Enum.valueOf(com/fitbit/ApplicationForegroundController$LaunchType, s);
    }

    public static values[] values()
    {
        return (values[])c.clone();
    }

    public void a(Intent intent)
    {
        intent.putExtra("com.fitbit.ApplicationForegroundController.EXTRA_LAUNCH_TYPE", ordinal());
    }

    static 
    {
        a = new <init>("NFC_LAUNCH", 0);
        b = new <init>("DEFAULT", 1);
        c = (new c[] {
            a, b
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
