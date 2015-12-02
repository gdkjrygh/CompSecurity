// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.fbwebrtc;

import android.app.AlertDialog;
import android.content.Intent;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.a.a.ak;
import com.a.a.q;
import com.facebook.base.activity.i;
import com.facebook.common.executors.ForUiThread;
import com.facebook.config.a.a;
import com.facebook.contacts.models.Contact;
import com.facebook.contacts.server.FetchContactParams;
import com.facebook.contacts.server.FetchContactResult;
import com.facebook.contacts.server.d;
import com.facebook.debug.log.b;
import com.facebook.fbservice.ops.k;
import com.facebook.fbservice.ops.m;
import com.facebook.fbservice.service.OperationResult;
import com.facebook.fbservice.service.s;
import com.facebook.h;
import com.facebook.inject.t;
import com.facebook.o;
import com.facebook.orca.prefs.f;
import com.facebook.user.Name;
import com.facebook.user.UserKey;
import com.facebook.user.n;
import com.facebook.widget.images.UrlImage;
import com.facebook.zero.a.c;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Iterator;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.facebook.orca.fbwebrtc:
//            s, aa, ad, u, 
//            m, bb, t, ag, 
//            q, p, r, ab, 
//            ac, ax, ae, o, 
//            v, w, x, y, 
//            z

public class WebrtcIncallActivity extends i
{

    private static final Class p = com/facebook/orca/fbwebrtc/WebrtcIncallActivity;
    private com.facebook.c.s A;
    private a B;
    private ag C;
    private ax D;
    private com.facebook.appconfig.m E;
    private com.facebook.orca.fbwebrtc.m F;
    private bb G;
    private ae H;
    private AlertDialog I;
    private com.facebook.zero.ui.o J;
    private k K;
    private com.google.common.d.a.s L;
    private View M;
    private View N;
    private UrlImage O;
    private ImageView P;
    private TextView Q;
    private TextView R;
    private View S;
    private TextView T;
    private View U;
    private TextView V;
    private Button W;
    private Button X;
    private Button Y;
    private TextView Z;
    private View aa;
    private ViewGroup ab;
    private long q;
    private AudioManager r;
    private TelephonyManager s;
    private Executor t;
    private ScheduledExecutorService u;
    private com.facebook.prefs.shared.d v;
    private boolean w;
    private ak x;
    private ObjectMapper y;
    private Future z;

    public WebrtcIncallActivity()
    {
    }

    static com.google.common.d.a.s a(WebrtcIncallActivity webrtcincallactivity, com.google.common.d.a.s s1)
    {
        webrtcincallactivity.L = s1;
        return s1;
    }

    static String a(WebrtcIncallActivity webrtcincallactivity, int i1)
    {
        return webrtcincallactivity.c(i1);
    }

    private void a(long l1)
    {
        for (int i1 = 0; i1 < ab.getChildCount(); i1++)
        {
            ((ImageButton)ab.getChildAt(i1)).setOnClickListener(new com.facebook.orca.fbwebrtc.s(this, i1, l1));
        }

    }

    private void a(FetchContactResult fetchcontactresult)
    {
        fetchcontactresult = fetchcontactresult.a();
        if (fetchcontactresult != Contact.a)
        {
            if (fetchcontactresult.getName() != null)
            {
                Q.setText(fetchcontactresult.getName().getDisplayName());
            }
            if (fetchcontactresult.getHugePictureUrl() != null)
            {
                O.setImageParams(Uri.parse(fetchcontactresult.getHugePictureUrl()));
                return;
            }
            if (fetchcontactresult.getBigPictureUrl() != null)
            {
                O.setImageParams(Uri.parse(fetchcontactresult.getBigPictureUrl()));
                return;
            }
            if (fetchcontactresult.getSmallPictureUrl() != null)
            {
                O.setImageParams(Uri.parse(fetchcontactresult.getSmallPictureUrl()));
                return;
            }
        }
    }

