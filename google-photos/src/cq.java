// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Notification;
import android.os.Bundle;

public class cq
{

    cq()
    {
    }

    public Notification a(cn cn1, co co)
    {
        co = cn1.v;
        co.setLatestEventInfo(cn1.a, cn1.b, cn1.c, cn1.d);
        if (cn1.g > 0)
        {
            co.flags = ((Notification) (co)).flags | 0x80;
        }
        return co;
    }

    public Bundle a(Notification notification)
    {
        return null;
    }
}
