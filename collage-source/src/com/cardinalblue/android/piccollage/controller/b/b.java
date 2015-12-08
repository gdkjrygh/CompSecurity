// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.controller.b;

import org.a.d.a;
import org.a.d.g;

// Referenced classes of package com.cardinalblue.android.piccollage.controller.b:
//            a

public class b extends org.a.a.a.b
{

    public b()
    {
    }

    public final String a()
    {
        return "https://oa.connect.auone.jp/net/opi/hny_oauth_rt_net/cca?ID=OpenAPITokenCodeReq";
    }

    public String a(a a1)
    {
        return String.format("https://oa.connect.auone.jp/net/opi/hny_oauth_rt_net/cca?ID=OpenAPIAcpt&response_type=code&client_id=%s&redirect_uri=%s&scope=%s&state=", new Object[] {
            a1.a(), a1.c(), a1.d()
        });
    }

    public g b()
    {
        return g.b;
    }

    public org.a.c.a c()
    {
        return new com.cardinalblue.android.piccollage.controller.b.a();
    }
}
