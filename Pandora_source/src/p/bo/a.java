// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.bo;

import android.util.Base64;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package p.bo:
//            b

public class p.bo.a
    implements Iterable
{
    public static class a extends RuntimeException
    {

        public a(long l, b.a a1, b.a a2)
        {
            super(String.format("Expected type '%s', but got '%s' for key 0x%08x", new Object[] {
                a1.name(), a2.name(), Long.valueOf(l)
            }));
        }
    }

    public static class b extends RuntimeException
    {

        public b()
        {
            super("Too many tuples in dict");
        }
    }


    protected final Map a = new HashMap();

    public p.bo.a()
    {
    }

    public static p.bo.a a(String s)
        throws JSONException
    {
        p.bo.a a1;
        int i;
        a1 = new p.bo.a();
        s = new JSONArray(s);
        i = 0;
_L7:
        JSONObject jsonobject;
        b.a a2;
        b.c c1;
        int j;
        if (i >= s.length())
        {
            break MISSING_BLOCK_LABEL_309;
        }
        jsonobject = s.getJSONObject(i);
        j = jsonobject.getInt("key");
        a2 = (b.a)p.bo.b.a.get(jsonobject.getString("type"));
        c1 = (b.c)p.bo.b.b.get(Integer.valueOf(jsonobject.getInt("length")));
        static class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[p.bo.b.a.values().length];
                try
                {
                    a[b.a.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[b.a.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[b.a.d.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[b.a.c.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1.a[a2.ordinal()];
        JVM INSTR tableswitch 1 4: default 124
    //                   1 133
    //                   2 152
    //                   3 167
    //                   4 238;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_238;
_L1:
        break; /* Loop/switch isn't completed */
_L2:
        break; /* Loop/switch isn't completed */
_L8:
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        a1.a(j, Base64.decode(jsonobject.getString("value"), 2));
          goto _L8
_L3:
        a1.a(j, jsonobject.getString("value"));
          goto _L8
_L4:
        if (c1 == b.c.b)
        {
            a1.a(j, (byte)jsonobject.getInt("value"));
        } else
        if (c1 == b.c.c)
        {
            a1.a(j, (short)jsonobject.getInt("value"));
        } else
        if (c1 == b.c.d)
        {
            a1.a(j, jsonobject.getInt("value"));
        }
          goto _L8
        if (c1 == b.c.b)
        {
            a1.b(j, (byte)jsonobject.getInt("value"));
        } else
        if (c1 == b.c.c)
        {
            a1.b(j, (short)jsonobject.getInt("value"));
        } else
        if (c1 == b.c.d)
        {
            a1.b(j, jsonobject.getInt("value"));
        }
          goto _L8
        return a1;
    }

    private p.bo.b a(int i, b.a a1)
    {
        p.bo.b b1;
        if (!a.containsKey(Integer.valueOf(i)) || a.get(Integer.valueOf(i)) == null)
        {
            b1 = null;
        } else
        {
            p.bo.b b2 = (p.bo.b)a.get(Integer.valueOf(i));
            b1 = b2;
            if (b2.d != a1)
            {
                throw new a(i, a1, b2.d);
            }
        }
        return b1;
    }

    private static JSONObject b(p.bo.b b1)
        throws JSONException
    {
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("key", b1.c);
        jsonobject.put("type", b1.d.a());
        jsonobject.put("length", b1.e.e);
        switch (_cls1.a[b1.d.ordinal()])
        {
        default:
            return jsonobject;

        case 1: // '\001'
            jsonobject.put("value", Base64.encodeToString((byte[])(byte[])b1.g, 2));
            return jsonobject;

        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
            jsonobject.put("value", b1.g);
            break;
        }
        return jsonobject;
    }

    public int a()
    {
        return a.size();
    }

    public void a(int i, byte byte0)
    {
        a(p.bo.b.a(i, b.a.d, b.c.b, byte0));
    }

    public void a(int i, int j)
    {
        a(p.bo.b.a(i, b.a.d, b.c.d, j));
    }

    public void a(int i, String s)
    {
        a(p.bo.b.a(i, b.a.b, b.c.a, s));
    }

    public void a(int i, short word0)
    {
        a(p.bo.b.a(i, b.a.d, b.c.c, word0));
    }

    public void a(int i, byte abyte0[])
    {
        a(p.bo.b.a(i, b.a.a, b.c.a, abyte0));
    }

    protected void a(p.bo.b b1)
    {
        if (a.size() > 255)
        {
            throw new b();
        } else
        {
            a.put(Integer.valueOf(b1.c), b1);
            return;
        }
    }

    public boolean a(int i)
    {
        return a.containsKey(Integer.valueOf(i));
    }

    public Long b(int i)
    {
        p.bo.b b1 = a(i, b.a.d);
        if (b1 == null)
        {
            return null;
        } else
        {
            return (Long)b1.g;
        }
    }

    public String b()
    {
        Object obj;
        try
        {
            obj = new JSONArray();
            for (Iterator iterator1 = a.values().iterator(); iterator1.hasNext(); ((JSONArray) (obj)).put(b((p.bo.b)iterator1.next()))) { }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            ((JSONException) (obj)).printStackTrace();
            return null;
        }
        obj = ((JSONArray) (obj)).toString();
        return ((String) (obj));
    }

    public void b(int i, byte byte0)
    {
        a(p.bo.b.a(i, b.a.c, b.c.b, byte0));
    }

    public void b(int i, int j)
    {
        a(p.bo.b.a(i, b.a.c, b.c.d, j));
    }

    public void b(int i, short word0)
    {
        a(p.bo.b.a(i, b.a.c, b.c.c, word0));
    }

    public Long c(int i)
    {
        p.bo.b b1 = a(i, b.a.c);
        if (b1 == null)
        {
            return null;
        } else
        {
            return (Long)b1.g;
        }
    }

    public Iterator iterator()
    {
        return a.values().iterator();
    }
}
