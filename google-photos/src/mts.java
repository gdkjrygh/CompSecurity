// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import com.google.android.libraries.social.async.BackgroundTaskService;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public final class mts
    implements mtg, mth
{

    private static final ThreadFactory f;
    private static final Executor g;
    private final Context a;
    private final Intent b;
    private mty c;
    private mtf d;
    private final Runnable e = new mtt(this);

    mts(Context context)
    {
        a = context.getApplicationContext();
        b = new Intent(a, com/google/android/libraries/social/async/BackgroundTaskService);
        d = new mtx();
    }

    static mty a(mts mts1)
    {
        return mts1.c;
    }

    static mtf b(mts mts1)
    {
        return mts1.d;
    }

    static Context c(mts mts1)
    {
        return mts1.a;
    }

    static Intent d(mts mts1)
    {
        return mts1.b;
    }

    static Runnable e(mts mts1)
    {
        return mts1.e;
    }

    public final void a()
    {
        if (c == null)
        {
            c = (mty)olm.a(a, mty);
        }
        do
        {
            mtf mtf1 = (mtf)c.d.poll();
            if (mtf1 != null)
            {
                mtf1.e = this;
                Executor executor;
                if (mtf1.c() != null)
                {
                    executor = mtf1.c();
                } else
                {
                    executor = g;
                }
                executor.execute(puv.a(new mtv(this, mtf1)));
            } else
            {
                a.startService(b);
                return;
            }
        } while (true);
    }

    public final void a(mtf mtf1, mue mue)
    {
        c.e.post(puv.a(new mtw(this, mtf1, mue)));
    }

    static 
    {
        mtu mtu1 = new mtu();
        f = mtu1;
        g = Executors.newCachedThreadPool(mtu1);
    }
}
