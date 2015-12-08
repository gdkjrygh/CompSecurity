// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.dk;

import android.os.Handler;
import com.pandora.radio.data.PromotedStation;
import com.pandora.radio.data.aa;
import com.pandora.radio.data.af;
import com.pandora.radio.util.i;
import java.util.Map;
import p.cw.c;
import p.dd.ah;
import p.dd.ay;
import p.dd.bh;
import p.dd.bo;
import p.df.a;
import p.di.g;
import p.di.k;

// Referenced classes of package p.dk:
//            a

public class b
    implements p.dk.a
{

    private c a;
    private Handler b;
    private PromotedStation c;
    private k d;
    private long e;
    private Map f;
    private final Runnable g = new Runnable() {

        final b a;

        public void run()
        {
            p.df.a.a("PromotedStationManager", "Refresh timeout has been reached.");
            a.a(a.a.d);
        }

            
            {
                a = b.this;
                super();
            }
    };

    public b(c c1)
    {
        if (c1 == null)
        {
            throw new IllegalArgumentException("Radio cannot be null!");
        } else
        {
            a = c1;
            b = new Handler();
            a.b(this);
            return;
        }
    }

    private void c()
    {
        if (e == 0L)
        {
            p.df.a.b("PromotedStationManager", "Invalid refresh interval, not refreshing");
            return;
        } else
        {
            d();
            p.df.a.a("PromotedStationManager", "Starting refresh timeout.");
            b.postDelayed(g, e);
            return;
        }
    }

    private void d()
    {
        p.df.a.a("PromotedStationManager", "Cancelling refresh timeout.");
        b.removeCallbacks(g);
    }

    public void a()
    {
        (new g()).execute(new Object[] {
            a, c
        });
        c = null;
        a(p.dk.a.a.c);
    }

    public boolean a(a.a a1)
    {
        if (d != null && d.getStatus() != android.os.AsyncTask.Status.FINISHED)
        {
            p.df.a.a("PromotedStationManager", "Promoted station fetch already in progress.");
            return false;
        } else
        {
            d();
            p.df.a.a("PromotedStationManager", (new StringBuilder()).append("Refreshing Promoted Station: ").append(a1.name()).toString());
            d = new k(f);
            d.execute(new Object[] {
                a
            });
            return true;
        }
    }

    public void b()
    {
        d();
        if (d != null)
        {
            d.cancel(true);
            d = null;
        }
        c = null;
        a.c(this);
    }

    public void onPromotedStationRadioEvent(ah ah1)
    {
        p.df.a.a("PromotedStationManager", "Received new PromotedStation");
        d = null;
        c = ah1.a;
        c();
    }

    public void onStationStateChangedRadioEvent(ay ay1)
    {
        static class _cls2
        {

            static final int a[];

            static 
            {
                a = new int[p.dd.ay.a.values().length];
                try
                {
                    a[p.dd.ay.a.b.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[p.dd.ay.a.a.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[p.dd.ay.a.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[p.dd.ay.a.d.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (p.dk._cls2.a[ay1.b.ordinal()])
        {
        default:
            throw new IllegalStateException((new StringBuilder()).append("Unknown station state change type: ").append(ay1.b.name()).toString());

        case 1: // '\001'
        case 2: // '\002'
            a(p.dk.a.a.a);
            // fall through

        case 3: // '\003'
        case 4: // '\004'
            return;
        }
    }

    public void onTrackState(bh bh1)
    {
        if (bh1.a == p.dd.bh.a.b)
        {
            bh1 = bh1.b;
            if (bh1 != null)
            {
                f = i.e(bh1.x());
            }
        }
    }

    public void onUserData(bo bo1)
    {
        if (bo1.a != null)
        {
            e = (long)bo1.a.B() * 1000L;
        }
    }

    public ah producePromotedStation()
    {
        if (c == null)
        {
            return null;
        } else
        {
            return new ah(c);
        }
    }
}
