// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.h;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.util.Log;
import com.google.android.m4b.maps.g.a;
import com.google.android.m4b.maps.j.m;
import com.google.android.m4b.maps.j.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.google.android.m4b.maps.h:
//            i, h, q, b

public final class e
    implements i
{

    private final h a;

    public e(h h1)
    {
        a = h1;
    }

    private void a(h.e e1)
    {
        a.a(e1);
        Object obj = a;
        b.c c1 = e1.b();
        obj = (b.a)((h) (obj)).l.get(c1);
        x.a(obj, "Appropriate Api was not requested.");
        if (!((b.a) (obj)).e() && a.m.containsKey(e1.b()))
        {
            e1.c(new q(17));
            return;
        } else
        {
            e1.b(((b.a) (obj)));
            return;
        }
    }

    public final c.a a(c.a a1)
    {
        return b(a1);
    }

    public final void a()
    {
        while (!a.f.isEmpty()) 
        {
            try
            {
                a((h.e)a.f.remove());
            }
            catch (DeadObjectException deadobjectexception)
            {
                Log.w("GoogleApiClientConnected", "Service died while flushing queue", deadobjectexception);
            }
        }
    }

    public final void a(int j)
    {
        Object obj;
        Object obj1;
        Object obj2;
        d.b b1;
        int k;
        if (j == -1)
        {
            k = 1;
        } else
        {
            k = 0;
        }
        if (k != 0)
        {
            a.f();
            a.m.clear();
        } else
        {
            obj = a.s.iterator();
            while (((Iterator) (obj)).hasNext()) 
            {
                ((h.e)((Iterator) (obj)).next()).b(new q(8, "The connection to Google Play services was lost"));
            }
        }
        a.a(null);
        if (k != 0) goto _L2; else goto _L1
_L1:
        obj1 = a.c;
        ((m) (obj1)).h.removeMessages(1);
        obj = ((m) (obj1)).i;
        obj;
        JVM INSTR monitorenter ;
        obj1.g = true;
        obj2 = new ArrayList(((m) (obj1)).b);
        k = ((m) (obj1)).f.get();
        obj2 = ((ArrayList) (obj2)).iterator();
        do
        {
            if (!((Iterator) (obj2)).hasNext())
            {
                break;
            }
            b1 = (d.b)((Iterator) (obj2)).next();
            if (!((m) (obj1)).e || ((m) (obj1)).f.get() != k)
            {
                break;
            }
            if (((m) (obj1)).b.contains(b1))
            {
                b1.a(j);
            }
        } while (true);
        break MISSING_BLOCK_LABEL_227;
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
        ((m) (obj1)).c.clear();
        obj1.g = false;
        obj;
        JVM INSTR monitorexit ;
_L2:
        a.c.a();
        return;
    }

    public final void a(Bundle bundle)
    {
    }

    public final void a(a a1, b b1, int j)
    {
    }

    public final c.a b(c.a a1)
    {
        try
        {
            a(a1);
        }
        catch (DeadObjectException deadobjectexception)
        {
            a(1);
            return a1;
        }
        return a1;
    }

    public final void b()
    {
    }

    public final void b(int j)
    {
        h h1;
        switch (j)
        {
        default:
            return;

        case 2: // '\002'
            a(j);
            a.b();
            return;

        case 1: // '\001'
            h1 = a;
            break;
        }
        if (!h1.g)
        {
            h1.g = true;
            if (h1.k == null)
            {
                h1.k = new h.b(h1);
                IntentFilter intentfilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
                intentfilter.addDataScheme("package");
                h1.d.getApplicationContext().registerReceiver(h1.k, intentfilter);
            }
            h1.j.sendMessageDelayed(h1.j.obtainMessage(1), h1.h);
            h1.j.sendMessageDelayed(h1.j.obtainMessage(2), h1.i);
        }
        a(j);
    }

    public final String c()
    {
        return "CONNECTED";
    }
}
