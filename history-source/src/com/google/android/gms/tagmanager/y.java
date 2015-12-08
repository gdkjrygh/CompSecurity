// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.content.Context;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

// Referenced classes of package com.google.android.gms.tagmanager:
//            aq, as, cw, cg, 
//            bh, ar

class y
    implements aq
{

    private static y arl;
    private static final Object xO = new Object();
    private cg aqC;
    private String arm;
    private String arn;
    private ar aro;

    private y(Context context)
    {
        this(((ar) (as.Z(context))), ((cg) (new cw())));
    }

    y(ar ar1, cg cg1)
    {
        aro = ar1;
        aqC = cg1;
    }

    public static aq X(Context context)
    {
        synchronized (xO)
        {
            if (arl == null)
            {
                arl = new y(context);
            }
            context = arl;
        }
        return context;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    public boolean cB(String s)
    {
        if (!aqC.fe())
        {
            bh.W("Too many urls sent too quickly with the TagManagerSender, rate limiting invoked.");
            return false;
        }
        String s1 = s;
        if (arm != null)
        {
            s1 = s;
            if (arn != null)
            {
                try
                {
                    s1 = (new StringBuilder()).append(arm).append("?").append(arn).append("=").append(URLEncoder.encode(s, "UTF-8")).toString();
                    bh.V((new StringBuilder()).append("Sending wrapped url hit: ").append(s1).toString());
                }
                // Misplaced declaration of an exception variable
                catch (String s)
                {
                    bh.d("Error wrapping URL for testing.", s);
                    return false;
                }
            }
        }
        aro.cE(s1);
        return true;
    }

}
