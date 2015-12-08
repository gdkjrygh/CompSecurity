// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.threatmetrix.TrustDefenderMobile;

import android.graphics.Point;
import android.util.Log;
import android.view.Display;
import java.lang.reflect.Method;

// Referenced classes of package com.threatmetrix.TrustDefenderMobile:
//            aq

class i extends aq
{

    private static final Method a = a(android/view/Display, "getWidth", new Class[0]);
    private static final Method b = a(android/view/Display, "getHeight", new Class[0]);
    private static final Method c = a(android/view/Display, "getSize", new Class[] {
        android/graphics/Point
    });
    private static final String d = com/threatmetrix/TrustDefenderMobile/i.getName();
    private final Display e;

    public i(Display display)
    {
        e = display;
    }

    public final int a()
    {
        if (c != null)
        {
            Point point = new Point();
            a(e, c, new Object[] {
                point
            });
            return point.x;
        }
        if (a != null)
        {
            Integer integer = (Integer)a(e, a, new Object[0]);
            if (integer != null)
            {
                return integer.intValue();
            }
        }
        Log.w(d, "unable to get display width");
        return 0;
    }

    public final int b()
    {
        if (c != null)
        {
            Point point = new Point();
            a(e, c, new Object[] {
                point
            });
            return point.y;
        }
        if (b != null)
        {
            Integer integer = (Integer)a(e, b, new Object[0]);
            if (integer != null)
            {
                return integer.intValue();
            }
        }
        Log.w(d, "unable to get display height");
        return 0;
    }

}
