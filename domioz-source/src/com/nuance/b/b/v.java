// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.b;

import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import com.nuance.b.b.a.ab;
import com.nuance.b.b.a.ac;
import com.nuance.b.b.a.ae;
import com.nuance.b.b.a.af;
import com.nuance.b.b.a.c;
import com.nuance.b.b.a.d;
import com.nuance.b.b.a.f;
import com.nuance.b.b.a.g;
import com.nuance.b.b.a.i;
import com.nuance.b.b.a.j;
import com.nuance.b.b.a.t;
import com.nuance.b.b.a.u;
import com.nuance.b.b.a.x;
import com.nuance.b.b.a.y;
import com.nuance.b.c.b;
import com.nuance.b.d.a;
import com.nuance.dragon.toolkit.a.al;
import com.nuance.dragon.toolkit.a.w;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.nuance.b.b:
//            gl, fr, aa, aj, 
//            z, bx, fc, ad, 
//            am, ao, ap, w, 
//            az, dy, e, ak, 
//            ax, en, ag, ah, 
//            gh, es, fz, af, 
//            t, fg, x, em, 
//            ab, ft, as, ff, 
//            dv, ga, an, a, 
//            y, fw, al, gf, 
//            s

public final class v
{

    static boolean a = true;
    private static v i = new v();
    private static final aa r;
    com.nuance.b.a.ae b;
    Context c;
    aj d;
    dy e;
    e f;
    fw g;
    es h;
    private fc j;
    private az k;
    private fg l;
    private ad m;
    private volatile gh n;
    private final bx o = new bx();
    private volatile boolean p;
    private volatile boolean q;
    private em s;
    private volatile int t;

    private v()
    {
        d = new aj();
        p = false;
        q = false;
        s = null;
        t = com.nuance.b.b.z.b;
        o.a();
        j = new fc();
        m = new ad();
        t = com.nuance.b.b.z.b;
    }

    private long a(s s1)
    {
        if (s1 == null)
        {
            throw new IllegalArgumentException("endpointingValues for startSpeechInterpretation cannot be null.");
        }
        v v1 = i;
        v1;
        JVM INSTR monitorenter ;
        am am1;
        Object obj;
        Object obj1;
        b b1;
        am1 = new am();
        obj = com.nuance.b.b.aj.a(am1.b());
        am1.a(((b) (obj)));
        obj1 = new ao(am1.b());
        ((ap) (obj)).a(((b) (obj1)));
        b1 = o.g(((b) (obj1)));
        com.nuance.b.b.w.a[t - 1];
        JVM INSTR tableswitch 2 4: default 361
    //                   2 148
    //                   3 182
    //                   4 211;
           goto _L1 _L2 _L3 _L4
_L1:
        if (!q) goto _L6; else goto _L5
_L5:
        b1.b(new x(b1.b(), y.k, null, "Can't startSpeechInterpretation while another interpretation function is in progress."));
        return -12L;
_L2:
        b1.b(new x(b1.b(), y.a, null, "cannot startSpeechInterpretation() in state CONNECTING_ATTEMPT"));
        v1;
        JVM INSTR monitorexit ;
        return -2L;
        s1;
        v1;
        JVM INSTR monitorexit ;
        throw s1;
_L3:
        b1.b(new x(b1.b(), y.b, null, "cannot startSpeechInterpretation() in state DISCONNECTING_ATTEMPT"));
        v1;
        JVM INSTR monitorexit ;
        return -3L;
_L4:
        b1.b(new x(b1.b(), y.c, null, "cannot startSpeechInterpretation() in state DISCONNECTED"));
        v1;
        JVM INSTR monitorexit ;
        return -4L;
_L6:
        if (!p) goto _L8; else goto _L7
_L7:
        b1.b(new x(b1.b(), y.j, null, "recording in progress"));
        v1;
        JVM INSTR monitorexit ;
        return -11L;
_L8:
        long l1;
        ((ap) (obj)).a();
        ((ap) (obj1)).a();
        obj = i;
        obj1 = ((v) (obj)).j();
        int i1 = ((az) (obj1)).i();
        int j1 = ((az) (obj1)).j();
        boolean flag = ((az) (obj1)).k();
        e = new dy(((v) (obj)).n, am1, i1, j1, flag, s1);
        e.d();
        l1 = am1.b();
        v1;
        JVM INSTR monitorexit ;
        return l1;
    }

