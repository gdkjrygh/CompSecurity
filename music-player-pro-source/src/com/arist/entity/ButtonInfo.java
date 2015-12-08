// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.entity;


public class ButtonInfo
{

    private String btnDes;
    private int btnResId;
    private String btnTitle;

    public ButtonInfo()
    {
    }

    public String getBtnDes()
    {
        return btnDes;
    }

    public int getBtnResId()
    {
        return btnResId;
    }

    public String getBtnTitle()
    {
        return btnTitle;
    }

    public void setBtnDes(String s)
    {
        btnDes = s;
    }

    public void setBtnResId(int i)
    {
        btnResId = i;
    }

    public void setBtnTitle(String s)
    {
        btnTitle = s;
    }
}
