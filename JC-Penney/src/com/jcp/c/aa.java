// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.c;

import android.content.Context;
import android.text.TextUtils;
import com.jcp.JCP;
import com.jcp.e.ai;
import com.jcp.e.e;
import com.jcp.e.w;
import com.jcp.errorstatus.ErrorMessageUtil;
import com.jcp.f.a;
import com.jcp.http.b;
import com.jcp.http.c;
import com.jcp.model.OrderItemsDetails;
import com.jcp.model.Promotions;
import com.jcp.pojo.Response;
import com.jcp.util.ae;
import java.lang.ref.WeakReference;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.jcp.c:
//            b

public final class aa extends com.jcp.c.b
    implements w
{

    private static final String a = com/jcp/c/aa.getSimpleName();
    private WeakReference b;
    private WeakReference c;
    private WeakReference d;

    public aa(Context context)
    {
        b = new WeakReference(null);
        c = new WeakReference(null);
        d = new WeakReference(null);
        a(context);
    }

    private void a(int i, int j, String s)
    {
        if (g() == null) goto _L2; else goto _L1
_L1:
        if (!com.jcp.http.b.a(j))
        {
            break MISSING_BLOCK_LABEL_106;
        }
        if (i != 50 && i != 58) goto _L4; else goto _L3
_L3:
        g().a(j, i);
_L2:
        return;
_L4:
        if (i == 70 || i == 69)
        {
            g().b(j, i);
            return;
        }
        if (i == 59)
        {
            g().b(e(s), i);
            return;
        }
        s = d(s);
        if (s == null) goto _L2; else goto _L5
_L5:
        g().a(s, i);
        return;
        if (j == -1)
        {
            if (i == 70 || i == 69)
            {
                g().a(com.jcp.f.a.a(s), j, i);
                return;
            } else
            {
                g().a(com.jcp.f.a.a(s), i);
                return;
            }
        }
        if (i == 52)
        {
            g().a(com.jcp.f.a.a(s), j, i);
            return;
        } else
        {
            g().a(com.jcp.f.a.a(s), i);
            return;
        }
    }

    private void a(String s, boolean flag, int i, int j, JSONObject jsonobject)
    {
        c c1 = new c(b(), this);
        if (jsonobject != null)
        {
            c1.a(jsonobject);
        }
        c1.b(s);
        c1.a(flag);
        c1.b(i);
        c1.a(j);
        c1.execute(new String[0]);
    }

    private void b(int i, int j, String s)
    {
label0:
        {
            if (f() != null)
            {
                if (!com.jcp.http.b.a(j))
                {
                    break label0;
                }
                JCP.a(null);
                f().a(j, s, i);
            }
            return;
        }
        f().c(j, com.jcp.f.a.a(s));
    }

    private OrderItemsDetails c(String s)
    {
        return (OrderItemsDetails)com.jcp.util.aa.a(s, com/jcp/model/OrderItemsDetails);
    }

    private void c(int i, int j, String s)
    {
label0:
        {
            if (e() != null)
            {
                if (!com.jcp.http.b.a(j))
                {
                    break label0;
                }
                JCP.a(null);
                e().f(j, i);
            }
            return;
        }
        e().a(com.jcp.f.a.a(s), j, i);
    }

    private Promotions d(String s)
    {
        return (Promotions)com.jcp.util.aa.a(s, com/jcp/model/Promotions);
    }

    private void d(int i, int j, String s)
    {
        if (!com.jcp.http.b.a(j)) goto _L2; else goto _L1
_L1:
        if (e() == null) goto _L4; else goto _L3
_L3:
        e().a(j, i);
        JCP.a(null);
_L6:
        return;
_L4:
        if (f() != null)
        {
            f().a(j, i);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (e() != null)
        {
            e().a(j, i, com.jcp.f.a.a(s));
            return;
        }
        if (f() != null)
        {
            f().d(j, com.jcp.f.a.a(s));
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    private String e(String s)
    {
        JSONArray jsonarray;
        int j;
        jsonarray = new JSONArray(s);
        j = jsonarray.length();
        int i;
        s = null;
        i = 0;
_L2:
        Object obj;
        obj = s;
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = jsonarray.getJSONObject(i).getString("name");
        i++;
        s = ((String) (obj));
        if (true) goto _L2; else goto _L1
        obj;
        s = null;
_L4:
        ae.a(a, "JSONException", ((Exception) (obj)));
        obj = s;
_L1:
        return ((String) (obj));
        obj;
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void e(int i, int j, String s)
    {
label0:
        {
            boolean flag1 = true;
            if (e() != null)
            {
                boolean flag = flag1;
                if (com.jcp.http.b.a(j))
                {
                    OrderItemsDetails orderitemsdetails = c(s);
                    flag = flag1;
                    if (orderitemsdetails != null)
                    {
                        e().a(orderitemsdetails, i);
                        flag = false;
                    }
                }
                if (flag)
                {
                    if (j != -1)
                    {
                        break label0;
                    }
                    e().c(s, i);
                }
            }
            return;
        }
        String s1 = null;
        if (!TextUtils.isEmpty(s))
        {
            s1 = ErrorMessageUtil.getErrorMessageFromJSONResponse(s);
        }
        e().c(s1, i);
    }

    public void a()
    {
        b(false);
    }

    public void a(com.jcp.e.a a1)
    {
        b = new WeakReference(a1);
    }

    public void a(ai ai1)
    {
        c = new WeakReference(ai1);
    }

    public void a(e e1)
    {
        d = new WeakReference(e1);
    }

    public void a(Response response)
    {
        int i;
        int j;
        i = response.getReJcpRequestTypes();
        j = response.getStatusCode();
        response = response.getResponseBody();
        ae.d(a, (new StringBuilder()).append(i).append(" StatusCode : ").append(j).append(" Response : ").append(response).toString());
        i;
        JVM INSTR lookupswitch 14: default 176
    //                   19: 201
    //                   21: 257
    //                   40: 265
    //                   41: 265
    //                   42: 265
    //                   48: 185
    //                   50: 273
    //                   51: 273
    //                   52: 273
    //                   58: 273
    //                   59: 273
    //                   65: 193
    //                   69: 273
    //                   70: 273;
           goto _L1 _L2 _L3 _L4 _L4 _L4 _L5 _L6 _L6 _L6 _L6 _L6 _L7 _L6 _L6
_L1:
        ae.d(a, "Unknown request type");
_L9:
        return;
_L5:
        e(i, j, response);
        return;
_L7:
        d(i, j, response);
        return;
_L2:
        if (e() == null) goto _L9; else goto _L8
_L8:
        if (j == 201 || j == 200 || j == 204)
        {
            e().d(j, i);
            JCP.a(null);
            return;
        } else
        {
            e().e(j, i);
            return;
        }
_L3:
        c(i, j, response);
        return;
_L4:
        b(i, j, response);
        return;
_L6:
        a(i, j, ((String) (response)));
        return;
    }

    public void a(String s)
    {
        a(com.jcp.b.b.r(s), false, 3, 21, null);
    }

    public void a(String s, int i)
    {
        a(com.jcp.b.b.A(s), false, 3, i, null);
    }

    public void a(String s, int i, boolean flag)
    {
        a(com.jcp.b.b.A(s), flag, 3, i, null);
    }

    public void a(String s, String s1, String s2)
    {
        c c1 = new c(b(), this);
        if (s != null)
        {
            c1.a(s);
        }
        c1.b(com.jcp.b.b.a(s1, s2));
        c1.a(false);
        c1.b(2);
        c1.a(19);
        c1.execute(new String[0]);
    }

    public void a(String s, String s1, String s2, boolean flag)
    {
        String s3 = com.jcp.b.b.ad();
        JSONObject jsonobject = new JSONObject();
        JSONArray jsonarray = new JSONArray();
        JSONObject jsonobject1 = new JSONObject();
        if (!TextUtils.isEmpty(s1))
        {
            jsonobject1.put("serialNumber", s1);
        }
        jsonobject1.put("type", s2);
        jsonobject1.put("code", s);
        jsonarray.put(jsonobject1);
        jsonobject.put("promotions", jsonarray);
        ae.d(a, (new StringBuilder()).append("applyCoupon request : ").append(jsonobject.toString()).toString());
        s = new c(b(), this);
        s.b(s3);
        s.a(flag);
        s.a(jsonobject.toString());
        s.b(1);
        if (!"REWARDS".equalsIgnoreCase(s2))
        {
            break MISSING_BLOCK_LABEL_183;
        }
        s.a(50);
_L1:
        s.execute(new String[0]);
        return;
        try
        {
            s.a(58);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return;
        }
          goto _L1
    }

    public void a(String s, boolean flag)
    {
        a(com.jcp.b.b.e(s), flag, 0, 48, null);
    }

    public void a(JSONObject jsonobject, String s)
    {
        a(com.jcp.b.b.r(s), false, 2, 65, jsonobject);
    }

    public void a(boolean flag)
    {
        a(com.jcp.b.b.n(), flag, 0, 48, null);
    }

    public void b(String s)
    {
        a(s, false, 3, 41, null);
    }

    public void b(JSONObject jsonobject, String s)
    {
        a(com.jcp.b.b.u(s), false, 2, 65, jsonobject);
    }

    public void b(boolean flag)
    {
        a(com.jcp.b.b.p(), flag, 0, 51, null);
    }

    public void c(JSONObject jsonobject, String s)
    {
        a(com.jcp.b.b.d(s), false, 2, 42, jsonobject);
    }

    public void d()
    {
        a(com.jcp.b.b.Y(), false, 0, 40, null);
    }

    public com.jcp.e.a e()
    {
        return (com.jcp.e.a)b.get();
    }

    public ai f()
    {
        return (ai)c.get();
    }

    public e g()
    {
        return (e)d.get();
    }

}
