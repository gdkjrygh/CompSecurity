// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.adapters;

import java.io.Serializable;
import java.util.ArrayList;

public class HeaderGroupItem
    implements Serializable
{

    private static final long serialVersionUID = 0xb4e106fd038d9c21L;
    public ArrayList items;
    public String title;

    public HeaderGroupItem(String s)
    {
        items = new ArrayList();
        title = s;
    }

    public ArrayList getItems()
    {
        return items;
    }

    public String getTitle()
    {
        return title;
    }

    public void setItems(ArrayList arraylist)
    {
        items = arraylist;
    }

    public void setTitle(String s)
    {
        title = s;
    }
}
