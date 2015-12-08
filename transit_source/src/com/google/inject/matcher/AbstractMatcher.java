// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.matcher;

import java.io.Serializable;

// Referenced classes of package com.google.inject.matcher:
//            Matcher

public abstract class AbstractMatcher
    implements Matcher
{
    private static class AndMatcher extends AbstractMatcher
        implements Serializable
    {

        private static final long serialVersionUID = 0L;
        private final Matcher a;
        private final Matcher b;

        public boolean equals(Object obj)
        {
            return (obj instanceof AndMatcher) && ((AndMatcher)obj).a.equals(a) && ((AndMatcher)obj).b.equals(b);
        }

        public int hashCode()
        {
            return (a.hashCode() ^ b.hashCode()) * 41;
        }

        public boolean matches(Object obj)
        {
            return a.matches(obj) && b.matches(obj);
        }

        public String toString()
        {
            return (new StringBuilder()).append("and(").append(a).append(", ").append(b).append(")").toString();
        }

        public AndMatcher(Matcher matcher, Matcher matcher1)
        {
            a = matcher;
            b = matcher1;
        }
    }

    private static class OrMatcher extends AbstractMatcher
        implements Serializable
    {

        private static final long serialVersionUID = 0L;
        private final Matcher a;
        private final Matcher b;

        public boolean equals(Object obj)
        {
            return (obj instanceof OrMatcher) && ((OrMatcher)obj).a.equals(a) && ((OrMatcher)obj).b.equals(b);
        }

        public int hashCode()
        {
            return (a.hashCode() ^ b.hashCode()) * 37;
        }

        public boolean matches(Object obj)
        {
            return a.matches(obj) || b.matches(obj);
        }

        public String toString()
        {
            return (new StringBuilder()).append("or(").append(a).append(", ").append(b).append(")").toString();
        }

        public OrMatcher(Matcher matcher, Matcher matcher1)
        {
            a = matcher;
            b = matcher1;
        }
    }


    public AbstractMatcher()
    {
    }

    public Matcher and(Matcher matcher)
    {
        return new AndMatcher(this, matcher);
    }

    public Matcher or(Matcher matcher)
    {
        return new OrMatcher(this, matcher);
    }
}
