// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Notification;

class bh
    implements be
{

    bh()
    {
    }

    public Notification a(bb bb1)
    {
        Notification notification = bb1.k;
        notification.setLatestEventInfo(bb1.a, bb1.b, bb1.c, bb1.d);
        return notification;
    }
}
