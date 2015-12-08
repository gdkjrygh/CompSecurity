// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.bg;

import java.util.Hashtable;
import p.bd.e;
import p.bh.aa;
import p.bn.d;

// Referenced classes of package p.bg:
//            br

public class bi extends e
{

    public bi()
    {
        super("SetMediaClockTimer");
    }

    public void a(br br)
    {
        if (br != null)
        {
            b.put("startTime", br);
            return;
        } else
        {
            b.remove("startTime");
            return;
        }
    }

    public void a(aa aa1)
    {
        if (aa1 != null)
        {
            b.put("updateMode", aa1);
            return;
        } else
        {
            b.remove("updateMode");
            return;
        }
    }

    public void b(br br)
    {
        if (br != null)
        {
            b.put("endTime", br);
            return;
        } else
        {
            b.remove("endTime");
            return;
        }
    }

    public aa d()
    {
        Object obj = b.get("updateMode");
        if (obj instanceof aa)
        {
            return (aa)obj;
        }
        if (obj instanceof String)
        {
            try
            {
                obj = aa.a((String)obj);
            }
            catch (Exception exception)
            {
                p.bn.d.a((new StringBuilder()).append("Failed to parse ").append(getClass().getSimpleName()).append(".").append("updateMode").toString(), exception);
                return null;
            }
            return ((aa) (obj));
        } else
        {
            return null;
        }
    }
}
