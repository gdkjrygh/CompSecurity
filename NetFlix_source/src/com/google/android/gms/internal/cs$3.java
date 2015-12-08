// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            cs, cz, dz, ea, 
//            dw, dq

class oP
    implements Runnable
{

    final cs oP;

    public void run()
    {
label0:
        {
            synchronized (cs.a(oP))
            {
                if (cs.c(oP).errorCode == -2)
                {
                    break label0;
                }
            }
            return;
        }
        cs.d(oP).bI().a(oP);
        if (cs.c(oP).errorCode != -3)
        {
            break MISSING_BLOCK_LABEL_119;
        }
        dw.y((new StringBuilder()).append("Loading URL in WebView: ").append(cs.c(oP).ol).toString());
        cs.d(oP).loadUrl(cs.c(oP).ol);
_L1:
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        dw.y("Loading HTML in WebView.");
        cs.d(oP).loadDataWithBaseURL(dq.r(cs.c(oP).ol), cs.c(oP).pm, "text/html", "UTF-8", null);
          goto _L1
    }

    (cs cs1)
    {
        oP = cs1;
        super();
    }
}
