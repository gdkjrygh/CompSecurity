// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import android.content.Context;
import com.taplytics.a.b;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONObject;

// Referenced classes of package com.taplytics:
//            s, gs, ci, j, 
//            cheetah

public final class w extends s
{

    static w c;
    private HashSet d;

    public w()
    {
        d = new HashSet();
        a("mixpanel", this);
        d = new HashSet(Arrays.asList(new String[] {
            "$android_os", "$android_model", "$android_brand", "$android_os_version", "$android_lib_version", "$android_manufacturer", "$android_app_version", "$token", "$distinct_id"
        }));
    }

    private void a(ArrayList arraylist)
    {
        JSONObject jsonobject;
        JSONObject jsonobject1;
        jsonobject = new JSONObject();
        jsonobject1 = new JSONObject();
        arraylist = arraylist.iterator();
_L2:
        Object obj;
        if (!arraylist.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        obj = (JSONObject)arraylist.next();
        if (((JSONObject) (obj)).has("$set"))
        {
            obj = ((JSONObject) (obj)).optJSONObject("$set");
            Iterator iterator = ((JSONObject) (obj)).keys();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                String s1 = (String)iterator.next();
                if (!d.contains(s1))
                {
                    jsonobject.put(s1, ((JSONObject) (obj)).get(s1));
                }
            } while (true);
            break MISSING_BLOCK_LABEL_195;
        }
        if (((JSONObject) (obj)).has("$add"))
        {
            obj = ((JSONObject) (obj)).optJSONObject("$add");
            String s2;
            for (Iterator iterator1 = ((JSONObject) (obj)).keys(); iterator1.hasNext(); jsonobject.put(s2, ((JSONObject) (obj)).get(s2)))
            {
                s2 = (String)iterator1.next();
            }

        }
        try
        {
            jsonobject1.put("customData", jsonobject);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            com.taplytics.gs.b("MPUA", ((Exception) (obj)));
        }
        if (true) goto _L2; else goto _L1
_L1:
        b.a(jsonobject1);
        return;
    }

    private static void a(JSONObject jsonobject)
    {
        JSONObject jsonobject1;
        String s1;
        String s2;
        jsonobject1 = new JSONObject();
        Iterator iterator;
        try
        {
            if (jsonobject.equals(JSONObject.NULL) || jsonobject.length() == 0 || !jsonobject.has("event"))
            {
                break MISSING_BLOCK_LABEL_233;
            }
            s1 = jsonobject.optString("event");
            jsonobject = jsonobject.optJSONObject("properties");
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            com.taplytics.gs.b("Json error", jsonobject);
            return;
        }
        if (jsonobject == null)
        {
            break MISSING_BLOCK_LABEL_69;
        }
        if (!jsonobject.equals(JSONObject.NULL) && jsonobject.length() != 0)
        {
            break MISSING_BLOCK_LABEL_84;
        }
        com.taplytics.ci.b().d.a("mixpanel", s1, null, null);
        return;
        iterator = jsonobject.keys();
_L3:
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_219;
        }
        s2 = (String)iterator.next();
        if (s2.startsWith("$") || s2.equals("distinct_id") || s2.equals("token") || s2.equals("mp_lib") || s2.equals("time")) goto _L2; else goto _L1
_L1:
        jsonobject1.put(s2, jsonobject.get(s2));
          goto _L3
_L2:
        if (!s2.equals("time") && !s2.equals("$time")) goto _L3; else goto _L4
_L4:
        jsonobject1.put("TLTime", jsonobject.get(s2));
          goto _L3
        com.taplytics.ci.b().d.a("mixpanel", s1, null, jsonobject1);
    }

    public final void a()
    {
        Iterator iterator = a(cheetah.a.c.toUpperCase(), "data").iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object obj1 = (String)iterator.next();
            try
            {
                obj1 = new JSONObject(((String) (obj1)));
                if (obj1 != JSONObject.NULL)
                {
                    a(((JSONObject) (obj1)));
                }
            }
            catch (Exception exception1)
            {
                if (com.taplytics.gs.b())
                {
                    gs.a((new StringBuilder("MPErr: ")).append(exception1.getMessage()).toString());
                }
            }
        } while (true);
        if (a(com.taplytics.cheetah.b.c.toUpperCase()) > 0)
        {
            ArrayList arraylist = new ArrayList();
            Iterator iterator1 = a(com.taplytics.cheetah.b.c.toUpperCase(), "data").iterator();
            do
            {
                if (!iterator1.hasNext())
                {
                    break;
                }
                String s1 = (String)iterator1.next();
                try
                {
                    arraylist.add(new JSONObject(s1));
                }
                catch (Exception exception2)
                {
                    if (com.taplytics.gs.b())
                    {
                        gs.a((new StringBuilder("MPErr")).append(exception2.getMessage()).toString());
                    }
                }
            } while (true);
            a(arraylist);
        }
        if (a(cheetah.a.c.toUpperCase()) <= 0)
        {
            break MISSING_BLOCK_LABEL_326;
        }
        Object obj;
        Method method;
        method = Class.forName("com.mixpanel.android.mpmetrics.MixpanelAPI").getMethod("getInstance", new Class[] {
            android/content/Context, java/lang/String
        });
        if (com.taplytics.ci.b().v != null)
        {
            break MISSING_BLOCK_LABEL_308;
        }
        obj = com.taplytics.ci.b().u;
_L2:
        obj = method.invoke(null, new Object[] {
            obj, "taplytics"
        });
        obj.getClass().getMethod("flush", new Class[0]).invoke(obj, new Object[0]);
        return;
        obj = com.taplytics.ci.b().v;
        if (true) goto _L2; else goto _L1
_L1:
        Exception exception;
        exception;
        com.taplytics.gs.b("flush error", exception);
    }
}
