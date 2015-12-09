// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.a;

import android.content.Context;

// Referenced classes of package com.facebook.a:
//            a, q, h, i

final class e
    implements Runnable
{

    final Context a;
    final h b;
    final i c;

    e(Context context, h h, i i)
    {
        a = context;
        b = h;
        c = i;
        super();
    }

    public void run()
    {
        com.facebook.a.a.a(a, b).a(c);
        com.facebook.a.a.f();
    }
}
