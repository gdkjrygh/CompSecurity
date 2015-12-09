// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.c;

import android.content.Context;
import com.google.a.r;
import com.google.a.t;
import com.google.a.y;
import com.jcp.b.b;
import com.jcp.e.m;
import com.jcp.e.w;
import com.jcp.http.c;
import com.jcp.pojo.Response;
import com.jcp.util.ae;
import java.io.StringReader;

// Referenced classes of package com.jcp.c:
//            b

public class f extends com.jcp.c.b
    implements w
{

    private static final String a = com/jcp/c/f.getSimpleName();

    public f(Context context)
    {
        a(context);
    }

    private String a(String s)
    {
        String s1 = null;
        if (s == null) goto _L2; else goto _L1
_L1:
        s = new StringReader(s);
        s = (new y()).a(s).l().a("slots");
        if (!s.h() || s.m().a() <= 0) goto _L4; else goto _L3
_L3:
        s = ((com.google.a.w)s.m().a(0)).a("contents");
        if (!s.h() || s.m().a() <= 0) goto _L4; else goto _L5
_L5:
        s = ((com.google.a.w)((com.google.a.w)s.m().a(0)).a("destinationURL")).a("imgMap").c();
_L7:
        s1 = s;
_L2:
        return s1;
        s;
        ae.a(a, "Error parsing JSON response", s);
        return null;
_L4:
        s = null;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public void a()
    {
        c c1 = new c(b(), this);
        c1.b(b.K());
        c1.a(64);
        c1.b(0);
        c1.execute(new String[0]);
    }

    public void a(m m1)
    {
        a(((com.jcp.e.f) (m1)));
    }

    public void a(Response response)
    {
        if (response != null)
        {
            int i = response.getReJcpRequestTypes();
            int j = response.getStatusCode();
            String s = response.getResponseBody();
            ae.c(a, (new StringBuilder()).append(i).append(" ").append(j).append(" ").append(response).toString());
            if (c() != null && com.jcp.http.b.a(j))
            {
                switch (i)
                {
                default:
                    return;

                case 64: // '@'
                    ((m)c()).a(a(s));
                    break;
                }
                return;
            }
        }
    }

}
