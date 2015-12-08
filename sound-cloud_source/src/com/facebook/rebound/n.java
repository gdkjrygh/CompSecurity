// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.rebound;

import android.os.Handler;
import android.view.Choreographer;

// Referenced classes of package com.facebook.rebound:
//            e, a, i, m

public final class n extends e
{

    private n(i i, m m)
    {
        super(i, m);
    }

    public static n c()
    {
        a a1 = new a();
        Object obj;
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            obj = new b.a(Choreographer.getInstance());
        } else
        {
            obj = new b.b(new Handler());
        }
        return new n(a1, ((m) (obj)));
    }
}
