// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.e.c;

import com.ford.syncV4.b.a;
import com.ford.syncV4.e.c.a.m;
import com.ford.syncV4.e.d;
import com.ford.syncV4.util.c;
import java.util.Hashtable;
import java.util.Vector;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.ford.syncV4.e.c:
//            x

public final class an extends d
{

    Hashtable e;
    JSONObject f;

    public an()
    {
        super("OnSystemRequest");
        e = null;
        f = null;
    }

    public an(Hashtable hashtable)
    {
        super(hashtable);
        e = null;
        f = null;
        hashtable = (byte[])hashtable.get("bulkData");
        if (hashtable == null)
        {
            return;
        }
        try
        {
            f = new JSONObject(new String(hashtable));
            e = (Hashtable)a.a(f).get("HTTPRequest");
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Hashtable hashtable)
        {
            hashtable.printStackTrace();
        }
        return;
    }

    public final Vector c()
    {
        if (b.get("data") instanceof Vector)
        {
            Vector vector = (Vector)b.get("data");
            if (vector != null && vector.size() > 0 && (vector.get(0) instanceof String))
            {
                return vector;
            }
        }
        return null;
    }

    public final String d()
    {
        String s;
        if (e != null)
        {
            return f.getJSONObject("HTTPRequest").getString("body");
        }
        if (f == null)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        s = f.toString();
        return s;
        Exception exception;
        exception;
        return null;
    }

    public final x e()
    {
        Object obj;
        if (e == null)
        {
            return null;
        }
        obj = e.get("headers");
        if (obj == null)
        {
            return null;
        }
        if (obj instanceof x)
        {
            return (x)obj;
        }
        if (!(obj instanceof Hashtable))
        {
            break MISSING_BLOCK_LABEL_90;
        }
        obj = new x((Hashtable)obj);
        return ((x) (obj));
        Exception exception;
        exception;
        com.ford.syncV4.util.c.a((new StringBuilder("Failed to parse ")).append(getClass().getSimpleName()).append(".headers").toString(), exception);
        return null;
    }

    public final m f()
    {
        Object obj = b.get("requestType");
        if (obj != null)
        {
            if (obj instanceof m)
            {
                return (m)obj;
            }
            if (obj instanceof String)
            {
                try
                {
                    obj = m.a((String)obj);
                }
                catch (Exception exception)
                {
                    com.ford.syncV4.util.c.a((new StringBuilder("Failed to parse ")).append(getClass().getSimpleName()).append(".requestType").toString(), exception);
                    exception = null;
                }
                return ((m) (obj));
            }
        }
        return null;
    }

    public final String i()
    {
        Object obj1 = b.get("url");
        Object obj = obj1;
        if (obj1 == null)
        {
            obj = b.get("URL");
        }
        if (obj == null)
        {
            return null;
        }
        if (obj instanceof String)
        {
            return (String)obj;
        } else
        {
            return null;
        }
    }

    public final com.ford.syncV4.e.c.a.d j()
    {
        Object obj = b.get("fileType");
        if (obj != null)
        {
            if (obj instanceof com.ford.syncV4.e.c.a.d)
            {
                return (com.ford.syncV4.e.c.a.d)obj;
            }
            if (obj instanceof String)
            {
                try
                {
                    obj = com.ford.syncV4.e.c.a.d.a((String)obj);
                }
                catch (Exception exception)
                {
                    com.ford.syncV4.util.c.a((new StringBuilder("Failed to parse ")).append(getClass().getSimpleName()).append(".fileType").toString(), exception);
                    exception = null;
                }
                return ((com.ford.syncV4.e.c.a.d) (obj));
            }
        }
        return null;
    }

    public final Integer k()
    {
        Object obj1 = b.get("timeout");
        Object obj = obj1;
        if (obj1 == null)
        {
            Object obj2 = b.get("Timeout");
            obj = obj2;
            if (obj2 == null)
            {
                return null;
            }
        }
        if (obj instanceof Integer)
        {
            return (Integer)obj;
        } else
        {
            return null;
        }
    }
}
