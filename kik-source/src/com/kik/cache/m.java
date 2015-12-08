// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cache;

import android.graphics.Bitmap;
import com.kik.g.as;
import kik.android.util.r;

// Referenced classes of package com.kik.cache:
//            k

final class m
    implements as
{

    final int a;
    final k b;

    m(k k, int i)
    {
        b = k;
        a = i;
        super();
    }

    public final volatile Object a(Object obj)
    {
        return r.a((Bitmap)obj, a);
    }
}
