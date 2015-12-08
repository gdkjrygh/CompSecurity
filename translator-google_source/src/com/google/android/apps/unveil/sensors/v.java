// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.unveil.sensors;


// Referenced classes of package com.google.android.apps.unveil.sensors:
//            y

public final class v extends y
{

    private float d[];

    public v()
    {
    }

    final void a(long l, int i, float af[])
    {
        b = l;
        c = i;
        if (c != 0)
        {
            if (d == null)
            {
                d = new float[3];
            }
            d[0] = af[0];
            d[1] = af[1];
            d[2] = af[2];
            b();
        }
    }

    public final float[] a()
    {
        return d;
    }
}
