// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.util;

import com.jcp.pojo.SavedItems;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class bo
{

    private List a;
    private boolean b;

    public bo()
    {
    }

    public void a(int i)
    {
        if (a != null && a.size() > i && i >= 0)
        {
            a.remove(i);
            b = true;
        }
    }

    public void a(String s)
    {
label0:
        {
            if (a == null)
            {
                break label0;
            }
            ListIterator listiterator = a.listIterator();
            do
            {
                if (!listiterator.hasNext())
                {
                    break label0;
                }
            } while (!((SavedItems)listiterator.next()).getPpId().equalsIgnoreCase(s));
            listiterator.remove();
            b = true;
        }
    }

    public void a(SavedItems asaveditems[])
    {
        if (asaveditems == null) goto _L2; else goto _L1
_L1:
        a = new LinkedList(Arrays.asList(asaveditems));
_L4:
        b = false;
        return;
_L2:
        if (a != null)
        {
            a.clear();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public boolean a()
    {
        return b;
    }

    public boolean b(String s)
    {
label0:
        {
            if (a == null)
            {
                break label0;
            }
            Iterator iterator = a.iterator();
            SavedItems saveditems;
            do
            {
                if (!iterator.hasNext())
                {
                    break label0;
                }
                saveditems = (SavedItems)iterator.next();
            } while (saveditems.getPpId() == null || !saveditems.getPpId().equalsIgnoreCase(s));
            return true;
        }
        return false;
    }
}
