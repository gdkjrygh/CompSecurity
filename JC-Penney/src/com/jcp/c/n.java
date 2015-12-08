// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.c;

import android.content.Context;
import android.text.Html;
import com.jcp.e.aq;
import com.jcp.e.k;
import com.jcp.e.w;
import com.jcp.http.b;
import com.jcp.http.c;
import com.jcp.pojo.Response;
import com.jcp.storepickup.pojo.StorePickUp;
import com.jcp.util.aa;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.jcp.c:
//            b

public class n extends com.jcp.c.b
    implements w
{

    private String a;
    private WeakReference b;
    private WeakReference c;

    public n(Context context)
    {
        b = new WeakReference(null);
        c = new WeakReference(null);
        a(context);
    }

    private String b(String s)
    {
        String s1 = null;
        try
        {
            JSONObject jsonobject = new JSONObject(s);
            if (jsonobject.has("errorMessage"))
            {
                s1 = jsonobject.getString("errorMessage");
            }
        }
        catch (JSONException jsonexception)
        {
            return Html.fromHtml(s).toString();
        }
        return s1;
    }

    private StorePickUp c(String s)
    {
        return (StorePickUp)aa.a(s, com/jcp/storepickup/pojo/StorePickUp);
    }

    private JSONObject d(String s)
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("id", s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return jsonobject;
        }
        return jsonobject;
    }

    public k a()
    {
        return (k)b.get();
    }

    public void a(aq aq1)
    {
        c = new WeakReference(aq1);
    }

    public void a(k k1)
    {
        b = new WeakReference(k1);
    }

    public void a(Response response)
    {
        boolean flag;
        int i;
        int j;
        flag = false;
        i = response.getReJcpRequestTypes();
        j = response.getStatusCode();
        response = response.getResponseBody();
        if (!com.jcp.http.b.a(j)) goto _L2; else goto _L1
_L1:
        StorePickUp storepickup = c(response);
        i;
        JVM INSTR lookupswitch 4: default 76
    //                   30: 99
    //                   34: 129
    //                   72: 155
    //                   73: 181;
           goto _L3 _L4 _L5 _L6 _L7
_L3:
        flag = true;
_L9:
        if (flag)
        {
            a().a(b(response), i);
        }
_L2:
        return;
_L4:
        if (b == null || storepickup == null) goto _L3; else goto _L8
_L8:
        a().a(storepickup, i, a);
          goto _L9
_L5:
        if (b == null || storepickup == null) goto _L3; else goto _L10
_L10:
        a().a(storepickup, i);
          goto _L9
_L6:
        if (b == null || storepickup == null) goto _L3; else goto _L11
_L11:
        a().b(storepickup, i);
          goto _L9
_L7:
        if (c == null) goto _L3; else goto _L12
_L12:
        d().a(j);
          goto _L9
    }

    public void a(Double double1, Double double2)
    {
        a = "List";
        double1 = com.jcp.b.b.a(double1, double2);
        double2 = new c(b(), this);
        double2.b(double1);
        double2.a(30);
        double2.b(0);
        double2.execute(new String[0]);
    }

    public void a(Double double1, Double double2, Boolean boolean1, int i)
    {
        double1 = com.jcp.b.b.a(double1, double2, boolean1, i);
        double2 = new c(b(), this);
        double2.b(double1);
        double2.a(72);
        double2.b(0);
        double2.execute(new String[0]);
    }

    public void a(Double double1, Double double2, Integer integer)
    {
        a = "List";
        double1 = com.jcp.b.b.a(double1, double2, integer);
        double2 = new c(b(), this);
        double2.b(double1);
        double2.a(30);
        double2.b(0);
        double2.execute(new String[0]);
    }

    public void a(String s)
    {
        String s1 = com.jcp.b.b.o();
        c c1 = new c(b(), this);
        c1.b(s1);
        c1.a(d(s));
        c1.a(73);
        c1.b(2);
        c1.execute(new String[0]);
    }

    public void a(String s, Double double1, Double double2)
    {
        s = com.jcp.b.b.a(s, double1, double2);
        double1 = new c(b(), this);
        double1.b(s);
        double1.a(34);
        double1.b(0);
        double1.execute(new String[0]);
    }

    public void a(String s, boolean flag)
    {
        c c1 = new c(b(), this);
        c1.b(s);
        c1.a(flag);
        c1.a(30);
        c1.b(0);
        c1.execute(new String[0]);
    }

    public aq d()
    {
        return (aq)c.get();
    }
}
