// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.tremorvideo.sdk.android.videoad:
//            ct, cs, az

public class fz
{

    List a;
    private String b;
    private String c;
    private int d;
    private String e;
    private String f;
    private List g;
    private GregorianCalendar h;
    private String i;

    public fz(String s, String s1, boolean flag, boolean flag1)
        throws Exception
    {
        s = new JSONObject(s);
        e = a(s, "session-id");
        f = a(s, "protocol-version");
        b = a(s, "current-time");
        if (s.has("session-id"))
        {
            ct.b(s.getString("session-id"));
        }
        int j;
        if (s.has("pid"))
        {
            d = b(s, "pid");
        } else
        {
            d = 0;
        }
        i = s1;
        c = a(s, "event-server");
        g = a(s.getJSONObject("compatability"));
        h = ct.c(b);
        if (s.has("cookies"))
        {
            long l = h.getTimeInMillis();
            ct.f().a(s.getJSONArray("cookies"), l);
        }
        s = s.getJSONArray("ad");
        a = new ArrayList(s.length());
        j = 0;
        while (j < s.length()) 
        {
            s1 = s.getJSONObject(j);
            boolean flag2;
            boolean flag3;
            if (az.b.a(s1.getString("adtype")) == az.b.f)
            {
                if (s1.has("url") && s1.getString("url").endsWith(".zip"))
                {
                    flag2 = false;
                    flag3 = true;
                } else
                {
                    flag2 = true;
                    flag3 = false;
                }
            } else
            {
                flag2 = false;
                flag3 = false;
            }
            if (s1.has("buy-now") && a("disable-buy-it-now"))
            {
                ct.d("Buy It Now feature not supported on this device, removing ad");
            } else
            if (flag2 && a("disable-mraid-url"))
            {
                ct.d("URL Mraid feature not supported on this device, removing ad");
            } else
            if (flag3 && a("disable-mraid-zip"))
            {
                ct.d("Zip Mraid feature not supported on this device, removing ad");
            } else
            {
                a.add(az.a(this, s1, flag1));
            }
            j++;
        }
    }

    private static String a(JSONObject jsonobject, String s)
    {
        try
        {
            jsonobject = jsonobject.getString(s);
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            ct.a(jsonobject);
            return "";
        }
        s = jsonobject;
        if (jsonobject.equals("null"))
        {
            s = "";
        }
        return s;
    }

    private static List a(JSONObject jsonobject)
    {
        ArrayList arraylist = new ArrayList();
        if (jsonobject != null)
        {
            try
            {
                Iterator iterator = jsonobject.keys();
                do
                {
                    if (!iterator.hasNext())
                    {
                        break;
                    }
                    String s = (String)iterator.next();
                    if (jsonobject.getBoolean(s))
                    {
                        arraylist.add(s);
                    }
                } while (true);
            }
            // Misplaced declaration of an exception variable
            catch (JSONObject jsonobject)
            {
                ct.a(jsonobject);
            }
        }
        return arraylist;
    }

    private static int b(JSONObject jsonobject, String s)
    {
        int j;
        try
        {
            j = jsonobject.getInt(s);
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            ct.a(jsonobject);
            return 0;
        }
        return j;
    }

    public String a()
    {
        return i;
    }

    public boolean a(ea.b b1)
    {
        b1 = (new StringBuilder()).append("ignore-event-").append(b1.toString().toLowerCase()).toString();
        for (Iterator iterator = g.iterator(); iterator.hasNext();)
        {
            if (((String)iterator.next()).equals(b1))
            {
                return true;
            }
        }

        return false;
    }

    public boolean a(String s)
    {
        for (Iterator iterator = g.iterator(); iterator.hasNext();)
        {
            if (((String)iterator.next()).equals(s))
            {
                return true;
            }
        }

        return false;
    }

    public String b()
    {
        return c;
    }

    public String c()
    {
        return b;
    }

    public List d()
    {
        return a;
    }

    public String e()
    {
        return e;
    }
}
