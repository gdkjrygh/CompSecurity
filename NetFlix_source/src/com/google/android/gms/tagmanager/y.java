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

    private static y XM;
    private static final Object sf = new Object();
    private String XN;
    private String XO;
    private ar XP;
    private cf Xa;

    private y(Context context)
    {
        this(((ar) (as.H(context))), ((cf) (new cv())));
    }

    y(ar ar1, cf cf1)
    {
        XP = ar1;
        Xa = cf1;
    }

    public static aq F(Context context)
    {
        synchronized (sf)
        {
            if (XM == null)
            {
                XM = new y(context);
            }
            context = XM;
        }
        return context;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    public boolean bz(String s)
    {
        if (!Xa.cS())
        {
            bh.z("Too many urls sent too quickly with the TagManagerSender, rate limiting invoked.");
            return false;
        }
        String s1 = s;
        if (XN != null)
        {
            s1 = s;
            if (XO != null)
            {
                try
                {
                    s1 = (new StringBuilder()).append(XN).append("?").append(XO).append("=").append(URLEncoder.encode(s, "UTF-8")).toString();
                    bh.y((new StringBuilder()).append("Sending wrapped url hit: ").append(s1).toString());
                }
                // Misplaced declaration of an exception variable
                catch (String s)
                {
                    bh.c("Error wrapping URL for testing.", s);
                    return false;
                }
            }
        }
        XP.bC(s1);
        return true;
    }

}
