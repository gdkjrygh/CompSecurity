// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import android.graphics.Color;

// Referenced classes of package com.taplytics:
//            gc, turkey

public final class gb
{

    public static int a(turkey turkey1)
    {
        gc.a[turkey1.ordinal()];
        JVM INSTR tableswitch 2 5: default 40
    //                   2 48
    //                   3 48
    //                   4 54
    //                   5 60;
           goto _L1 _L2 _L2 _L3 _L4
_L1:
        turkey1 = "#CC70daff";
_L6:
        return Color.parseColor(turkey1);
_L2:
        turkey1 = "#CC7fe1a5";
        continue; /* Loop/switch isn't completed */
_L3:
        turkey1 = "#CCba76e5";
        continue; /* Loop/switch isn't completed */
_L4:
        turkey1 = "#CCcc3341";
        if (true) goto _L6; else goto _L5
_L5:
    }
}
