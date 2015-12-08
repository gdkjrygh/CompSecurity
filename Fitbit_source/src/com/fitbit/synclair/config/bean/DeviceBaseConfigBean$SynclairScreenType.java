// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.synclair.config.bean;


// Referenced classes of package com.fitbit.synclair.config.bean:
//            DeviceBaseConfigBean

public static final class  extends Enum
{

    public static final s a;
    public static final s b;
    public static final s c;
    public static final s d;
    public static final s e;
    public static final s f;
    public static final s g;
    public static final s h;
    public static final s i;
    public static final s j;
    public static final s k;
    public static final s l;
    public static final s m;
    public static final s n;
    public static final s o;
    public static final s p;
    public static final s q;
    public static final s r;
    public static final s s;
    private static final s t[];

    public static  valueOf(String s1)
    {
        return ()Enum.valueOf(com/fitbit/synclair/config/bean/DeviceBaseConfigBean$SynclairScreenType, s1);
    }

    public static [] values()
    {
        return ([])t.clone();
    }

    static 
    {
        a = new <init>("PREPARATION", 0);
        b = new <init>("SEARCHING", 1);
        c = new <init>("FOUND", 2);
        d = new <init>("MULTIPLE_CANDIDATES", 3);
        e = new <init>("STILL_WAITING", 4);
        f = new <init>("TROUBLESHOOTING", 5);
        g = new <init>("CODE_INPUT", 6);
        h = new <init>("EXERCISE_SELECTION", 7);
        i = new <init>("EDIT_GREETING", 8);
        j = new <init>("TAU_FORCE_CONFLICT_SCREEN", 9);
        k = new <init>("PAIR_FW_OPTIONAL", 10);
        l = new <init>("PAIR_FW_OPTIONAL_ALWAYS", 11);
        m = new <init>("PAIR_FW_LOW_BATTERY_REQUIRED", 12);
        n = new <init>("FW_CONNECTING", 13);
        o = new <init>("FW_UPDATING", 14);
        p = new <init>("FW_BLE_ERROR", 15);
        q = new <init>("FW_INCOMPLETE", 16);
        r = new <init>("FW_LOW_BATTERY", 17);
        s = new <init>("ORIENTATION", 18);
        t = (new t[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l, m, n, o, p, q, r, s
        });
    }

    private (String s1, int i1)
    {
        super(s1, i1);
    }
}
