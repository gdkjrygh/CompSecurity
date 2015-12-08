// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.c;

import android.content.Context;
import com.jcp.b.b;
import com.jcp.e.w;
import com.jcp.http.c;
import com.jcp.pojo.Response;
import org.json.JSONObject;

// Referenced classes of package com.jcp.c:
//            b

public final class ae extends com.jcp.c.b
    implements w
{

    private com.jcp.e.ae a;

    public ae(Context context)
    {
        a(context);
    }

    private void a(int i, int j, JSONObject jsonobject)
    {
        c c1 = new c(b(), this);
        c1.b(b.A());
        c1.a(i);
        if (jsonobject != null)
        {
            c1.a(jsonobject);
        }
        c1.b(j);
        c1.execute(new String[0]);
    }

    public void a(com.jcp.e.ae ae1)
    {
        a = ae1;
    }

    public void a(Response response)
    {
        int i = response.getReJcpRequestTypes();
        int j = response.getStatusCode();
        if (i == 78 && a != null)
        {
            a.a(j, null);
        }
    }

    public void a(String s, boolean flag)
    {
        JSONObject jsonobject = new JSONObject();
        String s1;
        if (flag)
        {
            s1 = s;
        } else
        {
            s1 = "";
        }
        jsonobject.put("emailAddress", s1);
        if (flag)
        {
            s = "";
        }
        try
        {
            jsonobject.put("phoneNumber", s);
            s = new JSONObject();
            s.put("user", jsonobject);
            s.put("code", "AndroidAppDownload");
            a(78, 1, ((JSONObject) (s)));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            a.a(401, null);
        }
        return;
    }
}
