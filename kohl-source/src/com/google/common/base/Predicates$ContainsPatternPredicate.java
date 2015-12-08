// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;

import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.google.common.base:
//            Predicate, Predicates, Preconditions, Objects

private static class pattern
    implements Predicate, Serializable
{

    private static final long serialVersionUID = 0L;
    final Pattern pattern;

    public boolean apply(CharSequence charsequence)
    {
        return pattern.matcher(charsequence).find();
    }

    public volatile boolean apply(Object obj)
    {
        return apply((CharSequence)obj);
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof apply)
        {
            obj = (apply)obj;
            flag = flag1;
            if (Objects.equal(pattern.pattern(), ((pattern) (obj)).pattern.pattern()))
            {
                flag = flag1;
                if (Objects.equal(Integer.valueOf(pattern.flags()), Integer.valueOf(((pattern) (obj)).pattern.flags())))
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    public int hashCode()
    {
        return Objects.hashCode(new Object[] {
            pattern.pattern(), Integer.valueOf(pattern.flags())
        });
    }

    public String toString()
    {
        return Objects.toStringHelper(this).pattern("pattern", pattern).pattern("pattern.flags", Integer.toHexString(pattern.flags())).pattern();
    }

    (String s)
    {
        this(Pattern.compile(s));
    }

    <init>(Pattern pattern1)
    {
        pattern = (Pattern)Preconditions.checkNotNull(pattern1);
    }
}
