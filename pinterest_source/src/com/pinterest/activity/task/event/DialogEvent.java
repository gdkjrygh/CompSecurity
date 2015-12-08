// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.task.event;

import com.pinterest.activity.task.dialog.BaseDialog;

public class DialogEvent
{

    private BaseDialog _dialog;

    public DialogEvent(BaseDialog basedialog)
    {
        _dialog = basedialog;
    }

    public BaseDialog getDialog()
    {
        return _dialog;
    }

    public void setDialog(BaseDialog basedialog)
    {
        _dialog = basedialog;
    }
}
