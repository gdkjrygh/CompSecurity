// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.friends.ui;

import android.content.Intent;

// Referenced classes of package com.fitbit.friends.ui:
//            ScanNetworkOperationBinder

public static final class  extends Enum
{

    public static final d a;
    public static final d b;
    public static final d c;
    public static final d d;
    private static final d e[];

    public static  a(Intent intent, String s,  )
    {
        int i = intent.getIntExtra(s, .ordinal());
        if (i < 0 || i >= values().length)
        {
            return ;
        } else
        {
            return values()[i];
        }
    }

    public static values valueOf(String s)
    {
        return (values)Enum.valueOf(com/fitbit/friends/ui/ScanNetworkOperationBinder$WhatsScanning, s);
    }

    public static values[] values()
    {
        return (values[])e.clone();
    }

    static 
    {
        a = new <init>("NOTHING", 0);
        b = new <init>("BOTH", 1);
        c = new <init>("CONTACTS", 2);
        d = new <init>("FACEBOOK", 3);
        e = (new e[] {
            a, b, c, d
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
