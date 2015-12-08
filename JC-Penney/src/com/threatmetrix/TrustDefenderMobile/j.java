// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.threatmetrix.TrustDefenderMobile;

import android.net.http.AndroidHttpClient;
import android.util.Log;
import java.io.IOException;
import java.util.Map;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;

// Referenced classes of package com.threatmetrix.TrustDefenderMobile:
//            l, m, an, ak, 
//            ac, k, ag

class j extends l
{

    private static final String e = com/threatmetrix/TrustDefenderMobile/j.getName();
    public ac a;

    public j(AndroidHttpClient androidhttpclient, String s, k k1, Map map, ag ag)
    {
        super(androidhttpclient, m.a, s, k1, map, ag);
        a = null;
    }

    public final ak a()
    {
        if (b.f() == ak.b)
        {
            if (a != null && a.a())
            {
                return ak.b;
            } else
            {
                return ak.j;
            }
        } else
        {
            return super.a();
        }
    }

    public void run()
    {
        String s = e;
        (new StringBuilder("starting retrieval: ")).append(c).append("?").append(d.a());
        a = null;
        super.run();
        if (b() != 200)
        {
            break MISSING_BLOCK_LABEL_91;
        }
        a = new ac();
        a.a(super.b.d().getEntity().getContent());
        return;
        IOException ioexception;
        ioexception;
        Log.e(e, "IO Error", ioexception);
        return;
    }

}
