// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.remote;

import com.pinterest.api.model.ModelHelper;
import com.pinterest.api.model.Pin;
import com.pinterest.common.async.BackgroundTask;

class a extends BackgroundTask
{

    final boolean a;
    final a b;

    public void run()
    {
        Pin pin = ModelHelper.getPin(cess._mth000(b).getUid());
        if (pin != null)
        {
            pin.setLiked(Boolean.valueOf(a));
            ModelHelper.setPin(pin);
        }
    }

    ( , boolean flag)
    {
        b = ;
        a = flag;
        super();
    }
}
