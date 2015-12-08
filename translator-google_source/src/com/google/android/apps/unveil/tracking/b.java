// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.unveil.tracking;

import java.util.Vector;

// Referenced classes of package com.google.android.apps.unveil.tracking:
//            ObjectTracker, c, a

public final class b
{

    public final Vector a;
    final float b;
    final float c;
    final ObjectTracker d;

    public b(ObjectTracker objecttracker, float af[])
    {
        d = objecttracker;
        super();
        float f = -100F;
        a = new Vector(af.length / 7);
        int i = 0;
        float f1 = 100F;
        while (i < af.length) 
        {
            float f2 = af[i];
            float f3 = ObjectTracker.a(objecttracker);
            float f4 = af[i + 1];
            float f5 = ObjectTracker.a(objecttracker);
            float f6;
            float f7;
            float f8;
            float f9;
            float f10;
            c c1;
            int j;
            boolean flag;
            if (af[i + 2] > 0.0F)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            f6 = af[i + 3];
            f7 = ObjectTracker.a(objecttracker);
            f8 = af[i + 4];
            f9 = ObjectTracker.a(objecttracker);
            f10 = af[i + 5];
            j = (int)af[i + 6];
            f1 = Math.min(f1, f10);
            f = Math.max(f, f10);
            c1 = new c(f2 * f3, f4 * f5, f6 * f7, f8 * f9, f10, j, flag);
            if (c1.c == null)
            {
                a a1 = c1.b;
                a a2 = c1.a;
                c1.c = new a(a1.a - a2.a, a1.b - a2.b);
            }
            a.add(c1);
            i += 7;
        }
        b = f1;
        c = f;
    }
}
