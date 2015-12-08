// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.web.config;

import com.b.a.b;
import com.b.a.n;
import com.kik.cards.web.plugin.d;
import com.kik.cards.web.plugin.j;
import com.kik.g.p;
import com.kik.g.s;
import com.kik.n.a.f.c;
import com.kik.n.a.g.a;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kik.a.h.g;
import kik.a.h.i;
import kik.a.h.o;
import kik.a.j.m;
import kik.android.util.cq;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.kik.cards.web.config:
//            e, c, d, f, 
//            b

public class XDataPlugin extends d
{

    private final m a;
    private Map b;

    public XDataPlugin(m m1)
    {
        super("XData");
        a = m1;
        b = new HashMap();
        b.put("sticker_pack", com/kik/n/a/f/c);
        b.put("enc_messaging_priv_key", com/kik/n/a/g/a);
        b.put("messaging_pub_key", com/kik/n/a/g/a);
    }

    private static Object a(Object obj)
    {
        if (obj == null)
        {
            return JSONObject.NULL;
        }
        if (obj instanceof String)
        {
            return (String)obj;
        }
        if (obj instanceof Number)
        {
            Number number = (Number)obj;
            if ((obj instanceof Float) || (obj instanceof Double))
            {
                return Double.valueOf(number.doubleValue());
            }
            if (obj instanceof Long)
            {
                return Long.valueOf(number.longValue());
            }
            if (obj instanceof Integer)
            {
                return Integer.valueOf(number.intValue());
            }
        } else
        {
            if (obj instanceof b)
            {
                return i.a(((b)obj).c());
            }
            if (obj instanceof Collection)
            {
                int k = 0;
                JSONArray jsonarray = new JSONArray();
                for (obj = ((Collection)obj).iterator(); ((Iterator) (obj)).hasNext();)
                {
                    jsonarray.put(k, a(((Iterator) (obj)).next()));
                    k++;
                }

                return jsonarray;
            }
            if (obj instanceof n)
            {
                JSONObject jsonobject = new JSONObject();
                a((n)obj, jsonobject);
                return jsonobject;
            }
        }
        return JSONObject.NULL;
    }

    static JSONObject a(XDataPlugin xdataplugin, String s1, n n1, Class class1)
    {
        return xdataplugin.a(s1, n1, class1);
    }

    private JSONObject a(String s1, n n1, Class class1)
    {
        Object obj;
        JSONObject jsonobject;
        jsonobject = new JSONObject();
        obj = n1;
        if (s1.startsWith("enc_"))
        {
            obj = (com.kik.n.a.e.a)n1;
            s1 = cq.a(((com.kik.n.a.e.a) (obj)).b().c());
            n1 = cq.a(((com.kik.n.a.e.a) (obj)).c().c());
            obj = o.a(((com.kik.n.a.e.a) (obj)), a.a());
            try
            {
                jsonobject.put("keyId", s1);
                jsonobject.put("iv", n1);
                jsonobject.put("encrypted", true);
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                s1.printStackTrace();
            }
            if (class1 != null)
            {
                obj = g.a(((byte []) (obj)), class1);
            } else
            {
                obj = null;
            }
        }
        if (class1 == null) goto _L2; else goto _L1
_L1:
        if (obj != null) goto _L4; else goto _L3
_L3:
        s1 = null;
_L6:
        n1 = s1;
        if (s1 != null)
        {
            break MISSING_BLOCK_LABEL_127;
        }
        n1 = ((n) (JSONObject.NULL));
        jsonobject.put("description", n1);
_L2:
        return jsonobject;
_L4:
        try
        {
            s1 = new JSONObject();
            a(((n) (obj)), ((JSONObject) (s1)));
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            s1.printStackTrace();
            return jsonobject;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    private static void a(n n1, JSONObject jsonobject)
    {
        Class class1;
        Field afield[];
        int k;
        int l;
        class1 = n1.getClass();
        class1.getSimpleName();
        afield = class1.getDeclaredFields();
        l = afield.length;
        k = 0;
_L6:
        Object obj;
        Object obj1;
        String s1;
        int i1;
        if (k >= l)
        {
            break MISSING_BLOCK_LABEL_124;
        }
        obj1 = afield[k];
        s1 = ((Field) (obj1)).getName();
        ((Field) (obj1)).getType();
        obj = null;
        i1 = ((Field) (obj1)).getModifiers();
        if (!((Field) (obj1)).getDeclaringClass().equals(class1) || Modifier.isStatic(i1) || Modifier.isPrivate(i1)) goto _L2; else goto _L1
_L1:
        ((Field) (obj1)).setAccessible(true);
        obj1 = ((Field) (obj1)).get(n1);
        obj = obj1;
_L4:
        jsonobject.put(s1, a(obj));
_L2:
        k++;
        continue; /* Loop/switch isn't completed */
        IllegalAccessException illegalaccessexception;
        illegalaccessexception;
        if (true) goto _L4; else goto _L3
_L3:
        return;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public j deleteRecord(com.kik.cards.web.plugin.a a1, JSONObject jsonobject)
    {
        String s1 = jsonobject.optString("primaryKey");
        jsonobject = jsonobject.optString("subKey");
        a.b(s1, jsonobject, null).a(new e(this, a1));
        return new j(202);
    }

    public j getAllRecords(com.kik.cards.web.plugin.a a1, JSONObject jsonobject)
    {
        String s1 = jsonobject.optString("primaryKey");
        Object obj = (Class)b.get(s1);
        if (s1.startsWith("enc_"))
        {
            jsonobject = com/kik/n/a/e/a;
        } else
        {
            jsonobject = ((JSONObject) (obj));
        }
        obj = new com.kik.cards.web.config.c(this, s1, ((Class) (obj)));
        if (jsonobject != null)
        {
            s.b(a.c(s1, jsonobject), s.a(((com.kik.g.as) (obj)))).a(new com.kik.cards.web.config.d(this, a1));
        } else
        {
            a1.a(new j(400));
        }
        return new j(202);
    }

    public j getPrimaryKeys(com.kik.cards.web.plugin.a a1, JSONObject jsonobject)
    {
        a.b().a(new f(this, a1));
        return new j(202);
    }

    public j getRecord(com.kik.cards.web.plugin.a a1, JSONObject jsonobject)
    {
        String s1 = jsonobject.optString("primaryKey");
        String s2 = jsonobject.optString("subKey");
        Object obj = (Class)b.get(s1);
        if (s1.startsWith("enc_"))
        {
            jsonobject = com/kik/n/a/e/a;
        } else
        {
            jsonobject = ((JSONObject) (obj));
        }
        obj = new com.kik.cards.web.config.b(this, s1, ((Class) (obj)), a1);
        if (jsonobject != null)
        {
            if (s2 != null)
            {
                a.a(s1, s2, jsonobject).a(((com.kik.g.r) (obj)));
            } else
            {
                a.d(s1, jsonobject).a(((com.kik.g.r) (obj)));
            }
        } else
        {
            a1.a(new j(400));
        }
        return new j(202);
    }
}
