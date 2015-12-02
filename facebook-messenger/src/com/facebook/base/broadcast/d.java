// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.base.broadcast;

import android.content.IntentFilter;
import android.os.Handler;
import com.facebook.c.b;
import com.google.common.a.ik;
import java.util.Map;

// Referenced classes of package com.facebook.base.broadcast:
//            k, g, b, l

public class d
    implements k
{

    final com.facebook.base.broadcast.b a;
    private final Map b = ik.a();
    private IntentFilter c;
    private Handler d;

    protected d(com.facebook.base.broadcast.b b1)
    {
        a = b1;
        super();
    }

    public k a(Handler handler)
    {
        d = handler;
        return this;
    }

    public k a(String s, b b1)
    {
        b.put(s, b1);
        return this;
    }

    public l a()
    {
        return new g(a, b, c, d);
    }
}
