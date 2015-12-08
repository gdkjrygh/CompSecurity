// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.java.functions;

import java.util.regex.Pattern;

// Referenced classes of package com.soundcloud.java.functions:
//            Predicates

private static class Q extends Q
{

    private static final long serialVersionUID = 0L;

    public String toString()
    {
        return (new StringBuilder("Predicates.containsPattern(")).append(pattern.pattern()).append(")").toString();
    }

    Q(String s)
    {
        super(Pattern.compile(s));
    }
}
