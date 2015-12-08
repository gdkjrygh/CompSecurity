// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import android.text.TextUtils;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.flurry.sdk:
//            kx, in, ht, hu, 
//            hn, lq, ho, hx, 
//            hq, hy, ia, lp, 
//            kc

public class iq
    implements kx
{

    private static final String a = com/flurry/sdk/iq.getSimpleName();

    public iq()
    {
    }

    private in a(String s)
    {
        in in1 = in.a;
        if (TextUtils.isEmpty(s))
        {
            break MISSING_BLOCK_LABEL_24;
        }
        s = (in)Enum.valueOf(com/flurry/sdk/in, s);
        return s;
        s;
        return in1;
    }

    private void a(hn hn1, JSONArray jsonarray)
    {
        if (jsonarray != null)
        {
            List list = null;
            int i = 0;
            while (i < jsonarray.length()) 
            {
                JSONObject jsonobject = jsonarray.optJSONObject(i);
                Object obj1 = list;
                if (jsonobject != null)
                {
                    if (jsonobject.has("string"))
                    {
                        obj1 = list;
                        if (list == null)
                        {
                            obj1 = new ArrayList();
                        }
                        list = new ht();
                        list.a = jsonobject.optString("string", "");
                        ((List) (obj1)).add(list);
                    } else
                    {
                        obj1 = list;
                        if (jsonobject.has("com.flurry.proton.generated.avro.v2.EventParameterCallbackTrigger"))
                        {
                            Object obj = list;
                            if (list == null)
                            {
                                obj = new ArrayList();
                            }
                            list = jsonobject.optJSONObject("com.flurry.proton.generated.avro.v2.EventParameterCallbackTrigger");
                            obj1 = obj;
                            if (list != null)
                            {
                                obj1 = new hu();
                                obj1.a = list.optString("event_name", "");
                                obj1.c = list.optString("event_parameter_name", "");
                                JSONArray jsonarray1 = list.optJSONArray("event_parameter_values");
                                if (jsonarray1 != null)
                                {
                                    list = new String[jsonarray1.length()];
                                    for (int j = 0; j < jsonarray1.length(); j++)
                                    {
                                        list[j] = jsonarray1.optString(j, "");
                                    }

                                } else
                                {
                                    list = new String[0];
                                }
                                obj1.d = list;
                                ((List) (obj)).add(obj1);
                                obj1 = obj;
                            }
                        }
                    }
                }
                i++;
                list = ((List) (obj1));
            }
            hn1.c = list;
        }
    }

    private void a(ho ho1, JSONArray jsonarray)
    {
        if (jsonarray != null)
        {
            ArrayList arraylist = new ArrayList();
            for (int i = 0; i < jsonarray.length(); i++)
            {
                JSONObject jsonobject = jsonarray.optJSONObject(i);
                if (jsonobject == null)
                {
                    continue;
                }
                hn hn1 = new hn();
                hn1.b = jsonobject.optString("partner", "");
                a(hn1, jsonobject.optJSONArray("events"));
                hn1.d = a(jsonobject.optString("method"));
                hn1.e = jsonobject.optString("uri_template", "");
                Object obj = jsonobject.optJSONObject("body_template");
                if (obj != null)
                {
                    obj = ((JSONObject) (obj)).optString("string", "null");
                    if (!((String) (obj)).equals("null"))
                    {
                        hn1.f = ((String) (obj));
                    }
                }
                hn1.g = jsonobject.optInt("max_redirects", 5);
                hn1.h = jsonobject.optInt("connect_timeout", 20);
                hn1.i = jsonobject.optInt("request_timeout", 20);
                hn1.a = jsonobject.optLong("callback_id", -1L);
                jsonobject = jsonobject.optJSONObject("headers");
                if (jsonobject != null)
                {
                    jsonobject = jsonobject.optJSONObject("map");
                    if (jsonobject != null)
                    {
                        hn1.j = lq.a(jsonobject);
                    }
                }
                arraylist.add(hn1);
            }

            ho1.a = arraylist;
        }
    }

    private void a(hq hq1, JSONObject jsonobject)
    {
        jsonobject = jsonobject.optJSONObject("global_settings");
        hq1.d = new hx();
        if (jsonobject != null)
        {
            hq1.d.a = b(jsonobject.optString("log_level"));
        }
    }

    private hy b(String s)
    {
        hy hy1 = hy.f;
        if (TextUtils.isEmpty(s))
        {
            break MISSING_BLOCK_LABEL_24;
        }
        s = (hy)Enum.valueOf(com/flurry/sdk/hy, s);
        return s;
        s;
        return hy1;
    }

    private void b(hq hq1, JSONObject jsonobject)
    {
        jsonobject = jsonobject.optJSONObject("pulse");
        ho ho1 = new ho();
        if (jsonobject != null)
        {
            a(ho1, jsonobject.optJSONArray("callbacks"));
            ho1.b = jsonobject.optInt("max_callback_retries", 3);
            ho1.c = jsonobject.optInt("max_callback_attempts_per_report", 15);
            ho1.d = jsonobject.optInt("max_report_delay_seconds", 600);
            ho1.e = jsonobject.optString("agent_report_url", "");
        }
        hq1.e = ho1;
    }

    private void c(hq hq1, JSONObject jsonobject)
    {
        jsonobject = jsonobject.optJSONObject("analytics");
        hq1.f = new ia();
        if (jsonobject != null)
        {
            hq1.f.b = jsonobject.optBoolean("analytics_enabled", true);
            hq1.f.a = jsonobject.optInt("max_session_properties", 10);
        }
    }

    public hq a(InputStream inputstream)
    {
        if (inputstream == null)
        {
            return null;
        }
        Object obj = new String(lp.a(inputstream));
        kc.a(5, a, (new StringBuilder("Proton response string: ")).append(((String) (obj))).toString());
        inputstream = new hq();
        try
        {
            obj = new JSONObject(((String) (obj)));
            inputstream.a = ((JSONObject) (obj)).optLong("issued_at", -1L);
            inputstream.b = ((JSONObject) (obj)).optLong("refresh_ttl", 3600L);
            inputstream.c = ((JSONObject) (obj)).optLong("expiration_ttl", 0x15180L);
            a(((hq) (inputstream)), ((JSONObject) (obj)));
            b(inputstream, ((JSONObject) (obj)));
            c(inputstream, ((JSONObject) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            throw new IOException("Exception while deserialize: ", inputstream);
        }
        return inputstream;
    }

    public void a(OutputStream outputstream, hq hq1)
    {
        throw new IOException("Serialize not supported for response");
    }

    public volatile void a(OutputStream outputstream, Object obj)
    {
        a(outputstream, (hq)obj);
    }

    public Object b(InputStream inputstream)
    {
        return a(inputstream);
    }

}
