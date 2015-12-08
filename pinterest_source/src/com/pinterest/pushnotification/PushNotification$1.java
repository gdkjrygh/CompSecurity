// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.pushnotification;

import com.pinterest.api.model.Pin;

final class shNotifTask extends com.pinterest.api.remote.se
{

    public final void onSuccess(Pin pin)
    {
        super.onSuccess(pin);
        (new shNotifTask((byte)0)).execute(new Pin[] {
            pin
        });
    }

    shNotifTask()
    {
    }
}
