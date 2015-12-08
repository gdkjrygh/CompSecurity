// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.advertising.android;

import com.microsoft.advertising.android.a.e;
import java.io.InputStream;
import org.apache.http.client.methods.HttpGet;

// Referenced classes of package com.microsoft.advertising.android:
//            u, p, ag, al, 
//            ae, ai, av

final class x
    implements Runnable
{

    private String a;
    private ai b;

    public x(String s, ai ai1)
    {
        a = null;
        b = null;
        a = s;
        b = ai1;
    }

    public final void run()
    {
        Object obj;
        obj = new HttpGet(a);
        ((HttpGet) (obj)).setHeader(u.J.a(), p.a().g());
        ag.a().f();
        obj = al.a(((HttpGet) (obj)));
        if (b != null)
        {
            b.a(null, ae.b);
        }
        if (((al.a) (obj)).a() < 400)
        {
            break MISSING_BLOCK_LABEL_183;
        }
        av.c("BeaconRequest", (new StringBuilder("Failed to send beacon request for impression tracking. Http response : ")).append(((al.a) (obj)).a()).toString());
        av.c("BeaconRequest", (new StringBuilder("Impression failed for ")).append(a).toString());
        if (b != null)
        {
            b.b((new StringBuilder("Failed to send beacon request for ")).append(a).append(" Http response : ").append(((al.a) (obj)).a()).toString(), e.g);
        }
_L2:
        if (((al.a) (obj)).b() != null)
        {
            ((al.a) (obj)).b().close();
            return;
        }
        break MISSING_BLOCK_LABEL_273;
        av.b("BeaconRequest", (new StringBuilder("Impression sent for ")).append(a).toString());
        if (true) goto _L2; else goto _L1
_L1:
        Exception exception;
        exception;
        av.c("BeaconRequest", (new StringBuilder("Failed to send beacon request for impression tracking")).append(exception.toString()).toString());
        if (b != null)
        {
            b.b((new StringBuilder("Exception while sending beacon request for ")).append(a).toString(), e.g);
        }
    }
}
