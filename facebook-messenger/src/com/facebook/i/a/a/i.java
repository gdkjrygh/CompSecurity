// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.i.a.a;

import android.net.Uri;
import android.os.Bundle;
import android.os.Message;
import com.facebook.common.e.h;
import com.facebook.i.a.a;
import com.facebook.i.a.b;
import com.facebook.i.a.q;
import com.facebook.i.a.r;
import com.facebook.i.a.s;
import com.google.common.a.fi;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;

// Referenced classes of package com.facebook.i.a.a:
//            g, b, h

class i
    implements q, r
{

    final g a;

    private i(g g1)
    {
        a = g1;
        super();
    }

    i(g g1, com.facebook.i.a.a.h h1)
    {
        this(g1);
    }

    public void a(a a1)
    {
        com.facebook.debug.log.b.c(a.a, "onPeerDisconnected from peer: %s, self: %s", new Object[] {
            a1.c, com.facebook.i.a.a.g.b(a).b().c
        });
        g g1 = a;
        g1;
        JVM INSTR monitorenter ;
        Set set = (Set)g.e(a).get(a1);
        if (set == null)
        {
            break MISSING_BLOCK_LABEL_282;
        }
        Iterator iterator;
        if (set.isEmpty())
        {
            break MISSING_BLOCK_LABEL_282;
        }
        iterator = set.iterator();
_L1:
        com.facebook.i.a.a.b b2;
        SortedSet sortedset;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_282;
        }
        b2 = (com.facebook.i.a.a.b)iterator.next();
        b2.a();
        sortedset = (SortedSet)g.f(a).get(b2.c());
        if (sortedset != null)
        {
            break MISSING_BLOCK_LABEL_241;
        }
        com.facebook.debug.log.b.e(a.a, "Invalid state: there should be roles for base uri %s when %s disconnected.", new Object[] {
            b2.c(), a1.c
        });
        g.g(a).a(a.a.getSimpleName(), (new StringBuilder()).append("Invalid state: there should be roles for base uri ").append(b2.c()).append(" when ").append(a1.c).append(" disconnected.").toString());
          goto _L1
        a1;
        g1;
        JVM INSTR monitorexit ;
        throw a1;
        sortedset.remove(b2);
        if (sortedset.isEmpty())
        {
            g.f(a).remove(b2.c());
        }
          goto _L1
        g.e(a).remove(a1);
        g1;
        JVM INSTR monitorexit ;
        if (set != null)
        {
            com.facebook.i.a.a.b b1;
            for (a1 = set.iterator(); a1.hasNext(); com.facebook.i.a.a.g.a(a, Uri.withAppendedPath(b1.c(), "disconnected"), false))
            {
                b1 = (com.facebook.i.a.a.b)a1.next();
            }

        }
        return;
    }

    public void a(a a1, Message message)
    {
        Bundle bundle = message.getData();
        if (com.facebook.i.a.a.g.a(a) != null)
        {
            bundle.setClassLoader(com.facebook.i.a.a.g.a(a));
        }
        switch (message.what)
        {
        default:
            return;

        case 1000000000: 
            com.facebook.debug.log.b.c(a.a, "Receive message MSG_CLONE_PEER_ON_CONNECTED from peer %s, self: %s", new Object[] {
                a1.c, com.facebook.i.a.a.g.b(a).b().c
            });
            com.facebook.i.a.a.g.a(a, a1, bundle);
            return;

        case 1000000001: 
            com.facebook.debug.log.b.c(a.a, "Receive message MSG_SET_STATE from peer %s, self: %s", new Object[] {
                a1.c, com.facebook.i.a.a.g.b(a).b().c
            });
            break;
        }
        com.facebook.i.a.a.g.b(a, a1, bundle);
    }

    public void a(a a1, s s)
    {
        com.facebook.debug.log.b.c(a.a, "onPeerConnected to peer: %s, self: %s, Direction: %s", new Object[] {
            a1.c, com.facebook.i.a.a.g.b(a).b().c, s
        });
        if (!g.c(a).isEmpty())
        {
            s = g.d(a);
            com.facebook.i.a.a.g.b(a).a(a1, s);
        }
    }
}
