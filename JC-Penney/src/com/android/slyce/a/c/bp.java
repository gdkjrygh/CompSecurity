// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.a.c;

import java.util.Hashtable;
import javax.net.ssl.SSLEngine;

// Referenced classes of package com.android.slyce.a.c:
//            ab, bq, l

public class bp
    implements ab
{

    Hashtable a;

    public bp()
    {
        a = new Hashtable();
    }

    public void a(SSLEngine sslengine, l l, String s, int i)
    {
        String s1 = sslengine.getClass().getCanonicalName();
        bq bq2 = (bq)a.get(s1);
        bq bq1 = bq2;
        if (bq2 == null)
        {
            bq1 = new bq(sslengine.getClass());
            a.put(s1, bq1);
        }
        bq1.a(sslengine, l, s, i);
    }
}
