// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo;

import com.fitbit.data.domain.Notification;
import java.util.List;

// Referenced classes of package com.fitbit.data.repo:
//            ao

public interface ai
    extends ao
{

    public abstract Notification getLastMessageByUser(String s);

    public abstract List getMessages();

    public abstract List getUnread();

    public abstract boolean hasNew();
}
