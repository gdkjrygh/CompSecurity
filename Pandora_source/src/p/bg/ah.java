// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.bg;

import java.util.Hashtable;
import p.bd.d;
import p.bh.g;

public class ah extends d
{

    public ah()
    {
        super("OnDriverDistraction");
    }

    public ah(Hashtable hashtable)
    {
        super(hashtable);
    }

    public g c()
    {
        Object obj = b.get("state");
        if (obj instanceof g)
        {
            return (g)obj;
        }
        if (obj instanceof String)
        {
            try
            {
                obj = g.a((String)obj);
            }
            catch (Exception exception)
            {
                p.bn.d.a((new StringBuilder()).append("Failed to parse ").append(getClass().getSimpleName()).append(".").append("state").toString(), exception);
                return null;
            }
            return ((g) (obj));
        } else
        {
            return null;
        }
    }
}
