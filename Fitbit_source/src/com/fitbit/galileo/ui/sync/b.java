// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.galileo.ui.sync;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.content.LocalBroadcastManager;
import com.fitbit.FitBitApplication;
import com.fitbit.bluetooth.g;
import com.fitbit.bluetooth.support.BluetoothSupportStatus;
import com.fitbit.data.domain.device.Device;
import com.fitbit.data.domain.device.DeviceFeature;
import com.fitbit.data.domain.device.DeviceType;
import com.fitbit.data.domain.device.DeviceVersion;
import com.fitbit.e.a;
import com.fitbit.galileo.a.e;
import com.fitbit.galileo.service.GalileoServicesStateListener;
import com.fitbit.home.ui.i;
import com.fitbit.livedata.LiveDataState;
import com.fitbit.savedstate.ServerSavedState;
import com.fitbit.savedstate.TrackerSyncPreferencesSavedState;
import com.fitbit.savedstate.s;
import com.fitbit.serverinteraction.ServerGateway;
import com.fitbit.serverinteraction.restrictions.RestrictionInfo;
import com.fitbit.serverinteraction.restrictions.RestrictionsController;
import com.fitbit.util.ar;
import com.fitbit.util.bh;
import com.fitbit.util.p;
import com.fitbit.util.threading.c;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.fitbit.galileo.ui.sync:
//            c, SyncUICase, a

