// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.nuance.b.a:
//            a, ak, h, g, 
//            r, s, i, j, 
//            q, al, z

public class f extends a
    implements ak
{

    public static final String DEFAULT_AUTHENTICATION_CHECK_SLOT_NAME = "AUTHENTICATION_CHECK";
    public static final String DEFAULT_AUTHENTICATION_CHECK_SUFFIX = "_AuthenticationCheckAgent";
    private i b;
    private ak c;
    private final List d = new ArrayList();
    private boolean e;
    private h f;
    public final g type;

    public f(String s1, g g1)
    {
        super(s1);
        b = null;
        c = this;
        e = false;
        f = null;
        if (g1 == null)
        {
            throw new NullPointerException("type cannot be null");
        } else
        {
            type = g1;
            return;
        }
    }

    void a()
    {
        if (f == null)
        {
            f = new h(this, getCollectionMode());
        }
    }

    public void activate()
    {
        e = true;
    }

    public void addChild(f f1)
    {
        if (f1 == null)
        {
            throw new NullPointerException("agency must not be null");
        } else
        {
            d.add(f1);
            return;
        }
    }

    public void addChild(i k)
    {
        if (k == null)
        {
            throw new NullPointerException("agent must not be null");
        } else
        {
            d.add(k);
            return;
        }
    }

    void b()
    {
        if (f != null)
        {
            setCollectionMode(f.a);
        }
    }

    public void deactivate()
    {
        e = false;
    }

    public List getChildren()
    {
        ArrayList arraylist = new ArrayList(d.size());
        arraylist.addAll(d);
        return arraylist;
    }

    public ak getInterpretationHandler()
    {
        if (c == null)
        {
            return this;
        } else
        {
            return c;
        }
    }

    public i getSecurityAgent()
    {
        return b;
    }

    public void handleInterpretation(String s1, z z)
    {
        if (c != null && this != c)
        {
            c.handleInterpretation(s1, z);
        }
    }

    public boolean isActive()
    {
        return e;
    }

    public boolean isSecured()
    {
        return b != null;
    }

    public void setInterpretationHandler(ak ak1)
    {
        if (ak1 == null)
        {
            c = this;
            return;
        } else
        {
            c = ak1;
            return;
        }
    }

    public i setSecured()
    {
        return setSecured(null, null);
    }

    public i setSecured(String s1, String s2)
    {
        if (g.c == type)
        {
            throw new UnsupportedOperationException("Cannot set type ORN Agency to secured");
        }
        if (b != null)
        {
            return b;
        }
        String s3 = s1;
        if (s1 == null)
        {
            s3 = (new StringBuilder()).append(name).append("_AuthenticationCheckAgent").toString();
        }
        s1 = s2;
        if (s2 == null)
        {
            s1 = "AUTHENTICATION_CHECK";
        }
        s1 = new r(s1, s.b, null);
        b = new i(s3, j.a, s1);
        b.setCollectionMode(q.a);
        b.setPredictionMode(al.a);
        d.add(0, b);
        return b;
    }

    public final JSONObject toJSONObject()
    {
        Object obj = super.toJSONObject();
        JSONArray jsonarray;
        ((JSONObject) (obj)).put("component", "AGENCY");
        ((JSONObject) (obj)).put("type", type.toString());
        if (d.isEmpty())
        {
            break MISSING_BLOCK_LABEL_123;
        }
        jsonarray = new JSONArray();
        for (Iterator iterator = d.iterator(); iterator.hasNext(); jsonarray.put(((a)iterator.next()).toJSONObject())) { }
        try
        {
            ((JSONObject) (obj)).put("composedOf", jsonarray);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new RuntimeException((new StringBuilder("Should be impossible. ")).append(((JSONException) (obj)).toString()).toString());
        }
        return ((JSONObject) (obj));
    }

    public String toString()
    {
        return (new StringBuilder("[Agency ")).append(name).append(": type=").append(type).append("]").toString();
    }
}
