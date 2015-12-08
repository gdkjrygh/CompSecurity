// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.mm.android.library.db;

import com.digby.mm.android.library.messages.IMessage;
import java.util.ArrayList;
import java.util.Map;

public interface IMessageDBHelper
{

    public abstract IMessage getMessage(long l);

    public abstract IMessage getMessageByCampaignID(long l, boolean flag);

    public abstract ArrayList getMessages();

    public abstract IMessage insertMessage(long l, long l1, String s, String s1, String s2, 
            Map map);

    public abstract void markMessageRead(long l);
}
