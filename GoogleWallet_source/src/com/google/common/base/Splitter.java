// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;

import java.util.Iterator;

// Referenced classes of package com.google.common.base:
//            CharMatcher, Preconditions, AbstractIterator, Joiner

public final class Splitter
{
    static abstract class SplittingIterator extends AbstractIterator
    {

        int limit;
        int offset;
        final boolean omitEmptyStrings;
        final CharSequence toSplit;
        final CharMatcher trimmer;

        private String computeNext()
        {
            int i = offset;
            do
            {
                if (offset == -1)
                {
                    break;
                }
                int l = i;
                int i1 = separatorStart(offset);
                int j;
                if (i1 == -1)
                {
                    j = toSplit.length();
                    offset = -1;
                } else
                {
                    j = i1;
                    offset = separatorEnd(i1);
                }
                if (offset == i)
                {
                    offset = offset + 1;
                    if (offset >= toSplit.length())
                    {
                        offset = -1;
                    }
                } else
                {
                    do
                    {
                        i = j;
                        if (l >= j)
                        {
                            break;
                        }
                        i = j;
                        if (!trimmer.matches(toSplit.charAt(l)))
                        {
                            break;
                        }
                        l++;
                    } while (true);
                    for (; i > l && trimmer.matches(toSplit.charAt(i - 1)); i--) { }
                    if (omitEmptyStrings && l == i)
                    {
                        i = offset;
                    } else
                    {
                        int k;
                        if (limit == 1)
                        {
                            i = toSplit.length();
                            offset = -1;
                            do
                            {
                                k = i;
                                if (i <= l)
                                {
                                    break;
                                }
                                k = i;
                                if (!trimmer.matches(toSplit.charAt(i - 1)))
                                {
                                    break;
                                }
                                i--;
                            } while (true);
                        } else
                        {
                            limit = limit - 1;
                            k = i;
                        }
                        return toSplit.subSequence(l, k).toString();
                    }
                }
            } while (true);
            return (String)endOfData();
        }

        protected final volatile Object computeNext()
        {
            return computeNext();
        }

        abstract int separatorEnd(int i);

        abstract int separatorStart(int i);

        protected SplittingIterator(Splitter splitter, CharSequence charsequence)
        {
            offset = 0;
            trimmer = splitter.trimmer;
            omitEmptyStrings = splitter.omitEmptyStrings;
            limit = splitter.limit;
            toSplit = charsequence;
        }
    }

    static interface Strategy
    {

        public abstract Iterator iterator(Splitter splitter, CharSequence charsequence);
    }


    private final int limit;
    private final boolean omitEmptyStrings;
    private final Strategy strategy;
    private final CharMatcher trimmer;

    private Splitter(Strategy strategy1)
    {
        this(strategy1, false, CharMatcher.NONE, 0x7fffffff);
    }

    private Splitter(Strategy strategy1, boolean flag, CharMatcher charmatcher, int i)
    {
        strategy = strategy1;
        omitEmptyStrings = flag;
        trimmer = charmatcher;
        limit = i;
    }

    public static Splitter on(char c)
    {
        return on(CharMatcher.is(c));
    }

    public static Splitter on(CharMatcher charmatcher)
    {
        Preconditions.checkNotNull(charmatcher);
        return new Splitter(new Strategy(charmatcher) {

            final CharMatcher val$separatorMatcher;

            private SplittingIterator iterator(Splitter splitter, CharSequence charsequence)
            {
                return new SplittingIterator(splitter, charsequence) {

                    final _cls1 this$0;

                    final int separatorEnd(int i)
                    {
                        return i + 1;
                    }

                    final int separatorStart(int i)
                    {
                        return separatorMatcher.indexIn(toSplit, i);
                    }

            
            {
                this$0 = _cls1.this;
                super(splitter, charsequence);
            }
                };
            }

            public final volatile Iterator iterator(Splitter splitter, CharSequence charsequence)
            {
                return iterator(splitter, charsequence);
            }

            
            {
                separatorMatcher = charmatcher;
                super();
            }
        });
    }

    public static Splitter on(String s)
    {
        boolean flag;
        if (s.length() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "The separator may not be the empty string.");
        return new Splitter(new Strategy(s) {

            final String val$separator;

            private SplittingIterator iterator(Splitter splitter, CharSequence charsequence)
            {
                return new SplittingIterator(splitter, charsequence) {

                    final _cls2 this$0;

                    public final int separatorEnd(int i)
                    {
                        return separator.length() + i;
                    }

                    public final int separatorStart(int i)
                    {
                        int k;
label0:
                        {
                            int l = separator.length();
label1:
                            for (int i1 = toSplit.length(); i <= i1 - l; i++)
                            {
                                int j = 0;
                                do
                                {
                                    k = i;
                                    if (j >= l)
                                    {
                                        break label0;
                                    }
                                    if (toSplit.charAt(j + i) != separator.charAt(j))
                                    {
                                        continue label1;
                                    }
                                    j++;
                                } while (true);
                            }

                            k = -1;
                        }
                        return k;
                    }

            
            {
                this$0 = _cls2.this;
                super(splitter, charsequence);
            }
                };
            }

            public final volatile Iterator iterator(Splitter splitter, CharSequence charsequence)
            {
                return iterator(splitter, charsequence);
            }

            
            {
                separator = s;
                super();
            }
        });
    }

    private Iterator splittingIterator(CharSequence charsequence)
    {
        return strategy.iterator(this, charsequence);
    }

    private Splitter trimResults(CharMatcher charmatcher)
    {
        Preconditions.checkNotNull(charmatcher);
        return new Splitter(strategy, omitEmptyStrings, charmatcher, limit);
    }

    public final Splitter limit(int i)
    {
        boolean flag;
        if (i > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "must be greater than zero: %s", new Object[] {
            Integer.valueOf(i)
        });
        return new Splitter(strategy, omitEmptyStrings, trimmer, i);
    }

    public final Splitter omitEmptyStrings()
    {
        return new Splitter(strategy, true, trimmer, limit);
    }

    public final Iterable split(final CharSequence sequence)
    {
        Preconditions.checkNotNull(sequence);
        return new Iterable() {

            final Splitter this$0;
            final CharSequence val$sequence;

            public final Iterator iterator()
            {
                return splittingIterator(sequence);
            }

            public final String toString()
            {
                return Joiner.on(", ").appendTo(new StringBuilder("["), this).append(']').toString();
            }

            
            {
                this$0 = Splitter.this;
                sequence = charsequence;
                super();
            }
        };
    }

    public final Splitter trimResults()
    {
        return trimResults(CharMatcher.WHITESPACE);
    }




}
