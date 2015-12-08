// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.task.event;

import com.pinterest.activity.task.toast.BaseToast;

public class ToastCompletedEvent
{

    public BaseToast _baseToast;

    public ToastCompletedEvent(BaseToast basetoast)
    {
        _baseToast = basetoast;
    }
}
