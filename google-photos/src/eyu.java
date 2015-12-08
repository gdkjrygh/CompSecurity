// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public final class eyu
{

    private final Map a = new HashMap();

    public eyu()
    {
    }

    public final elb a(ekq ekq, ekw ekw, Set set)
    {
        eyt eyt1 = a(ekq);
        try
        {
            ekq = eyt1.a(ekq, ekw, set);
        }
        // Misplaced declaration of an exception variable
        catch (ekq ekq)
        {
            return b.a(ekq);
        }
        return b.b(ekq);
    }

    public eyt a(ekq ekq)
    {
        eyt eyt1 = (eyt)a.get(ekq.getClass());
        if (eyt1 == null)
        {
            ekq = String.valueOf(ekq);
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(ekq).length() + 43)).append("No registered handler for collection type: ").append(ekq).toString());
        } else
        {
            return eyt1;
        }
    }

    public final eyu a(eyt eyt1)
    {
        a.put(eyt1.a(), eyt1);
        return this;
    }
}
