// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import com.spotify.mobile.android.orbit.OrbitServiceObserver;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.ui.activity.dialog.ShowDialogAction;
import com.spotify.mobile.android.ui.activity.upsell.Reason;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.DialogPresenter;
import com.spotify.mobile.android.util.SpotifyLink;
import com.spotify.mobile.android.util.viewuri.ViewUri;

public final class fzd extends fze
{

    private get Z;
    private int a;
    private Flags aa;
    private String ab;
    private dxc ac;
    private BroadcastReceiver ad;
    private final dwx ae = new dwx() {

        private fzd a;

        public final void a(Flags flags)
        {
            fzd.a(a, flags);
        }

            
            {
                a = fzd.this;
                super();
            }
    };
    private ShowDialogAction b;

    public fzd()
    {
        Z = (get)dmz.a(get);
        dmz.a(fop);
        ad = new BroadcastReceiver() {

            private fzd a;

            public final void onReceive(Context context, Intent intent)
            {
                boolean flag2 = false;
                int i = intent.getIntExtra("error_code", 0);
                String s = intent.getStringExtra("uri");
                intent = intent.getStringExtra("content_uri");
                boolean flag;
                boolean flag1;
                if (s != null)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (intent != null)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                Assertion.a(flag1 ^ flag, "only one of EXTRA_URI and EXTRA_CONTENT_URI may be set at once");
                if (s == null || "".equals(s) || s.startsWith("spotify:track:") || s.startsWith("spotify:local:") || s.startsWith("spotify:ad:") || s.startsWith("spotify:episode:"))
                {
                    flag2 = true;
                }
                Assertion.a(flag2, (new StringBuilder("unexpected EXTRA_URI: ")).append(s).toString());
                if (intent != null && !intent.startsWith("content://"))
                {
                    Assertion.a((new StringBuilder("EXTRA_CONTENT_URI must be a content uri, was ")).append(intent).toString());
                }
                fzd.a(a, context, i, s, intent);
            }

            
            {
                a = fzd.this;
                super();
            }
        };
    }

    static Flags a(fzd fzd1, Flags flags)
    {
        fzd1.aa = flags;
        return flags;
    }

    public static fzd a(Flags flags)
    {
        fzd fzd1 = new fzd();
        fyw.a(fzd1, flags);
        return fzd1;
    }

    private void a(Context context, int i, String s, String s1)
    {
        ClientEvent clientevent = OrbitServiceObserver.getPlaybackErrorAsClientEvent(i);
        String s2;
        if (s != null)
        {
            s2 = s;
        } else
        {
            s2 = s1;
        }
        clientevent.a("target", s2);
        fop.a(context, ViewUri.b, clientevent);
        s = (new SpotifyLink(s)).c;
        switch (i)
        {
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
        case 7: // '\007'
        case 8: // '\b'
        case 9: // '\t'
        case 12: // '\f'
        case 13: // '\r'
        default:
            if (s == com.spotify.mobile.android.util.SpotifyLink.LinkType.P)
            {
                dmz.a(ggc);
                ggc.a(context, 0x7f080577);
                return;
            } else
            {
                dmz.a(ggc);
                ggc.a(context, 0x7f08057c);
                return;
            }

        case 2: // '\002'
            a(((String) (null)), Reason.k);
            return;

        case 16: // '\020'
            a(s1, Reason.g);
            return;

        case 17: // '\021'
            a(((String) (null)), Reason.e);
            return;

        case 11: // '\013'
            dmz.a(ggc);
            ggc.d(context);
            return;

        case 10: // '\n'
            dmz.a(ggc);
            ggc.a(context, 0x7f08055e, 1, new Object[0]);
            return;

        case 15: // '\017'
            a(((String) (null)), Reason.d);
            return;

        case 14: // '\016'
            a(s1, Reason.h);
            return;

        case 18: // '\022'
            if (s == com.spotify.mobile.android.util.SpotifyLink.LinkType.P)
            {
                dmz.a(ggc);
                ggc.a(context, 0x7f080579);
                return;
            } else
            {
                dmz.a(ggc);
                ggc.a(context, 0x7f08057e);
                return;
            }

        case 19: // '\023'
            if (s == com.spotify.mobile.android.util.SpotifyLink.LinkType.P)
            {
                dmz.a(ggc);
                ggc.a(context, 0x7f080578);
                return;
            } else
            {
                dmz.a(ggc);
                ggc.a(context, 0x7f08057d);
                return;
            }

        case 20: // '\024'
            dmz.a(ggc);
            ggc.a(context, 0x7f080581);
            return;

        case 21: // '\025'
            dmz.a(ggc);
            ggc.a(context, 0x7f08057f);
            return;

        case 22: // '\026'
            dmz.a(ggc);
            ggc.a(context, 0x7f080583);
            return;

        case 23: // '\027'
            dmz.a(ggc);
            ggc.a(context, 0x7f080582);
            return;

        case 24: // '\030'
            dmz.a(ggc);
            ggc.a(context, 0x7f080580);
            return;

        case 25: // '\031'
            context = new dfj(context, 0x7f0b017f);
            context.a(0x7f080279);
            context.b(0x7f080277);
            context.a(0x7f080278, new android.content.DialogInterface.OnClickListener() {

                public final void onClick(DialogInterface dialoginterface, int j)
                {
                    dialoginterface.dismiss();
                }

            });
            context.b().show();
            return;
        }
    }

