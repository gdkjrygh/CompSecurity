// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            c, qr, vq, vp

final class qu extends c
{

    final Map a;
    final qr b;

    qu(qr qr, String s, vq vq, vp vp, Map map)
    {
        b = qr;
        a = map;
        super(s, vq, vp, (byte)0);
    }

    public final Map a()
    {
        if (a == null)
        {
            return super.a();
        } else
        {
            return a;
        }
    }
}
