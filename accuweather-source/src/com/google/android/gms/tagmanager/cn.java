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

    private volatile String aeM;
    private final String aeq;
    private final bm agI;
    private final String agJ;
    private bg agK;
    private volatile r agL;
    private volatile String agM;
    private final Context mContext;

    cn(Context context, String s, bm bm1, r r1)
    {
        mContext = context;
        agI = bm1;
        aeq = s;
        agL = r1;
        agJ = (new StringBuilder()).append("/r?id=").append(s).toString();
        aeM = agJ;
        agM = null;
    }

    public cn(Context context, String s, r r1)
    {
        this(context, s, new bm(), r1);
    }

    private boolean mb()
    {
        NetworkInfo networkinfo = ((ConnectivityManager)mContext.getSystemService("connectivity")).getActiveNetworkInfo();
        if (networkinfo == null || !networkinfo.isConnected())
        {
            bh.C("...no network connectivity");
            return false;
        } else
        {
            return true;
        }
    }

    private void mc()
    {
        bl bl1;
        String s;
        if (!mb())
        {
            agK.a(bg.a.agd);
            return;
        }
        bh.C("Start loading resource from network ...");
        s = md();
        bl1 = agI.lM();
        Object obj = bl1.bV(s);
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        cq.b(((java.io.InputStream) (obj)), bytearrayoutputstream);
        obj = com.google.android.gms.internal.c.j.b(bytearrayoutputstream.toByteArray());
        bh.C((new StringBuilder()).append("Successfully loaded supplemented resource: ").append(obj).toString());
        if (((com.google.android.gms.internal.c.j) (obj)).fK == null && ((com.google.android.gms.internal.c.j) (obj)).fJ.length == 0)
        {
            bh.C((new StringBuilder()).append("No change for container: ").append(aeq).toString());
        }
        agK.i(obj);
        bl1.close();
        bh.C("Load resource from network finished.");
        return;
        Object obj1;
        obj1;
        bh.D((new StringBuilder()).append("No data is retrieved from the given url: ").append(s).append(". Make sure container_id: ").append(aeq).append(" is correct.").toString());
        agK.a(bg.a.agf);
        bl1.close();
        return;
        obj1;
        bh.c((new StringBuilder()).append("Error when loading resources from url: ").append(s).append(" ").append(((IOException) (obj1)).getMessage()).toString(), ((Throwable) (obj1)));
        agK.a(bg.a.age);
        bl1.close();
        return;
        obj1;
        bh.c((new StringBuilder()).append("Error when parsing downloaded resources from url: ").append(s).append(" ").append(((IOException) (obj1)).getMessage()).toString(), ((Throwable) (obj1)));
        agK.a(bg.a.agf);
        bl1.close();
        return;
        Exception exception;
        exception;
        bl1.close();
        throw exception;
    }

    void a(bg bg1)
    {
        agK = bg1;
    }

    void bM(String s)
    {
        if (s == null)
        {
            aeM = agJ;
            return;
        } else
        {
            bh.z((new StringBuilder()).append("Setting CTFE URL path: ").append(s).toString());
            aeM = s;
            return;
        }
    }

    void cb(String s)
    {
        bh.z((new StringBuilder()).append("Setting previous container version: ").append(s).toString());
        agM = s;
    }

    String md()
    {
        String s1 = (new StringBuilder()).append(agL.ls()).append(aeM).append("&v=a65833898").toString();
        String s = s1;
        if (agM != null)
        {
            s = s1;
            if (!agM.trim().equals(""))
            {
                s = (new StringBuilder()).append(s1).append("&pv=").append(agM).toString();
            }
        }
        s1 = s;
        if (cd.lY().lZ().equals(cd.a.agA))
        {
            s1 = (new StringBuilder()).append(s).append("&gtm_debug=x").toString();
        }
        return s1;
    }

    public void run()
    {
        if (agK == null)
        {
            throw new IllegalStateException("callback must be set before execute");
        } else
        {
            agK.lq();
            mc();
            return;
        }
    }
}
