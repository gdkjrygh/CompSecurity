// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.util;


public abstract class NameTransformer
{
    public static class Chained extends NameTransformer
    {

        protected final NameTransformer _t1;
        protected final NameTransformer _t2;

        public String toString()
        {
            return (new StringBuilder()).append("[ChainedTransformer(").append(_t1).append(", ").append(_t2).append(")]").toString();
        }

        public String transform(String s)
        {
            return _t1.transform(_t2.transform(s));
        }

        public Chained(NameTransformer nametransformer, NameTransformer nametransformer1)
        {
            _t1 = nametransformer;
            _t2 = nametransformer1;
        }
    }


    public static final NameTransformer NOP = new NameTransformer() {

        public String transform(String s)
        {
            return s;
        }

    };

    protected NameTransformer()
    {
    }

    public static NameTransformer chainedTransformer(NameTransformer nametransformer, NameTransformer nametransformer1)
    {
        return new Chained(nametransformer, nametransformer1);
    }

    public static NameTransformer simpleTransformer(String s, String s1)
    {
        boolean flag1 = true;
        boolean flag;
        if (s != null && s.length() > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (s1 == null || s1.length() <= 0)
        {
            flag1 = false;
        }
        if (flag)
        {
            if (flag1)
            {
                return new NameTransformer(s, s1) {

                    final String val$prefix;
                    final String val$suffix;

                    public String toString()
                    {
                        return (new StringBuilder()).append("[PreAndSuffixTransformer('").append(prefix).append("','").append(suffix).append("')]").toString();
                    }

                    public String transform(String s2)
                    {
                        return (new StringBuilder()).append(prefix).append(s2).append(suffix).toString();
                    }

            
            {
                prefix = s;
                suffix = s1;
                super();
            }
                };
            } else
            {
                return new NameTransformer(s) {

                    final String val$prefix;

                    public String toString()
                    {
                        return (new StringBuilder()).append("[PrefixTransformer('").append(prefix).append("')]").toString();
                    }

                    public String transform(String s2)
                    {
                        return (new StringBuilder()).append(prefix).append(s2).toString();
                    }

            
            {
                prefix = s;
                super();
            }
                };
            }
        }
        if (flag1)
        {
            return new NameTransformer(s1) {

                final String val$suffix;

                public String toString()
                {
                    return (new StringBuilder()).append("[SuffixTransformer('").append(suffix).append("')]").toString();
                }

                public String transform(String s2)
                {
                    return (new StringBuilder()).append(s2).append(suffix).toString();
                }

            
            {
                suffix = s;
                super();
            }
            };
        } else
        {
            return NOP;
        }
    }

    public abstract String transform(String s);

}
