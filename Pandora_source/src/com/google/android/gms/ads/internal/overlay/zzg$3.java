// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.overlay;

import java.util.HashMap;

// Referenced classes of package com.google.android.gms.ads.internal.overlay:
//            zzg

class c extends HashMap
{

    final float a;
    final int b;
    final int c;
    final zzg d;

    (zzg zzg1, float f, int i, int j)
    {
        d = zzg1;
        a = f;
        b = i;
        c = j;
        super();
        put("duration", String.valueOf(a));
        put("videoWidth", String.valueOf(b));
        put("videoHeight", String.valueOf(c));
    }
}
