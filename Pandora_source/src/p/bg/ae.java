// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.bg;

import java.util.Hashtable;
import p.bd.d;
import p.bh.c;

public class ae extends d
{

    public ae()
    {
        super("OnButtonEvent");
    }

    public ae(Hashtable hashtable)
    {
        super(hashtable);
    }

    public p.bh.d c()
    {
        Object obj = b.get("buttonName");
        if (obj instanceof p.bh.d)
        {
            return (p.bh.d)obj;
        }
        if (obj instanceof String)
        {
            try
            {
                obj = p.bh.d.a((String)obj);
            }
            catch (Exception exception)
            {
                p.bn.d.a((new StringBuilder()).append("Failed to parse ").append(getClass().getSimpleName()).append(".").append("buttonName").toString(), exception);
                return null;
            }
            return ((p.bh.d) (obj));
        } else
        {
            return null;
        }
    }

    public c d()
    {
        Object obj = b.get("buttonEventMode");
        if (obj instanceof c)
        {
            return (c)obj;
        }
        if (obj instanceof String)
        {
            try
            {
                obj = p.bh.c.a((String)obj);
            }
            catch (Exception exception)
            {
                p.bn.d.a((new StringBuilder()).append("Failed to parse ").append(getClass().getSimpleName()).append(".").append("buttonEventMode").toString(), exception);
                return null;
            }
            return ((c) (obj));
        } else
        {
            return null;
        }
    }

    public Integer e()
    {
        return (Integer)b.get("customButtonID");
    }
}
