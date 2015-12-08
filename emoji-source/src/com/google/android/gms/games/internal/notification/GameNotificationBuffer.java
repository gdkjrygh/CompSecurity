// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.notification;

import com.google.android.gms.common.data.DataBuffer;

// Referenced classes of package com.google.android.gms.games.internal.notification:
//            GameNotificationRef, GameNotification

public final class GameNotificationBuffer extends DataBuffer
{

    public GameNotification ct(int i)
    {
        return new GameNotificationRef(DG, i);
    }

    public Object get(int i)
    {
        return ct(i);
    }
}
