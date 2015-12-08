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

    private static y apb;
    private static final Object xz = new Object();
    private cg aos;
    private String apc;
    private String apd;
    private ar ape;

    private y(Context context)
    {
        this(((ar) (as.Z(context))), ((cg) (new cw())));
    }

    y(ar ar1, cg cg1)
    {
        ape = ar1;
        aos = cg1;
    }

    public static aq X(Context context)
    {
        synchronized (xz)
        {
            if (apb == null)
            {
                apb = new y(context);
            }
            context = apb;
        }
        return context;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    public boolean cz(String s)
    {
        if (!aos.eJ())
        {
            bh.W("Too many urls sent too quickly with the TagManagerSender, rate limiting invoked.");
            return false;
        }
        String s1 = s;
        if (apc != null)
        {
            s1 = s;
            if (apd != null)
            {
                try
                {
                    s1 = (new StringBuilder()).append(apc).append("?").append(apd).append("=").append(URLEncoder.encode(s, "UTF-8")).toString();
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
        ape.cC(s1);
        return true;
    }

}
