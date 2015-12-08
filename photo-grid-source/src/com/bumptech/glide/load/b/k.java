// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.b;

import com.bumptech.glide.load.c;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

// Referenced classes of package com.bumptech.glide.load.b:
//            r

final class k extends WeakReference
{

    private final c a;

    public k(c c, r r, ReferenceQueue referencequeue)
    {
        super(r, referencequeue);
        a = c;
    }

    static c a(k k1)
    {
        return k1.a;
    }
}
