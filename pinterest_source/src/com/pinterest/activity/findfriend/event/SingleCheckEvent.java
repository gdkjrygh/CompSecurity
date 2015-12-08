// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.findfriend.event;


public class SingleCheckEvent
{

    private boolean _isAllChecked;

    public SingleCheckEvent(boolean flag)
    {
        _isAllChecked = flag;
    }

    public boolean isAllChecked()
    {
        return _isAllChecked;
    }
}
