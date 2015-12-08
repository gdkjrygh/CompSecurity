// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.sendapin.events;


public class SendPinMessageChangeEvent
{

    private String _msg;

    public SendPinMessageChangeEvent(String s)
    {
        _msg = s;
    }

    public String getMessage()
    {
        return _msg;
    }
}
