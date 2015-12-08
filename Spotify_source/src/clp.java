// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.HashMap;
import java.util.Map;

public final class clp extends cpd
{

    public final Map a = new HashMap();

    public clp()
    {
    }

    public static String a(String s)
    {
        btl.a(s);
        String s1 = s;
        if (s != null)
        {
            s1 = s;
            if (s.startsWith("&"))
            {
                s1 = s.substring(1);
            }
        }
        btl.a(s1, "Name can not be empty or \"&\"");
        return s1;
    }

    public final void a(cpd cpd1)
    {
        cpd1 = (clp)cpd1;
        btl.a(cpd1);
        ((clp) (cpd1)).a.putAll(a);
    }

    public final String toString()
    {
        return cpd.a(a, 0);
    }
}
