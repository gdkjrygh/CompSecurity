// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.common;


public class Emoticon
    implements Comparable
{

    private int id;
    private int sortOrder;
    private String staticBitmapAssetKey;
    private String stringId;

    public Emoticon(int i, String s, int j, String s1)
    {
        id = i;
        stringId = s;
        sortOrder = j;
        staticBitmapAssetKey = s1;
    }

    public int compareTo(Emoticon emoticon)
    {
        int i = getSortOrder();
        int j = emoticon.getSortOrder();
        if (i < j)
        {
            return -1;
        }
        return i != j ? 1 : 0;
    }

    public volatile int compareTo(Object obj)
    {
        return compareTo((Emoticon)obj);
    }

    public int getId()
    {
        return id;
    }

    public int getSortOrder()
    {
        return sortOrder;
    }

    public String getStaticBitmapAssetKey()
    {
        return staticBitmapAssetKey;
    }

    public String getStringId()
    {
        return stringId;
    }
}
