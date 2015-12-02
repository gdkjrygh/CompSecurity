// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.util;


// Referenced classes of package com.fasterxml.jackson.databind.util:
//            NameTransformer

final class nit> extends NameTransformer
{

    final String val$prefix;

    public String reverse(String s)
    {
        if (s.startsWith(val$prefix))
        {
            return s.substring(val$prefix.length());
        } else
        {
            return null;
        }
    }

    public String toString()
    {
        return (new StringBuilder()).append("[PrefixTransformer('").append(val$prefix).append("')]").toString();
    }

    public String transform(String s)
    {
        return (new StringBuilder()).append(val$prefix).append(s).toString();
    }

    ()
    {
        val$prefix = s;
        super();
    }
}
