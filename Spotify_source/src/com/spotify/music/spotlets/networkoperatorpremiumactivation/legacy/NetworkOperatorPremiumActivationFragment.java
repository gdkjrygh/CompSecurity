// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.music.spotlets.networkoperatorpremiumactivation.legacy;

import am;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.google.common.base.Optional;
import com.spotify.cosmos.android.Cosmos;
import com.spotify.cosmos.android.Resolver;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.DialogPresenter;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import com.spotify.music.spotlets.networkoperatorpremiumactivation.PremiumActivationOptInDialog;
import com.spotify.music.spotlets.networkoperatorpremiumactivation.RolloutGlobalChargeMsisdnLookup;
import dme;
import dmj;
import dmz;
import dwx;
import dxc;
import dxd;
import fop;
import fys;
import fyw;
import fze;
import gey;
import gim;
import gin;
import gio;
import gip;
import giq;
import gnw;
import gnx;
import gnz;
import gob;
import goc;
import god;
import gof;
import goh;
import goi;
import goj;
import org.json.JSONException;
import org.json.JSONObject;
import u;

// Referenced classes of package com.spotify.music.spotlets.networkoperatorpremiumactivation.legacy:
//            ActivationTask, NetworkOperatorConnectivityChecker

public final class NetworkOperatorPremiumActivationFragment extends fze
{

    private static gip a = gip.b("operator-bundle-activation-has-shown-dialog");
    private dxc Z;
    private Flags aa;
    private gin ab;
    private NetworkOperatorConnectivityChecker ac;
    private goc ad;
    private int ae;
    private State af;
    private String ag;
    private goh ah;
    private ActivationTask ai;
    private boolean aj;
    private long ak;
    private final dwx al = new dwx() {

        private NetworkOperatorPremiumActivationFragment a;

        public final void a(Flags flags)
        {
            NetworkOperatorPremiumActivationFragment.a(a, flags);
        }

            
            {
                a = NetworkOperatorPremiumActivationFragment.this;
                super();
            }
    };
    private final gof am = new gof() {

        private NetworkOperatorPremiumActivationFragment a;

        public final void a()
        {
            NetworkOperatorPremiumActivationFragment.a(a, 2);
            a.a(State.g);
        }

        public final void b()
        {
            a.a(State.b);
        }

        public final void c()
        {
            NetworkOperatorPremiumActivationFragment.a(a, 1);
            a.a(State.f);
        }

            
            {
                a = NetworkOperatorPremiumActivationFragment.this;
                super();
            }
    };
    private final god an = new god() {

        private NetworkOperatorPremiumActivationFragment a;

        public final void a(long l)
        {
            if (!a.o())
            {
                return;
            }
            NetworkOperatorPremiumActivationFragment.a(a, l);
            if (NetworkOperatorPremiumActivationFragment.c(a) == State.g && NetworkOperatorPremiumActivationFragment.d(a) != null)
            {
                NetworkOperatorPremiumActivationFragment.d(a).b = l;
                return;
            } else
            {
                a.a(State.g);
                return;
            }
        }

            
            {
                a = NetworkOperatorPremiumActivationFragment.this;
                super();
            }
    };
    private goi ao;
    private int b;

    public NetworkOperatorPremiumActivationFragment()
    {
        af = State.a;
        ao = new goi() {

            private NetworkOperatorPremiumActivationFragment a;

            public final void a(String s)
            {
                NetworkOperatorPremiumActivationFragment.a(a, s);
            }

            
            {
                a = NetworkOperatorPremiumActivationFragment.this;
                super();
            }
        };
    }

    private boolean G()
    {
        return ab.a(a, false);
    }

    static int a(NetworkOperatorPremiumActivationFragment networkoperatorpremiumactivationfragment, int i)
    {
        networkoperatorpremiumactivationfragment.b = i;
        return i;
    }

    static long a(NetworkOperatorPremiumActivationFragment networkoperatorpremiumactivationfragment, long l)
    {
        networkoperatorpremiumactivationfragment.ak = l;
        return l;
    }

    static Flags a(NetworkOperatorPremiumActivationFragment networkoperatorpremiumactivationfragment, Flags flags)
    {
        networkoperatorpremiumactivationfragment.aa = flags;
        return flags;
    }

    public static NetworkOperatorPremiumActivationFragment a(Flags flags)
    {
        NetworkOperatorPremiumActivationFragment networkoperatorpremiumactivationfragment = new NetworkOperatorPremiumActivationFragment();
        fyw.a(networkoperatorpremiumactivationfragment, flags);
        return networkoperatorpremiumactivationfragment;
    }

