// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.protocol.methods;

import com.facebook.common.w.e;
import com.facebook.http.protocol.f;
import com.facebook.http.protocol.n;
import com.facebook.http.protocol.p;
import com.facebook.http.protocol.r;
import com.facebook.http.protocol.t;
import com.facebook.ui.media.attachments.MediaResource;
import com.facebook.ui.media.attachments.d;
import com.facebook.ui.media.b.a;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.common.a.es;
import com.google.common.a.et;
import org.apache.http.message.BasicNameValuePair;

// Referenced classes of package com.facebook.orca.protocol.methods:
//            ac

public class ab
    implements f
{

    private final d a;
    private final a b;

    public ab(d d1, a a1)
    {
        a = d1;
        b = a1;
    }

    public n a(ac ac1)
    {
        com.facebook.ui.media.attachments.a a1 = a.a(com.facebook.orca.protocol.methods.ac.a(ac1));
        com.facebook.http.protocol.ab ab1 = b.a(a1);
        et et1 = es.e();
        String s = a1.a().j();
        s = s.substring(0, s.indexOf('.'));
        et1.b(new BasicNameValuePair("published", "false"));
        return n.newBuilder().a((new StringBuilder()).append("media-").append(ac.b(ac1)).toString()).b("POST").c(a1.d()).a(et1.b()).a(t.JSON).b(es.a(new com.facebook.http.a.a.a.a(s, ab1))).k();
    }

    public volatile n a(Object obj)
    {
        return a((ac)obj);
    }

    public volatile Object a(Object obj, r r1)
    {
        return a((ac)obj, r1);
    }

    public String a(ac ac1, r r1)
    {
        return e.b(r1.c().get("id"));
    }
}
