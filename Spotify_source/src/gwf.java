// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.HandlerThread;

public final class gwf
{

    final gvd a;
    public final Handler b;
    long c;
    long d;
    long e;
    long f;
    long g;
    long h;
    long i;
    long j;
    int k;
    int l;
    int m;
    private HandlerThread n;

    public gwf(gvd gvd)
    {
        a = gvd;
        n = new HandlerThread("Picasso-Stats", 10);
        n.start();
        gwm.a(n.getLooper());
        b = new gwg(n.getLooper(), this);
    }

    public final void a()
    {
        b.sendEmptyMessage(0);
    }

    final void a(Bitmap bitmap, int i1)
    {
        int j1 = gwm.a(bitmap);
        b.sendMessage(b.obtainMessage(i1, j1, 0));
    }
}
