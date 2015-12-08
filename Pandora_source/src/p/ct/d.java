// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ct;

import android.util.Log;
import p.bf.a;
import p.bg.aa;
import p.bg.ad;
import p.bg.ae;
import p.bg.af;
import p.bg.ag;
import p.bg.ah;
import p.bg.ai;
import p.bg.al;
import p.bg.am;
import p.bg.an;
import p.bg.ap;
import p.bg.ar;
import p.bg.as;
import p.bg.au;
import p.bg.ax;
import p.bg.ay;
import p.bg.bb;
import p.bg.bc;
import p.bg.be;
import p.bg.bf;
import p.bg.bh;
import p.bg.bj;
import p.bg.bl;
import p.bg.bm;
import p.bg.bq;
import p.bg.bt;
import p.bg.bu;
import p.bg.cb;
import p.bg.cc;
import p.bg.f;
import p.bg.l;
import p.bg.m;
import p.bg.o;
import p.bg.q;
import p.bg.r;
import p.bg.u;
import p.bg.v;
import p.bg.x;
import p.bh.b;
import p.bh.i;
import p.bh.s;
import p.bh.w;
import p.dm.e;

public abstract class d
    implements a
{

    protected i x;

    public d()
    {
        x = null;
    }

    public abstract boolean G();

    public void a(String s1, Exception exception)
    {
        g((new StringBuilder()).append("onError info=").append(s1).append(" error=").append(exception.getMessage()).toString());
    }

    public void a(String s1, Exception exception, w w)
    {
        Log.d("AppLink", (new StringBuilder()).append("onProxyClosed disconnectedReason = ").append(w).toString());
    }

    public void a(aa aa)
    {
    }

    public void a(ad ad)
    {
    }

    public void a(ae ae1)
    {
        g((new StringBuilder()).append("onOnButtonEvent success=").append(ae1.c()).toString());
    }

    public void a(af af1)
    {
        g((new StringBuilder()).append("onOnButtonPress success=").append(af1.c()).toString());
    }

    public void a(ag ag1)
    {
        g((new StringBuilder()).append("onOnCommand success=").append(ag1.c()).toString());
    }

    public void a(ah ah)
    {
    }

    public void a(ai ai1)
    {
        Log.d("FORDSYNC", (new StringBuilder()).append("AbstractSyncProxyListener.java > onOnHMIStatus > HMILevel = ").append(ai1.c()).append("AudioStreamingState = ").append(ai1.d()).toString());
        x = ai1.c();
        boolean flag = b.a.equals(ai1.d());
        ae();
        if (G())
        {
            if (flag)
            {
                c();
            } else
            {
                b();
            }
        }
        if (ai1.c() == i.d)
        {
            g("onOnHMIStatus level = HMI_NONE - onDismissAccessoryScreen");
            n();
            return;
        } else
        {
            m();
            return;
        }
    }

    public void a(al al)
    {
    }

    public void a(am am1)
    {
    }

    public void a(an an)
    {
    }

    public void a(ap ap)
    {
    }

    public void a(ar ar)
    {
    }

    public void a(as as)
    {
    }

    public void a(au au1)
    {
        g((new StringBuilder()).append("onPerformInteractionResponse success=").append(au1.d()).toString());
    }

    public void a(ax ax)
    {
    }

    public void a(ay ay)
    {
    }

    public void a(p.bg.b b1)
    {
        g((new StringBuilder()).append("onAddCommandResponse success=").append(b1.d()).append(" code=").append(b1.e().name()).toString());
    }

    public void a(bb bb1)
    {
        g((new StringBuilder()).append("onResetGlobalPropertiesResponse success=").append(bb1.d()).toString());
    }

    public void a(bc bc)
    {
    }

    public void a(be be)
    {
    }

    public void a(bf bf)
    {
    }

    public void a(bh bh1)
    {
        g((new StringBuilder()).append("onSetGlobalPropertiesResponse success=").append(bh1.d()).toString());
    }

    public void a(bj bj1)
    {
        g((new StringBuilder()).append("onSetMediaClockTimerResponse success=").append(bj1.d()).toString());
    }

    public void a(bl bl1)
    {
        g((new StringBuilder()).append("onShowResponse success=").append(bl1.d()).toString());
    }

    public void a(bm bm)
    {
    }

    public void a(bq bq1)
    {
        g((new StringBuilder()).append("onSpeakResponse success=").append(bq1.d()).toString());
    }

    public void a(bt bt1)
    {
        g((new StringBuilder()).append("onSubscribeButtonResponse success=").append(bt1.d()).toString());
    }

    public void a(bu bu)
    {
    }

    public void a(cb cb1)
    {
        g((new StringBuilder()).append("onUnsubscribeButtonResponse success=").append(cb1.d()).toString());
    }

    public void a(cc cc)
    {
    }

    public void a(p.bg.d d1)
    {
        g((new StringBuilder()).append("onAddSubMenuResponse success=").append(d1.d()).toString());
    }

    public void a(f f1)
    {
        g((new StringBuilder()).append("onAlertResponse success=").append(f1.d()).append(" resultCode=").append(f1.e()).toString());
    }

    public void a(p.bg.i j)
    {
    }

    public void a(l l1)
    {
        g((new StringBuilder()).append("onCreateInteractionChoiceSetResponse success=").append(l1.d()).toString());
    }

    public void a(m m1)
    {
        g((new StringBuilder()).append("onDeleteCommandResponse success=").append(m1.d()).toString());
    }

    public void a(o o)
    {
    }

    public void a(q q1)
    {
        g((new StringBuilder()).append("onDeleteInteractionChoiceSetResponse success=").append(q1.d()).toString());
    }

    public void a(r r1)
    {
        g((new StringBuilder()).append("onDeleteSubMenuResponse success=").append(r1.d()).toString());
    }

    public void a(p.bg.s s1)
    {
    }

    public void a(u u)
    {
    }

    public void a(v v1)
    {
        g((new StringBuilder()).append("onGenericResponse success=").append(v1.d()).toString());
    }

    public void a(p.bg.w w)
    {
    }

    public void a(x x1)
    {
    }

    public abstract void ae();

    public i am()
    {
        if (x == null)
        {
            return i.d;
        } else
        {
            return x;
        }
    }

    public abstract void b();

    public abstract void c();

    protected void g(String s1)
    {
        while (!G() || !p.dm.m.bg.a(e.b)) 
        {
            return;
        }
        StringBuffer stringbuffer = new StringBuffer("AppLink [");
        stringbuffer.append(p.dm.m.a(this));
        stringbuffer.append("] ");
        stringbuffer.append(s1);
        p.dm.m.m(stringbuffer.toString());
    }

    public abstract void m();

    public abstract void n();
}
