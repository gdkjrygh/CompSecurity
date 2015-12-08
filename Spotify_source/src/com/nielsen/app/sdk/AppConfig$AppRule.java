// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nielsen.app.sdk;

import java.io.Closeable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.nielsen.app.sdk:
//            c, AppConfig

public class b
    implements Closeable
{

    final AppConfig a;
    private boolean b;
    private String c;
    private String d;
    private List e;
    private String f;
    private String g;
    private Map h;
    private Map i;
    private Map j;

    public void close()
    {
        if (i != null)
        {
            i.clear();
        }
        i = null;
        if (h != null)
        {
            h.clear();
        }
        h = null;
        if (j != null)
        {
            j.clear();
        }
        j = null;
        if (e != null)
        {
            e.clear();
        }
        e = null;
    }

    public String getCondition(int k)
    {
        return (String)e.get(k);
    }

    public int getConditionSize()
    {
        return e.size();
    }

    public Map getElse()
    {
        return i;
    }

    public int getElseSize()
    {
        return i.size();
    }

    public String getIsType()
    {
        return f;
    }

    public String getIsValue()
    {
        return g;
    }

    public int getResultSize()
    {
        return j.size();
    }

    public Map getResults()
    {
        return j;
    }

    public String getTagVarName()
    {
        return c;
    }

    public String getTagVarValue()
    {
        return d;
    }

    public Map getThen()
    {
        return h;
    }

    public int getThenSize()
    {
        return h.size();
    }

    public boolean isValid()
    {
        return b;
    }

    public String toString()
    {
        Object obj1 = (new StringBuilder("TagVar( name=")).append(c).append(" value=").append(d).append(" ) ").toString();
        Object obj = obj1;
        if (!e.isEmpty())
        {
            obj = (new StringBuilder()).append(((String) (obj1))).append("Condition( ").toString();
            for (int k = 0; k < e.size(); k++)
            {
                obj1 = (String)e.get(k);
                obj = (new StringBuilder()).append(((String) (obj))).append(((String) (obj1))).append(" ").toString();
            }

            obj = (new StringBuilder()).append(((String) (obj))).append(") ").toString();
        }
        obj1 = (new StringBuilder()).append(((String) (obj))).append("Is( type=").append(f).append(" value=").append(g).append(" )").toString();
        obj = obj1;
        if (!h.isEmpty())
        {
            obj = (new StringBuilder()).append(((String) (obj1))).append(" Then( ").toString();
            for (obj1 = h.keySet().iterator(); ((Iterator) (obj1)).hasNext();)
            {
                String s = (String)((Iterator) (obj1)).next();
                String s3 = (String)h.get(s);
                obj = (new StringBuilder()).append(((String) (obj))).append(s).append("=").append(s3).append(" ").toString();
            }

            obj = (new StringBuilder()).append(((String) (obj))).append(")").toString();
        }
        obj1 = obj;
        if (!i.isEmpty())
        {
            obj = (new StringBuilder()).append(((String) (obj))).append(" Else( ").toString();
            for (obj1 = i.keySet().iterator(); ((Iterator) (obj1)).hasNext();)
            {
                String s1 = (String)((Iterator) (obj1)).next();
                String s4 = (String)i.get(s1);
                obj = (new StringBuilder()).append(((String) (obj))).append(s1).append("=").append(s4).append(" ").toString();
            }

            obj1 = (new StringBuilder()).append(((String) (obj))).append(")").toString();
        }
        obj = obj1;
        if (!j.isEmpty())
        {
            obj = (new StringBuilder()).append(((String) (obj1))).append(" Result( ").toString();
            for (Iterator iterator = j.keySet().iterator(); iterator.hasNext();)
            {
                String s2 = (String)iterator.next();
                String s5 = (String)j.get(s2);
                obj = (new StringBuilder()).append(((String) (obj))).append(s2).append("=").append(s5).append(" ").toString();
            }

            obj = (new StringBuilder()).append(((String) (obj))).append(")").toString();
        }
        return ((String) (obj));
    }

    public (AppConfig appconfig,  )
    {
        a = appconfig;
        super();
        b = false;
        c = "";
        d = "";
        e = new LinkedList();
        f = "";
        g = "";
        h = new HashMap();
        i = new HashMap();
        j = new HashMap();
        f = .f;
        g = .g;
        i.putAll(.i);
        h.putAll(.h);
        j.putAll(.j);
        c = .c;
        d = .d;
        e.addAll(.e);
    }

    public e(AppConfig appconfig, JSONObject jsonobject)
    {
        a = appconfig;
        super();
        b = false;
        c = "";
        d = "";
        e = new LinkedList();
        f = "";
        g = "";
        h = new HashMap();
        i = new HashMap();
        j = new HashMap();
        b = false;
        if (jsonobject == null)
        {
            com.nielsen.app.sdk.c.a(3, 'E', "There is no rule to parse", new Object[0]);
            return;
        }
        appconfig = jsonobject.getJSONObject("tagVar");
        if (appconfig == null) goto _L2; else goto _L1
_L1:
        c = appconfig.getString("name");
        d = appconfig.getString("value");
        appconfig = jsonobject.getJSONObject("is");
        if (appconfig == null) goto _L4; else goto _L3
_L3:
        f = appconfig.getString("type");
        g = appconfig.getString("value");
        String s;
        int k;
        try
        {
            appconfig = jsonobject.getJSONArray("cond");
        }
        // Misplaced declaration of an exception variable
        catch (AppConfig appconfig)
        {
            com.nielsen.app.sdk.c.a(3, 'E', "There should be \"%s\" JSON array on current filter(%s)", new Object[] {
                "cond", jsonobject.toString()
            });
            return;
        }
        if (appconfig == null)
        {
            break MISSING_BLOCK_LABEL_366;
        }
        k = 0;
        if (k >= appconfig.length())
        {
            break; /* Loop/switch isn't completed */
        }
        s = appconfig.getString(k);
        e.add(s);
        k++;
        if (true) goto _L6; else goto _L5
_L6:
        break MISSING_BLOCK_LABEL_180;
_L2:
        try
        {
            com.nielsen.app.sdk.c.a(3, 'E', "There must be a \"tagVar\" statement on filter(%s)", new Object[] {
                jsonobject.toString()
            });
            return;
        }
        // Misplaced declaration of an exception variable
        catch (AppConfig appconfig)
        {
            com.nielsen.app.sdk.c.a(3, 'E', "There should be \"%s\" on current filter(%s)", new Object[] {
                "tagVar", jsonobject.toString()
            });
        }
        return;
_L4:
        try
        {
            com.nielsen.app.sdk.c.a(3, 'E', "There must be a \"is\" statement on filter(%s)", new Object[] {
                jsonobject.toString()
            });
            return;
        }
        // Misplaced declaration of an exception variable
        catch (AppConfig appconfig)
        {
            com.nielsen.app.sdk.c.a(3, 'E', "There should be \"%s\" on current filter(%s)", new Object[] {
                "is", jsonobject.toString()
            });
        }
        return;
_L5:
        if (e.size() <= 0)
        {
            com.nielsen.app.sdk.c.a(3, 'E', "There should be at least one value on current condition(%s)", new Object[] {
                appconfig.toString()
            });
            return;
        }
        break MISSING_BLOCK_LABEL_386;
        com.nielsen.app.sdk.c.a(3, 'E', "There must be a \"cond\" statement on filter(%s)", new Object[] {
            jsonobject.toString()
        });
        return;
        Iterator iterator;
        String s1;
        String s4;
        try
        {
            appconfig = jsonobject.getJSONObject("then");
        }
        // Misplaced declaration of an exception variable
        catch (AppConfig appconfig)
        {
            com.nielsen.app.sdk.c.a(3, 'E', "There must be \"%s\" on filter declaration(%s)", new Object[] {
                "then", jsonobject.toString()
            });
            return;
        }
        if (appconfig == null)
        {
            break MISSING_BLOCK_LABEL_505;
        }
        for (iterator = appconfig.keys(); iterator.hasNext(); h.put(s1, s4))
        {
            s1 = (String)iterator.next();
            s4 = appconfig.getString(s1);
        }

        if (h.size() <= 0)
        {
            com.nielsen.app.sdk.c.a(3, 'E', "There should be at least one name/value on current object(%s)", new Object[] {
                appconfig.toString()
            });
            return;
        }
        break MISSING_BLOCK_LABEL_530;
        com.nielsen.app.sdk.c.a(3, 'E', "There must be a \"%s\" statement on filter(%s)", new Object[] {
            "then", jsonobject.toString()
        });
        return;
        appconfig = jsonobject.getJSONObject("else");
        if (appconfig != null)
        {
            try
            {
                String s2;
                String s5;
                for (Iterator iterator1 = appconfig.keys(); iterator1.hasNext(); i.put(s2, s5))
                {
                    s2 = (String)iterator1.next();
                    s5 = appconfig.getString(s2);
                }

            }
            // Misplaced declaration of an exception variable
            catch (AppConfig appconfig)
            {
                try
                {
                    com.nielsen.app.sdk.c.a(3, 'E', "Could not parse \"%s\" on filter(%s)", new Object[] {
                        "else", jsonobject.toString()
                    });
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (AppConfig appconfig) { }
            }
        }
        appconfig = jsonobject.getJSONObject("result");
        if (appconfig != null)
        {
            try
            {
                String s3;
                String s6;
                for (Iterator iterator2 = appconfig.keys(); iterator2.hasNext(); j.put(s3, s6))
                {
                    s3 = (String)iterator2.next();
                    s6 = appconfig.getString(s3);
                }

            }
            // Misplaced declaration of an exception variable
            catch (AppConfig appconfig)
            {
                try
                {
                    com.nielsen.app.sdk.c.a(3, 'E', "Could not parse \"%s\" on filter(%s)", new Object[] {
                        "result", jsonobject.toString()
                    });
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (AppConfig appconfig) { }
            }
        }
        b = true;
        return;
    }
}
