// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Notification;
import android.os.Bundle;

class cw extends cq
{

    cw()
    {
    }

    public Notification a(cn cn1, co co)
    {
        co = new df(cn1.a, cn1.v, cn1.b, cn1.c, cn1.f, null, 0, cn1.d, null, cn1.e, cn1.k, cn1.l, cn1.m, false, cn1.g, cn1.j, false, null, cn1.n, cn1.o, null);
        cj.a(co, cn1.p);
        cj.a(co, cn1.i);
        return co.b();
    }

    public Bundle a(Notification notification)
    {
        return de.a(notification);
    }
}
