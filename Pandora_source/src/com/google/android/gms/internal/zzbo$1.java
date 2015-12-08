// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zzbo, zzgd

class b
    implements Runnable
{

    final zzgd a;
    final Map b;
    final zzbo c;

    public void run()
    {
        c.zza(a, b);
    }

    (zzbo zzbo1, zzgd zzgd, Map map)
    {
        c = zzbo1;
        a = zzgd;
        b = map;
        super();
    }
}
