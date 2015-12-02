// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.push;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import com.facebook.base.a.g;
import com.facebook.c.b;
import com.facebook.c.c;
import com.facebook.inject.t;

// Referenced classes of package com.facebook.push:
//            PushInitializer, e

class d
    implements b
{

    private PushInitializer a;

    d()
    {
    }

    static PushInitializer a(d d1)
    {
        return d1.a;
    }

    public void a(Context context, Intent intent, c c)
    {
        g.a(context);
        a = (PushInitializer)t.a(context).a(com/facebook/push/PushInitializer);
        PushInitializer.a(a, false);
        com.facebook.push.PushInitializer.b(a).post(new e(this));
    }
}
