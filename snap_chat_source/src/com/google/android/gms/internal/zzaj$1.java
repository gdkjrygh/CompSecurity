// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            zzaj, zzic

class zznR
    implements Runnable
{

    final String zznQ;
    final JSONObject zznR;
    final zzaj zznS;

    public void run()
    {
        zzaj.zza(zznS).zza(zznQ, zznR);
    }

    (zzaj zzaj1, String s, JSONObject jsonobject)
    {
        zznS = zzaj1;
        zznQ = s;
        zznR = jsonobject;
        super();
    }
}
