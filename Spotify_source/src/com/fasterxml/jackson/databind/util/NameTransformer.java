// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.util;


public abstract class NameTransformer
{

    public static final NameTransformer NOP = new NameTransformer() {

        public final String transform(String s)
        {
            return s;
        }

    };

    protected NameTransformer()
    {
    }

    public static NameTransformer chainedTransformer(NameTransformer nametransformer, NameTransformer nametransformer1)
    {
        return nametransformer. new Chained(nametransformer1);
    }

    public static NameTransformer simpleTransformer(final String prefix, final String suffix)
    {
        boolean flag1 = true;
        boolean flag;
        if (prefix != null && prefix.length() > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (suffix == null || suffix.length() <= 0)
        {
            flag1 = false;
        }
        if (flag)
        {
            if (flag1)
            {
                return new NameTransformer() {

                    final String val$prefix;
                    final String val$suffix;

                    public final String toString()
                    {
                        return (new StringBuilder("[PreAndSuffixTransformer('")).append(prefix).append("','").append(suffix).append("')]").toString();
                    }

                    public final String transform(String s)
                    {
                        return (new StringBuilder()).append(prefix).append(s).append(suffix).toString();
                    }

            
            {
                prefix = s;
                suffix = s1;
                super();
            }
                };
            } else
            {
                return new NameTransformer() {

                    final String val$prefix;

                    public final String toString()
                    {
                        return (new StringBuilder("[PrefixTransformer('")).append(prefix).append("')]").toString();
                    }

                    public final String transform(String s)
                    {
                        return (new StringBuilder()).append(prefix).append(s).toString();
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
            return new NameTransformer() {

                final String val$suffix;

                public final String toString()
                {
                    return (new StringBuilder("[SuffixTransformer('")).append(suffix).append("')]").toString();
                }

                public final String transform(String s)
                {
                    return (new StringBuilder()).append(s).append(suffix).toString();
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


    private class Chained extends NameTransformer
    {

        protected final NameTransformer _t1;
        protected final NameTransformer _t2;

        public String toString()
        {
            return (new StringBuilder("[ChainedTransformer(")).append(_t1).append(", ").append(_t2).append(")]").toString();
        }

        public String transform(String s)
        {
            return _t1.transform(_t2.transform(s));
        }

        public Chained(NameTransformer nametransformer1)
        {
            _t1 = NameTransformer.this;
            _t2 = nametransformer1;
        }
    }

}
