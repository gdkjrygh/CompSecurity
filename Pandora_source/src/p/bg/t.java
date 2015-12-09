// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.bg;

import java.util.Hashtable;
import p.bd.h;
import p.bh.f;
import p.bn.d;

public class t extends h
{

    public t()
    {
    }

    public t(Hashtable hashtable)
    {
        super(hashtable);
    }

    public f a()
    {
        Object obj = d.get("displayType");
        if (obj instanceof f)
        {
            return (f)obj;
        }
        if (obj instanceof String)
        {
            try
            {
                obj = f.a((String)obj);
            }
            catch (Exception exception)
            {
                d.a((new StringBuilder()).append("Failed to parse ").append(getClass().getSimpleName()).append(".").append("displayType").toString(), exception);
                return null;
            }
            return ((f) (obj));
        } else
        {
            return null;
        }
    }

    public Integer b()
    {
        return (Integer)d.get("numCustomPresetsAvailable");
    }
}
