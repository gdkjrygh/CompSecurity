// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.activity.dynamicupsell;

import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.os.Binder;
import android.os.Handler;
import android.os.IBinder;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import de;
import dmz;
import dvk;
import dwx;
import dxc;
import dxd;
import fps;
import fqa;
import fqc;
import fqd;
import fys;
import gcf;
import java.util.Observable;
import java.util.Observer;

// Referenced classes of package com.spotify.mobile.android.ui.activity.dynamicupsell:
//            DynamicUpsellsFlag, DynamicUpsellConfig

public class DynamicUpsellDataStoreControlService extends Service
    implements Observer
{

    private de a;
    private final BroadcastReceiver b = new fqd(this);
    private final Binder c = new Binder();
    private fps d;
    private dxc e;
    private Flags f;
    private final dwx g = new dwx() {

        private DynamicUpsellDataStoreControlService a;

        public final void a(Flags flags)
        {
            DynamicUpsellDataStoreControlService.a(a, flags);
            if (DynamicUpsellDataStoreControlService.a(a))
            {
                DynamicUpsellDataStoreControlService.b(a);
                return;
            } else
            {
                DynamicUpsellDataStoreControlService.c(a).a(com.spotify.mobile.android.ui.activity.upsell.Reason.ReasonGroup.a, false);
                return;
            }
        }

            
            {
                a = DynamicUpsellDataStoreControlService.this;
                super();
            }
    };

    public DynamicUpsellDataStoreControlService()
    {
    }

    static Flags a(DynamicUpsellDataStoreControlService dynamicupselldatastorecontrolservice, Flags flags)
    {
        dynamicupselldatastorecontrolservice.f = flags;
        return flags;
    }

    public static void a(Context context, ServiceConnection serviceconnection)
    {
        String s = com/spotify/mobile/android/ui/activity/dynamicupsell/DynamicUpsellDataStoreControlService.getSimpleName();
        dvk.a(context, new Intent(context, com/spotify/mobile/android/ui/activity/dynamicupsell/DynamicUpsellDataStoreControlService), serviceconnection, s);
    }

    public static void a(DynamicUpsellDataStoreControlService dynamicupselldatastorecontrolservice, com.spotify.mobile.android.ui.activity.upsell.Reason.ReasonGroup reasongroup)
    {
        if (!dynamicupselldatastorecontrolservice.a())
        {
            dynamicupselldatastorecontrolservice.b().a(reasongroup, true);
        }
    }

    public static void a(de de1, BroadcastReceiver broadcastreceiver)
    {
        de1.a(broadcastreceiver, new IntentFilter("com.spotify.mobile.android.ui.activity.dynamicupsell.DynamicUpsellDataStoreControlService.INTENT_CONFIG_REFRESH_BROADCAST"));
    }

    public static void a(de de1, com.spotify.mobile.android.ui.activity.upsell.Reason.ReasonGroup reasongroup)
    {
        Intent intent = new Intent("com.spotify.mobile.android.ui.activity.dynamicupsell.DynamicUpsellDataStoreControlService.SERVICE_INTENT_FILTER");
        intent.putExtra("action", Operation.a);
        intent.putExtra("reason", reasongroup);
        de1.a(intent);
    }

    private boolean a()
    {
        return f == null || f.a(fys.aB) == DynamicUpsellsFlag.b;
    }

    static boolean a(DynamicUpsellDataStoreControlService dynamicupselldatastorecontrolservice)
    {
        return dynamicupselldatastorecontrolservice.a();
    }

    private fps b()
    {
        if (d == null || d.d)
        {
            dmz.a(fqc);
            fqa fqa1 = fqc.a(this);
            d = new fps(new Handler(), fqa1, gcf.a);
            d.addObserver(this);
        }
        return d;
    }

    public static void b(Context context, ServiceConnection serviceconnection)
    {
        dvk.a(context, serviceconnection, com/spotify/mobile/android/ui/activity/dynamicupsell/DynamicUpsellDataStoreControlService.getSimpleName());
    }

    static void b(DynamicUpsellDataStoreControlService dynamicupselldatastorecontrolservice)
    {
        dynamicupselldatastorecontrolservice.c();
    }

    static fps c(DynamicUpsellDataStoreControlService dynamicupselldatastorecontrolservice)
    {
        return dynamicupselldatastorecontrolservice.b();
    }

    private void c()
    {
        if (d == null)
        {
            return;
        }
        fps fps1 = d;
        if (!fps1.d)
        {
            fps1.d = true;
            fps1.b.removeCallbacksAndMessages(null);
            fps1.c.a();
            fps1.deleteObservers();
        }
        d = null;
    }

    public IBinder onBind(Intent intent)
    {
        return c;
    }

    public void onCreate()
    {
        super.onCreate();
        IntentFilter intentfilter = new IntentFilter("com.spotify.mobile.android.ui.activity.dynamicupsell.DynamicUpsellDataStoreControlService.SERVICE_INTENT_FILTER");
        a = de.a(this);
        a.a(b, intentfilter);
        dmz.a(dxd);
        e = dxd.a(this);
        e.a(g);
        e.a();
    }

    public void onDestroy()
    {
        super.onDestroy();
        a.a(b);
        e.b();
        e.b(g);
        c();
    }

    public void update(Observable observable, Object obj)
    {
        if (!(obj instanceof DynamicUpsellConfig))
        {
            return;
        } else
        {
            observable = (DynamicUpsellConfig)obj;
            obj = new Intent("com.spotify.mobile.android.ui.activity.dynamicupsell.DynamicUpsellDataStoreControlService.INTENT_CONFIG_REFRESH_BROADCAST");
            ((Intent) (obj)).putExtra("payload", observable);
            a.a(((Intent) (obj)));
            return;
        }
    }

    // Unreferenced inner class com/spotify/mobile/android/ui/activity/dynamicupsell/DynamicUpsellDataStoreControlService$2

/* anonymous class */
    public final class _cls2
    {

        public static final int a[];

        static 
        {
            a = new int[Operation.values().length];
            try
            {
                a[Operation.a.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror) { }
        }
    }


    private class Operation extends Enum
    {

        public static final Operation a;
        private static final Operation b[];

        public static Operation valueOf(String s)
        {
            return (Operation)Enum.valueOf(com/spotify/mobile/android/ui/activity/dynamicupsell/DynamicUpsellDataStoreControlService$Operation, s);
        }

        public static Operation[] values()
        {
            return (Operation[])b.clone();
        }

        static 
        {
            a = new Operation("REFRESH");
            b = (new Operation[] {
                a
            });
        }

        private Operation(String s)
        {
            super(s, 0);
        }
    }

}
