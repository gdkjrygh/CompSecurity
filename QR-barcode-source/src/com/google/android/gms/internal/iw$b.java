// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.graphics.drawable.Drawable;

// Referenced classes of package com.google.android.gms.internal:
//            iw

static final class Li extends android.graphics.drawable.ble.ConstantState
{

    int Lh;
    int Li;

    public int getChangingConfigurations()
    {
        return Lh;
    }

    public Drawable newDrawable()
    {
        return new iw(this);
    }

    nstantState(nstantState nstantstate)
    {
        if (nstantstate != null)
        {
            Lh = nstantstate.Lh;
            Li = nstantstate.Li;
        }
    }
}
