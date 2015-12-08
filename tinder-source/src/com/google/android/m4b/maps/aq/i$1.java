// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aq;

import com.google.android.m4b.maps.ay.t;
import com.google.android.m4b.maps.ay.v;

// Referenced classes of package com.google.android.m4b.maps.aq:
//            i

final class a
    implements Runnable
{

    private t a;
    private i b;

    public final void run()
    {
        v av[] = i.b(b);
        int k = av.length;
        for (int j = 0; j < k; j++)
        {
            av[j].a(a);
        }

    }

    (i j, t t)
    {
        b = j;
        a = t;
        super();
    }
}
