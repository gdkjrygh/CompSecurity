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

    private LruCache apI;

    bb(int i, l.a a)
    {
        apI = new LruCache(i, a) {

            final l.a apJ;
            final bb apK;

            protected int sizeOf(Object obj, Object obj1)
            {
                return apJ.sizeOf(obj, obj1);
            }

            
            {
                apK = bb.this;
                apJ = a;
                super(i);
            }
        };
    }

    public void e(Object obj, Object obj1)
    {
        apI.put(obj, obj1);
    }

    public Object get(Object obj)
    {
        return apI.get(obj);
    }
}
