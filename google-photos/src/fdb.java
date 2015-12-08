// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

final class fdb
    implements fbv
{

    private final duh a;
    private final noz b;

    fdb(Context context, duh duh1)
    {
        a = duh1;
        b = noz.a(context, 3, "DeviceMgmtAssistant", new String[0]);
    }

    private static dui a(int i, String s)
    {
        return new duj(i, s, "com.google.android.apps.photos.devicemanagement.assistant");
    }

    private void f(int i, fcm fcm1)
    {
        fcm1 = a(i, fcm1.b);
        a.b(fcm1);
        if (b.a())
        {
            noy.a("cardId", fcm1);
        }
    }

    private void g(int i, fcm fcm1)
    {
        fcm1 = a(i, fcm1.b);
        a.c(fcm1);
        if (b.a())
        {
            noy.a("cardId", fcm1);
        }
    }

    public final void a(int i, fcm fcm1)
    {
        fcm1 = a(i, fcm1.b);
        a.a(fcm1);
        if (b.a())
        {
            noy.a("cardId", fcm1);
        }
    }

    public final void b(int i, fcm fcm1)
    {
        f(i, fcm1);
    }

    public final void c(int i, fcm fcm1)
    {
        f(i, fcm1);
    }

    public final void d(int i, fcm fcm1)
    {
        if (fcm1 != null)
        {
            g(i, fcm1);
        }
    }

    public final void e(int i, fcm fcm1)
    {
        g(i, fcm1);
    }
}
