// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.util.LruCache;

// Referenced classes of package com.google.android.gms.tagmanager:
//            k

class bb
    implements k
{

    private LruCache agc;

    bb(int i, l.a a)
    {
        agc = new LruCache(i, a) {

            final l.a agd;
            final bb age;

            protected int sizeOf(Object obj, Object obj1)
            {
                return agd.sizeOf(obj, obj1);
            }

            
            {
                age = bb.this;
                agd = a;
                super(i);
            }
        };
    }

    public void e(Object obj, Object obj1)
    {
        agc.put(obj, obj1);
    }

    public Object get(Object obj)
    {
        return agc.get(obj);
    }
}
