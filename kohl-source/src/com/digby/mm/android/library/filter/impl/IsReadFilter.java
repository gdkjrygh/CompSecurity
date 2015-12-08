// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.mm.android.library.filter.impl;

import com.digby.mm.android.library.filter.IFilter;
import com.digby.mm.android.library.messages.IMessage;

public class IsReadFilter
    implements IFilter
{

    public IsReadFilter()
    {
    }

    public boolean matches(IMessage imessage)
    {
        return imessage.isRead();
    }

    public volatile boolean matches(Object obj)
    {
        return matches((IMessage)obj);
    }
}
