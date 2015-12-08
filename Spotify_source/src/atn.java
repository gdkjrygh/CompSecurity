// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONObject;

public class atn
{

    byte d[];
    public Hashtable e;

    public atn()
    {
        d = null;
        e = null;
        e = new Hashtable();
    }

    public atn(Hashtable hashtable)
    {
        d = null;
        e = null;
        e = hashtable;
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
            String s = a(e.keySet());
            return asm.a((Hashtable)((Hashtable)e.get(s)).get("parameters"));
        } else
        {
            return asm.a(e);
        }
    }

    public final void a(byte abyte0[])
    {
        if (abyte0 != null)
        {
            d = new byte[abyte0.length];
            System.arraycopy(abyte0, 0, d, 0, abyte0.length);
        }
    }

    public final JSONObject g()
    {
        return asm.a(e);
    }
}
