// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.b;

import com.nuance.b.b.a.c;
import com.nuance.b.b.a.d;
import com.nuance.b.c.b;
import com.nuance.dragon.toolkit.a.an;
import com.nuance.dragon.toolkit.a.ao;
import com.nuance.dragon.toolkit.a.x;
import com.nuance.dragon.toolkit.b.e;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.nuance.b.b:
//            gp, gd, fm, fr, 
//            go, fn, fp, v, 
//            fc, ad, az, ar, 
//            as, aq, fg

final class fo extends gp
{

    private static final String a = com/nuance/b/b/fo.getSimpleName();
    private AtomicBoolean g;
    private gd h;
    private final b i;

    fo(b b1)
    {
        super(b1.b(), "connect", a);
        i = b1;
        g = new AtomicBoolean(false);
        h = new gd();
    }

    final void a()
    {
    }

    final void a(ao ao1)
    {
    }

    public final void a(x x, an an1)
    {
        super.a(x, an1);
        if (an1.b() != 0)
        {
            i.b(new c(b, d.e, null, "TransactionError: canceled"));
        }
    }

    public final void a(x x, ao ao1, boolean flag)
    {
        super.a(x, ao1, flag);
        if (!flag) goto _L2; else goto _L1
_L1:
        x = ao1.d();
        ao1 = x.e("adk_result").toString();
        x.a("adk_result", "");
        try
        {
            ao1 = new JSONObject(ao1);
        }
        // Misplaced declaration of an exception variable
        catch (x x)
        {
            fr.a(x.getStackTrace());
            i.b(new c(b, d.f, x, x.getMessage()));
            return;
        }
        if (!fm.a(ao1)) goto _L4; else goto _L3
_L3:
        i.b(new c(b, d.h, null, com.nuance.b.b.fm.b(ao1)));
_L2:
        return;
_L4:
        int j;
        x = go.a(ao1, "Response.dialog.abort", null);
        j = com.nuance.b.b.fn.c;
        if (x != null)
        {
            if ("true".equalsIgnoreCase(x))
            {
                j = fn.a;
            } else
            {
                j = com.nuance.b.b.fn.b;
            }
        }
        fp.a[j - 1];
        JVM INSTR tableswitch 1 2: default 172
    //                   1 213
    //                   2 224;
           goto _L5 _L6 _L7
_L5:
        j = 0;
_L9:
        if (j != 0)
        {
            i.b(new c(b, d.d, null, "application must upgrade"));
            return;
        }
        break; /* Loop/switch isn't completed */
_L6:
        fr.a("Application must upgrade.");
        j = 1;
        if (true) goto _L9; else goto _L8
_L8:
        break; /* Loop/switch isn't completed */
_L7:
        com.nuance.b.b.fr.c("SHOULD UPGRADE APP");
        if (true) goto _L5; else goto _L10
_L10:
        Object obj;
        com.nuance.b.a.ae ae;
label0:
        {
            x = go.a(ao1, "Response.request.jsessionid", null);
            boolean flag1;
            if (x != null)
            {
                v.r().p().c(x);
                flag1 = true;
            } else
            {
                fr.a("No jsession in start session response");
                flag1 = false;
            }
            if (!flag1)
            {
                i.b(new c(b, d.h, null, "failed getting session id"));
                return;
            }
            x = go.a(ao1, "Response.request.serverVersion", null);
            int k;
            if (x != null)
            {
                v.r().p().b(x);
            } else
            {
                com.nuance.b.b.fr.b("No serverVersion in start session response");
            }
            x = com.nuance.b.b.go.b(ao1, "Response.provisioning");
            if (x != null)
            {
                x = x.optString("mmf.applicationServer.URL", null);
            } else
            {
                x = null;
            }
            if (x != null)
            {
                v.r().p().a(x);
            } else
            {
                com.nuance.b.b.fr.b("No serverUrl in start session response");
            }
            x = com.nuance.b.b.go.b(ao1, "Response.provisioning");
            if (x != null)
            {
                flag = "mrec".equals(x.optString("mmf.recognition.technology", null));
            } else
            {
                flag = false;
            }
            v.r().p().a(flag);
            obj = v.r().c();
            x = com.nuance.b.b.go.b(ao1, "Response.provisioning");
            if (x == null)
            {
                break label0;
            }
            k = x.optInt("mmf.client.session.disconnect.interval", -1);
            if (k > 0)
            {
                x = Integer.valueOf(Integer.valueOf(k).intValue() * 1000);
            } else
            {
                int l = x.optInt("mmf.client.ping.interval", -1);
                if (l <= 0)
                {
                    break label0;
                }
                x = Integer.valueOf(Integer.valueOf(l).intValue() * 1000);
            }
        }
_L11:
        com.nuance.b.b.fr.e((new StringBuilder("Setting session timeout value to: ")).append(x).toString());
        ((ad) (obj)).a(x.intValue());
        obj = v.r();
        com.nuance.b.b.fr.e((new StringBuilder("startTime:  ")).append(go.a(ao1, "Response.request.servletStartTime", "unknown")).toString());
        com.nuance.b.b.fr.e((new StringBuilder("endTime:  ")).append(go.a(ao1, "Response.request.servletEndTime", "unknown")).toString());
        ae = ((v) (obj)).b;
        if (ae == null)
        {
            break MISSING_BLOCK_LABEL_784;
        }
        if (g.get())
        {
            x = "initial";
        } else
        {
            x = "followup";
        }
        com.nuance.b.b.fr.e((new StringBuilder("push to cloud, got ")).append(x).append(" start session response").toString());
        if (go.a(ao1, "Response.applicationfound"))
        {
            break; /* Loop/switch isn't completed */
        }
        if (g.getAndSet(true))
        {
            fr.a("Server reports APP NOT FOUND for pushed model");
            i.b(new c(b, d.g, null, "Server reports APP NOT FOUND for pushed model"));
            return;
        }
        break MISSING_BLOCK_LABEL_711;
        x = Integer.valueOf(0xcd140);
          goto _L11
        com.nuance.b.b.fr.e("push to cloud, app not found on server, sending full dialog model");
        if (!((v) (obj)).p().a(i, ((v) (obj)).j().t(), ae, this))
        {
            i.b(new c(b, d.e, null, ""));
            return;
        }
        if (true) goto _L2; else goto _L12
_L12:
        if (g.get())
        {
            com.nuance.b.b.fr.e("push to cloud, app addded to server");
        } else
        {
            com.nuance.b.b.fr.e("push to cloud, app found on server");
        }
        x = gd.a(b, ar.f, com.nuance.b.b.as.d, ao1);
        ((v) (obj)).p().a(((aq) (x)).w);
        v.r().b().c();
        v.r().c().a();
        i.a(new com.nuance.b.b.a.b(i.b(), x));
        return;
    }

    final void b()
    {
    }

}
