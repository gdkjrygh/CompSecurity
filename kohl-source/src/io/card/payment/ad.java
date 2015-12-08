// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.card.payment;

import android.util.Log;
import org.apache.http.conn.ssl.SSLSocketFactory;

// Referenced classes of package io.card.payment:
//            aa, a

final class ad
{

    private static String a = String.format("card.io/%s (Android %s)", new Object[] {
        "sdk-3.1.5", aa.b()
    });
    private static a b = null;

    static a a()
    {
        a a1 = null;
        io/card/payment/ad;
        JVM INSTR monitorenter ;
        if (b != null)
        {
            break MISSING_BLOCK_LABEL_39;
        }
        a a2 = new a();
        b = a2;
        a2.a(a);
        b.a(SSLSocketFactory.getSocketFactory());
        a1 = b;
_L2:
        io/card/payment/ad;
        JVM INSTR monitorexit ;
        return a1;
        Exception exception1;
        exception1;
        Log.e("HttpClientFactory", "Exception creating https client", exception1);
        b = null;
        if (true) goto _L2; else goto _L1
_L1:
        Exception exception;
        exception;
        throw exception;
    }

}
