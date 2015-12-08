// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.c;

import android.content.Context;
import android.os.AsyncTask;
import com.jcp.a.a;
import com.jcp.e.r;
import com.jcp.e.w;
import com.jcp.e.z;
import com.jcp.errorstatus.ErrorMessageUtil;
import com.jcp.http.b;
import com.jcp.http.c;
import com.jcp.pojo.Response;
import com.jcp.productfilter.pojo.ProductList;
import com.jcp.productlistentity.ProductListEntityContainer;
import com.jcp.util.aa;
import com.jcp.util.ae;
import java.util.List;

// Referenced classes of package com.jcp.c:
//            b

public class p extends com.jcp.c.b
    implements w
{

    private static final String a = com/jcp/c/p.getCanonicalName();
    private c b;

    public p(Context context)
    {
        a(context);
    }

    private ProductList c(String s)
    {
        return (ProductList)aa.a(s, com/jcp/productfilter/pojo/ProductList);
    }

    private ProductListEntityContainer d(String s)
    {
        return (ProductListEntityContainer)aa.a(s, com/jcp/productlistentity/ProductListEntityContainer);
    }

    public a a(List list, r r)
    {
        a a1 = new a(b());
        a1.a(76);
        a1.a(r);
        a1.a(true);
        a1.a(list);
        a1.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
        return a1;
    }

    public void a(z z1)
    {
        a(((com.jcp.e.f) (z1)));
    }

    public void a(Response response)
    {
        boolean flag;
        boolean flag1;
        boolean flag2;
        int i;
        int j;
        flag1 = false;
        i = response.getReJcpRequestTypes();
        j = response.getStatusCode();
        response = response.getResponseBody();
        flag2 = true;
        flag = flag2;
        if (!com.jcp.http.b.a(j)) goto _L2; else goto _L1
_L1:
        if (i != 16) goto _L4; else goto _L3
_L3:
        ProductListEntityContainer productlistentitycontainer = d(response);
        flag = flag2;
        if (productlistentitycontainer != null)
        {
            if (c() != null)
            {
                ((z)c()).a(productlistentitycontainer, i);
            }
            flag = false;
        }
_L2:
        if (!flag) goto _L6; else goto _L5
_L5:
        if (j != -2) goto _L8; else goto _L7
_L7:
        ae.a(a, "Task cancelled");
_L6:
        return;
_L4:
        if (i == 23)
        {
            Object obj = d(response);
            if (obj != null)
            {
                flag = flag1;
                if (c() != null)
                {
                    ((z)c()).b(((ProductListEntityContainer) (obj)), i);
                    flag = flag1;
                }
            } else
            {
                flag = true;
            }
        } else
        {
            flag = flag2;
            if (i == 29)
            {
                obj = c(response);
                flag = flag2;
                if (obj != null)
                {
                    if (c() != null)
                    {
                        ((z)c()).a(((ProductList) (obj)), i);
                    }
                    flag = false;
                }
            }
        }
        continue; /* Loop/switch isn't completed */
_L8:
        if (j != -1)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (c() == null) goto _L6; else goto _L9
_L9:
        ((z)c()).a(com.jcp.f.a.a(b(), response), i);
        return;
        if (c() == null) goto _L6; else goto _L10
_L10:
        ((z)c()).a(ErrorMessageUtil.getErrorMessageFromJSONResponse(response), i);
        return;
        if (true) goto _L2; else goto _L11
_L11:
    }

    public void a(String s)
    {
        b = new c(b(), this);
        b.b(s);
        b.a(true);
        b.a(23);
        b.b(0);
        b.execute(new String[0]);
    }

    public void b(String s)
    {
        if (b != null && b.c() == 16)
        {
            b.b();
            b.cancel(true);
        }
        b = new c(b(), this);
        b.b(s);
        b.a(true);
        b.a(16);
        b.b(0);
        b.execute(new String[0]);
    }

}
