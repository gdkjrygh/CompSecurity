// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.nuance.b.a:
//            aj, q, b, e, 
//            ah, f, z

public abstract class a
    implements aj
{

    f a;
    private b b;
    private aj c;
    protected q collectionMode;
    private final List d = new ArrayList();
    private final List e = new ArrayList();
    public final String name;

    a(String s)
    {
        c = this;
        collectionMode = q.a;
        if (s == null || !s.matches("^[a-zA-Z0-9\\-_]+$"))
        {
            throw new IllegalArgumentException((new StringBuilder("name ")).append(s).append(" does not match ^[a-zA-Z0-9\\-_]+$").toString());
        } else
        {
            name = s;
            return;
        }
    }

    void a()
    {
    }

    public transient void activateGlobalCommand(ah aah[])
    {
        if (aah != null)
        {
            int j = aah.length;
            int i = 0;
            while (i < j) 
            {
                ah ah1 = aah[i];
                if (ah1 != null && !e.contains(ah1))
                {
                    e.add(ah1);
                }
                i++;
            }
        }
    }

    public transient void addPromptKeys(String as[])
    {
        if (as != null)
        {
            int j = as.length;
            int i = 0;
            while (i < j) 
            {
                String s = as[i];
                if (s == null || !s.matches("[a-zA-Z0-9\\-_\\.]+"))
                {
                    throw new IllegalArgumentException((new StringBuilder("invalid prompt key '")).append(s).append("'").toString());
                }
                if (!d.contains(s))
                {
                    d.add(s);
                }
                i++;
            }
        }
    }

    void b()
    {
    }

    b c()
    {
        return b;
    }

    public String getActivationCondition()
    {
        if (b == null)
        {
            return null;
        } else
        {
            return b.a();
        }
    }

    public q getCollectionMode()
    {
        return collectionMode;
    }

    public List getHints(String s, z z)
    {
        if (c != null && this != c)
        {
            return c.getHints(s, z);
        } else
        {
            return new ArrayList();
        }
    }

    public aj getHintsInterface()
    {
        if (c == null)
        {
            return this;
        } else
        {
            return c;
        }
    }

    public void setActivationCondition(b b1)
    {
        if (b1 == null)
        {
            return;
        } else
        {
            b = b1;
            return;
        }
    }

    public void setActivationCondition(String s)
    {
        if (s == null)
        {
            return;
        } else
        {
            b = new b(e.c, s);
            return;
        }
    }

    public void setCollectionMode(q q1)
    {
        if (q1 == null)
        {
            throw new NullPointerException("collectionMode cannot be null");
        } else
        {
            collectionMode = q1;
            return;
        }
    }

    public void setHintsInterface(aj aj1)
    {
        if (aj1 == null)
        {
            c = this;
            return;
        } else
        {
            c = aj1;
            return;
        }
    }

    public JSONObject toJSONObject()
    {
        Object obj;
        Object obj1;
        obj = new JSONObject();
        try
        {
            ((JSONObject) (obj)).put("name", name);
            if (d.isEmpty())
            {
                break MISSING_BLOCK_LABEL_118;
            }
            Collections.sort(d);
            obj1 = new JSONArray();
            for (Iterator iterator = d.iterator(); iterator.hasNext(); ((JSONArray) (obj1)).put((String)iterator.next())) { }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new RuntimeException((new StringBuilder("Should be impossible. ")).append(((JSONException) (obj)).toString()).toString());
        }
        ((JSONObject) (obj)).put("prompts", obj1);
        JSONArray jsonarray;
        obj1 = new JSONObject();
        ((JSONObject) (obj1)).put("collectionMode", getCollectionMode().toString());
        if (e.isEmpty())
        {
            break MISSING_BLOCK_LABEL_217;
        }
        Collections.sort(e);
        jsonarray = new JSONArray();
        for (Iterator iterator1 = e.iterator(); iterator1.hasNext(); jsonarray.put(((ah)iterator1.next()).toString())) { }
        ((JSONObject) (obj1)).put("globalCommands", jsonarray);
        if (b != null)
        {
            ((JSONObject) (obj1)).put("activationCondition", b.a());
        }
        ((JSONObject) (obj)).put("properties", obj1);
        return ((JSONObject) (obj));
    }
}
