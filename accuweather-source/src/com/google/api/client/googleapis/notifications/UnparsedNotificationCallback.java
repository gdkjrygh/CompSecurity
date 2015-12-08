// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.googleapis.notifications;

import java.io.IOException;
import java.io.Serializable;

// Referenced classes of package com.google.api.client.googleapis.notifications:
//            StoredChannel, UnparsedNotification

public interface UnparsedNotificationCallback
    extends Serializable
{

    public abstract void onNotification(StoredChannel storedchannel, UnparsedNotification unparsednotification)
        throws IOException;
}
