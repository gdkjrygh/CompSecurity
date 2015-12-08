// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bb;

import android.view.animation.Interpolator;

// Referenced classes of package com.google.android.m4b.maps.bb:
//            m

public final class g extends m
{

    int a;
    int b;
    int c;
    private boolean d;

    public g(Interpolator interpolator)
    {
        d = false;
        setInterpolator(interpolator);
    }

    public final void a(int i)
    {
        if (!d)
        {
            a = i;
            b = i;
            c = i;
            d = true;
            return;
        } else
        {
            a = c;
            b = i;
            return;
        }
    }

    public final boolean isInitialized()
    {
        return d;
    }
}
