// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;

// Referenced classes of package com.google.android.gms.internal:
//            ai, ah, gt, gk

class mY
    implements Runnable
{

    final Context mV;
    final gt mW;
    final gk mX;
    final String mY;
    final ai mZ;

    public void run()
    {
        mZ.a(mV, mW, mX).f(mY);
    }

    (ai ai1, Context context, gt gt, gk gk, String s)
    {
        mZ = ai1;
        mV = context;
        mW = gt;
        mX = gk;
        mY = s;
        super();
    }
}