public class com.fitbit.galileo.ui.sync.b
    implements com.fitbit.serverinteraction.restrictions.RestrictionsController.PresenceListener, com.fitbit.util.ar.a
{
    public static interface a
    {

        public abstract void a(SyncUICase syncuicase, com.fitbit.galileo.ui.sync.a a1);

        public abstract void a(String s1, SyncUICase syncuicase, com.fitbit.galileo.ui.sync.a a1);

        public abstract void b(SyncUICase syncuicase, com.fitbit.galileo.ui.sync.a a1);

        public abstract void b(String s1, SyncUICase syncuicase, com.fitbit.galileo.ui.sync.a a1);
    }

    private class b
    {

        public final boolean a;
        public final com.fitbit.serverinteraction.restrictions.RestrictionsController.PresenceListener.OfflineReason b = ServerGateway.a().b().a();
        public final RestrictionInfo c = ServerGateway.a().b().c();
        public final boolean d = com.fitbit.bluetooth.g.g();
        public final boolean e;
        public final BluetoothSupportStatus f = com.fitbit.bluetooth.support.a.a().b();
        public final boolean g = TrackerSyncPreferencesSavedState.D();
        public final boolean h = TrackerSyncPreferencesSavedState.x();
        public final boolean i = ServerSavedState.k();
        public final LiveDataState j = com.fitbit.multipledevice.a.a().j();
        public final com.fitbit.galileo.service.GalileoServicesStateListener.GalileoState k;
        public final Set l;
        public final String m;
        public final com.fitbit.serverinteraction.SynclairApi.SyncTrigger n;
        public final List o;
        final com.fitbit.galileo.ui.sync.b p;

        public b(List list)
        {
            p = com.fitbit.galileo.ui.sync.b.this;
            super();
            boolean flag;
            if (!ServerGateway.a().d())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            a = flag;
            e = ar.c(com.fitbit.galileo.ui.sync.b.this.b);
            k = com.fitbit.galileo.ui.sync.b.this.c.c();
            l = com.fitbit.galileo.ui.sync.b.this.c.h();
            m = com.fitbit.galileo.ui.sync.b.this.c.j();
            n = com.fitbit.galileo.ui.sync.b.this.c.e();
            o = list;
        }
    }

    private static class c
    {

        public final Set a;
        public SyncUICase b;
        public com.fitbit.galileo.ui.sync.a c;

        private c()
        {
            a = new HashSet();
            b = SyncUICase.u;
            c = com.fitbit.galileo.ui.sync.a.a;
        }

    }


    public static final String a = "com.fitbit.galileo.ui.sync.SyncUIModel.SHOW_RESTART_BT_REQUEST";
    private static final String d = "SyncUIModel";
    protected Context b;
    protected GalileoServicesStateListener c;
    private final Handler e = new Handler(Looper.getMainLooper());
    private final i f = new i();
    private final Map g = new HashMap();
    private final Set h = new HashSet();
    private final Runnable i = new Runnable() {

        final com.fitbit.galileo.ui.sync.b a;

        public void run()
        {
            if (!com.fitbit.galileo.ui.sync.b.a(a).isEmpty())
            {
                a.f();
                com.fitbit.galileo.ui.sync.b.b(a);
            }
        }

            
            {
                a = com.fitbit.galileo.ui.sync.b.this;
                super();
            }
    };
    private final Runnable j = new Runnable() {

        final com.fitbit.galileo.ui.sync.b a;

        public void run()
        {
            a.f();
        }

            
            {
                a = com.fitbit.galileo.ui.sync.b.this;
                super();
            }
    };
    private final BroadcastReceiver k = new BroadcastReceiver() {

        final com.fitbit.galileo.ui.sync.b a;

        public void onReceive(Context context, Intent intent)
        {
            context = intent.getAction();
            if (context != null && ("android.bluetooth.adapter.action.STATE_CHANGED".equals(context) || "android.net.conn.CONNECTIVITY_CHANGE".equals(context)))
            {
                com.fitbit.galileo.ui.sync.b.d(a).post(com.fitbit.galileo.ui.sync.b.c(a));
            }
        }

            
            {
                a = com.fitbit.galileo.ui.sync.b.this;
                super();
            }
    };
    private final com.fitbit.util.threading.c l = new com.fitbit.util.threading.c() {

        final com.fitbit.galileo.ui.sync.b a;

        public void a(Intent intent)
        {
            if ("com.fitbit.ApplicationForegroundController.APP_PROBABLY_SWITCHED_TO_BACKGROUND".equals(intent.getAction()))
            {
                com.fitbit.galileo.ui.sync.b.a(a, com.fitbit.galileo.ui.sync.SyncUICase.i, true);
            }
        }

            
            {
                a = com.fitbit.galileo.ui.sync.b.this;
                super();
            }
    };
    private final BroadcastReceiver m = new BroadcastReceiver() {

        final com.fitbit.galileo.ui.sync.b a;

        public void onReceive(Context context, Intent intent)
        {
            if ("com.fitbit.galileo.GALILEO_SYNC_SERVICE_STATE_CHANGED".equals(intent.getAction()))
            {
                com.fitbit.galileo.ui.sync.b.a(a, intent.getBooleanExtra("com.fitbit.galileo.ui.sync.SyncUIModel.SHOW_RESTART_BT_REQUEST", false));
                com.fitbit.galileo.ui.sync.b.e(a);
                return;
            }
            if (a.c.c() == com.fitbit.galileo.service.GalileoServicesStateListener.GalileoState.a)
            {
                com.fitbit.galileo.ui.sync.b.e(a);
                return;
            } else
            {
                a.f();
                return;
            }
        }

            
            {
                a = com.fitbit.galileo.ui.sync.b.this;
                super();
            }
    };
    private ar n;
    private boolean o;
    private boolean p;
    private boolean q;

    protected com.fitbit.galileo.ui.sync.b()
    {
        g.put(null, new c());
    }

    public static com.fitbit.galileo.ui.sync.c a(Context context)
    {
        return com.fitbit.galileo.ui.sync.c.b(context);
    }

    private String a(Device device)
    {
        if (device == null)
        {
            return "";
        } else
        {
            return f.a(device.e(), b, 0x7f080157);
        }
    }

    static Set a(com.fitbit.galileo.ui.sync.b b1)
    {
        return b1.h;
    }

    private void a(SyncUICase syncuicase, boolean flag)
    {
        boolean flag1 = false;
        this;
        JVM INSTR monitorenter ;
        Iterator iterator;
        com.fitbit.e.a.a("SyncUIModel", "skipCaseForAll(): %s", new Object[] {
            syncuicase
        });
        iterator = (new HashSet(g.values())).iterator();
_L1:
        c c1;
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_94;
            }
            c1 = (c)iterator.next();
        } while (c1.a.contains(syncuicase));
        c1.a.add(syncuicase);
        flag1 = true;
          goto _L1
        if (!flag || !flag1)
        {
            break MISSING_BLOCK_LABEL_107;
        }
        f();
        this;
        JVM INSTR monitorexit ;
        return;
        syncuicase;
        throw syncuicase;
    }

    private void a(b b1, Device device)
    {
        boolean flag1 = true;
        this;
        JVM INSTR monitorenter ;
        String s1;
        boolean flag2;
        flag2 = b1.j.a();
        s1 = a(device);
        if (device == null) goto _L2; else goto _L1
_L1:
        String s2 = device.c();
_L7:
        CharSequence charsequence;
        StringBuilder stringbuilder;
        charsequence = com.fitbit.bluetooth.support.b.b(FitBitApplication.a(), b1.f);
        stringbuilder = new StringBuilder();
        if (device == null)
        {
            break MISSING_BLOCK_LABEL_123;
        }
        Object obj = com.fitbit.util.p.a(com.fitbit.util.p.a(b1.o, DeviceType.TRACKER), device);
        if (!((List) (obj)).isEmpty())
        {
            obj = (new com.fitbit.util.format.b(b)).a(((List) (obj)));
            stringbuilder.append(bh.a(b, 0x7f080159, new String[] {
                obj
            }));
        }
        if (!b1.a || b1.b != com.fitbit.serverinteraction.restrictions.RestrictionsController.PresenceListener.OfflineReason.d || b1.c == null || !b1.c.a()) goto _L4; else goto _L3
_L3:
        if (!flag2) goto _L6; else goto _L5
_L5:
        device = b.getString(0x7f0802d2);
_L8:
        a.a a1 = new a.a();
        a1.a(s1).b(b1.c.d()).c(device).a(flag2).d(b1.c.d()).f(charsequence).e(stringbuilder.toString());
        b1 = a1.a();
        a(s2, SyncUICase.d, ((com.fitbit.galileo.ui.sync.a) (b1)));
_L11:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        s2 = null;
          goto _L7
_L6:
        device = s1;
          goto _L8
_L4:
        if (b1.e)
        {
            break MISSING_BLOCK_LABEL_398;
        }
        if (!flag2) goto _L10; else goto _L9
_L9:
        b1 = b.getString(0x7f0802d2);
_L12:
        if (!flag2)
        {
            break MISSING_BLOCK_LABEL_384;
        }
        device = b.getString(0x7f0802d1);
_L13:
        a.a a2 = new a.a();
        a2.a(s1).b(b.getString(0x7f08053d)).c(b1).a(flag2).d(device).f(charsequence).e(stringbuilder.toString());
        b1 = a2.a();
        a(s2, com.fitbit.galileo.ui.sync.SyncUICase.e, ((com.fitbit.galileo.ui.sync.a) (b1)));
          goto _L11
        b1;
        throw b1;
_L10:
        b1 = s1;
          goto _L12
        device = b.getString(0x7f08053d);
          goto _L13
        if (!b1.a || b1.b != com.fitbit.serverinteraction.restrictions.RestrictionsController.PresenceListener.OfflineReason.d || b1.c == null || !b1.c.b()) goto _L15; else goto _L14
_L14:
        if (!flag2) goto _L17; else goto _L16
_L16:
        device = b.getString(0x7f0802d2);
_L166:
        a.a a3 = new a.a();
        a3.a(s1).b(b1.c.d()).c(device).a(flag2).d(b1.c.d()).f(charsequence).e(stringbuilder.toString());
        b1 = a3.a();
        a(s2, com.fitbit.galileo.ui.sync.SyncUICase.g, ((com.fitbit.galileo.ui.sync.a) (b1)));
          goto _L11
_L15:
        Object obj1 = com.fitbit.bluetooth.support.b.a(FitBitApplication.a(), b1.f);
        if (b1.f == null || obj1 == null)
        {
            break MISSING_BLOCK_LABEL_626;
        }
        if (b1.f.a() != com.fitbit.bluetooth.support.BluetoothSupportStatus.SupportLevel.b)
        {
            break MISSING_BLOCK_LABEL_626;
        }
        b1 = new a.a();
        b1.a(s1).b(((CharSequence) (obj1))).c(s1).a(flag2).d(((CharSequence) (obj1))).f(charsequence).e(stringbuilder.toString());
        b1 = b1.a();
        a(s2, SyncUICase.r, ((com.fitbit.galileo.ui.sync.a) (b1)));
          goto _L11
        if (a(((String) (null)), com.fitbit.galileo.ui.sync.SyncUICase.i) || b1.d || device == null)
        {
            break MISSING_BLOCK_LABEL_738;
        }
        if (!device.a(DeviceFeature.WIRELESS_SYNC))
        {
            break MISSING_BLOCK_LABEL_738;
        }
        b1 = new a.a();
        b1.a(s1).b(b.getString(0x7f0802ba)).c(s1).a(flag2).d(b.getString(0x7f0802ba)).f(charsequence).e(stringbuilder.toString());
        b1 = b1.a();
        a(s2, com.fitbit.galileo.ui.sync.SyncUICase.i, ((com.fitbit.galileo.ui.sync.a) (b1)));
          goto _L11
        if (b1.g && b1.h) goto _L19; else goto _L18
_L18:
        if (!flag2) goto _L21; else goto _L20
_L20:
        device = b.getString(0x7f0802d2);
_L167:
        if (!flag2)
        {
            break MISSING_BLOCK_LABEL_867;
        }
        obj1 = b.getString(0x7f080304);
_L22:
        a.a a4 = new a.a();
        a4.a(s1).b(b.getString(0x7f08018e)).c(device).a(flag2).d(((CharSequence) (obj1))).f(charsequence).e(stringbuilder.toString());
        device = a4.a();
        if (b1.g)
        {
            break MISSING_BLOCK_LABEL_882;
        }
        a(s2, SyncUICase.j, ((com.fitbit.galileo.ui.sync.a) (device)));
          goto _L11
        obj1 = b.getString(0x7f08018e);
          goto _L22
        a(s2, SyncUICase.k, ((com.fitbit.galileo.ui.sync.a) (device)));
          goto _L11
_L19:
        if (!b1.i) goto _L24; else goto _L23
_L23:
        if (b1.b == null) goto _L26; else goto _L25
_L25:
        b1 = b1.b.a(b, ServerGateway.a().b());
_L31:
        if (!flag2) goto _L28; else goto _L27
_L27:
        device = b.getString(0x7f0802d2);
_L168:
        if (!flag2) goto _L30; else goto _L29
_L29:
        obj1 = b.getString(0x7f080304);
_L169:
        a.a a5 = new a.a();
        a5.a(s1).b(b1).c(device).a(flag2).d(((CharSequence) (obj1))).f(charsequence).e(stringbuilder.toString());
        b1 = a5.a();
        a(s2, SyncUICase.l, ((com.fitbit.galileo.ui.sync.a) (b1)));
          goto _L11
_L26:
        b1 = b.getString(0x7f08018e);
          goto _L31
_L24:
        if (!b1.d)
        {
            break MISSING_BLOCK_LABEL_1352;
        }
        static class _cls6
        {

            static final int a[];
            static final int b[];

            static 
            {
                b = new int[com.fitbit.bluetooth.support.BluetoothSupportStatus.SupportLevel.values().length];
                try
                {
                    b[com.fitbit.bluetooth.support.BluetoothSupportStatus.SupportLevel.d.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                a = new int[SyncUICase.values().length];
                try
                {
                    a[com.fitbit.galileo.ui.sync.SyncUICase.i.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[SyncUICase.m.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[SyncUICase.n.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[SyncUICase.o.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        Object obj2;
        boolean flag;
        if (b1.k != com.fitbit.galileo.service.GalileoServicesStateListener.GalileoState.a)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (b1.j != LiveDataState.b)
        {
            flag1 = false;
        }
        obj2 = new a.a();
        if (device != null || !flag && !flag1)
        {
            break MISSING_BLOCK_LABEL_1186;
        }
        if (com.fitbit.util.p.b(b1.o).size() <= 0)
        {
            break MISSING_BLOCK_LABEL_1352;
        }
        b1 = b.getString(0x7f08035c);
        ((a.a) (obj2)).a(b1).b("").a(flag2).c(b1).f(charsequence).e(stringbuilder.toString());
        device = ((a.a) (obj2)).a();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_1179;
        }
        b1 = com.fitbit.galileo.ui.sync.SyncUICase.a;
_L32:
        a(s2, ((SyncUICase) (b1)), ((com.fitbit.galileo.ui.sync.a) (device)));
          goto _L11
        b1 = SyncUICase.b;
          goto _L32
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_1352;
        }
        if (!b1.l.contains(s2))
        {
            break MISSING_BLOCK_LABEL_1352;
        }
        if (!s2.equals(b1.m))
        {
            break MISSING_BLOCK_LABEL_1315;
        }
        if (b1.k != com.fitbit.galileo.service.GalileoServicesStateListener.GalileoState.c || device.h() != DeviceVersion.ZIP) goto _L34; else goto _L33
_L33:
        b1 = b.getString(0x7f080341);
_L35:
        ((a.a) (obj2)).a(b1).b("").a(flag2).c(b1).f(charsequence).e(stringbuilder.toString());
_L36:
        b1 = ((a.a) (obj2)).a();
        a(s2, com.fitbit.galileo.ui.sync.SyncUICase.c, ((com.fitbit.galileo.ui.sync.a) (b1)));
          goto _L11
_L34:
        b1 = b.getString(0x7f08035c);
          goto _L35
        ((a.a) (obj2)).a(s1).b("").a(flag2).c(s1).f(charsequence).e(stringbuilder.toString());
          goto _L36
        if (device == null || s2 == null) goto _L38; else goto _L37
_L37:
        if (device.g() != DeviceType.TRACKER || device.h() == DeviceVersion.MOTIONBIT) goto _L40; else goto _L39
_L39:
        obj2 = c.a(s2);
        if (!com.fitbit.galileo.protocol.commands.AirlinkCommand.FailureType.a(((com.fitbit.galileo.protocol.commands.AirlinkCommand.FailureType) (obj2))) || a(s2, SyncUICase.m)) goto _L42; else goto _L41
_L41:
        if (!flag2) goto _L44; else goto _L43
_L43:
        b1 = b.getString(0x7f0802d2);
_L170:
        if (!flag2)
        {
            break MISSING_BLOCK_LABEL_1518;
        }
        device = b.getString(0x7f080304);
_L45:
        obj1 = new a.a();
        ((a.a) (obj1)).a(s1).b(b.getString(0x7f08018e)).c(b1).a(flag2).d(device).f(charsequence).e(stringbuilder.toString());
        b1 = ((a.a) (obj1)).a();
        a(s2, SyncUICase.m, ((com.fitbit.galileo.ui.sync.a) (b1)));
          goto _L11
        device = b.getString(0x7f08018e);
          goto _L45
_L42:
label0:
        {
            if (!com.fitbit.galileo.protocol.commands.AirlinkCommand.FailureType.b(((com.fitbit.galileo.protocol.commands.AirlinkCommand.FailureType) (obj2))) || a(s2, SyncUICase.n))
            {
                break label0;
            }
            b1 = new a.a();
            b1.a(s1).b(b.getString(0x7f080364)).c(s1).a(flag2).d(b.getString(0x7f080364)).f(charsequence).e(stringbuilder.toString());
            b1 = b1.a();
            a(s2, SyncUICase.n, ((com.fitbit.galileo.ui.sync.a) (b1)));
        }
          goto _L11
        if (a(s2, SyncUICase.o) || !com.fitbit.serverinteraction.SynclairApi.SyncTrigger.b.equals(b1.n) || !com.fitbit.bluetooth.g.f() || com.fitbit.galileo.a.e.a(device).b()) goto _L38; else goto _L46
_L46:
        if (!flag2) goto _L48; else goto _L47
_L47:
        b1 = b.getString(0x7f0802d2);
_L171:
        device = String.format(b.getString(0x7f08030c), new Object[] {
            bh.a(device.j())
        });
        obj1 = new a.a();
        ((a.a) (obj1)).a(s1).b(device).c(b1).a(flag2).d(device).f(charsequence).e(stringbuilder.toString());
        b1 = ((a.a) (obj1)).a();
        a(s2, SyncUICase.o, ((com.fitbit.galileo.ui.sync.a) (b1)));
          goto _L11
_L40:
        if (device.h() != DeviceVersion.MOTIONBIT) goto _L38; else goto _L49
_L49:
        device = s.g();
        if (device == null) goto _L38; else goto _L50
_L50:
        if (!flag2) goto _L52; else goto _L51
_L51:
        b1 = b.getString(0x7f0802d2);
_L172:
        obj1 = new a.a();
        ((a.a) (obj1)).a(s1).b(device).c(b1).a(flag2).d(device).f(charsequence).e(stringbuilder.toString());
        b1 = ((a.a) (obj1)).a();
        a(s2, com.fitbit.galileo.ui.sync.SyncUICase.p, ((com.fitbit.galileo.ui.sync.a) (b1)));
          goto _L11
_L38:
        if (b1.f == null || obj1 == null) goto _L54; else goto _L53
_L53:
        if (b1.f.a() == com.fitbit.bluetooth.support.BluetoothSupportStatus.SupportLevel.c) goto _L54; else goto _L55
_L55:
        if (b1.f.a() != com.fitbit.bluetooth.support.BluetoothSupportStatus.SupportLevel.d || !flag2) goto _L57; else goto _L56
_L56:
        device = b.getString(0x7f0802d2);
_L173:
        a.a a6 = new a.a();
        a6.a(s1).b(((CharSequence) (obj1))).c(device).a(flag2).d(((CharSequence) (obj1))).f(charsequence).e(stringbuilder.toString());
        device = a6.a();
        _cls6.b[b1.f.a().ordinal()];
        JVM INSTR tableswitch 1 1: default 2191
    //                   1 2033;
           goto _L58 _L59
_L62:
        if (true) goto _L11; else goto _L60
_L60:
_L64:
        if (true) goto _L62; else goto _L61
_L61:
_L66:
        if (true) goto _L64; else goto _L63
_L63:
_L68:
        if (true) goto _L66; else goto _L65
_L65:
_L70:
        if (true) goto _L68; else goto _L67
_L67:
_L72:
        if (true) goto _L70; else goto _L69
_L69:
_L74:
        if (true) goto _L72; else goto _L71
_L71:
_L76:
        if (true) goto _L74; else goto _L73
_L73:
_L78:
        if (true) goto _L76; else goto _L75
_L75:
_L80:
        if (true) goto _L78; else goto _L77
_L77:
_L82:
        if (true) goto _L80; else goto _L79
_L79:
_L84:
        if (true) goto _L82; else goto _L81
_L81:
_L86:
        if (true) goto _L84; else goto _L83
_L83:
_L88:
        if (true) goto _L86; else goto _L85
_L85:
_L90:
        if (true) goto _L88; else goto _L87
_L87:
_L92:
        if (true) goto _L90; else goto _L89
_L89:
_L94:
        if (true) goto _L92; else goto _L91
_L91:
_L96:
        if (true) goto _L94; else goto _L93
_L93:
_L98:
        if (true) goto _L96; else goto _L95
_L95:
_L100:
        if (true) goto _L98; else goto _L97
_L97:
_L102:
        if (true) goto _L100; else goto _L99
_L99:
_L104:
        if (true) goto _L102; else goto _L101
_L101:
_L106:
        if (true) goto _L104; else goto _L103
_L103:
_L108:
        if (true) goto _L106; else goto _L105
_L105:
_L110:
        if (true) goto _L108; else goto _L107
_L107:
_L112:
        if (true) goto _L110; else goto _L109
_L109:
_L114:
        if (true) goto _L112; else goto _L111
_L111:
_L116:
        if (true) goto _L114; else goto _L113
_L113:
_L118:
        if (true) goto _L116; else goto _L115
_L115:
_L120:
        if (true) goto _L118; else goto _L117
_L117:
_L122:
        if (true) goto _L120; else goto _L119
_L119:
_L124:
        if (true) goto _L122; else goto _L121
_L121:
_L126:
        if (true) goto _L124; else goto _L123
_L123:
_L128:
        if (true) goto _L126; else goto _L125
_L125:
_L130:
        if (true) goto _L128; else goto _L127
_L127:
_L132:
        if (true) goto _L130; else goto _L129
_L129:
_L134:
        if (true) goto _L132; else goto _L131
_L131:
_L136:
        if (true) goto _L134; else goto _L133
_L133:
_L138:
        if (true) goto _L136; else goto _L135
_L135:
_L140:
        if (true) goto _L138; else goto _L137
_L137:
_L142:
        if (true) goto _L140; else goto _L139
_L139:
_L144:
        if (true) goto _L142; else goto _L141
_L141:
_L146:
        if (true) goto _L144; else goto _L143
_L143:
_L148:
        if (true) goto _L146; else goto _L145
_L145:
_L150:
        if (true) goto _L148; else goto _L147
_L147:
_L152:
        if (true) goto _L150; else goto _L149
_L149:
_L154:
        if (true) goto _L152; else goto _L151
_L151:
_L156:
        if (true) goto _L154; else goto _L153
_L153:
_L158:
        if (true) goto _L156; else goto _L155
_L155:
_L160:
        if (true) goto _L158; else goto _L157
_L157:
_L162:
        if (true) goto _L160; else goto _L159
_L159:
_L161:
_L58:
        a(s2, SyncUICase.q, ((com.fitbit.galileo.ui.sync.a) (device)));
          goto _L11
_L59:
        a(s2, com.fitbit.galileo.ui.sync.SyncUICase.s, ((com.fitbit.galileo.ui.sync.a) (device)));
          goto _L11
_L54:
        device = new StringBuilder();
        if (!flag2) goto _L164; else goto _L163
_L163:
        b1 = b.getString(0x7f0802d2);
_L165:
        device.append(b1);
        b1 = new a.a();
        b1.a(s1).b("").a(flag2).c(device.toString()).f(charsequence).e(stringbuilder.toString());
        b1 = b1.a();
        a(s2, SyncUICase.t, ((com.fitbit.galileo.ui.sync.a) (b1)));
          goto _L11
_L164:
        b1 = s1;
          goto _L165
_L17:
        device = s1;
          goto _L166
_L21:
        device = s1;
          goto _L167
_L28:
        device = s1;
          goto _L168
_L30:
        obj1 = b1;
          goto _L169
_L44:
        b1 = s1;
          goto _L170
_L48:
        b1 = s1;
          goto _L171
_L52:
        b1 = s1;
          goto _L172
_L57:
        device = s1;
          goto _L173
    }

    static void a(com.fitbit.galileo.ui.sync.b b1, SyncUICase syncuicase, boolean flag)
    {
        b1.b(syncuicase, flag);
    }

    private void a(String s1, SyncUICase syncuicase, com.fitbit.galileo.ui.sync.a a1)
    {
        c c1 = d(s1);
        if (c1 != null)
        {
            if (!syncuicase.equals(c1.b))
            {
                c1.b = syncuicase;
                c1.c = a1;
                com.fitbit.e.a.a("SyncUIModel", "SyncUICase (%s) = %s", new Object[] {
                    s1, syncuicase
                });
                a(s1, c1);
                return;
            }
            if (!a1.equals(c1.c))
            {
                c1.c = a1;
                com.fitbit.e.a.a("SyncUIModel", "SyncUICase (%s) = %s (info changed)", new Object[] {
                    s1, syncuicase
                });
                b(s1, c1);
                return;
            }
        }
    }

    private void a(String s1, c c1)
    {
        if (c1 != null)
        {
            Iterator iterator = h.iterator();
            while (iterator.hasNext()) 
            {
                a a1 = (a)iterator.next();
                if (s1 == null)
                {
                    a1.a(c1.b, c1.c);
                } else
                {
                    a1.a(s1, c1.b, c1.c);
                }
            }
        }
    }

    static boolean a(com.fitbit.galileo.ui.sync.b b1, boolean flag)
    {
        b1.q = flag;
        return flag;
    }

    private boolean a(String s1, SyncUICase syncuicase)
    {
        s1 = d(s1);
        if (s1 != null)
        {
            return ((c) (s1)).a.contains(syncuicase);
        } else
        {
            return false;
        }
    }

    private void b(SyncUICase syncuicase, boolean flag)
    {
        boolean flag1 = false;
        this;
        JVM INSTR monitorenter ;
        Iterator iterator;
        com.fitbit.e.a.a("SyncUIModel", "unskipCaseForAll(): %s", new Object[] {
            syncuicase
        });
        iterator = (new HashSet(g.values())).iterator();
_L1:
        c c1;
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_95;
            }
            c1 = (c)iterator.next();
        } while (!c1.a.contains(syncuicase));
        c1.a.remove(syncuicase);
        flag1 = true;
          goto _L1
        if (!flag || !flag1)
        {
            break MISSING_BLOCK_LABEL_108;
        }
        f();
        this;
        JVM INSTR monitorexit ;
        return;
        syncuicase;
        throw syncuicase;
    }

    static void b(com.fitbit.galileo.ui.sync.b b1)
    {
        b1.h();
    }

    private void b(String s1, c c1)
    {
        if (c1 != null)
        {
            Iterator iterator = h.iterator();
            while (iterator.hasNext()) 
            {
                a a1 = (a)iterator.next();
                if (s1 == null)
                {
                    a1.b(c1.b, c1.c);
                } else
                {
                    a1.b(s1, c1.b, c1.c);
                }
            }
        }
    }

    static Runnable c(com.fitbit.galileo.ui.sync.b b1)
    {
        return b1.j;
    }

    static Handler d(com.fitbit.galileo.ui.sync.b b1)
    {
        return b1.e;
    }

    private c d(String s1)
    {
        return (c)g.get(s1);
    }

    static void e(com.fitbit.galileo.ui.sync.b b1)
    {
        b1.n();
    }

    private void h()
    {
        e.removeCallbacks(i);
        e.postDelayed(i, 60000L);
    }

    private void i()
    {
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addAction(com.fitbit.multipledevice.a.a);
        intentfilter.addAction("com.fitbit.galileo.GALILEO_SYNC_SERVICE_STATE_CHANGED");
        intentfilter.addAction("com.fitbit.galileo.GALILEO_SYNC_SERVICE_CURRENT_DEVICE_CHANGED");
        intentfilter.addAction("com.fitbit.FitbitMobile.BluetoothSupportStatusController.ACTION_SUPPORT_STATUS_CHANGED");
        intentfilter.addAction("com.fitbit.SavedState.SoftTrackerData.ACTION_SYNC_BACKOFF_STATE_CHANGED");
        LocalBroadcastManager.getInstance(b).registerReceiver(m, intentfilter);
        intentfilter = new IntentFilter();
        intentfilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
        intentfilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        b.registerReceiver(k, intentfilter);
    }

    private void k()
    {
        LocalBroadcastManager.getInstance(b).unregisterReceiver(m);
        b.unregisterReceiver(k);
    }

    private void l()
    {
        this;
        JVM INSTR monitorenter ;
        if (!p)
        {
            IntentFilter intentfilter = new IntentFilter();
            intentfilter.addAction("com.fitbit.ApplicationForegroundController.APP_PROBABLY_SWITCHED_TO_BACKGROUND");
            l.a(intentfilter);
            n.a(b);
            ServerGateway.a().b().b(this);
            i();
            h();
            p = true;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    private void m()
    {
        this;
        JVM INSTR monitorenter ;
        if (p)
        {
            n.b(b);
            ServerGateway.a().b().a(this);
            e.removeCallbacks(i);
            k();
            p = false;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    private void n()
    {
        this;
        JVM INSTR monitorenter ;
        com.fitbit.e.a.a("SyncUIModel", "resetSyncRelatedCases()", new Object[0]);
        c c1;
        for (Iterator iterator = (new HashSet(g.values())).iterator(); iterator.hasNext(); c1.a.remove(SyncUICase.m))
        {
            c1 = (c)iterator.next();
            c1.a.remove(com.fitbit.galileo.ui.sync.SyncUICase.i);
            c1.a.remove(SyncUICase.n);
            c1.a.remove(SyncUICase.o);
        }

        break MISSING_BLOCK_LABEL_115;
        Exception exception;
        exception;
        throw exception;
        f();
        this;
        JVM INSTR monitorexit ;
    }

    public SyncUICase a(String s1)
    {
        this;
        JVM INSTR monitorenter ;
        c c1 = d(s1);
        s1 = c1;
        if (c1 != null)
        {
            break MISSING_BLOCK_LABEL_20;
        }
        s1 = d(((String) (null)));
        s1 = ((c) (s1)).b;
        this;
        JVM INSTR monitorexit ;
        return s1;
        s1;
        throw s1;
    }

    public void a()
    {
        if (!o)
        {
            o = true;
            e.post(j);
        }
    }

    public void a(a a1)
    {
        this;
        JVM INSTR monitorenter ;
        if (a1 != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (h.add(a1) && h.size() == 1)
        {
            l();
        }
        if (true) goto _L1; else goto _L3
_L3:
        a1;
        throw a1;
    }

    public void a(com.fitbit.serverinteraction.restrictions.RestrictionsController.PresenceListener.OfflineReason offlinereason)
    {
        if (o)
        {
            o = false;
            e.post(j);
        }
    }

    public com.fitbit.galileo.ui.sync.a b(String s1)
    {
        this;
        JVM INSTR monitorenter ;
        c c1 = d(s1);
        s1 = c1;
        if (c1 != null)
        {
            break MISSING_BLOCK_LABEL_20;
        }
        s1 = d(((String) (null)));
        s1 = ((c) (s1)).c;
        this;
        JVM INSTR monitorexit ;
        return s1;
        s1;
        throw s1;
    }

    protected void b()
    {
        o = FitBitApplication.a(b).b().d();
        p = false;
        q = false;
        n = new ar(this);
    }

    public void b(a a1)
    {
        this;
        JVM INSTR monitorenter ;
        if (a1 != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (h.remove(a1) && h.isEmpty())
        {
            m();
        }
        if (true) goto _L1; else goto _L3
_L3:
        a1;
        throw a1;
    }

    public void c(String s1)
    {
        this;
        JVM INSTR monitorenter ;
        c c1 = d(s1);
        if (c1 != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        SyncUICase syncuicase = c1.b;
        if (!c1.a.contains(syncuicase))
        {
            switch (com.fitbit.galileo.ui.sync._cls6.a[syncuicase.ordinal()])
            {
            default:
                if (false)
                {
                }
                break;

            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
            case 4: // '\004'
                com.fitbit.e.a.a("SyncUIModel", "Skipped (%s) = [%s, %s, %s, %s]", new Object[] {
                    s1, com.fitbit.galileo.ui.sync.SyncUICase.i, SyncUICase.m, SyncUICase.n, SyncUICase.o
                });
                a(com.fitbit.galileo.ui.sync.SyncUICase.i, false);
                c1.a.add(SyncUICase.o);
                c.b(s1);
                f();
                break;
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
        s1;
        throw s1;
    }

    public boolean c()
    {
        return q;
    }

    public SyncUICase d()
    {
        return d(((String) (null))).b;
    }

    public com.fitbit.galileo.ui.sync.a e()
    {
        return d(((String) (null))).c;
    }

    public void f()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        Object obj1;
        obj = com.fitbit.util.p.a();
        obj1 = new HashSet(((List) (obj)).size());
        Iterator iterator = ((List) (obj)).iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Device device1 = (Device)iterator.next();
            if (device1.c() != null)
            {
                ((Set) (obj1)).add(device1.c());
            }
        } while (true);
        break MISSING_BLOCK_LABEL_75;
        obj;
        throw obj;
        Iterator iterator1 = g.entrySet().iterator();
        do
        {
            if (!iterator1.hasNext())
            {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator1.next();
            if (entry.getKey() != null && !((Set) (obj1)).contains(entry.getKey()))
            {
                iterator1.remove();
            }
        } while (true);
        obj1 = ((Set) (obj1)).iterator();
        do
        {
            if (!((Iterator) (obj1)).hasNext())
            {
                break;
            }
            String s1 = (String)((Iterator) (obj1)).next();
            if (!g.containsKey(s1))
            {
                g.put(s1, new c());
            }
        } while (true);
        b b1 = new b(((List) (obj)));
        a(b1, ((Device) (null)));
        obj = ((List) (obj)).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            Device device = (Device)((Iterator) (obj)).next();
            if (g.containsKey(device.c()))
            {
                a(b1, device);
            }
        } while (true);
        this;
        JVM INSTR monitorexit ;
    }

    public void j()
    {
        a(SyncUICase.m, true);
    }

    public void l_()
    {
    }
}
