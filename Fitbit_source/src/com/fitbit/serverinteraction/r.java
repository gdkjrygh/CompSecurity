// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.serverinteraction;

import com.fitbit.data.bl.exceptions.SearchEntityException;
import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import com.fitbit.data.bl.exceptions.ServerResponseException;
import com.fitbit.e.a;
import com.fitbit.serverinteraction.b.e;
import com.fitbit.serverinteraction.validators.f;
import com.fitbit.util.al;
import com.fitbit.util.t;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.fitbit.serverinteraction:
//            ServerGateway, o, RequestParametersBuilder, k

public class r
{

    public static final long a = -1L;
    e b;
    private final ServerGateway c;
    private final o d;

    public r(ServerGateway servergateway)
    {
        b = new e() {

            final r a;

            protected void a(JSONObject jsonobject)
                throws JSONException, ServerResponseException
            {
            }

            
            {
                a = r.this;
                super();
            }
        };
        d = servergateway.c();
        c = servergateway;
    }

    private JSONObject a(String s, String s1, long l, boolean flag, String s2)
        throws ServerCommunicationException, JSONException, SearchEntityException
    {
        String s3 = URLEncoder.encode(s, "UTF-8");
        s = s3;
_L1:
        s1 = String.format("%s/%s/select?q=%s&wt=%sjson&qt=%s_adv", new Object[] {
            d.o(), s1, s, s1, s1
        });
        UnsupportedEncodingException unsupportedencodingexception;
        if (flag)
        {
            s2 = String.format("(%s AND locale:%s)", new Object[] {
                "(accessLevel:1)", s2
            });
            s = s2;
            if (l != -1L)
            {
                s = String.format("(%s OR creatorId:%d)", new Object[] {
                    s2, Long.valueOf(l)
                });
            }
            s = (new StringBuilder()).append(s1).append("&fq=").append(t.a(s)).toString();
        } else
        {
            s = s1;
        }
        s1 = new RequestParametersBuilder();
        s1.a(s).a(com.fitbit.serverinteraction.ServerGateway.HttpMethods.a).a(f.e()).a(b);
        return (JSONObject)c.b(s1.a()).f();
        unsupportedencodingexception;
        com.fitbit.e.a.f("SOLR", "Unsupported Encoding", unsupportedencodingexception, new Object[0]);
          goto _L1
    }

    public JSONObject a(String s, long l)
        throws ServerCommunicationException, JSONException, SearchEntityException
    {
        return a(s, "food", l, true, al.e());
    }

    public JSONObject b(String s, long l)
        throws ServerCommunicationException, JSONException, SearchEntityException
    {
        return a(s, "activity", l, true, al.f());
    }

    public JSONObject c(String s, long l)
        throws ServerCommunicationException, JSONException, SearchEntityException
    {
        return a(s, "brand", l, false, null);
    }
}
