// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.pdf417.decoder;

import com.google.zxing.pdf417.PDF417Common;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

final class BarcodeValue
{

    private final Map values = new HashMap();

    BarcodeValue()
    {
    }

    public Integer getConfidence(int i)
    {
        return (Integer)values.get(Integer.valueOf(i));
    }

    int[] getValue()
    {
        ArrayList arraylist = new ArrayList();
        Iterator iterator = values.entrySet().iterator();
        int i = -1;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
            if (((Integer)entry.getValue()).intValue() > i)
            {
                i = ((Integer)entry.getValue()).intValue();
                arraylist.clear();
                arraylist.add(entry.getKey());
            } else
            if (((Integer)entry.getValue()).intValue() == i)
            {
                arraylist.add(entry.getKey());
            }
        } while (true);
        return PDF417Common.toIntArray(arraylist);
    }

    void setValue(int i)
    {
        Integer integer1 = (Integer)values.get(Integer.valueOf(i));
        Integer integer = integer1;
        if (integer1 == null)
        {
            integer = Integer.valueOf(0);
        }
        int j = integer.intValue();
        values.put(Integer.valueOf(i), Integer.valueOf(j + 1));
    }
}
