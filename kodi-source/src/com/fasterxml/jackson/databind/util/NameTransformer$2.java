// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.util;


// Referenced classes of package com.fasterxml.jackson.databind.util:
//            NameTransformer

static final class nit> extends NameTransformer
{

    final String val$prefix;
    final String val$suffix;

    public String toString()
    {
        return (new StringBuilder()).append("[PreAndSuffixTransformer('").append(val$prefix).append("','").append(val$suffix).append("')]").toString();
    }

    public String transform(String s)
    {
        return (new StringBuilder()).append(val$prefix).append(s).append(val$suffix).toString();
    }

    (String s, String s1)
    {
        val$prefix = s;
        val$suffix = s1;
        super();
    }
}
