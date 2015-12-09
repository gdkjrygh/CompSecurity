// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.util;

import android.content.Context;
import android.text.TextUtils;
import com.jcp.JCP;
import com.threatmetrix.TrustDefenderMobile.ag;
import com.threatmetrix.TrustDefenderMobile.ak;
import com.threatmetrix.TrustDefenderMobile.v;
import java.net.HttpCookie;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.jcp.util:
//            i, ae

public final class j
    implements v, Runnable
{

    private Context a;
    private ag b;
    private int c;
    private boolean d;
    private String e;
    private String f;

    public j(Context context)
    {
        d = true;
        c = 0;
        a = context;
        b = null;
    }

    private void a()
    {
        if (b != null)
        {
            b.b();
            b = null;
        }
        b = new ag();
        try
        {
            b.a(this);
            return;
        }
        catch (InterruptedException interruptedexception)
        {
            ae.a(i.a(), "Exception adding notifier", interruptedexception);
        }
        d = false;
    }

    private void b()
    {
        if (!TextUtils.isEmpty(e) && !TextUtils.isEmpty(f))
        {
            a();
            if (d)
            {
                b.a((new StringBuilder()).append("jcpenney").append(e).toString());
                boolean flag = true;
                do
                {
                    if (!flag)
                    {
                        break;
                    }
                    ak ak1 = b.a(a, f, "h.online-metrix.net");
                    if (ak1 == ak.b)
                    {
                        ae.d(i.a(), "Device Id profiling started successfully");
                        flag = false;
                    } else
                    {
                        ae.d(i.a(), (new StringBuilder()).append("Device Id profiling start failed: ").append(ak1).toString());
                        if (e())
                        {
                            ae.d(i.a(), "Max Attempts reached, failing Device Id");
                            flag = false;
                        }
                    }
                } while (true);
            }
        }
    }

    private void c()
    {
        f = "k8vif92e";
    }

    private void d()
    {
label0:
        {
            Object obj = JCP.h();
            if (obj == null || ((List) (obj)).isEmpty())
            {
                break label0;
            }
            obj = ((List) (obj)).iterator();
            HttpCookie httpcookie;
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break label0;
                }
                httpcookie = (HttpCookie)((Iterator) (obj)).next();
            } while (!"DPOrder".equalsIgnoreCase(httpcookie.getName()));
            e = httpcookie.getValue();
        }
        String s1 = i.a();
        StringBuilder stringbuilder = (new StringBuilder()).append("Order id = ");
        String s;
        if (TextUtils.isEmpty(e))
        {
            s = "EMPTY";
        } else
        {
            s = e;
        }
        ae.d(s1, stringbuilder.append(s).toString());
    }

    private boolean e()
    {
        int k = c + 1;
        c = k;
        return k < 3;
    }

    public void a(ak ak1)
    {
        if (ak1 == ak.b)
        {
            ae.d(i.a(), "Device Id profiling successful");
            return;
        }
        ae.d(i.a(), (new StringBuilder()).append("Device Id profiling failed: ").append(ak1).toString());
        if (e())
        {
            b();
            return;
        } else
        {
            b.b();
            b = null;
            ae.d(i.a(), "Device Id profile - giving up after max attempts");
            return;
        }
    }

    public void run()
    {
        if (d)
        {
            d();
            c();
            b();
        }
    }
}
