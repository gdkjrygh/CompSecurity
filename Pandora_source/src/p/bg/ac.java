// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.bg;

import java.util.Hashtable;
import p.bd.d;
import p.bh.a;

public class ac extends d
{

    public ac()
    {
        super("OnAppInterfaceUnregistered");
    }

    public ac(Hashtable hashtable)
    {
        super(hashtable);
    }

    public a c()
    {
        Object obj = b.get("reason");
        if (obj instanceof a)
        {
            return (a)obj;
        }
        if (obj instanceof String)
        {
            try
            {
                obj = a.a((String)obj);
            }
            catch (Exception exception)
            {
                p.bn.d.a((new StringBuilder()).append("Failed to parse ").append(getClass().getSimpleName()).append(".").append("reason").toString(), exception);
                return null;
            }
            return ((a) (obj));
        } else
        {
            return null;
        }
    }
}