    static void a(NetworkOperatorPremiumActivationFragment networkoperatorpremiumactivationfragment)
    {
        if (networkoperatorpremiumactivationfragment.af != State.h)
        {
            networkoperatorpremiumactivationfragment.a(State.h);
            if (networkoperatorpremiumactivationfragment.Y != null)
            {
                networkoperatorpremiumactivationfragment.Y.a(networkoperatorpremiumactivationfragment);
            }
        }
    }

    static void a(NetworkOperatorPremiumActivationFragment networkoperatorpremiumactivationfragment, String s)
    {
        networkoperatorpremiumactivationfragment.a(s);
    }

    public static void a(NetworkOperatorPremiumActivationFragment networkoperatorpremiumactivationfragment, boolean flag, boolean flag1)
    {
        if (flag)
        {
            networkoperatorpremiumactivationfragment.a(State.j);
            return;
        }
        Optional optional = gnx.a(networkoperatorpremiumactivationfragment.k()).b();
        if (!optional.b())
        {
            networkoperatorpremiumactivationfragment.a(State.e);
            return;
        }
        if (flag1 && optional.b())
        {
            networkoperatorpremiumactivationfragment.a(((JSONObject)optional.c()).toString());
            return;
        } else
        {
            networkoperatorpremiumactivationfragment.a(State.d);
            return;
        }
    }

    private void a(String s)
    {
        if (ai == null)
        {
            Object obj = k();
            dmz.a(gob);
            ai = gob.a(Cosmos.getResolver(k()));
            ai.c = new gnz(((u) (obj)), s) {

                private u a;
                private String b;
                private NetworkOperatorPremiumActivationFragment c;

                public final void a(boolean flag, String s1)
                {
                    gnx.a(a).a();
                    if (flag)
                    {
                        NetworkOperatorPremiumActivationFragment.a(c);
                    }
                    com.spotify.mobile.android.util.ClientEvent.Event event = com.spotify.mobile.android.util.ClientEvent.Event.az;
                    Object obj1;
                    if (flag)
                    {
                        obj1 = com.spotify.mobile.android.util.ClientEvent.SubEvent.dO;
                    } else
                    {
                        obj1 = com.spotify.mobile.android.util.ClientEvent.SubEvent.dP;
                    }
                    obj1 = new ClientEvent(event, ((com.spotify.mobile.android.util.ClientEvent.SubEvent) (obj1)));
                    ((ClientEvent) (obj1)).a("activation_payload", b);
                    ((ClientEvent) (obj1)).a("message", s1);
                    NetworkOperatorPremiumActivationFragment.b(c);
                    JVM INSTR tableswitch 1 2: default 92
                //                               1 137
                //                               2 131;
                       goto _L1 _L2 _L3
_L1:
                    s1 = "no activation method set";
_L5:
                    ((ClientEvent) (obj1)).a("activation method", s1);
                    dmz.a(fop);
                    fop.a(c.k(), ViewUri.b, ((ClientEvent) (obj1)));
                    return;
_L3:
                    s1 = "header enrichment";
                    continue; /* Loop/switch isn't completed */
_L2:
                    s1 = "wifi";
                    if (true) goto _L5; else goto _L4
_L4:
                }

            
            {
                c = NetworkOperatorPremiumActivationFragment.this;
                a = u;
                b = s;
                super();
            }
            };
            obj = ai;
            obj.d = s;
            obj.e = false;
            ((ActivationTask) (obj)).b.a();
        }
    }

    static int b(NetworkOperatorPremiumActivationFragment networkoperatorpremiumactivationfragment)
    {
        return networkoperatorpremiumactivationfragment.b;
    }

    static State c(NetworkOperatorPremiumActivationFragment networkoperatorpremiumactivationfragment)
    {
        return networkoperatorpremiumactivationfragment.af;
    }

    static goh d(NetworkOperatorPremiumActivationFragment networkoperatorpremiumactivationfragment)
    {
        return networkoperatorpremiumactivationfragment.ah;
    }

    public final void A()
    {
        super.A();
        Z.b(al);
        Z.b();
    }

    public final void B()
    {
        super.B();
        if (ad != null)
        {
            ad.a();
            ad = null;
        }
        if (ac != null)
        {
            ac.a = null;
            ac.a(NetworkOperatorConnectivityChecker.State.g);
            ac = null;
        }
        if (ah != null)
        {
            ah.a();
            ah = null;
        }
        if (ai != null)
        {
            ai.c = null;
            ActivationTask activationtask = ai;
            activationtask.e = true;
            activationtask.a.destroy();
            activationtask.b.c();
        }
        a(State.j);
    }

    protected final void F()
    {
        ae = Y.b(this);
    }

