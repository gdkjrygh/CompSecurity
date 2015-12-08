// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid.widget;


public class ListViewItem
{

    private String title;
    private Object value;

    public ListViewItem(Object obj)
    {
        value = obj;
    }

    public ListViewItem(String s)
    {
        title = s;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof ListViewItem)
        {
            obj = (ListViewItem)obj;
            if (hasValue() && ((ListViewItem) (obj)).hasValue())
            {
                return ((ListViewItem) (obj)).value.equals(value);
            }
            if (!hasValue() && !((ListViewItem) (obj)).hasValue())
            {
                return ((ListViewItem) (obj)).title.equals(title);
            }
        }
        return false;
    }

    public String getTitle()
    {
        return title;
    }

    public Object getValue()
    {
        return value;
    }

    public boolean hasValue()
    {
        return value != null;
    }

    public int hashCode()
    {
        if (hasValue())
        {
            return value.hashCode();
        } else
        {
            return title.hashCode();
        }
    }

    public void setTitle(String s)
    {
        title = s;
    }

    public void setValue(Object obj)
    {
        value = obj;
    }
}
