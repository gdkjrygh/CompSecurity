// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.c;

import android.content.Context;
import android.text.TextUtils;
import com.jcp.e.w;
import com.jcp.errorstatus.ErrorMessageUtil;
import com.jcp.http.b;
import com.jcp.http.c;
import com.jcp.pojo.Response;
import com.jcp.util.ae;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.jcp.c:
//            b

public class ah extends com.jcp.c.b
    implements w
{

    private static final String a = com/jcp/c/ah.getName();

    public ah(Context context)
    {
        a(context);
    }

    private JSONObject b(String s, int i, String s1)
    {
        JSONObject jsonobject = new JSONObject();
        JSONArray jsonarray = new JSONArray();
        JSONObject jsonobject1 = new JSONObject();
        if (TextUtils.isEmpty(s1))
        {
            try
            {
                jsonobject1.put("ppId", s);
                jsonobject1.put("quantity", i);
                jsonobject.put("items", jsonarray.put(jsonobject1));
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                s.printStackTrace();
                return jsonobject;
            }
            return jsonobject;
        }
        try
        {
            jsonobject1.put("id", s1);
            jsonobject1.put("ppId", s);
            jsonobject1.put("quantity", i);
            jsonobject.put("items", jsonarray.put(jsonobject1));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return jsonobject;
        }
        return jsonobject;
    }

    public void a(com.jcp.e.ah ah1)
    {
        a(((com.jcp.e.f) (ah1)));
    }

    public void a(Response response)
    {
        int i;
        int j;
        i = response.getReJcpRequestTypes();
        j = response.getStatusCode();
        response = response.getResponseBody();
        if (i != 4) goto _L2; else goto _L1
_L1:
        if (!com.jcp.http.b.a(j)) goto _L4; else goto _L3
_L3:
        ae.a(a, (new StringBuilder()).append(i).append(" ").append(j).append(" ").append(response).toString());
        if (c() != null)
        {
            ((com.jcp.e.ah)c()).b(j, i);
        }
_L2:
        return;
_L4:
        if (j != -1)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (c() == null) goto _L2; else goto _L5
_L5:
        ((com.jcp.e.ah)c()).b(response, i);
        return;
        if (c() == null) goto _L2; else goto _L6
_L6:
        ((com.jcp.e.ah)c()).b(ErrorMessageUtil.getErrorMessageFromJSONResponse(response), i);
        return;
    }

    public void a(String s, int i, String s1)
    {
        String s2 = com.jcp.b.b.ab();
        c c1 = new c(b(), this);
        c1.b(s2);
        c1.a(b(s, i, s1));
        c1.a(4);
        c1.b(1);
        c1.execute(new String[0]);
    }

}
