// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import com.spotify.mobile.android.ui.activity.DiskAlmostFullActivity;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.DialogPresenter;

public final class fyp extends fze
{

    private boolean Z;
    private int a;
    private final BroadcastReceiver aa = new BroadcastReceiver() {

        private fyp a;

        public final void onReceive(Context context, Intent intent)
        {
            if (!fyp.a(a) && context != null)
            {
                fyp.a(a, new Intent(context, com/spotify/mobile/android/ui/activity/DiskAlmostFullActivity));
                if (a.Y != null)
                {
                    a.Y.a(a);
                    fyp.b(a);
                    return;
                }
            }
        }

            
            {
                a = fyp.this;
                super();
            }
    };
    private Intent b;

    public fyp()
    {
    }

    static Intent a(fyp fyp1, Intent intent)
    {
        fyp1.b = intent;
        return intent;
    }

    static boolean a(fyp fyp1)
    {
        return fyp1.Z;
    }

    static boolean b(fyp fyp1)
    {
        fyp1.Z = true;
        return true;
    }

    public final void A()
    {
        de.a(k()).a(aa);
        super.A();
    }

    protected final void F()
    {
        a = Y.b(this);
    }

    public final void a()
    {
        Assertion.b(Integer.valueOf(a), Integer.valueOf(0));
        a(b, a);
    }

    public final void a(int i, int j, Intent intent)
    {
        super.a(i, j, intent);
        Z = false;
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        if (bundle != null)
        {
            Z = bundle.getBoolean("queued", false);
            a = bundle.getInt("request_code");
        }
    }

    public final void e(Bundle bundle)
    {
        super.e(bundle);
        bundle.putBoolean("queued", Z);
        bundle.putInt("request_code", a);
    }

    public final void z()
    {
        super.z();
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addAction(gce.a);
        intentfilter.addAction(gce.b);
        intentfilter.addCategory("android.intent.category.DEFAULT");
        de.a(k()).a(aa, intentfilter);
    }
}
