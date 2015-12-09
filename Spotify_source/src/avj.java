// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ford.syncV4.proxy.rpc.enums.FileType;
import com.ford.syncV4.proxy.rpc.enums.RequestType;
import java.util.Hashtable;
import org.json.JSONException;
import org.json.JSONObject;

public final class avj extends atj
{

    private Hashtable f;
    private JSONObject g;

    public avj()
    {
        super("OnSystemRequest");
        f = null;
        g = null;
    }

    public avj(Hashtable hashtable)
    {
        super(hashtable);
        f = null;
        g = null;
        hashtable = (byte[])hashtable.get("bulkData");
        if (hashtable == null)
        {
            return;
        }
        try
        {
            g = new JSONObject(new String(hashtable));
            f = (Hashtable)asm.a(g).get("HTTPRequest");
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Hashtable hashtable)
        {
            hashtable.printStackTrace();
        }
        return;
    }

    public final String c()
    {
        String s;
        if (f != null)
        {
            return g.getJSONObject("HTTPRequest").getString("body");
        }
        if (g == null)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        s = g.toString();
        return s;
        Exception exception;
        exception;
        return null;
    }

    public final aut d()
    {
        Object obj;
        if (f == null)
        {
            return null;
        }
        obj = f.get("headers");
        if (obj == null)
        {
            return null;
        }
        if (obj instanceof aut)
        {
            return (aut)obj;
        }
        if (!(obj instanceof Hashtable))
        {
            break MISSING_BLOCK_LABEL_90;
        }
        obj = new aut((Hashtable)obj);
        return ((aut) (obj));
        Exception exception;
        exception;
        axt.a((new StringBuilder("Failed to parse ")).append(getClass().getSimpleName()).append(".headers").toString(), exception);
        return null;
    }

    public final RequestType e()
    {
        Object obj = b.get("requestType");
        if (obj != null)
        {
            if (obj instanceof RequestType)
            {
                return (RequestType)obj;
            }
            if (obj instanceof String)
            {
                try
                {
                    obj = RequestType.a((String)obj);
                }
                catch (Exception exception)
                {
                    axt.a((new StringBuilder("Failed to parse ")).append(getClass().getSimpleName()).append(".requestType").toString(), exception);
                    exception = null;
                }
                return ((RequestType) (obj));
            }
        }
        return null;
    }

    public final String f()
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

    public final FileType h()
    {
        Object obj = b.get("fileType");
        if (obj != null)
        {
            if (obj instanceof FileType)
            {
                return (FileType)obj;
            }
            if (obj instanceof String)
            {
                try
                {
                    obj = FileType.a((String)obj);
                }
                catch (Exception exception)
                {
                    axt.a((new StringBuilder("Failed to parse ")).append(getClass().getSimpleName()).append(".fileType").toString(), exception);
                    exception = null;
                }
                return ((FileType) (obj));
            }
        }
        return null;
    }
}