    private long a(String s1, s s2)
    {
        if (s1 == null)
        {
            throw new IllegalArgumentException("conceptSlot for startDictation cannot be null.");
        }
        if (s2 == null)
        {
            throw new IllegalArgumentException("endpointingValues for startDictation cannot be null.");
        }
        v v1 = i;
        v1;
        JVM INSTR monitorenter ;
        am am1;
        com.nuance.b.b.ae ae1;
        ao ao1;
        b b1;
        am1 = new am();
        ae1 = com.nuance.b.b.aj.a(am1.b());
        am1.a(ae1);
        ao1 = new ao(am1.b());
        ae1.a(ao1);
        b1 = o.b(ao1);
        com.nuance.b.b.w.a[t - 1];
        JVM INSTR tableswitch 2 4: default 404
    //                   2 168
    //                   3 202
    //                   4 231;
           goto _L1 _L2 _L3 _L4
_L1:
        if (!q) goto _L6; else goto _L5
_L5:
        b1.b(new x(b1.b(), y.k, null, "Can't startSpeechInterpretation while another interpretation function is in progress."));
        return -12L;
_L2:
        b1.b(new x(b1.b(), y.a, null, "can't start dictation in state CONNECTING_ATTEMPT"));
        v1;
        JVM INSTR monitorexit ;
        return -2L;
        s1;
        v1;
        JVM INSTR monitorexit ;
        throw s1;
_L3:
        b1.b(new x(b1.b(), y.b, null, "can't start dictation in state DISCONNECTING_ATTEMPT"));
        v1;
        JVM INSTR monitorexit ;
        return -3L;
_L4:
        b1.b(new x(b1.b(), y.c, null, "can't start dictation in state DISCONNECTED"));
        v1;
        JVM INSTR monitorexit ;
        return -4L;
_L6:
        if (!p) goto _L8; else goto _L7
_L7:
        b1.b(new x(b1.b(), y.j, null, "recording in progress"));
        v1;
        JVM INSTR monitorexit ;
        return -11L;
_L8:
        ae1.a();
        ao1.a();
        f = new e(am1, n, k.l(), k.m(), k.n(), k.s(), s1, s2);
        if (f.d()) goto _L10; else goto _L9
_L9:
        am1.b(new x(am1.b(), y.e, null, "error starting dictation"));
        v1;
        JVM INSTR monitorexit ;
        return -10L;
_L10:
        long l1 = am1.b();
        v1;
        JVM INSTR monitorexit ;
        return l1;
    }

    private static String a(b b1, String s1)
    {
        String s2 = s1;
        if (b1 != null)
        {
            s2 = (new StringBuilder()).append(s1).append(". ID:").append(b1.b()).toString();
        }
        return s2;
    }

    static JSONObject a(String s1, String s2, aa aa1)
    {
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("subject", "dialogModelUpdate");
        JSONObject jsonobject1 = new JSONObject();
        jsonobject1.put("action", "setSlotValue");
        jsonobject1.put("slot", s1);
        jsonobject1.put("value", s2);
        jsonobject1.put("source", aa1.toString());
        return jsonobject.put("body", jsonobject1);
    }

    static JSONObject a(String s1, boolean flag)
    {
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("subject", "dialogModelUpdate");
        JSONObject jsonobject1 = new JSONObject();
        if (!flag)
        {
            jsonobject1.put("action", "resetAgency");
            jsonobject1.put("agency", s1);
        } else
        {
            jsonobject1.put("action", "resetAgent");
            jsonobject1.put("agent", s1);
        }
        return jsonobject.put("body", jsonobject1);
    }

    static void a(v v1)
    {
        v1.x();
    }

    static boolean a(v v1, boolean flag)
    {
        v1.p = flag;
        return flag;
    }

    private long b(String s1)
    {
        boolean flag = false;
        v v1 = i;
        v1;
        JVM INSTR monitorenter ;
        ak ak1;
        Object obj;
        ak1 = new ak();
        obj = new b(ak1.b());
        ak1.a(((b) (obj)));
        com.nuance.b.b.w.a[t - 1];
        JVM INSTR tableswitch 2 4: default 261
    //                   2 186
    //                   3 202
    //                   4 213;
           goto _L1 _L2 _L3 _L4
_L1:
        en en1;
        Object obj1;
        com.nuance.b.b.fr.c((new StringBuilder("log (")).append(ak1.b()).append(") message: ").append(s1).toString());
        obj1 = i;
        obj = com.nuance.b.b.ax.a(ak1.b());
        en1 = new en(ak1);
        s1 = new w("LOG", s1);
        obj1 = ((v) (obj1)).n;
        if (obj1 != null) goto _L6; else goto _L5
_L5:
        ak1.b(new ag(ak1.b(), com.nuance.b.b.ah.f, null, "null NMT manager"));
_L8:
        if (flag)
        {
            break; /* Loop/switch isn't completed */
        }
        v1;
        JVM INSTR monitorexit ;
        return -9L;
_L2:
        ((b) (obj)).c();
        v1;
        JVM INSTR monitorexit ;
        return -2L;
        s1;
        v1;
        JVM INSTR monitorexit ;
        throw s1;
_L3:
        ((b) (obj)).c();
        v1;
        JVM INSTR monitorexit ;
        return -3L;
_L4:
        ((b) (obj)).c();
        v1;
        JVM INSTR monitorexit ;
        return -4L;
_L6:
        ((gh) (obj1)).a("NINA_LOG_CMD", ((com.nuance.dragon.toolkit.b.e) (obj)), en1, new al[] {
            s1
        });
        flag = true;
        if (true) goto _L8; else goto _L7
_L7:
        long l1 = ak1.b();
        v1;
        JVM INSTR monitorexit ;
        return l1;
    }

    static bx b(v v1)
    {
        return v1.o;
    }

    static boolean b(v v1, boolean flag)
    {
        v1.q = flag;
        return flag;
    }

    public static v r()
    {
        return i;
    }

    static v v()
    {
        return i;
    }

    private boolean w()
    {
label0:
        {
            com.nuance.b.b.fr.f("MMFController.stopSpeechInterpretation...");
            synchronized (i)
            {
                if (q)
                {
                    break label0;
                }
            }
            return false;
        }
        boolean flag;
        if (e == null)
        {
            break MISSING_BLOCK_LABEL_53;
        }
        com.nuance.b.b.fr.f("MMFController.stopSpeechInterpretation calling speechInterpreter.stopRecording()");
        flag = e.h();
        return flag;
        exception;
        v1;
        JVM INSTR monitorexit ;
        throw exception;
        v1;
        JVM INSTR monitorexit ;
        return false;
    }

