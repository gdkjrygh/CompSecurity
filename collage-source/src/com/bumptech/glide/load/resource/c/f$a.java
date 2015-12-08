// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.resource.c;

import android.graphics.Bitmap;
import android.os.Handler;
import com.bumptech.glide.request.a.c;
import com.bumptech.glide.request.b.g;

// Referenced classes of package com.bumptech.glide.load.resource.c:
//            f

static class c extends g
{

    private final Handler a;
    private final int b;
    private final long c;
    private Bitmap d;

    static int a(c c1)
    {
        return c1.b;
    }

    public void a(Bitmap bitmap, c c1)
    {
        d = bitmap;
        bitmap = a.obtainMessage(1, this);
        a.sendMessageAtTime(bitmap, c);
    }

    public volatile void a(Object obj, c c1)
    {
        a((Bitmap)obj, c1);
    }

    public Bitmap d_()
    {
        return d;
    }

    public (Handler handler, int i, long l)
    {
        a = handler;
        b = i;
        c = l;
    }
}
