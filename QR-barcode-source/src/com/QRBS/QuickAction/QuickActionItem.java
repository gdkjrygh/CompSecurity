// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.QRBS.QuickAction;

import android.graphics.drawable.Drawable;

public class QuickActionItem
{

    private int actionId;
    private Drawable icon;
    private boolean sticky;
    private String title;

    public QuickActionItem()
    {
        this(-1, null, null);
    }

    public QuickActionItem(int i, Drawable drawable)
    {
        this(i, null, drawable);
    }

    public QuickActionItem(int i, String s)
    {
        this(i, s, null);
    }

    public QuickActionItem(int i, String s, Drawable drawable)
    {
        actionId = -1;
        title = s;
        icon = drawable;
        actionId = i;
    }

    public QuickActionItem(Drawable drawable)
    {
        this(-1, null, drawable);
    }

    public int getActionId()
    {
        return actionId;
    }

    public Drawable getIcon()
    {
        return icon;
    }

    public String getTitle()
    {
        return title;
    }

    public boolean isSticky()
    {
        return sticky;
    }

    public void setActionId(int i)
    {
        actionId = i;
    }

    public void setIcon(Drawable drawable)
    {
        icon = drawable;
    }

    public void setSticky(boolean flag)
    {
        sticky = flag;
    }

    public void setTitle(String s)
    {
        title = s;
    }
}
