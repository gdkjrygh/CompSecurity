// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class atb
{

    private static Map a = null;

    public atb()
    {
    }

    public static int a(String s)
    {
        if (a == null)
        {
            a();
        }
        s = (Integer)a.get(s);
        if (s != null)
        {
            return s.intValue();
        } else
        {
            return -1;
        }
    }

    public static String a(int i)
    {
        if (a == null)
        {
            a();
        }
        for (Iterator iterator = a.entrySet().iterator(); iterator.hasNext();)
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
            if (i == ((Integer)entry.getValue()).intValue())
            {
                return (String)entry.getKey();
            }
        }

        return null;
    }

    private static void a()
    {
        a = new com.ford.syncV4.protocol.enums.FunctionID._cls1();
    }

}
