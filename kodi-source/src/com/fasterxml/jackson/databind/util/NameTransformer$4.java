// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.util;


// Referenced classes of package com.fasterxml.jackson.databind.util:
//            NameTransformer

static final class nit> extends NameTransformer
{

    final String val$suffix;

    public String toString()
    {
        return (new StringBuilder()).append("[SuffixTransformer('").append(val$suffix).append("')]").toString();
    }

    public String transform(String s)
    {
        return (new StringBuilder()).append(s).append(val$suffix).toString();
    }

    (String s)
    {
        val$suffix = s;
        super();
    }
}