    private void x()
    {
        synchronized (i)
        {
            fr.e("MMFController.deinit...");
            g();
            h();
            if (n != null)
            {
                n = null;
            }
            if (h != null)
            {
                h.d();
                h = null;
            }
            j.a();
            m.d();
            q = false;
            p = false;
            t = com.nuance.b.b.z.b;
        }
        return;
        exception;
        v1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final long a(int i1)
    {
        v v1 = i;
        v1;
        JVM INSTR monitorenter ;
        Object obj;
        obj = o.c();
        fr.e("MMFController.playPromptFromResources...");
        Object obj1;
        long l1;
        boolean flag;
        if (h != null && !h.a())
        {
            flag = false;
        } else
        {
            flag = true;
        }
        if (i1 > 0)
        {
            break MISSING_BLOCK_LABEL_123;
        }
        obj1 = new IllegalArgumentException((new StringBuilder("resourceId not valid: ")).append(i1).toString());
        ((b) (obj)).b(new ae(((b) (obj)).b(), af.f, ((Exception) (obj1)), (new StringBuilder("resourceId not valid: ")).append(i1).toString(), flag));
        throw obj1;
        obj;
        v1;
        JVM INSTR monitorexit ;
        throw obj;
        fr.e("MMFController.playPromptFromResources after arg checks");
        com.nuance.b.b.w.a[t - 1];
        JVM INSTR tableswitch 2 4: default 314
    //                   2 218
    //                   3 248
    //                   4 278;
           goto _L1 _L2 _L3 _L4
_L1:
        if (h == null)
        {
            obj1 = n;
            h = com.nuance.b.b.gh.a(c.getResources());
        }
        h.a(new fz(((b) (obj)), i1));
        l1 = ((b) (obj)).b();
        v1;
        JVM INSTR monitorexit ;
        return l1;
_L2:
        ((b) (obj)).b(new ae(((b) (obj)).b(), af.a, null, "can't play prompt in state CONNECTING_ATTEMPT", flag));
        v1;
        JVM INSTR monitorexit ;
        return -2L;
_L3:
        ((b) (obj)).b(new ae(((b) (obj)).b(), af.b, null, "can't play prompt in state DISCONNECTING_ATTEMPT", flag));
        v1;
        JVM INSTR monitorexit ;
        return -3L;
_L4:
        ((b) (obj)).b(new ae(((b) (obj)).b(), af.c, null, "can't play prompt in state DISCONNECTED", flag));
        v1;
        JVM INSTR monitorexit ;
        return -4L;
    }

    public final long a(Context context, com.nuance.b.a.ae ae1)
    {
        v v1 = i;
        v1;
        JVM INSTR monitorenter ;
        Object obj;
        com.nuance.b.b.af af1;
        af1 = new com.nuance.b.b.af();
        obj = o.a(af1);
        if (context != null)
        {
            break MISSING_BLOCK_LABEL_73;
        }
        context = new NullPointerException("context is null");
        ((b) (obj)).b(new c(((b) (obj)).b(), d.f, context, context.getMessage()));
        throw context;
        context;
        v1;
        JVM INSTR monitorexit ;
        throw context;
        if (k == null)
        {
            context = new com.nuance.b.b.t("No configuration set.");
            ((b) (obj)).b(new c(((b) (obj)).b(), d.f, context, context.getMessage()));
            throw context;
        }
        if (k.u() == null)
        {
            context = new com.nuance.b.b.t("Configuration getAdkApplicationName() is null");
            ((b) (obj)).b(new c(((b) (obj)).b(), d.f, context, context.getMessage()));
            throw context;
        }
        if (ae1 == null)
        {
            break MISSING_BLOCK_LABEL_215;
        }
        if (!com.nuance.b.a.b.a(ae1))
        {
            context = new com.nuance.b.b.t("ApplicationModel problem. Bad agent name in an activationCondition. See Log for details");
            ((b) (obj)).b(new c(((b) (obj)).b(), d.f, context, context.getMessage()));
            throw context;
        }
        if (k.c() == null)
        {
            context = new com.nuance.b.b.t("Configuration gateway host is null. Use NinaConfiguration.setGatewayAddress(host, port) to set.");
            ((b) (obj)).b(new c(((b) (obj)).b(), d.f, context, context.getMessage()));
            throw context;
        }
        if (k.d() < 0 || k.d() > 65535)
        {
            context = new com.nuance.b.b.t((new StringBuilder("Configuration gateway port (")).append(k.d()).append(") is not a valid port. Use NinaConfiguration.setGatewayAddress(host, port) to set.").toString());
            ((b) (obj)).b(new c(((b) (obj)).b(), d.f, context, context.getMessage()));
            throw context;
        }
        c = context.getApplicationContext();
        com.nuance.b.b.w.a[t - 1];
        JVM INSTR tableswitch 1 3: default 636
    //                   1 540
    //                   2 570
    //                   3 600;
           goto _L1 _L2 _L3 _L4
_L1:
        b = ae1;
        if (ae1 == null) goto _L6; else goto _L5
_L5:
        s = ae1.b(ae1.a(Locale.getDefault()));
_L6:
        obj = i;
        obj;
        JVM INSTR monitorenter ;
        if (k != null) goto _L8; else goto _L7
_L7:
        az az1;
        JSONObject jsonobject;
        k = new az();
        az1 = k;
        jsonobject = com.nuance.b.b.az.a(context);
        if (jsonobject == null) goto _L10; else goto _L9
_L9:
        az1.a(jsonobject);
_L10:
        fr.e(az1.toString());
_L8:
        l = new fg(context);
        obj;
        JVM INSTR monitorexit ;
        long l1;
        t = com.nuance.b.b.z.c;
        j.a(af1, k.u(), l(), k.t(), ae1);
        l1 = af1.b();
        v1;
        JVM INSTR monitorexit ;
        return l1;
_L2:
        ((b) (obj)).b(new c(((b) (obj)).b(), d.a, null, ""));
        v1;
        JVM INSTR monitorexit ;
        return -1L;
_L3:
        ((b) (obj)).b(new c(((b) (obj)).b(), d.b, null, ""));
        v1;
        JVM INSTR monitorexit ;
        return -2L;
_L4:
        ((b) (obj)).b(new c(((b) (obj)).b(), d.c, null, ""));
        v1;
        JVM INSTR monitorexit ;
        return -3L;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    public final long a(String s1)
    {
        return a(s1, k.z());
    }

    public final long a(String s1, com.nuance.b.b.ab ab1)
    {
        boolean flag1 = false;
        v v1 = i;
        v1;
        JVM INSTR monitorenter ;
        am am1;
        Object obj1;
        Object obj2;
        am1 = new am();
        obj1 = com.nuance.b.b.aj.a(am1.b());
        am1.a(((b) (obj1)));
        com.nuance.b.b.x x1 = new com.nuance.b.b.x(this, s1);
        ((ap) (obj1)).a(x1);
        obj2 = o.d(x1);
        if (s1 != null)
        {
            break MISSING_BLOCK_LABEL_100;
        }
        ((b) (obj2)).b(new x(((b) (obj2)).b(), y.l, null, "attempt to interpret null text"));
        v1;
        JVM INSTR monitorexit ;
        return -5L;
        Object obj;
        obj = com.nuance.b.b.gl.a(s1).trim();
        if (!"".equals(obj))
        {
            break MISSING_BLOCK_LABEL_155;
        }
        ((b) (obj2)).b(new x(((b) (obj2)).b(), y.l, null, "attempt to interpret empty text"));
        v1;
        JVM INSTR monitorexit ;
        return -6L;
        s1;
        v1;
        JVM INSTR monitorexit ;
        throw s1;
        com.nuance.b.b.w.a[t - 1];
        JVM INSTR tableswitch 2 4: default 594
    //                   2 230
    //                   3 261
    //                   4 292;
           goto _L1 _L2 _L3 _L4
_L1:
        if (!q) goto _L6; else goto _L5
_L5:
        ((b) (obj2)).b(new x(((b) (obj2)).b(), y.k, null, "can't setAgentValues when another interpretation function is in progress"));
        v1;
        JVM INSTR monitorexit ;
        return -12L;
_L2:
        ((b) (obj2)).b(new x(((b) (obj2)).b(), y.a, null, "cannot interpretText() in state CONNECTING_ATTEMPT"));
        v1;
        JVM INSTR monitorexit ;
        return -2L;
_L3:
        ((b) (obj2)).b(new x(((b) (obj2)).b(), y.b, null, "cannot interpretText() in state DISCONNECTING_ATTEMPT"));
        v1;
        JVM INSTR monitorexit ;
        return -3L;
_L4:
        ((b) (obj2)).b(new x(((b) (obj2)).b(), y.c, null, "cannot interpretText() in state DISCONNECTED"));
        v1;
        JVM INSTR monitorexit ;
        return -4L;
_L6:
        ((ap) (obj1)).a();
        s1 = ((String) (obj));
        if (s != null)
        {
            s1 = s.filter(((String) (obj)));
        }
        obj2 = j;
        v v2;
        w w1;
        com.nuance.dragon.toolkit.a.ah ah1;
        boolean flag;
        long l1;
        if (ab1 == com.nuance.b.b.ab.a)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.nuance.b.b.fr.c((new StringBuilder("sendTextRecognition (")).append(am1.b()).append(")").toString());
        v2 = i;
        obj = com.nuance.b.b.ax.a(am1.b());
        obj1 = new ft(am1, "Text Recognition", com.nuance.b.b.as.a);
        w1 = com.nuance.b.b.ax.a(s1);
        ah1 = com.nuance.b.b.ax.b(com.nuance.b.b.ax.a());
        ab1 = new al[2];
        ab1[0] = w1;
        ab1[1] = ah1;
        s1 = ab1;
        if (!flag) goto _L8; else goto _L7
_L7:
        if (!((fc) (obj2)).b.b) goto _L10; else goto _L9
_L9:
        s1 = new al[3];
        s1[0] = w1;
        s1[1] = ah1;
        s1[2] = new w("INPUT_SOURCE", "hint");
_L8:
        ab1 = v2.n;
        if (ab1 != null) goto _L12; else goto _L11
_L11:
        am1.b(new x(am1.b(), y.h, null, "interpretText() network fail"));
        flag = flag1;
_L14:
        if (flag)
        {
            break; /* Loop/switch isn't completed */
        }
        v1;
        JVM INSTR monitorexit ;
        return -9L;
_L10:
        com.nuance.b.b.fr.d("Compatability mode -- Not sending INPUT_SOURCE parameter");
        s1 = ab1;
        continue; /* Loop/switch isn't completed */
_L12:
        ab1.a("NINA_ASR_NR_CMD", ((com.nuance.dragon.toolkit.b.e) (obj)), ((com.nuance.dragon.toolkit.a.aa) (obj1)), s1);
        flag = true;
        if (true) goto _L14; else goto _L13
_L13:
        l1 = am1.b();
        v1;
        JVM INSTR monitorexit ;
        return l1;
        if (true) goto _L8; else goto _L15
_L15:
    }

    public final long a(String s1, dv dv1)
    {
        boolean flag1 = true;
        v v1 = i;
        v1;
        JVM INSTR monitorenter ;
        b b1;
        fr.e("MMFController.playPrompt...");
        b1 = o.c();
        boolean flag = flag1;
        if (h != null)
        {
            if (h.a())
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
        }
        if (s1 != null)
        {
            break MISSING_BLOCK_LABEL_104;
        }
        b1.b(new ae(b1.b(), af.d, null, "null prompt", flag));
        throw new NullPointerException("prompt must not be null");
        s1;
        v1;
        JVM INSTR monitorexit ;
        throw s1;
        if (dv1 != null)
        {
            break MISSING_BLOCK_LABEL_145;
        }
        b1.b(new ae(b1.b(), af.e, null, "null prompt type", flag));
        throw new NullPointerException("type must not be null");
        com.nuance.b.b.w.a[t - 1];
        JVM INSTR tableswitch 2 4: default 464
    //                   2 359
    //                   3 392
    //                   4 425;
           goto _L1 _L2 _L3 _L4
_L1:
        String s2;
        if (h == null)
        {
            gh gh1 = n;
            h = com.nuance.b.b.gh.a(c.getResources());
        }
        s2 = k.r();
        String s3 = s2;
        if (s2 != null) goto _L6; else goto _L5
_L5:
        s3 = j.a.toString();
_L6:
        Object obj;
        String s4;
        s4 = k.q();
        obj = com.nuance.b.b.dv.a;
        s2 = s1;
        if (dv1 != obj) goto _L8; else goto _L7
_L7:
        s2 = s1;
        obj = com.nuance.b.d.a.a(s3, true);
        if (s4 == null) goto _L10; else goto _L9
_L9:
        s2 = s1;
        ((a) (obj)).a(new com.nuance.b.d.b(s4));
_L10:
        s2 = s1;
        ((a) (obj)).b(s1);
        s2 = s1;
        ((a) (obj)).a();
        s2 = s1;
        s1 = ((a) (obj)).toString();
        s2 = s1;
        obj = com.nuance.b.b.dv.b;
        dv1 = ((dv) (obj));
_L12:
        long l1;
        h.a(new ga(n, s1, dv1, s4, s3, b1));
        l1 = b1.b();
        v1;
        JVM INSTR monitorexit ;
        return l1;
_L2:
        b1.b(new ae(b1.b(), af.a, null, "can't play prompt in state CONNECTING_ATTEMPT", flag));
        v1;
        JVM INSTR monitorexit ;
        return -2L;
_L3:
        b1.b(new ae(b1.b(), af.b, null, "can't play prompt in state DISCONNECTING_ATTEMPT", flag));
        v1;
        JVM INSTR monitorexit ;
        return -3L;
_L4:
        b1.b(new ae(b1.b(), af.c, null, "can't play prompt in state DISCONNECTED", flag));
        v1;
        JVM INSTR monitorexit ;
        return -4L;
        s1;
_L8:
        s1 = s2;
        if (true) goto _L12; else goto _L11
_L11:
    }

    public final long a(Map map, aa aa1)
    {
        aa aa2;
        aa2 = aa1;
        if (aa1 == null)
        {
            aa2 = r;
        }
        aa1 = i;
        aa1;
        JVM INSTR monitorenter ;
        b b1;
        am am1;
        com.nuance.b.b.ae ae1;
        am1 = new am();
        ae1 = com.nuance.b.b.aj.a(am1.b());
        am1.a(ae1);
        b1 = o.f(ae1);
        com.nuance.b.b.w.a[t - 1];
        JVM INSTR tableswitch 2 4: default 401
    //                   2 129
    //                   3 164
    //                   4 194;
           goto _L1 _L2 _L3 _L4
_L1:
        if (!q) goto _L6; else goto _L5
_L5:
        b1.b(new x(b1.b(), y.k, null, "can't setAgentValues when another interpretation function is in progress"));
        return -12L;
_L2:
        b1.b(new x(b1.b(), y.a, null, "cannot setAgentValues() in state CONNECTING_ATTEMPT"));
        aa1;
        JVM INSTR monitorexit ;
        return -2L;
        map;
        aa1;
        JVM INSTR monitorexit ;
        throw map;
_L3:
        b1.b(new x(b1.b(), y.b, null, "cannot setAgentValues() in state DISCONNECTING_ATTEMPT"));
        aa1;
        JVM INSTR monitorexit ;
        return -3L;
_L4:
        b1.b(new x(b1.b(), y.c, null, "cannot setAgentValues() in state DISCONNECTED"));
        aa1;
        JVM INSTR monitorexit ;
        return -4L;
_L6:
        if (map.size() != 0) goto _L8; else goto _L7
_L7:
        b1.b(new x(b1.b(), y.l, null, "null or empty agent values passed to setAgentValues()"));
        aa1;
        JVM INSTR monitorexit ;
        return -10L;
_L8:
        JSONArray jsonarray;
        jsonarray = new JSONArray();
        map = map.entrySet().iterator();
_L11:
        if (!map.hasNext()) goto _L10; else goto _L9
_L9:
        java.util.Map.Entry entry = (java.util.Map.Entry)map.next();
        jsonarray.put(a((String)entry.getKey(), (String)entry.getValue(), aa2));
          goto _L11
        map;
        b1.b(new x(b1.b(), y.f, map, "JSONException building setAgentValues messages"));
        aa1;
        JVM INSTR monitorexit ;
        return -10L;
_L10:
        ae1.a();
        if (com.nuance.b.b.fc.a(am1, jsonarray)) goto _L13; else goto _L12
_L12:
        aa1;
        JVM INSTR monitorexit ;
        return -9L;
_L13:
        long l1 = am1.b();
        aa1;
        JVM INSTR monitorexit ;
        return l1;
    }

    public final long a(JSONArray jsonarray)
    {
        v v1 = i;
        v1;
        JVM INSTR monitorenter ;
        an an1;
        b b1;
        an1 = new an();
        b1 = o.c(an1);
        com.nuance.b.b.w.a[t - 1];
        JVM INSTR tableswitch 2 4: default 213
    //                   2 96
    //                   3 130
    //                   4 159;
           goto _L1 _L2 _L3 _L4
_L1:
        if (jsonarray.length() != 0) goto _L6; else goto _L5
_L5:
        b1.b(new t(an1.b(), u.e, null, "empty messages"));
        return -10L;
_L2:
        b1.b(new t(an1.b(), u.a, null, ""));
        v1;
        JVM INSTR monitorexit ;
        return -2L;
        jsonarray;
        v1;
        JVM INSTR monitorexit ;
        throw jsonarray;
_L3:
        b1.b(new t(an1.b(), u.b, null, ""));
        v1;
        JVM INSTR monitorexit ;
        return -3L;
_L4:
        b1.b(new t(an1.b(), u.c, null, ""));
        v1;
        JVM INSTR monitorexit ;
        return -4L;
_L6:
        if (com.nuance.b.b.fc.b(an1, jsonarray)) goto _L8; else goto _L7
_L7:
        v1;
        JVM INSTR monitorexit ;
        return -9L;
_L8:
        long l1 = an1.b();
        v1;
        JVM INSTR monitorexit ;
        return l1;
    }

    public final transient long a(com.nuance.b.b.a aa1[])
    {
        Object obj = new JSONArray();
        if (aa1 == null) goto _L2; else goto _L1
_L1:
        Object obj1;
        int i1;
        int j1;
        j1 = aa1.length;
        i1 = 0;
        obj1 = null;
_L4:
        Object obj2;
        Object obj3;
        Object obj4;
        obj3 = obj1;
        obj2 = obj;
        if (i1 >= j1)
        {
            break; /* Loop/switch isn't completed */
        }
        obj4 = aa1[i1];
        obj2 = obj1;
        obj3 = obj;
        if (obj4 == null)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        ((JSONArray) (obj)).put(((com.nuance.b.b.a) (obj4)).a());
        obj3 = obj;
        obj2 = obj1;
_L5:
        i1++;
        obj1 = obj2;
        obj = obj3;
        if (true) goto _L4; else goto _L3
        obj;
        obj2 = ((JSONException) (obj)).getMessage();
        obj3 = null;
          goto _L5
_L2:
        obj3 = null;
        obj2 = obj;
_L3:
        obj = i;
        obj;
        JVM INSTR monitorenter ;
        b b1;
        obj1 = new am();
        obj4 = com.nuance.b.b.aj.a(((b) (obj1)).b());
        ((b) (obj1)).a(((b) (obj4)));
        b1 = o.f(((b) (obj4)));
        com.nuance.b.b.w.a[t - 1];
        JVM INSTR tableswitch 2 4: default 425
    //                   2 217
    //                   3 252
    //                   4 282;
           goto _L6 _L7 _L8 _L9
_L6:
        if (!q) goto _L11; else goto _L10
_L10:
        b1.b(new x(b1.b(), y.k, null, "can't cannot sendAgentCommands when another interpretation function is in progress"));
        return -12L;
_L7:
        b1.b(new x(b1.b(), y.a, null, "cannot sendAgentCommands() in state CONNECTING_ATTEMPT"));
        obj;
        JVM INSTR monitorexit ;
        return -2L;
        aa1;
        obj;
        JVM INSTR monitorexit ;
        throw aa1;
_L8:
        b1.b(new x(b1.b(), y.b, null, "cannot cannot sendAgentCommands() in state DISCONNECTING_ATTEMPT"));
        obj;
        JVM INSTR monitorexit ;
        return -3L;
_L9:
        b1.b(new x(b1.b(), y.c, null, "cannot cannot sendAgentCommands() in state DISCONNECTED"));
        obj;
        JVM INSTR monitorexit ;
        return -4L;
_L11:
        if (aa1 == null || obj2 == null) goto _L13; else goto _L12
_L12:
        if (((JSONArray) (obj2)).length() != 0) goto _L14; else goto _L13
_L13:
        if (obj2 != null || obj3 == null) goto _L16; else goto _L15
_L15:
        Log.e("MMFController", (new StringBuilder("sendAgentCommands errorMsg: ")).append(((String) (obj3))).toString());
_L16:
        b1.b(new x(b1.b(), y.l, null, "null or empty agent values passed to setAgentValues()"));
        obj;
        JVM INSTR monitorexit ;
        return -10L;
_L14:
        ((ap) (obj4)).a();
        if (com.nuance.b.b.fc.a(((b) (obj1)), ((JSONArray) (obj2)))) goto _L18; else goto _L17
_L17:
        obj;
        JVM INSTR monitorexit ;
        return -9L;
_L18:
        long l1 = ((b) (obj1)).b();
        obj;
        JVM INSTR monitorexit ;
        return l1;
    }

    final gh a()
    {
        return n;
    }

    final void a(boolean flag)
    {
        boolean flag1 = j.d();
        StringBuilder stringbuilder = new StringBuilder("NO INPUT TIMEOUT");
        String s1;
        if (flag1 || flag)
        {
            s1 = " MREC";
        } else
        {
            s1 = "";
        }
        b(stringbuilder.append(s1).toString());
    }

    final fg b()
    {
        return l;
    }

    final void b(int i1)
    {
        t = i1;
    }

    final void b(boolean flag)
    {
        boolean flag1 = j.d();
        StringBuilder stringbuilder = new StringBuilder("NO MATCH");
        String s1;
        if (flag1 || flag)
        {
            s1 = " MREC";
        } else
        {
            s1 = "";
        }
        b(stringbuilder.append(s1).toString());
    }

    final ad c()
    {
        return m;
    }

    public final long d()
    {
        v v1 = i;
        v1;
        JVM INSTR monitorenter ;
        Object obj = o.b();
        com.nuance.b.b.w.a[t - 1];
        JVM INSTR tableswitch 3 4: default 151
    //                   3 92
    //                   4 124;
           goto _L1 _L2 _L3
_L1:
        long l1;
        t = com.nuance.b.b.z.d;
        com.nuance.b.b.y y1 = new com.nuance.b.b.y(this, ((b) (obj)));
        j.a(((b) (obj)).b(), n, y1);
        l1 = ((b) (obj)).b();
        return l1;
_L2:
        ((b) (obj)).b(new i(((b) (obj)).b(), j.a, "attempt to disconnect in state DISCONNECTING_ATTEMPT"));
        v1;
        JVM INSTR monitorexit ;
        return -3L;
        obj;
        v1;
        JVM INSTR monitorexit ;
        throw obj;
_L3:
        ((b) (obj)).b(new i(((b) (obj)).b(), j.b, "attempt to disconnect in state DISCONNECTED"));
        v1;
        JVM INSTR monitorexit ;
        return -4L;
    }

    public final long e()
    {
        return a(k.y());
    }

    public final boolean f()
    {
        boolean flag;
        synchronized (i)
        {
            flag = w();
        }
        return flag;
        exception;
        v1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final boolean g()
    {
        Object obj;
label0:
        {
            obj = null;
            synchronized (i)
            {
                if (q)
                {
                    break label0;
                }
            }
            return true;
        }
        dy dy1 = e;
        if (dy1 == null)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        if (dy1.i())
        {
            break MISSING_BLOCK_LABEL_42;
        }
        v1;
        JVM INSTR monitorexit ;
        return false;
        if (dy1.a(false))
        {
            break MISSING_BLOCK_LABEL_55;
        }
        v1;
        JVM INSTR monitorexit ;
        return false;
        if (com.nuance.b.b.z.a == t)
        {
            break MISSING_BLOCK_LABEL_69;
        }
        v1;
        JVM INSTR monitorexit ;
        return false;
        for (long l1 = SystemClock.elapsedRealtime(); q && SystemClock.elapsedRealtime() - l1 < 5000L; Thread.sleep(5L)) { }
          goto _L1
        obj;
        obj = "Interrupted before receiving stopped event for audio recorder after cancelling a speech interpretation.";
        com.nuance.b.b.fr.b(a(dy1.a(), "Interrupted before receiving stopped event for audio recorder after cancelling a speech interpretation."));
_L3:
        if (!q)
        {
            break MISSING_BLOCK_LABEL_229;
        }
        String s1 = "Never cleared interpretation in progress flag after apparently successful cancel of speech interpretation.";
        com.nuance.b.b.fr.b(a(dy1.a(), "Never cleared interpretation in progress flag after apparently successful cancel of speech interpretation."));
        t = com.nuance.b.b.z.d;
        x();
        if (obj == null)
        {
            obj = s1;
        }
        o.a(new f(dy1.a().b(), g.c, null, ((String) (obj))));
        v1;
        JVM INSTR monitorexit ;
        return false;
_L1:
        if (dy1.c()) goto _L3; else goto _L2
_L2:
        obj = "Never received stopped event for audio recorder after cancelling a speech interpretation.";
        com.nuance.b.b.fr.b(a(dy1.a(), "Never received stopped event for audio recorder after cancelling a speech interpretation."));
          goto _L3
        exception;
        v1;
        JVM INSTR monitorexit ;
        throw exception;
        v1;
        JVM INSTR monitorexit ;
        return true;
    }

    public final boolean h()
    {
        Object obj;
label0:
        {
            obj = null;
            synchronized (i)
            {
                if (q)
                {
                    break label0;
                }
            }
            return true;
        }
        e e1 = f;
        if (e1 == null)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        if (e1.e())
        {
            break MISSING_BLOCK_LABEL_42;
        }
        v1;
        JVM INSTR monitorexit ;
        return false;
        if (e1.a(false))
        {
            break MISSING_BLOCK_LABEL_55;
        }
        v1;
        JVM INSTR monitorexit ;
        return false;
        if (com.nuance.b.b.z.a == t)
        {
            break MISSING_BLOCK_LABEL_69;
        }
        v1;
        JVM INSTR monitorexit ;
        return false;
        for (long l1 = SystemClock.elapsedRealtime(); q && SystemClock.elapsedRealtime() - l1 < 5000L; Thread.sleep(5L)) { }
          goto _L1
        obj;
        obj = "Interrupted before receiving stopped event for audio recorder after cancelling a speech interpretation.";
        com.nuance.b.b.fr.b(a(e1.a(), "Interrupted before receiving stopped event for audio recorder after cancelling a speech interpretation."));
_L3:
        if (!q)
        {
            break MISSING_BLOCK_LABEL_229;
        }
        String s1 = "Never cleared interpretation in progress flag after apparently successful cancel of speech interpretation.";
        com.nuance.b.b.fr.b(a(e1.a(), "Never cleared interpretation in progress flag after apparently successful cancel of speech interpretation."));
        t = com.nuance.b.b.z.d;
        x();
        if (obj == null)
        {
            obj = s1;
        }
        o.a(new f(e1.a().b(), g.c, null, ((String) (obj))));
        v1;
        JVM INSTR monitorexit ;
        return false;
_L1:
        if (e1.c()) goto _L3; else goto _L2
_L2:
        obj = "Never received stopped event for audio recorder after cancelling a speech interpretation.";
        com.nuance.b.b.fr.b(a(e1.a(), "Never received stopped event for audio recorder after cancelling a speech interpretation."));
          goto _L3
        exception;
        v1;
        JVM INSTR monitorexit ;
        throw exception;
        v1;
        JVM INSTR monitorexit ;
        return true;
    }

    public final void i()
    {
        synchronized (i)
        {
            if (g != null)
            {
                g.b();
            }
            if (e != null)
            {
                e.h();
            }
            if (f != null)
            {
                f.i();
            }
        }
        return;
        exception;
        v1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final az j()
    {
        if (k == null)
        {
            k = new az();
        }
        return k;
    }

    public final void k()
    {
        synchronized (i)
        {
            if (h != null)
            {
                h.c();
            }
        }
        return;
        exception;
        v1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final String l()
    {
        if (l != null)
        {
            return l.a();
        } else
        {
            return null;
        }
    }

    public final String m()
    {
        String s1 = null;
        if (j != null)
        {
            s1 = j.c();
        }
        return s1;
    }

    public final long n()
    {
        boolean flag = false;
        v v1 = i;
        v1;
        JVM INSTR monitorenter ;
        Object obj;
        Object obj1;
        obj = new com.nuance.b.b.al();
        obj1 = o.e(((b) (obj)));
        com.nuance.b.b.w.a[t - 1];
        JVM INSTR tableswitch 2 4: default 282
    //                   2 161
    //                   3 194
    //                   4 222;
           goto _L1 _L2 _L3 _L4
_L1:
        gf gf1;
        Object obj2;
        com.nuance.b.b.fr.c((new StringBuilder("ping (")).append(((b) (obj)).b()).append(")").toString());
        obj2 = i;
        obj1 = com.nuance.b.b.ax.a(((b) (obj)).b());
        gf1 = new gf(((b) (obj)));
        obj2 = ((v) (obj2)).n;
        if (obj2 != null) goto _L6; else goto _L5
_L5:
        ((b) (obj)).b(new ab(((b) (obj)).b(), ac.f, null, "null NMT manager"));
_L8:
        if (flag)
        {
            break; /* Loop/switch isn't completed */
        }
        v1;
        JVM INSTR monitorexit ;
        return -9L;
_L2:
        ((b) (obj1)).b(new ab(((b) (obj)).b(), ac.a, null, "can't ping in state CONNECTING_ATTEMPT"));
        v1;
        JVM INSTR monitorexit ;
        return -2L;
        obj;
        v1;
        JVM INSTR monitorexit ;
        throw obj;
_L3:
        ((b) (obj1)).b(new ab(((b) (obj)).b(), ac.b, null, "can't ping in state DISCONNECTING_ATTEMPT"));
        v1;
        JVM INSTR monitorexit ;
        return -3L;
_L4:
        ((b) (obj1)).b(new ab(((b) (obj)).b(), ac.c, null, "can't ping in state DISCONNECTED"));
        v1;
        JVM INSTR monitorexit ;
        return -4L;
_L6:
        ((gh) (obj2)).a("NINA_PING_CMD", ((com.nuance.dragon.toolkit.b.e) (obj1)), gf1, new al[0]);
        flag = true;
        if (true) goto _L8; else goto _L7
_L7:
        long l1 = ((b) (obj)).b();
        v1;
        JVM INSTR monitorexit ;
        return l1;
    }

    final void o()
    {
        b("TEXT NO-MATCH");
    }

    final fc p()
    {
        return j;
    }

    final void q()
    {
        synchronized (i)
        {
            if (n != null)
            {
                n.c();
            }
            n = new gh();
            n.a();
        }
        return;
        exception;
        v1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final int s()
    {
        return t;
    }

    final void t()
    {
        if (h != null)
        {
            h.e();
        }
    }

    public final bx u()
    {
        return o;
    }

    static 
    {
        fr.e((new StringBuilder("Debug mode: ")).append(com.nuance.b.b.gl.a()).toString());
        r = com.nuance.b.b.aa.a;
    }
}
