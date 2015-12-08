// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.android.c;

import kik.android.util.DeviceUtils;

// Referenced classes of package com.kik.android.c:
//            f

private static final class c
{

    private int a;
    private int b;
    private int c;
    private String d;
    private String e;

    static String a(c c1)
    {
        return c1.d;
    }

    static String b(d d1)
    {
        return d1.e;
    }

    public final int a()
    {
        DeviceUtils.b();
        JVM INSTR lookupswitch 5: default 52
    //                   120: 66
    //                   160: 72
    //                   240: 66
    //                   320: 72
    //                   480: 66;
           goto _L1 _L2 _L3 _L2 _L3 _L2
_L3:
        break MISSING_BLOCK_LABEL_72;
_L1:
        byte byte0 = 60;
_L4:
        if (byte0 == 60)
        {
            return b;
        } else
        {
            return a;
        }
_L2:
        byte0 = 60;
          goto _L4
        byte0 = 40;
          goto _L4
    }

    public final int b()
    {
        return c;
    }

    public eUtils(String s, String s1, int i, int j, int k)
    {
        d = s;
        e = s1;
        b = j;
        a = i;
        c = k;
    }
}
