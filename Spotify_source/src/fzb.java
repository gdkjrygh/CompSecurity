// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.os.Bundle;
import com.spotify.mobile.android.ui.activity.OfflineSyncErrorActivity;
import com.spotify.mobile.android.ui.activity.dialog.ShowDialogAction;
import com.spotify.mobile.android.ui.activity.upsell.Reason;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.DialogPresenter;
import com.spotify.mobile.android.util.SpotifyError;

public final class fzb extends fze
{

    private boolean Z;
    private int a;
    private Flags aa;
    private dxc ab;
    private evx ac;
    private final evy ad = new evy() {

        private fzb a;

        public final void a(SpotifyError spotifyerror)
        {
            if (spotifyerror != SpotifyError.a && !fzb.a(a))
            {
                if (spotifyerror == SpotifyError.b)
                {
                    spotifyerror = a;
                    dmz.a(frb);
                    fzb.a(spotifyerror, frb.a(fzb.b(a), Reason.e, null, null));
                } else
                {
                    Intent intent = new Intent(a.k(), com/spotify/mobile/android/ui/activity/OfflineSyncErrorActivity);
                    intent.putExtra("error_code", spotifyerror.mCode);
                    spotifyerror = a;
                    dmz.a(frb);
                    fzb.a(spotifyerror, frb.a(intent));
                }
                if (a.Y != null)
                {
                    a.Y.a(a);
                    fzb.c(a);
                    return;
                }
            }
        }

            
            {
                a = fzb.this;
                super();
            }
    };
    private final dwx ae = new dwx() {

        private fzb a;

        public final void a(Flags flags)
        {
            fzb.a(a, flags);
        }

            
            {
                a = fzb.this;
                super();
            }
    };
    private ShowDialogAction b;

    public fzb()
    {
    }

    static ShowDialogAction a(fzb fzb1, ShowDialogAction showdialogaction)
    {
        fzb1.b = showdialogaction;
        return showdialogaction;
    }

    static Flags a(fzb fzb1, Flags flags)
    {
        fzb1.aa = flags;
        return flags;
    }

    public static fzb a(Flags flags)
    {
        fzb fzb1 = new fzb();
        fyw.a(fzb1, flags);
        return fzb1;
    }

    static boolean a(fzb fzb1)
    {
        return fzb1.Z;
    }

    static Flags b(fzb fzb1)
    {
        return fzb1.aa;
    }

    static boolean c(fzb fzb1)
    {
        fzb1.Z = true;
        return true;
    }

    public final void A()
    {
        ab.b();
        ab.b(ae);
        ac.b(ad);
        evx.b(k(), ac);
        super.A();
    }

    protected final void F()
    {
        a = Y.b(this);
    }

    public final void a()
    {
        Assertion.b(Integer.valueOf(a), Integer.valueOf(0));
        b.a(this, a);
    }

    public final void a(int i, int j, Intent intent)
    {
        super.a(i, j, intent);
        if (i == a)
        {
            Z = false;
        }
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        aa = fyw.a(this);
        dmz.a(dxd);
        ab = dxd.a(k());
        if (bundle != null)
        {
            Z = bundle.getBoolean("queued", false);
            a = bundle.getInt("request_code");
            aa = fyw.a(bundle);
        }
        ac = new evx();
    }

    public final void e(Bundle bundle)
    {
        bundle.putBoolean("queued", Z);
        bundle.putInt("request_code", a);
        bundle.putParcelable("FlagsArgumentHelper.Flags", aa);
        super.e(bundle);
    }

    public final void z()
    {
        super.z();
        ab.a(ae);
        ab.a();
        ac.a(ad);
        evx.a(k(), ac);
    }
}
