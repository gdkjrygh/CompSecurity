// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.google.common.base:
//            CharMatcher, Preconditions

public final class Splitter
{
    private static abstract class AbstractIterator
        implements Iterator
    {

        Object next;
        State state;

        protected abstract Object computeNext();

        protected final Object endOfData()
        {
            state = State.DONE;
            return null;
        }

        public final boolean hasNext()
        {
            boolean flag1 = false;
            static class _cls6
            {

                static final int $SwitchMap$com$google$common$base$Splitter$AbstractIterator$State[];

                static 
                {
                    $SwitchMap$com$google$common$base$Splitter$AbstractIterator$State = new int[AbstractIterator.State.values().length];
                    try
                    {
                        $SwitchMap$com$google$common$base$Splitter$AbstractIterator$State[AbstractIterator.State.DONE.ordinal()] = 1;
                    }
                    catch (NoSuchFieldError nosuchfielderror1) { }
                    try
                    {
                        $SwitchMap$com$google$common$base$Splitter$AbstractIterator$State[AbstractIterator.State.READY.ordinal()] = 2;
                    }
                    catch (NoSuchFieldError nosuchfielderror)
                    {
                        return;
                    }
                }
            }

            boolean flag;
            if (state != State.FAILED)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkState(flag);
            flag = flag1;
            switch (_cls6..SwitchMap.com.google.common.base.Splitter.AbstractIterator.State[state.ordinal()])
            {
            default:
                flag = tryToComputeNext();
                // fall through

            case 1: // '\001'
                return flag;

            case 2: // '\002'
                return true;
            }
        }

        public final Object next()
        {
            if (!hasNext())
            {
                throw new NoSuchElementException();
            } else
            {
                state = State.NOT_READY;
                return next;
            }
        }

        public void remove()
        {
            throw new UnsupportedOperationException();
        }

        boolean tryToComputeNext()
        {
            state = State.FAILED;
            next = computeNext();
            if (state != State.DONE)
            {
                state = State.READY;
                return true;
            } else
            {
                return false;
            }
        }

        private AbstractIterator()
        {
            state = State.NOT_READY;
        }

    }

    static final class AbstractIterator.State extends Enum
    {

        private static final AbstractIterator.State $VALUES[];
        public static final AbstractIterator.State DONE;
        public static final AbstractIterator.State FAILED;
        public static final AbstractIterator.State NOT_READY;
        public static final AbstractIterator.State READY;

        public static AbstractIterator.State valueOf(String s)
        {
            return (AbstractIterator.State)Enum.valueOf(com/google/common/base/Splitter$AbstractIterator$State, s);
        }

        public static AbstractIterator.State[] values()
        {
            return (AbstractIterator.State[])$VALUES.clone();
        }

        static 
        {
            READY = new AbstractIterator.State("READY", 0);
            NOT_READY = new AbstractIterator.State("NOT_READY", 1);
            DONE = new AbstractIterator.State("DONE", 2);
            FAILED = new AbstractIterator.State("FAILED", 3);
            $VALUES = (new AbstractIterator.State[] {
                READY, NOT_READY, DONE, FAILED
            });
        }

        private AbstractIterator.State(String s, int i)
        {
            super(s, i);
        }
    }

    private static abstract class SplittingIterator extends AbstractIterator
    {

        int limit;
        int offset;
        final boolean omitEmptyStrings;
        final CharSequence toSplit;
        final CharMatcher trimmer;

        protected volatile Object computeNext()
        {
            return computeNext();
        }

