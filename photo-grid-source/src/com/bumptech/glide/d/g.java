// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.d;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.bumptech.glide.d:
//            f, d

final class g extends BroadcastReceiver
{

    final f a;

    g(f f1)
    {
        a = f1;
        super();
    }

    public final void onReceive(Context context, Intent intent)
    {
        boolean flag = f.a(a);
        f.a(a, f.a(context));
        if (flag != f.a(a))
        {
            f.b(a).a(f.a(a));
        }
    }
}
