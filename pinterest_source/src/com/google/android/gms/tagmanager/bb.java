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

    private LruCache arR;

    bb(int i, l.a a)
    {
        arR = new _cls1(i, a);
    }

    public void e(Object obj, Object obj1)
    {
        arR.put(obj, obj1);
    }

    public Object get(Object obj)
    {
        return arR.get(obj);
    }

    private class _cls1 extends LruCache
    {

        final l.a arS;
        final bb arT;

        protected int sizeOf(Object obj, Object obj1)
        {
            return arS.sizeOf(obj, obj1);
        }

        _cls1(int i, l.a a)
        {
            arT = bb.this;
            arS = a;
            super(i);
        }
    }

}
