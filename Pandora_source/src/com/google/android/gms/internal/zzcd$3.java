// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zzcd, zzgd

class b
    implements Runnable
{

    final String a;
    final File b;
    final zzcd c;

    public void run()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("event", "precacheCanceled");
        hashmap.put("src", a);
        if (b != null)
        {
            hashmap.put("cachedSrc", b.getAbsolutePath());
        }
        zzcd.zza(c).zzb("onPrecacheEvent", hashmap);
    }

    (zzcd zzcd1, String s, File file)
    {
        c = zzcd1;
        a = s;
        b = file;
        super();
    }
}
