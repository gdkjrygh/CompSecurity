// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.HashMap;
import java.util.Map;

public final class iui
{

    private Map a;

    public iui()
    {
        a = new HashMap();
    }

    public iui(Map map)
    {
        a = map;
    }

    public final ekp a(String s)
    {
        return (ekp)a.get(s);
    }

    public final boolean equals(Object obj)
    {
        if (a != null && (obj instanceof iui))
        {
            obj = (iui)obj;
            return a.equals(((iui) (obj)).a);
        } else
        {
            return false;
        }
    }

    public final int hashCode()
    {
        return a.hashCode();
    }
}
