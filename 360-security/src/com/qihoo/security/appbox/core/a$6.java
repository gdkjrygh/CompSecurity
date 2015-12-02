// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.appbox.core;

import android.content.Context;
import android.text.TextUtils;
import com.qihoo.security.appbox.b.c;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.qihoo.security.appbox.core:
//            a, b

class e
    implements Runnable
{

    final Context a;
    final String b;
    final c c;
    final int d;
    final AtomicBoolean e;
    final a f;

    public void run()
    {
        oolean oolean = com.qihoo.security.appbox.core.b.a(a, b);
        boolean flag;
        if (System.currentTimeMillis() - oolean.c > 0x5265c00L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!TextUtils.isEmpty(oolean.a))
        {
            com.qihoo.security.appbox.core.a.a(f, a, b, oolean.a, c, oolean.c);
        }
        if (flag)
        {
            f.a(false, a, b, d, e, oolean.b, c);
        }
    }

    oolean(a a1, Context context, String s, c c1, int i, AtomicBoolean atomicboolean)
    {
        f = a1;
        a = context;
        b = s;
        c = c1;
        d = i;
        e = atomicboolean;
        super();
    }
}
