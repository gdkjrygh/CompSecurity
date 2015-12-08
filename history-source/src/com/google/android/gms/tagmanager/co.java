// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

// Referenced classes of package com.google.android.gms.tagmanager:
//            bn, bh, bg, bm, 
//            cr, r, ce

class co
    implements Runnable
{

    private volatile String aqI;
    private final String aqm;
    private final bn asA;
    private final String asB;
    private bg asC;
    private volatile r asD;
    private volatile String asE;
    private final Context mContext;

    co(Context context, String s, bn bn1, r r1)
    {
        mContext = context;
        asA = bn1;
        aqm = s;
        asD = r1;
        asB = (new StringBuilder()).append("/r?id=").append(s).toString();
        aqI = asB;
        asE = null;
    }

    public co(Context context, String s, r r1)
    {
        this(context, s, new bn(), r1);
    }

    private boolean qd()
    {
        NetworkInfo networkinfo = ((ConnectivityManager)mContext.getSystemService("connectivity")).getActiveNetworkInfo();
        if (networkinfo == null || !networkinfo.isConnected())
        {
            bh.V("...no network connectivity");
            return false;
        } else
        {
            return true;
        }
    }

    private void qe()
    {
        bm bm1;
        String s;
        if (!qd())
        {
            asC.a(bg.a.arV);
            return;
        }
        bh.V("Start loading resource from network ...");
        s = qf();
        bm1 = asA.pO();
        Object obj = bm1.cF(s);
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        cr.b(((java.io.InputStream) (obj)), bytearrayoutputstream);
        obj = com.google.android.gms.internal.c.j.b(bytearrayoutputstream.toByteArray());
        bh.V((new StringBuilder()).append("Successfully loaded supplemented resource: ").append(obj).toString());
        if (((com.google.android.gms.internal.c.j) (obj)).gs == null && ((com.google.android.gms.internal.c.j) (obj)).gr.length == 0)
        {
            bh.V((new StringBuilder()).append("No change for container: ").append(aqm).toString());
        }
        asC.l(obj);
        bm1.close();
        bh.V("Load resource from network finished.");
        return;
        Object obj1;
        obj1;
        bh.W((new StringBuilder()).append("No data is retrieved from the given url: ").append(s).append(". Make sure container_id: ").append(aqm).append(" is correct.").toString());
        asC.a(bg.a.arX);
        bm1.close();
        return;
        obj1;
        bh.d((new StringBuilder()).append("Error when loading resources from url: ").append(s).append(" ").append(((IOException) (obj1)).getMessage()).toString(), ((Throwable) (obj1)));
        asC.a(bg.a.arW);
        bm1.close();
        return;
        obj1;
        bh.d((new StringBuilder()).append("Error when parsing downloaded resources from url: ").append(s).append(" ").append(((IOException) (obj1)).getMessage()).toString(), ((Throwable) (obj1)));
        asC.a(bg.a.arX);
        bm1.close();
        return;
        Exception exception;
        exception;
        bm1.close();
        throw exception;
    }

    void a(bg bg1)
    {
        asC = bg1;
    }

    void cL(String s)
    {
        bh.S((new StringBuilder()).append("Setting previous container version: ").append(s).toString());
        asE = s;
    }

    void cw(String s)
    {
        if (s == null)
        {
            aqI = asB;
            return;
        } else
        {
            bh.S((new StringBuilder()).append("Setting CTFE URL path: ").append(s).toString());
            aqI = s;
            return;
        }
    }

    String qf()
    {
        String s1 = (new StringBuilder()).append(asD.pu()).append(aqI).append("&v=a65833898").toString();
        String s = s1;
        if (asE != null)
        {
            s = s1;
            if (!asE.trim().equals(""))
            {
                s = (new StringBuilder()).append(s1).append("&pv=").append(asE).toString();
            }
        }
        s1 = s;
        if (ce.qa().qb().equals(ce.a.ass))
        {
            s1 = (new StringBuilder()).append(s).append("&gtm_debug=x").toString();
        }
        return s1;
    }

    public void run()
    {
        if (asC == null)
        {
            throw new IllegalStateException("callback must be set before execute");
        } else
        {
            asC.ps();
            qe();
            return;
        }
    }
}
