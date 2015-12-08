// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;

public class ckl
    implements cje, cjf, ded
{

    public static final String a = ckl.getSimpleName();
    public final Context b;
    public final List c = new ArrayList();
    public final List d = new ArrayList();
    public final List e = new ArrayList();
    public long f;
    public Bitmap g;
    public Uri h;
    public final noj i;
    public final int j;
    private final chq k;
    private final Executor l;
    private ciy m;
    private FutureTask n;
    private int o;
    private boolean p;
    private final cko q;
    private final Callable r = new ckm(this);

    public ckl(chq chq1, Context context, Executor executor, cko cko1, noj noj1, int i1)
    {
        k = (chq)b.a(chq1, "renderContext", null);
        b = (Context)b.a(context, "context", null);
        l = (Executor)b.a(executor, "singleThreadedExecutor", null);
        q = (cko)b.a(cko1, "bitmapFactory", null);
        i = (noj)b.a(noj1, "movieMakerProvider", null);
        j = i1;
    }

    static int a(ckl ckl1)
    {
        return ckl1.o;
    }

    static Bitmap a(ckl ckl1, Bitmap bitmap)
    {
        ckl1.g = bitmap;
        return bitmap;
    }

    static Bitmap a(ckl ckl1, ParcelFileDescriptor parcelfiledescriptor)
    {
        return ckl1.a(parcelfiledescriptor);
    }

    static Uri a(ckl ckl1, Uri uri)
    {
        ckl1.h = uri;
        return uri;
    }

    static List b(ckl ckl1)
    {
        return ckl1.c;
    }

    static String c()
    {
        return a;
    }

    static List c(ckl ckl1)
    {
        return ckl1.e;
    }

    static Uri d(ckl ckl1)
    {
        return ckl1.h;
    }

    private ciy d()
    {
        if (!p)
        {
            if (n == null)
            {
                if (o < c.size())
                {
                    n = new FutureTask(r);
                    l.execute(n);
                }
                return null;
            }
            if (!n.isDone())
            {
                return null;
            }
            Object obj;
            try
            {
                obj = (Bitmap)n.get();
            }
            catch (InterruptedException interruptedexception)
            {
                Log.w(a, "Bitmap decoding task was interrupted.", interruptedexception);
                return null;
            }
            catch (ExecutionException executionexception)
            {
                Log.w(a, "Bitmap decoding task encountered an exception.", executionexception);
                return null;
            }
            dee.a(m);
            if (obj != null)
            {
                m = new ciy(k.a(((Bitmap) (obj)), 1));
                csc.b(m.d);
            } else
            {
                m = new ciy(k.c());
                csc.b(m.d);
            }
            p = true;
            n = null;
        }
        m.a = f;
        f = f + 33000L;
        if (f >= ((cnq)c.get(o)).f.c)
        {
            m.b = true;
            p = false;
            o = o + 1;
            if (o < c.size())
            {
                f = ((cnq)c.get(o)).f.b;
            }
        } else
        {
            m.b = false;
        }
        obj = m;
        obj.e = ((ciy) (obj)).e + 1;
        return m;
    }

    static Bitmap e(ckl ckl1)
    {
        return ckl1.g;
    }

    public Bitmap a(ParcelFileDescriptor parcelfiledescriptor)
    {
        boolean flag2 = true;
        if (g == null)
        {
            g = Bitmap.createBitmap(1920, 1920, android.graphics.Bitmap.Config.ARGB_8888);
        }
        cko cko1 = q;
        Object obj = parcelfiledescriptor.getFileDescriptor();
        parcelfiledescriptor = g;
        obj = new ckp(((java.io.FileDescriptor) (obj)));
        android.graphics.BitmapFactory.Options options = cko.a(((ckp) (obj)));
        options.inMutable = true;
        cko1.a(options, 0xe1000);
        boolean flag;
        boolean flag1;
        if (parcelfiledescriptor != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        flag1 = flag;
        if (!b.g())
        {
            if (options.inSampleSize == 1 && parcelfiledescriptor != null && parcelfiledescriptor.getWidth() == options.outWidth && parcelfiledescriptor.getHeight() == options.outHeight)
            {
                flag1 = flag2;
            } else
            {
                flag1 = false;
            }
            flag1 = flag & flag1;
        }
        if (flag1)
        {
            options.inBitmap = parcelfiledescriptor;
        }
        return cko.a(((ckp) (obj)), options);
    }

    public final void a()
    {
        if (m != null)
        {
            m.e = 0;
            dee.a(m);
            m = null;
        }
        if (g != null)
        {
            g.recycle();
            g = null;
        }
        for (Iterator iterator = e.iterator(); iterator.hasNext(); b.a((ParcelFileDescriptor)iterator.next())) { }
        e.clear();
        c.clear();
        d.clear();
    }

    public final void a(Object obj)
    {
        dee.a((ciy)obj);
    }

    public final boolean a(long l1)
    {
        b.b(l1, "timestampUs");
        p = false;
        if (n != null)
        {
            n.cancel(true);
        }
        n = null;
        for (o = 0; o < c.size(); o = o + 1)
        {
            cnq cnq1 = (cnq)c.get(o);
            long l2 = l1 - ((Long)d.get(o)).longValue();
            if (l2 < cnq1.f.a())
            {
                l1 = Math.max(0L, l2);
                f = cnq1.f.b + l1;
                return true;
            }
        }

        return false;
    }

    public final Object b()
    {
        return d();
    }

}
