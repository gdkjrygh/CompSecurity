// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.bd;

import java.util.Hashtable;
import p.bh.s;
import p.bn.d;

// Referenced classes of package p.bd:
//            c

public class g extends c
{

    public g(String s1)
    {
        super(s1, "response");
    }

    public g(Hashtable hashtable)
    {
        super(hashtable);
    }

    public g(c c1)
    {
        super(c1);
    }

    public Integer c()
    {
        return (Integer)c.get("correlationID");
    }

    public Boolean d()
    {
        return (Boolean)b.get("success");
    }

    public s e()
    {
        Object obj = b.get("resultCode");
        if (obj instanceof s)
        {
            return (s)obj;
        }
        if (obj instanceof String)
        {
            try
            {
                obj = s.a((String)obj);
            }
            catch (Exception exception)
            {
                p.bn.d.a((new StringBuilder()).append("Failed to parse ").append(getClass().getSimpleName()).append(".").append("resultCode").toString(), exception);
                return null;
            }
            return ((s) (obj));
        } else
        {
            return null;
        }
    }

    public String f()
    {
        return (String)b.get("info");
    }
}
