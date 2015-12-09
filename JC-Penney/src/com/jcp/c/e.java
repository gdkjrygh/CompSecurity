// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.c;

import android.content.Context;
import com.jcp.b.b;
import com.jcp.e.ap;
import com.jcp.e.w;
import com.jcp.errorstatus.ErrorMessageUtil;
import com.jcp.http.c;
import com.jcp.pojo.Response;
import com.jcp.storepickup.pojo.StorePickUp;
import com.jcp.util.aa;
import java.util.Map;

// Referenced classes of package com.jcp.c:
//            b

public final class e extends com.jcp.c.b
    implements w
{

    public e(Context context)
    {
        a(context);
    }

    public void a()
    {
        String s = com.jcp.b.b.V();
        c c1 = new c(b(), this);
        c1.b(0);
        c1.a(31);
        c1.b(s);
        c1.execute(new String[0]);
    }

    public void a(ap ap1)
    {
        a(((com.jcp.e.f) (ap1)));
    }

    public void a(Response response)
    {
        boolean flag;
        int i;
        int j;
        i = response.getReJcpRequestTypes();
        j = response.getStatusCode();
        response = response.getResponseBody();
        flag = true;
        if (!com.jcp.http.b.a(j)) goto _L2; else goto _L1
_L1:
        if (i != 31) goto _L4; else goto _L3
_L3:
        com.jcp.pojo.ProfilePojo aprofilepojo[] = (com.jcp.pojo.ProfilePojo[])aa.a(response, [Lcom/jcp/pojo/ProfilePojo;);
        if (c() != null)
        {
            ((ap)c()).a(aprofilepojo, i);
        }
_L11:
        flag = false;
_L2:
        if (!flag) goto _L6; else goto _L5
_L5:
        if (j != -1) goto _L8; else goto _L7
_L7:
        if (c() != null)
        {
            ((ap)c()).a(response, i);
        }
_L6:
        return;
_L4:
        if (i == 32)
        {
            if (c() != null)
            {
                ((ap)c()).b(response, i);
            }
        } else
        if (i == 33)
        {
            if (c() != null)
            {
                ((ap)c()).a(null, i);
            }
        } else
        if (i == 30)
        {
            StorePickUp storepickup = (StorePickUp)aa.a(response, com/jcp/storepickup/pojo/StorePickUp);
            if (c() != null)
            {
                ((ap)c()).a_(storepickup.getStores(), i);
            }
        }
        continue; /* Loop/switch isn't completed */
_L8:
        if (c() == null) goto _L6; else goto _L9
_L9:
        ((ap)c()).a(ErrorMessageUtil.getErrorMessageFromJSONResponse(response), i);
        return;
        if (true) goto _L11; else goto _L10
_L10:
    }

    public void a(String s)
    {
        c c1 = new c(b(), this);
        c1.a(30);
        c1.b(0);
        c1.b(com.jcp.b.b.n(s));
        c1.a(true);
        c1.execute(new String[0]);
    }

    public void a(Map map, String s)
    {
        s = com.jcp.b.b.s(s);
        c c1 = new c(b(), this);
        c1.b(1);
        c1.a(map);
        c1.a(32);
        c1.b(s);
        c1.execute(new String[0]);
    }

    public void b(String s)
    {
        s = com.jcp.b.b.t(s);
        c c1 = new c(b(), this);
        c1.b(3);
        c1.a(33);
        c1.b(s);
        c1.a(true);
        c1.execute(new String[0]);
    }
}
