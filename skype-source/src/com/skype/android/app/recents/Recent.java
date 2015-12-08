// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.recents;

import com.skype.android.util.ObjectInterfaceItem;
import java.util.Comparator;

// Referenced classes of package com.skype.android.app.recents:
//            a

public interface Recent
    extends ObjectInterfaceItem, Comparable
{

    public static final Comparator TIME_COMPARATOR = new a();

    public abstract int getConversationObjectId();

    public abstract String getDisplayName();

    public abstract String getIdentity();

    public abstract int getLastMessageObjectId();

    public abstract com.skype.Conversation.LOCAL_LIVESTATUS getLiveStatus();

    public abstract String getPicture();

    public abstract long getTimestamp();

    public abstract int getUnreadCount();

    public abstract boolean isDialog();

    public abstract boolean isInboxConversation();

}
