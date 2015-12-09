// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.c;

import android.content.Context;
import android.text.TextUtils;
import com.jcp.b.b;
import com.jcp.e.n;
import com.jcp.e.w;
import com.jcp.errorstatus.ErrorMessageUtil;
import com.jcp.http.c;
import com.jcp.pojo.Accordion;
import com.jcp.pojo.HomePojo;
import com.jcp.pojo.Response;
import com.jcp.util.aa;
import com.jcp.util.ae;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package com.jcp.c:
//            b

public final class o extends com.jcp.c.b
    implements w
{

    private static final String a = com/jcp/c/o.getSimpleName();

    public o(Context context)
    {
        a(context);
    }

    private Accordion[] a(String s)
    {
        s = (HomePojo)aa.a(s, com/jcp/pojo/HomePojo);
        if (s != null)
        {
            return s.getAccordion();
        } else
        {
            return null;
        }
    }

    private Accordion[] a(Accordion aaccordion[])
    {
        int i = 0;
_L3:
        String s;
        if (i >= aaccordion.length)
        {
            break MISSING_BLOCK_LABEL_113;
        }
        s = aaccordion[i].getTitleText();
        if (TextUtils.isEmpty(s) || !s.contains("HOME CATALOG")) goto _L2; else goto _L1
_L1:
        aaccordion = new ArrayList(Arrays.asList(aaccordion));
        if (-1 != i)
        {
            Accordion accordion = (Accordion)aaccordion.remove(i);
            ae.e(a, (new StringBuilder()).append("Removed ").append(accordion.getTitleText()).append(" from Accordion").toString());
        }
        return (Accordion[])aaccordion.toArray(new Accordion[0]);
_L2:
        i++;
          goto _L3
        i = -1;
          goto _L1
    }

    public void a()
    {
        String s = b.H();
        c c1 = new c(b(), this);
        c1.b(s);
        c1.a(true);
        c1.a(14);
        c1.b(0);
        c1.execute(new String[0]);
    }

    public void a(n n1)
    {
        a(((com.jcp.e.f) (n1)));
    }

    public void a(Response response)
    {
        boolean flag;
        boolean flag1;
        int i;
        int j;
        i = response.getReJcpRequestTypes();
        j = response.getStatusCode();
        response = response.getResponseBody();
        ae.d(a, (new StringBuilder()).append(i).append(" ").append(j).append(" ").append(response).toString());
        flag = true;
        flag1 = true;
        if (c() == null || TextUtils.isEmpty(response)) goto _L2; else goto _L1
_L1:
        if (!com.jcp.http.b.a(j)) goto _L4; else goto _L3
_L3:
        if (i == 14)
        {
            response = a(((String) (response)));
            flag = flag1;
            if (response != null)
            {
                flag = flag1;
                if (response.length > 0)
                {
                    response = a(((Accordion []) (response)));
                    if (c() != null)
                    {
                        ((n)c()).a(response, i);
                    }
                    flag = false;
                }
            }
            response = null;
        } else
        {
            response = null;
        }
        if (flag && c() != null)
        {
            ((n)c()).a(response, i);
        }
_L6:
        return;
_L4:
        if (j != -1)
        {
            response = ErrorMessageUtil.getErrorMessageFromJSONResponse(response);
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (!com.jcp.http.b.a(j) || i != 14 || c() == null) goto _L6; else goto _L5
_L5:
        ((n)c()).a(new Accordion[0], i);
        return;
        if (true) goto _L8; else goto _L7
_L8:
        break MISSING_BLOCK_LABEL_141;
_L7:
    }

}
