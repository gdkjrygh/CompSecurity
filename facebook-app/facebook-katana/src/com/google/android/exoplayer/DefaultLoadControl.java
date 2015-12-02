// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer;

import android.os.Handler;
import com.facebook.tools.dextr.runtime.detour.HandlerDetour;
import com.google.android.exoplayer.upstream.Allocator;
import com.google.android.exoplayer.upstream.NetworkLock;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

// Referenced classes of package com.google.android.exoplayer:
//            LoadControl

public final class DefaultLoadControl
    implements LoadControl
{

    private final Allocator a;
    private final List b;
    private final HashMap c;
    private final Handler d;
    private final EventListener e;
    private final long f;
    private final long g;
    private final float h;
    private final float i;
    private int j;
    private long k;
    private int l;
    private boolean m;
    private boolean n;

    public DefaultLoadControl(Allocator allocator)
    {
        this(allocator, null, null);
    }

    private DefaultLoadControl(Allocator allocator, Handler handler, EventListener eventlistener)
    {
        this(allocator, handler, eventlistener, 15000, 30000, 0.2F, 0.8F);
    }

    private DefaultLoadControl(Allocator allocator, Handler handler, EventListener eventlistener, int i1, int j1, float f1, float f2)
    {
        a = allocator;
        d = handler;
        e = eventlistener;
        b = new ArrayList();
        c = new HashMap();
        f = (long)i1 * 1000L;
        g = (long)j1 * 1000L;
        h = f1;
        i = f2;
    }

    private int a(int i1)
    {
        float f1 = (float)i1 / (float)j;
        if (f1 > i)
        {
            return 0;
        }
        return f1 >= h ? 1 : 2;
    }

    private int a(long l1, long l2)
    {
        if (l2 != -1L)
        {
            if ((l1 = l2 - l1) <= g)
            {
                return l1 >= f ? 1 : 2;
            }
        }
        return 0;
    }

    private void a(boolean flag)
    {
        if (d != null && e != null)
        {
            HandlerDetour.a(d, new _cls1(flag), 0xd25d9277);
        }
    }

    private void c()
    {
        boolean flag1;
        boolean flag2 = false;
        int j1 = l;
        int i1 = 0;
        boolean flag = false;
        flag1 = false;
        while (i1 < b.size()) 
        {
            LoaderState loaderstate = (LoaderState)c.get(b.get(i1));
            boolean flag3 = flag1 | loaderstate.c;
            if (loaderstate.d != -1L)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            flag |= flag1;
            j1 = Math.max(j1, loaderstate.b);
            i1++;
            flag1 = flag3;
        }
        Object obj;
        long l1;
        boolean flag4;
        if (!b.isEmpty() && (flag1 || flag) && (j1 == 2 || j1 == 1 && m))
        {
            flag4 = true;
        } else
        {
            flag4 = false;
        }
        m = flag4;
        if (!m || n) goto _L2; else goto _L1
_L1:
        NetworkLock.a.a(0);
        n = true;
        a(true);
_L4:
        k = -1L;
        if (m)
        {
            for (i1 = ((flag2) ? 1 : 0); i1 < b.size(); i1++)
            {
                obj = b.get(i1);
                l1 = ((LoaderState)c.get(obj)).d;
                if (l1 != -1L && (k == -1L || l1 < k))
                {
                    k = l1;
                }
            }

        }
        break; /* Loop/switch isn't completed */
_L2:
        if (!m && n && !flag1)
        {
            NetworkLock.a.b(0);
            n = false;
            a(false);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void a()
    {
        a.a(j);
    }

    public final void a(Object obj)
    {
        b.remove(obj);
        obj = (LoaderState)c.remove(obj);
        j = j - ((LoaderState) (obj)).a;
        c();
    }

    public final void a(Object obj, int i1)
    {
        b.add(obj);
        c.put(obj, new LoaderState(i1));
        j = j + i1;
    }

    public final boolean a(Object obj, long l1, long l2, boolean flag)
    {
        int i1 = a(l1, l2);
        obj = (LoaderState)c.get(obj);
        boolean flag1;
        boolean flag2;
        int j1;
        int k1;
        if (((LoaderState) (obj)).b != i1 || ((LoaderState) (obj)).d != l2 || ((LoaderState) (obj)).c != flag)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag1)
        {
            obj.b = i1;
            obj.d = l2;
            obj.c = flag;
        }
        j1 = a.b();
        k1 = a(j1);
        if (l != k1)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        if (flag2)
        {
            l = k1;
        }
        if (flag1 || flag2)
        {
            c();
        }
        return j1 < j && l2 != -1L && l2 <= k;
    }

    public final Allocator b()
    {
        return a;
    }

    private class _cls1
        implements Runnable
    {

        final boolean a;
        final DefaultLoadControl b;

        public void run()
        {
        }

        _cls1(boolean flag)
        {
            b = DefaultLoadControl.this;
            a = flag;
            super();
        }
    }


    private class LoaderState
    {

        public final int a;
        public int b;
        public boolean c;
        public long d;

        public LoaderState(int i1)
        {
            a = i1;
            b = 0;
            c = false;
            d = -1L;
        }
    }

}
