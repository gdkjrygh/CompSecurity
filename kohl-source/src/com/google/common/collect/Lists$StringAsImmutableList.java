// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

// Referenced classes of package com.google.common.collect:
//            ImmutableList, Lists, UnmodifiableListIterator, AbstractIndexedListIterator

private static final class string extends ImmutableList
{

    int hash;
    private final String string;

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
        int j = string.length();
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
                    if (!(obj1 instanceof Character) || ((Character)obj1).charValue() != string.charAt(i))
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
        return Character.valueOf(string.charAt(i));
    }

    public volatile Object get(int i)
    {
        return get(i);
    }

    public int hashCode()
    {
        int j = hash;
        int i = j;
        if (j == 0)
        {
            i = 1;
            for (int k = 0; k < string.length(); k++)
            {
                i = i * 31 + string.charAt(k);
            }

            hash = i;
        }
        return i;
    }

    public int indexOf(Object obj)
    {
        if (obj instanceof Character)
        {
            return string.indexOf(((Character)obj).charValue());
        } else
        {
            return -1;
        }
    }

    boolean isPartialView()
    {
        return false;
    }

    public int lastIndexOf(Object obj)
    {
        if (obj instanceof Character)
        {
            return string.lastIndexOf(((Character)obj).charValue());
        } else
        {
            return -1;
        }
    }

    public UnmodifiableListIterator listIterator(int i)
    {
        return new AbstractIndexedListIterator(size(), i) {

            final Lists.StringAsImmutableList this$0;

            protected Character get(int j)
            {
                return Character.valueOf(string.charAt(j));
            }

            protected volatile Object get(int j)
            {
                return get(j);
            }

            
            {
                this$0 = Lists.StringAsImmutableList.this;
                super(i, j);
            }
        };
    }

    public volatile ListIterator listIterator(int i)
    {
        return listIterator(i);
    }

    public int size()
    {
        return string.length();
    }

    public ImmutableList subList(int i, int j)
    {
        return Lists.charactersOf(string.substring(i, j));
    }

    public volatile List subList(int i, int j)
    {
        return subList(i, j);
    }


    <init>(String s)
    {
        hash = 0;
        string = s;
    }
}
