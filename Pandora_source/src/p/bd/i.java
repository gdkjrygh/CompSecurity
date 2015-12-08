// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.bd;

import p.ax.a;
import p.bg.bv;
import p.bg.cd;
import p.bg.t;
import p.bh.w;
import p.bk.e;
import p.bm.b;

// Referenced classes of package p.bd:
//            j

public class i extends j
{

    public i(p.bf.a a1, String s, Boolean boolean1, String s1)
        throws a
    {
        super(a1, null, true, s, null, null, null, boolean1, null, null, null, null, s1, null, false, false, new b());
        e.a("Application constructed SyncProxyALM (using legacy constructor for BT transport) instance passing in: IProxyListener, appName, isMediaApp, appID", "42baba60-eb57-11df-98cf-0800200c9a66");
    }

    public void a()
        throws a
    {
        super.a(w.l);
    }

    public t b()
        throws a
    {
        if (h.booleanValue())
        {
            throw new a("This object has been disposed, it is no long capable of executing methods.", p.ax.b.l);
        }
        if (!d.booleanValue())
        {
            throw new a("SYNC is unavailable. Unable to get the displayCapabilities.", p.ax.b.o);
        } else
        {
            return r;
        }
    }

    public bv c()
        throws a
    {
        if (h.booleanValue())
        {
            throw new a("This object has been disposed, it is no long capable of executing methods.", p.ax.b.l);
        }
        if (!d.booleanValue())
        {
            throw new a("SYNC is unavailable. Unable to get the syncMsgVersion.", p.ax.b.o);
        } else
        {
            return n;
        }
    }

    public cd d()
        throws a
    {
        if (h.booleanValue())
        {
            throw new a("This object has been disposed, it is no long capable of executing methods.", p.ax.b.l);
        }
        if (!d.booleanValue())
        {
            throw new a("SYNC is not connected. Unable to get the vehicleType.", p.ax.b.o);
        } else
        {
            return z;
        }
    }
}
