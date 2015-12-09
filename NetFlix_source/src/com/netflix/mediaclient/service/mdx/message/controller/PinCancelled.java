// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.mdx.message.controller;

import com.netflix.mediaclient.service.mdx.message.MdxMessage;

public final class PinCancelled extends MdxMessage
{

    public PinCancelled()
    {
        super("PIN_VERIFICATION_CANCEL");
        createObj();
    }

    private void createObj()
    {
    }
}
