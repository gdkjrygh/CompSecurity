// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.graphics.drawable.Drawable;

// Referenced classes of package com.google.android.gms.internal:
//            gt

static final class FN extends android.graphics.drawable.ble.ConstantState
{

    int FM;
    int FN;

    public int getChangingConfigurations()
    {
        return FM;
    }

    public Drawable newDrawable()
    {
        return new gt(this);
    }

    nstantState(nstantState nstantstate)
    {
        if (nstantstate != null)
        {
            FM = nstantstate.FM;
            FN = nstantstate.FN;
        }
    }
}
