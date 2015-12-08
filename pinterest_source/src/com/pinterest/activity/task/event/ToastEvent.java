// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.task.event;

import com.pinterest.activity.task.toast.BaseToast;

public class ToastEvent
{

    private BaseToast _toast;

    public ToastEvent()
    {
    }

    public ToastEvent(BaseToast basetoast)
    {
        _toast = basetoast;
    }

    public BaseToast getToast()
    {
        return _toast;
    }

    public void setToast(BaseToast basetoast)
    {
        _toast = basetoast;
    }
}
