// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cx;

import com.pandora.radio.util.i;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ad
{

    private boolean a;
    private int b;
    private String c;
    private String d;
    private boolean e;
    private boolean f;
    private ArrayList g;

    public ad()
    {
        b(null);
    }

    public ad(JSONObject jsonobject)
        throws JSONException
    {
        int j = 0;
        super();
        a = jsonobject.optBoolean("enableBurstyPings", false);
        b = jsonobject.optInt("burstyPingPercentage", 0);
        c = jsonobject.optString("burstyPingEndpoint", null);
        d = jsonobject.optString("individualPingEndpoint", null);
        e = jsonobject.optBoolean("enableIndividualPings", false);
        f = jsonobject.optBoolean("enableParallelIndividualPings", true);
        g = new ArrayList();
        jsonobject = jsonobject.optJSONArray("burstyPingWhitelist");
        if (jsonobject != null)
        {
            for (; j < jsonobject.length(); j++)
            {
                g.add(jsonobject.getString(j));
            }

        }
    }

    public ad(ad ad1)
    {
        if (ad1 == null || ad1.d == null)
        {
            b(c());
            return;
        } else
        {
            b(ad1.d);
            return;
        }
    }

    private void b(String s)
    {
        a = false;
        b = 5;
        c = null;
        d = s;
        e = true;
        f = true;
        g = new ArrayList();
    }

    public int a()
    {
        return b;
    }

    public boolean a(String s)
    {
        return g.contains(s);
    }

    public boolean b()
    {
        return e;
    }

    public String c()
    {
        String s1 = d;
        String s = s1;
        if (i.a(s1))
        {
            s = "http://lt.andomedia.com/lt";
        }
        return s;
    }
}
