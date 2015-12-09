// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import com.facebook.AppEventsLogger;
import com.facebook.Request;
import com.facebook.Session;
import com.facebook.SessionState;
import com.spotify.mobile.android.ui.activity.DisableOfflineModeActivity;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.SpotifyError;
import com.spotify.mobile.android.util.logging.Logger;
import com.spotify.mobile.android.util.viewuri.ViewUri;

public class dxr extends dxx
{

    private boolean Y;
    private boolean Z;
    View a;
    private ggl aa;
    private boolean ab;
    private final ape ac = new ape() {

        private dxr a;

        public final void a(Session session, SessionState sessionstate, Exception exception)
        {
            session = a;
            u u1 = session.k();
            if (exception != null)
            {
                if (u1 != null)
                {
                    dmz.a(ggc);
                    ggc.a(u1, exception);
                }
                session.I();
            } else
            {
                if (sessionstate != null && sessionstate.a() && !((dxr) (session)).b)
                {
                    if (((dxr) (session)).a != null)
                    {
                        ((dxr) (session)).a.setVisibility(0);
                    }
                    session.b = true;
                    Request.a(new Request[] {
                        Request.a(Session.g(), new dxt(session, (byte)0))
                    });
                    return;
                }
                if (sessionstate != null && sessionstate.a())
                {
                    Assertion.b("onSessionStateChange called with open session while outstanding request existed");
                    return;
                }
            }
        }

            
            {
                a = dxr.this;
                super();
            }
    };
    private apk ad;
    volatile boolean b;

    public dxr()
    {
        dmz.a(for);
    }

    public static dxr F()
    {
        dxr dxr1 = new dxr();
        Bundle bundle = new Bundle();
        bundle.putBoolean("isSignUpFlow", true);
        dxr1.f(bundle);
        return dxr1;
    }

    public static dxr a()
    {
        dxr dxr1 = new dxr();
        Bundle bundle = new Bundle();
        bundle.putBoolean("isSignUpFlow", false);
        dxr1.f(bundle);
        return dxr1;
    }

    static boolean a(dxr dxr1)
    {
        dxr1.b = false;
        return false;
    }

    static void b(dxr dxr1)
    {
        dxr1.I();
    }

    public final void A()
    {
        super.A();
        ad.b();
        aa.b();
    }

    public final void B()
    {
        super.B();
    }

    final void I()
    {
        if (q())
        {
            k().a_().c();
            return;
        } else
        {
            Z = true;
            return;
        }
    }

    public final boolean J()
    {
        return false;
    }

    public final dxs K()
    {
        return (dxs)H().a(this);
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = (View)ctz.a(layoutinflater.inflate(0x7f030097, viewgroup, false));
        a = layoutinflater.findViewById(0x7f1103b4);
        ab = true;
        return layoutinflater;
    }

    public final void a(int i, int j, Intent intent)
    {
        super.a(i, j, intent);
        if (1 != i) goto _L2; else goto _L1
_L1:
        if (j != -1) goto _L4; else goto _L3
_L3:
        for.a(k(), aa.c(), false);
_L6:
        return;
_L4:
        if (j == 0)
        {
            I();
            return;
        } else
        {
            Assertion.a((new StringBuilder("Unhandled result code ")).append(j).toString());
            return;
        }
_L2:
        u u1 = k();
        if (u1 != null)
        {
            if (Session.g() != null)
            {
                Session.g().a(u1, i, j, intent);
            }
            ad.a(i, j, intent);
            if (j == 0)
            {
                Session.a(null);
                ab = false;
                I();
                return;
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        ad = new apk(k(), ac);
        ad.a(bundle);
        s();
        Z = false;
        aa = ggn.b(k(), ViewUri.at);
    }

    protected final void a(SpotifyError spotifyerror)
    {
        super.a(spotifyerror);
        if (!q())
        {
            return;
        }
        if (a != null)
        {
            a.setVisibility(8);
        }
        if (SpotifyError.c.equals(spotifyerror))
        {
            a(new Intent(k(), com/spotify/mobile/android/ui/activity/DisableOfflineModeActivity), 1);
            return;
        } else
        {
            spotifyerror = new StringBuilder(spotifyerror.a(k()));
            Toast.makeText(k(), spotifyerror.toString(), 1).show();
            I();
            return;
        }
    }

    public final void a(dxy dxy1)
    {
        super.a(dxy1);
        if (k() != null)
        {
            ctz.a(g());
            boolean flag = g().getBoolean("isSignUpFlow", false);
            if (!Y && dxy1.a)
            {
                Y = true;
                if (flag)
                {
                    (new gfl(k())).a(0);
                    dxy1 = new ContentValues();
                    dxy1.put("should_show_trial_start_notice", Boolean.valueOf(false));
                    k().getContentResolver().update(dtx.a, dxy1, null, null);
                }
            }
            if (Y)
            {
                if (flag)
                {
                    K().a();
                    return;
                } else
                {
                    K().b();
                    return;
                }
            }
        }
    }

    public final void d()
    {
        super.d();
        AppEventsLogger.b();
    }

    public final void e(Bundle bundle)
    {
        super.e(bundle);
        ad.b(bundle);
    }

    public final void z()
    {
        super.z();
        aa.a();
        if (Z)
        {
            k().a_().c();
            Z = false;
            return;
        }
        if (ab)
        {
            u u1 = (u)ctz.a(k());
            Session session1 = Session.g();
            Session session = session1;
            if (session1 == null)
            {
                Assertion.b("Facebook session was null, ohlson was wrong. Remove me.");
                session = new Session(u1);
                Session.a(session);
            }
            if (!session.a() && !session.b())
            {
                ape ape = ac;
                try
                {
                    gdh.a(this, ape);
                }
                catch (UnsupportedOperationException unsupportedoperationexception)
                {
                    Logger.b(unsupportedoperationexception, "error requesting read permissions", new Object[0]);
                    dmz.a(ggc);
                    ggc.a(u1);
                    I();
                }
            } else
            {
                Session.a(u1, this, ac);
            }
            ab = false;
        }
        ad.a();
    }
}
