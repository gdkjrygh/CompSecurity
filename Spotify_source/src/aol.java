// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import com.facebook.Request;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

public final class aol extends OutputStream
    implements aox
{

    public final Map a = new HashMap();
    public int b;
    private final Handler c;
    private Request d;
    private aoy e;

    public aol(Handler handler)
    {
        c = handler;
    }

    final void a(long l)
    {
        if (e == null)
        {
            e = new aoy(c, d);
            a.put(d, e);
        }
        aoy aoy1 = e;
        aoy1.d = aoy1.d + l;
        b = (int)((long)b + l);
    }

    public final void a(Request request)
    {
        d = request;
        if (request != null)
        {
            request = (aoy)a.get(request);
        } else
        {
            request = null;
        }
        e = request;
    }

    public final void write(int i)
    {
        a(1L);
    }

    public final void write(byte abyte0[])
    {
        a(abyte0.length);
    }

    public final void write(byte abyte0[], int i, int j)
    {
        a(j);
    }
}
