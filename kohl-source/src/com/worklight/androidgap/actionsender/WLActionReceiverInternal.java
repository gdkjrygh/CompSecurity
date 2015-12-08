// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.androidgap.actionsender;

import com.worklight.androidgap.api.WLActionReceiver;

public class WLActionReceiverInternal
{

    private final String tag;
    private final WLActionReceiver wlActionReceiver;

    public WLActionReceiverInternal(WLActionReceiver wlactionreceiver, String s)
    {
        if (wlactionreceiver == null)
        {
            throw new NullPointerException("wlActionReceiver cannot be null");
        } else
        {
            wlActionReceiver = wlactionreceiver;
            tag = s;
            return;
        }
    }

    public String getTag()
    {
        return tag;
    }

    public WLActionReceiver getWLActionReceiver()
    {
        return wlActionReceiver;
    }
}
