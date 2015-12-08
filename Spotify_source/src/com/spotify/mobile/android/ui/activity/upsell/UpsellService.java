// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.activity.upsell;

import aa;
import android.app.Activity;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.os.Binder;
import android.os.IBinder;
import android.support.v4.app.Fragment;
import com.google.common.base.Optional;
import com.spotify.mobile.android.ui.activity.dynamicupsell.DynamicUpsellConfig;
import com.spotify.mobile.android.ui.activity.dynamicupsell.DynamicUpsellDataStoreControlService;
import com.spotify.mobile.android.ui.activity.dynamicupsell.DynamicUpsellDialogActivity;
import com.spotify.mobile.android.ui.activity.dynamicupsell.DynamicUpsellsFlag;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.logging.Logger;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import de;
import dmz;
import dvk;
import fop;
import frg;
import frh;
import fys;
import gcf;
import gct;
import ggb;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import u;

// Referenced classes of package com.spotify.mobile.android.ui.activity.upsell:
//            Reason, UpsellDialogActivity, ShowUpsellAction

public class UpsellService extends Service
{

    private static final long a;
    private final BroadcastReceiver b = new frg(this);
    private final Binder c = new Binder();
    private final gct d = (gct)dmz.a(gct);
    private de e;
    private DynamicUpsellConfig f;
    private ServiceConnection g;
    private Optional h;

    public UpsellService()
    {
        g = new ServiceConnection() {

            public final void onServiceConnected(ComponentName componentname, IBinder ibinder)
            {
            }

            public final void onServiceDisconnected(ComponentName componentname)
            {
            }

        };
        h = Optional.e();
        dmz.a(ggb);
        ggb.a();
    }

    private static Intent a(int i, ShowUpsellAction showupsellaction, String s, String s1)
    {
        s = new Intent(s);
        s.putExtra("com.spotify.mobile.android.ui.activity.upsell.ShowUpsellAction.EXTRAS_PARAMS", showupsellaction);
        s.putExtra("show_upsell_context_hash", i);
        s.putExtra("source_class_name", s1);
        return s;
    }

    public static ServiceConnection a()
    {
        return new _cls1();
    }

