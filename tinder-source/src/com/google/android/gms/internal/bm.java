// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            cw

public final class bm
{

    final cw a;
    final boolean b;
    final String c;

    public bm(cw cw, Map map)
    {
        a = cw;
        c = (String)map.get("forceOrientation");
        if (map.containsKey("allowOrientationChange"))
        {
            b = Boolean.parseBoolean((String)map.get("allowOrientationChange"));
            return;
        } else
        {
            b = true;
            return;
        }
    }
}
