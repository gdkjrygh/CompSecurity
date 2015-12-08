// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.appwidget;


public class WidgetItem
{

    public Integer mImageId;
    public String mLabel;

    public WidgetItem(Integer integer)
    {
        mImageId = integer;
    }

    public WidgetItem(String s)
    {
        mLabel = s;
    }
}
