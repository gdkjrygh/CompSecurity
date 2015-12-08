// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.bg;

import java.util.Hashtable;
import java.util.Vector;
import org.json.JSONException;
import org.json.JSONObject;
import p.ay.a;
import p.bd.d;
import p.bh.h;
import p.bh.r;

// Referenced classes of package p.bg:
//            y

public class ao extends d
{

    Hashtable e;
    JSONObject f;

    public ao()
    {
        super("OnSystemRequest");
        e = null;
        f = null;
    }

    public ao(Hashtable hashtable)
    {
        super(hashtable);
        e = null;
        f = null;
        hashtable = (byte[])(byte[])hashtable.get("bulkData");
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

    public Vector c()
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

    public String d()
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

    public y e()
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
        if (obj instanceof y)
        {
            return (y)obj;
        }
        if (!(obj instanceof Hashtable))
        {
            break MISSING_BLOCK_LABEL_98;
        }
        obj = new y((Hashtable)obj);
        return ((y) (obj));
        Exception exception;
        exception;
        p.bn.d.a((new StringBuilder()).append("Failed to parse ").append(getClass().getSimpleName()).append(".").append("headers").toString(), exception);
        return null;
    }

    public r f()
    {
        Object obj = b.get("requestType");
        if (obj != null)
        {
            if (obj instanceof r)
            {
                return (r)obj;
            }
            if (obj instanceof String)
            {
                try
                {
                    obj = r.a((String)obj);
                }
                catch (Exception exception)
                {
                    p.bn.d.a((new StringBuilder()).append("Failed to parse ").append(getClass().getSimpleName()).append(".").append("requestType").toString(), exception);
                    exception = null;
                }
                return ((r) (obj));
            }
        }
        return null;
    }

    public String i()
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

    public h j()
    {
        Object obj = b.get("fileType");
        if (obj != null)
        {
            if (obj instanceof h)
            {
                return (h)obj;
            }
            if (obj instanceof String)
            {
                try
                {
                    obj = h.a((String)obj);
                }
                catch (Exception exception)
                {
                    p.bn.d.a((new StringBuilder()).append("Failed to parse ").append(getClass().getSimpleName()).append(".").append("fileType").toString(), exception);
                    exception = null;
                }
                return ((h) (obj));
            }
        }
        return null;
    }

    public Integer k()
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
