// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import android.content.Context;
import android.content.SharedPreferences;
import org.json.JSONException;
import org.json.JSONObject;

public final class ap
{

    public boolean a;
    public int b;
    public int c;
    public JSONObject d;

    ap()
    {
        a = false;
        b = 10;
        c = 0x36ee80;
        d = new JSONObject();
    }

    public ap(JSONObject jsonobject)
    {
        a = false;
        b = 10;
        c = 0x36ee80;
        d = new JSONObject();
        a = jsonobject.optBoolean("enabled", false);
        b = jsonobject.optInt("interval", 10);
        c = jsonobject.optInt("defaultTimeout", 0x36ee80);
        d = jsonobject.optJSONObject("transactions");
        if (d == null)
        {
            d = new JSONObject();
        }
    }

    public static ap a(Context context)
    {
        Object obj = context.getSharedPreferences("com.crittercism.txn.config", 0);
        context = new ap();
        context.a = ((SharedPreferences) (obj)).getBoolean("enabled", false);
        context.b = ((SharedPreferences) (obj)).getInt("interval", 10);
        context.c = ((SharedPreferences) (obj)).getInt("defaultTimeout", 0x36ee80);
        obj = ((SharedPreferences) (obj)).getString("transactions", null);
        context.d = new JSONObject();
        if (obj != null)
        {
            try
            {
                context.d = new JSONObject(((String) (obj)));
            }
            catch (JSONException jsonexception)
            {
                return context;
            }
        }
        return context;
    }

    public final long a(String s)
    {
        s = d.optJSONObject(s);
        if (s != null)
        {
            return s.optLong("timeout", c);
        } else
        {
            return (long)c;
        }
    }
}
