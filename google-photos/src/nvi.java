// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

public final class nvi
    implements lxj
{

    lxo a;
    boolean b;
    int c;
    int d;
    nvl e;
    lxf f;

    public nvi(lxf lxf1, lxo lxo1)
    {
        f = lxf1;
        a = lxo1;
        a.a(new nvj(this));
        lxf1.a("urn:x-cast:com.google.cast.plusphotos", this);
    }

    static JSONObject a(String s, String s1, String s2)
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("location", s2);
            jsonobject.put("type", s1);
            jsonobject.put("url", s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            if (Log.isLoggable("RemoteMediaController", 5))
            {
                Log.w("RemoteMediaController", "Error constructing asset.", s);
                return jsonobject;
            }
        }
        return jsonobject;
    }

    public final void a(String s, String s1)
    {
        if (!s.equals("urn:x-cast:com.google.cast.plusphotos"))
        {
            break MISSING_BLOCK_LABEL_59;
        }
        s = new JSONObject(s1);
        if ("newSession".equals(s.getString("name")))
        {
            s = s.getJSONObject("payload");
            c = s.getInt("windowWidth");
            d = s.getInt("windowHeight");
        }
        return;
        JSONException jsonexception;
        jsonexception;
        s = String.valueOf(s1);
        if (s.length() != 0)
        {
            s = "Error decoding message from receiver: ".concat(s);
        } else
        {
            s = new String("Error decoding message from receiver: ");
        }
        Log.e("RemoteMediaController", s, jsonexception);
        return;
    }

    void a(String s, JSONObject jsonobject)
    {
        JSONObject jsonobject1 = new JSONObject();
        jsonobject1.put("name", s);
        jsonobject1.put("version", 1);
        if (jsonobject == null)
        {
            break MISSING_BLOCK_LABEL_36;
        }
        jsonobject1.put("payload", jsonobject);
        f.a("urn:x-cast:com.google.cast.plusphotos", jsonobject1.toString(), new nvk(this, jsonobject1));
_L1:
        return;
        s;
        if (Log.isLoggable("RemoteMediaController", 5))
        {
            Log.w("RemoteMediaController", "Error constructing command.", s);
            return;
        }
          goto _L1
    }

    void a(boolean flag)
    {
        boolean flag1;
        if (flag != b)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        b = flag;
        if (flag1 && e != null)
        {
            e.f();
        }
    }
}
