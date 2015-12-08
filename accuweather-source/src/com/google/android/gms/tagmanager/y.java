// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.content.Context;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

// Referenced classes of package com.google.android.gms.tagmanager:
//            aq, as, cv, cf, 
//            bh, ar

class y
    implements aq
{

    private static y afr;
    private static final Object tn = new Object();
    private cf aeG;
    private String afs;
    private String aft;
    private ar afu;

    private y(Context context)
    {
        this(((ar) (as.M(context))), ((cf) (new cv())));
    }

    y(ar ar1, cf cf1)
    {
        afu = ar1;
        aeG = cf1;
    }

    public static aq K(Context context)
    {
        synchronized (tn)
        {
            if (afr == null)
            {
                afr = new y(context);
            }
            context = afr;
        }
        return context;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    public boolean bR(String s)
    {
        if (!aeG.dj())
        {
            bh.D("Too many urls sent too quickly with the TagManagerSender, rate limiting invoked.");
            return false;
        }
        String s1 = s;
        if (afs != null)
        {
            s1 = s;
            if (aft != null)
            {
                try
                {
                    s1 = (new StringBuilder()).append(afs).append("?").append(aft).append("=").append(URLEncoder.encode(s, "UTF-8")).toString();
                    bh.C((new StringBuilder()).append("Sending wrapped url hit: ").append(s1).toString());
                }
                // Misplaced declaration of an exception variable
                catch (String s)
                {
                    bh.c("Error wrapping URL for testing.", s);
                    return false;
                }
            }
        }
        afu.bU(s1);
        return true;
    }

}
