// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.megaphone;


public abstract class MegaphoneEvent
{

    private String _desc;
    private String _negativeBtnText;
    private String _positiveBtnText;
    private String _title;

    public MegaphoneEvent()
    {
    }

    public String getDesc()
    {
        return _desc;
    }

    public String getNegativeBtnText()
    {
        return _negativeBtnText;
    }

    public String getPositiveBtnText()
    {
        return _positiveBtnText;
    }

    public String getTitle()
    {
        return _title;
    }

    public void setDesc(String s)
    {
        _desc = s;
    }

    public void setNegativeBtnText(String s)
    {
        _negativeBtnText = s;
    }

    public void setPositiveBtnText(String s)
    {
        _positiveBtnText = s;
    }

    public void setTitle(String s)
    {
        _title = s;
    }
}
