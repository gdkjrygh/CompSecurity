// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.leanplum;

import android.util.Log;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.leanplum:
//            aU, FileManager, c, Leanplum, 
//            g, b

public class ActionContext
{

    private String a;
    private String b;
    private Map c;
    private ActionContext d;
    private int e;
    private String f;
    private boolean g;
    private boolean h;
    private boolean i;
    private b j;

    ActionContext(String s, Map map, String s1)
    {
        g = false;
        h = true;
        i = false;
        a = s;
        c = map;
        b = s1;
        e = aU.f();
    }

    private static Map a(String s)
    {
        Map map = (Map)aU.k().get(s);
        s = map;
        if (map == null)
        {
            s = new HashMap();
        }
        return s;
    }

    private void a(Map map, String s, Map map1)
    {
        Object obj = (Map)a(a).get("kinds");
        if (obj == null)
        {
            obj = new HashMap();
        }
        Iterator iterator = map.keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                return;
            }
            String s1 = (String)iterator.next();
            Object obj3 = map.get(s1);
            Object obj1;
            String s2;
            if (map1 != null)
            {
                obj1 = map1.get(s1);
            } else
            {
                obj1 = null;
            }
            s2 = (String)((Map) (obj)).get((new StringBuilder(String.valueOf(s))).append(s1).toString());
            if ((s2 == null || !s2.equals("action")) && (obj3 instanceof Map))
            {
                if (obj1 instanceof Map)
                {
                    obj1 = (Map)obj1;
                } else
                {
                    obj1 = null;
                }
                a((Map)obj3, (new StringBuilder(String.valueOf(s))).append(s1).append(".").toString(), ((Map) (obj1)));
            } else
            if (s2 != null && s2.equals("file"))
            {
                s1 = obj3.toString();
                if (obj1 != null)
                {
                    obj1 = obj1.toString();
                } else
                {
                    obj1 = null;
                }
                FileManager.a(false, s1, ((String) (obj1)), null);
            } else
            if (s2 == null || s2.equals("action"))
            {
                Object obj2 = objectNamed((new StringBuilder(String.valueOf(s))).append(s1).toString());
                if (obj2 instanceof Map)
                {
                    obj2 = (Map)obj2;
                    (new ActionContext((String)((Map) (obj2)).get("__name__"), ((Map) (obj2)), b)).b();
                }
            }
        } while (true);
    }

    private Map b(String s)
    {
        s = ((String) (objectNamed(s)));
        if (!(s instanceof Map))
        {
            return null;
        } else
        {
            s = (Map)s;
            return (Map)aU.a((Map)a((String)s.get("__name__")).get("values"), s);
        }
    }

    private Map e()
    {
        Map map = (Map)a(a).get("values");
        Object obj = map;
        if (map == null)
        {
            obj = new HashMap();
        }
        return ((Map) (obj));
    }

    final void a()
    {
        g = true;
    }

    final void a(b b1)
    {
        j = b1;
    }

    final void a(boolean flag)
    {
        h = flag;
    }

    public String actionName()
    {
        return a;
    }

    final void b()
    {
        a(c, "", e());
    }

    final void b(boolean flag)
    {
        i = true;
    }

    public boolean booleanNamed(String s)
    {
        s = ((String) (objectNamed(s)));
        if (s instanceof Boolean)
        {
            return ((Boolean)s).booleanValue();
        } else
        {
            return Boolean.valueOf(s.toString()).booleanValue();
        }
    }

    final String c()
    {
        return b;
    }

    final boolean d()
    {
        return i;
    }

    public void muteFutureMessagesOfSameKind()
    {
        com.leanplum.c.a();
        com.leanplum.c.c(b);
    }

    public Number numberNamed(String s)
    {
        s = ((String) (objectNamed(s)));
        if (s instanceof Number)
        {
            return (Number)s;
        } else
        {
            return Double.valueOf(s.toString());
        }
    }

    public Object objectNamed(String s)
    {
        if (g || aU.f() <= e) goto _L2; else goto _L1
_L1:
        ActionContext actioncontext = d;
        if (actioncontext == null) goto _L4; else goto _L3
_L3:
        c = actioncontext.b(f);
_L2:
        return aU.a(aU.a(s), c);
_L4:
        if (b != null)
        {
            c = (Map)((Map)aU.l().get(b)).get("vars");
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    public void runActionNamed(String s)
    {
        Object obj = b(s);
        if (obj == null)
        {
            return;
        } else
        {
            obj = new ActionContext(((Map) (obj)).get("__name__").toString(), ((Map) (obj)), b);
            obj.j = j;
            obj.g = g;
            obj.h = h;
            obj.d = this;
            obj.f = s;
            Leanplum.a(((ActionContext) (obj)));
            return;
        }
    }

    public void runTrackedActionNamed(String s)
    {
        if (com.leanplum.g.a() || b == null || !h) goto _L2; else goto _L1
_L1:
        Object obj;
        ArrayList arraylist;
        arraylist = new ArrayList();
        obj = this;
_L5:
        if (((ActionContext) (obj)).d != null) goto _L4; else goto _L3
_L3:
        StringBuilder stringbuilder;
        int k;
        stringbuilder = new StringBuilder();
        k = arraylist.size() - 1;
_L6:
        if (k < -1)
        {
            k = 1;
        } else
        {
label0:
            {
                if (stringbuilder.length() > 0)
                {
                    stringbuilder.append(' ');
                }
                if (k >= 0)
                {
                    obj = ((ActionContext)arraylist.get(k)).f;
                } else
                {
                    obj = s;
                }
                if (obj != null)
                {
                    break label0;
                }
                k = 0;
            }
        }
        if (k != 0)
        {
            obj = new HashMap();
            ((Map) (obj)).put("messageId", b);
            Leanplum.a(stringbuilder.toString(), 0.0D, null, null, ((Map) (obj)));
        }
_L2:
        runActionNamed(s);
        return;
_L4:
        arraylist.add(obj);
        obj = ((ActionContext) (obj)).d;
          goto _L5
        stringbuilder.append(((String) (obj)).replace(" action", ""));
        k--;
          goto _L6
    }

    public InputStream streamNamed(String s)
    {
        Object obj;
        InputStream inputstream;
        Object obj1;
        String s1;
        int k;
        obj1 = null;
        s1 = stringNamed(s);
        inputstream = s.split("\\.");
        obj = e();
        k = 0;
_L6:
        if (k >= inputstream.length)
        {
            obj = null;
        } else
        if (obj == null)
        {
            obj = null;
        } else
        {
label0:
            {
                if (k != inputstream.length - 1)
                {
                    break label0;
                }
                obj = ((Map) (obj)).get(inputstream[k]);
                if (obj == null)
                {
                    obj = null;
                } else
                {
                    obj = obj.toString();
                }
            }
        }
_L8:
        if (s1 != null && s1.length() != 0) goto _L2; else goto _L1
_L1:
        inputstream = obj1;
        if (obj == null) goto _L4; else goto _L3
_L3:
        if (((String) (obj)).length() != 0) goto _L2; else goto _L5
_L5:
        inputstream = obj1;
_L4:
        return inputstream;
        obj = (Map)((Map) (obj)).get(inputstream[k]);
        k++;
          goto _L6
_L2:
        obj = FileManager.a(false, null, null, FileManager.a(s1, ((String) (obj)), null), ((String) (obj)), null);
        inputstream = ((InputStream) (obj));
        if (obj != null) goto _L4; else goto _L7
_L7:
        Log.e("Leanplum", (new StringBuilder("Could not open stream named ")).append(s).toString());
        return ((InputStream) (obj));
          goto _L8
    }

    public String stringNamed(String s)
    {
        s = ((String) (objectNamed(s)));
        if (s != null) goto _L2; else goto _L1
_L1:
        Object obj = null;
_L5:
        return ((String) (obj));
_L2:
        Iterator iterator;
        s = s.toString();
        if (j == null || s == null || !s.contains("##"))
        {
            return s;
        }
        if (j.a == null)
        {
            break MISSING_BLOCK_LABEL_207;
        }
        obj = j.a;
        iterator = ((Map) (obj)).keySet().iterator();
_L6:
        if (iterator.hasNext()) goto _L4; else goto _L3
_L3:
        obj = s;
_L7:
        s = ((String) (obj));
        if (j.b != null)
        {
            s = ((String) (obj)).replace("##Previous Value##", j.b.toString());
        }
        obj = s;
        if (j.c != null)
        {
            return s.replace("##Value##", j.c.toString());
        }
          goto _L5
_L4:
        String s1 = (String)iterator.next();
        s = s.replace((new StringBuilder("##Parameter ")).append(s1).append("##").toString(), (new StringBuilder()).append(((Map) (obj)).get(s1)).toString());
          goto _L6
        obj = s;
          goto _L7
    }

    public void track(String s, double d1, Map map)
    {
        if (!com.leanplum.g.a() && b != null)
        {
            HashMap hashmap = new HashMap();
            hashmap.put("messageId", b);
            Leanplum.a(s, 0.0D, null, map, hashmap);
        }
    }
}
