// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tune.crosspromo;

import android.content.Context;
import com.mobileapptracker.MATParameters;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;

// Referenced classes of package com.tune.crosspromo:
//            TuneAdViewSet, TuneAdView

public class TuneAdUtils
{

    private static TuneAdUtils b;
    protected boolean a;
    private Context c;
    private Context d;
    private ExecutorService e;
    private ExecutorService f;
    private MATParameters g;
    private HashMap h;

    public TuneAdUtils()
    {
        a = false;
    }

    public static TuneAdUtils a()
    {
        if (b == null)
        {
            b = new TuneAdUtils();
        }
        return b;
    }

    protected TuneAdViewSet a(String s)
    {
        return (TuneAdViewSet)h.get(s);
    }

    protected void a(Context context)
    {
        d = context;
    }

    protected void a(TuneAdViewSet tuneadviewset)
    {
        if (!b(tuneadviewset.a))
        {
            h.put(tuneadviewset.a, tuneadviewset);
        }
    }

    protected Context b()
    {
        return d;
    }

    protected boolean b(String s)
    {
        return h.containsKey(s);
    }

    protected Context c()
    {
        return c;
    }

    protected void c(String s)
    {
        a(s).a();
    }

    protected TuneAdView d(String s)
    {
        return a(s).b();
    }

    protected ExecutorService d()
    {
        return e;
    }

    protected TuneAdView e(String s)
    {
        return a(s).c();
    }

    protected ExecutorService e()
    {
        return f;
    }

    protected MATParameters f()
    {
        return g;
    }
}