    public final void a()
    {
        if (af != State.h)
        {
            Assertion.b((new StringBuilder("onShowDialog() called when state is ")).append(af).toString());
        } else
        if (!G())
        {
            a(State.i);
            ab.b().a(a, true).b();
            a(PremiumActivationOptInDialog.a(k()));
            return;
        }
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        aa = fyw.a(this);
        dmz.a(dxd);
        Z = dxd.a(k());
        ab = ((giq)dmz.a(giq)).b(k());
        State state = State.a;
        if (bundle != null)
        {
            ae = bundle.getInt("request_code");
            state = State.values()[bundle.getInt("state")];
            ak = bundle.getLong("msisdn");
            ag = bundle.getString("activation_payload");
            aj = bundle.getBoolean("logged_imsi");
            aa = fyw.a(bundle);
            bundle = state;
        } else
        if (!((Boolean)aa.a(fys.R)).booleanValue())
        {
            bundle = State.b;
        } else
        {
            bundle = state;
        }
        if (G())
        {
            bundle = State.i;
        }
        state = State.i;
        if (bundle == State.a)
        {
            bundle = State.c;
        }
        if (!"51502".equals(((gnw)dmz.a(gnw)).c.getSimOperator()))
        {
            bundle = State.b;
        }
        a(((State) (bundle)));
    }

