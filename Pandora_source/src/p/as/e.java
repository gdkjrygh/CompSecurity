// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.as;

import android.util.Log;
import com.comscore.utils.k;
import com.comscore.utils.n;
import java.util.HashMap;
import p.aq.b;
import p.aw.a;

// Referenced classes of package p.as:
//            d

public class e
    implements Runnable
{

    protected final long a;
    protected long b;
    protected long c;
    private b d;
    private boolean e;
    private boolean f;

    public e(b b1, long l)
    {
        b = -1L;
        e = false;
        f = false;
        a = l;
        c = a;
        d = b1;
    }

    private long a(n n1)
    {
        long l1 = 0L;
        n1 = n1.b("lastMeasurementProcessedTimestamp");
        long l = l1;
        if (n1 != null)
        {
            l = l1;
            if (n1.length() > 0)
            {
                try
                {
                    l = Long.parseLong(n1);
                }
                // Misplaced declaration of an exception variable
                catch (n n1)
                {
                    return 0L;
                }
            }
        }
        return l;
    }

    public void a()
    {
        a(false);
    }

    public void a(int i)
    {
        if (d.aq())
        {
            e();
            e = true;
            Log.d("KeepAlive", (new StringBuilder()).append("start(").append(i).append(")").toString());
            if (d.R())
            {
                long l = System.currentTimeMillis();
                if (b < l)
                {
                    b = l + (long)i;
                }
                c();
                return;
            }
        }
    }

    public void a(long l)
    {
        if (d.aq())
        {
            e();
            Log.d("KeepAlive", (new StringBuilder()).append("reset:").append(l).toString());
            b = System.currentTimeMillis() + l;
            c = l;
            if (e)
            {
                a(0);
                return;
            }
        }
    }

    public void a(boolean flag)
    {
        if (d.aq() && d.R())
        {
            k k1 = d.p();
            long l = a(d.r());
            long l1 = System.currentTimeMillis() - l;
            Log.d("KeepAlive", (new StringBuilder()).append("processKeepAlive(").append(flag).append(") timeSinceLastTransmission=").append(System.currentTimeMillis() - l1).append(" currentTimeout=").append(c).toString());
            if (l != 0L && l1 > c - 1000L)
            {
                Log.d("KeepAlive", "Sending Keep-alive");
                if (!flag)
                {
                    d.a(d.f, new HashMap(), true);
                } else
                {
                    k1.a(d.f, null, true);
                }
                d.r().a("lastMeasurementProcessedTimestamp", String.valueOf(System.currentTimeMillis()));
                return;
            }
        }
    }

    public void b()
    {
        a(a);
    }

    protected void c()
    {
        if (!d.aq())
        {
            return;
        } else
        {
            d.s().a(this, b - System.currentTimeMillis(), true, a);
            f = true;
            return;
        }
    }

    public void d()
    {
        Log.d("KeepAlive", "stop");
        e = false;
        e();
        a(true);
    }

    public void e()
    {
        Log.d("KeepAlive", "cancel()");
        d.s().b(this);
        f = false;
    }

    public void run()
    {
        while (!d.aq() || !f) 
        {
            return;
        }
        Log.d("KeepAlive", "run()");
        a();
    }
}
