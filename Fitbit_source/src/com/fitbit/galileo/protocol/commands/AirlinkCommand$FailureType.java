// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.galileo.protocol.commands;

import android.os.Bundle;
import java.util.EnumSet;

// Referenced classes of package com.fitbit.galileo.protocol.commands:
//            AirlinkCommand

public static final class  extends Enum
{

    public static final l a;
    public static final l b;
    public static final l c;
    public static final l d;
    public static final l e;
    public static final l f;
    public static final l g;
    public static final l h;
    public static final l i;
    public static final l j;
    public static final l k;
    public static final l l;
    private static final l m[];

    public static boolean a( )
    {
        return e == ;
    }

    public static e b(Bundle bundle)
    {
        return b(com/fitbit/galileo/protocol/commands/AirlinkCommand$FailureType.getName(), bundle);
    }

    public static b b(String s, Bundle bundle)
    {
        return values()[bundle.getInt(s, l.ordinal())];
    }

    public static boolean b(ordinal ordinal)
    {
        return EnumSet.of(c, d, f).contains(ordinal);
    }

    public static boolean c(f f1)
    {
        return f1 != null && !EnumSet.of(b, i).contains(f1);
    }

    public static i valueOf(String s)
    {
        return (i)Enum.valueOf(com/fitbit/galileo/protocol/commands/AirlinkCommand$FailureType, s);
    }

    public static i[] values()
    {
        return (i[])m.clone();
    }

    public void a(Bundle bundle)
    {
        a(getClass().getName(), bundle);
    }

    public void a(String s, Bundle bundle)
    {
        bundle.putInt(s, ordinal());
    }

    static 
    {
        a = new <init>("CANCELLED", 0);
        b = new <init>("BLUETOOTH_DISABLED", 1);
        c = new <init>("BLUETOOTH_CONNECTION", 2);
        d = new <init>("RECOVERABLE_COMMUNICATION_WITH_TRACKER", 3);
        e = new <init>("RECOVERABLE_COMMUNICATION_WITH_SITE", 4);
        f = new <init>("TRACKER_REPAIR_NEEDED", 5);
        g = new <init>("TRACKER_FIRMWARE_UPDATE_NEEDED", 6);
        h = new <init>("TRACKER_INVALID_SECRET", 7);
        i = new <init>("TRACKER_BACKOFF", 8);
        j = new <init>("TRACKER_LOW_BATTERY", 9);
        k = new <init>("UNEXPECTED_BOOT_MODE", 10);
        l = new <init>("UNKNOWN", 11);
        m = (new m[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l
        });
    }

    private (String s, int i1)
    {
        super(s, i1);
    }
}
