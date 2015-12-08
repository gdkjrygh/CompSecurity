// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            bq, bw, cq, cr, 
//            cn, ci

class gu
    implements Runnable
{

    final bq gu;

    public void run()
    {
label0:
        {
            synchronized (bq.a(gu))
            {
                if (bq.c(gu).errorCode == -2)
                {
                    break label0;
                }
            }
            return;
        }
        bq.d(gu).aw().a(gu);
        if (bq.c(gu).errorCode != -3)
        {
            break MISSING_BLOCK_LABEL_119;
        }
        cn.p((new StringBuilder()).append("Loading URL in WebView: ").append(bq.c(gu).fW).toString());
        bq.d(gu).loadUrl(bq.c(gu).fW);
_L1:
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        cn.p("Loading HTML in WebView.");
        bq.d(gu).loadDataWithBaseURL(ci.j(bq.c(gu).fW), bq.c(gu).gG, "text/html", "UTF-8", null);
          goto _L1
    }

    (bq bq1)
    {
        gu = bq1;
        super();
    }
}
