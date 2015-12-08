// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.supersonicads.sdk.b;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.supersonicads.sdk.data.b;
import com.supersonicads.sdk.data.e;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.supersonicads.sdk.b:
//            e

public class f
{

    private static f b;
    private SharedPreferences a;

    private f(Context context)
    {
        a = context.getSharedPreferences("supersonic_shared_preferen", 0);
    }

    public static f a()
    {
        com/supersonicads/sdk/b/f;
        JVM INSTR monitorenter ;
        f f1 = b;
        com/supersonicads/sdk/b/f;
        JVM INSTR monitorexit ;
        return f1;
        Exception exception;
        exception;
        throw exception;
    }

    public static f a(Context context)
    {
        com/supersonicads/sdk/b/f;
        JVM INSTR monitorenter ;
        if (b == null)
        {
            b = new f(context);
        }
        context = b;
        com/supersonicads/sdk/b/f;
        JVM INSTR monitorexit ;
        return context;
        context;
        throw context;
    }

    private boolean j()
    {
        return a.getBoolean("register_sessions", true);
    }

    public String a(com.supersonicads.sdk.data.c.d d1)
    {
    /* anonymous class not found */
    class _anm1 {}

        switch (_cls1.a[d1.ordinal()])
        {
        default:
            return "EMPTY_APPLICATION_KEY";

        case 1: // '\001'
            return a.getString("application_key_bc", null);

        case 2: // '\002'
            return a.getString("application_key_ow", null);

        case 3: // '\003'
            return a.getString("application_key_is", null);
        }
    }

    public void a(b b1)
    {
        android.content.SharedPreferences.Editor editor = a.edit();
        editor.putString("ssa_bc_parameter_connection_retries", b1.a());
        editor.commit();
    }

    public void a(com.supersonicads.sdk.data.f f1)
    {
        if (j())
        {
            JSONObject jsonobject = new JSONObject();
            Object obj;
            try
            {
                jsonobject.put("sessionStartTime", f1.b());
                jsonobject.put("sessionEndTime", f1.c());
                jsonobject.put("sessionType", f1.d());
                jsonobject.put("connectivity", f1.e());
            }
            // Misplaced declaration of an exception variable
            catch (com.supersonicads.sdk.data.f f1) { }
            obj = e();
            f1 = ((com.supersonicads.sdk.data.f) (obj));
            if (obj == null)
            {
                f1 = new JSONArray();
            }
            f1.put(jsonobject);
            obj = a.edit();
            ((android.content.SharedPreferences.Editor) (obj)).putString("sessions", f1.toString());
            ((android.content.SharedPreferences.Editor) (obj)).commit();
        }
    }

    public void a(String s)
    {
        android.content.SharedPreferences.Editor editor = a.edit();
        editor.putString("back_button_state", s);
        editor.commit();
    }

    public void a(String s, com.supersonicads.sdk.data.c.d d1)
    {
        android.content.SharedPreferences.Editor editor = a.edit();
        _cls1.a[d1.ordinal()];
        JVM INSTR tableswitch 1 3: default 44
    //                   1 52
    //                   2 65
    //                   3 78;
           goto _L1 _L2 _L3 _L4
_L1:
        editor.commit();
        return;
_L2:
        editor.putString("application_key_bc", s);
        continue; /* Loop/switch isn't completed */
_L3:
        editor.putString("application_key_ow", s);
        continue; /* Loop/switch isn't completed */
_L4:
        editor.putString("application_key_is", s);
        if (true) goto _L1; else goto _L5
_L5:
    }

    public void a(boolean flag)
    {
        android.content.SharedPreferences.Editor editor = a.edit();
        editor.putBoolean("register_sessions", flag);
        editor.commit();
    }

    public boolean a(String s, String s1)
    {
        android.content.SharedPreferences.Editor editor = a.edit();
        editor.putString(s, s1);
        return editor.commit();
    }

