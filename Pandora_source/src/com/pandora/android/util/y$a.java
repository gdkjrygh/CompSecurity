// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.util;

import android.hardware.SensorEvent;

// Referenced classes of package com.pandora.android.util:
//            y

private static class b
{

    public final long a = System.currentTimeMillis();
    public final boolean b;

    public (SensorEvent sensorevent)
    {
        boolean flag = true;
        super();
        float f = sensorevent.values[0];
        float f1 = sensorevent.values[1];
        float f2 = sensorevent.values[2];
        if (Math.sqrt(f * f + f1 * f1 + f2 * f2) < 13D)
        {
            flag = false;
        }
        b = flag;
    }
}
