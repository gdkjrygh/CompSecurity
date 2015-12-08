// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.bg;

import java.util.Hashtable;
import p.bd.d;
import p.bh.m;

public class ak extends d
{

    public ak()
    {
        super("OnKeyboardInput");
    }

    public ak(Hashtable hashtable)
    {
        super(hashtable);
    }

    public m c()
    {
        Object obj = b.get("event");
        if (obj instanceof m)
        {
            return (m)obj;
        }
        if (obj instanceof String)
        {
            try
            {
                obj = m.a((String)obj);
            }
            catch (Exception exception)
            {
                p.bn.d.a((new StringBuilder()).append("Failed to parse ").append(getClass().getSimpleName()).append(".").append("event").toString(), exception);
                return null;
            }
            return ((m) (obj));
        } else
        {
            return null;
        }
    }

    public String d()
    {
        Object obj = b.get("data");
        if (obj instanceof String)
        {
            return (String)obj;
        } else
        {
            return null;
        }
    }

    public String toString()
    {
        return (new StringBuilder()).append(a()).append(": ").append(" data: ").append(d()).append(" event:").append(c().toString()).toString();
    }
}
