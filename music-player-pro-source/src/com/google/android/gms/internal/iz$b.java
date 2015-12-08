// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.graphics.drawable.Drawable;

// Referenced classes of package com.google.android.gms.internal:
//            iz

static final class Mm extends android.graphics.drawable.ble.ConstantState
{

    int Ml;
    int Mm;

    public int getChangingConfigurations()
    {
        return Ml;
    }

    public Drawable newDrawable()
    {
        return new iz(this);
    }

    nstantState(nstantState nstantstate)
    {
        if (nstantstate != null)
        {
            Ml = nstantstate.Ml;
            Mm = nstantstate.Mm;
        }
    }
}
