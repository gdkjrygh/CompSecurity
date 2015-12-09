// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.getpebble.android.kit.a;

import android.util.Base64;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.getpebble.android.kit.a:
//            e, f, h, b, 
//            d, c

public final class a
    implements Iterable
{

    protected final Map a = new HashMap();

    public a()
    {
    }

    public static a a(String s)
    {
        a a1;
        int i;
        a1 = new a();
        s = new JSONArray(s);
        i = 0;
_L7:
        Object obj;
        f f1;
        h h1;
        int j;
        if (i >= s.length())
        {
            break MISSING_BLOCK_LABEL_372;
        }
        obj = s.getJSONObject(i);
        j = ((JSONObject) (obj)).getInt("key");
        f1 = (f)e.a.get(((JSONObject) (obj)).getString("type"));
        h1 = (h)e.b.get(Integer.valueOf(((JSONObject) (obj)).getInt("length")));
        b.a[f1.ordinal()];
        JVM INSTR tableswitch 1 4: default 124
    //                   1 133
    //                   2 163
    //                   3 178
    //                   4 262;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_262;
_L1:
        break; /* Loop/switch isn't completed */
_L2:
        break; /* Loop/switch isn't completed */
_L8:
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        obj = Base64.decode(((JSONObject) (obj)).getString("value"), 2);
        a1.a(e.a(j, f.a, h.a, obj));
          goto _L8
_L3:
        a1.a(j, ((JSONObject) (obj)).getString("value"));
          goto _L8
_L4:
        if (h1 == h.b)
        {
            a1.a(j, (byte)((JSONObject) (obj)).getInt("value"));
        } else
        if (h1 == h.c)
        {
            short word0 = (short)((JSONObject) (obj)).getInt("value");
            a1.a(e.a(j, f.d, h.c, word0));
        } else
        if (h1 == h.d)
        {
            a1.a(j, ((JSONObject) (obj)).getInt("value"));
        }
          goto _L8
        if (h1 == h.b)
        {
            byte byte0 = (byte)((JSONObject) (obj)).getInt("value");
            a1.a(e.a(j, f.c, h.b, byte0));
        } else
        if (h1 == h.c)
        {
            short word1 = (short)((JSONObject) (obj)).getInt("value");
            a1.a(e.a(j, f.c, h.c, word1));
        } else
        if (h1 == h.d)
        {
            int k = ((JSONObject) (obj)).getInt("value");
            a1.a(e.a(j, f.c, h.d, k));
        }
          goto _L8
        return a1;
    }

    private void a(e e1)
    {
        if (a.size() > 255)
        {
            throw new d();
        } else
        {
            a.put(Integer.valueOf(e1.c), e1);
            return;
        }
    }

    public final int a()
    {
        return a.size();
    }

    public final void a(int i, byte byte0)
    {
        a(e.a(i, f.d, h.b, byte0));
    }

    public final void a(int i, int j)
    {
        a(e.a(i, f.d, h.d, j));
    }

    public final void a(int i, String s)
    {
        a(e.a(i, f.b, h.a, s));
    }

    public final Long b()
    {
        f f1 = f.d;
        e e1;
        if (!a.containsKey(Integer.valueOf(0)) || a.get(Integer.valueOf(0)) == null)
        {
            e1 = null;
        } else
        {
            e e2 = (e)a.get(Integer.valueOf(0));
            e1 = e2;
            if (e2.d != f1)
            {
                throw new c(f1, e2.d);
            }
        }
        if (e1 == null)
        {
            return null;
        } else
        {
            return (Long)e1.g;
        }
    }

    public final String c()
    {
        Object obj;
        Iterator iterator1;
        obj = new JSONArray();
        iterator1 = a.values().iterator();
_L2:
        e e1;
        JSONObject jsonobject;
        if (!iterator1.hasNext())
        {
            break MISSING_BLOCK_LABEL_190;
        }
        e1 = (e)iterator1.next();
        jsonobject = new JSONObject();
        jsonobject.put("key", e1.c);
        jsonobject.put("type", e1.d.name().toLowerCase());
        jsonobject.put("length", e1.e.e);
        switch (b.a[e1.d.ordinal()])
        {
        default:
            break;

        case 1: // '\001'
            break; /* Loop/switch isn't completed */

        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
            break;
        }
        break MISSING_BLOCK_LABEL_175;
_L3:
        ((JSONArray) (obj)).put(jsonobject);
        if (true) goto _L2; else goto _L1
_L1:
        try
        {
            jsonobject.put("value", Base64.encodeToString((byte[])e1.g, 2));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            ((JSONException) (obj)).printStackTrace();
            return null;
        }
          goto _L3
        jsonobject.put("value", e1.g);
          goto _L3
        obj = ((JSONArray) (obj)).toString();
        return ((String) (obj));
    }

    public final Iterator iterator()
    {
        return a.values().iterator();
    }
}
