// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package crittercism.android;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class dv
{

    private SharedPreferences a;

    public dv(Context context, String s)
    {
        a = context.getSharedPreferences((new StringBuilder("com.crittercism.")).append(s).append(".usermetadata").toString(), 0);
        if (a.contains("data"))
        {
            break MISSING_BLOCK_LABEL_70;
        }
        context = new JSONObject();
        context.putOpt("username", "anonymous");
        a(context);
        return;
        context;
    }

    private void b(JSONObject jsonobject)
    {
        android.content.SharedPreferences.Editor editor = a.edit();
        editor.putString("data", jsonobject.toString());
        editor.commit();
    }

    public final JSONObject a()
    {
        Object obj = a.getString("data", "{}");
        try
        {
            obj = new JSONObject(((String) (obj)));
        }
        catch (JSONException jsonexception)
        {
            return new JSONObject();
        }
        return ((JSONObject) (obj));
    }

    public final void a(JSONObject jsonobject)
    {
        JSONObject jsonobject1 = a();
        if (jsonobject1.length() != 0) goto _L2; else goto _L1
_L1:
        if (jsonobject.length() > 0)
        {
            b(jsonobject);
            a(true);
        }
_L5:
        return;
_L2:
        Iterator iterator;
        boolean flag1;
        iterator = jsonobject.keys();
        flag1 = false;
_L3:
        do
        {
            if (!iterator.hasNext())
            {
                continue; /* Loop/switch isn't completed */
            }
            String s = (String)iterator.next();
            Object obj = jsonobject.opt(s);
            Object obj1 = jsonobject1.opt(s);
            boolean flag;
            if (obj1 == null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (obj1 != null)
            {
                if ((obj instanceof JSONObject) || (obj instanceof JSONArray))
                {
                    String s1 = obj.toString();
                    if (!obj1.toString().equals(s1))
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                } else
                if (!obj1.equals(obj))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
            }
        } while (!flag);
        jsonobject1.put(s, obj);
        flag1 = true;
          goto _L3
        if (!flag1) goto _L5; else goto _L4
_L4:
        b(jsonobject1);
        a(true);
        return;
        JSONException jsonexception;
        jsonexception;
          goto _L3
    }

    public final void a(boolean flag)
    {
        a.edit().putBoolean("dirty", flag).commit();
    }

    public final boolean b()
    {
        return a.getBoolean("dirty", false);
    }
}
