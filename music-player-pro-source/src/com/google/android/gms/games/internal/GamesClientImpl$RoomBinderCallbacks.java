// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.d;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.multiplayer.realtime.RealTimeMessage;
import com.google.android.gms.internal.jx;

// Referenced classes of package com.google.android.gms.games.internal:
//            AbstractGamesCallbacks, GamesClientImpl

private static final class ZA extends AbstractGamesCallbacks
{

    private final d ZA;
    private final d Zy;
    private final d Zz;

    public void A(DataHolder dataholder)
    {
        if (Zz != null)
        {
            Zz.a(new Notifier(dataholder));
        }
    }

    public void a(DataHolder dataholder, String as[])
    {
        if (Zz != null)
        {
            Zz.a(new ifier(dataholder, as));
        }
    }

    public void b(DataHolder dataholder, String as[])
    {
        if (Zz != null)
        {
            Zz.a(new er(dataholder, as));
        }
    }

    public void c(DataHolder dataholder, String as[])
    {
        if (Zz != null)
        {
            Zz.a(new (dataholder, as));
        }
    }

    public void d(DataHolder dataholder, String as[])
    {
        if (Zz != null)
        {
            Zz.a(new (dataholder, as));
        }
    }

    public void e(DataHolder dataholder, String as[])
    {
        if (Zz != null)
        {
            Zz.a(new r(dataholder, as));
        }
    }

    public void f(DataHolder dataholder, String as[])
    {
        if (Zz != null)
        {
            Zz.a(new fier(dataholder, as));
        }
    }

    public void onLeftRoom(int i, String s)
    {
        Zy.a(new it>(i, s));
    }

    public void onP2PConnected(String s)
    {
        if (Zz != null)
        {
            Zz.a(new (s));
        }
    }

    public void onP2PDisconnected(String s)
    {
        if (Zz != null)
        {
            Zz.a(new ier(s));
        }
    }

    public void onRealTimeMessageReceived(RealTimeMessage realtimemessage)
    {
        if (ZA != null)
        {
            ZA.a(new ier(realtimemessage));
        }
    }

    public void u(DataHolder dataholder)
    {
        Zy.a(new <init>(dataholder));
    }

    public void v(DataHolder dataholder)
    {
        Zy.a(new init>(dataholder));
    }

    public void w(DataHolder dataholder)
    {
        if (Zz != null)
        {
            Zz.a(new er(dataholder));
        }
    }

    public void x(DataHolder dataholder)
    {
        if (Zz != null)
        {
            Zz.a(new fier(dataholder));
        }
    }

    public void y(DataHolder dataholder)
    {
        Zy.a(new r(dataholder));
    }

    public void z(DataHolder dataholder)
    {
        if (Zz != null)
        {
            Zz.a(new ier(dataholder));
        }
    }

    public ier(d d1)
    {
        Zy = (d)jx.b(d1, "Callbacks must not be null");
        Zz = null;
        ZA = null;
    }

    public ZA(d d1, d d2, d d3)
    {
        Zy = (d)jx.b(d1, "Callbacks must not be null");
        Zz = d2;
        ZA = d3;
    }
}
