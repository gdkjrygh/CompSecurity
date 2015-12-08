// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.d;

import java.util.Map;

// Referenced classes of package com.tremorvideo.sdk.android.d:
//            e, v, o

class g extends e
{

    g(Map map, v v1)
    {
        super(map, v1);
    }

    void a()
    {
        int j = a("w");
        int k = a("h");
        String s = b("url");
        boolean flag = c("shouldUseCustomClose");
        boolean flag1 = c("lockOrientation");
        int i = j;
        if (j <= 0)
        {
            i = b.i().c;
        }
        j = k;
        if (k <= 0)
        {
            j = b.i().d;
        }
        b.i().a(s, i, j, flag, flag1);
    }
}
