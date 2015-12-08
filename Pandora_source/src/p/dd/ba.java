// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.dd;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p.df.a;

public class ba
{

    public final Map a;

    public ba(JSONObject jsonobject)
    {
        if (jsonobject == null || jsonobject.length() == 0)
        {
            a = new HashMap(0);
        } else
        {
            a = new HashMap(jsonobject.length());
            Iterator iterator = jsonobject.keys();
            while (iterator.hasNext()) 
            {
                try
                {
                    String s = (String)iterator.next();
                    a.put(s, jsonobject.getString(s));
                }
                catch (JSONException jsonexception)
                {
                    p.df.a.a("ThirdPartyTrackingUrlsRadioEvent", "error parsing thirdPartyTrackingUrls values from jsonObject");
                }
            }
        }
    }
}
