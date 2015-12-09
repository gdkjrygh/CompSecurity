// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.androidquery.util;

import android.graphics.Bitmap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class b extends LinkedHashMap
{

    private int a;
    private int b;
    private int c;
    private int d;

    public b(int i, int j, int k)
    {
        super(8, 0.75F, true);
        a = i;
        b = j;
        c = k;
    }

    private int a(Bitmap bitmap)
    {
        if (bitmap == null)
        {
            return 0;
        } else
        {
            return bitmap.getWidth() * bitmap.getHeight();
        }
    }

    private void a()
    {
        if (d <= c) goto _L2; else goto _L1
_L1:
        Iterator iterator = keySet().iterator();
_L5:
        if (iterator.hasNext()) goto _L3; else goto _L2
_L2:
        return;
_L3:
        iterator.next();
        iterator.remove();
        if (d <= c)
        {
            return;
        }
        if (true) goto _L5; else goto _L4
_L4:
    }

    public Bitmap a(Object obj)
    {
        obj = (Bitmap)super.remove(obj);
        if (obj != null)
        {
            d = d - a(((Bitmap) (obj)));
        }
        return ((Bitmap) (obj));
    }

    public Bitmap a(String s, Bitmap bitmap)
    {
        String s1 = null;
        int i = a(bitmap);
        if (i <= b)
        {
            d = d + i;
            s = (Bitmap)super.put(s, bitmap);
            s1 = s;
            if (s != null)
            {
                d = d - a(((Bitmap) (s)));
                s1 = s;
            }
        }
        return s1;
    }

    public void clear()
    {
        super.clear();
        d = 0;
    }

    public Object put(Object obj, Object obj1)
    {
        return a((String)obj, (Bitmap)obj1);
    }

    public Object remove(Object obj)
    {
        return a(obj);
    }

    public boolean removeEldestEntry(java.util.Map.Entry entry)
    {
        if (d > c || size() > a)
        {
            a(entry.getKey());
        }
        a();
        return false;
    }
}
