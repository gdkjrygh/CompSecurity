// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.c;

import android.content.Context;
import com.jcp.e.c;
import com.jcp.e.w;
import com.jcp.errorstatus.ErrorMessageUtil;
import com.jcp.http.b;
import com.jcp.pojo.Response;
import com.jcp.util.ae;
import org.json.JSONObject;

// Referenced classes of package com.jcp.c:
//            b

public final class a extends com.jcp.c.b
    implements w
{

    private static final String a = com/jcp/c/a.getSimpleName();

    public a(Context context)
    {
        a(context);
    }

    public void a(c c1)
    {
        a(((com.jcp.e.f) (c1)));
    }

    public void a(Response response)
    {
        int i = response.getReJcpRequestTypes();
        int j = response.getStatusCode();
        String s = response.getResponseBody();
        ae.d(a, (new StringBuilder()).append(i).append(" ").append(j).append(" ").append(response).toString());
        if (i == 17 || i == 18 || i == 63)
        {
            if (com.jcp.http.b.a(j))
            {
                if (c() != null)
                {
                    ((c)c()).c(j, i);
                }
            } else
            if (c() != null)
            {
                ((c)c()).a(ErrorMessageUtil.getErrorMessageFromJSONResponse(s), i);
                return;
            }
        }
    }

    public void a(JSONObject jsonobject)
    {
        a(jsonobject, false);
    }

    public void a(JSONObject jsonobject, String s, boolean flag)
    {
        s = com.jcp.b.b.q(s);
        com.jcp.http.c c1 = new com.jcp.http.c(b(), this);
        c1.a(flag);
        c1.b(s);
        c1.b(2);
        c1.a(63);
        c1.a(jsonobject);
        c1.execute(new String[0]);
    }

    public void a(JSONObject jsonobject, boolean flag)
    {
        String s = com.jcp.b.b.U();
        com.jcp.http.c c1 = new com.jcp.http.c(b(), this);
        c1.a(flag);
        c1.b(s);
        c1.b(1);
        c1.a(17);
        c1.a(jsonobject);
        c1.execute(new String[0]);
    }

    public void b(JSONObject jsonobject, String s, boolean flag)
    {
        s = com.jcp.b.b.q(s);
        com.jcp.http.c c1 = new com.jcp.http.c(b(), this);
        c1.a(flag);
        c1.b(s);
        c1.b(2);
        c1.a(18);
        c1.a(jsonobject);
        c1.execute(new String[0]);
    }

}
