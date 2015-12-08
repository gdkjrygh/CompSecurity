// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.a.c;

import android.net.Uri;
import com.android.slyce.a.a.c;
import com.android.slyce.a.ag;
import com.android.slyce.a.i;
import com.android.slyce.a.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.TrustManager;

// Referenced classes of package com.android.slyce.a.c:
//            ai, ae, ad, ab, 
//            a, l

public class ac extends ai
{

    protected SSLContext a;
    protected TrustManager b[];
    protected HostnameVerifier c;
    protected List d;

    public ac(a a1)
    {
        super(a1, "https", 443);
        d = new ArrayList();
    }

    protected c a(l l, Uri uri, int j, boolean flag, c c1)
    {
        return new ae(this, c1, flag, l, uri, j);
    }

    protected p a(l l, c c1)
    {
        return new ad(this, c1);
    }

    public SSLContext a()
    {
        if (a != null)
        {
            return a;
        } else
        {
            return i.c();
        }
    }

    protected SSLEngine a(l l, String s, int j)
    {
        SSLEngine sslengine = a().createSSLEngine();
        for (Iterator iterator = d.iterator(); iterator.hasNext(); ((ab)iterator.next()).a(sslengine, l, s, j)) { }
        return sslengine;
    }

    protected void a(ag ag, l l, Uri uri, int j, c c1)
    {
        i.a(ag, uri.getHost(), j, a(l, uri.getHost(), j), b, c, true, a(l, c1));
    }

    public void a(ab ab1)
    {
        d.add(ab1);
    }
}
