// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.b;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import com.nuance.dragon.toolkit.a.a;
import com.nuance.dragon.toolkit.a.aa;
import com.nuance.dragon.toolkit.a.ae;
import com.nuance.dragon.toolkit.a.al;
import com.nuance.dragon.toolkit.a.am;
import com.nuance.dragon.toolkit.a.b;
import com.nuance.dragon.toolkit.a.n;
import com.nuance.dragon.toolkit.a.s;
import com.nuance.dragon.toolkit.a.x;
import com.nuance.dragon.toolkit.audio.e;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.nuance.b.b:
//            ax, es, bm, fr, 
//            gi, v, az, gl, 
//            gj, gk, s

final class gh
{

    public static long a = 500L;
    private static volatile Handler b;
    private static volatile Handler c;
    private final CountDownLatch d = new CountDownLatch(1);
    private s e;
    private ax f;

    public gh()
    {
        f = new ax();
    }

    public static es a(Resources resources)
    {
        if (c == null)
        {
            c = com.nuance.b.b.ax.b("Prompt player NMT Thread");
        }
        return new es(resources, c);
    }

    static s a(gh gh1, s s1)
    {
        gh1.e = s1;
        return s1;
    }

    static CountDownLatch a(gh gh1)
    {
        return gh1.d;
    }

    public static Handler d()
    {
        if (b == null)
        {
            b = com.nuance.b.b.ax.b("NMT_THREAD");
        }
        return b;
    }

    public final bm a(com.nuance.b.c.b b1, e e1, int i, int j, boolean flag, com.nuance.b.b.s s1)
    {
        return new bm(this, b1, e1, i, j, flag, s1);
    }

    public final void a(x x)
    {
        com.nuance.b.b.fr.e("Adding Transaction from within Looper thread");
        try
        {
            e.a(x, 5);
            return;
        }
        catch (RuntimeException runtimeexception)
        {
            com.nuance.b.b.fr.a((new StringBuilder("Exception adding NMT transaction: ")).append(x.toString()).toString());
            com.nuance.b.b.fr.a(runtimeexception.getStackTrace());
            return;
        }
    }

    public final transient void a(String s1, com.nuance.dragon.toolkit.b.e e1, aa aa, al aal[])
    {
        com.nuance.b.b.fr.e("About to add Transaction to CloudServices");
        d().post(new gi(this, s1, e1, aa, aal));
    }

    public final boolean a()
    {
        Object obj1 = v.r();
        az az1 = ((v) (obj1)).j();
        Object obj = az1.a();
        byte abyte0[] = az1.b();
        String s1 = InetAddress.getByName(az1.c()).getCanonicalHostName();
        int i = az1.d();
        ArrayList arraylist = new ArrayList();
        if (az1.e())
        {
            com.nuance.b.b.fr.e("NMSP_DEFINES_SSL_SOCKET TRUE");
            Object obj2;
            e e1;
            int j;
            if (!az1.g())
            {
                com.nuance.b.b.fr.e("NMSP_DEFINES_SSL_SELFSIGNED_CERT TRUE");
                arraylist.add(new ae(true));
            } else
            {
                arraylist.add(new ae(false));
            }
        }
        obj2 = UUID.randomUUID().toString();
        arraylist.add(new am(((String) (obj2))));
        com.nuance.b.b.fr.e((new StringBuilder("Calllog rood id: ")).append(((String) (obj2))).toString());
        if (az1.p())
        {
            arraylist.add(new a(((v) (obj1)).c.getApplicationContext(), b.b));
        }
        com.nuance.b.b.fr.e((new StringBuilder("nmsp manager host ")).append(s1).toString());
        com.nuance.b.b.fr.e((new StringBuilder("nmsp manager port ")).append(i).toString());
        obj2 = az1.v();
        e1 = az1.w();
        obj1 = new n(az1.u(), s1, i, arraylist, ((String) (obj)), abyte0, ((v) (obj1)).l(), ((e) (obj2)), e1);
        if (com.nuance.b.b.gl.a())
        {
            com.nuance.b.b.fr.e((new StringBuilder("applicationID ")).append(((String) (obj))).toString());
            obj = new StringBuilder();
            j = abyte0.length;
            for (i = 0; i < j; i++)
            {
                ((StringBuilder) (obj)).append((new StringBuilder()).append(abyte0[i] & 0xff).append(" ").toString());
            }

            com.nuance.b.b.fr.e((new StringBuilder("applicationKey ")).append(((StringBuilder) (obj)).toString()).toString());
        }
        d().post(new gj(this, ((n) (obj1))));
        boolean flag = d.await(a, TimeUnit.MILLISECONDS);
        if (flag)
        {
            return true;
        }
        break MISSING_BLOCK_LABEL_441;
        InterruptedException interruptedexception;
        interruptedexception;
        com.nuance.b.b.fr.a((new StringBuilder("Should not happen Interrupted Exception ")).append(interruptedexception).toString());
        return false;
    }

    public final s b()
    {
        if (e == null)
        {
            boolean flag;
            try
            {
                flag = a();
            }
            catch (gk gk1)
            {
                return null;
            }
            catch (UnknownHostException unknownhostexception)
            {
                com.nuance.b.b.fr.a((new StringBuilder("Unknown Host: ")).append(unknownhostexception.toString()).toString());
                return null;
            }
            if (!flag)
            {
                return null;
            }
        }
        return e;
    }

    public final void c()
    {
        com.nuance.b.b.fr.e("Destroying NMT Manager");
        if (e != null)
        {
            e.a();
        }
    }

}
