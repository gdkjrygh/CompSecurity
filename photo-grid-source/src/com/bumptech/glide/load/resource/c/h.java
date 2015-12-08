// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.resource.c;

import android.graphics.Bitmap;
import android.os.Handler;
import com.bumptech.glide.g.a.d;
import com.bumptech.glide.g.b.g;

final class h extends g
{

    private final Handler a;
    private final int b;
    private final long c;
    private Bitmap d;

    public h(Handler handler, int i, long l)
    {
        a = handler;
        b = i;
        c = l;
    }

    static int a(h h1)
    {
        return h1.b;
    }

    public final Bitmap a()
    {
        return d;
    }

    public final void a(Object obj, d d1)
    {
        d = (Bitmap)obj;
        obj = a.obtainMessage(1, this);
        a.sendMessageAtTime(((android.os.Message) (obj)), c);
    }
}
