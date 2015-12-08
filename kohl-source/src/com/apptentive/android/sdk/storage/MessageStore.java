// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.apptentive.android.sdk.storage;

import com.apptentive.android.sdk.model.Message;
import java.util.List;

// Referenced classes of package com.apptentive.android.sdk.storage:
//            PayloadStore

public interface MessageStore
    extends PayloadStore
{

    public transient abstract void addOrUpdateMessages(Message amessage[]);

    public abstract void deleteAllMessages();

    public abstract void deleteMessage(String s);

    public abstract List getAllMessages();

    public abstract String getLastReceivedMessageId();

    public abstract int getUnreadMessageCount();

    public abstract void updateMessage(Message message);
}
