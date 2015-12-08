// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.quickaction;

import android.graphics.drawable.Drawable;

public class ActionItem
{

    private Drawable icon;
    private android.view.View.OnClickListener listener;
    private String title;

    public ActionItem()
    {
    }

    public ActionItem(Drawable drawable)
    {
        icon = drawable;
    }

    public Drawable getIcon()
    {
        return icon;
    }

    public android.view.View.OnClickListener getListener()
    {
        return listener;
    }

    public String getTitle()
    {
        return title;
    }

    public void setIcon(Drawable drawable)
    {
        icon = drawable;
    }

    public void setOnClickListener(android.view.View.OnClickListener onclicklistener)
    {
        listener = onclicklistener;
    }

    public void setTitle(String s)
    {
        title = s;
    }
}
