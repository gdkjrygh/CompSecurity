// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.unveil.env;

import android.graphics.Point;

// Referenced classes of package com.google.android.apps.unveil.env:
//            af

public final class e
{

    private static final af a = new af();

    public static float a(float f, float f1, float f2, float f3)
    {
        return (f2 - f) * (f2 - f) + (f3 - f1) * (f3 - f1);
    }

    public static float a(Point point, Point point1)
    {
        return (float)Math.sqrt(a(point.x, point.y, point1.x, point1.y));
    }

    public static boolean a(Point point, float f, Point point1, float f1)
    {
        return a(point.x, point.y, point1.x, point1.y) < (f + f1) * (f + f1);
    }

}