    protected final void a(State state)
    {
        if (o()) goto _L2; else goto _L1
_L1:
        Assertion.b(String.format("Attempting to set state %s when fragment is not added to an activity", new Object[] {
            state
        }));
_L4:
        return;
_L2:
        if (state == af) goto _L4; else goto _L3
_L3:
        boolean flag3;
        State state1 = af;
        af = state;
        flag3 = false;
        final class _cls6
        {

            static final int a[];

            static 
            {
                a = new int[State.values().length];
                try
                {
                    a[State.b.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror9) { }
                try
                {
                    a[State.a.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    a[State.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    a[State.d.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    a[State.e.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    a[State.f.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[State.g.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[State.h.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[State.i.ordinal()] = 9;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[State.j.ordinal()] = 10;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls6.a[af.ordinal()];
        JVM INSTR tableswitch 1 7: default 100
    //                   1 317
    //                   2 329
    //                   3 341
    //                   4 356
    //                   5 371
    //                   6 383
    //                   7 395;
           goto _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12
_L5:
        boolean flag;
        boolean flag1;
        boolean flag2;
        flag1 = false;
        flag = false;
        flag2 = false;
_L15:
        state = u();
        if (flag3)
        {
            if (state.b(0x7f110087) == null)
            {
                state.a(0x7f110087, null, new goj(this));
            }
        } else
        if (state.b(0x7f110087) != null)
        {
            state.a(0x7f110087);
        }
        if (flag1)
        {
            if (ac == null)
            {
                state = am;
                NetworkOperatorConnectivityChecker networkoperatorconnectivitychecker = new NetworkOperatorConnectivityChecker(k());
                networkoperatorconnectivitychecker.a = state;
                ac = networkoperatorconnectivitychecker;
                state = ac;
                state.a(NetworkOperatorConnectivityChecker.State.a);
                (new Handler(Looper.getMainLooper())).post(new NetworkOperatorConnectivityChecker._cls1(state));
            }
        } else
        if (ac != null)
        {
            ac.a = null;
            ac.a(NetworkOperatorConnectivityChecker.State.g);
            ac = null;
        }
        if (((gim)dmz.a(gim)).a(k(), "android.permission.READ_PHONE_STATE")) goto _L14; else goto _L13
_L13:
        a(State.b);
_L21:
        if (!flag2)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (ah == null)
        {
            state = ao;
            ah = new goh(k(), state);
            ah.b = ak;
            state = ah;
            if (!((goh) (state)).a.c)
            {
                ((goh) (state)).a.a();
                return;
            }
        }
          goto _L4
_L6:
        flag1 = false;
        flag = false;
        flag2 = false;
          goto _L15
_L7:
        flag1 = false;
        flag = false;
        flag2 = false;
          goto _L15
_L8:
        flag3 = true;
        flag1 = false;
        flag = false;
        flag2 = false;
          goto _L15
_L9:
        flag3 = true;
        flag1 = false;
        flag = false;
        flag2 = false;
          goto _L15
_L10:
        flag1 = true;
        flag = false;
        flag2 = false;
          goto _L15
_L11:
        flag1 = false;
        flag = true;
        flag2 = false;
          goto _L15
_L12:
        flag1 = false;
        flag = false;
        flag2 = true;
          goto _L15
_L14:
        Object obj;
        obj = null;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_909;
        }
        obj = ((gnw)dmz.a(gnw)).c.getSimOperator();
        state = ((gnw)dmz.a(gnw)).c.getSubscriberId();
        if (aj) goto _L17; else goto _L16
_L16:
        u u;
        String s;
        u = k();
        s = ((gnw)dmz.a(gnw)).c.getSimOperator();
        Object obj1 = ((gnw)dmz.a(gnw)).c.getSubscriberId();
_L23:
        if (!TextUtils.isEmpty(s) && !TextUtils.isEmpty(((CharSequence) (obj1))))
        {
            dmz.a(fop);
            fop.a(u, ViewUri.b, (new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.ax)).a("mcc-mnc", s).a("imsi", ((String) (obj1))));
            aj = true;
        }
_L17:
        SecurityException securityexception;
        long l;
        if (!"51502".equals(obj) || TextUtils.isEmpty(state))
        {
            flag = false;
            obj1 = obj;
            obj = state;
            state = ((State) (obj1));
        } else
        {
            State state2 = state;
            state = ((State) (obj));
            obj = state2;
        }
_L26:
        if (!flag) goto _L19; else goto _L18
_L18:
        if (ad != null) goto _L21; else goto _L20
_L20:
        ad = new goc(k(), ((giq)dmz.a(giq)).a(k()), state, ((String) (obj)));
        state = ad;
        obj = aa;
        state.e = an;
        if (((goc) (state)).h == null || ((goc) (state)).d == null || ((Flags) (obj)).a(fys.aw) != RolloutGlobalChargeMsisdnLookup.b) goto _L21; else goto _L22
_L22:
        state.c = ((goc) (state)).b.a(((goc) (state)).a, new JSONObject());
        l = ((goc) (state)).c.optLong(((goc) (state)).d, 0L);
        if (l == 0L)
        {
            break MISSING_BLOCK_LABEL_784;
        }
        state.a(l, false);
          goto _L21
        obj;
        Assertion.a("Failed reading JSON", ((Throwable) (obj)));
        state.f = ((dmj)dmz.a(dmj)).a("https://api.globalcharge.com/mobileIdentity/msisdn");
        ((goc) (state)).f.a("", ((goc) (state)).h, ((goc) (state)).g);
          goto _L21
        securityexception;
        Assertion.a("READ_PHONE_STATE is not granted. This method should not be called without the permission.", securityexception);
        securityexception = null;
          goto _L23
        securityexception;
        state = null;
_L25:
        Assertion.a("Trying to call getSubscriberId() without permission. Should never happen.", securityexception);
          goto _L17
_L19:
        if (ad != null)
        {
            ad.a();
            ad = null;
        }
          goto _L21
        if (ah == null) goto _L4; else goto _L24
_L24:
        ah.a();
        ah = null;
        return;
        securityexception;
          goto _L25
        state = null;
          goto _L26
    }

    public final void e(Bundle bundle)
    {
        super.e(bundle);
        bundle.putInt("request_code", ae);
        bundle.putInt("state", af.ordinal());
        bundle.putLong("msisdn", ak);
        bundle.putString("activation_payload", ag);
        bundle.putBoolean("logged_imsi", aj);
        bundle.putParcelable("FlagsArgumentHelper.Flags", aa);
    }

    public final void z()
    {
        super.z();
        Z.a();
        Z.a(al);
    }


    private class State extends Enum
    {

        public static final State a;
        public static final State b;
        public static final State c;
        public static final State d;
        public static final State e;
        public static final State f;
        public static final State g;
        public static final State h;
        public static final State i;
        public static final State j;
        private static final State k[];

        public static State valueOf(String s)
        {
            return (State)Enum.valueOf(com/spotify/music/spotlets/networkoperatorpremiumactivation/legacy/NetworkOperatorPremiumActivationFragment$State, s);
        }

        public static State[] values()
        {
            return (State[])k.clone();
        }

        static 
        {
            a = new State("INITIALIZED", 0);
            b = new State("DISABLED", 1);
            c = new State("WAITING_FOR_FREE_USER", 2);
            d = new State("WAITING_FOR_BACKEND_CONNECTION", 3);
            e = new State("WAITING_FOR_MOBILE_CONNECTIVITY", 4);
            f = new State("WAITING_FOR_MSISDN", 5);
            g = new State("WAITING_FOR_ELIGIBILITY_CHECK", 6);
            h = new State("WAITING_FOR_SHOWING_DIALOG", 7);
            i = new State("DIALOG_SHOWN", 8);
            j = new State("DESTROYED", 9);
            k = (new State[] {
                a, b, c, d, e, f, g, h, i, j
            });
        }

        private State(String s, int l)
        {
            super(s, l);
        }
    }

}
