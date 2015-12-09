// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.spotlets.player.notifications.PlayerNotificationType;
import com.spotify.music.spotlets.radio.model.RadioStationsModel;
import com.spotify.music.spotlets.radio.model.ThumbState;
import java.util.ArrayList;
import java.util.Collections;

public final class fce extends fbc
{

    private final fcg c;
    private final fcs d;
    private fcf e;
    private boolean f;
    private gpg g;
    private final gpi h = new gpi() {

        private fce a;

        public final void a(RadioStationsModel radiostationsmodel)
        {
        }

        public final void a(gpg gpg1)
        {
            ThumbState thumbstate;
label0:
            {
                fce.a(a, gpg1);
                fcf fcf2;
                boolean flag;
                if (fce.a(a) == null)
                {
                    thumbstate = ThumbState.a;
                } else
                {
                    thumbstate = gpg1.a();
                }
                fcf2 = fce.c(a);
                if (!fce.b(a))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                fcf2.a(thumbstate, flag);
                fce.c(a).c();
                fce.c(a).d();
                if (gpg1 != null && fce.d(a) != gpg1.c())
                {
                    fce.a(a, gpg1.c());
                    if (!fce.d(a))
                    {
                        break label0;
                    }
                    fce.e(a).a(Collections.singleton(PlayerNotificationType.b));
                }
                return;
            }
            if (thumbstate.equals(ThumbState.a))
            {
                fce.e(a).a(PlayerNotificationType.b);
                return;
            } else
            {
                gpg1 = new ArrayList();
                gpg1.add(PlayerNotificationType.a);
                fce.e(a).a(gpg1);
                return;
            }
        }

        public final void p()
        {
        }

            
            {
                a = fce.this;
                super();
            }
    };
    private boolean i;
    private boolean j;

    public fce(eqe eqe, fbb fbb1, fcf fcf1, fcg fcg1, fcs fcs1)
    {
        super(eqe, fbb1);
        e = (fcf)ctz.a(fcf1);
        c = (fcg)ctz.a(fcg1);
        d = (fcs)ctz.a(fcs1);
    }

    static gpg a(fce fce1)
    {
        return fce1.g;
    }

    static gpg a(fce fce1, gpg gpg)
    {
        fce1.g = gpg;
        return gpg;
    }

    static boolean a(fce fce1, boolean flag)
    {
        fce1.f = flag;
        return flag;
    }

    static boolean b(fce fce1)
    {
        return fce1.j;
    }

    static fcf c(fce fce1)
    {
        return fce1.e;
    }

    static boolean d(fce fce1)
    {
        return fce1.f;
    }

    static fcs e(fce fce1)
    {
        return fce1.d;
    }

    protected final void a(PlayerState playerstate)
    {
        if (playerstate != null && gpl.f(playerstate.entityUri()))
        {
            if (!i)
            {
                playerstate = c;
                gpi gpi1 = h;
                ctz.a(gpi1);
                playerstate.b = gpi1;
                ((fcg) (playerstate)).a.a();
                i = true;
            }
        } else
        if (i)
        {
            c.a();
            i = false;
            return;
        }
    }

    public final void a(SessionState sessionstate)
    {
        super.a(sessionstate);
        boolean flag;
        if (j != sessionstate.j)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            j = sessionstate.j;
            h.a(g);
        }
    }

    protected final void b()
    {
        c.a();
        e = null;
    }

    public final void c()
    {
        a.f();
        c.a(ThumbState.c);
        fcf fcf1 = e;
        ThumbState thumbstate = ThumbState.c;
        boolean flag;
        if (!j)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        fcf1.a(thumbstate, flag);
    }

    public final void d()
    {
        a.g();
        c.a(ThumbState.b);
        fcf fcf1 = e;
        ThumbState thumbstate = ThumbState.b;
        boolean flag;
        if (!j)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        fcf1.a(thumbstate, flag);
    }
}
