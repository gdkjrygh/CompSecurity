// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;

import android.content.Context;
import com.tremorvideo.sdk.android.videoad.a.a;
import java.util.Map;

// Referenced classes of package com.tremorvideo.sdk.android.videoad:
//            fp, ct, fd, az

public class ft extends fp
{

    String a;
    boolean b;
    a c;

    public ft(fp.a a1, Context context, Map map)
    {
        super(a1);
        b = false;
        a = (String)map.get("url");
        c = null;
    }

    private void h()
    {
        i();
        if (c != null)
        {
            a(fp.b.b);
            return;
        } else
        {
            a(fp.b.c);
            return;
        }
    }

    private void i()
    {
        Object obj;
        obj = ct.v();
        obj = com.tremorvideo.sdk.android.videoad.fd.a(a.replace("|", "%7C"), ((String) (obj)));
        ((fd) (obj)).a();
        obj = ((fd) (obj)).b();
        c = new a(((String) (obj)));
        if (obj == "") goto _L2; else goto _L1
_L1:
        String as[];
        int k;
        as = ((String) (obj)).split("\n");
        k = as.length;
        int j = 0;
_L3:
        String s;
        if (j >= k)
        {
            break; /* Loop/switch isn't completed */
        }
        s = as[j];
        com.tremorvideo.sdk.android.videoad.ct.a(ct.a.c, s);
        j++;
        if (true) goto _L3; else goto _L2
        Exception exception;
        exception;
        c = null;
        com.tremorvideo.sdk.android.videoad.ct.a(exception);
_L2:
    }

    public void a(String s, az az1)
        throws Exception
    {
        az1.a(s, c);
    }

    protected void e()
    {
        h();
    }

    protected void f()
    {
    }

    protected void g()
    {
        h();
    }

    public String toString()
    {
        return "Download VAST";
    }
}
