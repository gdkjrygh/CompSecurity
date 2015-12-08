// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.view.animation.Interpolator;
import java.util.Iterator;
import java.util.List;

public final class ipp
{

    final iph a;
    final View b;
    private final boolean c;
    private ipb d;

    public ipp(ipb ipb1, iph iph1, boolean flag, View view)
    {
        d = ipb1;
        super();
        a = iph1;
        c = flag;
        b = view;
    }

    private float a(float f, float f1, float f2)
    {
        float f3 = Math.abs(f2);
        f2 = f3;
        if (a.d != null)
        {
            f2 = a.d.getInterpolation(f3);
        }
        return f2 * (f1 - f) + f;
    }

    public final void a(float f)
    {
        if ((!c || f <= 0.0F) && (c || f >= 0.0F)) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (!(a instanceof ipg))
        {
            break; /* Loop/switch isn't completed */
        }
        ipg ipg1 = (ipg)a;
        b.setAlpha(a(ipg1.a, ipg1.b, f));
_L4:
        Iterator iterator = a.a().iterator();
        while (iterator.hasNext()) 
        {
            String s = (String)iterator.next();
            d.b(b, s);
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (a instanceof ips)
        {
            ips ips1 = (ips)a;
            b.setTranslationX(a(ips1.a, ips1.f, f));
            b.setTranslationY(a(ips1.b, ips1.g, f));
        } else
        if (a instanceof ipm)
        {
            ipm ipm1 = (ipm)a;
            b.setScaleX(a(ipm1.a, ipm1.b, f));
            b.setScaleY(a(ipm1.f, ipm1.g, f));
        }
          goto _L4
        if (true) goto _L1; else goto _L5
_L5:
    }
}
