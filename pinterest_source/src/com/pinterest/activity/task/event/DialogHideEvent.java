// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.task.event;


public class DialogHideEvent
{

    private boolean _onlyWaitDialog;

    public DialogHideEvent()
    {
        _onlyWaitDialog = false;
    }

    public DialogHideEvent(boolean flag)
    {
        _onlyWaitDialog = false;
        _onlyWaitDialog = flag;
    }

    public boolean waitDialogOnly()
    {
        return _onlyWaitDialog;
    }
}
