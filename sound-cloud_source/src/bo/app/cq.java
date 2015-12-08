// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class cq
{

    public long a;
    public Set b;
    public Set c;
    public Set d;
    public boolean e;
    public boolean f;
    public long g;
    public float h;

    public cq()
    {
        e = false;
        f = false;
        g = -1L;
        h = -1F;
    }

    public cq(JSONObject jsonobject)
    {
        e = false;
        f = false;
        g = -1L;
        h = -1F;
        b = a(jsonobject, "events_blacklist");
        c = a(jsonobject, "attributes_blacklist");
        d = a(jsonobject, "purchases_blacklist");
        a = jsonobject.optLong("time", 0L);
        jsonobject = jsonobject.optJSONObject("location");
        if (jsonobject != null)
        {
            long l;
            try
            {
                f = jsonobject.getBoolean("enabled");
                e = true;
            }
            catch (JSONException jsonexception)
            {
                e = false;
            }
            l = jsonobject.optLong("time", -1L);
            if (l >= 0L)
            {
                g = l * 1000L;
            }
            h = (float)jsonobject.optDouble("distance", -1D);
        }
    }

    private static Set a(JSONObject jsonobject, String s)
    {
        if (jsonobject.optJSONArray(s) != null)
        {
            HashSet hashset = new HashSet();
            jsonobject = jsonobject.optJSONArray(s);
            for (int i = 0; i < jsonobject.length(); i++)
            {
                hashset.add(jsonobject.getString(i));
            }

            return hashset;
        } else
        {
            return null;
        }
    }
}
