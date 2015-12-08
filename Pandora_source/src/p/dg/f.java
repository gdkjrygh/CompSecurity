// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.dg;

import android.app.KeyguardManager;
import android.content.Context;
import android.media.AudioManager;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import com.pandora.radio.util.l;
import java.security.InvalidParameterException;
import p.cw.b;
import p.cw.c;
import p.dd.ag;
import p.dd.bh;
import p.dd.k;
import p.df.a;

public class f
{

    protected boolean a;
    protected c b;
    protected boolean c;
    protected k d;
    private AudioManager e;
    private android.media.AudioManager.OnAudioFocusChangeListener f;
    private PhoneStateListener g;

    public f(c c1)
    {
        a = false;
        c = false;
        d = null;
        f = new android.media.AudioManager.OnAudioFocusChangeListener() {

            final f a;

            public void onAudioFocusChange(int i)
            {
                boolean flag;
                flag = false;
                p.dg.f.a(a, (new StringBuilder()).append("Audio focus change: ").append(i).toString());
                i;
                JVM INSTR tableswitch -3 1: default 64
            //                           -3 157
            //                           -2 91
            //                           -1 91
            //                           0 64
            //                           1 65;
                   goto _L1 _L2 _L3 _L3 _L1 _L4
_L1:
                return;
_L4:
                if (a.a)
                {
                    a.a = false;
                    p.dg.f.a(a);
                    return;
                }
                continue; /* Loop/switch isn't completed */
_L3:
                a.a = true;
                if (a.d != null)
                {
                    flag = a.d.a;
                }
                if (!flag)
                {
                    b b1 = p.dg.f.b(a);
                    b1.b(b1.u());
                    b1.b(p.cw.b.c.b);
                    return;
                }
                if (true) goto _L1; else goto _L2
_L2:
                a.a = true;
                p.dg.f.b(a).x();
                return;
            }

            
            {
                a = f.this;
                super();
            }
        };
        g = new PhoneStateListener() {

            int a;
            final f b;

            public void onCallStateChanged(int i, String s)
            {
                i;
                JVM INSTR tableswitch 0 2: default 28
            //                           0 58
            //                           1 34
            //                           2 46;
                   goto _L1 _L2 _L3 _L4
_L1:
                a = i;
                return;
_L3:
                p.dg.f.a(b, "onCallStateChanged: Call Ringing");
                continue; /* Loop/switch isn't completed */
_L4:
                p.dg.f.a(b, "onCallStateChanged: Call Off Hook");
                continue; /* Loop/switch isn't completed */
_L2:
                p.dg.f.a(b, "onCallStateChanged: Call IDLE");
                if (a != 0)
                {
                    try
                    {
                        s = p.dg.f.b(b);
                        if (s.u() == p.cw.b.a.c && s.v() == p.cw.b.a.b && !b.a)
                        {
                            p.dg.f.a(b, "onCallStateChanged: fallback broadcast FOCUS_GAINED");
                            p.dg.f.a(b);
                        }
                    }
                    // Misplaced declaration of an exception variable
                    catch (String s)
                    {
                        p.df.a.a("MusicPlayerFocusHelper", (new StringBuilder()).append("Handling non problematic exception for debugging purposes - ").append(s.toString()).toString());
                    }
                }
                if (true) goto _L1; else goto _L5
_L5:
            }

            
            {
                b = f.this;
                super();
                a = 0;
            }
        };
        b = c1;
        c1.b(this);
        e = (AudioManager)l.a(c1.s(), "audio");
        ((TelephonyManager)l.a(c1.s(), "phone")).listen(g, 32);
    }

    private void a(String s)
    {
        p.df.a.c("MusicPlayerFocusHelper", (new StringBuilder()).append("MUSIC FOCUS - ").append(s).toString());
    }

    private void a(String s, int i)
    {
        i;
        JVM INSTR tableswitch 0 1: default 24
    //                   0 53
    //                   1 47;
           goto _L1 _L2 _L3
_L1:
        String s1 = "UNKOWN AUDIOFOCUS REQUEST RESULT";
_L5:
        p.df.a.a("MusicPlayerFocusHelper", "%s: %s", new Object[] {
            s, s1
        });
        return;
_L3:
        s1 = "AUDIOFOCUS_REQUEST_GRANTED";
        continue; /* Loop/switch isn't completed */
_L2:
        s1 = "AUDIOFOCUS_REQUEST_FAILED";
        if (true) goto _L5; else goto _L4
_L4:
    }

    static void a(f f1)
    {
        f1.e();
    }

    static void a(f f1, String s)
    {
        f1.a(s);
    }

    static b b(f f1)
    {
        return f1.d();
    }

    private b d()
    {
        return b.d();
    }

    private void e()
    {
        b b1 = d();
        if (!b1.o())
        {
            if (b1.v() == p.cw.b.a.b)
            {
                b1.a(p.cw.b.c.b);
            }
            return;
        } else
        {
            b1.l();
            return;
        }
    }

    private boolean f()
    {
        boolean flag1 = false;
        boolean flag;
        boolean flag2;
        if (d == null)
        {
            flag = false;
        } else
        {
            flag = d.a;
        }
        flag2 = ((KeyguardManager)b.s().getSystemService("keyguard")).inKeyguardRestrictedInputMode();
        if (a || flag2 || flag)
        {
            flag1 = true;
        }
        return flag1;
    }

    public void a()
    {
        b.c(this);
        c();
        b();
        e = null;
        f = null;
    }

    public void a(int i)
    {
        if (e != null && f != null)
        {
            a("requestMusicFocus", e.requestAudioFocus(f, 3, i));
        }
    }

    public void b()
    {
        ((TelephonyManager)l.a(b.s(), "phone")).listen(g, 0);
    }

    public void c()
    {
        if (e != null && f != null)
        {
            a("abandonMusicFocus", e.abandonAudioFocus(f));
        }
    }

    public void onCastingStateEvent(k k1)
    {
        d = k1;
    }

    public void onPlayerStateChange(ag ag1)
    {
        static class _cls3
        {

            static final int a[];
            static final int b[];

            static 
            {
                b = new int[p.dd.bh.a.values().length];
                try
                {
                    b[p.dd.bh.a.b.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror9) { }
                try
                {
                    b[p.dd.bh.a.e.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    b[p.dd.bh.a.a.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    b[p.dd.bh.a.c.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    b[p.dd.bh.a.d.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                a = new int[p.cw.b.a.values().length];
                try
                {
                    a[p.cw.b.a.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[p.cw.b.a.c.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[p.cw.b.a.b.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[p.cw.b.a.e.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[p.cw.b.a.d.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (p.dg._cls3.a[ag1.a.ordinal()])
        {
        default:
            throw new InvalidParameterException((new StringBuilder()).append("onPlayerStateChangeEvent called with unknown PlayerStateChangeEvent state: ").append(ag1.a).toString());

        case 4: // '\004'
        case 5: // '\005'
            c();
            // fall through

        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            return;
        }
    }

    public void onTrackState(bh bh1)
    {
        p.dg._cls3.b[bh1.a.ordinal()];
        JVM INSTR tableswitch 1 5: default 44
    //                   1 79
    //                   2 79
    //                   3 79
    //                   4 74
    //                   5 80;
           goto _L1 _L2 _L2 _L2 _L3 _L4
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        throw new IllegalArgumentException((new StringBuilder()).append("onTrackState: unknown event type ").append(bh1.a).toString());
_L3:
        a(1);
_L6:
        return;
_L4:
        if (!f())
        {
            c();
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }
}
