// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.propeller.query;


public final class QueryHelper
{

    private QueryHelper()
    {
    }

    public static String resolveArguments(String s, String as[])
    {
        if (as == null)
        {
            return s;
        }
        for (int i = 0; i < as.length; i++)
        {
            if (as[i].contains(" "))
            {
                as[i] = (new StringBuilder("\"")).append(as[i]).append("\"").toString();
            }
        }

        return String.format(s.replaceAll("\\?", "%s"), as);
    }

    public static String[] toStringArgs(Object aobj[])
    {
        String as[] = new String[aobj.length];
        for (int i = 0; i < aobj.length; i++)
        {
            as[i] = aobj[i].toString();
        }

        return as;
    }
}
