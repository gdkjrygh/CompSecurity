// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.report;


public class ReportItem
{

    private String _pinFlagId;
    private String _singleReason;
    private String _textValue;
    private String _title;

    public ReportItem(String s, String s1)
    {
        _title = s;
        _pinFlagId = s1;
    }

    public String getPinFlagId()
    {
        return _pinFlagId;
    }

    public String getSingleReason()
    {
        return _singleReason;
    }

    public String getTextValue()
    {
        return _textValue;
    }

    public String getTitle()
    {
        return _title;
    }

    public void setPinFlagId(String s)
    {
        _pinFlagId = s;
    }

    public void setSingleReason(String s)
    {
        _singleReason = s;
    }

    public void setTextValue(String s)
    {
        _textValue = s;
    }

    public void setTitle(String s)
    {
        _title = s;
    }
}
