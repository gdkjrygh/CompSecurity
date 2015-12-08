// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;


// Referenced classes of package com.google.android.gms.cast:
//            o, m

public static final class nit>
{

    public final o a;

    public final o a()
    {
        o o1 = a;
        if (o1.a == null)
        {
            throw new IllegalArgumentException("media cannot be null.");
        }
        if (Double.isNaN(o1.c) || o1.c < 0.0D)
        {
            throw new IllegalArgumentException("startTime cannot be negative or NaN.");
        }
        if (Double.isNaN(o1.d))
        {
            throw new IllegalArgumentException("playbackDuration cannot be NaN.");
        }
        if (Double.isNaN(o1.e) || o1.e < 0.0D)
        {
            throw new IllegalArgumentException("preloadTime cannot be negative or Nan.");
        } else
        {
            return a;
        }
    }

    public on(m m)
        throws IllegalArgumentException
    {
        a = new o(m, (byte)0);
    }

    public nit>(o o1)
        throws IllegalArgumentException
    {
        a = new o(o1, (byte)0);
    }
}
