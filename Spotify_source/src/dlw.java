// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.google.android.gms.cast.CastDevice;
import com.spotify.mobile.android.connect.model.DiscoveredDevice;
import com.spotify.mobile.android.util.logging.Logger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class dlw extends wt
{

    wq a;
    ws b;
    private final dlp c;
    private final List d = new ArrayList();
    private final List e = new ArrayList();

    public dlw(Context context, String s, dlp dlp1)
    {
        c = dlp1;
        b = ws.a(context);
        try
        {
            a = (new wr()).a(boq.a(s)).a();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Logger.c("Cannot create MediaRouterManager: Invalid AppId", new Object[0]);
        }
    }

    static DiscoveredDevice d(xd xd1)
    {
        xd1 = CastDevice.a(xd1.e());
        if (xd1 != null)
        {
            return dlq.b(xd1);
        } else
        {
            return null;
        }
    }

    public final xd a(String s)
    {
label0:
        {
            if (s == null)
            {
                break label0;
            }
            Iterator iterator = ws.a().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break label0;
                }
                xd xd1 = (xd)iterator.next();
                CastDevice castdevice = CastDevice.a(xd1.e());
                boolean flag;
                if (castdevice != null && s.equals(castdevice.a()))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
            } while (!flag || !e(xd1));
            return xd1;
        }
        return null;
    }

    public final void a()
    {
        h();
    }

    public final void a(xd xd1)
    {
        xd1.a();
        xd1 = CastDevice.a(xd1.e());
        c.a(xd1);
    }

    public final void b()
    {
        h();
    }

    public final void b(xd xd1)
    {
        xd1.a();
        c.a(null);
    }

    public final boolean b(String s)
    {
        s = a(s);
        if (s != null)
        {
            ws.a(s);
            return true;
        } else
        {
            ws.b();
            g();
            ws.a(1);
            return false;
        }
    }

    public final void c()
    {
        h();
    }

    final boolean e(xd xd1)
    {
        return !xd1.d() && xd1.b() && xd1.a(a);
    }

    final void g()
    {
        h();
        h();
    }

    final void h()
    {
        List list;
        int i;
        d.clear();
        d.addAll(ws.a());
        list = d;
        i = list.size();
_L3:
        int j = i - 1;
        if (i <= 0) goto _L2; else goto _L1
_L1:
        if (!e((xd)list.get(j)))
        {
            list.remove(j);
            i = j;
        } else
        {
            i = j;
        }
        if (true) goto _L3; else goto _L2
_L2:
        Object obj = d;
        i = e.size();
        do
        {
            j = i - 1;
            if (i <= 0)
            {
                break;
            }
            Object obj1 = (xd)e.get(j);
            if (((List) (obj)).contains(obj1))
            {
                ((List) (obj)).remove(obj1);
                i = j;
            } else
            {
                e.remove(j);
                obj1 = d(((xd) (obj1)));
                if (obj1 != null)
                {
                    c.b(((DiscoveredDevice) (obj1)));
                }
                i = j;
            }
        } while (true);
        obj = ((List) (obj)).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            Object obj2 = (xd)((Iterator) (obj)).next();
            e.add(obj2);
            obj2 = d(((xd) (obj2)));
            if (obj2 != null)
            {
                c.a(((DiscoveredDevice) (obj2)));
            }
        } while (true);
        return;
    }
}
