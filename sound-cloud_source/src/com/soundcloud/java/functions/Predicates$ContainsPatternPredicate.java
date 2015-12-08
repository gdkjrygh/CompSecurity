// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.java.functions;

import com.soundcloud.java.checks.Preconditions;
import com.soundcloud.java.objects.MoreObjects;
import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.soundcloud.java.functions:
//            Predicate, Predicates

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
            if (MoreObjects.equal(pattern.pattern(), ((pattern) (obj)).pattern.pattern()))
            {
                flag = flag1;
                if (MoreObjects.equal(Integer.valueOf(pattern.flags()), Integer.valueOf(((pattern) (obj)).pattern.flags())))
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    public int hashCode()
    {
        return MoreObjects.hashCode(new Object[] {
            pattern.pattern(), Integer.valueOf(pattern.flags())
        });
    }

    public String toString()
    {
        String s = MoreObjects.toStringHelper(pattern).pattern("pattern", pattern.pattern()).pattern("pattern.flags", pattern.flags()).pattern();
        return (new StringBuilder("Predicates.contains(")).append(s).append(")").toString();
    }

    (Pattern pattern1)
    {
        pattern = (Pattern)Preconditions.checkNotNull(pattern1);
    }
}
