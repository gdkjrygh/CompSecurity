// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.fbwebrtc;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Handler;
import android.os.Vibrator;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import com.facebook.c.s;
import com.facebook.common.time.a;
import com.facebook.common.w.m;
import com.facebook.debug.log.b;
import com.facebook.mqtt.x;
import com.facebook.n;
import com.facebook.o;
import com.facebook.orca.prefs.f;
import com.facebook.prefs.shared.d;
import com.facebook.prefs.shared.e;
import com.facebook.push.mqtt.v;
import com.facebook.webrtc.IWebrtcUiInterface;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.facebook.orca.fbwebrtc:
//            bi, bc, ay, bj, 
//            bk, bl, bm, ax, 
//            WebrtcIncallActivity, ag, a, bo, 
//            bf, bn, be, bh, 
//            bq, bp, bd, bg

public class bb
    implements IWebrtcUiInterface
{

    private static final Class a = com/facebook/orca/fbwebrtc/bb;
    private static final long b[] = {
        0L, 800L, 1838L
    };
    private int A;
    private int B;
    private boolean C;
    private long D;
    private long E;
    private long F;
    private int G;
    private final Runnable H = new bi(this);
    private final Context c;
    private final s d;
    private final ax e;
    private final v f;
    private final d g;
    private final com.facebook.orca.fbwebrtc.a h;
    private final AudioManager i;
    private final TelephonyManager j;
    private final PhoneStateListener k = new bc(this);
    private final Executor l;
    private final ScheduledExecutorService m;
    private final a n;
    private final com.facebook.common.executors.a o;
    private final android.support.v4.a.e p;
    private final Handler q;
    private ag r;
    private MediaPlayer s;
    private android.media.AudioManager.OnAudioFocusChangeListener t;
    private Vibrator u;
    private IWebrtcUiInterface v;
    private boolean w;
    private long x;
    private int y;
    private boolean z;

    public bb(Context context, s s1, ax ax1, v v1, d d1, com.facebook.orca.fbwebrtc.a a1, AudioManager audiomanager, 
            Vibrator vibrator, TelephonyManager telephonymanager, Executor executor, ScheduledExecutorService scheduledexecutorservice, a a2, com.facebook.common.executors.a a3, android.support.v4.a.e e1, 
            Handler handler)
    {
        c = context;
        d = s1;
        e = ax1;
        f = v1;
        g = d1;
        h = a1;
        i = audiomanager;
        u = vibrator;
        j = telephonymanager;
        l = executor;
        m = scheduledexecutorservice;
        n = a2;
        o = a3;
        p = e1;
        q = handler;
        y = 0;
    }

    static AudioManager a(bb bb1)
    {
        return bb1.i;
    }

    private void a(int i1)
    {
        if (l() == i1)
        {
            return;
        } else
        {
            g.b().a(com.facebook.orca.fbwebrtc.ay.b, i1).a();
            return;
        }
    }

    private void a(int i1, int j1)
    {
        t = new bj(this);
        i1 = i.requestAudioFocus(t, i1, j1);
        if (i1 != 1)
        {
            com.facebook.debug.log.b.d(a, "Failed to get audio focus. res = %d", new Object[] {
                Integer.valueOf(i1)
            });
            t = null;
        }
    }

    private void a(int i1, int j1, boolean flag)
    {
        n();
        a(j1, 2);
        Object obj = c.getResources();
        obj = (new android.net.Uri.Builder()).scheme("android.resource").authority(((Resources) (obj)).getResourcePackageName(i1)).appendPath(((Resources) (obj)).getResourceTypeName(i1)).appendPath(((Resources) (obj)).getResourceEntryName(i1)).build();
        s = new MediaPlayer();
        s.setAudioStreamType(j1);
        s.setLooping(flag);
        s.setOnErrorListener(new bk(this));
        s.setOnCompletionListener(new bl(this));
        s.setOnPreparedListener(new bm(this));
        try
        {
            s.setDataSource(c, ((android.net.Uri) (obj)));
        }
        catch (IOException ioexception)
        {
            com.facebook.debug.log.b.d(a, "Failed to play ringtone", ioexception);
            n();
            return;
        }
        s.prepareAsync();
    }

    private void a(int i1, long l1, boolean flag)
    {
        com.facebook.debug.log.b.c(a, "HideCallUI call_id=%d: %d", new Object[] {
            Long.valueOf(l1), Integer.valueOf(i1)
        });
        p();
        e.a();
        m();
        s();
        j.listen(k, 0);
        a(i.getStreamVolume(0));
        i.setMode(A);
        i.setStreamVolume(0, B, 0);
        y = 0;
        G = i1;
        F = n.a();
        y();
        if (d() > 0L)
        {
            a(n.end_call, 0, false);
        }
        if (z)
        {
            a(l1);
        }
        if (v != null)
        {
            v.hideCallUI(i1, l1, flag);
        }
    }

    static void a(bb bb1, int i1, long l1, boolean flag)
    {
        bb1.a(i1, l1, flag);
    }

    static void a(bb bb1, long l1)
    {
        bb1.b(l1);
    }

    static void a(bb bb1, boolean flag, long l1)
    {
        bb1.a(flag, l1);
    }

    static void a(bb bb1, boolean flag, String s1)
    {
        bb1.a(flag, s1);
    }

    private void a(boolean flag, long l1)
    {
        Class class1 = a;
        Object obj;
        if (flag)
        {
            obj = "Outgoing";
        } else
        {
            obj = "Incoming";
        }
        com.facebook.debug.log.b.c(class1, "%s call failed because peer_id=%d has an outdated version.", new Object[] {
            obj, Long.valueOf(l1)
        });
        if (!flag)
        {
            obj = new Intent(c, com/facebook/orca/fbwebrtc/WebrtcIncallActivity);
            ((Intent) (obj)).setAction("com.facebook.orca.fbwebrtc.intent.action.UPGRADE_ALERT");
            ((Intent) (obj)).addFlags(0x10000000);
            ((Intent) (obj)).putExtra("CONTACT_ID", l1);
            d.a(((Intent) (obj)), c);
        } else
        if (v != null)
        {
            v.showOutdatedProtocolAlert(flag, l1);
            return;
        }
    }

    private void a(boolean flag, String s1)
    {
        if (flag && E == 0L)
        {
            E = n.a();
            if (g())
            {
                n();
                a(0, 1);
                t();
            }
        }
        C = flag;
        Class class1 = a;
        Object obj;
        if (flag)
        {
            obj = "true";
        } else
        {
            obj = "false";
        }
        com.facebook.debug.log.b.c(class1, "ShowConnectionDetails connected=%s", new Object[] {
            obj
        });
        com.facebook.debug.log.b.a(a, s1);
        obj = v;
        if (v != null)
        {
            v.showConnectionDetails(flag, s1);
        }
    }

    private boolean a(long l1)
    {
        ObjectNode objectnode = new ObjectNode(JsonNodeFactory.instance);
        objectnode.put("event_name", "call_record");
        objectnode.put("msg_id", com.facebook.common.w.m.a("%d:%d", new Object[] {
            Long.valueOf(n.a()), Long.valueOf(l1)
        }));
        objectnode.put("call_id", l1);
        objectnode.put("to", Long.toString(x));
        objectnode.put("call_start_time", D);
        ObjectNode objectnode1;
        if (d() > 0L)
        {
            objectnode.put("call_type", 2);
            objectnode.put("call_duration", n.a() - D);
        } else
        {
            objectnode.put("call_type", 3);
            objectnode.put("call_duration", 0);
        }
        objectnode1 = new ObjectNode(JsonNodeFactory.instance);
        objectnode1.put("payload", objectnode.toString());
        return f.a("/send_chat_event", objectnode1, x.FIRE_AND_FORGET) != -1;
    }

    static boolean a(bb bb1, boolean flag)
    {
        bb1.w = flag;
        return flag;
    }

    static ag b(bb bb1)
    {
        return bb1.r;
    }

    private void b(long l1)
    {
        com.facebook.debug.log.b.c(a, "SwitchToIncomingCallUI");
        if (j.getCallState() != 0)
        {
            r.a(com.facebook.webrtc.a.CallEndInAnotherCall);
            return;
        }
        a(l1, false);
        y = 2;
        o();
        x();
        int i1 = i.getRingerMode();
        if (i1 == 2)
        {
            a(n.incoming_7a, 2, true);
        }
        if (i1 == 2 || i1 == 1)
        {
            q();
        }
        Intent intent = new Intent(c, com/facebook/orca/fbwebrtc/WebrtcIncallActivity);
        intent.setAction("com.facebook.orca.fbwebrtc.intent.action.INCOMING_CALL");
        intent.addFlags(0x10000000);
        intent.putExtra("CONTACT_ID", l1);
        d.a(intent, c);
    }

    static void b(bb bb1, boolean flag)
    {
        bb1.b(flag);
    }

    private void b(boolean flag)
    {
        Class class1 = a;
        Object obj;
        if (flag)
        {
            obj = "muted";
        } else
        {
            obj = "normal";
        }
        com.facebook.debug.log.b.c(class1, "Mute state is changed to %s", new Object[] {
            obj
        });
        obj = v;
        if (v != null)
        {
            v.updateMuteState(flag);
        }
    }

    static MediaPlayer c(bb bb1)
    {
        return bb1.s;
    }

    static void d(bb bb1)
    {
        bb1.n();
    }

    static int e(bb bb1)
    {
        return bb1.y;
    }

    static void f(bb bb1)
    {
        bb1.p();
    }

    static IWebrtcUiInterface g(bb bb1)
    {
        return bb1.v;
    }

    static void h(bb bb1)
    {
        bb1.u();
    }

    static void i(bb bb1)
    {
        bb1.v();
    }

    static Runnable j(bb bb1)
    {
        return bb1.H;
    }

    static Handler k(bb bb1)
    {
        return bb1.q;
    }

    private int l()
    {
        int k1 = g.a(com.facebook.orca.fbwebrtc.ay.b, 0);
        int j1 = i.getStreamMaxVolume(0);
        int i1 = k1;
        if (k1 <= 0)
        {
            i1 = j1;
        }
        if (i1 > j1)
        {
            return j1;
        } else
        {
            return i1;
        }
    }

    static void l(bb bb1)
    {
        bb1.w();
    }

    private void m()
    {
        if (t != null)
        {
            i.abandonAudioFocus(t);
            t = null;
        }
    }

    private void n()
    {
        m();
        if (s != null)
        {
            s.reset();
            s.release();
            s = null;
        }
    }

    private void o()
    {
        h.e();
        h.a();
        h.c();
    }

    private void p()
    {
        h.f();
        h.b();
        h.d();
    }

    private void q()
    {
        u.vibrate(b, 0);
    }

    private void r()
    {
        u.cancel();
    }

    private void s()
    {
        n();
        r();
    }

    private void t()
    {
        int i1 = Integer.valueOf(g.a(f.b, "-1")).intValue();
        if (i1 >= 0)
        {
            i.setMode(i1);
        } else
        {
            if (android.os.Build.VERSION.SDK_INT < 11)
            {
                i.setMode(2);
                return;
            }
            i.setMode(3);
            if (i.getMode() != 3)
            {
                i.setMode(2);
                return;
            }
        }
    }

    private void u()
    {
        com.facebook.debug.log.b.c(a, "SwitchToRingingUI");
        o();
        x();
        a(n.outgoing_09, 0, true);
        if (v != null)
        {
            v.switchToRingingUI();
        }
    }

    private void v()
    {
        com.facebook.debug.log.b.c(a, "SwitchToStreamingUI");
        IWebrtcUiInterface iwebrtcuiinterface;
        if (g())
        {
            r();
        } else
        {
            s();
            a(0, 1);
            t();
        }
        y = 3;
        j.listen(k, 32);
        iwebrtcuiinterface = v;
        if (v != null)
        {
            v.switchToStreamingUI();
        }
    }

    private void w()
    {
        Intent intent = new Intent();
        intent.setAction("com.facebook.orca.fbwebrtc.CALL_STATUS_AND_DURATION_UPDATE");
        p.a(intent);
    }

    private void x()
    {
        q.post(H);
    }

    private void y()
    {
        q.removeCallbacks(H);
        w();
    }

    public long a()
    {
        return x;
    }

    public void a(long l1, boolean flag)
    {
        x = l1;
        y = 1;
        z = flag;
        C = false;
        D = n.a();
        E = 0L;
        F = 0L;
        G = 0;
        A = i.getMode();
        B = i.getStreamVolume(0);
        i.setStreamVolume(0, l(), 0);
        i.setSpeakerphoneOn(false);
        i.setMicrophoneMute(false);
    }

    public void a(ag ag1)
    {
        r = ag1;
    }

    void a(IWebrtcUiInterface iwebrtcuiinterface)
    {
        o.a();
        v = iwebrtcuiinterface;
    }

    void a(boolean flag)
    {
label0:
        {
            int i1 = Integer.valueOf(g.a(f.c, "-1")).intValue();
            if (i1 >= 0)
            {
                if (!flag)
                {
                    break label0;
                }
                i.setMode(i1);
            }
            return;
        }
        t();
    }

    boolean b()
    {
        return y != 0 || w;
    }

    public int c()
    {
        return y;
    }

    public long d()
    {
        return E;
    }

    public long e()
    {
        long l1;
        if (h())
        {
            if ((l1 = n.a() - E) >= 0L)
            {
                return l1;
            }
        }
        return 0L;
    }

    public String f()
    {
        long l1 = e() / 1000L;
        if (l1 < 3600L)
        {
            return c.getString(o.webrtc_incall_connection_duration_short, new Object[] {
                Long.valueOf(l1 / 60L), Long.valueOf(l1 % 60L)
            });
        } else
        {
            return c.getString(o.webrtc_incall_connection_duration_long, new Object[] {
                Long.valueOf(l1 / 3600L), Long.valueOf((l1 % 3600L) / 60L), Long.valueOf(l1 % 60L)
            });
        }
    }

    public boolean g()
    {
        return z;
    }

    public boolean h()
    {
        return y == 3 && E > 0L;
    }

    public void handleError(int i1)
    {
        com.facebook.debug.log.b.d(a, "Handle error=%d", new Object[] {
            Integer.valueOf(i1)
        });
        s();
        IWebrtcUiInterface iwebrtcuiinterface = v;
        if (v != null)
        {
            l.execute(new bo(this, i1));
        }
    }

    public void hideCallUI(int i1, long l1, boolean flag)
    {
        l.execute(new bf(this, i1, l1, flag));
    }

    public boolean i()
    {
        return d() > 0L;
    }

    void j()
    {
        if (y != 0)
        {
            return;
        } else
        {
            h.e();
            h.c();
            w = true;
            m.schedule(new bn(this), 4000L, TimeUnit.MILLISECONDS);
            return;
        }
    }

    public void k()
    {
        hideCallUI(com.facebook.webrtc.a.CallEndHangupCall.ordinal(), 0L, false);
        x = 0L;
        z = false;
        C = false;
        D = 0L;
        E = 0L;
        F = 0L;
        G = 0;
    }

    public void showConnectionDetails(boolean flag, String s1)
    {
        l.execute(new be(this, flag, s1));
    }

    public void showOutdatedProtocolAlert(boolean flag, long l1)
    {
        l.execute(new bh(this, flag, l1));
    }

    public void switchToIncomingCallUI(long l1)
    {
        l.execute(new bq(this, l1));
    }

    public void switchToRingingUI()
    {
        l.execute(new bp(this));
    }

    public void switchToStreamingUI()
    {
        l.execute(new bd(this));
    }

    public void updateMuteState(boolean flag)
    {
        l.execute(new bg(this, flag));
    }

}
