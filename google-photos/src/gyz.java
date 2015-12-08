// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class gyz
    implements ays, Runnable
{

    private static final long b;
    public int a;
    private final mwx c;
    private final ame d;
    private final azh e;
    private final gyy f;
    private long g;
    private mwz h;

    public gyz(mwx mwx1, ame ame1, azh azh, gyy gyy1)
    {
        a = gza.a;
        g = 250L;
        c = mwx1;
        mwx1 = ame1.a();
        mwx1.a = this;
        d = mwx1;
        e = azh;
        f = gyy1;
    }

    public final void a()
    {
        switch (gyq.a[a - 1])
        {
        default:
            return;

        case 1: // '\001'
            h.b();
            // fall through

        case 2: // '\002'
        case 3: // '\003'
            d.a(e);
            break;
        }
        a = gza.b;
    }

    public final boolean a(apv apv1)
    {
        apv1 = apv1.a().iterator();
_L4:
        if (!apv1.hasNext()) goto _L2; else goto _L1
_L1:
        Object obj = (Exception)apv1.next();
        if (!(obj instanceof and)) goto _L4; else goto _L3
_L3:
        obj = (and)obj;
        if (((and) (obj)).a >= 400 && ((and) (obj)).a < 500) goto _L4; else goto _L5
_L5:
        boolean flag = true;
_L7:
        if (flag)
        {
            h = c.a(this, g);
            a = gza.c;
            g = Math.min(g << 2, b);
            return false;
        } else
        {
            a = gza.d;
            f.a();
            return false;
        }
_L2:
        flag = false;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public final boolean a(Object obj, Object obj1, azh azh, amz amz, boolean flag)
    {
        a = gza.e;
        return false;
    }

    public final void run()
    {
        a();
    }

    static 
    {
        b = TimeUnit.MINUTES.toMillis(4L);
    }
}
