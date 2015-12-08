// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.util.LruCache;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzk

class zzaz
    implements zzk
{

    private LruCache zzazc;

    zzaz(int i, zzl.zza zza)
    {
        zzazc = new LruCache(i, zza) {

            final zzl.zza zzazd;
            final zzaz zzaze;

            protected int sizeOf(Object obj, Object obj1)
            {
                return zzazd.sizeOf(obj, obj1);
            }

            
            {
                zzaze = zzaz.this;
                zzazd = zza;
                super(i);
            }
        };
    }

    public Object get(Object obj)
    {
        return zzazc.get(obj);
    }

    public void zze(Object obj, Object obj1)
    {
        zzazc.put(obj, obj1);
    }
}