    private void a(OperationResult operationresult)
    {
        operationresult = (FetchContactResult)operationresult.i();
        com.facebook.debug.log.b.b(p, "Fetched contact successfully, result: %s", new Object[] {
            operationresult
        });
        a(((FetchContactResult) (operationresult)));
        if (operationresult.e() == com.facebook.fbservice.c.b.FROM_SERVER || operationresult.e() == com.facebook.fbservice.c.b.FROM_CACHE_UP_TO_DATE)
        {
            com.facebook.debug.log.b.b(p, "Contact fetched from server or cache, done.");
            return;
        } else
        {
            com.facebook.debug.log.b.c(p, "Checking server for contact data...");
            a(s.CHECK_SERVER_FOR_NEW_DATA);
            return;
        }
    }

    private void a(s s1)
    {
        if (L != null)
        {
            return;
        } else
        {
            com.facebook.debug.log.b.b(p, "Loading contact info. Freshness=%s", new Object[] {
                s1.name()
            });
            Bundle bundle = new Bundle();
            bundle.putParcelable("fetchContactParams", new FetchContactParams(s1, new UserKey(n.FACEBOOK, Long.toString(q))));
            L = K.a(d.d, bundle).a();
            com.google.common.d.a.i.a(L, new aa(this), t);
            return;
        }
    }

    static void a(WebrtcIncallActivity webrtcincallactivity)
    {
        webrtcincallactivity.o();
    }

    static void a(WebrtcIncallActivity webrtcincallactivity, long l1)
    {
        webrtcincallactivity.b(l1);
    }

    static void a(WebrtcIncallActivity webrtcincallactivity, OperationResult operationresult)
    {
        webrtcincallactivity.a(operationresult);
    }

    static void a(WebrtcIncallActivity webrtcincallactivity, String s1, ad ad1)
    {
        webrtcincallactivity.a(s1, ad1);
    }

    static void a(WebrtcIncallActivity webrtcincallactivity, String s1, boolean flag)
    {
        webrtcincallactivity.a(s1, flag);
    }

    static void a(WebrtcIncallActivity webrtcincallactivity, boolean flag)
    {
        webrtcincallactivity.c(flag);
    }

    private void a(String s1, ad ad1)
    {
        R.setText(s1);
        s1 = P;
        byte byte0;
        if (ad1 == ad.NONE)
        {
            byte0 = 8;
        } else
        {
            byte0 = 0;
        }
        s1.setVisibility(byte0);
        com.facebook.orca.fbwebrtc.u.b[ad1.ordinal()];
        JVM INSTR tableswitch 1 3: default 64
    //                   1 145
    //                   2 158
    //                   3 171;
           goto _L1 _L2 _L3 _L4
_L1:
        if (ad1 != ad.CONNECTING || x != null) goto _L6; else goto _L5
_L5:
        x = com.a.a.q.a(P, "rotation", new float[] {
            0.0F, 360F
        });
        x.c(1200L);
        x.a(null);
        x.a(-1);
        x.a();
_L8:
        return;
_L2:
        P.setBackgroundResource(h.voip_connecting);
        continue; /* Loop/switch isn't completed */
_L3:
        P.setBackgroundResource(h.voip_timer_phone);
        continue; /* Loop/switch isn't completed */
_L4:
        P.setBackgroundResource(h.transparent);
        continue; /* Loop/switch isn't completed */
_L6:
        if (ad1 == ad.CONNECTING || x == null) goto _L8; else goto _L7
_L7:
        x.c();
        x = null;
        return;
        if (true) goto _L1; else goto _L9
_L9:
    }

