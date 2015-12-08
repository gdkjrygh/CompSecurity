// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.lang3;

import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package org.apache.commons.lang3:
//            CharRange

public class CharSet
    implements Serializable
{

    public static final CharSet ASCII_ALPHA;
    public static final CharSet ASCII_ALPHA_LOWER;
    public static final CharSet ASCII_ALPHA_UPPER;
    public static final CharSet ASCII_NUMERIC;
    protected static final Map COMMON;
    public static final CharSet EMPTY;
    private static final long serialVersionUID = 0x528affa5f57a3936L;
    private final Set set = Collections.synchronizedSet(new HashSet());

    protected transient CharSet(String as[])
    {
        int j = as.length;
        for (int i = 0; i < j; i++)
        {
            add(as[i]);
        }

    }

    public static transient CharSet getInstance(String as[])
    {
        if (as != null) goto _L2; else goto _L1
_L1:
        CharSet charset = null;
_L4:
        return charset;
_L2:
        CharSet charset1;
        if (as.length != 1)
        {
            break; /* Loop/switch isn't completed */
        }
        charset1 = (CharSet)COMMON.get(as[0]);
        charset = charset1;
        if (charset1 != null) goto _L4; else goto _L3
_L3:
        return new CharSet(as);
    }

    protected void add(String s)
    {
        if (s != null)
        {
            int j = s.length();
            int i = 0;
            while (i < j) 
            {
                int k = j - i;
                if (k >= 4 && s.charAt(i) == '^' && s.charAt(i + 2) == '-')
                {
                    set.add(CharRange.isNotIn(s.charAt(i + 1), s.charAt(i + 3)));
                    i += 4;
                } else
                if (k >= 3 && s.charAt(i + 1) == '-')
                {
                    set.add(CharRange.isIn(s.charAt(i), s.charAt(i + 2)));
                    i += 3;
                } else
                if (k >= 2 && s.charAt(i) == '^')
                {
                    set.add(CharRange.isNot(s.charAt(i + 1)));
                    i += 2;
                } else
                {
                    set.add(CharRange.is(s.charAt(i)));
                    i++;
                }
            }
        }
    }

    public boolean contains(char c)
    {
        for (Iterator iterator = set.iterator(); iterator.hasNext();)
        {
            if (((CharRange)iterator.next()).contains(c))
            {
                return true;
            }
        }

        return false;
    }

    public boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (!(obj instanceof CharSet))
        {
            return false;
        } else
        {
            obj = (CharSet)obj;
            return set.equals(((CharSet) (obj)).set);
        }
    }

    CharRange[] getCharRanges()
    {
        return (CharRange[])set.toArray(new CharRange[set.size()]);
    }

    public int hashCode()
    {
        return set.hashCode() + 89;
    }

    public String toString()
    {
        return set.toString();
    }

    static 
    {
        EMPTY = new CharSet(new String[] {
            (String)null
        });
        ASCII_ALPHA = new CharSet(new String[] {
            "a-zA-Z"
        });
        ASCII_ALPHA_LOWER = new CharSet(new String[] {
            "a-z"
        });
        ASCII_ALPHA_UPPER = new CharSet(new String[] {
            "A-Z"
        });
        ASCII_NUMERIC = new CharSet(new String[] {
            "0-9"
        });
        COMMON = Collections.synchronizedMap(new HashMap());
        COMMON.put(null, EMPTY);
        COMMON.put("", EMPTY);
        COMMON.put("a-zA-Z", ASCII_ALPHA);
        COMMON.put("A-Za-z", ASCII_ALPHA);
        COMMON.put("a-z", ASCII_ALPHA_LOWER);
        COMMON.put("A-Z", ASCII_ALPHA_UPPER);
        COMMON.put("0-9", ASCII_NUMERIC);
    }
}
