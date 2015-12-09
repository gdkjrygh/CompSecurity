// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.c;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.jcp.JCP;
import com.jcp.e.aj;
import com.jcp.e.al;
import com.jcp.e.u;
import com.jcp.e.w;
import com.jcp.errorstatus.ErrorMessageUtil;
import com.jcp.f.a;
import com.jcp.http.b;
import com.jcp.http.c;
import com.jcp.model.Session;
import com.jcp.pojo.Response;
import com.jcp.searchentity.SearchCityAndStateContainer;
import com.jcp.util.aa;
import com.jcp.util.ae;
import java.util.Map;

// Referenced classes of package com.jcp.c:
//            b

public final class l extends com.jcp.c.b
    implements w
{

    private static final String a = com/jcp/c/l.getName();
    private com.jcp.e.ae b;
    private u c;
    private boolean d;
    private aj e;

    public l(Context context)
    {
        a(context);
    }

    private Session a(String s)
    {
        return (Session)aa.a(s, com/jcp/model/Session);
    }

    private void a(int i, String s)
    {
        if (e == null) goto _L2; else goto _L1
_L1:
        if (!com.jcp.http.b.a(i)) goto _L4; else goto _L3
_L3:
        SearchCityAndStateContainer searchcityandstatecontainer = (SearchCityAndStateContainer)aa.a(s, com/jcp/searchentity/SearchCityAndStateContainer);
        if (searchcityandstatecontainer == null) goto _L4; else goto _L5
_L5:
        boolean flag;
        e.a(searchcityandstatecontainer);
        flag = false;
_L7:
        if (flag)
        {
            e.a(i, ErrorMessageUtil.getErrorMessageFromJSONResponse(s));
        }
_L2:
        return;
_L4:
        flag = true;
        if (true) goto _L7; else goto _L6
_L6:
    }

    private void a(Response response, int i, String s)
    {
        ae.c(a, (new StringBuilder()).append("Response :").append(response).toString());
        if (!com.jcp.http.b.a(i)) goto _L2; else goto _L1
_L1:
        Session session;
        response = null;
        if (!TextUtils.isEmpty(s))
        {
            response = com.jcp.f.a.a(s);
        }
        session = a(s);
        if (b != null)
        {
            b.a(i, response);
        }
        if (session == null) goto _L2; else goto _L3
_L3:
        boolean flag;
        if (c() != null)
        {
            ((al)c()).a(session);
        }
        flag = false;
_L5:
        if (flag && c() != null)
        {
            ((al)c()).a(i, ErrorMessageUtil.getErrorMessageFromJSONResponse(s));
        }
        return;
_L2:
        flag = true;
        if (true) goto _L5; else goto _L4
_L4:
    }

    private void b(int i, String s)
    {
        com.jcp.http.c.a();
        JCP.a(null);
        f();
        if (c != null)
        {
            c.b(i, com.jcp.f.a.a(s));
        }
    }

    private void b(boolean flag)
    {
        c c1 = new c(b(), this);
        c1.b(com.jcp.b.b.x());
        c1.a(flag);
        c1.b(0);
        c1.a(53);
        c1.execute(new String[0]);
    }

    private void c(int i, String s)
    {
        if (b != null)
        {
            b.a(i, com.jcp.f.a.a(s));
        }
    }

    private void d(int i, String s)
    {
        if (b != null)
        {
            b.a(i, com.jcp.f.a.a(s));
        }
    }

    private void f()
    {
        b().getSharedPreferences("MyPrefs", 0).edit().remove("firstName").remove("lastName").remove("email").remove("phone").remove("zip").apply();
    }

    public void a()
    {
        c c1 = new c(b(), this);
        c1.b(com.jcp.b.b.x());
        c1.a(1);
        c1.b(3);
        c1.execute(new String[0]);
    }

    public void a(com.jcp.e.ae ae1)
    {
        b = ae1;
    }

    public void a(aj aj1)
    {
        e = aj1;
    }

    public void a(al al1)
    {
        a(((com.jcp.e.f) (al1)));
    }

    public void a(u u1)
    {
        c = u1;
    }

    public void a(Response response)
    {
        String s;
        int i;
        int j;
        i = response.getReJcpRequestTypes();
        j = response.getStatusCode();
        s = response.getResponseBody();
        i;
        JVM INSTR lookupswitch 10: default 108
    //                   0: 109
    //                   1: 117
    //                   2: 125
    //                   3: 149
    //                   5: 141
    //                   6: 157
    //                   24: 133
    //                   53: 197
    //                   77: 206
    //                   83: 214;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L1:
        return;
_L2:
        c(j, s);
        return;
_L3:
        b(j, s);
        return;
_L4:
        d(j, s);
        return;
_L8:
        d(j, s);
        return;
_L6:
        d(j, s);
        return;
_L5:
        d(j, s);
        return;
_L7:
        ae.c(a, (new StringBuilder()).append(i).append(" ").append(j).append(" ").append(response).toString());
        return;
_L9:
        a(response, j, s);
        return;
_L10:
        a(j, s);
        return;
_L11:
        if (com.jcp.http.b.a(j) && b != null)
        {
            b.b(j, s);
            return;
        }
        if (true) goto _L1; else goto _L12
_L12:
    }

    public void a(String s, int i)
    {
        a(s, i, false);
    }

    public void a(String s, int i, boolean flag)
    {
        c c1 = new c(b(), this);
        c1.a(flag);
        c1.b(s);
        c1.a(77);
        c1.b(i);
        c1.execute(new String[0]);
    }

    public void a(String s, Map map, int i)
    {
        c c1 = new c(b(), this);
        c1.b(s);
        c1.a(map);
        c1.a(d);
        c1.a(0);
        c1.b(i);
        c1.execute(new String[0]);
    }

    public void a(Map map, String s)
    {
        c c1 = new c(b(), this);
        c1.b(s);
        c1.a(map);
        c1.a(3);
        c1.b(2);
        c1.execute(new String[0]);
    }

    public void a(boolean flag)
    {
        d = flag;
    }

    public void b(String s, Map map, int i)
    {
        c c1 = new c(b(), this);
        c1.b(s);
        c1.a(map);
        c1.a(d);
        c1.a(83);
        c1.b(i);
        c1.execute(new String[0]);
    }

    public void b(Map map, String s)
    {
        c c1 = new c(b(), this);
        c1.b(s);
        c1.a(map);
        c1.a(5);
        c1.b(2);
        c1.execute(new String[0]);
    }

    public void c(String s, Map map, int i)
    {
        c c1 = new c(b(), this);
        c1.b(s);
        c1.a(map);
        c1.a(2);
        c1.b(i);
        c1.execute(new String[0]);
    }

    public void d()
    {
        b(false);
    }

    public void d(String s, Map map, int i)
    {
        c c1 = new c(b(), this);
        c1.b(s);
        c1.a(map);
        c1.a(24);
        c1.a(false);
        c1.b(i);
        c1.execute(new String[0]);
    }

    public void e()
    {
        b(true);
    }

}
