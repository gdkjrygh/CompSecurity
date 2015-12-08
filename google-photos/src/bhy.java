// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;

public class bhy extends ome
{

    private static final String d = bhy.getSimpleName();
    private boolean e;
    private boolean h;
    private HandlerThread i;
    private Handler j;
    private FutureTask k;
    private Executor l;
    private bnl m;
    private final Runnable n = new bhz(this);
    private final Runnable o = new bia(this);

    public bhy()
    {
        e = false;
        h = false;
    }

    static boolean a(bhy bhy1)
    {
        return bhy1.e;
    }

    static boolean a(bhy bhy1, boolean flag)
    {
        bhy1.h = true;
        return true;
    }

    static boolean b(bhy bhy1)
    {
        return bhy1.h;
    }

    static FutureTask c(bhy bhy1)
    {
        return bhy1.k;
    }

    static Runnable d(bhy bhy1)
    {
        return bhy1.n;
    }

    static String k()
    {
        return d;
    }

    public void a(Bundle bundle)
    {
        super.a(bundle);
        f.a("com.google.android.libraries.social.appid", 502);
        l = ((dfj)olm.a(this, dfj)).b();
        m = (bnl)olm.a(this, bnl);
    }

    public void f()
    {
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bundle = bpe.a(this).a;
        i = new HandlerThread(String.valueOf(getClass().getSimpleName()).concat("Wait"));
        i.start();
        j = new Handler(i.getLooper());
        k = new FutureTask(new bib(this, new blg[] {
            bundle.g(), m, bundle.e()
        }));
        l.execute(k);
    }

    public void onDestroy()
    {
        i.interrupt();
        i.quit();
        super.onDestroy();
    }

    public void onPause()
    {
        e = false;
        j.removeCallbacks(o);
        super.onPause();
    }

    public void onResume()
    {
        super.onResume();
        h = false;
        e = true;
        j.post(o);
    }

}
