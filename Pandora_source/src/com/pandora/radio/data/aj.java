// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.radio.data;

import com.pandora.radio.util.i;
import java.security.InvalidParameterException;
import java.text.DateFormat;
import java.util.Date;
import org.json.JSONException;
import org.json.JSONObject;
import p.df.a;

public class aj
{

    protected final JSONObject a;
    private final String b;
    private final long c;
    private long d;
    private final String e;

    public aj(JSONObject jsonobject, String s)
        throws JSONException
    {
        b = jsonobject.getString("offerName");
        a = jsonobject.getJSONObject("rewardProperties");
        e = s;
        c = a.optLong("secondsTotalDuration");
        if (jsonobject.has("msEndTime"))
        {
            d = jsonobject.getLong("msEndTime");
            return;
        } else
        {
            d = a.optLong("secondsRemaining", 0L) + b() / 1000L;
            return;
        }
    }

    public long a()
    {
        return d;
    }

    public String a(String s)
    {
        String s1;
        try
        {
            s1 = a.getString(s);
        }
        catch (JSONException jsonexception)
        {
            p.df.a.b("ValueExchangeRewardData", (new StringBuilder()).append("Reward item not found: ").append(s).toString());
            return null;
        }
        return s1;
    }

    public void a(String s, String s1)
    {
        if (!"leadInAudioUrl".equals(s))
        {
            throw new InvalidParameterException("setRewardProperty should only be used with leadInAudioUrl at this time");
        }
        if (com.pandora.radio.util.i.a(s1))
        {
            a.remove(s);
            return;
        }
        try
        {
            a.put(s, s1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            p.df.a.b("ValueExchangeRewardData", "setRewardProperty JSONException", s);
        }
        return;
    }

    protected long b()
    {
        return com.pandora.radio.util.i.g();
    }

    public String b(String s, String s1)
    {
        s = a(s);
        if (!com.pandora.radio.util.i.a(s))
        {
            s1 = s;
        }
        return s1;
    }

    public String c()
    {
        return b;
    }

    public long d()
    {
        return d - b() / 1000L;
    }

    public String e()
    {
        return DateFormat.getDateTimeInstance().format(new Date(d));
    }

    public long f()
    {
        return c;
    }

    public boolean g()
    {
        return d() > 0L;
    }

    public String h()
    {
        Object obj;
        try
        {
            obj = new JSONObject();
            ((JSONObject) (obj)).put("offerName", c());
            ((JSONObject) (obj)).put("rewardProperties", a);
            ((JSONObject) (obj)).put("msEndTime", d);
            obj = ((JSONObject) (obj)).toString();
        }
        catch (JSONException jsonexception)
        {
            jsonexception.printStackTrace();
            return "{}";
        }
        return ((String) (obj));
    }

    public String i()
    {
        return e;
    }

    public String toString()
    {
        return (new StringBuilder()).append("ValueExchangeRewardData : ").append(h()).append(" formattedEndTime: ").append(e()).append(" secondsRemaining: ").append(d()).toString();
    }
}