    static void a(fzd fzd1, Context context, int i, String s, String s1)
    {
        fzd1.a(context, i, s, s1);
    }

    private void a(String s, Reason reason)
    {
        dmz.a(frb);
        b = frb.a(aa, reason, s, ab);
        if (Y != null)
        {
            Y.a(this);
        }
    }

    public final void A()
    {
        super.A();
        Z.c.b().a(get.a).a(get.b).a();
    }

    protected final void F()
    {
        a = Y.b(this);
    }

    public final void a()
    {
        Assertion.b(Integer.valueOf(a), Integer.valueOf(0));
        Assertion.a(b);
        b.a(this, a);
    }

    public final void a(int i, int j, Intent intent)
    {
        Assertion.b(Integer.valueOf(a), Integer.valueOf(0));
        super.a(i, j, intent);
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        aa = fyw.a(this);
        dmz.a(dxd);
        ac = dxd.a(k());
        if (bundle != null)
        {
            a = bundle.getInt("request_code");
            ab = bundle.getString("request_country");
            b = (ShowDialogAction)bundle.getParcelable("request_intent");
            aa = fyw.a(bundle);
        } else
        {
            bundle = edb.a(k());
            if (bundle != null && bundle.c())
            {
                ab = bundle.h().i;
                return;
            }
        }
    }

    public final void c()
    {
        super.c();
        ac.a(ae);
        ac.a();
        u u1 = k();
        BroadcastReceiver broadcastreceiver = ad;
        IntentFilter intentfilter = new IntentFilter("com.spotify.mobile.android.service.broadcast.session.PLAYBACK_ERROR");
        intentfilter.addCategory("android.intent.category.DEFAULT");
        u1.registerReceiver(broadcastreceiver, intentfilter);
    }

    public final void d()
    {
        super.d();
        ac.b();
        ac.b(ae);
        k().unregisterReceiver(ad);
    }

    public final void e(Bundle bundle)
    {
        super.e(bundle);
        bundle.putInt("request_code", a);
        bundle.putString("request_country", ab);
        bundle.putParcelable("request_intent", b);
        bundle.putParcelable("FlagsArgumentHelper.Flags", aa);
    }

    public final void z()
    {
        super.z();
        if (Z.c.f(get.a))
        {
            Object obj = Z;
            ctz.a(((get) (obj)).c.f(get.a));
            int i = ((get) (obj)).c.a(get.a);
            obj = Z;
            ctz.a(((get) (obj)).c.f(get.b));
            obj = ((get) (obj)).c.c(get.b);
            a(k(), i, ((String) (obj)), null);
        }
    }
}
