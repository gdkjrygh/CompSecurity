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

    private LruCache Yu;

    bb(int i, l.a a)
    {
        Yu = new LruCache(i, a) {

            final l.a Yv;
            final bb Yw;

            protected int sizeOf(Object obj, Object obj1)
            {
                return Yv.sizeOf(obj, obj1);
            }

            
            {
                Yw = bb.this;
                Yv = a;
                super(i);
            }
        };
    }

    public void e(Object obj, Object obj1)
    {
        Yu.put(obj, obj1);
    }

    public Object get(Object obj)
    {
        return Yu.get(obj);
    }
}
