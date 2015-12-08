// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.applink.service;

import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.spotify.mobile.android.service.media.MediaService;
import com.spotify.mobile.android.spotlets.applink.AppLinkImpl;
import com.spotify.mobile.android.util.LockScreenController;
import dmz;
import eaj;
import eam;
import eao;
import eay;
import ebb;
import ebc;
import ecj;
import eeo;
import efy;
import efz;
import egd;
import egj;
import egs;
import java.util.Map;

// Referenced classes of package com.spotify.mobile.android.spotlets.applink.service:
//            AppLinkStateListener

public class AppLinkService extends Service
    implements ServiceConnection, AppLinkStateListener
{

    private static final String a[] = {
        "car", "AppLink"
    };
    private efy b;
    private egd c;
    private MediaService d;

    public AppLinkService()
    {
    }

    private void a()
    {
        if (b != null)
        {
            b.b();
            b = null;
        }
        if (c != null)
        {
            egd egd1 = c;
            egd1.a.b(egd1.f);
            egd1.a.a(null);
            egd1.b.a(egd1.e);
            egd1.h.b.clear();
            c = null;
        }
        if (d != null)
        {
            d.b(a);
        }
    }

    private void b(AppLinkStateListener.AppLinkState applinkstate)
    {
        applinkstate.equals(AppLinkStateListener.AppLinkState.a);
        if (applinkstate.equals(AppLinkStateListener.AppLinkState.a))
        {
            LockScreenController.a(this, "applink", 0x7f020223, false);
            return;
        } else
        {
            LockScreenController.a(this, "applink");
            return;
        }
    }

    public final void a(AppLinkStateListener.AppLinkState applinkstate)
    {
        b(applinkstate);
        ebb ebb1 = new ebb(this);
        if (AppLinkStateListener.AppLinkState.a.equals(applinkstate))
        {
            d.a(a);
            ebb1.a(1L, b.d(), b.e());
            applinkstate = new eeo();
            applinkstate.a = "Ford";
            applinkstate.b = b.e();
            applinkstate.c = "auto";
            d.a(applinkstate.a());
            return;
        } else
        {
            d.b(a);
            ebb1.b(1L, b.d(), b.e());
            return;
        }
    }

    public IBinder onBind(Intent intent)
    {
        return null;
    }

    public void onCreate()
    {
        MediaService.a(this, this);
    }

    public void onDestroy()
    {
        a();
        unbindService(this);
    }

    public void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        d = ((eao)ibinder).a;
        ibinder = (egs)dmz.a(egs);
        Object obj = egs.a();
        componentname = egs.a(this);
        egj egj1 = new egj(egs.b());
        if (((egs) (ibinder)).a == null)
        {
            ibinder.a = new AppLinkImpl(((egr) (obj)), new ecj(egs.b()), componentname, egj1);
        }
        b = ((egs) (ibinder)).a;
        ibinder = egs.b(this);
        obj = egs.a(b, d, componentname, new eay(this));
        c = new egd(b, d, new eaj(d, new eam(), new ebc()), ibinder, componentname, ((efz) (obj)));
        b(AppLinkStateListener.AppLinkState.b);
        c.l = this;
    }

    public void onServiceDisconnected(ComponentName componentname)
    {
        a();
    }

}
