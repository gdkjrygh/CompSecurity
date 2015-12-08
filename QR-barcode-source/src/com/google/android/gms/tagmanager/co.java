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

    private final String aoc;
    private volatile String aoy;
    private final bn aqr;
    private final String aqs;
    private bg aqt;
    private volatile r aqu;
    private volatile String aqv;
    private final Context mContext;

    co(Context context, String s, bn bn1, r r1)
    {
        mContext = context;
        aqr = bn1;
        aoc = s;
        aqu = r1;
        aqs = (new StringBuilder()).append("/r?id=").append(s).toString();
        aoy = aqs;
        aqv = null;
    }

    public co(Context context, String s, r r1)
    {
        this(context, s, new bn(), r1);
    }

    private boolean oM()
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

    private void oN()
    {
        bm bm1;
        String s;
        if (!oM())
        {
            aqt.a(bg.a.apM);
            return;
        }
        bh.V("Start loading resource from network ...");
        s = oO();
        bm1 = aqr.ox();
        Object obj = bm1.cD(s);
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        cr.b(((java.io.InputStream) (obj)), bytearrayoutputstream);
        obj = com.google.android.gms.internal.c.j.b(bytearrayoutputstream.toByteArray());
        bh.V((new StringBuilder()).append("Successfully loaded supplemented resource: ").append(obj).toString());
        if (((com.google.android.gms.internal.c.j) (obj)).gs == null && ((com.google.android.gms.internal.c.j) (obj)).gr.length == 0)
        {
            bh.V((new StringBuilder()).append("No change for container: ").append(aoc).toString());
        }
        aqt.l(obj);
        bm1.close();
        bh.V("Load resource from network finished.");
        return;
        Object obj1;
        obj1;
        bh.W((new StringBuilder()).append("No data is retrieved from the given url: ").append(s).append(". Make sure container_id: ").append(aoc).append(" is correct.").toString());
        aqt.a(bg.a.apO);
        bm1.close();
        return;
        obj1;
        bh.d((new StringBuilder()).append("Error when loading resources from url: ").append(s).append(" ").append(((IOException) (obj1)).getMessage()).toString(), ((Throwable) (obj1)));
        aqt.a(bg.a.apN);
        bm1.close();
        return;
        obj1;
        bh.d((new StringBuilder()).append("Error when parsing downloaded resources from url: ").append(s).append(" ").append(((IOException) (obj1)).getMessage()).toString(), ((Throwable) (obj1)));
        aqt.a(bg.a.apO);
        bm1.close();
        return;
        Exception exception;
        exception;
        bm1.close();
        throw exception;
    }

    void a(bg bg1)
    {
        aqt = bg1;
    }

    void cJ(String s)
    {
        bh.S((new StringBuilder()).append("Setting previous container version: ").append(s).toString());
        aqv = s;
    }

    void cu(String s)
    {
        if (s == null)
        {
            aoy = aqs;
            return;
        } else
        {
            bh.S((new StringBuilder()).append("Setting CTFE URL path: ").append(s).toString());
            aoy = s;
            return;
        }
    }

    String oO()
    {
        String s1 = (new StringBuilder()).append(aqu.od()).append(aoy).append("&v=a65833898").toString();
        String s = s1;
        if (aqv != null)
        {
            s = s1;
            if (!aqv.trim().equals(""))
            {
                s = (new StringBuilder()).append(s1).append("&pv=").append(aqv).toString();
            }
        }
        s1 = s;
        if (ce.oJ().oK().equals(ce.a.aqj))
        {
            s1 = (new StringBuilder()).append(s).append("&gtm_debug=x").toString();
        }
        return s1;
    }

    public void run()
    {
        if (aqt == null)
        {
            throw new IllegalStateException("callback must be set before execute");
        } else
        {
            aqt.ob();
            oN();
            return;
        }
    }
}
