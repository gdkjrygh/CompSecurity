// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Intent;
import android.media.AudioManager;
import com.spotify.mobile.android.connect.ConnectManager;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrackUtil;
import com.spotify.mobile.android.service.ConnectDevice;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import java.util.Iterator;
import java.util.List;

public final class erc
{

    final com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver a = new com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver() {

        private erc a;

        public final void onPlayerStateReceived(PlayerState playerstate)
        {
            if (playerstate.track() == null)
            {
                return;
            } else
            {
                boolean flag = PlayerTrackUtil.isAd(playerstate.track());
                a.e.f(flag);
                a.o = playerstate.isPaused();
                a.a();
                return;
            }
        }

            
            {
                a = erc.this;
                super();
            }
    };
    gfx b;
    dwk c;
    dkz d;
    ere e;
    dwh f;
    erg g;
    erh h;
    List i;
    int j;
    boolean k;
    boolean l;
    float m;
    boolean n;
    boolean o;
    boolean p;
    float q;
    boolean r;
    String s;
    Player t;
    private ConnectDevice u;

    public erc(ere ere1, dwh dwh1, erg erg, erh erh1)
    {
        b = new gfx() {

            private erc a;

            public final void a(float f1)
            {
                float f2 = a.e.R();
                float f3 = a.h.a().getStreamMaxVolume(3);
                boolean flag;
                if (Math.round(f1 * f3) != Math.round(f2 * f3))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (a.k && flag)
                {
                    a.m = f1;
                    a.e.b(a.m);
                }
            }

            
            {
                a = erc.this;
                super();
            }
        };
        c = new dwk() {

            private erc a;

            public final void a(Object obj)
            {
                a.c(((ConnectManager)a.f.f()).j());
                ((ConnectManager)a.f.f()).a(a.d);
                ((ConnectManager)a.f.f()).g();
            }

            public final void b()
            {
                a.a();
            }

            
            {
                a = erc.this;
                super();
            }
        };
        d = new dkz() {

            private erc a;

            public final void a()
            {
            }

            public final void a(List list, com.spotify.mobile.android.connect.ConnectManager.ConnectState connectstate)
            {
                boolean flag3 = false;
                if (!a.e.q() || !a.f.c() || list == null)
                {
                    return;
                }
                a.i = list;
                a.e.a(a.i);
                a.j = a.i.size();
                boolean flag;
                boolean flag1;
                boolean flag2;
                if (a.j > 1)
                {
                    flag2 = true;
                } else
                {
                    flag2 = false;
                }
                a.e.d(flag2);
                list = a;
                connectstate = a.i.iterator();
                flag = false;
                do
                {
                    flag2 = flag3;
                    flag1 = flag;
                    if (!connectstate.hasNext())
                    {
                        break;
                    }
                    ConnectDevice connectdevice = (ConnectDevice)connectstate.next();
                    flag1 = flag;
                    if (connectdevice.e)
                    {
                        flag1 = flag;
                        if (gci.a(((erc) (list)).f))
                        {
                            flag1 = true;
                        }
                    }
                    flag = flag1;
                    if (!connectdevice.e)
                    {
                        continue;
                    }
                    flag = flag1;
                    if (!connectdevice.f)
                    {
                        continue;
                    }
                    flag2 = true;
                    break;
                } while (true);
                list.k = flag2;
                if (flag2)
                {
                    connectstate = ((erc) (list)).e;
                    AudioManager audiomanager = ((erc) (list)).h.a();
                    connectstate.b((float)audiomanager.getStreamVolume(3) / (float)audiomanager.getStreamMaxVolume(3));
                }
                if (flag1)
                {
                    ((erc) (list)).e.M();
                } else
                {
                    ((erc) (list)).e.N();
                }
                if (!a.l)
                {
                    list = a.g;
                    int i1 = a.j;
                    connectstate = new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.R, com.spotify.mobile.android.util.ClientEvent.SubEvent.a);
                    connectstate.a("device-count", String.valueOf(i1));
                    fop.a(((erg) (list)).a, ViewUri.bA, com.spotify.mobile.android.util.viewuri.ViewUri.SubView.a, connectstate);
                    connectstate = ((erg) (list)).a.getIntent();
                    if (connectstate != null)
                    {
                        connectstate = (com.spotify.mobile.android.util.ClientEvent.SubEvent)connectstate.getSerializableExtra("picker_opening_source");
                        if (connectstate != null)
                        {
                            connectstate = new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.O, connectstate);
                            fop.a(((erg) (list)).a, ViewUri.bA, com.spotify.mobile.android.util.viewuri.ViewUri.SubView.a, connectstate);
                        }
                    }
                    a.l = true;
                }
                a.e.L();
            }

            
            {
                a = erc.this;
                super();
            }
        };
        m = 0.0F;
        o = true;
        q = -1F;
        e = ere1;
        f = dwh1;
        g = erg;
        h = erh1;
    }

    public final void a()
    {
        if (f.c() && e.q())
        {
            if (u != null && !i.contains(u))
            {
                b();
                e.a(null);
                return;
            }
            if (u == null && ((ConnectManager)f.f()).i())
            {
                ConnectDevice connectdevice = ((ConnectManager)f.f()).f();
                if (!o && connectdevice != null)
                {
                    u = connectdevice;
                    e.a(u);
                    return;
                }
            }
        }
    }

    final void a(float f1)
    {
        if (k)
        {
            AudioManager audiomanager = h.a();
            audiomanager.setStreamVolume(3, Math.round((float)audiomanager.getStreamMaxVolume(3) * f1), 0);
            m = f1;
        } else
        if (f.c())
        {
            m = f1;
            ((ConnectManager)f.f()).b(f1);
            return;
        }
    }

    final void a(String s1)
    {
        if (f.c())
        {
            ((ConnectManager)f.f()).c(s1);
        }
        if (u != null && u.b.equals(s1))
        {
            e.a();
        }
        e.H();
    }

    final float b(float f1)
    {
        boolean flag1 = e.Q();
        boolean flag;
        if (!k && f1 != -1F && !p)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag1 && flag)
        {
            m = f1;
            e.b(m);
            f1 = -1F;
        } else
        if (flag1)
        {
            return -1F;
        }
        return f1;
    }

    public final void b()
    {
        if (u != null)
        {
            ((ConnectManager)f.f()).e(u.b);
            u = null;
        }
    }

    public final void b(String s1)
    {
        r = true;
        s = s1;
        e.K();
    }

    public final void c(float f1)
    {
        q = b(f1);
    }
}
