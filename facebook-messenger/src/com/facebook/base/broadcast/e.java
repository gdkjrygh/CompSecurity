// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.base.broadcast;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import com.facebook.c.b;
import com.facebook.c.c;

// Referenced classes of package com.facebook.base.broadcast:
//            f, c

class e
    implements b
{

    private final b a;
    private final Handler b;

    private e(b b1, Handler handler)
    {
        a = b1;
        b = handler;
    }

    e(b b1, Handler handler, com.facebook.base.broadcast.c c)
    {
        this(b1, handler);
    }

    static b a(e e1)
    {
        return e1.a;
    }

    public void a(Context context, Intent intent, c c)
    {
        b.post(new f(this, context, intent, c));
    }
}
