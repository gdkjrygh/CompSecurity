// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cache;

import com.android.volley.k;
import com.android.volley.r;

// Referenced classes of package com.kik.cache:
//            z

public abstract class y extends z
{

    public y(Object obj, String s, com.android.volley.r.b b, int i, int j, android.graphics.Bitmap.Config config, com.android.volley.r.a a1)
    {
        super(obj, s, b, i, j, config, a1);
    }

    protected r a(k k)
    {
        k = super.a(k);
        if (k != null && ((r) (k)).b != null)
        {
            ((r) (k)).b.e = System.currentTimeMillis() + 0x41353000L;
            ((r) (k)).b.d = System.currentTimeMillis() + 0x41353000L;
        }
        return k;
    }
}