    public boolean a(String s, String s1, String s2)
    {
        boolean flag1 = false;
        Object obj = a.getString("ssaUserData", null);
        boolean flag = flag1;
        if (TextUtils.isEmpty(((CharSequence) (obj))))
        {
            break MISSING_BLOCK_LABEL_116;
        }
        try
        {
            obj = new JSONObject(((String) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            (new com.supersonicads.sdk.b.e()).execute(new String[] {
                (new StringBuilder()).append("https://www.supersonicads.com/mobile/sdk5/log?method=").append(s.getStackTrace()[0].getMethodName()).toString()
            });
            return false;
        }
        flag = flag1;
        if (((JSONObject) (obj)).isNull(s1))
        {
            break MISSING_BLOCK_LABEL_116;
        }
        s1 = ((JSONObject) (obj)).getJSONObject(s1);
        flag = flag1;
        if (!s1.isNull(s2))
        {
            s1.getJSONObject(s2).put("timestamp", s);
            s = a.edit();
            s.putString("ssaUserData", ((JSONObject) (obj)).toString());
            flag = s.commit();
        }
        return flag;
    }

    public String b()
    {
        return a.getString("ssa_bc_parameter_connection_retries", "3");
    }

    public String b(com.supersonicads.sdk.data.c.d d1)
    {
        switch (_cls1.a[d1.ordinal()])
        {
        default:
            return "EMPTY_UNIQUE_ID";

        case 1: // '\001'
            return a.getString("unique_id_bc", null);

        case 2: // '\002'
            return a.getString("unique_id_ow", null);

        case 3: // '\003'
            return a.getString("unique_id_is", null);
        }
    }

    public void b(String s)
    {
        android.content.SharedPreferences.Editor editor = a.edit();
        editor.putString("search_keys", s);
        editor.commit();
    }

    public void b(String s, com.supersonicads.sdk.data.c.d d1)
    {
        android.content.SharedPreferences.Editor editor = a.edit();
        _cls1.a[d1.ordinal()];
        JVM INSTR tableswitch 1 3: default 44
    //                   1 52
    //                   2 65
    //                   3 78;
           goto _L1 _L2 _L3 _L4
_L1:
        editor.commit();
        return;
_L2:
        editor.putString("user_id_bc", s);
        continue; /* Loop/switch isn't completed */
_L3:
        editor.putString("user_id_ow", s);
        continue; /* Loop/switch isn't completed */
_L4:
        editor.putString("user_id_is", s);
        if (true) goto _L1; else goto _L5
_L5:
    }

    public void b(boolean flag)
    {
        android.content.SharedPreferences.Editor editor = a.edit();
        editor.putBoolean("is_reported", flag);
        editor.apply();
    }

    public boolean b(String s, String s1)
    {
        android.content.SharedPreferences.Editor editor = a.edit();
        if (!s1.equalsIgnoreCase(com.supersonicads.sdk.data.c.d.a.toString())) goto _L2; else goto _L1
_L1:
        editor.putString("unique_id_bc", s);
_L4:
        return editor.commit();
_L2:
        if (s1.equalsIgnoreCase(com.supersonicads.sdk.data.c.d.b.toString()))
        {
            editor.putString("unique_id_ow", s);
        } else
        if (s1.equalsIgnoreCase(com.supersonicads.sdk.data.c.d.c.toString()))
        {
            editor.putString("unique_id_is", s);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public com.supersonicads.sdk.data.c.a c()
    {
        int k = Integer.parseInt(a.getString("back_button_state", "2"));
        if (k == 0)
        {
            return com.supersonicads.sdk.data.c.a.a;
        }
        if (k == 1)
        {
            return com.supersonicads.sdk.data.c.a.b;
        }
        if (k == 2)
        {
            return com.supersonicads.sdk.data.c.a.c;
        } else
        {
            return com.supersonicads.sdk.data.c.a.c;
        }
    }

    public String c(String s)
    {
        s = a.getString(s, null);
        if (s != null)
        {
            return s;
        } else
        {
            return "{}";
        }
    }

    public void c(String s, String s1)
    {
        android.content.SharedPreferences.Editor editor = a.edit();
        editor.putString(s, s1);
        editor.commit();
    }

    public String d(String s)
    {
        String s1 = "EMPTY_UNIQUE_ID";
        if (s.equalsIgnoreCase(com.supersonicads.sdk.data.c.d.a.toString()))
        {
            s1 = a.getString("unique_id_bc", null);
        } else
        {
            if (s.equalsIgnoreCase(com.supersonicads.sdk.data.c.d.b.toString()))
            {
                return a.getString("unique_id_ow", null);
            }
            if (s.equalsIgnoreCase(com.supersonicads.sdk.data.c.d.c.toString()))
            {
                return a.getString("unique_id_is", null);
            }
        }
        return s1;
    }

    public List d()
    {
        Object obj = a.getString("search_keys", null);
        ArrayList arraylist = new ArrayList();
        if (obj != null)
        {
            obj = new e(((String) (obj)));
            if (((e) (obj)).f("searchKeys"))
            {
                JSONArray jsonarray = (JSONArray)((e) (obj)).h("searchKeys");
                try
                {
                    arraylist.addAll(((e) (obj)).a(jsonarray));
                }
                catch (JSONException jsonexception)
                {
                    jsonexception.printStackTrace();
                    return arraylist;
                }
            }
        }
        return arraylist;
    }

    public JSONArray e()
    {
        Object obj = a.getString("sessions", null);
        if (obj == null)
        {
            return new JSONArray();
        }
        try
        {
            obj = new JSONArray(((String) (obj)));
        }
        catch (JSONException jsonexception)
        {
            return new JSONArray();
        }
        return ((JSONArray) (obj));
    }

    public void e(String s)
    {
        android.content.SharedPreferences.Editor editor = a.edit();
        editor.putString("version", s);
        editor.commit();
    }

    public String f(String s)
    {
        return a.getString(s, null);
    }

    public void f()
    {
        android.content.SharedPreferences.Editor editor = a.edit();
        editor.putString("sessions", null);
        editor.commit();
    }

    public String g()
    {
        return a.getString("version", "UN_VERSIONED");
    }

    public String h()
    {
        return a.getString("ssa_sdk_download_url", null);
    }

    public String i()
    {
        return a.getString("ssa_sdk_load_url", "http://s.ssacdn.com/");
    }
}
