// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.events;

import bo.app.ez;
import com.appboy.models.IInAppMessage;

public final class InAppMessageEvent
{

    private final IInAppMessage a;
    private final String b;

    public InAppMessageEvent(IInAppMessage iinappmessage, String s)
    {
        b = s;
        a = (IInAppMessage)ez.a(iinappmessage);
    }

    public final IInAppMessage getInAppMessage()
    {
        return a;
    }

    public final String getUserId()
    {
        return b;
    }
}
