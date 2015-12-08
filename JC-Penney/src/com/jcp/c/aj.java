// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.c;

import android.content.Context;
import com.jcp.e.ao;
import com.jcp.e.w;
import com.jcp.errorstatus.ErrorMessageUtil;
import com.jcp.http.b;
import com.jcp.http.c;
import com.jcp.model.ShippingStatus;
import com.jcp.pojo.Response;
import com.jcp.util.aa;
import com.jcp.util.ae;
import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;

// Referenced classes of package com.jcp.c:
//            b

public class aj extends com.jcp.c.b
    implements w
{

    private static final String a = com/jcp/c/aj.getName();

    public aj(Context context)
    {
        a(context);
    }

    private ShippingStatus a(String s)
    {
        return (ShippingStatus)aa.a(new InputStreamReader(new ByteArrayInputStream(s.getBytes())), com/jcp/model/ShippingStatus);
    }

    public static aj b(Context context)
    {
        return new aj(context);
    }

    public void a(ao ao1)
    {
        a(((com.jcp.e.f) (ao1)));
    }

    public void a(Response response)
    {
        int i = response.getReJcpRequestTypes();
        int j = response.getStatusCode();
        response = response.getResponseBody();
        if (i == 10)
        {
            boolean flag1 = true;
            boolean flag = flag1;
            if (com.jcp.http.b.a(j))
            {
                ae.a(a, (new StringBuilder()).append(i).append(" ").append(j).append(" ").append(response).toString());
                ShippingStatus shippingstatus = a(((String) (response)));
                flag = flag1;
                if (shippingstatus != null)
                {
                    if (c() != null)
                    {
                        ((ao)c()).a(shippingstatus, i);
                    }
                    flag = false;
                }
            }
            if (flag)
            {
                if (j == -1)
                {
                    if (c() != null)
                    {
                        ((ao)c()).d(response, i);
                    }
                } else
                if (c() != null)
                {
                    ((ao)c()).d(ErrorMessageUtil.getErrorMessageFromJSONResponse(response), i);
                    return;
                }
            }
        }
    }

    public void a(String s, String s1)
    {
        s = com.jcp.b.b.d(s, s1);
        s1 = new c(b(), this);
        s1.b(s);
        s1.a(10);
        s1.b(0);
        s1.execute(new String[0]);
    }

}
