// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.applink;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.util.SparseArray;
import atk;
import atm;
import ato;
import atr;
import atv;
import aty;
import atz;
import aua;
import aud;
import aug;
import aui;
import auk;
import aul;
import aum;
import auo;
import aup;
import auq;
import aur;
import aus;
import auv;
import ava;
import avb;
import avd;
import avn;
import avo;
import avp;
import avs;
import avt;
import avw;
import avy;
import awa;
import awb;
import awc;
import awe;
import awf;
import awg;
import awh;
import awi;
import awl;
import awo;
import awp;
import awq;
import aww;
import awx;
import awy;
import com.ford.syncV4.exception.SyncException;
import com.ford.syncV4.exception.SyncExceptionCause;
import com.ford.syncV4.proxy.rpc.enums.AudioStreamingState;
import com.ford.syncV4.proxy.rpc.enums.ButtonName;
import com.ford.syncV4.proxy.rpc.enums.DisplayType;
import com.ford.syncV4.proxy.rpc.enums.FileType;
import com.ford.syncV4.proxy.rpc.enums.HMILevel;
import com.ford.syncV4.proxy.rpc.enums.InteractionMode;
import com.ford.syncV4.proxy.rpc.enums.Language;
import com.ford.syncV4.proxy.rpc.enums.LayoutMode;
import com.ford.syncV4.proxy.rpc.enums.SoftButtonType;
import com.ford.syncV4.proxy.rpc.enums.SpeechCapabilities;
import com.ford.syncV4.proxy.rpc.enums.SystemContext;
import com.ford.syncV4.proxy.rpc.enums.TextAlignment;
import com.ford.syncV4.proxy.rpc.enums.TriggerSource;
import com.ford.syncV4.proxy.rpc.enums.UpdateMode;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.logging.Logger;
import ctz;
import eca;
import ech;
import ecj;
import efy;
import ega;
import egb;
import egc;
import egi;
import egj;
import egk;
import egn;
import ego;
import egp;
import egq;
import egr;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

// Referenced classes of package com.spotify.mobile.android.spotlets.applink:
//            SessionState

