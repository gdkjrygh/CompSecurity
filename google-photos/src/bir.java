// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;
import android.net.Uri;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

final class bir
    implements bii
{

    private final CountDownLatch a = new CountDownLatch(1);
    private final AtomicReference b = new AtomicReference();
    private final AtomicReference c = new AtomicReference();
    private final AtomicBoolean d = new AtomicBoolean();
    private final Uri e;
    private final biv f;

    bir(bip bip, Uri uri, biv biv1)
    {
        e = uri;
        f = biv1;
    }

    public final cmf a()
    {
        c.a(b.get(), "mMetrics", null);
        return (cmf)b.get();
    }

    public final void a(Bitmap bitmap)
    {
        if (f != null)
        {
            f.a(bitmap);
        }
    }

    public final void a(Uri uri, long l)
    {
        if (f != null)
        {
            f.a(l);
        }
    }

    public final void a(Uri uri, bim bim, cmf cmf1)
    {
        b.set(cmf1);
        a.countDown();
    }

    public final void a(Uri uri, bim bim, Exception exception)
    {
        c.set(exception);
        a.countDown();
    }

    public final void a(Uri uri, cmf cmf1)
    {
        if (f != null)
        {
            f.a(e, cmf1);
        }
    }

    public final void b(Uri uri, bim bim, cmf cmf1)
    {
        b.set(cmf1);
        d.set(true);
        a.countDown();
    }

    public final boolean b()
    {
        c.a(b.get(), "mMetrics", null);
        return d.get();
    }

    public final void c()
    {
        try
        {
            a.await();
        }
        catch (InterruptedException interruptedexception)
        {
            Thread.currentThread().interrupt();
            throw new ExecutionException(interruptedexception);
        }
        if (b.get() == null)
        {
            throw new ExecutionException((Throwable)c.get());
        } else
        {
            return;
        }
    }
}
