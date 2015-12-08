// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.notification;

import com.snapchat.android.model.FriendAction;

// Referenced classes of package com.snapchat.android.notification:
//            ScanNotificationItemAddFriend

static final class 
{

    static final int a[];

    static 
    {
        a = new int[FriendAction.values().length];
        try
        {
            a[FriendAction.ADD.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[FriendAction.DELETE.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