public final class AppLinkImpl
    implements atv, efy, egn
{

    private String A;
    boolean a;
    final egi b;
    Vector c;
    awi d;
    awi e;
    SessionState f;
    ato g;
    private final egq h;
    private boolean i;
    private final ech j;
    private final ech k;
    private final List l = new ArrayList();
    private Vector m;
    private AudioStreamingState n;
    private int o;
    private int p;
    private int q;
    private int r;
    private boolean s;
    private boolean t;
    private boolean u;
    private SparseArray v;
    private final SparseArray w = new SparseArray();
    private final SparseArray x = new SparseArray();
    private ego y;
    private String z;

    public AppLinkImpl(egr egr, ecj ecj1, egq egq1, egj egj1)
    {
        a = true;
        n = AudioStreamingState.b;
        f = SessionState.a;
        h = (egq)ctz.a(egq1);
        ctz.a(egr);
        egr = egj1.a;
        new eca();
        b = new egi(egr, this);
        v = new SparseArray();
        f();
        egr = new Vector();
        egr.add(e);
        m = egr;
        j = ecj1.a(250L);
        k = new ech(ecj1.a, 400L, new ecj._cls2());
    }

    private void a(long l1, UpdateMode updatemode, egc egc1)
    {
        if (!g())
        {
            return;
        }
        int i1 = c(egc1);
        try
        {
            long l2 = l1 / 3600L;
            long l3 = l1 / 60L;
            g.a(Integer.valueOf((int)l2), Integer.valueOf((int)(l3 % 60L)), Integer.valueOf((int)(l1 % 60L)), updatemode, Integer.valueOf(i1));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (UpdateMode updatemode)
        {
            Logger.b(updatemode, "could not set media clock (set timer)", new Object[0]);
        }
        a(i1);
    }

    private void a(atm atm1)
    {
        if (!atm1.d().booleanValue())
        {
            atm1.e();
            atm1.getClass().getName();
            atm1.f();
        }
        egc egc1 = (egc)v.get(atm1.c().intValue());
        v.remove(atm1.c().intValue());
        if (egc1 != null)
        {
            egc1.a(atm1.d().booleanValue());
        }
    }

    private static String b(String s1)
    {
        String s2 = s1;
        if (s1 == null)
        {
            s2 = "(null)";
        }
        return s2;
    }

    private void f()
    {
        Vector vector = new Vector();
        d = new awi();
        d.a(SoftButtonType.b);
        d.a(egp.a);
        d.a(Integer.valueOf(ButtonId.a.ordinal()));
        e = new awi();
        e.a(SoftButtonType.a);
        e.a(h.a.getString(0x7f0800a6));
        e.a(Integer.valueOf(ButtonId.b.ordinal()));
        awi awi1 = new awi();
        awi1.a(SoftButtonType.a);
        awi1.a(h.a.getString(0x7f08009a));
        awi1.a(Integer.valueOf(ButtonId.c.ordinal()));
        if (!t)
        {
            vector.add(d);
        }
        vector.add(e);
        vector.add(awi1);
        c = vector;
    }

    private boolean g()
    {
        if (f != SessionState.b)
        {
            Logger.c("Session state must be started but was: %s", new Object[] {
                f
            });
            return false;
        }
        if (v.size() > 20)
        {
            Logger.b("Too many RPC requests %d log limit is %d", new Object[] {
                Integer.valueOf(v.size()), Integer.valueOf(20)
            });
            return false;
        } else
        {
            return true;
        }
    }

    private void h()
    {
        if (f == SessionState.b)
        {
            if (y != null)
            {
                y.a();
            }
            f = SessionState.c;
        }
    }

    private void i()
    {
        try
        {
            if (g != null)
            {
                Logger.a("Proxy Version: %s", new Object[] {
                    g.b()
                });
            }
            return;
        }
        catch (SyncException syncexception)
        {
            Logger.b(syncexception, "Can't get Proxy Version", new Object[0]);
        }
    }

    private void j()
    {
        if (d.a().equals(egp.b))
        {
            for (Iterator iterator = l.iterator(); iterator.hasNext(); ((ega)iterator.next()).b()) { }
        } else
        {
            for (Iterator iterator1 = l.iterator(); iterator1.hasNext(); ((ega)iterator1.next()).a()) { }
        }
    }

    public final String a(String s1)
    {
        s1 = s1.trim();
        if (!s)
        {
            return s1;
        }
        String s2;
        try
        {
            s2 = new String(s1.getBytes(), "ASCII");
        }
        catch (UnsupportedEncodingException unsupportedencodingexception)
        {
            Assertion.b("Failed to convert string to ASCII");
            return s1;
        }
        return s2;
    }

    public final void a()
    {
        i = false;
        egi egi1 = b;
        egi1.d = false;
        egi1.c = null;
        if (g == null)
        {
            try
            {
                Vector vector = atr.a(h.a.getResources().getString(0x7f0800ae));
                egq egq1 = h;
                Vector vector1 = new Vector();
                vector1.add(egq1.a.getResources().getString(0x7f0800ae));
                vector1.add(egq1.a.getResources().getString(0x7f08061c));
                g = new ato(this, "Spotify", vector, vector1, Boolean.valueOf(true), h.c(), h.c(), "1105659333");
                v.clear();
                i();
                return;
            }
            catch (SyncException syncexception)
            {
                Logger.b(syncexception, "failed to start proxy", new Object[0]);
            }
            return;
        }
        try
        {
            g.a();
            v.clear();
            return;
        }
        catch (SyncException syncexception1)
        {
            return;
        }
    }

    final void a(int i1)
    {
        egc egc1 = (egc)v.get(i1);
        v.remove(i1);
        if (egc1 != null)
        {
            egc1.a(false);
        }
    }

    public final void a(long l1, boolean flag, egc egc1)
    {
        if (l1 == 0L && flag)
        {
            if (s)
            {
                a(l1, UpdateMode.a, null);
                a(l1, UpdateMode.c, egc1);
                return;
            } else
            {
                a(l1, UpdateMode.b, null);
                return;
            }
        }
        UpdateMode updatemode;
        if (flag)
        {
            updatemode = UpdateMode.c;
        } else
        {
            updatemode = UpdateMode.a;
        }
        a(l1, updatemode, egc1);
    }

    public final void a(Uri uri, egc egc1)
    {
        if (!g() || !u)
        {
            return;
        } else
        {
            k.a(new Runnable(uri, egc1) {

                private Uri a;
                private egc b;
                private AppLinkImpl c;

                public final void run()
                {
                    c.b.a(a, b);
                }

            
            {
                c = AppLinkImpl.this;
                a = uri;
                b = egc1;
                super();
            }
            });
            return;
        }
    }

    public final void a(atk atk1, egc egc1)
    {
        int i1;
        if (egc1 == null)
        {
            i1 = o;
            o = i1 + 1;
        } else
        {
            i1 = c(egc1);
        }
        atk1.a(Integer.valueOf(i1));
        g.a(atk1);
_L1:
        return;
        SyncException syncexception;
        syncexception;
        Logger.b(syncexception, "RPC Request failed for %s", new Object[] {
            atk1.getClass().getName()
        });
        if (egc1 != null)
        {
            egc1.a(false);
            return;
        }
          goto _L1
    }

    public final void a(aty aty)
    {
        a(((atm) (aty)));
    }

    public final void a(atz atz)
    {
        Thread.currentThread().getStackTrace()[2].getMethodName();
        a(((atm) (atz)));
    }

    public final void a(aua aua)
    {
        Thread.currentThread().getStackTrace()[2].getMethodName();
        a(((atm) (aua)));
    }

    public final void a(aud aud)
    {
        Thread.currentThread().getStackTrace()[2].getMethodName();
        a(((atm) (aud)));
    }

    public final void a(aug aug)
    {
        Thread.currentThread().getStackTrace()[2].getMethodName();
        a(((atm) (aug)));
    }

    public final void a(aui aui)
    {
        a(((atm) (aui)));
    }

    public final void a(auk auk)
    {
        Thread.currentThread().getStackTrace()[2].getMethodName();
        a(((atm) (auk)));
    }

    public final void a(aul aul)
    {
        Thread.currentThread().getStackTrace()[2].getMethodName();
        a(((atm) (aul)));
    }

    public final void a(aum aum)
    {
        Thread.currentThread().getStackTrace()[2].getMethodName();
        a(((atm) (aum)));
    }

    public final void a(aup aup)
    {
        Thread.currentThread().getStackTrace()[2].getMethodName();
        a(((atm) (aup)));
    }

    public final void a(auq auq)
    {
        Thread.currentThread().getStackTrace()[2].getMethodName();
        a(((atm) (auq)));
    }

    public final void a(aur aur)
    {
        Thread.currentThread().getStackTrace()[2].getMethodName();
        a(((atm) (aur)));
    }

    public final void a(aus aus)
    {
        Thread.currentThread().getStackTrace()[2].getMethodName();
        a(((atm) (aus)));
    }

    public final void a(auv auv)
    {
        Thread.currentThread().getStackTrace()[2].getMethodName();
        a(((atm) (auv)));
    }

    public final void a(ava ava1)
    {
        int i1;
        Thread.currentThread().getStackTrace()[2].getMethodName();
        if (ava1.d() != null)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 == 0) goto _L2; else goto _L1
_L1:
        i1 = ava1.d().intValue();
        if (i1 != ButtonId.a.ordinal()) goto _L4; else goto _L3
_L3:
        j();
_L6:
        return;
_L4:
        if (i1 != ButtonId.c.ordinal())
        {
            break; /* Loop/switch isn't completed */
        }
        ava1 = l.iterator();
        while (ava1.hasNext()) 
        {
            ((ega)ava1.next()).f();
        }
        if (true) goto _L6; else goto _L5
_L5:
        if (i1 == ButtonId.b.ordinal())
        {
            ava1 = l.iterator();
            while (ava1.hasNext()) 
            {
                ((ega)ava1.next()).e();
            }
        }
        if (true)
        {
            continue; /* Loop/switch isn't completed */
        }
_L2:
        ava1 = ava1.c();
        if (ava1 == ButtonName.a)
        {
            j();
            return;
        }
        if (ava1 != ButtonName.b)
        {
            break; /* Loop/switch isn't completed */
        }
        ava1 = l.iterator();
        while (ava1.hasNext()) 
        {
            ((ega)ava1.next()).d();
        }
        if (true) goto _L6; else goto _L7
_L7:
        if (ava1 == ButtonName.c)
        {
            ava1 = l.iterator();
            while (ava1.hasNext()) 
            {
                ((ega)ava1.next()).c();
            }
        }
        if (true) goto _L6; else goto _L8
_L8:
    }

    public final void a(avb avb1)
    {
        egb egb1 = (egb)w.get(avb1.c().intValue());
        if (egb1 == null)
        {
            Logger.c("Unexpected command id %d", new Object[] {
                avb1.c()
            });
        } else
        if (y != null)
        {
            y.a(egb1, avb1.d().equals(TriggerSource.a));
            return;
        }
    }

    public final void a(avd avd1)
    {
        if (!a) goto _L2; else goto _L1
_L1:
        Language language;
        Language language1;
        language = g.d();
        language1 = h.c();
        if (!language1.equals(language)) goto _L4; else goto _L3
_L3:
        a = false;
_L2:
        final class _cls4
        {

            static final int a[];
            static final int b[];

            static 
            {
                b = new int[HMILevel.values().length];
                try
                {
                    b[HMILevel.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    b[HMILevel.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    b[HMILevel.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    b[HMILevel.d.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                a = new int[SystemContext.values().length];
                try
                {
                    a[SystemContext.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[SystemContext.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[SystemContext.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[SystemContext.d.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[SystemContext.e.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls4.a[avd1.e().ordinal()];
        JVM INSTR tableswitch 1 5: default 80
    //                   1 165
    //                   2 165
    //                   3 165
    //                   4 160
    //                   5 233;
           goto _L5 _L6 _L6 _L6 _L7 _L8
_L5:
        throw new IllegalStateException();
_L4:
        try
        {
            String s1 = String.valueOf(language);
            if (String.valueOf(language1).startsWith("EN-") && s1.startsWith("EN-"))
            {
                g.a(language, language, Integer.valueOf(c(new egc() {

                    private AppLinkImpl a;

                    public final void a(boolean flag1)
                    {
                        boolean flag2 = true;
                        AppLinkImpl applinkimpl = a;
                        if (!flag1)
                        {
                            flag1 = flag2;
                        } else
                        {
                            flag1 = false;
                        }
                        applinkimpl.a = flag1;
                    }

            
            {
                a = AppLinkImpl.this;
                super();
            }
                })));
            }
        }
        catch (SyncException syncexception)
        {
            Logger.b(syncexception, "Failed to update language", new Object[0]);
        }
          goto _L2
_L7:
        avd1.toString();
_L6:
        _cls4.b[avd1.c().ordinal()];
        JVM INSTR tableswitch 1 4: default 208
    //                   1 241
    //                   2 459
    //                   3 721
    //                   4 728;
           goto _L9 _L10 _L11 _L12 _L13
_L9:
        Logger.c("Illegal state: %s", new Object[] {
            avd1.c()
        });
        throw new IllegalStateException();
_L8:
        avd1.toString();
          goto _L6
_L10:
        if (!avd1.f.booleanValue()) goto _L15; else goto _L14
_L14:
        boolean flag;
        if (g.e().a().intValue() == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        try
        {
            s = flag;
            Logger.a("isGen1 %b", new Object[] {
                Boolean.valueOf(s)
            });
        }
        catch (SyncException syncexception1)
        {
            Logger.b(syncexception1, "Failed to get sync msg version", new Object[0]);
        }
        if (!s) goto _L17; else goto _L16
_L16:
        z = "AppLink";
_L18:
        awy awy1;
        SyncException syncexception2;
        try
        {
            A = (new StringBuilder()).append(g.e().a()).append(".").append(g.e().b()).toString();
        }
        catch (SyncException syncexception3)
        {
            Logger.b(syncexception3, "Could not get ProxyVersion from AppLink", new Object[0]);
        }
        i();
        try
        {
            g.a(ButtonName.a, Integer.valueOf(c(null)));
            g.a(ButtonName.b, Integer.valueOf(c(null)));
            g.a(ButtonName.c, Integer.valueOf(c(null)));
        }
        catch (SyncException syncexception4)
        {
            Logger.c("Failed to subscribe to hard buttons: %s", new Object[] {
                syncexception4.getMessage()
            });
        }
_L15:
        flag = avd1.f.booleanValue();
        if (f != SessionState.b)
        {
            f = SessionState.b;
            if (y != null)
            {
                y.a(flag);
            }
        }
_L11:
        avd1 = avd1.d();
        if (!n.equals(avd1))
        {
            n = avd1;
            if (f.equals(SessionState.b) && y != null)
            {
                avd1 = y;
                Object obj;
                SyncException syncexception5;
                Bitmap bitmap;
                byte abyte0[];
                ByteArrayOutputStream bytearrayoutputstream;
                if (n == AudioStreamingState.a)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                avd1.b(flag);
            }
        }
        return;
_L17:
        try
        {
            awy1 = g.f();
            z = (new StringBuilder("AppLink ")).append(b((String)awy1.e.get("modelYear"))).append(" ").append(b((String)awy1.e.get("make"))).append(" ").append(b((String)awy1.e.get("model"))).append(" ").append(b((String)awy1.e.get("trim"))).toString();
        }
        // Misplaced declaration of an exception variable
        catch (SyncException syncexception2)
        {
            Logger.b(syncexception2, "Could not get VechicleType from AppLink", new Object[0]);
        }
          goto _L18
_L12:
        h();
          goto _L11
_L13:
        if (!i)
        {
            try
            {
                obj = g.c();
                u = ((Boolean)((auo) (obj)).e.get("graphicSupported")).booleanValue();
                t = DisplayType.a.equals(((auo) (obj)).a());
            }
            // Misplaced declaration of an exception variable
            catch (SyncException syncexception5)
            {
                u = false;
                t = false;
                Logger.b(syncexception5, "Failed to get display capabilities", new Object[0]);
            }
            f();
            if (u)
            {
                obj = b;
                bitmap = BitmapFactory.decodeResource(h.a.getResources(), 0x7f020049);
                bytearrayoutputstream = new ByteArrayOutputStream();
                bitmap.compress(android.graphics.Bitmap.CompressFormat.PNG, 100, bytearrayoutputstream);
                abyte0 = bytearrayoutputstream.toByteArray();
                ((egi) (obj)).a("AppIcon.png", FileType.a, abyte0, new egi._cls1(((egi) (obj))));
            }
            i = true;
        }
        h();
          goto _L11
    }

    public final void a(avn avn)
    {
        Thread.currentThread().getStackTrace()[2].getMethodName();
        a(((atm) (avn)));
    }

    public final void a(avp avp1)
    {
        if (!avp1.d().booleanValue())
        {
            Logger.c("onPerformInteractionResponse failed %s", new Object[] {
                avp1.e()
            });
            y.b();
            return;
        }
        egb egb1 = (egb)x.get(avp1.h().intValue());
        if (egb1 == null)
        {
            Logger.c("Unexpected command id %d", new Object[] {
                avp1.h()
            });
            return;
        } else
        {
            y.a(egb1.b, egb1, avp1.i().equals(TriggerSource.a));
            return;
        }
    }

    public final void a(avs avs)
    {
        Thread.currentThread().getStackTrace()[2].getMethodName();
        a(((atm) (avs)));
    }

    public final void a(avt avt)
    {
        Thread.currentThread().getStackTrace()[2].getMethodName();
        a(((atm) (avt)));
    }

    public final void a(avw avw)
    {
        Thread.currentThread().getStackTrace()[2].getMethodName();
        a(((atm) (avw)));
    }

    public final void a(avy avy)
    {
        Thread.currentThread().getStackTrace()[2].getMethodName();
        a(((atm) (avy)));
    }

    public final void a(awa awa)
    {
        Thread.currentThread().getStackTrace()[2].getMethodName();
        a(((atm) (awa)));
    }

    public final void a(awb awb)
    {
        Thread.currentThread().getStackTrace()[2].getMethodName();
        a(((atm) (awb)));
    }

    public final void a(awc awc)
    {
        Thread.currentThread().getStackTrace()[2].getMethodName();
        a(((atm) (awc)));
    }

    public final void a(awe awe)
    {
        a(((atm) (awe)));
    }

    public final void a(awg awg)
    {
        a(((atm) (awg)));
    }

    public final void a(awh awh)
    {
        Thread.currentThread().getStackTrace()[2].getMethodName();
        a(((atm) (awh)));
    }

    public final void a(awl awl)
    {
        a(((atm) (awl)));
    }

    public final void a(awo awo)
    {
        a(((atm) (awo)));
    }

    public final void a(awp awp)
    {
        Thread.currentThread().getStackTrace()[2].getMethodName();
        a(((atm) (awp)));
    }

    public final void a(aww aww)
    {
        Thread.currentThread().getStackTrace()[2].getMethodName();
        a(((atm) (aww)));
    }

    public final void a(awx awx)
    {
        Thread.currentThread().getStackTrace()[2].getMethodName();
        a(((atm) (awx)));
    }

    public final void a(ega ega1)
    {
        l.add(ega1);
    }

    public final void a(egb egb1, egc egc1)
    {
        if (!g())
        {
            return;
        }
        int i1 = c(egc1);
        try
        {
            int j1 = egb1.d;
            egc1 = egb1.a;
            int k1 = egb1.c;
            w.remove(j1);
            g.a(Integer.valueOf(j1), Integer.valueOf(i1));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (egb egb1)
        {
            Logger.b(egb1, "could not delete command", new Object[0]);
        }
        a(i1);
    }

    public final void a(egc egc1)
    {
        if (!u)
        {
            return;
        } else
        {
            b.a(egc1);
            return;
        }
    }

    public final void a(egk egk1, egc egc1)
    {
        if (!g())
        {
            return;
        }
        int i1 = c(egc1);
        egc1 = new Vector();
        egb egb1;
        int j1;
        for (Enumeration enumeration = egk1.d.elements(); enumeration.hasMoreElements() && egc1.size() < 50; egc1.add(ato.a(Integer.valueOf(j1), egb1.a, egb1.a())))
        {
            egb1 = (egb)enumeration.nextElement();
            egb1.b = egk1;
            x.append(q, egb1);
            j1 = q;
            q = j1 + 1;
        }

        try
        {
            int k1 = r;
            String s1 = egk1.a;
            egk1.c = r;
            egk1 = g;
            k1 = r;
            r = k1 + 1;
            egk1.a(egc1, Integer.valueOf(k1), Integer.valueOf(i1));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (egk egk1)
        {
            Logger.b(egk1, "could not set media clock (clear timer)", new Object[0]);
        }
        a(i1);
    }

    public final void a(egk egk1, boolean flag)
    {
        Object obj;
        Vector vector;
        SpeechCapabilities speechcapabilities;
        try
        {
            int i1 = egk1.c;
            obj = egk1.b;
            vector = new Vector();
        }
        // Misplaced declaration of an exception variable
        catch (egk egk1)
        {
            Logger.b(egk1, "Exception when communicating with Applink", new Object[0]);
            return;
        }
        if (flag) goto _L2; else goto _L1
_L1:
        speechcapabilities = SpeechCapabilities.b;
        if (s)
        {
            obj = "1";
        } else
        {
            obj = "";
        }
        vector.add(atr.a(speechcapabilities, ((String) (obj))));
_L7:
        Vector vector1 = new Vector(1);
        vector1.add(Integer.valueOf(egk1.c));
        obj = new avo();
        ((avo) (obj)).b.put("interactionChoiceSetIDList", vector1);
        ((avo) (obj)).b.put("initialPrompt", vector);
        egk1 = egk1.a;
        if (egk1 == null) goto _L4; else goto _L3
_L3:
        ((avo) (obj)).b.put("initialText", egk1);
_L8:
        if (!flag) goto _L6; else goto _L5
_L5:
        egk1 = InteractionMode.b;
_L9:
        ((avo) (obj)).b.put("interactionMode", egk1);
        egk1 = Integer.valueOf(0x186a0);
        if (egk1 == null)
        {
            break MISSING_BLOCK_LABEL_278;
        }
        ((avo) (obj)).b.put("timeout", egk1);
_L10:
        int j1 = o;
        o = j1 + 1;
        ((avo) (obj)).a(Integer.valueOf(j1));
        if (t)
        {
            egk1 = LayoutMode.a;
            ((avo) (obj)).b.put("interactionLayout", egk1);
        }
        g.a(((atk) (obj)));
        return;
_L2:
        vector.add(atr.a(SpeechCapabilities.a, ((String) (obj))));
          goto _L7
_L4:
        ((avo) (obj)).b.remove("initialText");
          goto _L8
_L6:
        egk1 = InteractionMode.a;
          goto _L9
        ((avo) (obj)).b.remove("timeout");
          goto _L10
    }

    public final void a(ego ego1)
    {
        y = ego1;
    }

    public final void a(Exception exception)
    {
        if (((SyncException)exception)._syncExceptionCause != SyncExceptionCause.j && ((SyncException)exception)._syncExceptionCause != SyncExceptionCause.b)
        {
            b();
        }
    }

    public final void a(String s1, egc egc1)
    {
        int i1 = c(egc1);
        try
        {
            g.a(s1, Integer.valueOf(i1));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            Logger.b(s1, "Failed on speak", new Object[0]);
        }
        a(i1);
    }

    public final void a(String s1, String s2, egc egc1)
    {
        int i1 = c(egc1);
        try
        {
            egc1 = g;
            int j1 = o;
            o = j1 + 1;
            egc1.a(Integer.valueOf(j1));
            g.a(s1, s2, TextAlignment.a, Integer.valueOf(i1));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            Logger.c("Failed to clear screen and set message: %s", new Object[] {
                s1
            });
        }
        a(i1);
    }

    public final void a(String s1, String s2, boolean flag, boolean flag1, egc egc1)
    {
        if (!g())
        {
            return;
        } else
        {
            s1 = new Runnable(egc1, flag1, flag, s1, s2) {

                private egc a;
                private boolean b;
                private boolean c;
                private String d;
                private String e;
                private AppLinkImpl f;

                public final void run()
                {
                    Object obj;
                    if (f.f != SessionState.b)
                    {
                        return;
                    }
                    int i1 = f.c(a);
                    obj = f.e;
                    Object obj1 = Boolean.valueOf(b);
                    if (obj1 != null)
                    {
                        ((awi) (obj)).e.put("isHighlighted", obj1);
                    } else
                    {
                        ((awi) (obj)).e.remove("isHighlighted");
                    }
                    if (c)
                    {
                        f.d.a(egp.b);
                    } else
                    {
                        f.d.a(egp.a);
                    }
                    try
                    {
                        obj = new awf();
                        ((awf) (obj)).a(d);
                        ((awf) (obj)).b(e);
                        ((awf) (obj)).b.put("mainField3", "");
                        ((awf) (obj)).b.put("mainField4", "");
                        obj1 = f.c;
                    }
                    // Misplaced declaration of an exception variable
                    catch (Object obj)
                    {
                        Logger.c("Failed to set now playing screen: %s", new Object[] {
                            obj
                        });
                        f.a(i1);
                        return;
                    }
                    if (obj1 == null)
                    {
                        break MISSING_BLOCK_LABEL_246;
                    }
                    ((awf) (obj)).b.put("softButtons", obj1);
_L1:
                    obj1 = new Vector();
                    ((awf) (obj)).b.put("customPresets", obj1);
                    ((awf) (obj)).a(TextAlignment.a);
                    ((awf) (obj)).a(Integer.valueOf(i1));
                    f.g.a(((atk) (obj)));
                    return;
                    ((awf) (obj)).b.remove("softButtons");
                      goto _L1
                }

            
            {
                f = AppLinkImpl.this;
                a = egc1;
                b = flag;
                c = flag1;
                d = s1;
                e = s2;
                super();
            }
            };
            j.a(s1);
            return;
        }
    }

    public final void a(List list, egc egc1)
    {
        Iterator iterator = list.iterator();
_L2:
        egb egb1;
        int i1;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        egb1 = (egb)iterator.next();
        int j1;
        if (iterator.hasNext())
        {
            list = egc1;
        } else
        {
            list = null;
        }
        if (!g())
        {
            continue; /* Loop/switch isn't completed */
        }
        i1 = c(list);
        j1 = p;
        list = egb1.a;
        j1 = egb1.c;
        w.append(p, egb1);
        egb1.d = p;
        if (egb1.a != null)
        {
            list = g;
            j1 = p;
            p = j1 + 1;
            list.a(Integer.valueOf(j1), egb1.a, Integer.valueOf(egb1.c), egb1.a(), Integer.valueOf(i1));
            continue; /* Loop/switch isn't completed */
        }
        try
        {
            list = g;
            int k1 = p;
            p = k1 + 1;
            list.a(Integer.valueOf(k1), egb1.a(), Integer.valueOf(i1));
        }
        // Misplaced declaration of an exception variable
        catch (List list)
        {
            Logger.b(list, "could not add command", new Object[0]);
            a(i1);
        }
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final void b()
    {
        if (g == null)
        {
            break MISSING_BLOCK_LABEL_50;
        }
        if (f.equals(SessionState.b))
        {
            f = SessionState.a;
            if (y != null)
            {
                y.a();
            }
        }
        g.a();
        return;
        SyncException syncexception;
        syncexception;
        Logger.c("Failed to reset proxy", new Object[0]);
        return;
    }

    public final void b(ega ega1)
    {
        l.remove(ega1);
    }

    public final void b(egb egb1, egc egc1)
    {
        if (!g())
        {
            return;
        }
        int i1 = c(egc1);
        try
        {
            int j1 = p;
            egc1 = egb1.a;
            j1 = egb1.c;
            w.append(p, egb1);
            egb1.d = p;
            egc1 = g;
            j1 = p;
            p = j1 + 1;
            egc1.a(Integer.valueOf(j1), egb1.a, Integer.valueOf(egb1.c), egb1.a(), Integer.valueOf(i1));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (egb egb1)
        {
            Logger.b(egb1, "could not set media clock (clear timer)", new Object[0]);
        }
        a(i1);
    }

    public final void b(egc egc1)
    {
        if (!g())
        {
            return;
        }
        int i1 = c(egc1);
        try
        {
            g.a(Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), UpdateMode.d, Integer.valueOf(i1));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (egc egc1)
        {
            Logger.b(egc1, "could not set media clock (clear timer)", new Object[0]);
        }
        a(i1);
    }

    public final void b(String s1, egc egc1)
    {
        int i1 = c(egc1);
        egc1 = m;
        try
        {
            g.a(s1, Integer.valueOf(10000), egc1, Integer.valueOf(i1));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            Logger.c("Failed on display scrollable", new Object[] {
                s1
            });
        }
        a(i1);
    }

    final int c(egc egc1)
    {
        v.put(o, egc1);
        int i1 = o;
        o = i1 + 1;
        return i1;
    }

    public final boolean c()
    {
        return f == SessionState.b;
    }

    public final String d()
    {
        return (String)ctz.a(z);
    }

    public final String e()
    {
        return (String)ctz.a(A);
    }

    private class ButtonId extends Enum
    {

        public static final ButtonId a;
        public static final ButtonId b;
        public static final ButtonId c;
        private static final ButtonId d[];

        public static ButtonId valueOf(String s1)
        {
            return (ButtonId)Enum.valueOf(com/spotify/mobile/android/spotlets/applink/AppLinkImpl$ButtonId, s1);
        }

        public static ButtonId[] values()
        {
            return (ButtonId[])d.clone();
        }

        static 
        {
            a = new ButtonId("PLAY_BUTTON", 0);
            b = new ButtonId("SAVE_BUTTON", 1);
            c = new ButtonId("INFO_BUTTON", 2);
            d = (new ButtonId[] {
                a, b, c
            });
        }

        private ButtonId(String s1, int i1)
        {
            super(s1, i1);
        }
    }

}
