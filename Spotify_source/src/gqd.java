// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.os.Bundle;
import com.spotify.mobile.android.ui.activity.dialog.ShowDialogAction;
import com.spotify.mobile.android.ui.activity.upsell.CheckOptInTrialEligibilityTask;
import com.spotify.mobile.android.ui.activity.upsell.Reason;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.util.DialogPresenter;
import java.util.concurrent.TimeUnit;

public final class gqd extends fze
{

    private boolean Z;
    private int a;
    private boolean aa;
    private dxc ab;
    private gey ac;
    private final dwx ad = new dwx() {

        private gqd a;

        public final void a(Flags flags)
        {
            gqd.a(a, flags);
            gqd.a(a);
        }

            
            {
                a = gqd.this;
                super();
            }
    };
    private final Runnable ae = new Runnable() {

        private gqd a;

        public final void run()
        {
            gqd.a(a);
        }

            
            {
                a = gqd.this;
                super();
            }
    };
    private Flags b;

    public gqd()
    {
    }

    static Flags a(gqd gqd1, Flags flags)
    {
        gqd1.b = flags;
        return flags;
    }

    public static gqd a(Flags flags)
    {
        gqd gqd1 = new gqd();
        fyw.a(gqd1, flags);
        return gqd1;
    }

    static void a(gqd gqd1)
    {
        if (((Boolean)gqd1.b.a(fys.ae)).booleanValue() || gqd1.aa) goto _L2; else goto _L1
_L1:
        if (CheckOptInTrialEligibilityTask.a() != com.spotify.mobile.android.ui.activity.upsell.CheckOptInTrialEligibilityTask.State.a) goto _L4; else goto _L3
_L3:
        if (gqd1.ac.c) goto _L6; else goto _L5
_L5:
        gqd1.ac.a();
_L2:
        return;
_L6:
        gqd1.ac.e();
        if (gqd1.ac.f())
        {
            gqd1.ac.c();
            return;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (gqd1.Y != null && !gqd1.Z)
        {
            gqd1.Y.a(gqd1);
            gqd1.Z = true;
        }
        if (gqd1.ac.c)
        {
            gqd1.ac.d();
            gqd1.ac.c();
            return;
        }
        if (true) goto _L2; else goto _L7
_L7:
    }

    public final void A()
    {
        super.A();
        ab.b(ad);
        ab.b();
        if (ac.c)
        {
            ac.c();
        }
    }

    protected final void F()
    {
        a = Y.b(this);
    }

    public final void a()
    {
        dmz.a(frb);
        frb.a(b, Reason.k, null, null).a(k());
    }

    public final void a(int i, int j, Intent intent)
    {
        super.a(i, j, intent);
        Z = false;
        aa = true;
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        b = fyw.a(this);
        dmz.a(dxd);
        ab = dxd.a(k());
        if (bundle != null)
        {
            bundle.setClassLoader(k().getClassLoader());
            a = bundle.getInt("request_code");
            b = (Flags)bundle.getParcelable("flags");
            Z = bundle.getBoolean("queued", false);
            aa = bundle.getBoolean("shown", false);
        }
        bundle = new gez("no-streaming-upsell-detector", ae);
        bundle.a = new gfd(1L, TimeUnit.SECONDS);
        bundle.c = new gfb(500L, TimeUnit.MILLISECONDS);
        bundle.d = 10;
        ac = bundle.a();
    }

    public final void e(Bundle bundle)
    {
        super.e(bundle);
        bundle.putInt("request_code", a);
        bundle.putParcelable("flags", b);
        bundle.putBoolean("queued", Z);
        bundle.putBoolean("shown", aa);
    }

    public final void z()
    {
        super.z();
        ab.a();
        ab.a(ad);
    }
}
