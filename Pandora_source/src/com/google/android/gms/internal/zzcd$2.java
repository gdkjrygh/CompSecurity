// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zzcd, zzgd

class c
    implements Runnable
{

    final String a;
    final File b;
    final int c;
    final zzcd d;

    public void run()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("event", "precacheComplete");
        hashmap.put("src", a);
        hashmap.put("cachedSrc", b.getAbsolutePath());
        hashmap.put("totalBytes", Integer.toString(c));
        zzcd.zza(d).zzb("onPrecacheEvent", hashmap);
    }

    (zzcd zzcd1, String s, File file, int i)
    {
        d = zzcd1;
        a = s;
        b = file;
        c = i;
        super();
    }
}
