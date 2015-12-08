// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import com.facebook.Request;
import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class aom extends FilterOutputStream
    implements aox
{

    private final Map a;
    private final aou b;
    private final long c = aph.g();
    private long d;
    private long e;
    private long f;
    private aoy g;

    public aom(OutputStream outputstream, aou aou1, Map map, long l)
    {
        super(outputstream);
        b = aou1;
        a = map;
        f = l;
    }

    private void a()
    {
        if (d > e)
        {
            Iterator iterator = b.d.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                if ((aov)iterator.next() instanceof aow)
                {
                    Handler handler = b.a;
                    if (handler != null)
                    {
                        handler.post(new Runnable() {

                            public final void run()
                            {
                            }

                        });
                    }
                }
            } while (true);
            e = d;
        }
    }

    private void a(long l)
    {
        if (g != null)
        {
            aoy aoy1 = g;
            aoy1.b = aoy1.b + l;
            if (aoy1.b >= aoy1.c + aoy1.a || aoy1.b >= aoy1.d)
            {
                aoy1.a();
            }
        }
        d = d + l;
        if (d >= e + c || d >= f)
        {
            a();
        }
    }

    public final void a(Request request)
    {
        if (request != null)
        {
            request = (aoy)a.get(request);
        } else
        {
            request = null;
        }
        g = request;
    }

    public final void close()
    {
        super.close();
        for (Iterator iterator = a.values().iterator(); iterator.hasNext(); ((aoy)iterator.next()).a()) { }
        a();
    }

    public final void write(int i)
    {
        out.write(i);
        a(1L);
    }

    public final void write(byte abyte0[])
    {
        out.write(abyte0);
        a(abyte0.length);
    }

    public final void write(byte abyte0[], int i, int j)
    {
        out.write(abyte0, i, j);
        a(j);
    }
}
