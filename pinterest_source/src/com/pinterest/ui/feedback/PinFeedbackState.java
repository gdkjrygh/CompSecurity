// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.feedback;

import com.pinterest.activity.task.model.Navigation;

public class PinFeedbackState
{

    private int _background;
    private Navigation _destination;
    private int _imageRes;
    private String _subtitle;
    private String _title;

    public PinFeedbackState(int i, int j, String s, String s1)
    {
        _background = 0x7f02003c;
        _imageRes = 0x7f020255;
        _background = i;
        _imageRes = j;
        _title = s;
        _subtitle = s1;
    }

    public PinFeedbackState(String s, String s1)
    {
        _background = 0x7f02003c;
        _imageRes = 0x7f020255;
        _title = s;
        _subtitle = s1;
    }

    public int getBackground()
    {
        return _background;
    }

    public Navigation getDestination()
    {
        return _destination;
    }

    public int getImageRes()
    {
        return _imageRes;
    }

    public String getSubtitle()
    {
        return _subtitle;
    }

    public String getTitle()
    {
        return _title;
    }

    public void setBackground(int i)
    {
        _background = i;
    }

    public PinFeedbackState setDestination(Navigation navigation)
    {
        _destination = navigation;
        return this;
    }

    public PinFeedbackState setImageRes(int i)
    {
        _imageRes = i;
        return this;
    }

    public PinFeedbackState setSubtitle(String s)
    {
        _subtitle = s;
        return this;
    }

    public PinFeedbackState setTitle(String s)
    {
        _title = s;
        return this;
    }
}