    private void a(String s1, boolean flag)
    {
        if (B.h() != com.facebook.config.a.b.DEVELOPMENT)
        {
            return;
        }
        StringBuilder stringbuilder;
        Iterator iterator;
        JsonNode jsonnode = y.readTree(s1);
        stringbuilder = new StringBuilder();
        iterator = jsonnode.fields();
_L1:
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_164;
        }
        java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
        stringbuilder.append((String)entry.getKey()).append(": ").append(((JsonNode)entry.getValue()).toString());
        Object obj;
        if (iterator.hasNext())
        {
            obj = "\n";
        } else
        {
            obj = "";
        }
        stringbuilder.append(((String) (obj)));
          goto _L1
        try
        {
            Z.setText(stringbuilder.toString());
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Z.setText(s1);
        }
        s1 = Z;
        if (flag)
        {
            i1 = 0xff00ff00;
        } else
        {
            i1 = 0xffff0000;
        }
        s1.setTextColor(i1);
        Z.setVisibility(0);
        return;
    }

    private void b(long l1)
    {
        while ((new Random()).nextDouble() > F.b() || !G.i()) 
        {
            return;
        }
        a(l1);
        com.a.a.q.a(aa, "alpha", new float[] {
            0.0F, 1.0F
        }).a();
        aa.setVisibility(0);
        if (z != null)
        {
            z.cancel(false);
            z = null;
        }
        z = u.schedule(new com.facebook.orca.fbwebrtc.t(this), 10000L, TimeUnit.MILLISECONDS);
    }

    private void b(Intent intent)
    {
        long l1 = c(intent);
        if (l1 != 0L) goto _L2; else goto _L1
_L1:
        finish();
_L8:
        return;
_L2:
        if (l1 != q)
        {
            Q.setText("");
            O.setImageParams((Uri)null);
            q = l1;
            a(s.DO_NOT_CHECK_SERVER);
        }
        k();
        C.i();
        if (!"com.facebook.orca.fbwebrtc.intent.action.CALL".equals(intent.getAction())) goto _L4; else goto _L3
_L3:
        com.facebook.debug.log.b.c(p, "Starting a new call");
        C.a(q);
_L6:
        int i1;
        i1 = C.b();
        if (i1 == 1)
        {
            a(getString(o.webrtc_incall_status_calling), ad.NONE);
            return;
        }
        break; /* Loop/switch isn't completed */
_L4:
        if ("com.facebook.orca.fbwebrtc.intent.action.UPGRADE_ALERT".equals(intent.getAction()))
        {
            com.facebook.debug.log.b.c(p, "Incoming call with upgrade alert");
            c(false);
        }
        if (true) goto _L6; else goto _L5
_L5:
        if (i1 != 2) goto _L8; else goto _L7
_L7:
        a(getString(o.webrtc_incall_status_incoming), ad.NONE);
        return;
    }

    static void b(WebrtcIncallActivity webrtcincallactivity)
    {
        webrtcincallactivity.p();
    }

    private void b(boolean flag)
    {
        View aview[] = new View[5];
        aview[0] = S;
        aview[1] = U;
        aview[2] = X;
        aview[3] = Y;
        aview[4] = W;
        int k1 = aview.length;
        for (int i1 = 0; i1 < k1; i1++)
        {
            aview[i1].setEnabled(flag);
        }

        aview = new View[2];
        aview[0] = T;
        aview[1] = V;
        k1 = aview.length;
        int j1 = 0;
        while (j1 < k1) 
        {
            View view = aview[j1];
            float f1;
            if (flag)
            {
                f1 = 1.0F;
            } else
            {
                f1 = 0.65F;
            }
            com.a.c.a.a(view, f1);
            j1++;
        }
    }

    static boolean b(WebrtcIncallActivity webrtcincallactivity, boolean flag)
    {
        webrtcincallactivity.w = flag;
        return flag;
    }

    private long c(Intent intent)
    {
        String s1 = intent.getAction();
        long l1 = intent.getLongExtra("CONTACT_ID", 0L);
        if (l1 == 0L)
        {
            com.facebook.debug.log.b.d(p, "Invalid CONTACT_ID in intent %s", new Object[] {
                intent.getAction()
            });
            return 0L;
        }
        if ("com.facebook.orca.fbwebrtc.intent.action.CALL".equals(s1))
        {
            if (C.e())
            {
                com.facebook.debug.log.b.d(p, "Can't start a new call when there is a call going on");
                return 0L;
            }
        } else
        if ("com.facebook.orca.fbwebrtc.intent.action.UPGRADE_ALERT".equals(s1))
        {
            if (C.d())
            {
                com.facebook.debug.log.b.d(p, "It might be that the version site var is just updated from server.");
                return 0L;
            }
        } else
        if ("com.facebook.orca.fbwebrtc.intent.action.SHOW_UI".equals(s1) || "com.facebook.orca.fbwebrtc.intent.action.INCOMING_CALL".equals(s1))
        {
            if (!C.d())
            {
                com.facebook.debug.log.b.d(p, "Call is already finished.");
                return 0L;
            }
            if (l1 != G.a())
            {
                com.facebook.debug.log.b.d(p, "Action is targeted for a different user.");
                return 0L;
            }
        } else
        {
            com.facebook.debug.log.b.d(p, "Invalid action %s", new Object[] {
                s1
            });
            return 0L;
        }
        return l1;
    }

    private String c(int i1)
    {
        if (i1 < 0 || i1 >= com.facebook.webrtc.a.values().length)
        {
            return "";
        }
        com.facebook.webrtc.a a1 = com.facebook.webrtc.a.values()[i1];
        switch (com.facebook.orca.fbwebrtc.u.a[a1.ordinal()])
        {
        default:
            return getString(o.webrtc_incall_status_call_ended);

        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
            return getString(o.webrtc_incall_status_call_ended);

        case 5: // '\005'
        case 6: // '\006'
        case 7: // '\007'
        case 8: // '\b'
        case 9: // '\t'
            if (G.g())
            {
                return getString(o.webrtc_incall_status_not_available);
            } else
            {
                return getString(o.webrtc_incall_status_call_ended);
            }

        case 10: // '\n'
        case 11: // '\013'
        case 12: // '\f'
        case 13: // '\r'
        case 14: // '\016'
        case 15: // '\017'
            return getString(o.webrtc_incall_status_call_failed);

        case 16: // '\020'
            return getString(o.webrtc_incall_status_connection_lost);

        case 17: // '\021'
            return getString(o.webrtc_incall_status_in_another_call);

        case 18: // '\022'
            return getString(o.webrtc_incall_status_carrier_blocked);

        case 19: // '\023'
            return "";
        }
    }

    static void c(WebrtcIncallActivity webrtcincallactivity)
    {
        webrtcincallactivity.q();
    }

    private void c(boolean flag)
    {
        if (I != null)
        {
            return;
        }
        a(getString(o.webrtc_incall_status_call_ended), ad.NONE);
        String s1;
        String s2;
        if (flag)
        {
            s2 = getString(o.webrtc_outgoing_upgrade_alert_title);
            s1 = getString(o.webrtc_outgoing_upgrade_alert_message);
        } else
        {
            s2 = getString(o.webrtc_incoming_upgrade_alert_title);
            s1 = getString(o.webrtc_incoming_upgrade_alert_message);
        }
        I = (new android.app.AlertDialog.Builder(this)).setTitle(s2).setMessage(s1).setPositiveButton(o.upgrade_button, new com.facebook.orca.fbwebrtc.q(this)).setNegativeButton(o.dialog_not_now, new p(this)).create();
        I.setOnDismissListener(new r(this));
        I.show();
    }

    static void d(WebrtcIncallActivity webrtcincallactivity)
    {
        webrtcincallactivity.u();
    }

    static void e(WebrtcIncallActivity webrtcincallactivity)
    {
        webrtcincallactivity.v();
    }

    static bb f(WebrtcIncallActivity webrtcincallactivity)
    {
        return webrtcincallactivity.G;
    }

    static boolean g(WebrtcIncallActivity webrtcincallactivity)
    {
        return webrtcincallactivity.w;
    }

    static void h(WebrtcIncallActivity webrtcincallactivity)
    {
        webrtcincallactivity.s();
    }

    static void i(WebrtcIncallActivity webrtcincallactivity)
    {
        webrtcincallactivity.r();
    }

    static Class j()
    {
        return p;
    }

    static void j(WebrtcIncallActivity webrtcincallactivity)
    {
        webrtcincallactivity.t();
    }

    static long k(WebrtcIncallActivity webrtcincallactivity)
    {
        return webrtcincallactivity.q;
    }

    private void k()
    {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.CLOSE_SYSTEM_DIALOGS");
        sendBroadcast(intent);
    }

    static com.facebook.appconfig.m l(WebrtcIncallActivity webrtcincallactivity)
    {
        return webrtcincallactivity.E;
    }

    private void l()
    {
        if (C.b() == 2)
        {
            N.setVisibility(8);
            M.setVisibility(0);
            return;
        } else
        {
            m();
            return;
        }
    }

    static a m(WebrtcIncallActivity webrtcincallactivity)
    {
        return webrtcincallactivity.B;
    }

    private void m()
    {
        M.setVisibility(8);
        N.setVisibility(0);
        n();
    }

    static com.facebook.c.s n(WebrtcIncallActivity webrtcincallactivity)
    {
        return webrtcincallactivity.A;
    }

    private void n()
    {
        if (r.isSpeakerphoneOn())
        {
            X.setBackgroundResource(h.voip_in_call_speaker_button_background_on);
        } else
        {
            X.setBackgroundResource(h.voip_in_call_speaker_button_background_off);
        }
        if (r.isMicrophoneMute())
        {
            Y.setBackgroundResource(h.voip_in_call_mute_button_background_on);
            return;
        } else
        {
            Y.setBackgroundResource(h.voip_in_call_mute_button_background_off);
            return;
        }
    }

    static ae o(WebrtcIncallActivity webrtcincallactivity)
    {
        return webrtcincallactivity.H;
    }

    private void o()
    {
        if (!C.d())
        {
            return;
        } else
        {
            m();
            C.h();
            return;
        }
    }

    static ViewGroup p(WebrtcIncallActivity webrtcincallactivity)
    {
        return webrtcincallactivity.ab;
    }

    private void p()
    {
        if (!C.d())
        {
            t();
            return;
        } else
        {
            a(getString(o.webrtc_incall_status_call_ended), ad.NONE);
            C.a(com.facebook.webrtc.a.CallEndIgnoreCall);
            t();
            return;
        }
    }

    private void q()
    {
        if (!C.d())
        {
            t();
            return;
        } else
        {
            C.a(com.facebook.webrtc.a.CallEndHangupCall);
            a(getString(o.webrtc_incall_status_call_ended), ad.NONE);
            t();
            return;
        }
    }

    private void r()
    {
        if (w || !G.h())
        {
            return;
        } else
        {
            w = true;
            u.schedule(new ab(this), 500L, TimeUnit.MILLISECONDS);
            return;
        }
    }

    private void s()
    {
        if (C.b() != 3)
        {
            return;
        } else
        {
            a(G.f(), ad.IN_CALL);
            r();
            return;
        }
    }

    private void t()
    {
        if (z != null || I != null)
        {
            return;
        } else
        {
            b(false);
            z = u.schedule(new ac(this), 2000L, TimeUnit.MILLISECONDS);
            return;
        }
    }

    private void u()
    {
        boolean flag;
        if (!r.isSpeakerphoneOn())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.facebook.debug.log.b.b(p, "toggle speaker state to %b", new Object[] {
            Boolean.valueOf(flag)
        });
        r.setSpeakerphoneOn(flag);
        G.a(flag);
        n();
    }

    private void v()
    {
        boolean flag;
        if (!r.isMicrophoneMute())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.facebook.debug.log.b.b(p, "toggle microphone mute state %b", new Object[] {
            Boolean.valueOf(flag)
        });
        r.setMicrophoneMute(flag);
        n();
        if (s.getCallState() != 0)
        {
            C.a(true);
            return;
        } else
        {
            C.a(flag);
            return;
        }
    }

    public void a(Intent intent)
    {
        super.a(intent);
        if (!"com.facebook.orca.fbwebrtc.intent.action.INCOMING_CALL".equals(intent.getAction()))
        {
            return;
        }
        D.a();
        b(true);
        aa.setVisibility(8);
        Z.setVisibility(8);
        if (x != null)
        {
            x.c();
            x = null;
        }
        if (z != null)
        {
            z.cancel(false);
            z = null;
        }
        b(intent);
        l();
        com.facebook.debug.log.b.b(p, "Call activity recreated");
    }

    public void b(Bundle bundle)
    {
        getWindow().setType(2006);
        getWindow().addFlags(0x280000);
        bundle = com.facebook.inject.t.a(this);
        C = (ag)bundle.a(com/facebook/orca/fbwebrtc/ag);
        D = (ax)bundle.a(com/facebook/orca/fbwebrtc/ax);
        G = (bb)bundle.a(com/facebook/orca/fbwebrtc/bb);
        H = (ae)bundle.a(com/facebook/orca/fbwebrtc/ae);
        K = (k)bundle.a(com/facebook/fbservice/ops/k);
        v = (com.facebook.prefs.shared.d)bundle.a(com/facebook/prefs/shared/d);
        r = (AudioManager)bundle.a(android/media/AudioManager);
        s = (TelephonyManager)bundle.a(android/telephony/TelephonyManager);
        t = (Executor)bundle.a(java/util/concurrent/Executor, com/facebook/common/executors/ForUiThread);
        u = (ScheduledExecutorService)bundle.a(java/util/concurrent/ScheduledExecutorService, com/facebook/common/executors/ForUiThread);
        y = (ObjectMapper)bundle.a(com/fasterxml/jackson/databind/ObjectMapper);
        A = (com.facebook.c.s)bundle.a(com/facebook/c/s);
        B = (a)bundle.a(com/facebook/config/a/a);
        E = (com.facebook.appconfig.m)bundle.a(com/facebook/appconfig/m);
        F = (com.facebook.orca.fbwebrtc.m)bundle.a(com/facebook/orca/fbwebrtc/m);
        J = (com.facebook.zero.ui.o)bundle.a(com/facebook/zero/ui/o);
        setContentView(com.facebook.k.orca_webrtc_incall);
        if (J.a(c.l))
        {
            ((ViewStub)findViewById(com.facebook.i.zero_incoming_call_buttons_stub)).inflate();
        } else
        {
            ((ViewStub)findViewById(com.facebook.i.incoming_call_buttons_stub)).inflate();
        }
        M = b(com.facebook.i.incoming_call_buttons);
        N = b(com.facebook.i.incall_buttons);
        O = (UrlImage)b(com.facebook.i.contact_photo);
        P = (ImageView)b(com.facebook.i.call_status_icon);
        Q = (TextView)b(com.facebook.i.contact_display_name);
        R = (TextView)b(com.facebook.i.call_status);
        S = b(com.facebook.i.answer_call_button);
        T = (TextView)b(com.facebook.i.answer_call_button_label);
        V = (TextView)b(com.facebook.i.decline_call_button_label);
        U = b(com.facebook.i.decline_call_button);
        W = (Button)b(com.facebook.i.end_call_button);
        X = (Button)b(com.facebook.i.incall_button_speaker);
        Y = (Button)b(com.facebook.i.incall_button_mute);
        Z = (TextView)b(com.facebook.i.debug_info_textview);
        aa = b(com.facebook.i.survey_container);
        ab = (ViewGroup)b(com.facebook.i.survey_button_row);
        S.setOnClickListener(new com.facebook.orca.fbwebrtc.o(this));
        U.setOnClickListener(new v(this));
        W.setOnClickListener(new w(this));
        X.setOnClickListener(new x(this));
        Y.setOnClickListener(new y(this));
        G.a(new z(this));
        b(getIntent());
        com.facebook.debug.log.b.b(p, "Call activity created");
    }

    public void onDestroy()
    {
        super.onDestroy();
        if (G != null)
        {
            G.a(null);
        }
        if (L != null)
        {
            L.cancel(false);
            L = null;
        }
        com.facebook.debug.log.b.b(p, "Call activity destroyed");
    }

    public boolean onKeyDown(int i1, KeyEvent keyevent)
    {
        if (!G.h())
        {
            return super.onKeyDown(i1, keyevent);
        }
        i1;
        JVM INSTR tableswitch 24 25: default 40
    //                   24 90
    //                   25 47;
           goto _L1 _L2 _L3
_L1:
        return super.onKeyDown(i1, keyevent);
_L3:
        i1 = -1;
_L5:
        int j1 = Integer.valueOf(v.a(f.d, "-1")).intValue();
        if (j1 == -1)
        {
            j1 = 0;
        }
        r.adjustStreamVolume(j1, i1, 5);
        return true;
_L2:
        i1 = 1;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public void onStart()
    {
        super.onStart();
        D.a();
        if (I != null)
        {
            return;
        }
        if (!C.d())
        {
            com.facebook.debug.log.b.b(p, "Call is not in started mode");
            finish();
            return;
        }
        if (G.h())
        {
            r();
        }
        if (x != null)
        {
            x.a();
        }
        l();
        com.facebook.debug.log.b.b(p, "Call activity started");
    }

    public void onStop()
    {
        super.onStop();
        if (I != null)
        {
            return;
        }
        if (C.d())
        {
            D.a(q, Q.getText().toString());
        }
        if (x != null)
        {
            x.c();
        }
        com.facebook.debug.log.b.b(p, "Call activity stopped");
    }

}
