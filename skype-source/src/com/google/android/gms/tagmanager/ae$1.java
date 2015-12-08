// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.util.LruCache;

// Referenced classes of package com.google.android.gms.tagmanager:
//            ae

final class a extends LruCache
{

    final a a;
    final ae b;

    protected final int sizeOf(Object obj, Object obj1)
    {
        return a.a(obj, obj1);
    }

    (ae ae1,  )
    {
        b = ae1;
        a = ;
        super(0x100000);
    }
}
