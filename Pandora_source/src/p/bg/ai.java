// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.bg;

import java.util.Hashtable;
import p.bd.d;
import p.bh.b;
import p.bh.i;
import p.bh.y;

public class ai extends d
{

    private Boolean e;

    public ai()
    {
        super("OnHMIStatus");
    }

    public ai(Hashtable hashtable)
    {
        super(hashtable);
    }

    public void a(Boolean boolean1)
    {
        e = boolean1;
    }

    public i c()
    {
        Object obj = b.get("hmiLevel");
        if (obj instanceof i)
        {
            return (i)obj;
        }
        if (obj instanceof String)
        {
            try
            {
                obj = i.a((String)obj);
            }
            catch (Exception exception)
            {
                p.bn.d.a((new StringBuilder()).append("Failed to parse ").append(getClass().getSimpleName()).append(".").append("hmiLevel").toString(), exception);
                return null;
            }
            return ((i) (obj));
        } else
        {
            return null;
        }
    }

    public b d()
    {
        Object obj = b.get("audioStreamingState");
        if (obj instanceof b)
        {
            return (b)obj;
        }
        if (obj instanceof String)
        {
            try
            {
                obj = b.a((String)obj);
            }
            catch (Exception exception)
            {
                p.bn.d.a((new StringBuilder()).append("Failed to parse ").append(getClass().getSimpleName()).append(".").append("audioStreamingState").toString(), exception);
                return null;
            }
            return ((b) (obj));
        } else
        {
            return null;
        }
    }

    public y e()
    {
        Object obj = b.get("systemContext");
        if (obj instanceof y)
        {
            return (y)obj;
        }
        if (obj instanceof String)
        {
            try
            {
                obj = y.a((String)obj);
            }
            catch (Exception exception)
            {
                p.bn.d.a((new StringBuilder()).append("Failed to parse ").append(getClass().getSimpleName()).append(".").append("systemContext").toString(), exception);
                return null;
            }
            return ((y) (obj));
        } else
        {
            return null;
        }
    }
}
