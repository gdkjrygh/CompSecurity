// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.bd;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
import p.ay.a;

public class h
{

    private byte a[];
    protected Hashtable d;

    public h()
    {
        a = null;
        d = null;
        d = new Hashtable();
    }

    public h(Hashtable hashtable)
    {
        a = null;
        d = null;
        d = hashtable;
    }

    protected String a(Set set)
    {
        for (set = set.iterator(); set.hasNext();)
        {
            String s = (String)set.next();
            if (s != null && (s.equals("request") || s.equals("response") || s.equals("notification")))
            {
                return s;
            }
        }

        return null;
    }

    public JSONObject a(byte byte0)
        throws JSONException
    {
        if (byte0 > 1)
        {
            String s = a(d.keySet());
            return p.ay.a.a((Hashtable)((Hashtable)d.get(s)).get("parameters"));
        } else
        {
            return p.ay.a.a(d);
        }
    }

    public void a(byte abyte0[])
    {
        if (abyte0 != null)
        {
            a = new byte[abyte0.length];
            System.arraycopy(abyte0, 0, a, 0, abyte0.length);
        }
    }

    protected boolean a(Set set, String s)
    {
        for (set = set.iterator(); set.hasNext();)
        {
            String s1 = (String)set.next();
            if (s1 != null && s1.equals(s))
            {
                return true;
            }
        }

        return false;
    }

    public JSONObject g()
        throws JSONException
    {
        return p.ay.a.a(d);
    }

    public byte[] h()
    {
        return a;
    }
}
