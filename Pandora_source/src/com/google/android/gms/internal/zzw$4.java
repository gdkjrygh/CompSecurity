// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            zzw, zzy

class a
    implements zd
{

    final JSONObject a;
    final zzw b;

    public void a(zzy zzy1)
    {
        zzy1.zza("AFMA_updateActiveView", a);
    }

    public void zza(Object obj)
    {
        a((zzy)obj);
    }

    zd(zzw zzw1, JSONObject jsonobject)
    {
        b = zzw1;
        a = jsonobject;
        super();
    }
}
