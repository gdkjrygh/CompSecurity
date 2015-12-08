// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.mm.android.library.filter.impl;

import android.util.Log;
import com.digby.mm.android.library.filter.IFilter;
import com.digby.mm.android.library.messages.IMessage;

public class MessageIDFilter
    implements IFilter
{

    private long mID;

    public MessageIDFilter(long l)
    {
        mID = l;
    }

    public boolean matches(IMessage imessage)
    {
        StringBuilder stringbuilder = (new StringBuilder()).append("Matches: ");
        boolean flag;
        if (imessage.getID() == mID)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Log.d("DigbyLibrary", stringbuilder.append(flag).toString());
        return imessage.getID() == mID;
    }

    public volatile boolean matches(Object obj)
    {
        return matches((IMessage)obj);
    }
}
