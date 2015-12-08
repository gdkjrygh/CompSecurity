// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.c;

import com.jcp.api.a.a;
import com.jcp.util.ae;
import java.util.Iterator;
import java.util.List;
import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

// Referenced classes of package com.jcp.c:
//            h, k

class i
    implements Callback
{

    final int a;
    final h b;

    i(h h1, int j)
    {
        b = h1;
        a = j;
        super();
    }

    public void a(List list, Response response)
    {
        com.jcp.c.h.a(b);
        if (list == null || h.d() == null) goto _L2; else goto _L1
_L1:
        list = list.iterator();
_L9:
        if (!list.hasNext()) goto _L2; else goto _L3
_L3:
        Iterator iterator;
        boolean flag;
        response = (a)list.next();
        iterator = h.d().iterator();
        flag = false;
_L7:
        k k1;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        k1 = (k)iterator.next();
        if (com.jcp.c.k.a(k1) == null || !com.jcp.c.k.a(k1).equalsIgnoreCase(response.d()))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (k.b(k1) != null && k.b(k1).equalsIgnoreCase(response.a()) && k.c(k1) != null && k.c(k1).equalsIgnoreCase(response.b())) goto _L5; else goto _L4
_L4:
        com.jcp.c.k.a(k1, response.a());
        k.b(k1, response.b());
        h.b(b);
        if (!com.jcp.c.h.a(b, response))
        {
            continue; /* Loop/switch isn't completed */
        }
        h.b(b, response);
_L2:
        return;
_L5:
        flag = true;
        if (true) goto _L7; else goto _L6
_L6:
        if (!flag)
        {
            h.d().add(new k(b, response));
            h.b(b);
            if (com.jcp.c.h.a(b, response))
            {
                h.b(b, response);
                return;
            }
        }
        if (true) goto _L9; else goto _L8
_L8:
    }

    public void failure(RetrofitError retrofiterror)
    {
        String s = h.e();
        StringBuilder stringbuilder = (new StringBuilder()).append("Retrofit call failed: ");
        if (retrofiterror != null)
        {
            retrofiterror = retrofiterror.getMessage();
        } else
        {
            retrofiterror = "null error";
        }
        ae.a(s, stringbuilder.append(retrofiterror).toString());
        if (a > 0)
        {
            com.jcp.c.h.a(b, a - 1);
        }
    }

    public void success(Object obj, Response response)
    {
        a((List)obj, response);
    }
}
