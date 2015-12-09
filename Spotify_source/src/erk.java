// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.service.ConnectDevice;
import com.spotify.mobile.android.spotlets.connect.Tech;
import com.spotify.mobile.android.spotlets.connect.view.ConnectButtonPresenter;
import java.util.EnumSet;

public final class erk
    implements ConnectButtonPresenter
{

    private ezj a;
    private Boolean b;
    private com.spotify.mobile.android.spotlets.connect.view.ConnectButtonPresenter.State c;
    private Tech d;
    private EnumSet e;
    private String f;

    public erk(ezj ezj1)
    {
        c = com.spotify.mobile.android.spotlets.connect.view.ConnectButtonPresenter.State.a;
        a = ezj1;
    }

    private void b()
    {
        if (b == null)
        {
            return;
        }
        if (!b.booleanValue())
        {
            a.b();
            return;
        }
        final class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[com.spotify.mobile.android.spotlets.connect.view.ConnectButtonPresenter.State.values().length];
                try
                {
                    a[com.spotify.mobile.android.spotlets.connect.view.ConnectButtonPresenter.State.b.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[com.spotify.mobile.android.spotlets.connect.view.ConnectButtonPresenter.State.c.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[com.spotify.mobile.android.spotlets.connect.view.ConnectButtonPresenter.State.d.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[com.spotify.mobile.android.spotlets.connect.view.ConnectButtonPresenter.State.e.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1.a[c.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            a.a(d);
            return;

        case 2: // '\002'
            a.a(d, f);
            return;

        case 3: // '\003'
            a.a(e);
            return;

        case 4: // '\004'
            a.b();
            break;
        }
    }

    public final void a(com.spotify.mobile.android.connect.ConnectManager.ConnectState connectstate, ConnectDevice connectdevice, ConnectDevice connectdevice1, EnumSet enumset)
    {
        if (connectstate == com.spotify.mobile.android.connect.ConnectManager.ConnectState.e)
        {
            connectstate = Tech.a(connectdevice1);
            c = com.spotify.mobile.android.spotlets.connect.view.ConnectButtonPresenter.State.b;
            d = connectstate;
            b();
            return;
        }
        if (connectstate == com.spotify.mobile.android.connect.ConnectManager.ConnectState.d || connectstate == com.spotify.mobile.android.connect.ConnectManager.ConnectState.c)
        {
            if (connectdevice != null && !connectdevice.f)
            {
                connectstate = connectdevice.d;
                connectdevice = Tech.a(connectdevice);
                c = com.spotify.mobile.android.spotlets.connect.view.ConnectButtonPresenter.State.c;
                d = connectdevice;
                f = connectstate;
                b();
                return;
            } else
            {
                c = com.spotify.mobile.android.spotlets.connect.view.ConnectButtonPresenter.State.d;
                e = enumset;
                b();
                return;
            }
        } else
        {
            c = com.spotify.mobile.android.spotlets.connect.view.ConnectButtonPresenter.State.e;
            b();
            return;
        }
    }

    public final void a(boolean flag)
    {
        b = Boolean.valueOf(flag);
        b();
    }

    public final boolean a()
    {
        return b != null && b.booleanValue() && c != com.spotify.mobile.android.spotlets.connect.view.ConnectButtonPresenter.State.e;
    }
}
