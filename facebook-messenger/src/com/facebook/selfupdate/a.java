// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.selfupdate;

import com.facebook.http.protocol.f;
import com.facebook.http.protocol.n;
import com.facebook.http.protocol.r;
import com.facebook.http.protocol.t;
import com.google.common.a.hq;
import java.util.List;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.facebook.selfupdate:
//            AppServerParams, c

public class a
    implements f
{

    public a()
    {
    }

    private String b(AppServerParams appserverparams)
    {
        return (new StringBuilder()).append("{").append(JSONObject.quote("channel")).append(":").append(JSONObject.quote("SELECT update_check_minutes FROM application_release_channel WHERE app_id=app() ORDER BY update_check_minutes LIMIT 1")).append(", ").append(JSONObject.quote("release")).append(":").append(JSONObject.quote((new StringBuilder()).append("SELECT download_url, release_number, client_action, release_notes, application_name, application_version, allowed_networks, megaphone, file_mime_type, file_size FROM application_release WHERE app_id=app() AND release_number > ").append(appserverparams.b()).append(" AND release_package = \"").append(appserverparams.a()).append("\"").append(" AND match_client = 1").append(" ORDER BY ").append("release_number").append(" DESC").append(" LIMIT 1").toString())).append("}").toString();
    }

    public n a(AppServerParams appserverparams)
    {
        java.util.ArrayList arraylist = hq.b(2);
        arraylist.add(new BasicNameValuePair("queries", b(appserverparams)));
        arraylist.add(new BasicNameValuePair("format", "json"));
        return new n("appUpdateFQLGet", "GET", "method/fql.multiquery", arraylist, t.STRING);
    }

    public volatile n a(Object obj)
    {
        return a((AppServerParams)obj);
    }

    public c a(AppServerParams appserverparams, r r1)
    {
        appserverparams = null;
        JSONArray jsonarray = new JSONArray(r1.b());
        int i = 0;
        r1 = null;
        while (i < jsonarray.length()) 
        {
            JSONObject jsonobject = jsonarray.getJSONObject(i);
            Object obj;
            Object obj2;
            if (jsonobject.optString("name").equals("channel") && jsonobject.getJSONArray("fql_result_set").length() > 0)
            {
                obj2 = jsonobject.getJSONArray("fql_result_set").getJSONObject(0);
                obj = appserverparams;
            } else
            {
                obj = appserverparams;
                obj2 = r1;
                if (jsonobject.optString("name").equals("release"))
                {
                    obj = appserverparams;
                    obj2 = r1;
                    if (jsonobject.getJSONArray("fql_result_set").length() > 0)
                    {
                        obj = jsonobject.getJSONArray("fql_result_set").getJSONObject(0);
                        obj2 = r1;
                    }
                }
            }
            i++;
            appserverparams = ((AppServerParams) (obj));
            r1 = ((r) (obj2));
        }
        Object obj1 = r1;
        if (r1 == null)
        {
            obj1 = new JSONObject("{}");
        }
        r1 = appserverparams;
        if (appserverparams == null)
        {
            r1 = new JSONObject("{}");
        }
        return new c(((JSONObject) (obj1)), r1);
    }

    public volatile Object a(Object obj, r r1)
    {
        return a((AppServerParams)obj, r1);
    }
}
