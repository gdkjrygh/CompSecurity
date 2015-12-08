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
//            bm, bh, bg, bl, 
//            cq, r, cd

class cn
    implements Runnable
{

    private final String WJ;
    private volatile String Xg;
    private final bm Zd;
    private final String Ze;
    private bg Zf;
    private volatile r Zg;
    private volatile String Zh;
    private final Context mContext;

    cn(Context context, String s, bm bm1, r r1)
    {
        mContext = context;
        Zd = bm1;
        WJ = s;
        Zg = r1;
        Ze = (new StringBuilder()).append("/r?id=").append(s).toString();
        Xg = Ze;
        Zh = null;
    }

    public cn(Context context, String s, r r1)
    {
        this(context, s, new bm(), r1);
    }

    private boolean kW()
    {
        NetworkInfo networkinfo = ((ConnectivityManager)mContext.getSystemService("connectivity")).getActiveNetworkInfo();
        if (networkinfo == null || !networkinfo.isConnected())
        {
            bh.y("...no network connectivity");
            return false;
        } else
        {
            return true;
        }
    }

    private void kX()
    {
        bl bl1;
        String s;
        if (!kW())
        {
            Zf.a(bg.a.Yy);
            return;
        }
        bh.y("Start loading resource from network ...");
        s = kY();
        bl1 = Zd.kH();
        Object obj = bl1.bD(s);
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        cq.b(((java.io.InputStream) (obj)), bytearrayoutputstream);
        obj = com.google.android.gms.internal.c.j.b(bytearrayoutputstream.toByteArray());
        bh.y((new StringBuilder()).append("Successfully loaded supplemented resource: ").append(obj).toString());
        if (((com.google.android.gms.internal.c.j) (obj)).fK == null && ((com.google.android.gms.internal.c.j) (obj)).fJ.length == 0)
        {
            bh.y((new StringBuilder()).append("No change for container: ").append(WJ).toString());
        }
        Zf.i(obj);
        bl1.close();
        bh.y("Load resource from network finished.");
        return;
        Object obj1;
        obj1;
        bh.z((new StringBuilder()).append("No data is retrieved from the given url: ").append(s).append(". Make sure container_id: ").append(WJ).append(" is correct.").toString());
        Zf.a(bg.a.YA);
        bl1.close();
        return;
        obj1;
        bh.c((new StringBuilder()).append("Error when loading resources from url: ").append(s).append(" ").append(((IOException) (obj1)).getMessage()).toString(), ((Throwable) (obj1)));
        Zf.a(bg.a.Yz);
        bl1.close();
        return;
        obj1;
        bh.c((new StringBuilder()).append("Error when parsing downloaded resources from url: ").append(s).append(" ").append(((IOException) (obj1)).getMessage()).toString(), ((Throwable) (obj1)));
        Zf.a(bg.a.YA);
        bl1.close();
        return;
        Exception exception;
        exception;
        bl1.close();
        throw exception;
    }

    void a(bg bg1)
    {
        Zf = bg1;
    }

    void bJ(String s)
    {
        bh.v((new StringBuilder()).append("Setting previous container version: ").append(s).toString());
        Zh = s;
    }

    void bu(String s)
    {
        if (s == null)
        {
            Xg = Ze;
            return;
        } else
        {
            bh.v((new StringBuilder()).append("Setting CTFE URL path: ").append(s).toString());
            Xg = s;
            return;
        }
    }

    String kY()
    {
        String s1 = (new StringBuilder()).append(Zg.kn()).append(Xg).append("&v=a65833898").toString();
        String s = s1;
        if (Zh != null)
        {
            s = s1;
            if (!Zh.trim().equals(""))
            {
                s = (new StringBuilder()).append(s1).append("&pv=").append(Zh).toString();
            }
        }
        s1 = s;
        if (cd.kT().kU().equals(cd.a.YV))
        {
            s1 = (new StringBuilder()).append(s).append("&gtm_debug=x").toString();
        }
        return s1;
    }

    public void run()
    {
        if (Zf == null)
        {
            throw new IllegalStateException("callback must be set before execute");
        } else
        {
            Zf.kl();
            kX();
            return;
        }
    }
}
