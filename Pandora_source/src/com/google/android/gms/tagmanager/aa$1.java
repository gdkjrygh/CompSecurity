// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.util.LruCache;

// Referenced classes of package com.google.android.gms.tagmanager:
//            aa

class a extends LruCache
{

    final za a;
    final aa b;

    protected int sizeOf(Object obj, Object obj1)
    {
        return a.sizeOf(obj, obj1);
    }

    za(aa aa1, int i, za za)
    {
        b = aa1;
        a = za;
        super(i);
    }
}