    private static Optional a(Context context, Flags flags, Reason reason, String s, String s1, Optional optional)
    {
        if (!optional.b())
        {
            optional = new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.aA, com.spotify.mobile.android.util.ClientEvent.SubEvent.dM);
            dmz.a(fop);
            fop.a(context, ViewUri.aU, reason.mSubView, optional);
        } else
        {
            boolean flag;
            if ((DynamicUpsellsFlag)flags.a(fys.aB) != DynamicUpsellsFlag.a)
            {
                flag = false;
            } else
            if (!reason.a())
            {
                flag = false;
            } else
            {
                Boolean boolean1;
                if (reason == Reason.d)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                boolean1 = (Boolean)flags.a(fys.ag);
                if (flag && boolean1.booleanValue())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (flag)
                {
                    ClientEvent clientevent = new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.aA, com.spotify.mobile.android.util.ClientEvent.SubEvent.dI);
                    dmz.a(fop);
                    fop.a(context, ViewUri.aU, reason.mSubView, clientevent);
                    flag = false;
                } else
                if (frh.a(context, reason, flags))
                {
                    ClientEvent clientevent1 = new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.aA, com.spotify.mobile.android.util.ClientEvent.SubEvent.dJ);
                    dmz.a(fop);
                    fop.a(context, ViewUri.aU, reason.mSubView, clientevent1);
                    flag = false;
                } else
                {
                    flag = true;
                }
            }
            if (flag)
            {
                optional = ((DynamicUpsellConfig)optional.c()).getConfigForType(reason);
                if (optional == null || ((com.spotify.mobile.android.ui.activity.dynamicupsell.DynamicUpsellConfig.AdSlotConfiguration) (optional)).mType == com.spotify.mobile.android.ui.activity.dynamicupsell.DynamicUpsellConfig.AdSlotConfiguration.Type.EMPTY)
                {
                    optional = new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.aA, com.spotify.mobile.android.util.ClientEvent.SubEvent.dL);
                    dmz.a(fop);
                    fop.a(context, ViewUri.aU, reason.mSubView, optional);
                } else
                {
                    if (!com.spotify.mobile.android.ui.activity.dynamicupsell.DynamicUpsellConfig.AdSlotConfiguration.Type.OVERLAY.equals(((com.spotify.mobile.android.ui.activity.dynamicupsell.DynamicUpsellConfig.AdSlotConfiguration) (optional)).mType))
                    {
                        flags = new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.aA, com.spotify.mobile.android.util.ClientEvent.SubEvent.dK);
                        dmz.a(fop);
                        fop.a(context, ViewUri.aU, reason.mSubView, flags);
                        return Optional.e();
                    }
                    if (((com.spotify.mobile.android.ui.activity.dynamicupsell.DynamicUpsellConfig.AdSlotConfiguration) (optional)).mShowUntil == null || System.currentTimeMillis() < ((com.spotify.mobile.android.ui.activity.dynamicupsell.DynamicUpsellConfig.AdSlotConfiguration) (optional)).mShowUntil.getTime())
                    {
                        return Optional.c(DynamicUpsellDialogActivity.a(context, reason, optional, flags));
                    }
                }
            }
        }
        if (!reason.mFallbackToLegacy)
        {
            return Optional.e();
        } else
        {
            return Optional.c(UpsellDialogActivity.a(context, reason, s, flags, s1));
        }
    }

    public static void a(Context context, ServiceConnection serviceconnection)
    {
        String s = com/spotify/mobile/android/ui/activity/upsell/UpsellService.getSimpleName();
        if (!dvk.a(context, new Intent(context, com/spotify/mobile/android/ui/activity/upsell/UpsellService), serviceconnection, s))
        {
            Assertion.b("Unable to bind to upsell service");
        }
    }

    public static void a(Context context, ShowUpsellAction showupsellaction)
    {
        String s = context.getClass().getSimpleName();
        showupsellaction = a(context.hashCode(), showupsellaction, "show_upsell", s);
        de.a(context).a(showupsellaction);
    }

    public static void a(Fragment fragment, ShowUpsellAction showupsellaction, int i)
    {
        if (!fragment.o())
        {
            Assertion.b("Fragment not added to activity");
            return;
        } else
        {
            u u1 = fragment.k();
            String s = u1.getClass().getSimpleName();
            int j = u1.hashCode();
            int k = fragment.hashCode();
            fragment = a(j, showupsellaction, "show_upsell_for_result", s);
            fragment.putExtra("show_upsell_request_code", i);
            fragment.putExtra("show_upsell_fragment_hash", k);
            de.a(u1).a(fragment);
            return;
        }
    }

    public static void a(UpsellService upsellservice, DynamicUpsellConfig dynamicupsellconfig)
    {
        upsellservice.f = dynamicupsellconfig;
    }

    public static void a(UpsellService upsellservice, ShowUpsellAction showupsellaction, int i, int j, int k, String s)
    {
        Object obj;
        obj = showupsellaction.b;
        obj = upsellservice.d.a();
        if (!upsellservice.a(i, ((Optional) (obj)), s)) goto _L2; else goto _L1
_L1:
        s = (Activity)((Optional) (obj)).c();
        upsellservice = a(((Context) (s)), showupsellaction.a, showupsellaction.b, showupsellaction.c, showupsellaction.d, Optional.c(upsellservice.f));
        if (!upsellservice.b()) goto _L2; else goto _L3
_L3:
        upsellservice = (Intent)upsellservice.c();
        if (k != 0) goto _L5; else goto _L4
_L4:
        s.startActivityForResult(upsellservice, j);
_L2:
        return;
_L5:
        if (!(s instanceof u))
        {
            Assertion.b("Show upsell invocation from fragment not contained in FragmentActivity");
            return;
        }
        showupsellaction = ((u)s).a_().f().iterator();
        do
        {
            if (!showupsellaction.hasNext())
            {
                continue; /* Loop/switch isn't completed */
            }
            s = (Fragment)showupsellaction.next();
        } while (s.hashCode() != k);
        break; /* Loop/switch isn't completed */
        if (true) goto _L2; else goto _L6
_L6:
        s.a(upsellservice, j);
        return;
    }

    public static void a(UpsellService upsellservice, ShowUpsellAction showupsellaction, int i, String s)
    {
        Object obj = showupsellaction.b;
        obj = upsellservice.d.a();
        if (upsellservice.a(i, ((Optional) (obj)), s))
        {
            upsellservice = a((Context)((Optional) (obj)).c(), showupsellaction.a, showupsellaction.b, showupsellaction.c, showupsellaction.d, Optional.c(upsellservice.f));
            if (upsellservice.b())
            {
                ((Activity)((Optional) (obj)).c()).startActivity((Intent)upsellservice.c());
            }
        }
    }

    private boolean a(int i, Optional optional, String s)
    {
        long l = gcf.a();
        boolean flag;
        if (h.b())
        {
            if (Math.abs(l - ((Long)h.c()).longValue()) < a)
            {
                flag = true;
            } else
            {
                flag = false;
            }
        } else
        {
            flag = false;
        }
        if (flag)
        {
            Logger.a("(upsell) Throttling show upsell request.", new Object[0]);
            return false;
        }
        if (!optional.b())
        {
            Assertion.b(String.format("Unable to show upsell, no active activity. Request source (%s)", new Object[] {
                s
            }));
            return false;
        }
        optional = (Activity)optional.c();
        if (optional.hashCode() != i)
        {
            Assertion.b(String.format(Locale.US, "Unable to show upsell, current activity (%s, %s) but request was initiated by activity (%s, %s)", new Object[] {
                String.valueOf(optional.hashCode()), optional.getClass().getSimpleName(), String.valueOf(i), s
            }));
            return false;
        } else
        {
            h = Optional.b(Long.valueOf(l));
            return true;
        }
    }

    public static void b(Context context, ServiceConnection serviceconnection)
    {
        dvk.a(context, serviceconnection, com/spotify/mobile/android/ui/activity/upsell/UpsellService.getSimpleName());
    }

    public IBinder onBind(Intent intent)
    {
        return c;
    }

    public void onCreate()
    {
        super.onCreate();
        DynamicUpsellDataStoreControlService.a(this, g);
        e = de.a(this);
        DynamicUpsellDataStoreControlService.a(e, b);
        IntentFilter intentfilter = new IntentFilter("show_upsell");
        intentfilter.addAction("show_upsell_for_result");
        e.a(b, intentfilter);
    }

    public void onDestroy()
    {
        super.onDestroy();
        e.a(b);
        DynamicUpsellDataStoreControlService.b(this, g);
    }

    static 
    {
        a = TimeUnit.SECONDS.toMillis(1L);
    }
}
