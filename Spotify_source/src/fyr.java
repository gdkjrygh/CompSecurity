// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import com.spotify.mobile.android.ui.activity.dialog.ShowDialogAction;
import com.spotify.mobile.android.ui.activity.upsell.Reason;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.DialogPresenter;

public final class fyr extends fze
{

    private boolean Z;
    private int a;
    private dxc aa;
    private Flags ab;
    private final BroadcastReceiver ac = new BroadcastReceiver() {

        private fyr a;

        public final void onReceive(Context context, Intent intent)
        {
            switch (intent.getIntExtra("feature", 0))
            {
            default:
                dmz.a(ggc);
                ggc.a(context, 0x7f08054e, 0, new Object[0]);
                return;

            case 1: // '\001'
                fyr.a(a, Reason.f);
                return;

            case 2: // '\002'
                fyr.a(a, Reason.c);
                break;
            }
        }

            
            {
                a = fyr.this;
                super();
            }
    };
    private final dwx ad = new dwx() {

        private fyr a;

        public final void a(Flags flags)
        {
            fyr.a(a, flags);
        }

            
            {
                a = fyr.this;
                super();
            }
    };
    private ShowDialogAction b;

    public fyr()
    {
    }

    static Flags a(fyr fyr1, Flags flags)
    {
        fyr1.ab = flags;
        return flags;
    }

    public static fyr a(Flags flags)
    {
        fyr fyr1 = new fyr();
        fyw.a(fyr1, flags);
        return fyr1;
    }

    static void a(fyr fyr1, Reason reason)
    {
        dmz.a(frb);
        fyr1.b = frb.a(fyr1.ab, reason, null, null);
        if (fyr1.Y != null)
        {
            fyr1.Y.a(fyr1);
        }
    }

    public final void A()
    {
        aa.b();
        aa.b(ad);
        k().unregisterReceiver(ac);
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
        ab = fyw.a(this);
        dmz.a(dxd);
        aa = dxd.a(k());
        if (bundle != null)
        {
            Z = bundle.getBoolean("queued", false);
            a = bundle.getInt("request_code");
            ab = fyw.a(bundle);
        }
    }

    public final void e(Bundle bundle)
    {
        super.e(bundle);
        bundle.putBoolean("queued", Z);
        bundle.putInt("request_code", a);
        bundle.putParcelable("FlagsArgumentHelper.Flags", ab);
    }

    public final void z()
    {
        super.z();
        aa.a(ad);
        aa.a();
        u u1 = k();
        BroadcastReceiver broadcastreceiver = ac;
        IntentFilter intentfilter = new IntentFilter("com.spotify.mobile.android.service.broadcast.session.FEATURE_ERROR");
        intentfilter.addCategory("android.intent.category.DEFAULT");
        u1.registerReceiver(broadcastreceiver, intentfilter);
    }
}
