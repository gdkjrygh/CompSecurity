// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.json.simple;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class ItemList
{

    List items;
    private String sp;

    public ItemList()
    {
        sp = ",";
        items = new ArrayList();
    }

    public ItemList(String s)
    {
        sp = ",";
        items = new ArrayList();
        split(s, sp, items);
    }

    public ItemList(String s, String s1)
    {
        sp = ",";
        items = new ArrayList();
        sp = s;
        split(s, s1, items);
    }

    public ItemList(String s, String s1, boolean flag)
    {
        sp = ",";
        items = new ArrayList();
        split(s, s1, items, flag);
    }

    public void add(int i, String s)
    {
        if (s == null)
        {
            return;
        } else
        {
            items.add(i, s.trim());
            return;
        }
    }

    public void add(String s)
    {
        if (s == null)
        {
            return;
        } else
        {
            items.add(s.trim());
            return;
        }
    }

    public void addAll(String s)
    {
        split(s, sp, items);
    }

    public void addAll(String s, String s1)
    {
        split(s, s1, items);
    }

    public void addAll(String s, String s1, boolean flag)
    {
        split(s, s1, items, flag);
    }

    public void addAll(ItemList itemlist)
    {
        items.addAll(itemlist.items);
    }

    public void clear()
    {
        items.clear();
    }

    public String get(int i)
    {
        return (String)items.get(i);
    }

    public String[] getArray()
    {
        return (String[])(String[])items.toArray();
    }

    public List getItems()
    {
        return items;
    }

    public void reset()
    {
        sp = ",";
        items.clear();
    }

    public void setSP(String s)
    {
        sp = s;
    }

    public int size()
    {
        return items.size();
    }

    public void split(String s, String s1, List list)
    {
        int i;
        if (s == null || s1 == null)
        {
            return;
        }
        i = 0;
_L3:
        int j;
        j = i;
        i = s.indexOf(s1, j);
        if (i != -1) goto _L2; else goto _L1
_L1:
        list.add(s.substring(j).trim());
        return;
_L2:
        int k;
        list.add(s.substring(j, i).trim());
        k = i + s1.length();
        i = k;
        if (k != -1) goto _L3; else goto _L1
    }

    public void split(String s, String s1, List list, boolean flag)
    {
        if (s != null && s1 != null)
        {
            if (flag)
            {
                s = new StringTokenizer(s, s1);
                while (s.hasMoreTokens()) 
                {
                    list.add(s.nextToken().trim());
                }
            } else
            {
                split(s, s1, list);
                return;
            }
        }
    }

    public String toString()
    {
        return toString(sp);
    }

    public String toString(String s)
    {
        StringBuffer stringbuffer = new StringBuffer();
        int i = 0;
        while (i < items.size()) 
        {
            if (i == 0)
            {
                stringbuffer.append(items.get(i));
            } else
            {
                stringbuffer.append(s);
                stringbuffer.append(items.get(i));
            }
            i++;
        }
        return stringbuffer.toString();
    }
}
