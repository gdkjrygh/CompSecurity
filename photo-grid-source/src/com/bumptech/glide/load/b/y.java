// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.b;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bumptech.glide.i.h;

// Referenced classes of package com.bumptech.glide.load.b:
//            z, x

final class y
{

    private boolean a;
    private final Handler b = new Handler(Looper.getMainLooper(), new z((byte)0));

    y()
    {
    }

    public final void a(x x1)
    {
        h.a();
        if (a)
        {
            b.obtainMessage(1, x1).sendToTarget();
            return;
        } else
        {
            a = true;
            x1.d();
            a = false;
            return;
        }
    }
}
