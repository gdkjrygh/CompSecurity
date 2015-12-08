// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.nux.adapter;

import android.graphics.drawable.Drawable;
import java.util.ArrayList;

public class NUXInfiniteListAdapter
{

    ArrayList _items;

    public NUXInfiniteListAdapter()
    {
        _items = new ArrayList();
    }

    public void addItem(Drawable drawable)
    {
        _items.add(drawable);
    }

    public void clearItems()
    {
        _items.clear();
    }

    public int getCount()
    {
        return 0x7fffffff;
    }

    public Drawable getItem(int i)
    {
        return (Drawable)_items.get(i % _items.size());
    }

    public long getItemId(int i)
    {
        return (long)(i % _items.size());
    }
}
