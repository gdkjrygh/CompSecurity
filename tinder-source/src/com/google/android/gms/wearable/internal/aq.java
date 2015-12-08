// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.u;
import com.google.android.gms.internal.dp;
import com.google.android.gms.wearable.f;
import java.util.List;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            AmsEntityUpdateParcelable, AncsNotificationParcelable, CapabilityInfoParcelable, ChannelEventParcelable, 
//            MessageEventParcelable, NodeParcelable

final class aq extends x.a
{

    final IntentFilter a[];
    final String b = null;
    final String c = null;
    private dp d;
    private dp e;
    private dp f;
    private dp g;
    private dp h;
    private dp i;
    private dp j;
    private dp k;

    private aq(IntentFilter aintentfilter[])
    {
        a = aintentfilter;
    }

    public static aq a(dp dp1)
    {
        aq aq1 = new aq(null);
        aq1.d = (dp)u.a(dp1);
        return aq1;
    }

    public static aq a(dp dp1, IntentFilter aintentfilter[])
    {
        aintentfilter = new aq(aintentfilter);
        aintentfilter.f = (dp)u.a(dp1);
        return aintentfilter;
    }

    public static aq b(dp dp1)
    {
        aq aq1 = new aq(null);
        aq1.e = (dp)u.a(dp1);
        return aq1;
    }

    public static aq b(dp dp1, IntentFilter aintentfilter[])
    {
        aintentfilter = new aq(aintentfilter);
        aintentfilter.g = (dp)u.a(dp1);
        return aintentfilter;
    }

    public static aq c(dp dp1)
    {
        aq aq1 = new aq(null);
        aq1.h = (dp)u.a(dp1);
        return aq1;
    }

    public static aq d(dp dp1)
    {
        aq aq1 = new aq(null);
        aq1.i = (dp)u.a(dp1);
        return aq1;
    }

    public static aq e(dp dp1)
    {
        aq aq1 = new aq(null);
        aq1.j = (dp)u.a(dp1);
        return aq1;
    }

    private static void f(dp dp1)
    {
        if (dp1 != null)
        {
            dp1.a = null;
        }
    }

    public final void a()
    {
        f(d);
        d = null;
        f(e);
        e = null;
        f(f);
        f = null;
        f(g);
        g = null;
        f(h);
        h = null;
        f(i);
        i = null;
        f(j);
        j = null;
        f(k);
        k = null;
    }

    public final void a(DataHolder dataholder)
    {
        if (f != null)
        {
            f.a(new com.google.android.gms.internal.dp.b(dataholder) {

                final DataHolder a;

                public final void a()
                {
                    a.b();
                }

                public final void a(Object obj)
                {
                    obj = (com.google.android.gms.wearable.d.b)obj;
                    ((com.google.android.gms.wearable.d.b) (obj)).onDataChanged(new f(a));
                    a.b();
                    return;
                    obj;
                    a.b();
                    throw obj;
                }

            
            {
                a = dataholder;
                super();
            }
            });
            return;
        } else
        {
            dataholder.b();
            return;
        }
    }

    public final void a(AmsEntityUpdateParcelable amsentityupdateparcelable)
    {
        if (d != null)
        {
            d.a(new com.google.android.gms.internal.dp.b(amsentityupdateparcelable) {

                final AmsEntityUpdateParcelable a;

                public final void a()
                {
                }

                public final void a(Object obj)
                {
                }

            
            {
                a = amsentityupdateparcelable;
                super();
            }
            });
        }
    }

    public final void a(AncsNotificationParcelable ancsnotificationparcelable)
    {
        if (e != null)
        {
            e.a(new com.google.android.gms.internal.dp.b(ancsnotificationparcelable) {

                final AncsNotificationParcelable a;

                public final void a()
                {
                }

                public final void a(Object obj)
                {
                }

            
            {
                a = ancsnotificationparcelable;
                super();
            }
            });
        }
    }

    public final void a(CapabilityInfoParcelable capabilityinfoparcelable)
    {
        if (k != null)
        {
            k.a(new com.google.android.gms.internal.dp.b(capabilityinfoparcelable) {

                final CapabilityInfoParcelable a;

                public final void a()
                {
                }

                public final void a(Object obj)
                {
                    ((com.google.android.gms.wearable.a.a)obj).onCapabilityChanged(a);
                }

            
            {
                a = capabilityinfoparcelable;
                super();
            }
            });
        }
    }

    public final void a(ChannelEventParcelable channeleventparcelable)
    {
        if (j != null)
        {
            j.a(new com.google.android.gms.internal.dp.b(channeleventparcelable) {

                final ChannelEventParcelable a;

                public final void a()
                {
                }

                public final void a(Object obj)
                {
                    obj = (com.google.android.gms.wearable.c.a)obj;
                    a.a(((com.google.android.gms.wearable.c.a) (obj)));
                }

            
            {
                a = channeleventparcelable;
                super();
            }
            });
        }
    }

    public final void a(MessageEventParcelable messageeventparcelable)
    {
        if (g != null)
        {
            g.a(new com.google.android.gms.internal.dp.b(messageeventparcelable) {

                final MessageEventParcelable a;

                public final void a()
                {
                }

                public final void a(Object obj)
                {
                    ((com.google.android.gms.wearable.k.a)obj).onMessageReceived(a);
                }

            
            {
                a = messageeventparcelable;
                super();
            }
            });
        }
    }

    public final void a(NodeParcelable nodeparcelable)
    {
        if (h != null)
        {
            h.a(new com.google.android.gms.internal.dp.b(nodeparcelable) {

                final NodeParcelable a;

                public final void a()
                {
                }

                public final void a(Object obj)
                {
                    ((com.google.android.gms.wearable.n.a)obj).onPeerConnected(a);
                }

            
            {
                a = nodeparcelable;
                super();
            }
            });
        }
    }

    public final void a(List list)
    {
        if (i != null)
        {
            i.a(new com.google.android.gms.internal.dp.b(list) {

                final List a;

                public final void a()
                {
                }

                public final void a(Object obj)
                {
                    ((com.google.android.gms.wearable.n.b)obj).onConnectedNodes(a);
                }

            
            {
                a = list;
                super();
            }
            });
        }
    }

    public final void b(NodeParcelable nodeparcelable)
    {
        if (h != null)
        {
            h.a(new com.google.android.gms.internal.dp.b(nodeparcelable) {

                final NodeParcelable a;

                public final void a()
                {
                }

                public final void a(Object obj)
                {
                    ((com.google.android.gms.wearable.n.a)obj).onPeerDisconnected(a);
                }

            
            {
                a = nodeparcelable;
                super();
            }
            });
        }
    }
}
