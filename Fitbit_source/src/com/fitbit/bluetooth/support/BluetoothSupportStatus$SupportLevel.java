// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.bluetooth.support;

import java.util.Locale;

// Referenced classes of package com.fitbit.bluetooth.support:
//            BluetoothSupportStatus

public static final class btleSupported extends Enum
{

    public static final d a;
    public static final d b;
    public static final d c;
    public static final d d;
    private static final d e[];
    private boolean btleSupported;

    public static btleSupported a(String s)
    {
        try
        {
            s = valueOf(s.toUpperCase(Locale.US));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return b();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return b();
        }
        return s;
    }

    public static b b()
    {
        return a;
    }

    public static a valueOf(String s)
    {
        return (a)Enum.valueOf(com/fitbit/bluetooth/support/BluetoothSupportStatus$SupportLevel, s);
    }

    public static a[] values()
    {
        return (a[])e.clone();
    }

    public boolean a()
    {
        return btleSupported;
    }

    static 
    {
        a = new <init>("UNKNOWN", 0, false);
        b = new <init>("NOT_SUPPORTED", 1, false);
        c = new <init>("SUPPORTED", 2, true);
        d = new <init>("PARTIALLY_SUPPORTED", 3, true);
        e = (new e[] {
            a, b, c, d
        });
    }

    private (String s, int i, boolean flag)
    {
        super(s, i);
        btleSupported = flag;
    }
}
