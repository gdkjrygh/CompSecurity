// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.b;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.HandlerThread;

// Referenced classes of package com.c.b:
//            bj, bd, k

final class bc
{

    final HandlerThread a = new HandlerThread("Picasso-Stats", 10);
    final k b;
    final Handler c;
    long d;
    long e;
    long f;
    long g;
    long h;
    long i;
    long j;
    long k;
    int l;
    int m;
    int n;

    bc(k k1)
    {
        b = k1;
        a.start();
        bj.a(a.getLooper());
        c = new bd(a.getLooper(), this);
    }

    private void a(Bitmap bitmap, int i1)
    {
        int j1 = bj.a(bitmap);
        c.sendMessage(c.obtainMessage(i1, j1, 0));
    }

    final void a()
    {
        c.sendEmptyMessage(0);
    }

    final void a(Bitmap bitmap)
    {
        a(bitmap, 2);
    }

    final void b(Bitmap bitmap)
    {
        a(bitmap, 3);
    }
}
