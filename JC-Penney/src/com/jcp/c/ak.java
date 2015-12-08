// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.c;

import android.app.Activity;
import com.jcp.b.b;
import com.jcp.e.w;
import com.jcp.fragments.et;
import com.jcp.http.c;
import com.jcp.pojo.Response;
import com.jcp.storepickup.pojo.StorePickUp;
import com.jcp.util.aa;
import com.jcp.util.ae;
import java.lang.ref.WeakReference;

// Referenced classes of package com.jcp.c:
//            b

public class ak extends com.jcp.c.b
    implements w
{

    private static final String b = com/jcp/c/ak.getSimpleName();
    private WeakReference a;
    private boolean c;

    public ak(Activity activity, et et1)
    {
        a = new WeakReference(null);
        a(activity);
        a = new WeakReference(et1);
    }

    public void a(Response response)
    {
        int i;
        int j;
        i = response.getReJcpRequestTypes();
        j = response.getStatusCode();
        response = response.getResponseBody();
        if (a.get() == null) goto _L2; else goto _L1
_L1:
        i;
        JVM INSTR tableswitch 30 30: default 44
    //                   30 45;
           goto _L2 _L3
_L2:
        return;
_L3:
        if (j == 200)
        {
            ae.d(b, (new StringBuilder()).append("controller response=").append(response).toString());
            response = (StorePickUp)aa.a(response, com/jcp/storepickup/pojo/StorePickUp);
            if (response != null)
            {
                ((et)a.get()).a(response.getStores(), response.getPages(), c);
                return;
            }
        }
        if (true) goto _L2; else goto _L4
_L4:
    }

    public void a(String s, boolean flag, boolean flag1)
    {
        if (com.jcp.b.b.a(b()))
        {
            c = flag;
            c c1 = new c(b(), this);
            c1.a(30);
            c1.b(0);
            c1.b(com.jcp.b.b.n(s));
            c1.a(flag1);
            c1.execute(new String[0]);
        }
    }

}
