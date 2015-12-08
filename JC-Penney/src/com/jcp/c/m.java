// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.c;

import android.content.Context;
import android.text.TextUtils;
import com.jcp.b.b;
import com.jcp.e.i;
import com.jcp.e.w;
import com.jcp.errorstatus.ErrorMessageUtil;
import com.jcp.f.a;
import com.jcp.http.c;
import com.jcp.model.Coupons;
import com.jcp.pojo.CouponsPojo;
import com.jcp.pojo.Response;
import com.jcp.util.aa;
import com.jcp.util.ae;

// Referenced classes of package com.jcp.c:
//            b

public final class m extends com.jcp.c.b
    implements w
{

    private static final String a = com/jcp/c/m.getCanonicalName();

    public m(Context context)
    {
        a(context);
    }

    private Coupons[] a(String s)
    {
        s = (CouponsPojo)aa.a(s, com/jcp/pojo/CouponsPojo);
        if (s != null)
        {
            return s.getCoupons();
        } else
        {
            return null;
        }
    }

    public void a()
    {
        String s = b.Z();
        c c1 = new c(b(), this);
        c1.b(s);
        c1.a(true);
        c1.a(35);
        c1.b(0);
        c1.execute(new String[0]);
    }

    public void a(i j)
    {
        a(((com.jcp.e.f) (j)));
    }

    public void a(Response response)
    {
        int j = response.getReJcpRequestTypes();
        int k = response.getStatusCode();
        response = response.getResponseBody();
        ae.a(a, (new StringBuilder()).append(j).append(" ").append(k).append(" ").append(response).toString());
        if (c() != null && j == 35)
        {
            boolean flag1 = true;
            boolean flag = flag1;
            if (com.jcp.http.b.a(k))
            {
                Coupons acoupons[] = a(((String) (response)));
                flag = flag1;
                if (acoupons != null)
                {
                    if (c() != null)
                    {
                        ((i)c()).a(acoupons, j);
                    }
                    flag = false;
                }
            }
            if (flag)
            {
                if (k == -1)
                {
                    if (c() != null)
                    {
                        ((i)c()).a(com.jcp.f.a.a(b(), response), j);
                    }
                } else
                {
                    if (!TextUtils.isEmpty(response))
                    {
                        response = ErrorMessageUtil.getErrorMessageFromJSONResponse(response);
                    } else
                    {
                        response = null;
                    }
                    if (c() != null)
                    {
                        ((i)c()).a(response, j);
                        return;
                    }
                }
            }
        }
    }

}
