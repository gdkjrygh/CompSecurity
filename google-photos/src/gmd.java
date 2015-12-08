// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.HashMap;
import java.util.Map;

public final class gmd
{

    public final Map a = new HashMap();

    public gmd()
    {
    }

    private gmc a(ekq ekq)
    {
        gmc gmc1 = (gmc)a.get(ekq.getClass());
        if (gmc1 == null)
        {
            ekq = String.valueOf(ekq);
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(ekq).length() + 43)).append("No registered handler for collection type: ").append(ekq).toString());
        } else
        {
            return gmc1;
        }
    }

    public final elb a(ehr ehr1, int i)
    {
        gmc gmc1 = a(ehr1.a);
        try
        {
            ehr1 = gmc1.a(ehr1.a, ehr1.b, i);
        }
        // Misplaced declaration of an exception variable
        catch (ehr ehr1)
        {
            return b.a(ehr1);
        }
        return b.b(ehr1);
    }

    public final elb a(ehr ehr1, ekp ekp)
    {
        gmc gmc1 = a(ehr1.a);
        try
        {
            ehr1 = gmc1.a(ehr1.a, ehr1.b, ekp);
        }
        // Misplaced declaration of an exception variable
        catch (ehr ehr1)
        {
            return b.a(ehr1);
        }
        return b.b(ehr1);
    }

    public final gmd a(gmc gmc1)
    {
        a.put(gmc1.a(), gmc1);
        return this;
    }
}
