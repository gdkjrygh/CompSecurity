// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.util.LruCache;

// Referenced classes of package com.google.android.gms.tagmanager:
//            cj

class aa
    implements cj
{

    private LruCache a;

    aa(int i, zzm.zza zza)
    {
        a = new LruCache(i, zza) {

            final zzm.zza a;
            final aa b;

            protected int sizeOf(Object obj, Object obj1)
            {
                return a.sizeOf(obj, obj1);
            }

            
            {
                b = aa.this;
                a = zza;
                super(i);
            }
        };
    }

    public Object a(Object obj)
    {
        return a.get(obj);
    }

    public void a(Object obj, Object obj1)
    {
        a.put(obj, obj1);
    }
}
