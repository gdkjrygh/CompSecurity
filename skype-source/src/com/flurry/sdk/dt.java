// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class dt
{

    private final List a = new LinkedList();

    public dt()
    {
    }

    public List a()
    {
        ArrayList arraylist = new ArrayList(a.size());
        for (Iterator iterator = a.iterator(); iterator.hasNext();)
        {
            Object obj = ((WeakReference)iterator.next()).get();
            if (obj == null)
            {
                iterator.remove();
            } else
            {
                arraylist.add(obj);
            }
        }

        return arraylist;
    }

    public void a(Object obj)
    {
        if (obj == null)
        {
            return;
        } else
        {
            a.add(new WeakReference(obj));
            return;
        }
    }

    public int b()
    {
        return a.size();
    }

    public boolean b(Object obj)
    {
label0:
        {
            if (obj == null)
            {
                return false;
            }
            Iterator iterator;
            Object obj1;
label1:
            do
            {
                for (iterator = a.iterator(); iterator.hasNext(); iterator.remove())
                {
                    obj1 = ((WeakReference)iterator.next()).get();
                    if (obj1 != null)
                    {
                        continue label1;
                    }
                }

                break label0;
            } while (obj != obj1 && !obj.equals(obj1));
            iterator.remove();
            return true;
        }
        return false;
    }
}
