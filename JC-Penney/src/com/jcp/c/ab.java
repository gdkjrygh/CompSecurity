// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.c;

import android.content.Context;
import android.text.TextUtils;
import com.jcp.b.b;
import com.jcp.e.ac;
import com.jcp.e.af;
import com.jcp.e.w;
import com.jcp.e.y;
import com.jcp.f.a;
import com.jcp.http.c;
import com.jcp.pojo.Response;
import com.jcp.productentity.ProductEntityContainer;
import com.jcp.productentity.RecommendationsEntityContainer;
import com.jcp.productentity.sephoraproductentity.BazaarvoiceEntityContainer;
import com.jcp.storepickup.pojo.StorePickUp;
import com.jcp.util.aa;
import com.jcp.util.ae;
import java.lang.ref.WeakReference;

// Referenced classes of package com.jcp.c:
//            b

public final class ab extends com.jcp.c.b
    implements w
{

    private static final String a = com/jcp/c/ab.getName();
    private WeakReference b;
    private WeakReference c;
    private WeakReference d;

    public ab(Context context)
    {
        b = new WeakReference(null);
        c = new WeakReference(null);
        d = new WeakReference(null);
        a(context);
    }

    private void a(String s, int i)
    {
        c c1 = new c(b(), this);
        c1.b(s);
        c1.a(i);
        c1.a(true);
        c1.b(0);
        c1.execute(new String[0]);
    }

    private RecommendationsEntityContainer b(String s)
    {
        s = (RecommendationsEntityContainer[])aa.a(s, [Lcom/jcp/productentity/RecommendationsEntityContainer;);
        if (s != null && s.length > 0)
        {
            return s[0];
        } else
        {
            return null;
        }
    }

    private String b(String s, String s1, boolean flag, boolean flag1)
    {
        if (!TextUtils.isEmpty(s1) && !flag)
        {
            return com.jcp.b.b.b(s1, flag1);
        } else
        {
            return com.jcp.b.b.a(s, flag1);
        }
    }

    private BazaarvoiceEntityContainer c(String s)
    {
        return (BazaarvoiceEntityContainer)aa.a(s, com/jcp/productentity/sephoraproductentity/BazaarvoiceEntityContainer);
    }

    public ProductEntityContainer a(String s)
    {
        return (ProductEntityContainer)aa.a(s, com/jcp/productentity/ProductEntityContainer);
    }

    public void a(ac ac1)
    {
        c = new WeakReference(ac1);
    }

    public void a(af af1)
    {
        d = new WeakReference(af1);
    }

    public void a(y y1)
    {
        b = new WeakReference(y1);
    }

    public void a(Response response)
    {
        this;
        JVM INSTR monitorenter ;
        int i;
        int j;
        i = response.getReJcpRequestTypes();
        j = response.getStatusCode();
        response = response.getResponseBody();
        boolean flag1;
        boolean flag2;
        boolean flag3;
        flag2 = true;
        flag3 = true;
        flag1 = true;
        ae.c(a, (new StringBuilder()).append(i).append(" ").append(j).append(" ").append(response).toString());
        i;
        JVM INSTR lookupswitch 6: default 520
    //                   34: 424
    //                   36: 139
    //                   38: 238
    //                   39: 331
    //                   55: 139
    //                   56: 139;
           goto _L1 _L2 _L3 _L4 _L5 _L3 _L3
_L1:
        ae.a(a, "Response not handled");
_L7:
        this;
        JVM INSTR monitorexit ;
        return;
_L3:
        if (b == null || b.get() == null) goto _L7; else goto _L6
_L6:
        boolean flag = flag1;
        if (!com.jcp.http.b.a(j)) goto _L9; else goto _L8
_L8:
        Object obj = a(((String) (response)));
        flag = flag1;
        if (obj == null) goto _L9; else goto _L10
_L10:
        ((y)b.get()).a(((ProductEntityContainer) (obj)), i, response);
        flag = false;
_L9:
        if (!flag) goto _L7; else goto _L11
_L11:
        ((y)b.get()).c(com.jcp.f.a.a(b(), response), i);
          goto _L7
        response;
        throw response;
_L4:
        if (c == null || c.get() == null) goto _L7; else goto _L12
_L12:
        flag = flag2;
        if (!com.jcp.http.b.a(j)) goto _L14; else goto _L13
_L13:
        obj = b(response);
        flag = flag2;
        if (obj == null) goto _L14; else goto _L15
_L15:
        ((ac)c.get()).a(((RecommendationsEntityContainer) (obj)), i);
        flag = false;
_L14:
        if (!flag) goto _L7; else goto _L16
_L16:
        ((ac)c.get()).f(com.jcp.f.a.a(b(), response), i);
          goto _L7
_L5:
        if (d == null || d.get() == null) goto _L7; else goto _L17
_L17:
        flag = flag3;
        if (!com.jcp.http.b.a(j)) goto _L19; else goto _L18
_L18:
        obj = c(response);
        flag = flag3;
        if (obj == null) goto _L19; else goto _L20
_L20:
        ((af)d.get()).a(((BazaarvoiceEntityContainer) (obj)), i);
        flag = false;
_L19:
        if (!flag) goto _L7; else goto _L21
_L21:
        ((af)d.get()).e(com.jcp.f.a.a(b(), response), i);
          goto _L7
_L2:
        if (b == null || b.get() == null) goto _L7; else goto _L22
_L22:
        if (!com.jcp.http.b.a(j)) goto _L24; else goto _L23
_L23:
        obj = (StorePickUp)aa.a(response, com/jcp/storepickup/pojo/StorePickUp);
        if (obj == null) goto _L24; else goto _L25
_L25:
        ((y)b.get()).a(((StorePickUp) (obj)), i);
        flag = false;
_L27:
        if (!flag) goto _L7; else goto _L26
_L26:
        ((y)b.get()).c(com.jcp.f.a.a(b(), response), i);
          goto _L7
_L24:
        flag = true;
          goto _L27
    }

    public void a(String s, String s1)
    {
        a(com.jcp.b.b.b(s1, s), 34);
    }

    public void a(String s, String s1, int i)
    {
        a(com.jcp.b.b.a(s, s1, i), 39);
    }

    public void a(String s, String s1, boolean flag)
    {
        a(b(s, s1, flag, b.i), 55);
    }

    public void a(String s, String s1, boolean flag, boolean flag1)
    {
        a(b(s, s1, flag, flag1), 36);
    }

    public void a(String s, boolean flag)
    {
        a(com.jcp.b.b.c(s, flag), 38);
    }

    public void b(String s, String s1, boolean flag)
    {
        a(b(s, s1, flag, b.i), 56);
    }

}