        protected String computeNext()
        {
            while (offset != -1) 
            {
                int l = offset;
                int k = separatorStart(offset);
                int i;
                if (k == -1)
                {
                    i = toSplit.length();
                    offset = -1;
                } else
                {
                    i = k;
                    offset = separatorEnd(k);
                }
                do
                {
                    k = i;
                    if (l >= i)
                    {
                        break;
                    }
                    k = i;
                    if (!trimmer.matches(toSplit.charAt(l)))
                    {
                        break;
                    }
                    l++;
                } while (true);
                for (; k > l && trimmer.matches(toSplit.charAt(k - 1)); k--) { }
                if (!omitEmptyStrings || l != k)
                {
                    if (limit == 1)
                    {
                        int j = toSplit.length();
                        offset = -1;
                        do
                        {
                            k = j;
                            if (j <= l)
                            {
                                break;
                            }
                            k = j;
                            if (!trimmer.matches(toSplit.charAt(j - 1)))
                            {
                                break;
                            }
                            j--;
                        } while (true);
                    } else
                    {
                        limit = limit - 1;
                    }
                    return toSplit.subSequence(l, k).toString();
                }
            }
            return (String)endOfData();
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

    private static interface Strategy
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

    public static Splitter fixedLength(int i)
    {
        boolean flag;
        if (i > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "The length may not be less than 1");
        return new Splitter(new Strategy(i) {

            final int val$length;

            public SplittingIterator iterator(Splitter splitter, CharSequence charsequence)
            {
                return new SplittingIterator(splitter, charsequence) {

                    final _cls4 this$0;

                    public int separatorEnd(int i)
                    {
                        return i;
                    }

                    public int separatorStart(int i)
                    {
                        i += length;
                        if (i < toSplit.length())
                        {
                            return i;
                        } else
                        {
                            return -1;
                        }
                    }

            
            {
                this$0 = _cls4.this;
                super(splitter, charsequence);
            }
                };
            }

            public volatile Iterator iterator(Splitter splitter, CharSequence charsequence)
            {
                return iterator(splitter, charsequence);
            }

            
            {
                length = i;
                super();
            }
        });
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

            public SplittingIterator iterator(Splitter splitter, CharSequence charsequence)
            {
                return new SplittingIterator(splitter, charsequence) {

                    final _cls1 this$0;

                    int separatorEnd(int i)
                    {
                        return i + 1;
                    }

                    int separatorStart(int i)
                    {
                        return separatorMatcher.indexIn(toSplit, i);
                    }

            
            {
                this$0 = _cls1.this;
                super(splitter, charsequence);
            }
                };
            }

            public volatile Iterator iterator(Splitter splitter, CharSequence charsequence)
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

            public SplittingIterator iterator(Splitter splitter, CharSequence charsequence)
            {
                return new SplittingIterator(splitter, charsequence) {

                    final _cls2 this$0;

                    public int separatorEnd(int i)
                    {
                        return separator.length() + i;
                    }

                    public int separatorStart(int i)
                    {
                        int l = separator.length();
                        int i1 = toSplit.length();
label0:
                        do
                        {
                            int k;
                            if (i <= i1 - l)
                            {
                                int j = 0;
                                do
                                {
                                    k = i;
                                    if (j >= l)
                                    {
                                        break;
                                    }
                                    if (toSplit.charAt(j + i) != separator.charAt(j))
                                    {
                                        i++;
                                        continue label0;
                                    }
                                    j++;
                                } while (true);
                            } else
                            {
                                k = -1;
                            }
                            return k;
                        } while (true);
                    }

            
            {
                this$0 = _cls2.this;
                super(splitter, charsequence);
            }
                };
            }

            public volatile Iterator iterator(Splitter splitter, CharSequence charsequence)
            {
                return iterator(splitter, charsequence);
            }

            
            {
                separator = s;
                super();
            }
        });
    }

    public static Splitter on(Pattern pattern)
    {
        Preconditions.checkNotNull(pattern);
        boolean flag;
        if (!pattern.matcher("").matches())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "The pattern may not match the empty string: %s", new Object[] {
            pattern
        });
        return new Splitter(new Strategy(pattern) {

            final Pattern val$separatorPattern;

            public SplittingIterator iterator(Splitter splitter, CharSequence charsequence)
            {
                return splitter. new SplittingIterator(charsequence, separatorPattern.matcher(charsequence)) {

                    final _cls3 this$0;
                    final Matcher val$matcher;

                    public int separatorEnd(int i)
                    {
                        return matcher.end();
                    }

                    public int separatorStart(int i)
                    {
                        if (matcher.find(i))
                        {
                            return matcher.start();
                        } else
                        {
                            return -1;
                        }
                    }

            
            {
                this$0 = final__pcls3;
                matcher = matcher1;
                super(Splitter.this, charsequence);
            }
                };
            }

            public volatile Iterator iterator(Splitter splitter, CharSequence charsequence)
            {
                return iterator(splitter, charsequence);
            }

            
            {
                separatorPattern = pattern;
                super();
            }
        });
    }

    public static Splitter onPattern(String s)
    {
        return on(Pattern.compile(s));
    }

    public Splitter limit(int i)
    {
        boolean flag;
        if (i > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "must be greater then zero: %s", new Object[] {
            Integer.valueOf(i)
        });
        return new Splitter(strategy, omitEmptyStrings, trimmer, i);
    }

    public Splitter omitEmptyStrings()
    {
        return new Splitter(strategy, true, trimmer, limit);
    }

    public Iterable split(final CharSequence sequence)
    {
        Preconditions.checkNotNull(sequence);
        return new Iterable() {

            final Splitter this$0;
            final CharSequence val$sequence;

            public Iterator iterator()
            {
                return strategy.iterator(Splitter.this, sequence);
            }

            
            {
                this$0 = Splitter.this;
                sequence = charsequence;
                super();
            }
        };
    }

    public Splitter trimResults()
    {
        return trimResults(CharMatcher.WHITESPACE);
    }

    public Splitter trimResults(CharMatcher charmatcher)
    {
        Preconditions.checkNotNull(charmatcher);
        return new Splitter(strategy, omitEmptyStrings, charmatcher, limit);
    }




}
