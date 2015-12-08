// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.picasso;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;

// Referenced classes of package com.squareup.picasso:
//            ab, d, Picasso

final class v
{
    private static final class a extends Handler
    {

        private final v a;

        public final void handleMessage(Message message)
        {
            v v3;
            switch (message.what)
            {
            default:
                Picasso.a.post(new Runnable(this, message) {

                    final Message a;
                    final a b;

                    public final void run()
                    {
                        throw new AssertionError((new StringBuilder("Unhandled stats message.")).append(a.what).toString());
                    }

            
            {
                b = a1;
                a = message;
                super();
            }
                });
                return;

            case 0: // '\0'
                message = a;
                message.d = ((v) (message)).d + 1L;
                return;

            case 1: // '\001'
                message = a;
                message.e = ((v) (message)).e + 1L;
                return;

            case 2: // '\002'
                v v1 = a;
                long l1 = message.arg1;
                v1.m = v1.m + 1;
                v1.g = l1 + v1.g;
                int i1 = v1.m;
                v1.j = v1.g / (long)i1;
                return;

            case 3: // '\003'
                v v2 = a;
                long l2 = message.arg1;
                v2.n = v2.n + 1;
                v2.h = l2 + v2.h;
                int j1 = v2.m;
                v2.k = v2.h / (long)j1;
                return;

            case 4: // '\004'
                v3 = a;
                break;
            }
            message = (Long)message.obj;
            v3.l = v3.l + 1;
            v3.f = v3.f + message.longValue();
            int k1 = v3.l;
            v3.i = v3.f / (long)k1;
        }

        public a(Looper looper, v v1)
        {
            super(looper);
            a = v1;
        }
    }


    final HandlerThread a = new HandlerThread("Picasso-Stats", 10);
    final d b;
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

    v(d d1)
    {
        b = d1;
        a.start();
        ab.a(a.getLooper());
        c = new a(a.getLooper(), this);
    }

    final void a()
    {
        c.sendEmptyMessage(0);
    }

    final void a(Bitmap bitmap, int i1)
    {
        int j1 = ab.a(bitmap);
        c.sendMessage(c.obtainMessage(i1, j1, 0));
    }
}
