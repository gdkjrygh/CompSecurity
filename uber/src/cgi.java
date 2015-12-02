// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.List;
import java.util.concurrent.ExecutorService;

public final class cgi
{

    private final Context a;
    private cfs b;
    private ExecutorService c;
    private cfi d;
    private cgk e;
    private cgn f;
    private List g;
    private android.graphics.Bitmap.Config h;
    private boolean i;
    private boolean j;

    public cgi(Context context)
    {
        if (context == null)
        {
            throw new IllegalArgumentException("Context must not be null.");
        } else
        {
            a = context.getApplicationContext();
            return;
        }
    }

    public final cgh a()
    {
        Context context = a;
        if (b == null)
        {
            b = chf.a(context);
        }
        if (d == null)
        {
            d = new cfy(context);
        }
        if (c == null)
        {
            c = new cgp();
        }
        if (f == null)
        {
            f = cgn.a;
        }
        cgx cgx1 = new cgx(d);
        return new cgh(context, new cfo(context, c, cgh.a, b, d, cgx1), d, e, f, g, cgx1, h, i, j);
    }

    public final cgi a(cfs cfs)
    {
        if (b != null)
        {
            throw new IllegalStateException("Downloader already set.");
        } else
        {
            b = cfs;
            return this;
        }
    }

    public final cgi a(ExecutorService executorservice)
    {
        if (executorservice == null)
        {
            throw new IllegalArgumentException("Executor service must not be null.");
        }
        if (c != null)
        {
            throw new IllegalStateException("Executor service already set.");
        } else
        {
            c = executorservice;
            return this;
        }
    }
}
