// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.common.collect:
//            Lists

private static final class sequence extends AbstractList
{

    private final CharSequence sequence;

    public boolean contains(Object obj)
    {
        return indexOf(obj) >= 0;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof List) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        obj = (List)obj;
        int j = sequence.length();
        if (j == ((List) (obj)).size())
        {
            obj = ((List) (obj)).iterator();
            int i = 0;
label0:
            do
            {
label1:
                {
                    if (i >= j)
                    {
                        break label1;
                    }
                    Object obj1 = ((Iterator) (obj)).next();
                    if (!(obj1 instanceof Character) || ((Character)obj1).charValue() != sequence.charAt(i))
                    {
                        break label0;
                    }
                    i++;
                }
            } while (true);
        }
        if (true) goto _L1; else goto _L3
_L3:
        return true;
    }

    public Character get(int i)
    {
        return Character.valueOf(sequence.charAt(i));
    }

    public volatile Object get(int i)
    {
        return get(i);
    }

    public int hashCode()
    {
        int j = 1;
        for (int i = 0; i < sequence.length(); i++)
        {
            j = j * 31 + sequence.charAt(i);
        }

        return j;
    }

    public int indexOf(Object obj)
    {
        if (obj instanceof Character)
        {
            char c = ((Character)obj).charValue();
            for (int i = 0; i < sequence.length(); i++)
            {
                if (sequence.charAt(i) == c)
                {
                    return i;
                }
            }

        }
        return -1;
    }

    public int lastIndexOf(Object obj)
    {
        if (obj instanceof Character)
        {
            char c = ((Character)obj).charValue();
            for (int i = sequence.length() - 1; i >= 0; i--)
            {
                if (sequence.charAt(i) == c)
                {
                    return i;
                }
            }

        }
        return -1;
    }

    public int size()
    {
        return sequence.length();
    }

    public List subList(int i, int j)
    {
        return Lists.charactersOf(sequence.subSequence(i, j));
    }

    (CharSequence charsequence)
    {
        sequence = charsequence;
    }
}
