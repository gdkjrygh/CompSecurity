// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.base.broadcast;

import android.content.Context;
import android.content.Intent;
import com.facebook.c.b;
import com.facebook.c.c;

// Referenced classes of package com.facebook.base.broadcast:
//            e

class f
    implements Runnable
{

    final Context a;
    final Intent b;
    final c c;
    final e d;

    f(e e1, Context context, Intent intent, c c1)
    {
        d = e1;
        a = context;
        b = intent;
        c = c1;
        super();
    }

    public void run()
    {
        e.a(d).a(a, b, c);
    }
}
