// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.livedata.auth;

import com.fitbit.e.a;
import com.fitbit.galileo.GalileoTrackerType;

// Referenced classes of package com.fitbit.livedata.auth:
//            TrackerAuthCredentials

public static final class  extends Enum
{

    public static final b a;
    public static final b b;
    private static final b c[];

    public static  a(GalileoTrackerType galileotrackertype)
    {
        com.fitbit.e.a.d("Cipher", String.format("Determining Cipher for %s", new Object[] {
            galileotrackertype.name()
        }), new Object[0]);
        switch (com.fitbit.livedata.auth.[galileotrackertype.ordinal()])
        {
        default:
            return b;

        case 1: // '\001'
            return a;
        }
    }

    public static a valueOf(String s)
    {
        return (a)Enum.valueOf(com/fitbit/livedata/auth/TrackerAuthCredentials$Cipher, s);
    }

    public static a[] values()
    {
        return (a[])c.clone();
    }

    static 
    {
        a = new <init>("AES", 0);
        b = new <init>("XTEA", 1);
        c = (new c[] {
            a, b
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
