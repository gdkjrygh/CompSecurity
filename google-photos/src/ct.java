// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Notification;

final class ct extends cq
{

    ct()
    {
    }

    public final Notification a(cn cn1, co co)
    {
        co = cn1.v;
        co.setLatestEventInfo(cn1.a, cn1.b, cn1.c, cn1.d);
        co.setLatestEventInfo(cn1.a, cn1.b, cn1.c, cn1.d);
        co.fullScreenIntent = null;
        if (cn1.g > 0)
        {
            co.flags = ((Notification) (co)).flags | 0x80;
        }
        return co;
    }
}
