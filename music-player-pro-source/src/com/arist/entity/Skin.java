// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.entity;

import java.io.Serializable;

public class Skin
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    private String des;
    private int resId;

    public Skin()
    {
    }

    public String getDes()
    {
        return des;
    }

    public int getResId()
    {
        return resId;
    }

    public void setDes(String s)
    {
        des = s;
    }

    public void setResId(int i)
    {
        resId = i;
    }
}
