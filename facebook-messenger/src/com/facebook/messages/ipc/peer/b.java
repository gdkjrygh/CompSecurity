// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.messages.ipc.peer;

import android.net.Uri;
import android.os.Bundle;
import com.facebook.i.a.a.d;

// Referenced classes of package com.facebook.messages.ipc.peer:
//            d, a

public class b extends com.facebook.i.a.a.b
{

    private final a b;
    private boolean c;
    private boolean d;
    private boolean e;
    private boolean f;

    public b(int i)
    {
        super(d.e, i);
        b = new a(d.g, "peer://msg_notification_chathead/active_threads");
    }

    public void a()
    {
        b.a();
        c = false;
        d = false;
        e = false;
        f = false;
    }

    public void a(Uri uri, d d1)
    {
        if (!b.a(uri)) goto _L2; else goto _L1
_L1:
        b.a(uri, d1);
_L4:
        return;
_L2:
        if (!d.h.equals(uri))
        {
            break; /* Loop/switch isn't completed */
        }
        d1.a = Boolean.valueOf(c);
        if (c)
        {
            d1.b = true;
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (!d.i.equals(uri))
        {
            break; /* Loop/switch isn't completed */
        }
        d1.a = Boolean.valueOf(d);
        if (d)
        {
            d1.b = true;
            return;
        }
        if (true) goto _L4; else goto _L5
_L5:
        if (!d.j.equals(uri))
        {
            continue; /* Loop/switch isn't completed */
        }
        d1.a = Boolean.valueOf(e);
        if (e)
        {
            d1.b = true;
            return;
        }
        continue; /* Loop/switch isn't completed */
        if (!d.k.equals(uri)) goto _L4; else goto _L6
_L6:
        d1.a = Boolean.valueOf(f);
        if (f)
        {
            d1.b = true;
            return;
        }
        if (true) goto _L4; else goto _L7
_L7:
    }

    public void a(Bundle bundle)
    {
        b.a(bundle);
        bundle.putBoolean(d.h.getPath(), c);
        bundle.putBoolean(d.i.getPath(), d);
        bundle.putBoolean(d.j.getPath(), e);
        bundle.putBoolean(d.k.getPath(), f);
    }

    public boolean a(Uri uri, Object obj)
    {
        if (!d.f.equals(uri)) goto _L2; else goto _L1
_L1:
        a();
_L4:
        return true;
_L2:
        if (b.a(uri))
        {
            return b.a(uri, obj);
        }
        if (!d.h.equals(uri))
        {
            break; /* Loop/switch isn't completed */
        }
        boolean flag = c;
        c = Boolean.TRUE.equals(obj);
        if (flag == c)
        {
            return false;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (!d.i.equals(uri))
        {
            break; /* Loop/switch isn't completed */
        }
        boolean flag1 = d;
        d = Boolean.TRUE.equals(obj);
        if (flag1 == d)
        {
            return false;
        }
        if (true) goto _L4; else goto _L5
_L5:
        if (!d.j.equals(uri))
        {
            break; /* Loop/switch isn't completed */
        }
        boolean flag2 = e;
        e = Boolean.TRUE.equals(obj);
        if (flag2 == e)
        {
            return false;
        }
        if (true) goto _L4; else goto _L6
_L6:
        if (d.k.equals(uri))
        {
            boolean flag3 = f;
            f = Boolean.TRUE.equals(obj);
            if (flag3 == f)
            {
                return false;
            }
        } else
        {
            return false;
        }
        if (true) goto _L4; else goto _L7
_L7:
    }

    public void b(Bundle bundle)
    {
        b.b(bundle);
        c = bundle.getBoolean(d.h.getPath(), false);
        d = bundle.getBoolean(d.i.getPath(), false);
        e = bundle.getBoolean(d.j.getPath(), false);
        f = bundle.getBoolean(d.k.getPath(), false);
    }
}
