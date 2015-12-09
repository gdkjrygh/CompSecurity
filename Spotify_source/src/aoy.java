// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import com.facebook.Request;

final class aoy
{

    final long a = aph.g();
    long b;
    long c;
    long d;
    private final Request e;
    private final Handler f;

    aoy(Handler handler, Request request)
    {
        e = request;
        f = handler;
    }

    final void a()
    {
        if (b > c)
        {
            aoo aoo = e.d;
            if (d > 0L && (aoo instanceof aor))
            {
                if (f != null)
                {
                    f.post(new Runnable() {

                        public final void run()
                        {
                        }

                    });
                }
                c = b;
            }
        }
    }
}
