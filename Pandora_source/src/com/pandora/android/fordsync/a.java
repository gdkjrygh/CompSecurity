// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.fordsync;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.support.v4.content.j;
import com.pandora.android.activity.PandoraIntent;
import com.pandora.android.activity.PandoraIntentFilter;
import com.pandora.android.provider.b;
import com.pandora.android.util.v;
import com.pandora.radio.data.aa;
import com.pandora.radio.data.af;
import com.pandora.radio.data.d;
import com.pandora.radio.data.f;
import com.pandora.radio.data.y;
import com.pandora.radio.provider.h;
import com.pandora.radio.provider.i;
import java.io.ByteArrayOutputStream;
import java.security.InvalidParameterException;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import p.bg.ai;
import p.ct.c;
import p.ct.e;
import p.cx.k;
import p.dd.ab;
import p.dd.an;
import p.dd.ap;
import p.dd.as;
import p.dd.at;
import p.dd.ay;
import p.dd.bb;
import p.dd.bd;
import p.dd.bg;
import p.dd.bh;
import p.dd.g;
import p.dd.p;
import p.dm.m;

// Referenced classes of package com.pandora.android.fordsync:
//            AppLinkBluetoothService

public class com.pandora.android.fordsync.a extends c
    implements k
{
    public static class a extends com.pandora.radio.util.b
    {

        public static com.pandora.android.fordsync.a a()
        {
            com/pandora/android/fordsync/a$a;
            JVM INSTR monitorenter ;
            com.pandora.android.fordsync.a a1 = com.pandora.android.fordsync.a.w();
            com/pandora/android/fordsync/a$a;
            JVM INSTR monitorexit ;
            return a1;
            Exception exception;
            exception;
            com/pandora/android/fordsync/a$a;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public a()
        {
        }
    }


    private static volatile com.pandora.android.fordsync.a y;
    private y A;
    private p.cw.c B;
    private p.ct.b C;
    private BroadcastReceiver D;
    protected af a;
    public String b;
    private p.cx.e.a z;

    public com.pandora.android.fordsync.a(p.cw.c c1)
    {
        b = null;
        C = new p.ct.b() {

            final com.pandora.android.fordsync.a a;

            public void a()
            {
                if (a.G())
                {
                    a.l();
                }
            }

            
            {
                a = com.pandora.android.fordsync.a.this;
                super();
            }
        };
        D = new BroadcastReceiver() {

            final com.pandora.android.fordsync.a a;

            public void onReceive(Context context, Intent intent)
            {
                context = intent.getAction();
                if (context != null)
                {
                    if (context.equals(PandoraIntent.a("show_page")))
                    {
                        com.pandora.android.fordsync.a.a(a, "ACTION_SHOW_TAB");
                        return;
                    }
                    if (context.equals(PandoraIntent.a("show_set_account")))
                    {
                        com.pandora.android.fordsync.a.b(a, "ACTION_SHOW_SET_ACCOUNT - unexpectedly received");
                        a.e();
                        return;
                    }
                    if (context.equals(PandoraIntent.a("fordsync_connection_detected")))
                    {
                        com.pandora.android.fordsync.a.c(a, "ACTION_FORDSYNC_CONNECTION_DETECTED");
                        a.t();
                        return;
                    }
                }
            }

            
            {
                a = com.pandora.android.fordsync.a.this;
                super();
            }
        };
        B = c1;
        y = this;
    }

    public static com.pandora.android.fordsync.a a()
    {
        return a.a();
    }

    static void a(com.pandora.android.fordsync.a a1, String s1)
    {
        a1.g(s1);
    }

    private void a(y y1)
    {
label0:
        {
            g("onStationChange");
            if (y1 != null)
            {
                y1 = new p.ct.c.c(this, y1.d(), y1.c());
                c(y1);
                a(((p.ct.c.d) (null)));
                if (G())
                {
                    if (!b.a.o())
                    {
                        break label0;
                    }
                    h(b.a.p());
                }
            }
            return;
        }
        c((new StringBuilder()).append("tuning to station: ").append(y1.b()).toString());
        a(y1.b(), "Tuning...", true, false);
    }

    static void b(com.pandora.android.fordsync.a a1, String s1)
    {
        a1.g(s1);
    }

    static void c(com.pandora.android.fordsync.a a1, String s1)
    {
        a1.g(s1);
    }

    private void h(String s1)
    {
        if (!b.a.s())
        {
            d(s1);
            b.a.f(true);
        }
    }

    static com.pandora.android.fordsync.a w()
    {
        return y;
    }

    public String a(String s1)
    {
        List list = v().b(h.b);
        if (list.size() > 1)
        {
            String s2 = ((y)list.get(1)).c();
            if (!s2.equals(s1))
            {
                return s2;
            }
            if (list.size() > 2)
            {
                return ((y)list.get(2)).c();
            } else
            {
                return ((y)list.get(0)).c();
            }
        } else
        {
            return null;
        }
    }

    protected void a(int i1, String s1, boolean flag)
    {
        b b1 = b.a;
        b1.d(true);
        b1.a(i1, s1);
        b1.e(flag);
    }

    public void a(ai ai1)
    {
        p.df.a.a("FORDSYNC", (new StringBuilder()).append("FordSyncClient.java > onOnHMIStatus > HMILevel = ").append(ai1.c()).append("SystemContext = ").append(ai1.e()).toString());
        e e1 = new e(ai1);
        p.ct.a a1 = p.ct.a.a();
        if (a1 != null)
        {
            a1.b(e1);
        }
        super.a(ai1);
        if (B.d().o())
        {
            e();
            if (p.bh.b.c.equals(ai1.d()))
            {
                b();
                return;
            }
            break MISSING_BLOCK_LABEL_130;
        }
        try
        {
            if (!p.bh.b.c.equals(ai1.d()))
            {
                c();
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (ai ai1)
        {
            p.df.a.b("AppLink", "Radio was null when HMI event occurred", ai1);
        }
    }

    public void a(bh bh1)
    {
        boolean flag;
        boolean flag2;
        flag2 = false;
        flag = false;
        bh1 = bh1.b;
        if (bh1 == null) goto _L2; else goto _L1
_L1:
        u();
        if (a == null) goto _L2; else goto _L3
_L3:
        j = bh1.G();
        if (j > 2000)
        {
            j = j / 1000;
        }
        if (!bh1.M()) goto _L5; else goto _L4
_L4:
        String s1 = bh1.s();
        String s3 = bh1.t();
        String s5 = bh1.u();
        String s7 = ((d)bh1).c();
        flag2 = bh1.M();
        boolean flag3 = bh1.i();
        boolean flag5 = bh1.o();
        boolean flag7 = bh1.B();
        int i1 = bh1.E();
        if (bh1.O() || bh1.P())
        {
            flag = true;
        }
        bh1 = new p.ct.c.d(this, s1, s3, s5, s7, flag2, flag3, flag5, flag7, i1, flag, bh1.v());
_L7:
        a(((p.ct.c.d) (bh1)));
        if (G())
        {
            e();
        }
_L2:
        return;
_L5:
        String s2;
        String s4;
        String s6;
        String s8;
        int j1;
        boolean flag1;
        boolean flag4;
        boolean flag6;
        boolean flag8;
        boolean flag9;
label0:
        {
            s2 = bh1.s();
            s4 = bh1.t();
            s6 = bh1.u();
            s8 = bh1.w();
            flag4 = bh1.M();
            flag6 = bh1.i();
            flag8 = bh1.o();
            flag9 = bh1.B();
            j1 = bh1.E();
            if (!bh1.O())
            {
                flag1 = flag2;
                if (!bh1.P())
                {
                    break label0;
                }
            }
            flag1 = true;
        }
        bh1 = new p.ct.c.d(this, s2, s4, s6, s8, flag4, flag6, flag8, flag9, j1, flag1, bh1.v());
        if (true) goto _L7; else goto _L6
_L6:
    }

    protected boolean a(p.ct.c.d d1, aa aa1)
    {
        return d1 != null && aa1 != null && d1.f() != null && d1.f().equals(aa1.w());
    }

    public void b()
    {
        g("onPauseAudio");
        try
        {
            B.d().b(p.cw.b.c.b);
            return;
        }
        catch (NullPointerException nullpointerexception)
        {
            p.df.a.b("AppLink", "Radio was null when pause event occurred", nullpointerexception);
        }
    }

    public void b(String s1)
    {
        if (!B.C())
        {
            break MISSING_BLOCK_LABEL_47;
        }
        s1 = a(s1);
        if (s1 != null)
        {
            try
            {
                x().b(s1);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                p.df.a.b("AppLink", "Radio was null when startFirstStation was called", s1);
            }
            break MISSING_BLOCK_LABEL_47;
        }
        com.pandora.radio.util.i.a("Unable To Retrieve Station", 0);
        return;
    }

    public void c()
    {
        g("onResumeAudio");
        if (r || B.d() == null || B.d().o())
        {
            break MISSING_BLOCK_LABEL_54;
        }
        B.d().a(p.cw.b.c.b);
        return;
        NullPointerException nullpointerexception;
        nullpointerexception;
        p.df.a.b("AppLink", "Radio was null when resume audio was called", nullpointerexception);
        return;
    }

    public Object clone()
        throws CloneNotSupportedException
    {
        throw new CloneNotSupportedException();
    }

    public void d()
    {
        PandoraIntentFilter pandoraintentfilter = new PandoraIntentFilter();
        pandoraintentfilter.a("fordsync_connection_detected");
        pandoraintentfilter.a("show_set_account");
        b.a.C().a(D, pandoraintentfilter);
        a(p.cx.c.a());
        t();
    }

    protected void e()
    {
        if (b.a.o())
        {
            g("updateDisplayWithCurrentTrack - found ERROR state");
            h(b.a.p());
            return;
        } else
        {
            super.e();
            return;
        }
    }

    public boolean f()
    {
        return z == p.cx.e.a.a;
    }

    public boolean g()
    {
        return z == p.cx.e.a.b;
    }

    public boolean h()
    {
        if (v() != null)
        {
            return v().d();
        } else
        {
            return false;
        }
    }

    public void i()
    {
        g("disconnect - onDismissAccessoryScreen()");
        n();
        p.ct.a a1 = p.ct.a.a();
        if (a1 != null)
        {
            a1.b(C);
        }
        super.i();
    }

    public void j()
    {
        c("FordSync received shutdown request");
        i();
        k();
        b.a.C().a(D);
    }

    public void k()
    {
        af();
    }

    public void l()
    {
        c("onConnected");
        m.bj = false;
        m.bn = 3;
        ag();
        if (G() && b.a.o())
        {
            e();
            o();
        } else
        if (G())
        {
            super.l();
            return;
        }
    }

    public void m()
    {
        b b1 = b.a;
        try
        {
            B.l().b(y());
            if (!b1.z())
            {
                p.cx.c.a().C();
                g("onShowAccessoryScreen - screen is not showing, initializing accessory...");
                b1.f(false);
                if (ah() != null && i > 0)
                {
                    a(i);
                }
                e();
                s();
                if (!b1.o() && g() && h() && A == null)
                {
                    b(null);
                }
                A();
            }
            return;
        }
        catch (NullPointerException nullpointerexception)
        {
            p.df.a.b("AppLink", "Show Accessory screen occurred when radio was null", nullpointerexception);
        }
    }

    public void n()
    {
        b b1 = b.a;
        b1.b().l().b(null);
        if (b1.z())
        {
            g("onDismissAccessoryScreen() - broadcast ACTION_PANDORA_LINK_CONNECTION_LOST");
            p.cx.c.a().D();
            b();
        }
    }

    public void o()
    {
        c("lost connection");
        i();
    }

    public void onApiError(p.dd.c c1)
    {
        if (G()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        c1.a;
        JVM INSTR lookupswitch 5: default 64
    //                   12: 65
    //                   1006: 94
    //                   1038: 94
    //                   1039: 94
    //                   100001: 112;
           goto _L3 _L4 _L5 _L5 _L5 _L6
_L6:
        continue; /* Loop/switch isn't completed */
_L3:
        return;
_L4:
        if (!G()) goto _L1; else goto _L7
_L7:
        a("Pandora is unable to play music at this time because of licensing restrictions at this location.", "Licensing Restrictions");
        a("Unable to Play", "Licensing Restrictions", false);
        return;
_L5:
        if (!G()) goto _L1; else goto _L8
_L8:
        a(" Sorry, Pandora could not play this station", " Error Playing Station");
        return;
        if (!G()) goto _L1; else goto _L9
_L9:
        a("Pandora is unable to play music at this time because of insufficient internet connectivity.", "No Internet Connection");
        a("Unable to Play", "No Internet Connection", false);
        return;
    }

    public void onBookmarkSuccess(g g1)
    {
        while (!G() || ah() == null) 
        {
            return;
        }
        a(null, "Bookmarked", (new StringBuilder()).append("").append(ah().c()).toString());
    }

    public void onDeleteStationSuccess(p p1)
    {
        p1 = p1.a;
        if (A == null || A.c().equals(p1))
        {
            c(null);
            a(((p.ct.c.d) (null)));
            if (G())
            {
                e();
                b(null);
            }
        }
    }

    public void onPandoraLinkApiError(ab ab1)
    {
        if (G()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        int i1 = ab1.b;
        ab1 = ab1.a;
        g((new StringBuilder()).append("onPandoraLinkApiError: errorCode = ").append(i1).append(", message = ").append(ab1).toString());
        switch (i1)
        {
        default:
            if (!b.a.s())
            {
                if (i1 == 1009)
                {
                    B();
                } else
                {
                    F();
                    a(i1, ab1, true);
                }
                b.a.f(true);
                return;
            }
            break;

        case 2000: 
            a("No Pandora skips remaining.", "Skip Limit Reached");
            return;

        case 2002: 
            a("Sorry, Pandora could not save your track rating.", "Error Saving Feedback");
            if (ah() != null)
            {
                ah().a(0);
                I();
                return;
            }
            break;

        case 1005: 
            a("Pandora cannot create another station.  Delete one before trying again.", "Station Limit Reached");
            return;

        case 2004: 
            a("Sorry, Pandora could not create a station.", "Cannot Create Station");
            return;

        case 2005: 
            a("Sorry, Pandora could not save your bookmark", "Error Saving Bookmark");
            if (ah() != null)
            {
                ah().a(false);
                I();
                return;
            }
            break;

        case 1: // '\001'
            a("Pandora is unable to play music at this time because the service is undergoing maintenance.", "Pandora Maintenance");
            a("Unable to Play", "Pandora Maintenance", true);
            return;

        case 2001: 
        case 2003: 
        case 2006: 
            break;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public void onSignInState(an an1)
    {
        g((new StringBuilder()).append("onSignInState: ").append(an1.b).toString());
        a = an1.a;
        z = an1.b;
        static class _cls3
        {

            static final int a[];
            static final int b[];
            static final int c[];

            static 
            {
                c = new int[p.cx.e.a.values().length];
                try
                {
                    c[p.cx.e.a.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror12) { }
                try
                {
                    c[p.cx.e.a.c.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror11) { }
                try
                {
                    c[p.cx.e.a.d.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror10) { }
                try
                {
                    c[p.cx.e.a.b.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror9) { }
                b = new int[p.dd.bh.a.values().length];
                try
                {
                    b[p.dd.bh.a.b.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    b[p.dd.bh.a.c.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    b[p.dd.bh.a.d.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    b[p.dd.bh.a.a.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    b[p.dd.bh.a.e.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                a = new int[p.dd.ay.a.values().length];
                try
                {
                    a[p.dd.ay.a.c.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[p.dd.ay.a.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[p.dd.ay.a.d.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[p.dd.ay.a.a.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        com.pandora.android.fordsync._cls3.c[z.ordinal()];
        JVM INSTR tableswitch 1 4: default 84
    //                   1 151
    //                   2 151
    //                   3 151
    //                   4 115;
           goto _L1 _L2 _L2 _L2 _L3
_L1:
        throw new InvalidParameterException((new StringBuilder()).append("onSignInState called with unknown signInState: ").append(an1.b).toString());
_L3:
        u();
        if (B.C() && G())
        {
            e();
            if (l)
            {
                A();
            }
        }
_L2:
        return;
        an1;
        p.df.a.b("AppLink", "Radio was null when sign in event occurred", an1);
        return;
    }

    public void onSkipTrack(ap ap1)
    {
        if (!G() || p.cw.d.b(ap1.c) || ap1.c == p.cw.d.a.d)
        {
            return;
        } else
        {
            onPandoraLinkApiError(new ab(com.pandora.android.util.v.a(ap1.c), 2000, null));
            return;
        }
    }

    public void onStationCreated(as as1)
    {
        if (G())
        {
            g("ACTION_CREATE_STATION_SUCCESS");
            f(as1.a.c());
            aa();
            N();
            a(((String) (null)), "Station Created");
        }
    }

    public void onStationData(at at1)
    {
        A = at1.a;
        if (A != null)
        {
            c(new p.ct.c.c(this, A.d(), A.c()));
            return;
        } else
        {
            c(null);
            return;
        }
    }

    public void onStationDeleted(p p1)
    {
        if (G())
        {
            aa();
        }
    }

    public void onStationStateChange(ay ay1)
    {
        u();
        if (a != null) goto _L2; else goto _L1
_L1:
        g("We've been signed out, exiting");
_L4:
        return;
_L2:
        switch (_cls3.a[ay1.b.ordinal()])
        {
        default:
            throw new InvalidParameterException((new StringBuilder()).append("onStationStateChange called with unknown stationStateChangeType: ").append(ay1.b).toString());

        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            break;

        case 4: // '\004'
            a(ay1.a);
            break; /* Loop/switch isn't completed */
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void onThumbDown(bb bb1)
    {
        if (G())
        {
            if (bb1.a != p.cw.d.a.a)
            {
                a(null, "Thumbed Down,", "Skip Limit Reached");
                return;
            }
            if (ah() != null)
            {
                a(null, "Thumbed Down", ah().c());
                return;
            }
        }
    }

    public void onThumbUp(bd bd)
    {
        while (!G() || ah() == null) 
        {
            return;
        }
        a(null, "Thumbed Up", ah().c());
    }

    public void onTrackElapsedTime(bg bg1)
    {
        i = bg1.a;
        a(i);
        if (G())
        {
            bg1 = ah();
            if (bg1 != null && !bg1.f().equals(b))
            {
                b = bg1.f();
                c("updating media clock timer...");
                a(false);
            }
        }
    }

    public void onTrackState(bh bh1)
    {
        g((new StringBuilder()).append("onTrackState: ").append(bh1.a).toString());
        boolean flag;
        if (ah() == null || !a(ah(), bh1.b))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            a(bh1);
        }
        if (!G())
        {
            return;
        }
        switch (com.pandora.android.fordsync._cls3.b[bh1.a.ordinal()])
        {
        default:
            throw new IllegalArgumentException((new StringBuilder()).append("onTrackState: unknown event type ").append(bh1.a).toString());

        case 1: // '\001'
            i = 0;
            return;

        case 2: // '\002'
            a(false);
            e();
            return;

        case 3: // '\003'
            g((new StringBuilder()).append("actionPause:").append(r).toString());
            if (ah() != null && r)
            {
                a(ai().b(), "Paused", false);
            }
            e();
            a(true);
            return;

        case 4: // '\004'
        case 5: // '\005'
            E();
            D();
            a(((p.ct.c.d) (null)));
            e();
            return;
        }
    }

    public Vector p()
    {
        Vector vector = new Vector();
        y y1;
        for (Iterator iterator = v().b(h.b).iterator(); iterator.hasNext(); vector.add(new p.ct.c.c(this, y1.d(), y1.c())))
        {
            y1 = (y)iterator.next();
        }

        return vector;
    }

    public Vector q()
    {
        Vector vector = new Vector();
        y y1;
        for (Iterator iterator = v().b(h.a).iterator(); iterator.hasNext(); vector.add(new p.ct.c.c(this, y1.d(), y1.c())))
        {
            y1 = (y)iterator.next();
        }

        return vector;
    }

    public y r()
    {
        List list = v().b(h.b);
        if (list.size() > 1)
        {
            return (y)list.get(1);
        }
        if (list.size() == 1)
        {
            return (y)list.get(0);
        } else
        {
            return null;
        }
    }

    public void s()
    {
        if (p.cx.c.a().g() == null)
        {
            Bitmap bitmap = ((BitmapDrawable)b.a.h().getResources().getDrawable(0x7f0200ee)).getBitmap();
            ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
            bitmap.compress(android.graphics.Bitmap.CompressFormat.PNG, 100, bytearrayoutputstream);
            p.cx.c.a().a(bytearrayoutputstream.toByteArray());
        }
    }

    public void t()
    {
        boolean flag;
        if (p.cy.b.a() && p.cy.b.b() && b.a.u())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            if (p.ct.a.a() == null)
            {
                if (com.pandora.android.provider.b.a())
                {
                    android.app.Application application = b.a.h();
                    application.startService(new Intent(application, com/pandora/android/fordsync/AppLinkBluetoothService));
                    return;
                }
            } else
            if (p.ct.a.a().c())
            {
                l();
                return;
            } else
            {
                c("sync proxy not connected, register as listener when connected.");
                p.ct.a.a().a(C);
                return;
            }
        }
    }

    protected void u()
    {
        g("clearErrorState ");
        b b1 = b.a;
        b1.d(false);
        b1.a(-1, null);
        b1.e(false);
        b1.f(false);
    }

    protected i v()
    {
        if (B == null)
        {
            return null;
        } else
        {
            return B.y();
        }
    }
}
