// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.e;

import com.ford.syncV4.b.a;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONObject;

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

    protected static String a(Set set)
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

    public final JSONObject a(byte byte0)
    {
        if (byte0 > 1)
        {
            String s = a(d.keySet());
            return com.ford.syncV4.b.a.a((Hashtable)((Hashtable)d.get(s)).get("parameters"));
        } else
        {
            return com.ford.syncV4.b.a.a(d);
        }
    }

    public final void a(byte abyte0[])
    {
        if (abyte0 != null)
        {
            a = new byte[abyte0.length];
            System.arraycopy(abyte0, 0, a, 0, abyte0.length);
        }
    }

    public final JSONObject g()
    {
        return com.ford.syncV4.b.a.a(d);
    }

    public final byte[] h()
    {
        return a;
    }
}
