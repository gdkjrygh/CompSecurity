// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.mm.android.library.comparator.impl;

import com.digby.mm.android.library.messages.IMessage;
import java.util.Comparator;

public class MessageIDComparator
    implements Comparator
{

    public MessageIDComparator()
    {
    }

    public int compare(IMessage imessage, IMessage imessage1)
    {
        if (imessage.getID() < imessage1.getID())
        {
            return -1;
        }
        return imessage.getID() != imessage1.getID() ? 1 : 0;
    }

    public volatile int compare(Object obj, Object obj1)
    {
        return compare((IMessage)obj, (IMessage)obj1);
    }
}
