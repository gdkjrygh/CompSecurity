// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.engine.prefill;

import android.os.Handler;
import android.os.Looper;
import com.bumptech.glide.load.engine.a.c;
import com.bumptech.glide.load.engine.b.h;

public final class a
{

    private final h a;
    private final c b;
    private final com.bumptech.glide.load.a c;
    private final Handler d = new Handler(Looper.getMainLooper());

    public a(h h, c c1, com.bumptech.glide.load.a a1)
    {
        a = h;
        b = c1;
        c = a1;
    }
}
