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

    private LruCache afZ;

    bb(int i, l.a a)
    {
        afZ = new LruCache(i, a) {

            final l.a aga;
            final bb agb;

            protected int sizeOf(Object obj, Object obj1)
            {
                return aga.sizeOf(obj, obj1);
            }

            
            {
                agb = bb.this;
                aga = a;
                super(i);
            }
        };
    }

    public void e(Object obj, Object obj1)
    {
        afZ.put(obj, obj1);
    }

    public Object get(Object obj)
    {
        return afZ.get(obj);
    }
}
