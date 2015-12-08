// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.model;


public class ListenersForGallery
{

    private android.view.View.OnClickListener saveOnClick;
    private android.view.View.OnClickListener selectOnClick;

    public ListenersForGallery()
    {
    }

    public android.view.View.OnClickListener getSaveOnClick()
    {
        return saveOnClick;
    }

    public android.view.View.OnClickListener getSelectOnClick()
    {
        return selectOnClick;
    }

    public void setSaveOnClick(android.view.View.OnClickListener onclicklistener)
    {
        saveOnClick = onclicklistener;
    }

    public void setSelectOnClick(android.view.View.OnClickListener onclicklistener)
    {
        selectOnClick = onclicklistener;
    }
}
