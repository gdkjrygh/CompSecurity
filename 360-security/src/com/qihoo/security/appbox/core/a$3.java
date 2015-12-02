// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.appbox.core;

import android.content.Context;
import android.text.TextUtils;
import com.qihoo.security.appbox.b.c;

// Referenced classes of package com.qihoo.security.appbox.core:
//            a, b

class b
    implements Runnable
{

    final Context a;
    final c b;
    final a c;

    public void run()
    {
        b b1 = com.qihoo.security.appbox.core.b.a(a, "0");
        boolean flag;
        if (System.currentTimeMillis() - b1.c > 0x5265c00L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!TextUtils.isEmpty(b1.a))
        {
            com.qihoo.security.appbox.core.a.a(c, a, "0", b1.a, b, b1.c);
        }
        if (flag)
        {
            c.a(a, "appbox", b);
        }
    }

    (a a1, Context context, c c1)
    {
        c = a1;
        a = context;
        b = c1;
        super();
    }
}
