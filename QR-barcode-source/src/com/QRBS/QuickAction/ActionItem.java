// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.QRBS.QuickAction;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;

public class ActionItem
{

    private Drawable icon;
    private boolean selected;
    private Bitmap thumb;
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

    public Bitmap getThumb()
    {
        return thumb;
    }

    public String getTitle()
    {
        return title;
    }

    public boolean isSelected()
    {
        return selected;
    }

    public void setIcon(Drawable drawable)
    {
        icon = drawable;
    }

    public void setSelected(boolean flag)
    {
        selected = flag;
    }

    public void setThumb(Bitmap bitmap)
    {
        thumb = bitmap;
    }

    public void setTitle(String s)
    {
        title = s;
    }
}
