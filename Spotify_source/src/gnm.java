// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.os.Bundle;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.util.DialogPresenter;
import com.spotify.music.spotlets.churnlockedstate.ChurnLockedStateActivity;
import com.spotify.music.spotlets.churnlockedstate.ChurnLockedStateRolloutFlag;
import java.util.concurrent.TimeUnit;

public final class gnm extends fze
{

    private static gip a = gip.b("churn_locked_state_unlocked_at");
    private static final long b;
    private int Z;
    private boolean aa;
    private Flags ab;
    private dxc ac;
    private gin ad;
    private final dwx ae = new dwx() {

        private gnm a;

        public final void a(Flags flags)
        {
            gnm.a(a, flags);
            gnm.a(a);
        }

            
            {
                a = gnm.this;
                super();
            }
    };

    public gnm()
    {
    }

    private void G()
    {
        if (((Boolean)ab.a(fys.X)).booleanValue() && ab.a(fys.aQ) == ChurnLockedStateRolloutFlag.a)
        {
            long l = ad.a(a, 0L);
            l = System.currentTimeMillis() - l;
            boolean flag;
            if (l > b)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (l > b && Y != null && !aa)
            {
                Y.a(this);
                aa = true;
            }
        }
    }

    static Flags a(gnm gnm1, Flags flags)
    {
        gnm1.ab = flags;
        return flags;
    }

    public static gnm a(Flags flags)
    {
        gnm gnm1 = new gnm();
        fyw.a(gnm1, flags);
        return gnm1;
    }

    static void a(gnm gnm1)
    {
        gnm1.G();
    }

    public final void A()
    {
        super.A();
        ac.b(ae);
        ac.b();
    }

    protected final void F()
    {
        Z = Y.b(this);
    }

    public final void a()
    {
        a(ChurnLockedStateActivity.a(k(), ab), Z);
    }

    public final void a(int i, int j, Intent intent)
    {
        aa = false;
        if (j == 1)
        {
            ad.b().a(a, System.currentTimeMillis()).b();
        } else
        {
            k().finish();
        }
        super.a(i, j, intent);
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        ab = fyw.a(this);
        dmz.a(dxd);
        ac = dxd.a(k());
        ad = ((giq)dmz.a(giq)).b(k());
        if (bundle != null)
        {
            bundle.setClassLoader(k().getClassLoader());
            aa = bundle.getBoolean("queued", false);
            Z = bundle.getInt("request_code");
            ab = (Flags)bundle.getParcelable("flags");
        }
        G();
    }

    public final void e(Bundle bundle)
    {
        super.e(bundle);
        bundle.putBoolean("queued", aa);
        bundle.putInt("request_code", Z);
        bundle.putParcelable("flags", ab);
    }

    public final void z()
    {
        super.z();
        ac.a();
        ac.a(ae);
    }

    static 
    {
        b = TimeUnit.HOURS.toMillis(24L);
    }
}
