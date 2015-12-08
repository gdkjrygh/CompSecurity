// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.lang3.text;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import org.apache.commons.lang3.ArrayUtils;

// Referenced classes of package org.apache.commons.lang3.text:
//            StrMatcher, StrBuilder

public class StrTokenizer
    implements ListIterator, Cloneable
{

    private static final StrTokenizer CSV_TOKENIZER_PROTOTYPE;
    private static final StrTokenizer TSV_TOKENIZER_PROTOTYPE;
    private char chars[];
    private StrMatcher delimMatcher;
    private boolean emptyAsNull;
    private boolean ignoreEmptyTokens;
    private StrMatcher ignoredMatcher;
    private StrMatcher quoteMatcher;
    private int tokenPos;
    private String tokens[];
    private StrMatcher trimmerMatcher;

    public StrTokenizer()
    {
        delimMatcher = StrMatcher.splitMatcher();
        quoteMatcher = StrMatcher.noneMatcher();
        ignoredMatcher = StrMatcher.noneMatcher();
        trimmerMatcher = StrMatcher.noneMatcher();
        emptyAsNull = false;
        ignoreEmptyTokens = true;
        chars = null;
    }

    public StrTokenizer(String s)
    {
        delimMatcher = StrMatcher.splitMatcher();
        quoteMatcher = StrMatcher.noneMatcher();
        ignoredMatcher = StrMatcher.noneMatcher();
        trimmerMatcher = StrMatcher.noneMatcher();
        emptyAsNull = false;
        ignoreEmptyTokens = true;
        if (s != null)
        {
            chars = s.toCharArray();
            return;
        } else
        {
            chars = null;
            return;
        }
    }

    public StrTokenizer(String s, char c)
    {
        this(s);
        setDelimiterChar(c);
    }

    public StrTokenizer(String s, char c, char c1)
    {
        this(s, c);
        setQuoteChar(c1);
    }

    public StrTokenizer(String s, String s1)
    {
        this(s);
        setDelimiterString(s1);
    }

    public StrTokenizer(String s, StrMatcher strmatcher)
    {
        this(s);
        setDelimiterMatcher(strmatcher);
    }

    public StrTokenizer(String s, StrMatcher strmatcher, StrMatcher strmatcher1)
    {
        this(s, strmatcher);
        setQuoteMatcher(strmatcher1);
    }

    public StrTokenizer(char ac[])
    {
        delimMatcher = StrMatcher.splitMatcher();
        quoteMatcher = StrMatcher.noneMatcher();
        ignoredMatcher = StrMatcher.noneMatcher();
        trimmerMatcher = StrMatcher.noneMatcher();
        emptyAsNull = false;
        ignoreEmptyTokens = true;
        chars = ArrayUtils.clone(ac);
    }

    public StrTokenizer(char ac[], char c)
    {
        this(ac);
        setDelimiterChar(c);
    }

    public StrTokenizer(char ac[], char c, char c1)
    {
        this(ac, c);
        setQuoteChar(c1);
    }

    public StrTokenizer(char ac[], String s)
    {
        this(ac);
        setDelimiterString(s);
    }

    public StrTokenizer(char ac[], StrMatcher strmatcher)
    {
        this(ac);
        setDelimiterMatcher(strmatcher);
    }

    public StrTokenizer(char ac[], StrMatcher strmatcher, StrMatcher strmatcher1)
    {
        this(ac, strmatcher);
        setQuoteMatcher(strmatcher1);
    }

    private void addToken(List list, String s)
    {
        String s1;
label0:
        {
            if (s != null)
            {
                s1 = s;
                if (s.length() != 0)
                {
                    break label0;
                }
            }
            if (isIgnoreEmptyTokens())
            {
                return;
            }
            s1 = s;
            if (isEmptyTokenAsNull())
            {
                s1 = null;
            }
        }
        list.add(s1);
    }

    private void checkTokenized()
    {
label0:
        {
            if (tokens == null)
            {
                if (chars != null)
                {
                    break label0;
                }
                List list = tokenize(null, 0, 0);
                tokens = (String[])list.toArray(new String[list.size()]);
            }
            return;
        }
        List list1 = tokenize(chars, 0, chars.length);
        tokens = (String[])list1.toArray(new String[list1.size()]);
    }

    private static StrTokenizer getCSVClone()
    {
        return (StrTokenizer)CSV_TOKENIZER_PROTOTYPE.clone();
    }

    public static StrTokenizer getCSVInstance()
    {
        return getCSVClone();
    }

    public static StrTokenizer getCSVInstance(String s)
    {
        StrTokenizer strtokenizer = getCSVClone();
        strtokenizer.reset(s);
        return strtokenizer;
    }

    public static StrTokenizer getCSVInstance(char ac[])
    {
        StrTokenizer strtokenizer = getCSVClone();
        strtokenizer.reset(ac);
        return strtokenizer;
    }

    private static StrTokenizer getTSVClone()
    {
        return (StrTokenizer)TSV_TOKENIZER_PROTOTYPE.clone();
    }

    public static StrTokenizer getTSVInstance()
    {
        return getTSVClone();
    }

    public static StrTokenizer getTSVInstance(String s)
    {
        StrTokenizer strtokenizer = getTSVClone();
        strtokenizer.reset(s);
        return strtokenizer;
    }

    public static StrTokenizer getTSVInstance(char ac[])
    {
        StrTokenizer strtokenizer = getTSVClone();
        strtokenizer.reset(ac);
        return strtokenizer;
    }

    private boolean isQuote(char ac[], int i, int j, int k, int l)
    {
        for (int i1 = 0; i1 < l; i1++)
        {
            if (i + i1 >= j || ac[i + i1] != ac[k + i1])
            {
                return false;
            }
        }

        return true;
    }

    private int readNextToken(char ac[], int i, int j, StrBuilder strbuilder, List list)
    {
label0:
        do
        {
            int k;
label1:
            {
                if (i < j)
                {
                    k = Math.max(getIgnoredMatcher().isMatch(ac, i, i, j), getTrimmerMatcher().isMatch(ac, i, i, j));
                    if (k != 0 && getDelimiterMatcher().isMatch(ac, i, i, j) <= 0 && getQuoteMatcher().isMatch(ac, i, i, j) <= 0)
                    {
                        break label1;
                    }
                }
                if (i >= j)
                {
                    addToken(list, "");
                    return -1;
                }
                break label0;
            }
            i += k;
        } while (true);
        int l = getDelimiterMatcher().isMatch(ac, i, i, j);
        if (l > 0)
        {
            addToken(list, "");
            return i + l;
        }
        l = getQuoteMatcher().isMatch(ac, i, i, j);
        if (l > 0)
        {
            return readWithQuotes(ac, i + l, j, strbuilder, list, i, l);
        } else
        {
            return readWithQuotes(ac, i, j, strbuilder, list, 0, 0);
        }
    }

    private int readWithQuotes(char ac[], int i, int j, StrBuilder strbuilder, List list, int k, int l)
    {
        strbuilder.clear();
        int i1 = i;
        int j1;
        boolean flag;
        if (l > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        j1 = 0;
        while (i1 < j) 
        {
            if (flag)
            {
                if (isQuote(ac, i1, j, k, l))
                {
                    if (isQuote(ac, i1 + l, j, k, l))
                    {
                        strbuilder.append(ac, i1, l);
                        i1 += l * 2;
                        j1 = strbuilder.size();
                    } else
                    {
                        flag = false;
                        i1 += l;
                    }
                } else
                {
                    strbuilder.append(ac[i1]);
                    j1 = strbuilder.size();
                    i1++;
                }
            } else
            {
                int k1 = getDelimiterMatcher().isMatch(ac, i1, i, j);
                if (k1 > 0)
                {
                    addToken(list, strbuilder.substring(0, j1));
                    return i1 + k1;
                }
                if (l > 0 && isQuote(ac, i1, j, k, l))
                {
                    flag = true;
                    i1 += l;
                } else
                {
                    int l1 = getIgnoredMatcher().isMatch(ac, i1, i, j);
                    if (l1 > 0)
                    {
                        i1 += l1;
                    } else
                    {
                        int i2 = getTrimmerMatcher().isMatch(ac, i1, i, j);
                        if (i2 > 0)
                        {
                            strbuilder.append(ac, i1, i2);
                            i1 += i2;
                        } else
                        {
                            strbuilder.append(ac[i1]);
                            j1 = strbuilder.size();
                            i1++;
                        }
                    }
                }
            }
        }
        addToken(list, strbuilder.substring(0, j1));
        return -1;
    }

    public volatile void add(Object obj)
    {
        add((String)obj);
    }

    public void add(String s)
    {
        throw new UnsupportedOperationException("add() is unsupported");
    }

    public Object clone()
    {
        Object obj;
        try
        {
            obj = cloneReset();
        }
        catch (CloneNotSupportedException clonenotsupportedexception)
        {
            return null;
        }
        return obj;
    }

    Object cloneReset()
        throws CloneNotSupportedException
    {
        StrTokenizer strtokenizer = (StrTokenizer)super.clone();
        if (strtokenizer.chars != null)
        {
            strtokenizer.chars = (char[])strtokenizer.chars.clone();
        }
        strtokenizer.reset();
        return strtokenizer;
    }

    public String getContent()
    {
        if (chars == null)
        {
            return null;
        } else
        {
            return new String(chars);
        }
    }

    public StrMatcher getDelimiterMatcher()
    {
        return delimMatcher;
    }

    public StrMatcher getIgnoredMatcher()
    {
        return ignoredMatcher;
    }

    public StrMatcher getQuoteMatcher()
    {
        return quoteMatcher;
    }

    public String[] getTokenArray()
    {
        checkTokenized();
        return (String[])tokens.clone();
    }

    public List getTokenList()
    {
        checkTokenized();
        ArrayList arraylist = new ArrayList(tokens.length);
        String as[] = tokens;
        int j = as.length;
        for (int i = 0; i < j; i++)
        {
            arraylist.add(as[i]);
        }

        return arraylist;
    }

    public StrMatcher getTrimmerMatcher()
    {
        return trimmerMatcher;
    }

    public boolean hasNext()
    {
        checkTokenized();
        return tokenPos < tokens.length;
    }

    public boolean hasPrevious()
    {
        checkTokenized();
        return tokenPos > 0;
    }

    public boolean isEmptyTokenAsNull()
    {
        return emptyAsNull;
    }

    public boolean isIgnoreEmptyTokens()
    {
        return ignoreEmptyTokens;
    }

    public volatile Object next()
    {
        return next();
    }

    public String next()
    {
        if (hasNext())
        {
            String as[] = tokens;
            int i = tokenPos;
            tokenPos = i + 1;
            return as[i];
        } else
        {
            throw new NoSuchElementException();
        }
    }

    public int nextIndex()
    {
        return tokenPos;
    }

    public String nextToken()
    {
        if (hasNext())
        {
            String as[] = tokens;
            int i = tokenPos;
            tokenPos = i + 1;
            return as[i];
        } else
        {
            return null;
        }
    }

    public volatile Object previous()
    {
        return previous();
    }

    public String previous()
    {
        if (hasPrevious())
        {
            String as[] = tokens;
            int i = tokenPos - 1;
            tokenPos = i;
            return as[i];
        } else
        {
            throw new NoSuchElementException();
        }
    }

    public int previousIndex()
    {
        return tokenPos - 1;
    }

    public String previousToken()
    {
        if (hasPrevious())
        {
            String as[] = tokens;
            int i = tokenPos - 1;
            tokenPos = i;
            return as[i];
        } else
        {
            return null;
        }
    }

    public void remove()
    {
        throw new UnsupportedOperationException("remove() is unsupported");
    }

    public StrTokenizer reset()
    {
        tokenPos = 0;
        tokens = null;
        return this;
    }

    public StrTokenizer reset(String s)
    {
        reset();
        if (s != null)
        {
            chars = s.toCharArray();
            return this;
        } else
        {
            chars = null;
            return this;
        }
    }

    public StrTokenizer reset(char ac[])
    {
        reset();
        chars = ArrayUtils.clone(ac);
        return this;
    }

    public volatile void set(Object obj)
    {
        set((String)obj);
    }

    public void set(String s)
    {
        throw new UnsupportedOperationException("set() is unsupported");
    }

    public StrTokenizer setDelimiterChar(char c)
    {
        return setDelimiterMatcher(StrMatcher.charMatcher(c));
    }

    public StrTokenizer setDelimiterMatcher(StrMatcher strmatcher)
    {
        if (strmatcher == null)
        {
            delimMatcher = StrMatcher.noneMatcher();
            return this;
        } else
        {
            delimMatcher = strmatcher;
            return this;
        }
    }

    public StrTokenizer setDelimiterString(String s)
    {
        return setDelimiterMatcher(StrMatcher.stringMatcher(s));
    }

    public StrTokenizer setEmptyTokenAsNull(boolean flag)
    {
        emptyAsNull = flag;
        return this;
    }

    public StrTokenizer setIgnoreEmptyTokens(boolean flag)
    {
        ignoreEmptyTokens = flag;
        return this;
    }

    public StrTokenizer setIgnoredChar(char c)
    {
        return setIgnoredMatcher(StrMatcher.charMatcher(c));
    }

    public StrTokenizer setIgnoredMatcher(StrMatcher strmatcher)
    {
        if (strmatcher != null)
        {
            ignoredMatcher = strmatcher;
        }
        return this;
    }

    public StrTokenizer setQuoteChar(char c)
    {
        return setQuoteMatcher(StrMatcher.charMatcher(c));
    }

    public StrTokenizer setQuoteMatcher(StrMatcher strmatcher)
    {
        if (strmatcher != null)
        {
            quoteMatcher = strmatcher;
        }
        return this;
    }

    public StrTokenizer setTrimmerMatcher(StrMatcher strmatcher)
    {
        if (strmatcher != null)
        {
            trimmerMatcher = strmatcher;
        }
        return this;
    }

    public int size()
    {
        checkTokenized();
        return tokens.length;
    }

    public String toString()
    {
        if (tokens == null)
        {
            return "StrTokenizer[not tokenized yet]";
        } else
        {
            return (new StringBuilder()).append("StrTokenizer").append(getTokenList()).toString();
        }
    }

    protected List tokenize(char ac[], int i, int j)
    {
        if (ac != null && j != 0) goto _L2; else goto _L1
_L1:
        Object obj = Collections.emptyList();
_L4:
        return ((List) (obj));
_L2:
        ArrayList arraylist;
        StrBuilder strbuilder;
        strbuilder = new StrBuilder();
        arraylist = new ArrayList();
_L6:
        obj = arraylist;
        if (i < 0) goto _L4; else goto _L3
_L3:
        obj = arraylist;
        if (i >= j) goto _L4; else goto _L5
_L5:
        int k = readNextToken(ac, i, j, strbuilder, arraylist);
        i = k;
        if (k >= j)
        {
            addToken(arraylist, "");
            i = k;
        }
          goto _L6
    }

    static 
    {
        CSV_TOKENIZER_PROTOTYPE = new StrTokenizer();
        CSV_TOKENIZER_PROTOTYPE.setDelimiterMatcher(StrMatcher.commaMatcher());
        CSV_TOKENIZER_PROTOTYPE.setQuoteMatcher(StrMatcher.doubleQuoteMatcher());
        CSV_TOKENIZER_PROTOTYPE.setIgnoredMatcher(StrMatcher.noneMatcher());
        CSV_TOKENIZER_PROTOTYPE.setTrimmerMatcher(StrMatcher.trimMatcher());
        CSV_TOKENIZER_PROTOTYPE.setEmptyTokenAsNull(false);
        CSV_TOKENIZER_PROTOTYPE.setIgnoreEmptyTokens(false);
        TSV_TOKENIZER_PROTOTYPE = new StrTokenizer();
        TSV_TOKENIZER_PROTOTYPE.setDelimiterMatcher(StrMatcher.tabMatcher());
        TSV_TOKENIZER_PROTOTYPE.setQuoteMatcher(StrMatcher.doubleQuoteMatcher());
        TSV_TOKENIZER_PROTOTYPE.setIgnoredMatcher(StrMatcher.noneMatcher());
        TSV_TOKENIZER_PROTOTYPE.setTrimmerMatcher(StrMatcher.trimMatcher());
        TSV_TOKENIZER_PROTOTYPE.setEmptyTokenAsNull(false);
        TSV_TOKENIZER_PROTOTYPE.setIgnoreEmptyTokens(false);
    }
}
