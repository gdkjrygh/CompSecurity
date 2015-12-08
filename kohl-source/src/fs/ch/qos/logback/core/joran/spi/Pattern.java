// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.ch.qos.logback.core.joran.spi;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Pattern
{

    ArrayList partList;

    public Pattern()
    {
        partList = new ArrayList();
    }

    public Pattern(String s)
    {
        this();
        if (s != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        int i = 0;
        do
        {
            int j;
label0:
            {
                j = s.indexOf('/', i);
                if (j != -1)
                {
                    break label0;
                }
                String s1 = s.substring(i);
                if (s1 != null && s1.length() > 0)
                {
                    partList.add(s.substring(i));
                    return;
                }
            }
            if (true)
            {
                continue;
            }
            String s2 = s.substring(i, j);
            if (s2.length() > 0)
            {
                partList.add(s2);
            }
            i = j + 1;
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
    }

    public Pattern(List list)
    {
        partList = new ArrayList();
        partList.addAll(list);
    }

    private boolean equalityCheck(String s, String s1)
    {
        return s.equalsIgnoreCase(s1);
    }

    public Object clone()
    {
        Pattern pattern = new Pattern();
        pattern.partList.addAll(partList);
        return pattern;
    }

    public boolean equals(Object obj)
    {
        if (obj != null && (obj instanceof Pattern)) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        if (((Pattern) (obj = (Pattern)obj)).size() == size())
        {
            int j = size();
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
                    if (!equalityCheck(get(i), ((Pattern) (obj)).get(i)))
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

    public String get(int i)
    {
        return (String)partList.get(i);
    }

    public List getCopyOfPartList()
    {
        return new ArrayList(partList);
    }

    public int getPrefixMatchLength(Pattern pattern)
    {
        int j = 0;
        if (pattern == null)
        {
            return 0;
        }
        int i = partList.size();
        int k = pattern.partList.size();
        if (i == 0 || k == 0)
        {
            return 0;
        }
        if (i > k)
        {
            i = k;
        }
        for (k = 0; k < i && equalityCheck((String)partList.get(k), (String)pattern.partList.get(k));)
        {
            k++;
            j++;
        }

        return j;
    }

    public int getTailMatchLength(Pattern pattern)
    {
        if (pattern != null)
        {
            int l = partList.size();
            int i1 = pattern.partList.size();
            if (l != 0 && i1 != 0)
            {
                int i;
                int j;
                int k;
                if (l <= i1)
                {
                    i = l;
                } else
                {
                    i = i1;
                }
                j = 1;
                k = 0;
                for (; j <= i && equalityCheck((String)partList.get(l - j), (String)pattern.partList.get(i1 - j)); j++)
                {
                    k++;
                }

                return k;
            }
        }
        return 0;
    }

    public int hashCode()
    {
        int i = 0;
        int k = size();
        int j = 0;
        for (; i < k; i++)
        {
            j ^= get(i).toLowerCase().hashCode();
        }

        return j;
    }

    public boolean isContained(Pattern pattern)
    {
        if (pattern == null)
        {
            return false;
        } else
        {
            return toString().contains(pattern.toString());
        }
    }

    public String peekLast()
    {
        if (!partList.isEmpty())
        {
            int i = partList.size();
            return (String)partList.get(i - 1);
        } else
        {
            return null;
        }
    }

    public void pop()
    {
        if (!partList.isEmpty())
        {
            partList.remove(partList.size() - 1);
        }
    }

    public void push(String s)
    {
        partList.add(s);
    }

    public int size()
    {
        return partList.size();
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        String s;
        for (Iterator iterator = partList.iterator(); iterator.hasNext(); stringbuilder.append("[").append(s).append("]"))
        {
            s = (String)iterator.next();
        }

        return stringbuilder.toString();
    }
}
