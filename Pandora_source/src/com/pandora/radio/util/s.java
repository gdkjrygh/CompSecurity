// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.radio.util;

import android.content.Context;
import android.media.AudioManager;
import com.pandora.radio.data.af;
import p.cw.b;
import p.cw.c;
import p.dd.an;
import p.dd.ap;
import p.dd.ay;
import p.dd.bb;
import p.dd.be;
import p.dd.bh;
import p.dd.bu;
import p.dd.e;
import p.dd.x;
import p.df.a;

// Referenced classes of package com.pandora.radio.util:
//            k

public class s
{

    private c a;
    private af b;
    private boolean c;
    private int d;
    private volatile boolean e;
    private boolean f;

    public s(c c1)
    {
        a = c1;
        c1.b(this);
    }

    private void a(String s1)
    {
        p.df.a.c("ZERO VOLUME AUTO PAUSE HANDLER", s1);
    }

    private boolean f()
    {
        if (((AudioManager)a.s().getSystemService("audio")).getStreamVolume(3) > 0)
        {
            return false;
        }
        boolean flag;
        boolean flag1;
        if (a.d().o() && !c)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag && !a.C())
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        return flag1;
    }

    public void a()
    {
        a.c(this);
    }

    public boolean b()
    {
        if (b == null || !b.y())
        {
            return false;
        }
        boolean flag = f();
        a((new StringBuilder()).append("auto pause condition: ").append(flag).toString());
        if (flag)
        {
            if (d >= b.A())
            {
                if (!f)
                {
                    e = true;
                    f = true;
                    d = 0;
                    a("should auto paused");
                    a.o().e("auto_paused");
                    return true;
                }
                a("back to back happened");
                a.o().e("back_to_back");
            } else
            {
                d = d + 1;
                a((new StringBuilder()).append("trackCounterAtZeroVolume incremented now: ").append(d).toString());
            }
        } else
        {
            f = false;
            c = false;
        }
        return false;
    }

    public void c()
    {
        e = false;
    }

    public boolean d()
    {
        return e;
    }

    public void e()
    {
        c = true;
    }

    public void onAutomotiveAccessoryRadioEvent(e e1)
    {
        if (e1.a == p.dd.e.a.a)
        {
            e = false;
        }
    }

    public void onListeningTimeoutRadioEvent(x x)
    {
        c = true;
    }

    public void onSignInState(an an1)
    {
        b = an1.a;
    }

    public void onSkipTrack(ap ap)
    {
        c = true;
    }

    public void onStationChange(ay ay)
    {
        e = false;
        c = true;
    }

    public void onThumbDown(bb bb1)
    {
        if (bb1.a == p.cw.d.a.a)
        {
            c = true;
        }
    }

    public void onTiredOfTrack(be be)
    {
        c = true;
    }

    public void onTrackState(bh bh1)
    {
        static class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[p.dd.bh.a.values().length];
                try
                {
                    a[p.dd.bh.a.b.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[p.dd.bh.a.d.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[p.dd.bh.a.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[p.dd.bh.a.a.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[p.dd.bh.a.e.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (com.pandora.radio.util._cls1.a[bh1.a.ordinal()])
        {
        default:
            throw new IllegalArgumentException((new StringBuilder()).append("onTrackState: unknown event type ").append(bh1.a).toString());

        case 3: // '\003'
            e = false;
            // fall through

        case 1: // '\001'
        case 2: // '\002'
        case 4: // '\004'
        case 5: // '\005'
            return;
        }
    }

    public bu produceZeroVolumeAutoPauseEvent()
    {
        a("produceZeroVolumeAutoPauseEvent called");
        if (e)
        {
            return new bu(e);
        } else
        {
            return null;
        }
    }
}
