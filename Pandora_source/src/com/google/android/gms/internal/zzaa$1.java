// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            zzaa, zzgd

class b
    implements Runnable
{

    final String a;
    final JSONObject b;
    final zzaa c;

    public void run()
    {
        zzaa.zza(c).zza(a, b);
    }

    (zzaa zzaa1, String s, JSONObject jsonobject)
    {
        c = zzaa1;
        a = s;
        b = jsonobject;
        super();
    }
}
