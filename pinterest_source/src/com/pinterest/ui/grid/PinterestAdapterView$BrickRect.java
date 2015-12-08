// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.grid;

import android.graphics.Rect;

class <init>
{

    public int column;
    public int index;
    public int padding;
    public Rect rect;
    public int span;
    public boolean truncateRect;

    public int bottom()
    {
        return rect.bottom;
    }

    public int height()
    {
        return rect.height();
    }

    public boolean inColumn(int i)
    {
        while (span <= 1 && column == i || i < column + span && i >= column) 
        {
            return true;
        }
        return false;
    }

    public int left()
    {
        return rect.left;
    }

    public void offset(int i, int j)
    {
        rect.offset(i, j);
    }

    public int right()
    {
        return rect.right;
    }

    public int top()
    {
        return rect.top;
    }

    public int width()
    {
        return rect.width();
    }

    private (Rect rect1, int i, int j, int k, int l)
    {
        this(rect1, i, j, k, l, false);
    }

    <init>(Rect rect1, int i, int j, int k, int l, <init> <init>1)
    {
        this(rect1, i, j, k, l);
    }

    private <init>(Rect rect1, int i, int j, int k, int l, boolean flag)
    {
        rect = rect1;
        index = i;
        column = j;
        span = k;
        padding = l;
        truncateRect = flag;
    }

    truncateRect(Rect rect1, int i, int j, int k, int l, boolean flag, truncateRect truncaterect)
    {
        this(rect1, i, j, k, l, flag);
    }
}
