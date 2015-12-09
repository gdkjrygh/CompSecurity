// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.c;

import android.content.Context;
import com.jcp.e.am;
import com.jcp.e.an;
import com.jcp.e.h;
import com.jcp.e.w;
import com.jcp.errorstatus.ErrorMessageEntityContainer;
import com.jcp.f.a;
import com.jcp.http.b;
import com.jcp.model.CityStateZipResponseModel;
import com.jcp.pojo.Response;
import com.jcp.util.aa;
import com.jcp.util.ae;
import java.util.Map;

public final class c
    implements w
{

    private static final String a = com/jcp/c/c.getSimpleName();
    private static c c;
    private Context b;
    private h d;
    private am e;
    private an f;

    private c(Context context)
    {
        b = context;
    }

    public static c a(Context context)
    {
        if (c == null)
        {
            c = new c(context);
        }
        return c;
    }

    private CityStateZipResponseModel a(String s)
    {
        return (CityStateZipResponseModel)aa.a(s, com/jcp/model/CityStateZipResponseModel);
    }

    public void a(am am1)
    {
        e = am1;
    }

    public void a(an an1)
    {
        f = an1;
    }

    public void a(h h1)
    {
        d = h1;
    }

    public void a(Response response)
    {
        boolean flag;
        boolean flag1;
        int i;
        int j;
        flag1 = true;
        flag = false;
        i = response.getReJcpRequestTypes();
        j = response.getStatusCode();
        response = response.getResponseBody();
        if (i != 45) goto _L2; else goto _L1
_L1:
        if (f != null)
        {
            flag = flag1;
            if (com.jcp.http.b.a(j))
            {
                ae.a(a, (new StringBuilder()).append(i).append(" ").append(j).append(" ").append(response).toString());
                CityStateZipResponseModel citystatezipresponsemodel = a(((String) (response)));
                flag = flag1;
                if (citystatezipresponsemodel != null)
                {
                    f.a(citystatezipresponsemodel, i);
                    flag = false;
                }
            }
            if (flag)
            {
                f.a(response, i);
            }
        }
_L4:
        return;
_L2:
        if (i != 46)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (e == null) goto _L4; else goto _L3
_L3:
        if (!com.jcp.http.b.a(j))
        {
            break MISSING_BLOCK_LABEL_357;
        }
        ae.a(a, (new StringBuilder()).append(i).append(" ").append(j).append(" ").append(response).toString());
        CityStateZipResponseModel citystatezipresponsemodel1 = a(((String) (response)));
        if (citystatezipresponsemodel1 == null)
        {
            break MISSING_BLOCK_LABEL_357;
        }
        e.a(citystatezipresponsemodel1, i);
_L7:
        if (!flag) goto _L4; else goto _L5
_L5:
        e.a(response, i);
        return;
        if (i != 25 && i != 26 && i != 27 && i != 28 || d == null) goto _L4; else goto _L6
_L6:
        if (com.jcp.http.b.a(j))
        {
            ae.a(a, (new StringBuilder()).append(i).append(" ").append(j).append(" ").append(response).toString());
            d.a_(response, i);
            return;
        }
        response = com.jcp.f.a.a(response);
        if (response != null)
        {
            d.a(response.getErrorCode(), response.getErrorMessage(), i);
            return;
        }
          goto _L4
        flag = true;
          goto _L7
    }

    public void a(String s, int i)
    {
        s = com.jcp.b.b.x(s);
        com.jcp.http.c c1 = new com.jcp.http.c(b, this);
        c1.a(i);
        c1.b(0);
        c1.b(s);
        c1.execute(new String[0]);
    }

    public void a(Map map, int i)
    {
        String s = com.jcp.b.b.D();
        com.jcp.http.c c1 = new com.jcp.http.c(b, this);
        c1.a(i);
        c1.b(1);
        c1.a(map);
        c1.b(s);
        c1.execute(new String[0]);
    }

    public void a(Map map, String s, int i)
    {
        s = com.jcp.b.b.f(s);
        com.jcp.http.c c1 = new com.jcp.http.c(b, this);
        c1.a(i);
        c1.b(2);
        c1.a(map);
        c1.b(s);
        c1.execute(new String[0]);
    }

}
