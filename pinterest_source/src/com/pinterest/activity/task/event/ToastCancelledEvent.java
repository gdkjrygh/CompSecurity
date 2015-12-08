// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.task.event;

import com.pinterest.activity.task.toast.BaseToast;

public class ToastCancelledEvent
{

    public BaseToast _baseToast;

    public ToastCancelledEvent(BaseToast basetoast)
    {
        _baseToast = basetoast;
    }
}
