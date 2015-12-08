// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.c;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.jcp.JCP;
import com.jcp.b.b;
import com.jcp.e.w;
import com.jcp.errorstatus.ErrorMessageEntityContainer;
import com.jcp.f.a;
import com.jcp.http.c;
import com.jcp.model.CardDetails;
import com.jcp.model.GetAddressResponseModel;
import com.jcp.pojo.GetAccountResponse;
import com.jcp.pojo.ProfilePojo;
import com.jcp.pojo.Response;
import com.jcp.util.aa;
import com.jcp.util.ae;
import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.jcp.c:
//            b

public final class q extends com.jcp.c.b
    implements w
{

    private static final String a = com/jcp/c/q.getName();
    private boolean b;
    private boolean c;

    public q(Context context)
    {
        a(context);
    }

    private CardDetails a(JSONObject jsonobject)
    {
        Object obj = new CardDetails();
        if (jsonobject.has("type"))
        {
            ((CardDetails) (obj)).setType(jsonobject.optString("type"));
        }
        if (jsonobject.has("lastFour"))
        {
            ((CardDetails) (obj)).setCardNumber(jsonobject.optString("lastFour"));
        }
        if (jsonobject.has("expiryMonth"))
        {
            ((CardDetails) (obj)).setCardMM(jsonobject.optString("expiryMonth"));
        }
        if (jsonobject.has("expiryYear"))
        {
            ((CardDetails) (obj)).setCardYY(jsonobject.optString("expiryYear"));
        }
        if (jsonobject.has("isDefault"))
        {
            ((CardDetails) (obj)).setDefault(jsonobject.optBoolean("isDefault"));
        }
        if (jsonobject.has("id"))
        {
            ((CardDetails) (obj)).setCardId(jsonobject.optString("id"));
        }
        if (jsonobject.has("address"))
        {
            JSONObject jsonobject1 = jsonobject.getJSONObject("address");
            if (jsonobject.has("id"))
            {
                ((CardDetails) (obj)).setAddressid(jsonobject1.optString("id"));
            }
        }
        if (jsonobject.has("url"))
        {
            ((CardDetails) (obj)).setUrl(jsonobject.optString("url"));
        }
        return ((CardDetails) (obj));
        obj;
        jsonobject = null;
_L2:
        ((JSONException) (obj)).printStackTrace();
        return jsonobject;
        JSONException jsonexception;
        jsonexception;
        jsonobject = ((JSONObject) (obj));
        obj = jsonexception;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private void a(String s, int i, int j, Map map)
    {
        c c1 = new c(b(), this);
        c1.a(b);
        c1.b(s);
        c1.a(i);
        if (map != null)
        {
            c1.a(map);
        }
        c1.b(j);
        if (c)
        {
            c1.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
            return;
        } else
        {
            c1.execute(new String[0]);
            return;
        }
    }

    private ProfilePojo[] c(String s)
    {
        return (ProfilePojo[])aa.a(s, [Lcom/jcp/pojo/ProfilePojo;);
    }

    private GetAddressResponseModel[] d(String s)
    {
        return (GetAddressResponseModel[])aa.a(new InputStreamReader(new ByteArrayInputStream(s.getBytes())), [Lcom/jcp/model/GetAddressResponseModel;);
    }

    private GetAccountResponse e(String s)
    {
        s = (GetAccountResponse)aa.a(s, com/jcp/pojo/GetAccountResponse);
        JCP.a(s);
        return s;
    }

    private List f(String s)
    {
        ArrayList arraylist;
        arraylist = new ArrayList();
        if (TextUtils.isEmpty(s.trim()))
        {
            break MISSING_BLOCK_LABEL_81;
        }
        s = new JSONArray(s);
        int i = 0;
_L1:
        JSONObject jsonobject;
        if (i >= s.length())
        {
            break MISSING_BLOCK_LABEL_81;
        }
        jsonobject = s.getJSONObject(i);
        if (jsonobject == null)
        {
            break MISSING_BLOCK_LABEL_62;
        }
        arraylist.add(a(jsonobject));
        i++;
          goto _L1
        s;
        ae.a(a, "Exception parsing payment card info", s);
        return arraylist;
    }

    public void a()
    {
        a(com.jcp.b.b.q(), 7, 0, null);
    }

    public void a(int i)
    {
        a(com.jcp.b.b.E(), i, 0, null);
    }

    public void a(Context context, GetAccountResponse getaccountresponse)
    {
        if (context != null && getaccountresponse != null)
        {
            context = context.getSharedPreferences("MyPrefs", 0).edit();
            context.putString("userID", getaccountresponse.getId());
            context.putString("firstName", getaccountresponse.getFirstName());
            context.putString("lastName", getaccountresponse.getLastName());
            context.putString("email", getaccountresponse.getEmail());
            context.apply();
        }
    }

    public void a(com.jcp.e.aa aa1)
    {
        a(((com.jcp.e.f) (aa1)));
    }

    public void a(Response response)
    {
        int i;
        int j;
        i = response.getReJcpRequestTypes();
        j = response.getStatusCode();
        response = response.getResponseBody();
        if (!com.jcp.http.b.a(j)) goto _L2; else goto _L1
_L1:
        i;
        JVM INSTR lookupswitch 8: default 96
    //                   6: 97
    //                   7: 123
    //                   8: 149
    //                   9: 175
    //                   11: 201
    //                   12: 201
    //                   13: 201
    //                   47: 97;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L8 _L8 _L4
_L3:
        return;
_L4:
        if (c() != null)
        {
            ((com.jcp.e.aa)c()).a(d(response), i);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        if (c() != null)
        {
            ((com.jcp.e.aa)c()).a(e(response), i);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        if (c() != null)
        {
            ((com.jcp.e.aa)c()).a(f(response), i);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L7:
        if (c() != null)
        {
            ((com.jcp.e.aa)c()).a_(c(response), i);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L8:
        if (c() != null)
        {
            ((com.jcp.e.aa)c()).a_(response, i);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        response = com.jcp.f.a.a(response);
        if (response != null && response.getErrorMessage() != null && c() != null)
        {
            ((com.jcp.e.aa)c()).a(response.getErrorCode(), response.getErrorMessage(), i);
            return;
        }
        if (true) goto _L3; else goto _L9
_L9:
    }

    public void a(String s)
    {
        a(com.jcp.b.b.g(s), 11, 3, null);
    }

    public void a(Map map, String s)
    {
        a(s, 13, 2, map);
    }

    public void a(boolean flag)
    {
        b = flag;
    }

    public void b(String s)
    {
        a(com.jcp.b.b.h(s), 12, 3, null);
    }

    public void b(boolean flag)
    {
        c = flag;
    }

    public void d()
    {
        a(com.jcp.b.b.F(), 8, 0, null);
    }

    public void e()
    {
        a(com.jcp.b.b.V(), 9, 0, null);
    }

}
