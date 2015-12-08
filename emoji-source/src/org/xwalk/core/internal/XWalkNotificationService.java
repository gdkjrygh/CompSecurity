// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xwalk.core.internal;

import android.content.Intent;
import android.graphics.Bitmap;

// Referenced classes of package org.xwalk.core.internal:
//            XWalkContentsClientBridge

interface XWalkNotificationService
{

    public abstract void cancelNotification(int i);

    public abstract boolean maybeHandleIntent(Intent intent);

    public abstract void setBridge(XWalkContentsClientBridge xwalkcontentsclientbridge);

    public abstract void showNotification(String s, String s1, String s2, int i);

    public abstract void shutdown();

    public abstract void updateNotificationIcon(int i, Bitmap bitmap);
}
